package com.common.support.imagepicker.mediaedit.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0019\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u000eJ\u0012\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u001e\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u000eJ\u0006\u0010 \u001a\u00020\u0012J\b\u0010!\u001a\u00020\u0012H\u0016J\u0016\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\nR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/DispatchQueue;", "Ljava/lang/Thread;", "threadName", "", "start", "", "(Ljava/lang/String;Z)V", "handler", "Landroid/os/Handler;", "index", "", "getIndex", "()I", "lastTaskTime", "", "syncLatch", "Ljava/util/concurrent/CountDownLatch;", "cancelRunnable", "", "runnable", "Ljava/lang/Runnable;", "cancelRunnables", "runnables", "", "([Ljava/lang/Runnable;)V", "cleanupQueue", "getLastTaskTime", "handleMessage", "inputMessage", "Landroid/os/Message;", "postRunnable", "delay", "recycle", "run", "sendMessage", "msg", "Companion", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DispatchQueue extends Thread {

    @NotNull
    private static final String TAG = "DispatchQueue";
    private static int indexPointer;

    @Nullable
    private volatile Handler handler;
    private final int index;
    private long lastTaskTime;

    @NotNull
    private final CountDownLatch syncLatch;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DispatchQueue(@NotNull String threadName) {
        this(threadName, false, 2, null);
        Intrinsics.checkNotNullParameter(threadName, "threadName");
    }

    public final void cancelRunnable(@Nullable Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            this.syncLatch.await();
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(runnable);
            }
        } catch (Exception e) {
            ImagePickerLogUtil.e(TAG, e);
        }
    }

    public final void cancelRunnables(@NotNull Runnable[] runnables) {
        Intrinsics.checkNotNullParameter(runnables, "runnables");
        try {
            this.syncLatch.await();
            for (Runnable runnable : runnables) {
                Handler handler = this.handler;
                if (handler != null) {
                    handler.removeCallbacks(runnable);
                }
            }
        } catch (Exception e) {
            ImagePickerLogUtil.e(TAG, e);
        }
    }

    public final void cleanupQueue() {
        try {
            this.syncLatch.await();
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e) {
            ImagePickerLogUtil.e(TAG, e);
        }
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastTaskTime() {
        return this.lastTaskTime;
    }

    public void handleMessage(@Nullable Message inputMessage) {
    }

    public final boolean postRunnable(@Nullable Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        this.lastTaskTime = SystemClock.elapsedRealtime();
        return postRunnable(runnable, 0L);
    }

    public final void recycle() {
        Looper looper;
        Handler handler = this.handler;
        if (handler == null || (looper = handler.getLooper()) == null) {
            return;
        }
        looper.quit();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.handler = new Handler() { // from class: com.common.support.imagepicker.mediaedit.utils.DispatchQueue.run.1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                DispatchQueue.this.handleMessage(msg);
            }
        };
        this.syncLatch.countDown();
        Looper.loop();
    }

    public final void sendMessage(@NotNull Message msg, int delay) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        try {
            this.syncLatch.await();
            if (delay <= 0) {
                Handler handler = this.handler;
                if (handler != null) {
                    handler.sendMessage(msg);
                }
            } else {
                Handler handler2 = this.handler;
                if (handler2 != null) {
                    handler2.sendMessageDelayed(msg, delay);
                }
            }
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ DispatchQueue(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }

    @JvmOverloads
    public DispatchQueue(@NotNull String threadName, boolean z) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        this.syncLatch = new CountDownLatch(1);
        int i = indexPointer;
        indexPointer = i + 1;
        this.index = i;
        setName(threadName);
        if (z) {
            start();
        }
    }

    public final boolean postRunnable(@Nullable Runnable runnable, long delay) {
        if (runnable == null) {
            return false;
        }
        try {
            this.syncLatch.await();
        } catch (Exception e) {
            ImagePickerLogUtil.e(TAG, e);
        }
        Boolean boolValueOf = null;
        if (delay <= 0) {
            Handler handler = this.handler;
            if (handler != null) {
                boolValueOf = Boolean.valueOf(handler.post(runnable));
            }
        } else {
            Handler handler2 = this.handler;
            if (handler2 != null) {
                boolValueOf = Boolean.valueOf(handler2.postDelayed(runnable, delay));
            }
        }
        return Intrinsics.areEqual(boolValueOf, Boolean.TRUE);
    }
}
