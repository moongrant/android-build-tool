package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.OooO;
import androidx.camera.view.OooO0OO;
import androidx.core.content.ContextCompat;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o000OO.OooO00o;
import p022Oooo00O.o0000oo;
import p028Oooo0oO.o00O0O0;
import p033OoooO0O.o00oO0o;
import p033OoooO0O.o0ooOOo;
import p437o0OoOo0.o000OOo;
import p437o0OoOo0.o000oOoO;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooO extends OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f4097OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public SurfaceTexture f4098OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public TextureView f4099OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00O000.OooO0o f4100OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public SurfaceRequest f4101OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public SurfaceTexture f4102OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicReference<o00O000.OooO00o<Void>> f4103OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO.OooO00o f4104OooOO0o;

    public OooO(@NonNull PreviewView previewView, @NonNull OooO0O0 oooO0O0) {
        super(previewView, oooO0O0);
        this.f4097OooO = false;
        this.f4103OooOO0O = new AtomicReference<>();
    }

    @Override // androidx.camera.view.OooO0OO
    @Nullable
    public final View OooO00o() {
        return this.f4099OooO0o0;
    }

    @Override // androidx.camera.view.OooO0OO
    @Nullable
    public final Bitmap OooO0O0() {
        TextureView textureView = this.f4099OooO0o0;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f4099OooO0o0.getBitmap();
    }

    @Override // androidx.camera.view.OooO0OO
    public final void OooO0OO() {
        if (!this.f4097OooO || this.f4102OooOO0 == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.f4099OooO0o0.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.f4102OooOO0;
        if (surfaceTexture != surfaceTexture2) {
            this.f4099OooO0o0.setSurfaceTexture(surfaceTexture2);
            this.f4102OooOO0 = null;
            this.f4097OooO = false;
        }
    }

    @Override // androidx.camera.view.OooO0OO
    public final void OooO0Oo() {
        this.f4097OooO = true;
    }

    @Override // androidx.camera.view.OooO0OO
    public final void OooO0o0(@NonNull SurfaceRequest surfaceRequest, @Nullable o000oOoO o000oooo2) {
        this.f4121OooO00o = surfaceRequest.f3505OooO0O0;
        this.f4104OooOO0o = o000oooo2;
        FrameLayout frameLayout = this.f4122OooO0O0;
        frameLayout.getClass();
        this.f4121OooO00o.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f4099OooO0o0 = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f4121OooO00o.getWidth(), this.f4121OooO00o.getHeight()));
        this.f4099OooO0o0.setSurfaceTextureListener(new o000OOo(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f4099OooO0o0);
        SurfaceRequest surfaceRequest2 = this.f4101OooO0oo;
        if (surfaceRequest2 != null) {
            surfaceRequest2.OooO0Oo();
        }
        this.f4101OooO0oo = surfaceRequest;
        Executor executorOooO0OO = ContextCompat.OooO0OO(this.f4099OooO0o0.getContext());
        surfaceRequest.f3512OooOO0.OooO00o(new o0000oo(1, this, surfaceRequest), executorOooO0OO);
        OooO0oo();
    }

    @Override // androidx.camera.view.OooO0OO
    @NonNull
    public final com.google.common.util.concurrent.OooO00o<Void> OooO0oO() {
        return o00O000.OooO00o(new o00O000.OooO0OO() { // from class: o0OoOo0.o0OO00O
            @Override // o0ooOO0.o00O000.OooO0OO
            public final Object OooO0o0(o00O000.OooO00o oooO00o) {
                this.f46081OooO0Oo.f4103OooOO0O.set(oooO00o);
                return "textureViewImpl_waitForNextFrame";
            }
        });
    }

    public final void OooO0oo() {
        SurfaceTexture surfaceTexture;
        Size size = this.f4121OooO00o;
        if (size == null || (surfaceTexture = this.f4098OooO0o) == null || this.f4101OooO0oo == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f4121OooO00o.getHeight());
        final Surface surface = new Surface(this.f4098OooO0o);
        final SurfaceRequest surfaceRequest = this.f4101OooO0oo;
        final o00O000.OooO0o oooO0oOooO00o = o00O000.OooO00o(new o00O000.OooO0OO() { // from class: o0OoOo0.o0OOO0o
            @Override // o0ooOO0.o00O000.OooO0OO
            public final Object OooO0o0(final o00O000.OooO00o oooO00o) {
                OooO oooO = this.f46082OooO0Oo;
                oooO.getClass();
                o00O0O0.OooO00o("TextureViewImpl", "Surface set on Preview.");
                SurfaceRequest surfaceRequest2 = oooO.f4101OooO0oo;
                o0ooOOo o0oooooOooO00o = o00oO0o.OooO00o();
                OooO00o<SurfaceRequest.Result> oooO00o2 = new OooO00o() { // from class: o0OoOo0.oo0o0Oo
                    @Override // o000OO.OooO00o
                    public final void accept(Object obj) {
                        oooO00o.OooO0O0((SurfaceRequest.Result) obj);
                    }
                };
                Surface surface2 = surface;
                surfaceRequest2.OooO0O0(surface2, o0oooooOooO00o, oooO00o2);
                return "provideSurface[request=" + oooO.f4101OooO0oo + " surface=" + surface2 + "]";
            }
        });
        this.f4100OooO0oO = oooO0oOooO00o;
        oooO0oOooO00o.f57402OooO0o0.OooO(new Runnable() { // from class: o0OoOo0.o0Oo0oo
            @Override // java.lang.Runnable
            public final void run() {
                OooO oooO = this.f46084OooO0Oo;
                oooO.getClass();
                o00O0O0.OooO00o("TextureViewImpl", "Safe to release surface.");
                OooO0OO.OooO00o oooO00o = oooO.f4104OooOO0o;
                if (oooO00o != null) {
                    ((o000oOoO) oooO00o).OooO00o();
                    oooO.f4104OooOO0o = null;
                }
                surface.release();
                if (oooO.f4100OooO0oO == oooO0oOooO00o) {
                    oooO.f4100OooO0oO = null;
                }
                if (oooO.f4101OooO0oo == surfaceRequest) {
                    oooO.f4101OooO0oo = null;
                }
            }
        }, ContextCompat.OooO0OO(this.f4099OooO0o0.getContext()));
        this.f4124OooO0Oo = true;
        OooO0o();
    }
}
