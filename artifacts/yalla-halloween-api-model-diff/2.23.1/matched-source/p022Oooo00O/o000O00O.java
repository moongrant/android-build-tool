package p022Oooo00O;

import Oooo000.OooO00o;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O00OO;
import androidx.camera.core.impl.o00O0O0;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.Collections;
import p045Oooooo.o0000O0;
import p045Oooooo.o0000Ooo;
import p080o000OoO.o00000;
import p642o0ooOO0.o000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00O implements o000O0.OooO0OO, o00000.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f509OooO0o0;

    public /* synthetic */ o000O00O(Object obj, int i) {
        this.f508OooO0Oo = i;
        this.f509OooO0o0 = obj;
    }

    @Override // o0ooOO0.o000O0.OooO0OO
    public final Object OooO0O0(o000O0.OooO00o oooO00o) {
        switch (this.f508OooO0Oo) {
            case 0:
                o000O0Oo.OooO00o oooO00o2 = (o000O0Oo.OooO00o) this.f509OooO0o0;
                o0O0000O o0o0000o2 = oooO00o2.f526OooO00o.f854OooO0oo;
                if (o0o0000o2.f689OooO0O0) {
                    o000000O.OooO00o oooO00o3 = new o000000O.OooO00o();
                    oooO00o3.f3659OooO0OO = o0o0000o2.f690OooO0OO;
                    oooO00o3.f3661OooO0o = true;
                    o00O00OO o00o00ooOooo0OO = o00O00OO.Oooo0OO();
                    o00o00ooOooo0OO.Oooo0oO(OooO00o.Oooo0O0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
                    oooO00o3.OooO0OO(new OooO00o(o00O0O0.Oooo0O0(o00o00ooOooo0OO)));
                    oooO00o3.OooO0O0(new o0O00000(oooO00o));
                    o0o0000o2.f688OooO00o.OooOo00(Collections.singletonList(oooO00o3.OooO0Oo()));
                } else {
                    oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
                }
                oooO00o2.f527OooO0O0.f1043OooO0O0 = true;
                return "AePreCapture";
            case 1:
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.f509OooO0o0;
                synchronized (deferrableSurface.f3533OooO00o) {
                    deferrableSurface.f3536OooO0Oo = oooO00o;
                    break;
                }
                return "DeferrableSurface-termination(" + deferrableSurface + ")";
            default:
                o0000Ooo.OooO0OO oooO0OO = (o0000Ooo.OooO0OO) this.f509OooO0o0;
                o0000Ooo.this.f1897OooO0oo.execute(new o0000O0(0, oooO0OO, oooO00o));
                return "acquireBuffer";
        }
    }

    @Override // o000OoO.o00000.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).Oooo0O0();
    }
}
