package com.ff14.macro;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.content.Intent;
import android.graphics.Path;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toast;

import java.util.List;

/**
 * 无障碍服务 - 执行触控宏指令
 */
public class MacroAccessibilityService extends AccessibilityService {

    private static final String TAG = "MacroAccessibility";
    private static MacroAccessibilityService instance;
    private Handler handler;
    private volatile boolean isRunning = false;
    private MacroRunCallback callback;
    private int currentRunId = 0;  // 用于追踪当前执行批次

    public interface MacroRunCallback {
        void onMacroStarted();
        void onMacroFinished();
        void onMacroError(String error);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        handler = new Handler(Looper.getMainLooper());
        Log.d(TAG, "服务创建");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        instance = null;
        Log.d(TAG, "服务销毁");
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // 不需要处理事件
    }

    @Override
    public void onInterrupt() {
        Log.d(TAG, "服务中断");
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        instance = this;
        Log.d(TAG, "无障碍服务已连接！");

        // 显示 Toast 确认服务已启动
        handler.post(() -> {
            Toast.makeText(this, "FF14宏指令: 无障碍服务已启动", Toast.LENGTH_SHORT).show();
        });

        // 发送广播通知
        Intent intent = new Intent("com.ff14.macro.ACCESSIBILITY_CONNECTED");
        sendBroadcast(intent);
    }

    public static MacroAccessibilityService getInstance() {
        return instance;
    }

    public static boolean isServiceEnabled() {
        return instance != null;
    }

    public void setCallback(MacroRunCallback callback) {
        this.callback = callback;
    }

    public boolean isRunning() {
        return isRunning;
    }

    /**
     * 执行测试点击（在屏幕中央）
     */
    public void testTap() {
        Log.d(TAG, "执行测试点击");
        handler.post(() -> {
            Toast.makeText(this, "执行测试点击...", Toast.LENGTH_SHORT).show();
        });

        // 获取屏幕尺寸
        int x = getResources().getDisplayMetrics().widthPixels / 2;
        int y = getResources().getDisplayMetrics().heightPixels / 2;

        performTap(x, y, () -> {
            handler.post(() -> {
                Toast.makeText(this, "测试点击完成: (" + x + "," + y + ")", Toast.LENGTH_SHORT).show();
            });
        });
    }

    /**
     * 执行宏指令
     */
    public void executeMacro(Macro macro) {
        Log.d(TAG, "开始执行宏: " + (macro != null ? macro.getName() : "null"));

        if (macro == null) {
            String error = "宏为空";
            Log.e(TAG, error);
            if (callback != null) callback.onMacroError(error);
            return;
        }

        List<MacroAction> actions = macro.getActions();
        if (actions == null || actions.isEmpty()) {
            String error = "宏指令为空，操作数: " + (actions != null ? actions.size() : 0);
            Log.e(TAG, error);
            if (callback != null) callback.onMacroError(error);
            return;
        }

        if (isRunning) {
            String error = "宏正在执行中";
            Log.w(TAG, error);
            if (callback != null) callback.onMacroError(error);
            return;
        }

        // 检查 API 级别
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            String error = "需要 Android 7.0+ 才能执行手势";
            Log.e(TAG, error);
            if (callback != null) callback.onMacroError(error);
            return;
        }

        isRunning = true;
        currentRunId++;  // 新的执行批次
        final int thisRunId = currentRunId;

        if (callback != null) callback.onMacroStarted();

        Log.d(TAG, "开始执行 " + actions.size() + " 个操作, runId=" + thisRunId);
        handler.post(() -> {
            Toast.makeText(this, "开始执行宏: " + actions.size() + " 个操作", Toast.LENGTH_SHORT).show();
        });

        // 开始执行
        executeActions(actions, 0, thisRunId);
    }

    /**
     * 停止执行
     */
    public void stopMacro() {
        Log.d(TAG, "停止执行宏, runId=" + currentRunId);
        isRunning = false;
        currentRunId++;  // 增加 runId，使正在进行的回调失效
        handler.removeCallbacksAndMessages(null);
        // 不在这里调用 callback.onMacroFinished()，因为 FloatingButtonService 已经处理了
    }

    /**
     * 递归执行操作列表
     */
    private void executeActions(List<MacroAction> actions, int index, int runId) {
        // 检查是否被停止或是否是旧的执行批次
        if (!isRunning || runId != currentRunId) {
            Log.d(TAG, "执行已停止 (runId=" + runId + ", current=" + currentRunId + ")");
            return;
        }

        if (index >= actions.size()) {
            Log.d(TAG, "所有操作执行完成");
            isRunning = false;
            if (callback != null) callback.onMacroFinished();
            handler.post(() -> {
                Toast.makeText(this, "宏执行完成", Toast.LENGTH_SHORT).show();
            });
            return;
        }

        MacroAction action = actions.get(index);
        Log.d(TAG, "执行操作 " + (index + 1) + "/" + actions.size() + ": " + action.toString());

        switch (action.getType()) {
            case TAP:
                MacroAction.TapAction tap = (MacroAction.TapAction) action;
                Log.d(TAG, "点击: (" + tap.x + ", " + tap.y + ")");
                performTap(tap.x, tap.y, () -> {
                    if (runId == currentRunId) {
                        handler.postDelayed(() -> executeActions(actions, index + 1, runId), 50);
                    }
                });
                break;

            case SWIPE:
                MacroAction.SwipeAction swipe = (MacroAction.SwipeAction) action;
                Log.d(TAG, "滑动: (" + swipe.startX + "," + swipe.startY + ") -> (" + swipe.endX + "," + swipe.endY + ")");
                performSwipe(swipe.startX, swipe.startY, swipe.endX, swipe.endY, swipe.duration, () -> {
                    if (runId == currentRunId) {
                        handler.postDelayed(() -> executeActions(actions, index + 1, runId), 50);
                    }
                });
                break;

            case DELAY:
                MacroAction.DelayAction delay = (MacroAction.DelayAction) action;
                Log.d(TAG, "延迟: " + delay.delayMs + "ms");
                handler.postDelayed(() -> executeActions(actions, index + 1, runId), delay.delayMs);
                break;
        }
    }

    /**
     * 执行点击
     */
    private void performTap(int x, int y, Runnable onComplete) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            Log.e(TAG, "API 级别不足，无法执行手势");
            if (onComplete != null) onComplete.run();
            return;
        }

        Log.d(TAG, "performTap: (" + x + ", " + y + ")");

        Path path = new Path();
        path.moveTo(x, y);

        GestureDescription.StrokeDescription stroke =
            new GestureDescription.StrokeDescription(path, 0, 100);

        GestureDescription gesture = new GestureDescription.Builder()
            .addStroke(stroke)
            .build();

        boolean dispatched = dispatchGesture(gesture, new GestureResultCallback() {
            @Override
            public void onCompleted(GestureDescription gestureDescription) {
                Log.d(TAG, "手势完成: (" + x + ", " + y + ")");
                if (onComplete != null) onComplete.run();
            }

            @Override
            public void onCancelled(GestureDescription gestureDescription) {
                Log.w(TAG, "手势取消: (" + x + ", " + y + ")");
                if (onComplete != null) onComplete.run();
            }
        }, handler);

        Log.d(TAG, "dispatchGesture 返回: " + dispatched);

        if (!dispatched) {
            Log.e(TAG, "手势分发失败！");
            handler.post(() -> {
                Toast.makeText(this, "手势分发失败，请检查无障碍权限", Toast.LENGTH_SHORT).show();
            });
            if (onComplete != null) onComplete.run();
        }
    }

    /**
     * 执行滑动
     */
    private void performSwipe(int startX, int startY, int endX, int endY, long duration, Runnable onComplete) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            Log.e(TAG, "API 级别不足");
            if (onComplete != null) onComplete.run();
            return;
        }

        Log.d(TAG, "performSwipe: (" + startX + "," + startY + ") -> (" + endX + "," + endY + ")");

        Path path = new Path();
        path.moveTo(startX, startY);
        path.lineTo(endX, endY);

        GestureDescription.StrokeDescription stroke =
            new GestureDescription.StrokeDescription(path, 0, duration);

        GestureDescription gesture = new GestureDescription.Builder()
            .addStroke(stroke)
            .build();

        boolean dispatched = dispatchGesture(gesture, new GestureResultCallback() {
            @Override
            public void onCompleted(GestureDescription gestureDescription) {
                Log.d(TAG, "滑动完成");
                if (onComplete != null) onComplete.run();
            }

            @Override
            public void onCancelled(GestureDescription gestureDescription) {
                Log.w(TAG, "滑动取消");
                if (onComplete != null) onComplete.run();
            }
        }, handler);

        if (!dispatched) {
            Log.e(TAG, "滑动分发失败");
            if (onComplete != null) onComplete.run();
        }
    }
}
