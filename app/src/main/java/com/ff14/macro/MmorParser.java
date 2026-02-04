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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/**
 * MuMu 模拟器 .mmor 操作录制文件解析器
 *
 * MuMu 坐标系说明：
 * - 所有坐标都相对于屏幕高度（短边）归一化
 * - X 范围: 0 ~ 1 (表示垂直方向)
 * - Y 范围: 0 ~ (width/height) (表示水平方向)
 * - 例如 1920x1080 横屏: X=0~1, Y=0~1.78
 */
public class MmorParser {

    private static final String TAG = "MmorParser";

    // 匹配 press_rel:(x,y) 格式
    private static final Pattern PRESS_REL_PATTERN = Pattern.compile("press_rel:\\(([\\d.]+),([\\d.]+)\\)");
    // 匹配 move_rel:(x,y) 格式
    private static final Pattern MOVE_REL_PATTERN = Pattern.compile("move_rel:\\(([\\d.]+),([\\d.]+)\\)");

    // 屏幕尺寸
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
        public int totalEvents;
        public int touchEvents;
        public int convertedActions;

        public ParseResult() {
            this.actions = new ArrayList<>();
        }
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
            Log.w(TAG, "获取屏幕尺寸失败，使用默认 1920x1080");
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

            byte[] rawData = readAllBytes(inputStream);
            inputStream.close();

            String content;
            try {
                content = decompressGzip(rawData);
                Log.d(TAG, "GZIP 解压成功");
            } catch (Exception e) {
                content = new String(rawData, StandardCharsets.UTF_8);
            }

            return parseMumuFormat(content, result);

        } catch (Exception e) {
            Log.e(TAG, "解析失败", e);
            result.errorMessage = "解析失败: " + e.getMessage();
            return result;
        }
    }

    /**
     * 解析 MuMu 格式
     */
    private static ParseResult parseMumuFormat(String content, ParseResult result) {
        try {
            JSONObject root = new JSONObject(content);
            JSONArray actions = root.optJSONArray("actions");

            if (actions == null) {
                result.errorMessage = "找不到 actions 数组";
                return result;
            }

            result.totalEvents = actions.length();
            Log.d(TAG, "总事件数: " + result.totalEvents);

            // 收集所有触摸事件
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
                    result.touchEvents++;
                    TouchEvent event = parseTouchEvent(data, extra1, currentTime);
                    if (event != null) {
                        touchEvents.add(event);
                    }
                }
            }

            Log.d(TAG, "触摸事件数: " + result.touchEvents);
            Log.d(TAG, "解析的触摸事件: " + touchEvents.size());

            // 转换为宏操作
            result.actions = convertToMacroActions(touchEvents);
            result.convertedActions = result.actions.size();
            result.success = !result.actions.isEmpty();

            Log.d(TAG, "转换后的宏操作数: " + result.convertedActions);

            if (!result.success) {
                result.errorMessage = "未找到有效操作\n" +
                    "总事件: " + result.totalEvents + "\n" +
                    "触摸事件: " + result.touchEvents;
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
        float relX, relY;
        long time;
    }

    /**
     * 解析触摸事件
     */
    private static TouchEvent parseTouchEvent(String data, String extra1, long time) {
        TouchEvent event = new TouchEvent();
        event.time = time;

        try {
            event.pointerId = Integer.parseInt(extra1);
        } catch (NumberFormatException e) {
            event.pointerId = 0;
        }

        if ("release".equals(data)) {
            event.type = TouchEvent.Type.RELEASE;
            return event;
        }

        Matcher pressMatcher = PRESS_REL_PATTERN.matcher(data);
        if (pressMatcher.find()) {
            event.type = TouchEvent.Type.PRESS;
            event.relX = Float.parseFloat(pressMatcher.group(1));
            event.relY = Float.parseFloat(pressMatcher.group(2));
            return event;
        }

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
     * 将 MuMu 相对坐标转换为屏幕绝对坐标
     *
     * MuMu 坐标系: 所有坐标都相对于屏幕高度（短边）
     * - relX * screenHeight = 垂直像素位置
     * - relY * screenHeight = 水平像素位置
     */
    private static int[] convertCoordinates(float relX, float relY) {
        // MuMu 坐标都是相对于高度（短边）的
        int minDim = Math.min(screenWidth, screenHeight);

        // 对于横屏 (width > height):
        // relX 对应垂直方向 (0~1 范围)
        // relY 对应水平方向 (0~width/height 范围)
        int pixelX, pixelY;

        if (screenWidth > screenHeight) {
            // 横屏: X是垂直(高度方向), Y是水平(宽度方向)
            pixelY = (int) (relX * screenHeight);  // 垂直位置
            pixelX = (int) (relY * screenHeight);  // 水平位置
        } else {
            // 竖屏: 正常映射
            pixelX = (int) (relX * screenWidth);
            pixelY = (int) (relY * screenWidth);
        }

        // 确保坐标在屏幕范围内
        pixelX = Math.max(0, Math.min(pixelX, screenWidth - 1));
        pixelY = Math.max(0, Math.min(pixelY, screenHeight - 1));

        Log.d(TAG, String.format("坐标转换: (%.4f, %.4f) -> (%d, %d) [屏幕:%dx%d]",
                relX, relY, pixelX, pixelY, screenWidth, screenHeight));

        return new int[]{pixelX, pixelY};
    }

    /**
     * 转换为宏操作
     */
    private static List<MacroAction> convertToMacroActions(List<TouchEvent> events) {
        List<MacroAction> actions = new ArrayList<>();
        Map<Integer, TouchEvent> pressStates = new HashMap<>();
        long lastActionTime = 0;

        for (TouchEvent event : events) {
            // 添加延迟
            if (lastActionTime > 0 && event.time > lastActionTime) {
                long delay = event.time - lastActionTime;
                if (delay >= 5) {
                    actions.add(new MacroAction.DelayAction(delay));
                }
            }

            switch (event.type) {
                case PRESS:
                    // 记录按下位置
                    pressStates.put(event.pointerId, event);
                    lastActionTime = event.time;
                    break;

                case MOVE:
                    // 更新位置（用于滑动）
                    TouchEvent press = pressStates.get(event.pointerId);
                    if (press != null) {
                        // 可以在这里记录移动轨迹
                    }
                    break;

                case RELEASE:
                    TouchEvent startEvent = pressStates.remove(event.pointerId);
                    if (startEvent != null) {
                        // 转换坐标
                        int[] coords = convertCoordinates(startEvent.relX, startEvent.relY);
                        actions.add(new MacroAction.TapAction(coords[0], coords[1]));
                        lastActionTime = event.time;
                    }
                    break;
            }
        }

        return actions;
    }

    private static byte[] readAllBytes(InputStream inputStream) throws Exception {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        byte[] data = new byte[4096];
        int bytesRead;
        while ((bytesRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, bytesRead);
        }
        return buffer.toByteArray();
    }

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
