package p023Oooo00o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p022Oooo00O.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class oO000Oo implements oO00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CameraCaptureSession f953OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f954OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Handler f955OooO00o;

        public OooO00o(@NonNull Handler handler) {
            this.f955OooO00o = handler;
        }
    }

    public oO000Oo(@NonNull CameraCaptureSession cameraCaptureSession, @Nullable OooO00o oooO00o) {
        cameraCaptureSession.getClass();
        this.f953OooO00o = cameraCaptureSession;
        this.f954OooO0O0 = oooO00o;
    }

    @Override // Oooo00o.oO00000.OooO00o
    public int OooO00o(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull o00O0O0O o00o0o0o2) throws CameraAccessException {
        return this.f953OooO00o.captureBurst(arrayList, new oO00000.OooO0O0(executor, o00o0o0o2), ((OooO00o) this.f954OooO0O0).f955OooO00o);
    }

    @Override // Oooo00o.oO00000.OooO00o
    public int OooO0O0(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.f953OooO00o.setRepeatingRequest(captureRequest, new oO00000.OooO0O0(executor, captureCallback), ((OooO00o) this.f954OooO0O0).f955OooO00o);
    }
}
