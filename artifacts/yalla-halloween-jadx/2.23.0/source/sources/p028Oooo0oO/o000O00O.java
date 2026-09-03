package p028Oooo0oO;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.OooO00o;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.impl.o000O0O0;
import java.util.concurrent.Executor;
import p031OoooO0.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O00O implements o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("mLock")
    public final ImageReader f1116OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f1117OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f1118OooO0OO = true;

    public o000O00O(ImageReader imageReader) {
        this.f1116OooO00o = imageReader;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final OooOOO0 OooO0O0() {
        Image imageAcquireLatestImage;
        synchronized (this.f1117OooO0O0) {
            try {
                imageAcquireLatestImage = this.f1116OooO00o.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new OooO00o(imageAcquireLatestImage);
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int OooO0OO() {
        int imageFormat;
        synchronized (this.f1117OooO0O0) {
            imageFormat = this.f1116OooO00o.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void OooO0Oo() {
        synchronized (this.f1117OooO0O0) {
            this.f1118OooO0OO = true;
            this.f1116OooO00o.setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void OooO0o(@NonNull final o000O0O0.OooO00o oooO00o, @NonNull final Executor executor) {
        synchronized (this.f1117OooO0O0) {
            this.f1118OooO0OO = false;
            this.f1116OooO00o.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: Oooo0oO.o000Oo0
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    o000O00O o000o00o2 = this.f1130OooO00o;
                    Executor executor2 = executor;
                    o000O0O0.OooO00o oooO00o2 = oooO00o;
                    synchronized (o000o00o2.f1117OooO0O0) {
                        if (!o000o00o2.f1118OooO0OO) {
                            executor2.execute(new o000O00(0, o000o00o2, oooO00o2));
                        }
                    }
                }
            }, o0ooOOo.OooO00o());
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int OooO0o0() {
        int maxImages;
        synchronized (this.f1117OooO0O0) {
            maxImages = this.f1116OooO00o.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final OooOOO0 OooO0oO() {
        Image imageAcquireNextImage;
        synchronized (this.f1117OooO0O0) {
            try {
                imageAcquireNextImage = this.f1116OooO00o.acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new OooO00o(imageAcquireNextImage);
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final void close() {
        synchronized (this.f1117OooO0O0) {
            this.f1116OooO00o.close();
        }
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int getHeight() {
        int height;
        synchronized (this.f1117OooO0O0) {
            height = this.f1116OooO00o.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    @Nullable
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f1117OooO0O0) {
            surface = this.f1116OooO00o.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.o000O0O0
    public final int getWidth() {
        int width;
        synchronized (this.f1117OooO0O0) {
            width = this.f1116OooO00o.getWidth();
        }
        return width;
    }
}
