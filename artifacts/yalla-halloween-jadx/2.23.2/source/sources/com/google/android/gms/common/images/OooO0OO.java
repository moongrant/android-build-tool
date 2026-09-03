package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f14517OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final CountDownLatch f14518OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Bitmap f14519OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ImageManager f14520OooO0oO;

    public OooO0OO(ImageManager imageManager, @Nullable Uri uri, Bitmap bitmap, CountDownLatch countDownLatch) {
        this.f14520OooO0oO = imageManager;
        this.f14517OooO0Oo = uri;
        this.f14519OooO0o0 = bitmap;
        this.f14518OooO0o = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f14519OooO0o0;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f14520OooO0oO.f14508OooO0o0.remove(this.f14517OooO0Oo);
        if (imageReceiver != null) {
            ArrayList<zag> arrayList = imageReceiver.f14511OooO0o0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zag zagVar = arrayList.get(i);
                Bitmap bitmap2 = this.f14519OooO0o0;
                if (bitmap2 == null || bitmap == null) {
                    this.f14520OooO0oO.f14507OooO0o.put(this.f14517OooO0Oo, Long.valueOf(SystemClock.elapsedRealtime()));
                    zagVar.OooO0O0(this.f14520OooO0oO.f14503OooO00o, false);
                } else {
                    Context context = this.f14520OooO0oO.f14503OooO00o;
                    zagVar.getClass();
                    Asserts.checkNotNull(bitmap2);
                    zagVar.OooO00o(new BitmapDrawable(context.getResources(), bitmap2), false, false, true);
                }
                if (!(zagVar instanceof zaf)) {
                    this.f14520OooO0oO.f14506OooO0Oo.remove(zagVar);
                }
            }
        }
        this.f14518OooO0o.countDown();
        synchronized (ImageManager.f14501OooO0oO) {
            ImageManager.f14502OooO0oo.remove(this.f14517OooO0Oo);
        }
    }
}
