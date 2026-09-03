package com.yalla.yalla.ui.view.crop.decoder;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
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
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.LongCompanionObject;
import p551o0oOOoOO.o0OO00OO;

/* JADX INFO: loaded from: classes5.dex */
public class SkiaPooledImageRegionDecoder implements o0OO00OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Bitmap.Config f30962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Context f30963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Uri f30965OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f30960OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ReentrantReadWriteLock f30961OooO0O0 = new ReentrantReadWriteLock(true);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f30964OooO0o = LongCompanionObject.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Point f30966OooO0oO = new Point(0, 0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicBoolean f30967OooO0oo = new AtomicBoolean(false);

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Semaphore f30968OooO00o = new Semaphore(0, true);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ConcurrentHashMap f30969OooO0O0 = new ConcurrentHashMap();

        public static boolean OooO00o(OooO00o oooO00o) {
            boolean zIsEmpty;
            synchronized (oooO00o) {
                zIsEmpty = oooO00o.f30969OooO0O0.isEmpty();
            }
            return zIsEmpty;
        }

        public static void OooO0O0(OooO00o oooO00o) {
            synchronized (oooO00o) {
                while (!oooO00o.f30969OooO0O0.isEmpty()) {
                    BitmapRegionDecoder bitmapRegionDecoderOooO0Oo = oooO00o.OooO0Oo();
                    bitmapRegionDecoderOooO0Oo.recycle();
                    oooO00o.f30969OooO0O0.remove(bitmapRegionDecoderOooO0Oo);
                }
            }
        }

        public static void OooO0OO(OooO00o oooO00o, BitmapRegionDecoder bitmapRegionDecoder) {
            boolean z;
            synchronized (oooO00o) {
                Iterator it = oooO00o.f30969OooO0O0.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (bitmapRegionDecoder == entry.getKey()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                entry.setValue(Boolean.FALSE);
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    break;
                }
            }
            if (z) {
                oooO00o.f30968OooO00o.release();
            }
        }

        public final BitmapRegionDecoder OooO0Oo() {
            this.f30968OooO00o.acquireUninterruptibly();
            synchronized (this) {
                for (Map.Entry entry : this.f30969OooO0O0.entrySet()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        entry.setValue(Boolean.TRUE);
                        return (BitmapRegionDecoder) entry.getKey();
                    }
                }
                return null;
            }
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (preferredBitmapConfig != null) {
            this.f30962OooO0OO = preferredBitmapConfig;
        } else {
            this.f30962OooO0OO = Bitmap.Config.RGB_565;
        }
    }

    @Keep
    public static void setDebug(boolean z) {
    }

    @Override // p551o0oOOoOO.o0OO00OO
    public final synchronized void OooO00o() {
        this.f30961OooO0O0.writeLock().lock();
        try {
            OooO00o oooO00o = this.f30960OooO00o;
            if (oooO00o != null) {
                OooO00o.OooO0O0(oooO00o);
                this.f30960OooO00o = null;
                this.f30963OooO0Oo = null;
                this.f30965OooO0o0 = null;
            }
            this.f30961OooO0O0.writeLock().unlock();
        } catch (Throwable th) {
            this.f30961OooO0O0.writeLock().unlock();
            throw th;
        }
    }

    @Override // p551o0oOOoOO.o0OO00OO
    public final synchronized boolean OooO0O0() {
        OooO00o oooO00o;
        oooO00o = this.f30960OooO00o;
        return (oooO00o == null || OooO00o.OooO00o(oooO00o)) ? false : true;
    }

    @Override // p551o0oOOoOO.o0OO00OO
    @NonNull
    public final Point OooO0OO(Context context, @NonNull Uri uri) throws Exception {
        this.f30963OooO0Oo = context;
        this.f30965OooO0o0 = uri;
        OooO0o0();
        return this.f30966OooO0oO;
    }

    @Override // p551o0oOOoOO.o0OO00OO
    @NonNull
    public final Bitmap OooO0Oo(int i, @NonNull Rect rect) {
        Objects.toString(rect);
        Thread.currentThread().getName();
        int iWidth = rect.width();
        Point point = this.f30966OooO0oO;
        if ((iWidth < point.x || rect.height() < point.y) && this.f30967OooO0oo.compareAndSet(false, true) && this.f30964OooO0o < LongCompanionObject.MAX_VALUE) {
            new com.yalla.yalla.ui.view.crop.decoder.OooO00o(this).start();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.f30961OooO0O0;
        reentrantReadWriteLock.readLock().lock();
        try {
            OooO00o oooO00o = this.f30960OooO00o;
            if (oooO00o != null) {
                BitmapRegionDecoder bitmapRegionDecoderOooO0Oo = oooO00o.OooO0Oo();
                if (bitmapRegionDecoderOooO0Oo != null) {
                    try {
                        if (!bitmapRegionDecoderOooO0Oo.isRecycled()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = i;
                            options.inPreferredConfig = this.f30962OooO0OO;
                            Bitmap bitmapDecodeRegion = bitmapRegionDecoderOooO0Oo.decodeRegion(rect, options);
                            if (bitmapDecodeRegion == null) {
                                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                            }
                            OooO00o.OooO0OO(this.f30960OooO00o, bitmapRegionDecoderOooO0Oo);
                            reentrantReadWriteLock.readLock().unlock();
                            return bitmapDecodeRegion;
                        }
                    } catch (Throwable th) {
                        OooO00o.OooO0OO(this.f30960OooO00o, bitmapRegionDecoderOooO0Oo);
                        throw th;
                    }
                }
                if (bitmapRegionDecoderOooO0Oo != null) {
                    OooO00o.OooO0OO(this.f30960OooO00o, bitmapRegionDecoderOooO0Oo);
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } catch (Throwable th2) {
            reentrantReadWriteLock.readLock().unlock();
            throw th2;
        }
    }

    public final void OooO0o0() throws Exception {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int identifier;
        String string = this.f30965OooO0o0.toString();
        boolean zStartsWith = string.startsWith("android.resource://");
        long length = LongCompanionObject.MAX_VALUE;
        if (zStartsWith) {
            String authority = this.f30965OooO0o0.getAuthority();
            Resources resources = this.f30963OooO0Oo.getPackageName().equals(authority) ? this.f30963OooO0Oo.getResources() : this.f30963OooO0Oo.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = this.f30965OooO0o0.getPathSegments();
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
            try {
                length = this.f30963OooO0Oo.getResources().openRawResourceFd(identifier).getLength();
            } catch (Exception unused2) {
            }
            bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(this.f30963OooO0Oo.getResources().openRawResource(identifier), false);
        } else if (string.startsWith("file:///android_asset/")) {
            String strSubstring = string.substring(22);
            try {
                length = this.f30963OooO0Oo.getAssets().openFd(strSubstring).getLength();
            } catch (Exception unused3) {
            }
            bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(this.f30963OooO0Oo.getAssets().open(strSubstring, 1), false);
        } else if (string.startsWith("file://")) {
            BitmapRegionDecoder bitmapRegionDecoderNewInstance2 = BitmapRegionDecoder.newInstance(string.substring(7), false);
            try {
                File file = new File(string);
                if (file.exists()) {
                    length = file.length();
                }
            } catch (Exception unused4) {
            }
            bitmapRegionDecoderNewInstance = bitmapRegionDecoderNewInstance2;
        } else {
            InputStream inputStreamOpenInputStream = null;
            try {
                ContentResolver contentResolver = this.f30963OooO0Oo.getContentResolver();
                inputStreamOpenInputStream = contentResolver.openInputStream(this.f30965OooO0o0);
                BitmapRegionDecoder bitmapRegionDecoderNewInstance3 = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f30965OooO0o0, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                    }
                } catch (Exception unused5) {
                }
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception unused6) {
                    }
                }
                bitmapRegionDecoderNewInstance = bitmapRegionDecoderNewInstance3;
            } catch (Throwable th) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Exception unused7) {
                    }
                }
                throw th;
            }
        }
        this.f30964OooO0o = length;
        this.f30966OooO0oO.set(bitmapRegionDecoderNewInstance.getWidth(), bitmapRegionDecoderNewInstance.getHeight());
        this.f30961OooO0O0.writeLock().lock();
        try {
            OooO00o oooO00o = this.f30960OooO00o;
            if (oooO00o != null) {
                synchronized (oooO00o) {
                    oooO00o.f30969OooO0O0.put(bitmapRegionDecoderNewInstance, Boolean.FALSE);
                    oooO00o.f30968OooO00o.release();
                }
            }
            this.f30961OooO0O0.writeLock().unlock();
        } catch (Throwable th2) {
            this.f30961OooO0O0.writeLock().unlock();
            throw th2;
        }
    }
}
