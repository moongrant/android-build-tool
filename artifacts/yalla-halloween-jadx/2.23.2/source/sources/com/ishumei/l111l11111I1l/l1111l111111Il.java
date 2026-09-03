package com.ishumei.l111l11111I1l;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.v4.media.OooO00o;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class l1111l111111Il {
    private static String l1111l111111Il = "sm";
    private static int l111l11111I1l = 2;
    private static int l111l11111Il = 3;
    private static int l111l11111lIl = 1;
    private static int l111l1111l1Il = 4;
    private static int l111l1111lI1l = 7;
    private static int l111l1111llIl = 6;
    private static int[] l111l1111lIl = {1, 2, 4, 6, 7};
    private static l1111l111111Il l11l1111I1l = null;
    private Map<Long, Integer> l11l1111lIIl = new HashMap();
    private SparseArray<Handler> l11l1111I11l = new SparseArray<>();

    private l1111l111111Il() {
        int[] iArr = l111l1111lIl;
        for (int i = 0; i < 5; i++) {
            int i2 = iArr[i];
            HandlerThread handlerThread = new HandlerThread(OooO00o.OooO00o("sm-thread-", i2));
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            this.l11l1111lIIl.put(Long.valueOf(handlerThread.getLooper().getThread().getId()), Integer.valueOf(i2));
            this.l11l1111I11l.put(i2, handler);
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.l11l1111lIIl.put(Long.valueOf(handler2.getLooper().getThread().getId()), 3);
        this.l11l1111I11l.put(3, handler2);
    }

    public static synchronized void l111l11111I1l() {
        if (l11l1111I1l != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            for (Map.Entry<Long, Integer> entry : l11l1111I1l.l11l1111lIIl.entrySet()) {
                if (entry.getKey().longValue() != handler.getLooper().getThread().getId()) {
                    Handler handlerL1111l111111Il = l11l1111I1l.l1111l111111Il(entry.getValue().intValue());
                    handlerL1111l111111Il.removeCallbacksAndMessages(null);
                    handlerL1111l111111Il.getLooper().quitSafely();
                }
            }
            l11l1111I1l.l11l1111lIIl.clear();
            l11l1111I1l.l11l1111I11l.clear();
            l11l1111I1l = null;
        }
    }

    public static synchronized l1111l111111Il l111l11111lIl() {
        if (l11l1111I1l == null) {
            synchronized (l1111l111111Il.class) {
                if (l11l1111I1l == null) {
                    l11l1111I1l = new l1111l111111Il();
                }
            }
        }
        return l11l1111I1l;
    }

    public final int l1111l111111Il() {
        return this.l11l1111lIIl.get(Long.valueOf(Thread.currentThread().getId())).intValue();
    }

    private int l1111l111111Il(long j) {
        return this.l11l1111lIIl.get(Long.valueOf(j)).intValue();
    }

    public final Handler l1111l111111Il(int i) {
        return this.l11l1111I11l.get(i);
    }

    public final void l1111l111111Il(Runnable runnable, int i) {
        l1111l111111Il(runnable, i, false, 0L, false);
    }

    public final void l1111l111111Il(Runnable runnable, int i, long j, boolean z) {
        l1111l111111Il(runnable, i, false, j, z);
    }

    public final void l1111l111111Il(Runnable runnable, int i, boolean z, long j, boolean z2) {
        Handler handlerL1111l111111Il = l1111l111111Il(i);
        if (handlerL1111l111111Il == null) {
            return;
        }
        if (z2) {
            handlerL1111l111111Il.removeCallbacks(runnable);
        }
        if (z) {
            handlerL1111l111111Il.postAtFrontOfQueue(runnable);
        } else {
            handlerL1111l111111Il.postDelayed(runnable, j);
        }
    }
}
