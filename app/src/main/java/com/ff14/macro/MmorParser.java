package com.ff14.macro;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/**
 * MuMu 模拟器 .mmor 操作录制文件解析器
 * 支持 MuMu 12 的 JSON 格式
 */
public class MmorParser {

    private static final String TAG = "MmorParser";

    // 匹配 press_rel:(x,y) 格式
    private static final Pattern PRESS_REL_PATTERN = Pattern.compile("press_rel:\\(([\\d.]+),([\\d.]+)\\)");
    // 匹配 move_rel:(x,y) 格式
    private static final Pattern MOVE_REL_PATTERN = Pattern.compile("move_rel:\\(([\\d.]+),([\\d.]+)\\)");

    // 默认屏幕尺寸（MuMu 默认 1920x1080）
    private static int screenWidth = 1920;
    private static int screenHeight = 1080;

    /**
     * 解析结果
     */
    public static class ParseResult {
        public String name;
        public String resolution;
        public List<MacroAction> actions;
        public String errorMessage;
        public boolean success;
        public int totalEvents;  // 原始事件数

        public ParseResult() {
            this.actions = new ArrayList<>();
        }
    }

    /**
     * 设置目标屏幕尺寸（用于坐标转换）
     */
    public static void setScreenSize(int width, int height) {
        screenWidth = width;
        screenHeight = height;
    }

    /**
     * 从 Context 获取屏幕尺寸
     */
    public static void initScreenSize(Context context) {
        try {
            WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics metrics = new DisplayMetrics();
            wm.getDefaultDisplay().getRealMetrics(metrics);
            screenWidth = metrics.widthPixels;
            screenHeight = metrics.heightPixels;
            Log.d(TAG, "屏幕尺寸: " + screenWidth + "x" + screenHeight);
        } catch (Exception e) {
            Log.w(TAG, "获取屏幕尺寸失败，使用默认值");
        }
    }

    /**
     * 从 Uri 解析 .mmor 文件
     */
    public static ParseResult parse(Context context, Uri uri) {
        ParseResult result = new ParseResult();
        initScreenSize(context);

        try {
            InputStream inputStream = context.getContentResolver().openInputStream(uri);
            if (inputStream == null) {
                result.errorMessage = "无法打开文件";
                return result;
            }

            // 读取文件内容
            byte[] rawData = readAllBytes(inputStream);
            inputStream.close();

            String content = null;

            // 尝试 GZIP 解压
            try {
                content = decompressGzip(rawData);
                Log.d(TAG, "GZIP 解压成功");
            } catch (Exception e) {
                // 不是 GZIP，直接读取
                content = new String(rawData, StandardCharsets.UTF_8);
            }

            // 解析 MuMu JSON 格式
            return parseMumuFormat(content, result);

        } catch (Exception e) {
            Log.e(TAG, "解析失败", e);
            result.errorMessage = "解析失败: " + e.getMessage();
            return result;
        }
    }

    /**
     * 解析 MuMu 格式的 .mmor 文件
     */
    private static ParseResult parseMumuFormat(String content, ParseResult result) {
        try {
            JSONObject root = new JSONObject(content);

            // 获取 actions 数组
            JSONArray actions = root.optJSONArray("actions");
            if (actions == null) {
                result.errorMessage = "找不到 actions 数组";
                return result;
            }

            result.totalEvents = actions.length();
            Log.d(TAG, "总事件数: " + result.totalEvents);

            // 解析事件
            List<TouchEvent> touchEvents = new ArrayList<>();
            long currentTime = 0;

            for (int i = 0; i < actions.length(); i++) {
                JSONObject action = actions.getJSONObject(i);
                String type = action.optString("type", "");
                String data = action.optString("data", "");
                int timing = action.optInt("timing", 0);
                String extra1 = action.optString("extra1", "");

                currentTime += timing;

                if ("touch".equals(type)) {
                    TouchEvent event = parseTouchEvent(data, extra1, currentTime);
                    if (event != null) {
                        touchEvents.add(event);
                    }
                }
                // 可以扩展支持 keyboard 等其他类型
            }

            // 将触摸事件转换为宏操作
            result.actions = convertToMacroActions(touchEvents);
            result.success = !result.actions.isEmpty();

            if (!result.success) {
                result.errorMessage = "未找到有效的触摸操作（共 " + result.totalEvents + " 个事件）";
            } else {
                Log.d(TAG, "成功转换 " + result.actions.size() + " 个宏操作");
            }

        } catch (JSONException e) {
            Log.e(TAG, "JSON 解析失败", e);
            result.errorMessage = "JSON 解析失败: " + e.getMessage();
        }

        return result;
    }

    /**
     * 触摸事件
     */
    private static class TouchEvent {
        enum Type { PRESS, MOVE, RELEASE }
        Type type;
        int pointerId;
        float relX, relY;  // 相对坐标 0~1
        long time;  // 时间戳（毫秒）
    }

    /**
     * 解析触摸事件
     */
    private static TouchEvent parseTouchEvent(String data, String extra1, long time) {
        TouchEvent event = new TouchEvent();
        event.time = time;

        // 解析触控点 ID
        try {
            event.pointerId = Integer.parseInt(extra1);
        } catch (NumberFormatException e) {
            event.pointerId = 0;
        }

        if ("release".equals(data)) {
            event.type = TouchEvent.Type.RELEASE;
            return event;
        }

        // 解析 press_rel:(x,y)
        Matcher pressMatcher = PRESS_REL_PATTERN.matcher(data);
        if (pressMatcher.find()) {
            event.type = TouchEvent.Type.PRESS;
            event.relX = Float.parseFloat(pressMatcher.group(1));
            event.relY = Float.parseFloat(pressMatcher.group(2));
            return event;
        }

        // 解析 move_rel:(x,y)
        Matcher moveMatcher = MOVE_REL_PATTERN.matcher(data);
        if (moveMatcher.find()) {
            event.type = TouchEvent.Type.MOVE;
            event.relX = Float.parseFloat(moveMatcher.group(1));
            event.relY = Float.parseFloat(moveMatcher.group(2));
            return event;
        }

        return null;
    }

    /**
     * 将触摸事件转换为宏操作
     */
    private static List<MacroAction> convertToMacroActions(List<TouchEvent> events) {
        List<MacroAction> actions = new ArrayList<>();

        // 按触控点分组跟踪
        java.util.Map<Integer, TouchEvent> pressStates = new java.util.HashMap<>();
        long lastActionTime = 0;

        for (TouchEvent event : events) {
            // 添加延迟
            if (event.time > lastActionTime && lastActionTime > 0) {
                long delay = event.time - lastActionTime;
                if (delay >= 10) {  // 忽略小于 10ms 的延迟
                    actions.add(new MacroAction.DelayAction(delay));
                }
            }

            switch (event.type) {
                case PRESS:
                    pressStates.put(event.pointerId, event);
                    break;

                case MOVE:
                    // 更新位置用于滑动
                    TouchEvent pressEvent = pressStates.get(event.pointerId);
                    if (pressEvent != null) {
                        // 记录移动位置，后续 release 时生成滑动
                        pressEvent.relX = event.relX;
                        pressEvent.relY = event.relY;
                    }
                    break;

                case RELEASE:
                    TouchEvent startEvent = pressStates.remove(event.pointerId);
                    if (startEvent != null) {
                        // 转换相对坐标为绝对坐标
                        int startX = (int) (startEvent.relX * screenWidth);
                        int startY = (int) (startEvent.relY * screenHeight);

                        // 检查是否有移动（滑动）
                        // 简化处理：如果 press 和 release 位置相同，视为点击
                        // 这里直接生成点击
                        actions.add(new MacroAction.TapAction(startX, startY));
                        lastActionTime = event.time;
                    }
                    break;
            }
        }

        return actions;
    }

    /**
     * 读取所有字节
     */
    private static byte[] readAllBytes(InputStream inputStream) throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] data = new byte[4096];
        int bytesRead;
        while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, bytesRead);
        }
        return buffer.toByteArray();
    }

    /**
     * GZIP 解压
     */
    private static String decompressGzip(byte[] compressed) throws Exception {
        GZIPInputStream gis = new GZIPInputStream(new java.io.ByteArrayInputStream(compressed));
        BufferedReader reader = new BufferedReader(new InputStreamReader(gis, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        return sb.toString();
    }
}
