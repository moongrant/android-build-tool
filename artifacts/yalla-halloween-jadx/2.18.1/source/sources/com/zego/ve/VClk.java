package com.zego.ve;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public class VClk {
    private static final int MESSAGE_RESTART = 2;
    private static final int MESSAGE_START = 0;
    private static final int MESSAGE_STOP = 1;
    private static final String TAG = "VClk";
    private static VClk sInstance = new VClk();
    private EventHandler mCallback;
    private Handler mHandler;
    private HandlerThread mThread;
    private long pThis = 0;

    public static class EventHandler implements Handler.Callback, Choreographer.FrameCallback {
        private AtomicLong mAtomicThis;
        private boolean mRunning;

        private EventHandler() {
            this.mAtomicThis = new AtomicLong();
            this.mRunning = false;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            if (this.mRunning) {
                long j2 = this.mAtomicThis.get();
                if (j2 == 0) {
                    return;
                }
                VClk.on_video_tick(j2, j);
                Choreographer.getInstance().postFrameCallback(this);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                try {
                    if (i == 1) {
                        if (this.mRunning) {
                            this.mRunning = false;
                            Choreographer.getInstance().removeFrameCallback(this);
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 < 28) {
                                if (i2 >= 24) {
                                    try {
                                        try {
                                            try {
                                                Choreographer.class.getMethod("releaseInstance", new Class[0]).invoke(null, new Object[0]);
                                            } catch (NoSuchMethodException e) {
                                                e.printStackTrace();
                                            }
                                        } catch (IllegalAccessException e2) {
                                            e2.printStackTrace();
                                        }
                                    } catch (InvocationTargetException e3) {
                                        e3.printStackTrace();
                                    }
                                } else {
                                    Choreographer choreographer = Choreographer.getInstance();
                                    try {
                                        try {
                                            try {
                                                Field declaredField = Choreographer.class.getDeclaredField("sThreadInstance");
                                                declaredField.setAccessible(true);
                                                ((ThreadLocal) declaredField.get(null)).remove();
                                                Field declaredField2 = Choreographer.class.getDeclaredField("mDisplayEventReceiver");
                                                declaredField2.setAccessible(true);
                                                Object obj = declaredField2.get(choreographer);
                                                obj.getClass().getMethod("dispose", new Class[0]).invoke(obj, new Object[0]);
                                            } catch (IllegalAccessException e4) {
                                                e4.printStackTrace();
                                            }
                                        } catch (NoSuchMethodException e5) {
                                            e5.printStackTrace();
                                        } catch (InvocationTargetException e6) {
                                            e6.printStackTrace();
                                        }
                                    } catch (NoSuchFieldException e7) {
                                        e7.printStackTrace();
                                    } catch (NullPointerException e8) {
                                        e8.printStackTrace();
                                    }
                                }
                            }
                        }
                    } else if (i == 2) {
                        Choreographer.getInstance().removeFrameCallback(this);
                        Choreographer.getInstance().postFrameCallback(this);
                    }
                } catch (Exception unused) {
                }
            } else if (!this.mRunning) {
                this.mRunning = true;
                try {
                    Choreographer.getInstance().postFrameCallback(this);
                } catch (Exception e9) {
                    e9.printStackTrace();
                    long j = this.mAtomicThis.get();
                    if (j != 0) {
                        VClk.on_error(j);
                    }
                }
            }
            return false;
        }

        public void init(long j) {
            this.mAtomicThis.set(j);
        }

        public void uninit() {
            this.mAtomicThis.set(0L);
        }
    }

    public VClk() {
        this.mThread = null;
        this.mCallback = null;
        this.mHandler = null;
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mThread = handlerThread;
        handlerThread.start();
        this.mCallback = new EventHandler();
        this.mHandler = new Handler(this.mThread.getLooper(), this.mCallback);
    }

    private static VClk getInstance() {
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int on_error(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int on_video_tick(long j, long j2);

    public int restartClock() {
        if (this.pThis == 0) {
            return 0;
        }
        this.mHandler.sendEmptyMessage(2);
        return 0;
    }

    public int start(long j) {
        this.pThis = j;
        return 0;
    }

    public int startClock() {
        long j = this.pThis;
        if (j != 0) {
            this.mCallback.init(j);
            this.mHandler.sendEmptyMessage(0);
        }
        return 0;
    }

    public int stop(long j) {
        this.mHandler.removeCallbacksAndMessages(null);
        this.pThis = 0L;
        return 0;
    }

    public int stopClock() {
        if (this.pThis == 0) {
            return 0;
        }
        this.mHandler.sendEmptyMessage(1);
        this.mCallback.uninit();
        return 0;
    }
}
