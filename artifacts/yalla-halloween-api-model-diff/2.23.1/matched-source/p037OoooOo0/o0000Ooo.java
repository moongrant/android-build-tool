package p037OoooOo0;

import android.app.job.JobParameters;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import o000OO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1518OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1519OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1520OooO0o0;

    public /* synthetic */ o0000Ooo(int i, Object obj, Object obj2) {
        this.f1518OooO0Oo = i;
        this.f1520OooO0o0 = obj;
        this.f1519OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1518OooO0Oo;
        Object obj = this.f1519OooO0o;
        Object obj2 = this.f1520OooO0o0;
        switch (i) {
            case 0:
                final o000 o000Var = (o000) obj2;
                SurfaceRequest surfaceRequest = (SurfaceRequest) obj;
                o000Var.f1481OooOO0o++;
                o000Oo0 o000oo1 = o000Var.f1474OooO0Oo;
                o000oo1.OooO0Oo(true);
                o000oo1.OooO0OO();
                final SurfaceTexture surfaceTexture = new SurfaceTexture(o000oo1.f1554OooO);
                surfaceTexture.setDefaultBufferSize(surfaceRequest.f3506OooO0O0.getWidth(), surfaceRequest.f3506OooO0O0.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                surfaceRequest.OooO0O0(surface, o000Var.f1475OooO0o, new OooO00o() { // from class: OoooOo0.o0000O
                    @Override // o000OO.OooO00o
                    public final void accept(Object obj3) {
                        o000 o000Var2 = o000Var;
                        o000Var2.getClass();
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface.release();
                        o000Var2.f1481OooOO0o--;
                        o000Var2.OooO0oo();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(o000Var, o000Var.f1477OooO0oO);
                break;
            default:
                int i2 = JobInfoSchedulerService.f13932OooO0Oo;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                break;
        }
    }
}
