package p022Oooo00O;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p023Oooo00o.o;
import p023Oooo00o.o0OOo000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0OO0 extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f620OooO00o = new ArrayList();

    public o00O0OO0(@NonNull List<CameraCaptureSession.StateCallback> list) {
        for (CameraCaptureSession.StateCallback stateCallback : list) {
            if (!(stateCallback instanceof oo0o0O0)) {
                this.f620OooO00o.add(stateCallback);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f620OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    @RequiresApi(api = 26)
    public final void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f620OooO00o.iterator();
        while (it.hasNext()) {
            o.OooO0O0((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f620OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f620OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f620OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
        Iterator it = this.f620OooO00o.iterator();
        while (it.hasNext()) {
            ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    @RequiresApi(api = 23)
    public final void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
        Iterator it = this.f620OooO00o.iterator();
        while (it.hasNext()) {
            o0OOo000.OooO00o((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession, surface);
        }
    }
}
