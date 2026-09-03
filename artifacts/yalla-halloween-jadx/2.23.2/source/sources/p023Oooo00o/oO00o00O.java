package p023Oooo00o;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(30)
public final class oO00o00O extends oO0OOO00 {
    @Override // p023Oooo00o.oO00o0, Oooo00o.oO00o000.OooO0O0
    @NonNull
    public final Set<Set<String>> OooO0OO() throws CameraAccessExceptionCompat {
        try {
            return this.f958OooO00o.getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.OooO00o(e);
        }
    }
}
