package p023Oooo00o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import p022Oooo00O.o000OO;
import p033OoooO0O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class oOo00ooO implements oO0OOO00.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CameraManager f1006OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f1007OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @GuardedBy("mWrapperMap")
        public final HashMap f1008OooO00o = new HashMap();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Handler f1009OooO0O0;

        public OooO00o(@NonNull Handler handler) {
            this.f1009OooO0O0 = handler;
        }
    }

    public oOo00ooO(@NonNull Context context, @Nullable OooO00o oooO00o) {
        this.f1006OooO00o = (CameraManager) context.getSystemService(ZegoConstants.DeviceNameType.DeviceNameCamera);
        this.f1007OooO0O0 = oooO00o;
    }

    @Override // Oooo00o.oO0OOO00.OooO0O0
    public void OooO00o(@NonNull o000OO.OooO0OO oooO0OO) {
        oO0OOO00.OooO00o oooO00o;
        if (oooO0OO != null) {
            OooO00o oooO00o2 = (OooO00o) this.f1007OooO0O0;
            synchronized (oooO00o2.f1008OooO00o) {
                oooO00o = (oO0OOO00.OooO00o) oooO00o2.f1008OooO00o.remove(oooO0OO);
            }
        } else {
            oooO00o = null;
        }
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
        this.f1006OooO00o.unregisterAvailabilityCallback(oooO00o);
    }

    @Override // Oooo00o.oO0OOO00.OooO0O0
    @NonNull
    public CameraCharacteristics OooO0O0(@NonNull String str) throws CameraAccessExceptionCompat {
        try {
            return this.f1006OooO00o.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.OooO00o(e);
        }
    }

    @Override // Oooo00o.oO0OOO00.OooO0O0
    @NonNull
    public Set<Set<String>> OooO0OO() throws CameraAccessExceptionCompat {
        return Collections.emptySet();
    }

    @Override // Oooo00o.oO0OOO00.OooO0O0
    public void OooO0Oo(@NonNull o0O0O00 o0o0o00, @NonNull o000OO.OooO0OO oooO0OO) {
        oO0OOO00.OooO00o oooO00o;
        OooO00o oooO00o2 = (OooO00o) this.f1007OooO0O0;
        synchronized (oooO00o2.f1008OooO00o) {
            oooO00o = (oO0OOO00.OooO00o) oooO00o2.f1008OooO00o.get(oooO0OO);
            if (oooO00o == null) {
                oooO00o = new oO0OOO00.OooO00o(o0o0o00, oooO0OO);
                oooO00o2.f1008OooO00o.put(oooO0OO, oooO00o);
            }
        }
        this.f1006OooO00o.registerAvailabilityCallback(oooO00o, oooO00o2.f1009OooO0O0);
    }

    @Override // Oooo00o.oO0OOO00.OooO0O0
    @RequiresPermission("android.permission.CAMERA")
    public void OooO0o0(@NonNull String str, @NonNull o0O0O00 o0o0o00, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        o0o0o00.getClass();
        stateCallback.getClass();
        try {
            this.f1006OooO00o.openCamera(str, new oO00O0o.OooO0O0(o0o0o00, stateCallback), ((OooO00o) this.f1007OooO0O0).f1009OooO0O0);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
