package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final StringBuilder f21300OooO00o = new StringBuilder();

    public static class OooO00o extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    public static class OooO0O0 implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new OooO00o(runnable);
        }
    }

    public static long OooO00o(File file) {
        long blockCount;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return Math.max(Math.min(blockCount, 52428800L), 5242880L);
    }

    public static void OooO0O0() {
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    public static String OooO0OO(o00Ooo o00ooo2) {
        StringBuilder sb = f21300OooO00o;
        Uri uri = o00ooo2.f21321OooO0Oo;
        if (uri != null) {
            String string = uri.toString();
            sb.ensureCapacity(string.length() + 50);
            sb.append(string);
        } else {
            sb.ensureCapacity(50);
            sb.append(o00ooo2.f21323OooO0o0);
        }
        sb.append('\n');
        float f = o00ooo2.f21328OooOO0o;
        if (f != 0.0f) {
            sb.append("rotation:");
            sb.append(f);
            if (o00ooo2.f21331OooOOOO) {
                sb.append('@');
                sb.append(o00ooo2.f21330OooOOO0);
                sb.append('x');
                sb.append(o00ooo2.f21329OooOOO);
            }
            sb.append('\n');
        }
        if (o00ooo2.OooO00o()) {
            sb.append("resize:");
            sb.append(o00ooo2.f21324OooO0oO);
            sb.append('x');
            sb.append(o00ooo2.f21325OooO0oo);
            sb.append('\n');
        }
        if (o00ooo2.f21317OooO) {
            sb.append("centerCrop");
            sb.append('\n');
        } else if (o00ooo2.f21326OooOO0) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<o0O0O00> list = o00ooo2.f21322OooO0o;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(list.get(i).key());
                sb.append('\n');
            }
        }
        String string2 = sb.toString();
        sb.setLength(0);
        return string2;
    }

    public static int OooO0Oo(Bitmap bitmap) {
        int byteCount = bitmap.getByteCount();
        if (byteCount >= 0) {
            return byteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String OooO0o(OooO0OO oooO0OO, String str) {
        StringBuilder sb = new StringBuilder(str);
        com.squareup.picasso.OooO00o oooO00o = oooO0OO.f21230OooOOO;
        if (oooO00o != null) {
            sb.append(oooO00o.f21205OooO0O0.OooO0O0());
        }
        ArrayList arrayList = oooO0OO.f21232OooOOOO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || oooO00o != null) {
                    sb.append(", ");
                }
                sb.append(((com.squareup.picasso.OooO00o) arrayList.get(i)).f21205OooO0O0.OooO0O0());
            }
        }
        return sb.toString();
    }

    public static String OooO0o0(OooO0OO oooO0OO) {
        return OooO0o(oooO0OO, "");
    }

    public static void OooO0oO(String str, String str2, String str3) {
        OooO0oo(str, str2, str3, "");
    }

    public static void OooO0oo(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
