package p023Oooo00o;

import Oooo0.OooOOO0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public class oO00OOO extends oO00Oo0 {
    @Override // Oooo00o.oO00O0o.OooO00o
    public void OooO00o(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        CameraDevice cameraDevice = this.f969OooO00o;
        oO00Oo0.OooO0O0(cameraDevice, sessionConfigurationCompat);
        SessionConfigurationCompat.OooO0OO oooO0OO = sessionConfigurationCompat.f3386OooO00o;
        oO00000.OooO0OO oooO0OO2 = new oO00000.OooO0OO(oooO0OO.OooO0o0(), oooO0OO.OooO0O0());
        ArrayList arrayListOooO0OO = oO00Oo0.OooO0OO(oooO0OO.OooO0OO());
        oO00Oo0.OooO00o oooO00o = (oO00Oo0.OooO00o) this.f970OooO0O0;
        oooO00o.getClass();
        OooOOO0 oooOOO0OooO00o = oooO0OO.OooO00o();
        Handler handler = oooO00o.f971OooO00o;
        try {
            if (oooOOO0OooO00o != null) {
                InputConfiguration inputConfigurationOooO00o = oooOOO0OooO00o.f407OooO00o.OooO00o();
                inputConfigurationOooO00o.getClass();
                cameraDevice.createReprocessableCaptureSession(inputConfigurationOooO00o, arrayListOooO0OO, oooO0OO2, handler);
            } else {
                if (oooO0OO.OooO0oO() == 1) {
                    cameraDevice.createConstrainedHighSpeedCaptureSession(arrayListOooO0OO, oooO0OO2, handler);
                    return;
                }
                try {
                    cameraDevice.createCaptureSession(arrayListOooO0OO, oooO0OO2, handler);
                } catch (CameraAccessException e) {
                    throw new CameraAccessExceptionCompat(e);
                }
            }
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        }
    }
}
