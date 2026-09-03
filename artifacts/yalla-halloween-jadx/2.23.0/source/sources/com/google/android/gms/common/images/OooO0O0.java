package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager.ImageReceiver;
import com.google.android.gms.common.internal.Asserts;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zag f14991OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ImageManager f14992OooO0o0;

    public OooO0O0(ImageManager imageManager, zag zagVar) {
        this.f14992OooO0o0 = imageManager;
        this.f14991OooO0Oo = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f14992OooO0o0.f14982OooO0Oo.get(this.f14991OooO0Oo);
        if (imageReceiver != null) {
            this.f14992OooO0o0.f14982OooO0Oo.remove(this.f14991OooO0Oo);
            zag zagVar = this.f14991OooO0Oo;
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            imageReceiver.f14987OooO0o0.remove(zagVar);
        }
        zag zagVar2 = this.f14991OooO0Oo;
        OooO0o oooO0o = zagVar2.f15006OooO00o;
        Uri uri = oooO0o.f14997OooO00o;
        if (uri == null) {
            zagVar2.OooO0O0(this.f14992OooO0o0.f14979OooO00o, true);
            return;
        }
        Long l = (Long) this.f14992OooO0o0.f14983OooO0o.get(uri);
        if (l != null) {
            if (SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                this.f14991OooO0Oo.OooO0O0(this.f14992OooO0o0.f14979OooO00o, true);
                return;
            }
            this.f14992OooO0o0.f14983OooO0o.remove(oooO0o.f14997OooO00o);
        }
        this.f14991OooO0Oo.OooO00o(null, false, true, false);
        ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) this.f14992OooO0o0.f14984OooO0o0.get(oooO0o.f14997OooO00o);
        if (imageReceiver2 == null) {
            imageReceiver2 = this.f14992OooO0o0.new ImageReceiver(oooO0o.f14997OooO00o);
            this.f14992OooO0o0.f14984OooO0o0.put(oooO0o.f14997OooO00o, imageReceiver2);
        }
        zag zagVar3 = this.f14991OooO0Oo;
        Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
        imageReceiver2.f14987OooO0o0.add(zagVar3);
        zag zagVar4 = this.f14991OooO0Oo;
        if (!(zagVar4 instanceof zaf)) {
            this.f14992OooO0o0.f14982OooO0Oo.put(zagVar4, imageReceiver2);
        }
        synchronized (ImageManager.f14977OooO0oO) {
            HashSet<Uri> hashSet = ImageManager.f14978OooO0oo;
            if (!hashSet.contains(oooO0o.f14997OooO00o)) {
                hashSet.add(oooO0o.f14997OooO00o);
                imageReceiver2.OooO00o();
            }
        }
    }
}
