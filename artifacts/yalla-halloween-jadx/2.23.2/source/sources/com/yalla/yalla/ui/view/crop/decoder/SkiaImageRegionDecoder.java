package com.yalla.yalla.ui.view.crop.decoder;

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
import com.yalla.yalla.ui.view.crop.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p555o0oOOoo.o0O0o00O;

/* JADX INFO: loaded from: classes4.dex */
public class SkiaImageRegionDecoder implements o0O0o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public BitmapRegionDecoder f30412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ReentrantReadWriteLock f30413OooO0O0 = new ReentrantReadWriteLock(true);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Bitmap.Config f30414OooO0OO;

    @Keep
    public SkiaImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (preferredBitmapConfig != null) {
            this.f30414OooO0OO = preferredBitmapConfig;
        } else {
            this.f30414OooO0OO = Bitmap.Config.RGB_565;
        }
    }

    @Override // p555o0oOOoo.o0O0o00O
    public final synchronized void OooO00o() {
        this.f30413OooO0O0.writeLock().lock();
        try {
            this.f30412OooO00o.recycle();
            this.f30412OooO00o = null;
            this.f30413OooO0O0.writeLock().unlock();
        } catch (Throwable th) {
            this.f30413OooO0O0.writeLock().unlock();
            throw th;
        }
    }

    @Override // p555o0oOOoo.o0O0o00O
    @NonNull
    public final Point OooO0O0(Context context, @NonNull Uri uri) throws Exception {
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
            this.f30412OooO00o = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(identifier), false);
        } else if (string.startsWith("file:///android_asset/")) {
            this.f30412OooO00o = BitmapRegionDecoder.newInstance(context.getAssets().open(string.substring(22), 1), false);
        } else if (string.startsWith("file://")) {
            this.f30412OooO00o = BitmapRegionDecoder.newInstance(string.substring(7), false);
        } else {
            InputStream inputStream = null;
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new Exception("Content resolver returned null stream. Unable to initialise with uri.");
                }
                this.f30412OooO00o = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
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
        return new Point(this.f30412OooO00o.getWidth(), this.f30412OooO00o.getHeight());
    }

    @Override // p555o0oOOoo.o0O0o00O
    @NonNull
    public final Bitmap OooO0OO(int i, @NonNull Rect rect) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f30413OooO0O0;
        reentrantReadWriteLock.readLock().lock();
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f30412OooO00o;
            if (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            options.inPreferredConfig = this.f30414OooO0OO;
            Bitmap bitmapDecodeRegion = this.f30412OooO00o.decodeRegion(rect, options);
            if (bitmapDecodeRegion == null) {
                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
            }
            reentrantReadWriteLock.readLock().unlock();
            return bitmapDecodeRegion;
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    @Override // p555o0oOOoo.o0O0o00O
    public final synchronized boolean OooO0Oo() {
        BitmapRegionDecoder bitmapRegionDecoder;
        bitmapRegionDecoder = this.f30412OooO00o;
        return (bitmapRegionDecoder == null || bitmapRegionDecoder.isRecycled()) ? false : true;
    }
}
