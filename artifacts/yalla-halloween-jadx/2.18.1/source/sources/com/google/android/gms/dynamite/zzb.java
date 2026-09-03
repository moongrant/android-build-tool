package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    public static volatile ClassLoader f15838OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteLoaderV2ClassLoader.class")
    public static volatile Thread f15839OooO0O0;

    @Nullable
    public static synchronized ClassLoader OooO00o() {
        ClassLoader contextClassLoader = null;
        if (f15839OooO0O0 == null) {
            f15839OooO0O0 = OooO0O0();
            if (f15839OooO0O0 == null) {
                return null;
            }
        }
        synchronized (f15839OooO0O0) {
            try {
                contextClassLoader = f15839OooO0O0.getContextClassLoader();
            } catch (SecurityException e) {
                Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e.getMessage());
            }
        }
        return contextClassLoader;
    }

    @Nullable
    public static synchronized Thread OooO0O0() {
        SecurityException e;
        Thread oooO00o;
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
                        oooO00o = new o0OO00OO.OooO00o(threadGroup);
                        try {
                            oooO00o.setContextClassLoader(null);
                            oooO00o.start();
                        } catch (SecurityException e2) {
                            e = e2;
                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e.getMessage());
                        }
                    } catch (SecurityException e3) {
                        e = e3;
                        oooO00o = thread;
                    }
                    thread = oooO00o;
                }
            } catch (SecurityException e4) {
                e = e4;
                oooO00o = null;
            }
        }
        return thread;
    }

    @Nullable
    public static synchronized ClassLoader zza() {
        if (f15838OooO00o == null) {
            f15838OooO00o = OooO00o();
        }
        return f15838OooO00o;
    }
}
