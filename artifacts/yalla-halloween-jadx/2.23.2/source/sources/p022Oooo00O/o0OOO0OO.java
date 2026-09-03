package p022Oooo00O;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0OO extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OOOO00 f829OooO00o;

    public o0OOO0OO(o0OOOO00 o0oooo01) {
        this.f829OooO00o = o0oooo01;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
        Surface inputSurface = cameraCaptureSession.getInputSurface();
        if (inputSurface != null) {
            this.f829OooO00o.f842OooOO0 = ImageWriter.newInstance(inputSurface, 1);
        }
    }
}
