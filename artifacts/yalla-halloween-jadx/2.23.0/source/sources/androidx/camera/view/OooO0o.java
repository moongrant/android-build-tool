package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.OooO0OO;
import androidx.camera.view.OooO0o;
import androidx.core.content.ContextCompat;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOo00;
import p437o0OoOo0.o000oOoO;
import p437o0OoOo0.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO0o extends OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f4125OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public SurfaceView f4126OooO0o0;

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(@NonNull SurfaceView surfaceView, @NonNull Bitmap bitmap, @NonNull PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, @NonNull Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    @RequiresApi(21)
    public class OooO0O0 implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Size f4128OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public SurfaceRequest f4129OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public SurfaceRequest f4130OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public OooO0OO.OooO00o f4131OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public Size f4132OooO0oo;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f4127OooO = false;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f4133OooOO0 = false;

        public OooO0O0() {
        }

        @UiThread
        public final void OooO00o() {
            if (this.f4130OooO0o0 != null) {
                o00O0O0.OooO00o("SurfaceViewImpl", "Request canceled: " + this.f4130OooO0o0);
                this.f4130OooO0o0.OooO0Oo();
            }
        }

        @UiThread
        public final boolean OooO0O0() {
            OooO0o oooO0o = OooO0o.this;
            Surface surface = oooO0o.f4126OooO0o0.getHolder().getSurface();
            if (!((this.f4127OooO || this.f4130OooO0o0 == null || !Objects.equals(this.f4128OooO0Oo, this.f4132OooO0oo)) ? false : true)) {
                return false;
            }
            o00O0O0.OooO00o("SurfaceViewImpl", "Surface set on Preview.");
            final OooO0OO.OooO00o oooO00o = this.f4131OooO0oO;
            SurfaceRequest surfaceRequest = this.f4130OooO0o0;
            Objects.requireNonNull(surfaceRequest);
            surfaceRequest.OooO0O0(surface, ContextCompat.OooO0OO(oooO0o.f4126OooO0o0.getContext()), new o000OO.OooO00o() { // from class: o0OoOo0.o0ooOOo
                @Override // o000OO.OooO00o
                public final void accept(Object obj) {
                    o00O0O0.OooO00o("SurfaceViewImpl", "Safe to release surface.");
                    OooO0OO.OooO00o oooO00o2 = oooO00o;
                    if (oooO00o2 != null) {
                        ((o000oOoO) oooO00o2).OooO00o();
                    }
                }
            });
            this.f4127OooO = true;
            oooO0o.f4124OooO0Oo = true;
            oooO0o.OooO0o();
            return true;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            o00O0O0.OooO00o("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.f4132OooO0oo = new Size(i2, i3);
            OooO0O0();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            SurfaceRequest surfaceRequest;
            o00O0O0.OooO00o("SurfaceViewImpl", "Surface created.");
            if (!this.f4133OooOO0 || (surfaceRequest = this.f4129OooO0o) == null) {
                return;
            }
            surfaceRequest.OooO0Oo();
            surfaceRequest.f3503OooO.OooO0O0(null);
            this.f4129OooO0o = null;
            this.f4133OooOO0 = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            o00O0O0.OooO00o("SurfaceViewImpl", "Surface destroyed.");
            if (!this.f4127OooO) {
                OooO00o();
            } else if (this.f4130OooO0o0 != null) {
                o00O0O0.OooO00o("SurfaceViewImpl", "Surface closed " + this.f4130OooO0o0);
                this.f4130OooO0o0.f3513OooOO0O.OooO00o();
            }
            this.f4133OooOO0 = true;
            SurfaceRequest surfaceRequest = this.f4130OooO0o0;
            if (surfaceRequest != null) {
                this.f4129OooO0o = surfaceRequest;
            }
            this.f4127OooO = false;
            this.f4130OooO0o0 = null;
            this.f4131OooO0oO = null;
            this.f4132OooO0oo = null;
            this.f4128OooO0Oo = null;
        }
    }

    public OooO0o(@NonNull PreviewView previewView, @NonNull androidx.camera.view.OooO0O0 oooO0O0) {
        super(previewView, oooO0O0);
        this.f4125OooO0o = new OooO0O0();
    }

    @Override // androidx.camera.view.OooO0OO
    @Nullable
    public final View OooO00o() {
        return this.f4126OooO0o0;
    }

    @Override // androidx.camera.view.OooO0OO
    @Nullable
    @RequiresApi(24)
    public final Bitmap OooO0O0() {
        SurfaceView surfaceView = this.f4126OooO0o0;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f4126OooO0o0.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f4126OooO0o0.getWidth(), this.f4126OooO0o0.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.f4126OooO0o0;
        OooO00o.OooO00o(surfaceView2, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: o0OoOo0.oo000o
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                Semaphore semaphore2 = semaphore;
                if (i == 0) {
                    o00O0O0.OooO00o("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    o00O0O0.OooO0O0("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore2.release();
            }
        }, surfaceView2.getHandler());
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                o00O0O0.OooO0O0("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
        } catch (InterruptedException e) {
            o00O0O0.OooO0OO("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
        }
        return bitmapCreateBitmap;
    }

    @Override // androidx.camera.view.OooO0OO
    public final void OooO0OO() {
    }

    @Override // androidx.camera.view.OooO0OO
    public final void OooO0Oo() {
    }

    @Override // androidx.camera.view.OooO0OO
    public final void OooO0o0(@NonNull final SurfaceRequest surfaceRequest, @Nullable final o000oOoO o000oooo2) {
        if (!(this.f4126OooO0o0 != null && Objects.equals(this.f4121OooO00o, surfaceRequest.f3505OooO0O0))) {
            this.f4121OooO00o = surfaceRequest.f3505OooO0O0;
            FrameLayout frameLayout = this.f4122OooO0O0;
            frameLayout.getClass();
            this.f4121OooO00o.getClass();
            SurfaceView surfaceView = new SurfaceView(frameLayout.getContext());
            this.f4126OooO0o0 = surfaceView;
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f4121OooO00o.getWidth(), this.f4121OooO00o.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.f4126OooO0o0);
            this.f4126OooO0o0.getHolder().addCallback(this.f4125OooO0o);
        }
        surfaceRequest.f3512OooOO0.OooO00o(new o00Oo0(o000oooo2, 0), ContextCompat.OooO0OO(this.f4126OooO0o0.getContext()));
        this.f4126OooO0o0.post(new Runnable() { // from class: o0OoOo0.o00Ooo
            @Override // java.lang.Runnable
            public final void run() {
                OooO0o.OooO0O0 oooO0O0 = this.f46076OooO0Oo.f4125OooO0o;
                oooO0O0.OooO00o();
                boolean z = oooO0O0.f4133OooOO0;
                SurfaceRequest surfaceRequest2 = surfaceRequest;
                if (z) {
                    oooO0O0.f4133OooOO0 = false;
                    surfaceRequest2.OooO0Oo();
                    surfaceRequest2.f3503OooO.OooO0O0(null);
                    return;
                }
                oooO0O0.f4130OooO0o0 = surfaceRequest2;
                oooO0O0.f4131OooO0oO = o000oooo2;
                Size size = surfaceRequest2.f3505OooO0O0;
                oooO0O0.f4128OooO0Oo = size;
                oooO0O0.f4127OooO = false;
                if (oooO0O0.OooO0O0()) {
                    return;
                }
                o00O0O0.OooO00o("SurfaceViewImpl", "Wait for new Surface creation.");
                OooO0o.this.f4126OooO0o0.getHolder().setFixedSize(size.getWidth(), size.getHeight());
            }
        });
    }

    @Override // androidx.camera.view.OooO0OO
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<Void> OooO0oO() {
        return OooOo00.OooO0Oo(null);
    }
}
