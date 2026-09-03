package p022Oooo00O;

import Oooo000.OooO00o;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.o000000O;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00O00O;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.Collections;
import p030OoooO.OooOo00;
import p033OoooO0O.o00oO0o;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00O implements o00O000.OooO0OO, OnFailureListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f508OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f509OooO0o0;

    public /* synthetic */ o000O00O(Object obj, int i) {
        this.f508OooO0Oo = i;
        this.f509OooO0o0 = obj;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        switch (this.f508OooO0Oo) {
            case 0:
                o000O0Oo.OooO00o oooO00o2 = (o000O0Oo.OooO00o) this.f509OooO0o0;
                o0O0000O o0o0000o2 = oooO00o2.f527OooO00o.f845OooO0oo;
                if (o0o0000o2.f682OooO0O0) {
                    o000000O.OooO00o oooO00o3 = new o000000O.OooO00o();
                    oooO00o3.f3657OooO0OO = o0o0000o2.f683OooO0OO;
                    oooO00o3.f3659OooO0o = true;
                    o00O00O o00o00oOooo0OO = o00O00O.Oooo0OO();
                    o00o00oOooo0OO.Oooo0oO(OooO00o.Oooo0O0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
                    oooO00o3.OooO0OO(new OooO00o(o00O0.Oooo0O0(o00o00oOooo0OO)));
                    oooO00o3.OooO0O0(new o0O00000(oooO00o));
                    o0o0000o2.f681OooO00o.OooOo00(Collections.singletonList(oooO00o3.OooO0Oo()));
                } else {
                    oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
                }
                oooO00o2.f528OooO0O0.f1051OooO0O0 = true;
                return "AePreCapture";
            default:
                com.google.common.util.concurrent.OooO00o oooO00o4 = (com.google.common.util.concurrent.OooO00o) this.f509OooO0o0;
                OooOo00.OooO0o(false, oooO00o4, oooO00o, o00oO0o.OooO00o());
                return "nonCancellationPropagating[" + oooO00o4 + "]";
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        ((RemoteConfigManager) this.f509OooO0o0).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
