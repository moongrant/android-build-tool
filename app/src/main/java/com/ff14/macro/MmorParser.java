package com.ff14.macro;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

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
import java.util.zip.GZIPInputStream;

/**
 * MuMu 模拟器 .mmor 操作录制文件解析器
 * 支持多种可能的文件格式
 */
public class MmorParser {

    private static final String TAG = "MmorParser";

    /**
     * 解析结果
     */
    public static class ParseResult {
        public String name;
        public String resolution;
        public List<MacroAction> actions;
        public String errorMessage;
        public boolean success;

        public ParseResult() {
            this.actions = new ArrayList<>();
        }
    }

    /**
     * 从 Uri 解析 .mmor 文件
     */
    public static ParseResult parse(Context context, Uri uri) {
        ParseResult result = new ParseResult();

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
                // 不是 GZIP，尝试直接读取
                content = new String(rawData, StandardCharsets.UTF_8);
            }

            // 尝试解析 JSON 格式
            if (content.trim().startsWith("{") || content.trim().startsWith("[")) {
                return parseJson(content, result);
            }

            // 尝试解析自定义文本格式
            return parseCustomFormat(content, result);

        } catch (Exception e) {
            Log.e(TAG, "解析失败", e);
            result.errorMessage = "解析失败: " + e.getMessage();
            return result;
        }
    }

    /**
     * 解析 JSON 格式的 .mmor 文件
     */
    private static ParseResult parseJson(String content, ParseResult result) {
        try {
            JSONObject root = new JSONObject(content);

            // 获取元数据
            result.name = root.optString("name", root.optString("fileName", "导入的宏"));
            result.resolution = root.optString("resolution", root.optString("screenSize", "未知"));

            // 尝试不同的事件数组键名
            JSONArray events = null;
            String[] possibleKeys = {"events", "actions", "records", "data", "touches", "operations"};

            for (String key : possibleKeys) {
                if (root.has(key)) {
                    events = root.getJSONArray(key);
                    break;
                }
            }

            if (events == null) {
                // 如果根对象是数组
                try {
                    events = new JSONArray(content);
                } catch (JSONException e) {
                    result.errorMessage = "找不到事件数据";
                    return result;
                }
            }

            // 解析事件
            result.actions = parseEvents(events);
            result.success = !result.actions.isEmpty();

            if (!result.success) {
                result.errorMessage = "未找到有效的操作指令";
            }

        } catch (JSONException e) {
            Log.e(TAG, "JSON 解析失败", e);
            result.errorMessage = "JSON 解析失败: " + e.getMessage();
        }

        return result;
    }

    /**
     * 解析事件数组
     */
    private static List<MacroAction> parseEvents(JSONArray events) throws JSONException {
        List<MacroAction> actions = new ArrayList<>();
        long lastTime = 0;

        for (int i = 0; i < events.length(); i++) {
            JSONObject event = events.getJSONObject(i);

            // 获取时间戳
            long time = event.optLong("time", event.optLong("timestamp", event.optLong("t", 0)));

            // 添加延迟（如果与上一个事件有间隔）
            if (time > lastTime && lastTime > 0) {
                long delay = time - lastTime;
                if (delay > 50) { // 忽略小于 50ms 的延迟
                    actions.add(new MacroAction.DelayAction(delay));
                }
            }
            lastTime = time;

            // 解析事件类型
            String type = event.optString("type", event.optString("action", event.optString("eventType", "")));
            int action = event.optInt("action", event.optInt("actionType", -1));

            // 获取坐标
            int x = event.optInt("x", event.optInt("screenX", 0));
            int y = event.optInt("y", event.optInt("screenY", 0));

            // MuMu 格式: action=0 表示按下, action=1 表示抬起, action=2 表示移动
            // 或者 type="down"/"up"/"move"

            if ("tap".equalsIgnoreCase(type) || "click".equalsIgnoreCase(type)) {
                actions.add(new MacroAction.TapAction(x, y));
            } else if ("swipe".equalsIgnoreCase(type) || "drag".equalsIgnoreCase(type)) {
                int endX = event.optInt("endX", event.optInt("toX", x));
                int endY = event.optInt("endY", event.optInt("toY", y));
                long duration = event.optLong("duration", 300);
                actions.add(new MacroAction.SwipeAction(x, y, endX, endY, duration));
            } else if ("delay".equalsIgnoreCase(type) || "wait".equalsIgnoreCase(type)) {
                long delay = event.optLong("delay", event.optLong("duration", 100));
                actions.add(new MacroAction.DelayAction(delay));
            } else if (action == 1 || "up".equalsIgnoreCase(type)) {
                // 鼠标/触摸抬起，检查是否是点击还是滑动
                // 这里简化处理，添加点击
                actions.add(new MacroAction.TapAction(x, y));
            }
        }

        // 如果解析出太多事件，尝试合并
        return optimizeActions(actions);
    }

    /**
     * 优化/合并操作
     */
    private static List<MacroAction> optimizeActions(List<MacroAction> actions) {
        if (actions.size() <= 100) {
            return actions;
        }

        // 合并连续的小延迟
        List<MacroAction> optimized = new ArrayList<>();
        long accumulatedDelay = 0;

        for (MacroAction action : actions) {
            if (action.getType() == MacroAction.Type.DELAY) {
                accumulatedDelay += ((MacroAction.DelayAction) action).delayMs;
            } else {
                if (accumulatedDelay > 0) {
                    optimized.add(new MacroAction.DelayAction(accumulatedDelay));
                    accumulatedDelay = 0;
                }
                optimized.add(action);
            }
        }

        if (accumulatedDelay > 0) {
            optimized.add(new MacroAction.DelayAction(accumulatedDelay));
        }

        return optimized;
    }

    /**
     * 解析自定义文本格式
     */
    private static ParseResult parseCustomFormat(String content, ParseResult result) {
        String[] lines = content.split("\n");
        result.name = "导入的宏";

        for (String line : lines) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#") || line.startsWith("//")) {
                continue;
            }

            // 检查是否是名称行
            if (line.startsWith("name:") || line.startsWith("名称:")) {
                result.name = line.substring(line.indexOf(":") + 1).trim();
                continue;
            }

            // 检查是否是分辨率行
            if (line.startsWith("resolution:") || line.startsWith("分辨率:")) {
                result.resolution = line.substring(line.indexOf(":") + 1).trim();
                continue;
            }

            // 尝试解析操作指令
            MacroAction action = MacroAction.parse(line);
            if (action != null) {
                result.actions.add(action);
            }
        }

        result.success = !result.actions.isEmpty();
        if (!result.success) {
            result.errorMessage = "未找到有效的操作指令";
        }

        return result;
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
