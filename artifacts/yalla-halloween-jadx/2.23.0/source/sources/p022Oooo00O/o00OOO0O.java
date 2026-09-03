package p022Oooo00O;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.o000000O;
import java.util.Collections;
import p025Oooo0OO.o0000O;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0O extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f650OooO00o;

    public o00OOO0O(o00OOO0 o00ooo1) {
        this.f650OooO00o = o00ooo1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        synchronized (this.f650OooO00o.f629OooO00o) {
            SessionConfig sessionConfig = this.f650OooO00o.f635OooO0oO;
            if (sessionConfig == null) {
                return;
            }
            o000000O o000000o2 = sessionConfig.f3622OooO0o;
            o00O0O0.OooO00o("CaptureSession", "Submit FLASH_MODE_OFF request");
            o00OOO0 o00ooo1 = this.f650OooO00o;
            o00ooo1.f645OooOOo0.getClass();
            o00ooo1.OooO0O0(Collections.singletonList(o0000O.OooO00o(o000000o2)));
        }
    }
}
