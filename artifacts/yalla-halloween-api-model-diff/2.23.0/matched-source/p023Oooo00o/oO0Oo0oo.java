package p023Oooo00o;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.VideoOutput;
import java.util.concurrent.ScheduledFuture;
import p028Oooo0oO.o00O0O0;
import p045Oooooo.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f992OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f993OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f994OooO0o0;

    public /* synthetic */ oO0Oo0oo(int i, Object obj, Object obj2) {
        this.f992OooO0Oo = i;
        this.f994OooO0o0 = obj;
        this.f993OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        ScheduledFuture<?> scheduledFuture;
        o0000Ooo o0000ooo;
        int i = this.f992OooO0Oo;
        Object obj = this.f993OooO0o;
        Object obj2 = this.f994OooO0o0;
        switch (i) {
            case 0:
                ((oO00000.OooO0OO) obj2).f924OooO00o.onActive((CameraCaptureSession) obj);
                break;
            default:
                OooOO0O oooOO0O = (OooOO0O) obj2;
                VideoOutput.SourceState sourceState = (VideoOutput.SourceState) obj;
                VideoOutput.SourceState sourceState2 = oooOO0O.f3970o000oOoO;
                oooOO0O.f3970o000oOoO = sourceState;
                if (sourceState2 == sourceState) {
                    o00O0O0.OooO00o("Recorder", "Video source transitions to the same state: " + sourceState);
                    break;
                } else {
                    o00O0O0.OooO00o("Recorder", "Video source has transitioned to state: " + sourceState);
                    if (sourceState != VideoOutput.SourceState.INACTIVE) {
                        if (sourceState == VideoOutput.SourceState.ACTIVE_NON_STREAMING && (scheduledFuture = oooOO0O.f3965OoooOOO) != null && scheduledFuture.cancel(false) && (o0000ooo = oooOO0O.f3945OooOoo) != null) {
                            OooOO0O.OooOOOo(o0000ooo);
                            break;
                        }
                    } else if (oooOO0O.f3943OooOoO0 != null) {
                        oooOO0O.f3966OoooOOo = true;
                        OooOO0O.OooOOO0 oooOOO0 = oooOO0O.f3930OooOOO;
                        if (oooOOO0 != null && !oooOOO0.OooOooO()) {
                            oooOO0O.OooOOo0(oooOO0O.f3930OooOOO, 4, null);
                            break;
                        }
                    } else {
                        oooOO0O.OooOOoo(false);
                        break;
                    }
                }
                break;
        }
    }
}
