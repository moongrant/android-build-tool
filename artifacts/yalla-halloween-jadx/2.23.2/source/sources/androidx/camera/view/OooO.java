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
import com.google.common.util.concurrent.OooOO0O;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p022Oooo00O.o0O0o0;
import p037OoooOo0.o0000oo;
import p440o0OoOo0.o000000O;
import p440o0OoOo0.o00000O;
import p440o0OoOo0.o00oO0o;
import p639o0ooOO0.o000Oo0;

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
    public o000Oo0.OooO0o f4100OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public SurfaceRequest f4101OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public SurfaceTexture f4102OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicReference<o000Oo0.OooO00o<Void>> f4103OooOO0O;

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
    public final void OooO0o0(@NonNull final SurfaceRequest surfaceRequest, @Nullable o00oO0o o00oo0o2) {
        this.f4121OooO00o = surfaceRequest.f3503OooO0O0;
        this.f4104OooOO0o = o00oo0o2;
        FrameLayout frameLayout = this.f4122OooO0O0;
        frameLayout.getClass();
        this.f4121OooO00o.getClass();
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.f4099OooO0o0 = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f4121OooO00o.getWidth(), this.f4121OooO00o.getHeight()));
        this.f4099OooO0o0.setSurfaceTextureListener(new o00000O(this));
        frameLayout.removeAllViews();
        frameLayout.addView(this.f4099OooO0o0);
        SurfaceRequest surfaceRequest2 = this.f4101OooO0oo;
        if (surfaceRequest2 != null) {
            surfaceRequest2.OooO0Oo();
        }
        this.f4101OooO0oo = surfaceRequest;
        Executor executorOooO0OO = ContextCompat.OooO0OO(this.f4099OooO0o0.getContext());
        surfaceRequest.f3510OooOO0.OooO00o(new Runnable() { // from class: o0OoOo0.o000000
            @Override // java.lang.Runnable
            public final void run() {
                OooO oooO = this.f47178OooO0Oo;
                SurfaceRequest surfaceRequest3 = oooO.f4101OooO0oo;
                if (surfaceRequest3 != null && surfaceRequest3 == surfaceRequest) {
                    oooO.f4101OooO0oo = null;
                    oooO.f4100OooO0oO = null;
                }
                OooO0OO.OooO00o oooO00o = oooO.f4104OooOO0o;
                if (oooO00o != null) {
                    ((o00oO0o) oooO00o).OooO00o();
                    oooO.f4104OooOO0o = null;
                }
            }
        }, executorOooO0OO);
        OooO0oo();
    }

    @Override // androidx.camera.view.OooO0OO
    @NonNull
    public final OooOO0O<Void> OooO0oO() {
        return o000Oo0.OooO00o(new o0O0o0(this));
    }

    public final void OooO0oo() {
        SurfaceTexture surfaceTexture;
        Size size = this.f4121OooO00o;
        if (size == null || (surfaceTexture = this.f4098OooO0o) == null || this.f4101OooO0oo == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f4121OooO00o.getHeight());
        Surface surface = new Surface(this.f4098OooO0o);
        SurfaceRequest surfaceRequest = this.f4101OooO0oo;
        o000Oo0.OooO0o oooO0oOooO00o = o000Oo0.OooO00o(new o000000O(this, surface));
        this.f4100OooO0oO = oooO0oOooO00o;
        oooO0oOooO00o.f57741OooO0o0.OooO0oo(new o0000oo(1, this, surface, oooO0oOooO00o, surfaceRequest), ContextCompat.OooO0OO(this.f4099OooO0o0.getContext()));
        this.f4124OooO0Oo = true;
        OooO0o();
    }
}
