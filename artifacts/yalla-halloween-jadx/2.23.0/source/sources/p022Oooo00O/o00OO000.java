package p022Oooo00O;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OO000 {
    @NonNull
    public static CameraUnavailableException OooO00o(@NonNull CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int i = cameraAccessExceptionCompat.f3385OooO0Oo;
        if (i == 1 || i == 2 || i == 3 || i != 4) {
        }
        return new CameraUnavailableException(cameraAccessExceptionCompat);
    }
}
