package p022Oooo00O;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00Oo0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO00o f789OooO00o;

    public o0O0ooO(o00O000.OooO00o oooO00o) {
        this.f789OooO00o = oooO00o;
    }

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO00o() {
        this.f789OooO00o.OooO0OO(new ImageCaptureException(null, "Capture request is cancelled because camera is closed"));
    }

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO0O0(@NonNull o00Oo0 o00oo1) {
        this.f789OooO00o.OooO0O0(null);
    }

    @Override // androidx.camera.core.impl.o000oOoO
    public final void OooO0OO(@NonNull CameraCaptureFailure cameraCaptureFailure) {
        this.f789OooO00o.OooO0OO(new ImageCaptureException(null, "Capture request failed with reason " + cameraCaptureFailure.f3523OooO00o));
    }
}
