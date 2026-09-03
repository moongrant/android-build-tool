package p022Oooo00O;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f621OooO00o = new ArrayList();

    public o00O0OO(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof o00O0OOO)) {
                this.f621OooO00o.add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(@NonNull CameraDevice cameraDevice) {
        Iterator it = this.f621OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
        Iterator it = this.f621OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(@NonNull CameraDevice cameraDevice, int i) {
        Iterator it = this.f621OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(@NonNull CameraDevice cameraDevice) {
        Iterator it = this.f621OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
        }
    }
}
