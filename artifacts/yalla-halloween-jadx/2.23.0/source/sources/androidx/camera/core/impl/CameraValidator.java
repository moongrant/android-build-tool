package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class CameraValidator {

    public static class CameraIdListIncorrectException extends Exception {
        public CameraIdListIncorrectException(@Nullable IllegalArgumentException illegalArgumentException) {
            super("Expected camera missing from device.", illegalArgumentException);
        }
    }

    public static void OooO00o(@NonNull Context context, @NonNull o0OO00O o0oo00o2, @Nullable CameraSelector cameraSelector) throws CameraIdListIncorrectException {
        Integer numOooO0OO;
        if (cameraSelector != null) {
            try {
                numOooO0OO = cameraSelector.OooO0OO();
                if (numOooO0OO == null) {
                    p028Oooo0oO.o00O0O0.OooO0oo("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e) {
                p028Oooo0oO.o00O0O0.OooO0OO("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e);
                return;
            }
        } else {
            numOooO0OO = null;
        }
        p028Oooo0oO.o00O0O0.OooO00o("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + numOooO0OO);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (cameraSelector == null || numOooO0OO.intValue() == 1)) {
                CameraSelector.f3396OooO0OO.OooO0Oo(o0oo00o2.OooO00o());
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (cameraSelector == null || numOooO0OO.intValue() == 0) {
                    CameraSelector.f3395OooO0O0.OooO0Oo(o0oo00o2.OooO00o());
                }
            }
        } catch (IllegalArgumentException e2) {
            p028Oooo0oO.o00O0O0.OooO0O0("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + o0oo00o2.OooO00o());
            throw new CameraIdListIncorrectException(e2);
        }
    }
}
