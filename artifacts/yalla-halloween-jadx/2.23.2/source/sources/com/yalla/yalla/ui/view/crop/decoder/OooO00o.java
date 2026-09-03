package com.yalla.yalla.ui.view.crop.decoder;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Thread {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SkiaPooledImageRegionDecoder f30410OooO0Oo;

    public OooO00o(SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder) {
        this.f30410OooO0Oo = skiaPooledImageRegionDecoder;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int size;
        boolean z;
        boolean z2;
        while (true) {
            SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder = this.f30410OooO0Oo;
            SkiaPooledImageRegionDecoder.OooO00o oooO00o = skiaPooledImageRegionDecoder.f30415OooO00o;
            if (oooO00o == null) {
                return;
            }
            synchronized (oooO00o) {
                size = oooO00o.f30424OooO0O0.size();
            }
            long j = this.f30410OooO0Oo.f30419OooO0o;
            if (size >= 4) {
                z = false;
            } else {
                long j2 = ((long) size) * j;
                if (j2 <= 20971520) {
                    if (size >= Runtime.getRuntime().availableProcessors()) {
                        Runtime.getRuntime().availableProcessors();
                    } else {
                        ActivityManager activityManager = (ActivityManager) skiaPooledImageRegionDecoder.f30418OooO0Oo.getSystemService("activity");
                        z = true;
                        if (activityManager != null) {
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            activityManager.getMemoryInfo(memoryInfo);
                            z2 = memoryInfo.lowMemory;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            long j3 = j2 / 1048576;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
            try {
                if (this.f30410OooO0Oo.f30415OooO00o != null) {
                    System.currentTimeMillis();
                    this.f30410OooO0Oo.getClass();
                    this.f30410OooO0Oo.OooO0o0();
                    System.currentTimeMillis();
                    this.f30410OooO0Oo.getClass();
                }
            } catch (Exception e) {
                SkiaPooledImageRegionDecoder skiaPooledImageRegionDecoder2 = this.f30410OooO0Oo;
                e.getMessage();
                skiaPooledImageRegionDecoder2.getClass();
            }
        }
    }
}
