package p023Oooo00o;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class o0OOo000 {
    @DoNotInline
    public static void OooO00o(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
