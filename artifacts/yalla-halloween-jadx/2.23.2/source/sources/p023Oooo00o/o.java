package p023Oooo00o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class o {
    @NonNull
    @DoNotInline
    public static <T> OutputConfiguration OooO00o(@NonNull Size size, @NonNull Class<T> cls) {
        return o0oo0000.OooO00o(size, cls);
    }

    @DoNotInline
    public static void OooO0O0(@NonNull CameraCaptureSession.StateCallback stateCallback, @NonNull CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
