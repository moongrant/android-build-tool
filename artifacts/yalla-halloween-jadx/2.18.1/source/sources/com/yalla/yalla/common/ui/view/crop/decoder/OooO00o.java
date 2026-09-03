package com.yalla.yalla.common.ui.view.crop.decoder;

import android.app.ActivityManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends Thread {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SkiaPooledImageRegionDecoder f21188Oooo0o;

    public OooO00o(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        this.f21188Oooo0o = skiaPooledImageRegionDecoder;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int size;
        boolean z;
        while (true) {
            SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = this.f21188Oooo0o;
            SkiaPooledImageRegionDecoder.OooO00o oooO00o = skiaPooledImageRegionDecoder.f21193OooO00o;
            if (oooO00o == null) {
                return;
            }
            synchronized (oooO00o) {
                size = oooO00o.f21202OooO0O0.size();
            }
            long j = this.f21188Oooo0o.f21197OooO0o;
            boolean z2 = false;
            if (size < 4) {
                long j2 = ((long) size) * j;
                if (j2 <= 20971520) {
                    if (size >= Runtime.getRuntime().availableProcessors()) {
                        Runtime.getRuntime().availableProcessors();
                    } else {
                        ActivityManager activityManager = (ActivityManager) skiaPooledImageRegionDecoder.f21196OooO0Oo.getSystemService("activity");
                        if (activityManager != null) {
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            activityManager.getMemoryInfo(memoryInfo);
                            z = memoryInfo.lowMemory;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            long j3 = j2 / 1048576;
                            z2 = true;
                        }
                    }
                }
            }
            if (!z2) {
                return;
            }
            try {
                if (this.f21188Oooo0o.f21193OooO00o != null) {
                    System.currentTimeMillis();
                    Objects.requireNonNull(this.f21188Oooo0o);
                    this.f21188Oooo0o.OooO0o0();
                    System.currentTimeMillis();
                    Objects.requireNonNull(this.f21188Oooo0o);
                }
            } catch (Exception e) {
                SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder2 = this.f21188Oooo0o;
                e.getMessage();
                Objects.requireNonNull(skiaPooledImageRegionDecoder2);
            }
        }
    }
}
