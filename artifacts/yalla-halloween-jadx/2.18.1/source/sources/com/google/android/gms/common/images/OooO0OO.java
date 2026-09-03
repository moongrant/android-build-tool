package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ImageManager f15497Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Uri f15498Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final Bitmap f15499Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final CountDownLatch f15500Oooo0oo;

    public OooO0OO(ImageManager imageManager, @Nullable Uri uri, Bitmap bitmap, CountDownLatch countDownLatch) {
        this.f15497Oooo = imageManager;
        this.f15498Oooo0o = uri;
        this.f15499Oooo0oO = bitmap;
        this.f15500Oooo0oo = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<android.net.Uri, com.google.android.gms.common.images.ImageManager$ImageReceiver>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.HashMap, java.util.Map<android.net.Uri, java.lang.Long>] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.images.zag, com.google.android.gms.common.images.ImageManager$ImageReceiver>] */
    @Override // java.lang.Runnable
    public final void run() {
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.f15499Oooo0oO;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) this.f15497Oooo.f15486OooO0o.remove(this.f15498Oooo0o);
        if (imageReceiver != null) {
            ArrayList<zag> arrayList = imageReceiver.f15490Oooo0oO;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zag zagVar = arrayList.get(i);
                Bitmap bitmap2 = this.f15499Oooo0oO;
                if (bitmap2 == null || bitmap == null) {
                    this.f15497Oooo.f15488OooO0oO.put(this.f15498Oooo0o, Long.valueOf(SystemClock.elapsedRealtime()));
                    zagVar.OooO0O0(this.f15497Oooo.f15482OooO00o, false);
                } else {
                    Context context = this.f15497Oooo.f15482OooO00o;
                    Objects.requireNonNull(zagVar);
                    Asserts.checkNotNull(bitmap2);
                    zagVar.OooO00o(new BitmapDrawable(context.getResources(), bitmap2), false, false, true);
                }
                if (!(zagVar instanceof zaf)) {
                    this.f15497Oooo.f15487OooO0o0.remove(zagVar);
                }
            }
        }
        this.f15500Oooo0oo.countDown();
        Object obj = ImageManager.f15480OooO0oo;
        synchronized (ImageManager.f15480OooO0oo) {
            ImageManager.f15479OooO.remove(this.f15498Oooo0o);
        }
    }
}
