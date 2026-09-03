package p022Oooo00O;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.o000oOoO;
import androidx.camera.core.impl.o00OO;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OO00O extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO f626OooO00o;

    public o00OO00O(o000oOoO o000oooo2) {
        if (o000oooo2 == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f626OooO00o = o000oooo2;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        o00OO o00oo2;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            OooOOO0.OooO0O0(tag instanceof o00OO, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            o00oo2 = (o00OO) tag;
        } else {
            o00oo2 = o00OO.f3727OooO0O0;
        }
        this.f626OooO00o.OooO0O0(new OooOOOO(o00oo2, totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f626OooO00o.OooO0OO(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
    }
}
