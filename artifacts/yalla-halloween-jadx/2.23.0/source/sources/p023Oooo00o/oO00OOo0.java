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
public final class oO00OOo0 extends oO00OOOo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOo0(@NonNull CameraDevice cameraDevice) {
        super(cameraDevice, null);
        cameraDevice.getClass();
    }

    @Override // p023Oooo00o.oO00OOOo, p023Oooo00o.oO00OOO, Oooo00o.oO00O0o.OooO00o
    public final void OooO00o(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sessionConfigurationCompat.f3386OooO00o.OooO0Oo();
        sessionConfiguration.getClass();
        try {
            this.f969OooO00o.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.OooO00o(e);
        }
    }
}
