package p028Oooo0oO;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.OooOo00;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1137OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1138OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1139OooO0o0;

    public /* synthetic */ o00O00(int i, Object obj, Object obj2) {
        this.f1137OooO0Oo = i;
        this.f1139OooO0o0 = obj;
        this.f1138OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1137OooO0Oo;
        Object obj = this.f1138OooO0o;
        Object obj2 = this.f1139OooO0o0;
        switch (i) {
            case 0:
                OooOo00 oooOo00 = (OooOo00) obj;
                ((OooOo00) obj2).OooO00o();
                if (oooOo00 != null) {
                    oooOo00.OooO00o();
                }
                break;
            default:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f14394OooOO0;
                Surface surface = sphericalGLSurfaceView.f14395OooOO0O;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.f14394OooOO0 = surfaceTexture;
                sphericalGLSurfaceView.f14395OooOO0O = surface2;
                Iterator<SphericalGLSurfaceView.OooO0O0> it = sphericalGLSurfaceView.f14389OooO0Oo.iterator();
                while (it.hasNext()) {
                    it.next().OooOO0O(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                }
                break;
        }
    }
}
