package p023Oooo00o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import p033OoooO0O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public class oO00o0 extends oO00o00O {
    @Override // p023Oooo00o.oO00o00O, p023Oooo00o.oOo00ooO, Oooo00o.oO0OOO00.OooO0O0
    @NonNull
    public final CameraCharacteristics OooO0O0(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return this.f1006OooO00o.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.OooO00o(e);
        }
    }

    @Override // p023Oooo00o.oO00o00O, p023Oooo00o.oOo00ooO, Oooo00o.oO0OOO00.OooO0O0
    @RequiresPermission("android.permission.CAMERA")
    public final void OooO0o0(@NonNull String str, @NonNull o0O0O00 o0o0o00, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f1006OooO00o.openCamera(str, o0o0o00, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
