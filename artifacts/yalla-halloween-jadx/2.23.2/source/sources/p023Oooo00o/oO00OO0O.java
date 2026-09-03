package p023Oooo00o;

import Oooo0.OooOOO;
import Oooo0.OooOOO0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public class oO00OO0O extends oO00O0oO {
    @Override // p023Oooo00o.oO00O0oO, Oooo00o.oO0O0OoO.OooO00o
    public void OooO00o(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        CameraDevice cameraDevice = this.f952OooO00o;
        oO00OOo0.OooO0O0(cameraDevice, sessionConfigurationCompat);
        SessionConfigurationCompat.OooO0OO oooO0OO = sessionConfigurationCompat.f3384OooO00o;
        oO0000O.OooO0OO oooO0OO2 = new oO0000O.OooO0OO(oooO0OO.OooO0o0(), oooO0OO.OooO0O0());
        List<OooOOO> listOooO0OO = oooO0OO.OooO0OO();
        oO00OOo0.OooO00o oooO00o = (oO00OOo0.OooO00o) this.f953OooO0O0;
        oooO00o.getClass();
        OooOOO0 oooOOO0OooO00o = oooO0OO.OooO00o();
        Handler handler = oooO00o.f954OooO00o;
        try {
            if (oooOOO0OooO00o != null) {
                InputConfiguration inputConfigurationOooO00o = oooOOO0OooO00o.f406OooO00o.OooO00o();
                inputConfigurationOooO00o.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfigurationOooO00o, SessionConfigurationCompat.OooO00o(listOooO0OO), oooO0OO2, handler);
            } else if (oooO0OO.OooO0oO() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(oO00OOo0.OooO0OO(listOooO0OO), oooO0OO2, handler);
            } else {
                cameraDevice.createCaptureSessionByOutputConfigurations(SessionConfigurationCompat.OooO00o(listOooO0OO), oooO0OO2, handler);
            }
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
