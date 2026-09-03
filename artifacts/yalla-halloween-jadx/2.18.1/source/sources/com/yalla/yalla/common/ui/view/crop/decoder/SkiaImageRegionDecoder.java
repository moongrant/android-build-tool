package com.yalla.yalla.common.ui.view.crop.decoder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p511o0o00ooO.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public class SkiaImageRegionDecoder implements o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public BitmapRegionDecoder f21190OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ReentrantReadWriteLock f21191OooO0O0 = new ReentrantReadWriteLock(true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Bitmap.Config f21192OooO0OO;

    @Keep
    public SkiaImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (preferredBitmapConfig != null) {
            this.f21192OooO0OO = preferredBitmapConfig;
        } else {
            this.f21192OooO0OO = Bitmap.Config.RGB_565;
        }
    }

    @Override // p511o0o00ooO.o00O00
    public final synchronized void OooO00o() {
        this.f21191OooO0O0.writeLock().lock();
        try {
            this.f21190OooO00o.recycle();
            this.f21190OooO00o = null;
            this.f21191OooO0O0.writeLock().unlock();
        } catch (Throwable th) {
            this.f21191OooO0O0.writeLock().unlock();
            throw th;
        }
    }

    @Override // p511o0o00ooO.o00O00
    public final synchronized boolean OooO0O0() {
        BitmapRegionDecoder bitmapRegionDecoder;
        bitmapRegionDecoder = this.f21190OooO00o;
        return (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) ? false : true;
    }

    @Override // p511o0o00ooO.o00O00
    @NonNull
    public final Point OooO0OO(Context context, @NonNull Uri uri) throws Exception {
        int identifier;
        String string = uri.toString();
        if (string.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            Resources resources = context.getPackageName().equals(authority) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size == 2 && pathSegments.get(0).equals("drawable")) {
                identifier = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            } else if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    identifier = 0;
                }
            } else {
                identifier = 0;
            }
            this.f21190OooO00o = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(identifier), false);
        } else if (string.startsWith("file:///android_asset/")) {
            this.f21190OooO00o = BitmapRegionDecoder.newInstance(context.getAssets().open(string.substring(22), 1), false);
        } else if (string.startsWith("file://")) {
            this.f21190OooO00o = BitmapRegionDecoder.newInstance(string.substring(7), false);
        } else {
            InputStream inputStream = null;
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new Exception("Content resolver returned null stream. Unable to initialise with uri.");
                }
                this.f21190OooO00o = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                try {
                    inputStreamOpenInputStream.close();
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        }
        return new Point(this.f21190OooO00o.getWidth(), this.f21190OooO00o.getHeight());
    }

    @Override // p511o0o00ooO.o00O00
    @NonNull
    public final Bitmap OooO0Oo(@NonNull Rect rect, int i) {
        OooO0o0().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f21190OooO00o;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            options.inPreferredConfig = this.f21192OooO0OO;
            Bitmap bitmapDecodeRegion = this.f21190OooO00o.decodeRegion(rect, options);
            if (bitmapDecodeRegion == null) {
                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
            }
            OooO0o0().unlock();
            return bitmapDecodeRegion;
        } catch (Throwable th) {
            OooO0o0().unlock();
            throw th;
        }
    }

    public final Lock OooO0o0() {
        return this.f21191OooO0O0.readLock();
    }
}
