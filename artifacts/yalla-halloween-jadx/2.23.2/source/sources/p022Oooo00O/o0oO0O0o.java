package p022Oooo00O;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import p023Oooo00o.oO0000O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o0oO0O0o {

    public static abstract class OooO00o {
        public void OooOO0(@NonNull o0O0OOOo o0o0oooo) {
        }

        @RequiresApi(api = 26)
        public void OooOO0O(@NonNull o0O0OOOo o0o0oooo) {
        }

        public void OooOO0o(@NonNull o0oO0O0o o0oo0o0o2) {
        }

        public void OooOOO(@NonNull o0O0OOOo o0o0oooo) {
        }

        public void OooOOO0(@NonNull o0oO0O0o o0oo0o0o2) {
        }

        public void OooOOOO(@NonNull o0O0OOOo o0o0oooo) {
        }

        public void OooOOOo(@NonNull o0oO0O0o o0oo0o0o2) {
        }

        @RequiresApi(api = 23)
        public void OooOOo0(@NonNull o0O0OOOo o0o0oooo, @NonNull Surface surface) {
        }
    }

    @NonNull
    OooOO0O<Void> OooO();

    @NonNull
    o0O0OOOo OooO0O0();

    void OooO0OO() throws CameraAccessException;

    void OooO0Oo();

    int OooO0o0(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    @NonNull
    oO0000O OooO0oO();

    int OooO0oo(@NonNull ArrayList arrayList, @NonNull o00O0O0O o00o0o0o2) throws CameraAccessException;

    void close();

    @NonNull
    CameraDevice getDevice();
}
