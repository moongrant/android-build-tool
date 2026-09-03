package p023Oooo00o;

import Oooo0.OooOOO;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p028Oooo0oO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class oO00OOo0 implements oO0O0OoO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CameraDevice f952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f953OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Handler f954OooO00o;

        public OooO00o(@NonNull Handler handler) {
            this.f954OooO00o = handler;
        }
    }

    public oO00OOo0(@NonNull CameraDevice cameraDevice, @Nullable OooO00o oooO00o) {
        cameraDevice.getClass();
        this.f952OooO00o = cameraDevice;
        this.f953OooO0O0 = oooO00o;
    }

    public static void OooO0O0(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat) {
        cameraDevice.getClass();
        sessionConfigurationCompat.getClass();
        SessionConfigurationCompat.OooO0OO oooO0OO = sessionConfigurationCompat.f3384OooO00o;
        oooO0OO.OooO0O0().getClass();
        List<OooOOO> listOooO0OO = oooO0OO.OooO0OO();
        if (listOooO0OO == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (oooO0OO.OooO0o0() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id = cameraDevice.getId();
        Iterator<OooOOO> it = listOooO0OO.iterator();
        while (it.hasNext()) {
            String strOooO0o0 = it.next().f405OooO00o.OooO0o0();
            if (strOooO0o0 != null && !strOooO0o0.isEmpty()) {
                o00O0O0.OooO0oo("CameraDeviceCompat", oO00OOOo.OooO00o("Camera ", id, ": Camera doesn't support physicalCameraId ", strOooO0o0, ". Ignoring."));
            }
        }
    }

    public static ArrayList OooO0OO(@NonNull List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((OooOOO) it.next()).f405OooO00o.getSurface());
        }
        return arrayList;
    }
}
