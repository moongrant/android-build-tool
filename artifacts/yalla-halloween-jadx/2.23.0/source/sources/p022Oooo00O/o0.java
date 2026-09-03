package p022Oooo00O;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00Oo0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO00o f454OooO00o = null;

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO00o() {
        o00O000.OooO00o oooO00o = this.f454OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Camera is closed"));
        }
    }

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO0O0(@NonNull o00Oo0 o00oo1) {
        o00O000.OooO00o oooO00o = this.f454OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0O0(o00oo1);
        }
    }

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO0OO(@NonNull CameraCaptureFailure cameraCaptureFailure) {
        o00O000.OooO00o oooO00o = this.f454OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0OO(new CameraControlInternal.CameraControlException());
        }
    }
}
