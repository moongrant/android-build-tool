package p023Oooo00o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import p022Oooo00O.o000OO;
import p033OoooO0O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public class oO00o00 extends oO00o0 {
    public oO00o00(@NonNull Context context) {
        super(context, null);
    }

    public static boolean OooO0o(@NonNull RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            return (!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName());
        }
        return false;
    }

    @Override // p023Oooo00o.oO00o0, Oooo00o.oO00o000.OooO0O0
    public final void OooO00o(@NonNull o000OO.OooO0OO oooO0OO) {
        this.f958OooO00o.unregisterAvailabilityCallback(oooO0OO);
    }

    @Override // p023Oooo00o.oO00o0, Oooo00o.oO00o000.OooO0O0
    @NonNull
    public CameraCharacteristics OooO0O0(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return super.OooO0O0(str);
        } catch (RuntimeException e) {
            if (OooO0o(e)) {
                throw new CameraAccessExceptionCompat(e);
            }
            throw e;
        }
    }

    @Override // p023Oooo00o.oO00o0, Oooo00o.oO00o000.OooO0O0
    public final void OooO0Oo(@NonNull o0O0O00 o0o0o00, @NonNull o000OO.OooO0OO oooO0OO) {
        this.f958OooO00o.registerAvailabilityCallback(o0o0o00, oooO0OO);
    }

    @Override // p023Oooo00o.oO00o0, Oooo00o.oO00o000.OooO0O0
    @RequiresPermission("android.permission.CAMERA")
    public void OooO0o0(@NonNull String str, @NonNull o0O0O00 o0o0o00, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            this.f958OooO00o.openCamera(str, o0o0o00, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (!OooO0o(e4)) {
                throw e4;
            }
            throw new CameraAccessExceptionCompat(e4);
        }
    }
}
