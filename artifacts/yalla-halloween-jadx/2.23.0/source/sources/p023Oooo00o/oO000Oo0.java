package p023Oooo00o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p022Oooo00O.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class oO000Oo0 extends oO000Oo {
    public oO000Oo0(@NonNull CameraCaptureSession cameraCaptureSession) {
        super(cameraCaptureSession, null);
    }

    @Override // p023Oooo00o.oO000Oo, Oooo00o.oO00000.OooO00o
    public final int OooO00o(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull o00O0O0O o00o0o0o2) throws CameraAccessException {
        return this.f953OooO00o.captureBurstRequests(arrayList, executor, o00o0o0o2);
    }

    @Override // p023Oooo00o.oO000Oo, Oooo00o.oO00000.OooO00o
    public final int OooO0O0(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f953OooO00o.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
