package o000O0O;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import p307o0O0oO0.OooOOO0;
import p310o0O0oOO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f34684OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34685OooO0o0;

    public /* synthetic */ OooOO0(int i, Object obj, Object obj2) {
        this.f34683OooO0Oo = i;
        this.f34685OooO0o0 = obj;
        this.f34684OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34683OooO0Oo;
        Object obj = this.f34684OooO0o;
        Object obj2 = this.f34685OooO0o0;
        switch (i) {
            case 0:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                SurfaceTexture surfaceTexture2 = sphericalGLSurfaceView.f6321OooOO0;
                Surface surface = sphericalGLSurfaceView.f6322OooOO0O;
                Surface surface2 = new Surface(surfaceTexture);
                sphericalGLSurfaceView.f6321OooOO0 = surfaceTexture;
                sphericalGLSurfaceView.f6322OooOO0O = surface2;
                Iterator<SphericalGLSurfaceView.OooO0O0> it = sphericalGLSurfaceView.f6316OooO0Oo.iterator();
                while (it.hasNext()) {
                    it.next().OooO0O0();
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                }
                break;
            case 1:
                Task.Companion.m4117delay$lambda1((ScheduledFuture) obj2, (TaskCompletionSource) obj);
                break;
            default:
                o0OoOo0 o0oooo0 = (o0OoOo0) obj2;
                OooOOO0 oooOOO0 = o0OoOo0.f42517OooO0oO;
                CpuMetricReading cpuMetricReadingOooO0O0 = o0oooo0.OooO0O0((Timer) obj);
                if (cpuMetricReadingOooO0O0 != null) {
                    o0oooo0.f42519OooO00o.add(cpuMetricReadingOooO0O0);
                }
                break;
        }
    }
}
