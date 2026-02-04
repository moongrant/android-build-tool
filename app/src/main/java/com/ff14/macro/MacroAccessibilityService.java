package com.ff14.macro;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.content.Intent;
import android.graphics.Path;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;

import java.util.List;

/**
 * 无障碍服务 - 执行触控宏指令
 */
public class MacroAccessibilityService extends AccessibilityService {

    private static MacroAccessibilityService instance;
    private Handler handler;
    private boolean isRunning = false;
    private MacroRunCallback callback;

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
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        instance = null;
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // 不需要处理事件
    }

    @Override
    public void onInterrupt() {
        // 服务中断
    }

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        instance = this;
        // 发送广播通知服务已连接
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
     * 执行宏指令
     */
    public void executeMacro(Macro macro) {
        if (macro == null || macro.getActions().isEmpty()) {
            if (callback != null) callback.onMacroError("宏指令为空");
            return;
        }

        if (isRunning) {
            if (callback != null) callback.onMacroError("宏正在执行中");
            return;
        }

        isRunning = true;
        if (callback != null) callback.onMacroStarted();

        executeActions(macro.getActions(), 0);
    }

    /**
     * 停止执行
     */
    public void stopMacro() {
        isRunning = false;
        handler.removeCallbacksAndMessages(null);
        if (callback != null) callback.onMacroFinished();
    }

    /**
     * 递归执行操作列表
     */
    private void executeActions(List<MacroAction> actions, int index) {
        if (!isRunning || index >= actions.size()) {
            isRunning = false;
            if (callback != null) callback.onMacroFinished();
            return;
        }

        MacroAction action = actions.get(index);

        switch (action.getType()) {
            case TAP:
                MacroAction.TapAction tap = (MacroAction.TapAction) action;
                performTap(tap.x, tap.y, () -> {
                    handler.postDelayed(() -> executeActions(actions, index + 1), 50);
                });
                break;

            case SWIPE:
                MacroAction.SwipeAction swipe = (MacroAction.SwipeAction) action;
                performSwipe(swipe.startX, swipe.startY, swipe.endX, swipe.endY, swipe.duration, () -> {
                    handler.postDelayed(() -> executeActions(actions, index + 1), 50);
                });
                break;

            case DELAY:
                MacroAction.DelayAction delay = (MacroAction.DelayAction) action;
                handler.postDelayed(() -> executeActions(actions, index + 1), delay.delayMs);
                break;
        }
    }

    /**
     * 执行点击
     */
    private void performTap(int x, int y, Runnable onComplete) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            if (onComplete != null) onComplete.run();
            return;
        }

        Path path = new Path();
        path.moveTo(x, y);

        GestureDescription.StrokeDescription stroke =
            new GestureDescription.StrokeDescription(path, 0, 100);

        GestureDescription gesture = new GestureDescription.Builder()
            .addStroke(stroke)
            .build();

        dispatchGesture(gesture, new GestureResultCallback() {
            @Override
            public void onCompleted(GestureDescription gestureDescription) {
                if (onComplete != null) onComplete.run();
            }

            @Override
            public void onCancelled(GestureDescription gestureDescription) {
                if (onComplete != null) onComplete.run();
            }
        }, handler);
    }

    /**
     * 执行滑动
     */
    private void performSwipe(int startX, int startY, int endX, int endY, long duration, Runnable onComplete) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) {
            if (onComplete != null) onComplete.run();
            return;
        }

        Path path = new Path();
        path.moveTo(startX, startY);
        path.lineTo(endX, endY);

        GestureDescription.StrokeDescription stroke =
            new GestureDescription.StrokeDescription(path, 0, duration);

        GestureDescription gesture = new GestureDescription.Builder()
            .addStroke(stroke)
            .build();

        dispatchGesture(gesture, new GestureResultCallback() {
            @Override
            public void onCompleted(GestureDescription gestureDescription) {
                if (onComplete != null) onComplete.run();
            }

            @Override
            public void onCancelled(GestureDescription gestureDescription) {
                if (onComplete != null) onComplete.run();
            }
        }, handler);
    }
}
