package com.ff14.macro;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.IBinder;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

/**
 * 悬浮按钮服务
 */
public class FloatingButtonService extends Service implements MacroAccessibilityService.MacroRunCallback {

    private static final String CHANNEL_ID = "FloatingButtonChannel";
    private static final int NOTIFICATION_ID = 1;

    private WindowManager windowManager;
    private View floatingView;
    private ImageView ivButton;
    private MacroStorage macroStorage;
    private boolean isRunning = false;

    // 用于拖动
    private int initialX, initialY;
    private float initialTouchX, initialTouchY;
    private boolean isDragging = false;
    private static final int CLICK_THRESHOLD = 10;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        macroStorage = new MacroStorage(this);
        createNotificationChannel();
        startForeground(NOTIFICATION_ID, createNotification());
        createFloatingButton();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (floatingView != null && windowManager != null) {
            windowManager.removeView(floatingView);
        }
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(
                CHANNEL_ID,
                "悬浮按钮服务",
                NotificationManager.IMPORTANCE_LOW
            );
            channel.setDescription("保持悬浮按钮运行");
            NotificationManager manager = getSystemService(NotificationManager.class);
            if (manager != null) {
                manager.createNotificationChannel(channel);
            }
        }
    }

    private Notification createNotification() {
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(
            this, 0, intent, PendingIntent.FLAG_IMMUTABLE
        );

        return new NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("FF14 宏指令")
            .setContentText("悬浮按钮运行中")
            .setSmallIcon(R.drawable.ic_launcher)
            .setContentIntent(pendingIntent)
            .build();
    }

    private void createFloatingButton() {
        windowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);

        LayoutInflater inflater = LayoutInflater.from(this);
        floatingView = inflater.inflate(R.layout.layout_floating_button, null);
        ivButton = floatingView.findViewById(R.id.ivFloatingButton);

        int layoutType;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            layoutType = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            layoutType = WindowManager.LayoutParams.TYPE_PHONE;
        }

        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            layoutType,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        );

        params.gravity = Gravity.TOP | Gravity.START;
        params.x = 100;
        params.y = 200;

        windowManager.addView(floatingView, params);

        // 设置触摸监听
        floatingView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) floatingView.getLayoutParams();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        initialX = layoutParams.x;
                        initialY = layoutParams.y;
                        initialTouchX = event.getRawX();
                        initialTouchY = event.getRawY();
                        isDragging = false;
                        return true;

                    case MotionEvent.ACTION_MOVE:
                        float deltaX = event.getRawX() - initialTouchX;
                        float deltaY = event.getRawY() - initialTouchY;

                        if (Math.abs(deltaX) > CLICK_THRESHOLD || Math.abs(deltaY) > CLICK_THRESHOLD) {
                            isDragging = true;
                        }

                        if (isDragging) {
                            layoutParams.x = initialX + (int) deltaX;
                            layoutParams.y = initialY + (int) deltaY;
                            windowManager.updateViewLayout(floatingView, layoutParams);
                        }
                        return true;

                    case MotionEvent.ACTION_UP:
                        if (!isDragging) {
                            onButtonClick();
                        }
                        return true;
                }
                return false;
            }
        });
    }

    private void onButtonClick() {
        MacroAccessibilityService service = MacroAccessibilityService.getInstance();

        if (service == null) {
            Toast.makeText(this, "请先开启无障碍服务", Toast.LENGTH_SHORT).show();
            return;
        }

        if (isRunning) {
            // 停止执行
            service.stopMacro();
        } else {
            // 开始执行
            Macro macro = macroStorage.getSelectedMacro();
            if (macro == null) {
                Toast.makeText(this, "请先在应用中选择一个宏", Toast.LENGTH_SHORT).show();
                return;
            }

            service.setCallback(this);
            service.executeMacro(macro);
        }
    }

    @Override
    public void onMacroStarted() {
        isRunning = true;
        ivButton.post(() -> {
            ivButton.setImageResource(R.drawable.ic_stop);
            ivButton.setBackgroundResource(R.drawable.floating_button_running);
        });
    }

    @Override
    public void onMacroFinished() {
        isRunning = false;
        ivButton.post(() -> {
            ivButton.setImageResource(R.drawable.ic_play);
            ivButton.setBackgroundResource(R.drawable.floating_button_bg);
        });
    }

    @Override
    public void onMacroError(String error) {
        isRunning = false;
        ivButton.post(() -> {
            ivButton.setImageResource(R.drawable.ic_play);
            ivButton.setBackgroundResource(R.drawable.floating_button_bg);
            Toast.makeText(FloatingButtonService.this, error, Toast.LENGTH_SHORT).show();
        });
    }
}
