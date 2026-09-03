package p022Oooo00O;

import Oooo000.OooO00o;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import p023Oooo00o.oO00O0o0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(30)
public final class OooO0o implements o0OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Range<Float> f440OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00O000.OooO00o<Void> f442OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f441OooO0O0 = 1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f443OooO0Oo = 1.0f;

    public OooO0o(@NonNull oO00O0o0 oo00o0o0) {
        this.f440OooO00o = (Range) oo00o0o0.OooO00o(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final void OooO00o(@NonNull TotalCaptureResult totalCaptureResult) {
        if (this.f442OooO0OO != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.f443OooO0Oo == f.floatValue()) {
                this.f442OooO0OO.OooO0O0(null);
                this.f442OooO0OO = null;
            }
        }
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final void OooO0O0(float f, @NonNull o00O000.OooO00o<Void> oooO00o) {
        this.f441OooO0O0 = f;
        o00O000.OooO00o<Void> oooO00o2 = this.f442OooO0OO;
        if (oooO00o2 != null) {
            oooO00o2.OooO0OO(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f443OooO0Oo = this.f441OooO0O0;
        this.f442OooO0OO = oooO00o;
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final float OooO0OO() {
        return ((Float) this.f440OooO00o.getLower()).floatValue();
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final void OooO0Oo() {
        this.f441OooO0O0 = 1.0f;
        o00O000.OooO00o<Void> oooO00o = this.f442OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f442OooO0OO = null;
        }
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final void OooO0o(@NonNull OooO00o.C0004OooO00o c0004OooO00o) {
        c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f441OooO0O0));
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final float OooO0o0() {
        return ((Float) this.f440OooO00o.getUpper()).floatValue();
    }
}
