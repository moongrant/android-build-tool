package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import p263o00ooo0O.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    public static volatile ClassLoader f14854OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    public static volatile Thread f14855OooO0O0;

    @Nullable
    public static synchronized ClassLoader OooO00o() {
        ClassLoader contextClassLoader = null;
        if (f14855OooO0O0 == null) {
            f14855OooO0O0 = OooO0O0();
            if (f14855OooO0O0 == null) {
                return null;
            }
        }
        synchronized (f14855OooO0O0) {
            try {
                contextClassLoader = f14855OooO0O0.getContextClassLoader();
            } catch (SecurityException e) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e.getMessage());
            }
        }
        return contextClassLoader;
    }

    @Nullable
    public static synchronized Thread OooO0O0() {
        SecurityException e;
        Thread o00o00oo2;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                int iActiveGroupCount = threadGroup2.activeGroupCount();
                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                threadGroup2.enumerate(threadGroupArr);
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= iActiveGroupCount) {
                        threadGroup = null;
                        break;
                    }
                    threadGroup = threadGroupArr[i2];
                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                        break;
                    }
                    i2++;
                }
                if (threadGroup == null) {
                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                }
                int iActiveCount = threadGroup.activeCount();
                Thread[] threadArr = new Thread[iActiveCount];
                threadGroup.enumerate(threadArr);
                while (true) {
                    if (i >= iActiveCount) {
                        thread = null;
                        break;
                    }
                    thread = threadArr[i];
                    if ("GmsDynamite".equals(thread.getName())) {
                        break;
                    }
                    i++;
                }
                if (thread == null) {
                    try {
                        o00o00oo2 = new o00O00OO(threadGroup);
                        try {
                            o00o00oo2.setContextClassLoader(null);
                            o00o00oo2.start();
                        } catch (SecurityException e2) {
                            e = e2;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                        }
                    } catch (SecurityException e3) {
                        e = e3;
                        o00o00oo2 = thread;
                    }
                    thread = o00o00oo2;
                }
            } catch (SecurityException e4) {
                e = e4;
                o00o00oo2 = null;
            }
        }
        return thread;
    }

    @Nullable
    public static synchronized ClassLoader zza() {
        if (f14854OooO00o == null) {
            f14854OooO00o = OooO00o();
        }
        return f14854OooO00o;
    }
}
