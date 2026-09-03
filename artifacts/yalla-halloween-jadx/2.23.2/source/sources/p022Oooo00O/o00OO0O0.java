package p022Oooo00O;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OO0O0 extends o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f625OooO00o;

    public o00OO0O0(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback == null) {
            throw new NullPointerException("captureCallback is null");
        }
        this.f625OooO00o = captureCallback;
    }
}
