package o000O0O;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34686OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View f34687OooO0o0;

    public /* synthetic */ OooOO0O(int i, View view) {
        this.f34686OooO0Oo = i;
        this.f34687OooO0o0 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34686OooO0Oo;
        View view = this.f34687OooO0o0;
        switch (i) {
            case 0:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) view;
                Surface surface = sphericalGLSurfaceView.f6322OooOO0O;
                if (surface != null) {
                    Iterator<SphericalGLSurfaceView.OooO0O0> it = sphericalGLSurfaceView.f6316OooO0Oo.iterator();
                    while (it.hasNext()) {
                        it.next().OooO00o();
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.f6321OooOO0;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.f6321OooOO0 = null;
                sphericalGLSurfaceView.f6322OooOO0O = null;
                break;
            default:
                int i2 = DefaultTimeBar.f13755OoooO0O;
                ((DefaultTimeBar) view).OooO0o(false);
                break;
        }
    }
}
