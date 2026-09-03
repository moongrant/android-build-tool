package p023Oooo00o;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import androidx.media3.exoplayer.audio.OooO0O0;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import java.util.Iterator;
import p080o000OoO.o000OO00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO00O0o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f951OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f952OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f953OooO0o0;

    public /* synthetic */ oO00O0o0(int i, Object obj, Object obj2) {
        this.f951OooO0Oo = i;
        this.f953OooO0o0 = obj;
        this.f952OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f951OooO0Oo;
        Object obj = this.f952OooO0o;
        Object obj2 = this.f953OooO0o0;
        switch (i) {
            case 0:
                ((oO0O0OoO.OooO0O0) obj2).f972OooO00o.onDisconnected((CameraDevice) obj);
                break;
            case 1:
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) obj2;
                oooO00o.getClass();
                int i2 = o000OO00.f34965OooO00o;
                oooO00o.f7535OooO0O0.OooO0o0((Exception) obj);
                break;
            default:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f8344OooOO0;
                Surface surface = sphericalGLSurfaceView.f8345OooOO0O;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.f8344OooOO0 = surfaceTexture;
                sphericalGLSurfaceView.f8345OooOO0O = surface2;
                Iterator<SphericalGLSurfaceView.OooO0O0> it = sphericalGLSurfaceView.f8339OooO0Oo.iterator();
                while (it.hasNext()) {
                    it.next().OooOOO0(surface2);
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
