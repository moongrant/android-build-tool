package p440o0OoOo0;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.OooO;
import androidx.core.content.ContextCompat;
import p028Oooo0oO.o00O0O0;
import p030OoooO.OooOOO0;
import p030OoooO.OooOo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00000O implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO f47182OooO0Oo;

    public class OooO00o implements OooOOO0<SurfaceRequest.Result> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f47183OooO00o;

        public OooO00o(SurfaceTexture surfaceTexture) {
            this.f47183OooO00o = surfaceTexture;
        }

        @Override // p030OoooO.OooOOO0
        public final void OooO00o(@NonNull Throwable th) {
            throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }

        @Override // p030OoooO.OooOOO0
        public final void onSuccess(SurfaceRequest.Result result) {
            o000OO.OooOOO0.OooO0o("Unexpected result from SurfaceRequest. Surface was provided twice.", result.OooO00o() != 3);
            o00O0O0.OooO00o("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
            this.f47183OooO00o.release();
            OooO oooO = o00000O.this.f47182OooO0Oo;
            if (oooO.f4102OooOO0 != null) {
                oooO.f4102OooOO0 = null;
            }
        }
    }

    public o00000O(OooO oooO) {
        this.f47182OooO0Oo = oooO;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
        o00O0O0.OooO00o("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
        OooO oooO = this.f47182OooO0Oo;
        oooO.f4098OooO0o = surfaceTexture;
        if (oooO.f4100OooO0oO == null) {
            oooO.OooO0oo();
            return;
        }
        oooO.f4101OooO0oo.getClass();
        o00O0O0.OooO00o("TextureViewImpl", "Surface invalidated " + oooO.f4101OooO0oo);
        oooO.f4101OooO0oo.f3511OooOO0O.OooO00o();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
        OooO oooO = this.f47182OooO0Oo;
        oooO.f4098OooO0o = null;
        o000Oo0.OooO0o oooO0o = oooO.f4100OooO0oO;
        if (oooO0o == null) {
            o00O0O0.OooO00o("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        OooO00o oooO00o = new OooO00o(surfaceTexture);
        oooO0o.OooO0oo(new OooOo.OooO0O0(oooO0o, oooO00o), ContextCompat.OooO0OO(oooO.f4099OooO0o0.getContext()));
        oooO.f4102OooOO0 = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
        o00O0O0.OooO00o("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        o000Oo0.OooO00o<Void> andSet = this.f47182OooO0Oo.f4103OooOO0O.getAndSet(null);
        if (andSet != null) {
            andSet.OooO0O0(null);
        }
    }
}
