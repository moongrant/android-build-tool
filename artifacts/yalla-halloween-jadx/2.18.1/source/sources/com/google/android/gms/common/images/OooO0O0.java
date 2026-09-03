package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager.ImageReceiver;
import com.google.android.gms.common.internal.Asserts;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final zag f15495Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ImageManager f15496Oooo0oO;

    public OooO0O0(ImageManager imageManager, zag zagVar) {
        this.f15496Oooo0oO = imageManager;
        this.f15495Oooo0o = zagVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.HashMap, java.util.Map<android.net.Uri, com.google.android.gms.common.images.ImageManager$ImageReceiver>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.images.zag, com.google.android.gms.common.images.ImageManager$ImageReceiver>] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.HashMap, java.util.Map<android.net.Uri, java.lang.Long>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap, java.util.Map<android.net.Uri, java.lang.Long>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.images.zag, com.google.android.gms.common.images.ImageManager$ImageReceiver>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashMap, java.util.Map<android.net.Uri, com.google.android.gms.common.images.ImageManager$ImageReceiver>] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.images.zag, com.google.android.gms.common.images.ImageManager$ImageReceiver>] */
    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f15496Oooo0oO.f15487OooO0o0.get(this.f15495Oooo0o);
        if (imageReceiver != null) {
            this.f15496Oooo0oO.f15487OooO0o0.remove(this.f15495Oooo0o);
            zag zagVar = this.f15495Oooo0o;
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            imageReceiver.f15490Oooo0oO.remove(zagVar);
        }
        zag zagVar2 = this.f15495Oooo0o;
        OooO0o oooO0o = zagVar2.f15510OooO00o;
        Uri uri = oooO0o.f15501OooO00o;
        if (uri == null) {
            zagVar2.OooO0O0(this.f15496Oooo0oO.f15482OooO00o, true);
            return;
        }
        Long l = (Long) this.f15496Oooo0oO.f15488OooO0oO.get(uri);
        if (l != null) {
            if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                this.f15495Oooo0o.OooO0O0(this.f15496Oooo0oO.f15482OooO00o, true);
                return;
            }
            this.f15496Oooo0oO.f15488OooO0oO.remove(oooO0o.f15501OooO00o);
        }
        this.f15495Oooo0o.OooO00o(null, false, true, false);
        ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) this.f15496Oooo0oO.f15486OooO0o.get(oooO0o.f15501OooO00o);
        if (imageReceiver2 == null) {
            imageReceiver2 = this.f15496Oooo0oO.new ImageReceiver(oooO0o.f15501OooO00o);
            this.f15496Oooo0oO.f15486OooO0o.put(oooO0o.f15501OooO00o, imageReceiver2);
        }
        zag zagVar3 = this.f15495Oooo0o;
        Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
        imageReceiver2.f15490Oooo0oO.add(zagVar3);
        zag zagVar4 = this.f15495Oooo0o;
        if (!(zagVar4 instanceof zaf)) {
            this.f15496Oooo0oO.f15487OooO0o0.put(zagVar4, imageReceiver2);
        }
        Object obj = ImageManager.f15480OooO0oo;
        synchronized (ImageManager.f15480OooO0oo) {
            if (!ImageManager.f15479OooO.contains(oooO0o.f15501OooO00o)) {
                ImageManager.f15479OooO.add(oooO0o.f15501OooO00o);
                imageReceiver2.OooO00o();
            }
        }
    }
}
