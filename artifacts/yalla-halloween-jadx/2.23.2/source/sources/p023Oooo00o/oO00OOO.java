package p023Oooo00o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class oO00OOO extends oO00OO0O {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(@NonNull CameraDevice cameraDevice) {
        super(cameraDevice, null);
        cameraDevice.getClass();
    }

    @Override // p023Oooo00o.oO00OO0O, p023Oooo00o.oO00O0oO, Oooo00o.oO0O0OoO.OooO00o
    public final void OooO00o(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sessionConfigurationCompat.f3384OooO00o.OooO0Oo();
        sessionConfiguration.getClass();
        try {
            this.f952OooO00o.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.OooO00o(e);
        }
    }
}
