package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.util.Log;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import p420o0Oo0ooO.oO00o00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final StringBuilder f19821OooO00o = new StringBuilder();

    public static class OooO00o extends Thread {
        public OooO00o(Runnable runnable) {
            super(runnable);
        }

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

    public static void OooO(String str, String str2, String str3) {
        OooOO0(str, str2, str3, "");
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

    public static void OooO0OO(InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
    }

    public static File OooO0Oo(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static int OooO0o(Bitmap bitmap) {
        int byteCount = bitmap.getByteCount();
        if (byteCount >= 0) {
            return byteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String OooO0o0(Oooo0 oooo0) {
        StringBuilder sb = f19821OooO00o;
        Uri uri = oooo0.f19769OooO0Oo;
        if (uri != null) {
            String string = uri.toString();
            sb.ensureCapacity(string.length() + 50);
            sb.append(string);
        } else {
            sb.ensureCapacity(50);
            sb.append(oooo0.f19771OooO0o0);
        }
        sb.append('\n');
        if (oooo0.f19776OooOO0o != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            sb.append("rotation:");
            sb.append(oooo0.f19776OooOO0o);
            if (oooo0.f19779OooOOOO) {
                sb.append('@');
                sb.append(oooo0.f19778OooOOO0);
                sb.append('x');
                sb.append(oooo0.f19777OooOOO);
            }
            sb.append('\n');
        }
        if (oooo0.OooO00o()) {
            sb.append("resize:");
            sb.append(oooo0.f19772OooO0oO);
            sb.append('x');
            sb.append(oooo0.f19773OooO0oo);
            sb.append('\n');
        }
        if (oooo0.f19765OooO) {
            sb.append("centerCrop");
            sb.append('\n');
        } else if (oooo0.f19774OooOO0) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List<oO00o00O> list = oooo0.f19770OooO0o;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(oooo0.f19770OooO0o.get(i).key());
                sb.append('\n');
            }
        }
        String string2 = sb.toString();
        f19821OooO00o.setLength(0);
        return string2;
    }

    public static String OooO0oO(OooO0OO oooO0OO) {
        return OooO0oo(oooO0OO, "");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<com.squareup.picasso.OooO00o>] */
    public static String OooO0oo(OooO0OO oooO0OO, String str) {
        StringBuilder sb = new StringBuilder(str);
        com.squareup.picasso.OooO00o oooO00o = oooO0OO.f19717OoooOOO;
        if (oooO00o != null) {
            sb.append(oooO00o.f19692OooO0O0.OooO0O0());
        }
        ?? r4 = oooO0OO.f19718OoooOOo;
        if (r4 != 0) {
            int size = r4.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || oooO00o != null) {
                    sb.append(", ");
                }
                sb.append(((com.squareup.picasso.OooO00o) r4.get(i)).f19692OooO0O0.OooO0O0());
            }
        }
        return sb.toString();
    }

    public static void OooOO0(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
