package p022Oooo00O;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p023Oooo00o.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O0O0O extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f618OooO0O0 = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f617OooO00o = new HashMap();

    public interface OooO00o {
    }

    public final void OooO00o(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        HashMap map = this.f617OooO00o;
        List list2 = (List) map.get(captureRequest);
        if (list2 == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        map.put(captureRequest, arrayList);
    }

    public final List<CameraCaptureSession.CaptureCallback> OooO0O0(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = (List) this.f617OooO00o.get(captureRequest);
        return list != null ? list : Collections.emptyList();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    @RequiresApi(api = 24)
    public final void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j) {
        Iterator<CameraCaptureSession.CaptureCallback> it = OooO0O0(captureRequest).iterator();
        while (it.hasNext()) {
            oO0Oo.OooO00o(it.next(), cameraCaptureSession, captureRequest, surface, j);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = OooO0O0(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = OooO0O0(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = OooO0O0(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
        Iterator it = this.f617OooO00o.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i);
            }
        }
        OooO00o oooO00o = this.f618OooO0O0;
        if (oooO00o != null) {
            o00OOO0 o00ooo1 = (o00OOO0) ((oo0O) oooO00o).f899OooO0Oo;
            synchronized (o00ooo1.f627OooO00o) {
                if (o00ooo1.f637OooOO0o == o00OOO0.OooO0o.OPENED) {
                    o00ooo1.OooOO0o(o00ooo1.f633OooO0oO);
                }
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i, long j) {
        Iterator it = this.f617OooO00o.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i, j);
            }
        }
        OooO00o oooO00o = this.f618OooO0O0;
        if (oooO00o != null) {
            o00OOO0 o00ooo1 = (o00OOO0) ((oo0O) oooO00o).f899OooO0Oo;
            synchronized (o00ooo1.f627OooO00o) {
                if (o00ooo1.f637OooOO0o == o00OOO0.OooO0o.OPENED) {
                    o00ooo1.OooOO0o(o00ooo1.f633OooO0oO);
                }
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
        Iterator<CameraCaptureSession.CaptureCallback> it = OooO0O0(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    }
}
