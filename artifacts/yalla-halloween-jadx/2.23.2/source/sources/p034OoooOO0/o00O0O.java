package p034OoooOO0;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.OooOOOO;
import androidx.camera.core.SurfaceRequest;
import o000OO.OooO00o;
import p033OoooO0O.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O implements OooOOOO.OooO0OO {
    @Override // androidx.camera.core.OooOOOO.OooO0OO
    public final void OooO00o(SurfaceRequest surfaceRequest) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.f3503OooO0O0.getWidth(), surfaceRequest.f3503OooO0O0.getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        surfaceRequest.OooO0O0(surface, o00oO0o.OooO00o(), new OooO00o() { // from class: OoooOO0.o00Oo0
            @Override // o000OO.OooO00o
            public final void accept(Object obj) {
                surface.release();
                surfaceTexture.release();
            }
        });
    }
}
