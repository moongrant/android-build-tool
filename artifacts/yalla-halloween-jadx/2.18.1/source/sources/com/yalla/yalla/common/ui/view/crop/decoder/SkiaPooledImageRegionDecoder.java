package com.yalla.yalla.common.ui.view.crop.decoder;

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
import com.yalla.yalla.common.ui.view.crop.SubsamplingScaleImageView;
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
import p511o0o00ooO.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public class SkiaPooledImageRegionDecoder implements o00O00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Bitmap.Config f21195OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Context f21196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Uri f21198OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f21193OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ReentrantReadWriteLock f21194OooO0O0 = new ReentrantReadWriteLock(true);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f21197OooO0o = Long.MAX_VALUE;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Point f21199OooO0oO = new Point(0, 0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicBoolean f21200OooO0oo = new AtomicBoolean(false);

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Semaphore f21201OooO00o = new Semaphore(0, true);

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Map<BitmapRegionDecoder, Boolean> f21202OooO0O0 = new ConcurrentHashMap();

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
        public static void OooO00o(OooO00o oooO00o, BitmapRegionDecoder bitmapRegionDecoder) {
            boolean z;
            synchronized (oooO00o) {
                Iterator it = oooO00o.f21202OooO0O0.entrySet().iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (bitmapRegionDecoder == entry.getKey()) {
                        if (!((Boolean) entry.getValue()).booleanValue()) {
                            break;
                        }
                        entry.setValue(Boolean.FALSE);
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                oooO00o.f21201OooO00o.release();
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
        public final BitmapRegionDecoder OooO0O0() {
            BitmapRegionDecoder bitmapRegionDecoder;
            this.f21201OooO00o.acquireUninterruptibly();
            synchronized (this) {
                for (Map.Entry entry : this.f21202OooO0O0.entrySet()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        entry.setValue(Boolean.TRUE);
                        bitmapRegionDecoder = (BitmapRegionDecoder) entry.getKey();
                    }
                }
                bitmapRegionDecoder = null;
            }
            return bitmapRegionDecoder;
        }
    }

    @Keep
    public SkiaPooledImageRegionDecoder() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (preferredBitmapConfig != null) {
            this.f21195OooO0OO = preferredBitmapConfig;
        } else {
            this.f21195OooO0OO = Bitmap.Config.RGB_565;
        }
    }

    @Keep
    public static void setDebug(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    @Override // p511o0o00ooO.o00O00
    public final synchronized void OooO00o() {
        this.f21194OooO0O0.writeLock().lock();
        try {
            OooO00o oooO00o = this.f21193OooO00o;
            if (oooO00o != null) {
                synchronized (oooO00o) {
                    while (!oooO00o.f21202OooO0O0.isEmpty()) {
                        BitmapRegionDecoder bitmapRegionDecoderOooO0O0 = oooO00o.OooO0O0();
                        bitmapRegionDecoderOooO0O0.recycle();
                        oooO00o.f21202OooO0O0.remove(bitmapRegionDecoderOooO0O0);
                    }
                }
                this.f21193OooO00o = null;
                this.f21196OooO0Oo = null;
                this.f21198OooO0o0 = null;
            }
            this.f21194OooO0O0.writeLock().unlock();
        } catch (Throwable th) {
            this.f21194OooO0O0.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0014  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    @Override // p511o0o00ooO.o00O00
    public final synchronized boolean OooO0O0() {
        boolean z;
        boolean zIsEmpty;
        OooO00o oooO00o = this.f21193OooO00o;
        if (oooO00o != null) {
            synchronized (oooO00o) {
                zIsEmpty = oooO00o.f21202OooO0O0.isEmpty();
            }
            if (zIsEmpty) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        return z;
    }

    @Override // p511o0o00ooO.o00O00
    @NonNull
    public final Point OooO0OO(Context context, @NonNull Uri uri) throws Exception {
        this.f21196OooO0Oo = context;
        this.f21198OooO0o0 = uri;
        OooO0o0();
        return this.f21199OooO0oO;
    }

    @Override // p511o0o00ooO.o00O00
    @NonNull
    public final Bitmap OooO0Oo(@NonNull Rect rect, int i) {
        Objects.toString(rect);
        Thread.currentThread().getName();
        if ((rect.width() < this.f21199OooO0oO.x || rect.height() < this.f21199OooO0oO.y) && this.f21200OooO0oo.compareAndSet(false, true) && this.f21197OooO0o < Long.MAX_VALUE) {
            new com.yalla.yalla.common.ui.view.crop.decoder.OooO00o(this).start();
        }
        this.f21194OooO0O0.readLock().lock();
        try {
            OooO00o oooO00o = this.f21193OooO00o;
            if (oooO00o != null) {
                BitmapRegionDecoder bitmapRegionDecoderOooO0O0 = oooO00o.OooO0O0();
                if (bitmapRegionDecoderOooO0O0 != null) {
                    try {
                        if (!bitmapRegionDecoderOooO0O0.isRecycled()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = i;
                            options.inPreferredConfig = this.f21195OooO0OO;
                            Bitmap bitmapDecodeRegion = bitmapRegionDecoderOooO0O0.decodeRegion(rect, options);
                            if (bitmapDecodeRegion == null) {
                                throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                            }
                            OooO00o.OooO00o(this.f21193OooO00o, bitmapRegionDecoderOooO0O0);
                            this.f21194OooO0O0.readLock().unlock();
                            return bitmapDecodeRegion;
                        }
                    } catch (Throwable th) {
                        OooO00o.OooO00o(this.f21193OooO00o, bitmapRegionDecoderOooO0O0);
                        throw th;
                    }
                }
                if (bitmapRegionDecoderOooO0O0 != null) {
                    OooO00o.OooO00o(this.f21193OooO00o, bitmapRegionDecoderOooO0O0);
                }
            }
            throw new IllegalStateException("Cannot decode region after decoder has been recycled");
        } catch (Throwable th2) {
            this.f21194OooO0O0.readLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map<android.graphics.BitmapRegionDecoder, java.lang.Boolean>, java.util.concurrent.ConcurrentHashMap] */
    public final void OooO0o0() throws Exception {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int identifier;
        String string = this.f21198OooO0o0.toString();
        long length = Long.MAX_VALUE;
        if (string.startsWith("android.resource://")) {
            String authority = this.f21198OooO0o0.getAuthority();
            Resources resources = this.f21196OooO0Oo.getPackageName().equals(authority) ? this.f21196OooO0Oo.getResources() : this.f21196OooO0Oo.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = this.f21198OooO0o0.getPathSegments();
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
                length = this.f21196OooO0Oo.getResources().openRawResourceFd(identifier).getLength();
            } catch (Exception unused2) {
            }
            bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(this.f21196OooO0Oo.getResources().openRawResource(identifier), false);
        } else if (string.startsWith("file:///android_asset/")) {
            String strSubstring = string.substring(22);
            try {
                length = this.f21196OooO0Oo.getAssets().openFd(strSubstring).getLength();
            } catch (Exception unused3) {
            }
            bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(this.f21196OooO0Oo.getAssets().open(strSubstring, 1), false);
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
                ContentResolver contentResolver = this.f21196OooO0Oo.getContentResolver();
                inputStreamOpenInputStream = contentResolver.openInputStream(this.f21198OooO0o0);
                BitmapRegionDecoder bitmapRegionDecoderNewInstance3 = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f21198OooO0o0, "r");
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
        this.f21197OooO0o = length;
        this.f21199OooO0oO.set(bitmapRegionDecoderNewInstance.getWidth(), bitmapRegionDecoderNewInstance.getHeight());
        this.f21194OooO0O0.writeLock().lock();
        try {
            OooO00o oooO00o = this.f21193OooO00o;
            if (oooO00o != null) {
                synchronized (oooO00o) {
                    oooO00o.f21202OooO0O0.put(bitmapRegionDecoderNewInstance, Boolean.FALSE);
                    oooO00o.f21201OooO00o.release();
                }
            }
            this.f21194OooO0O0.writeLock().unlock();
        } catch (Throwable th2) {
            this.f21194OooO0O0.writeLock().unlock();
            throw th2;
        }
    }
}
