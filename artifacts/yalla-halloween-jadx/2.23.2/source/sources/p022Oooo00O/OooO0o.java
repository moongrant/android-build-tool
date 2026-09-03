package p022Oooo00O;

import Oooo000.OooO00o;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import p023Oooo00o.oO000o00;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(30)
public final class OooO0o implements o0OO0o00.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Range<Float> f439OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o000Oo0.OooO00o<Void> f441OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f440OooO0O0 = 1.0f;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f442OooO0Oo = 1.0f;

    public OooO0o(@NonNull oO000o00 oo000o00) {
        this.f439OooO00o = (Range) oo000o00.OooO00o(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    @Override // Oooo00O.o0OO0o00.OooO0O0
    public final void OooO00o(@NonNull TotalCaptureResult totalCaptureResult) {
        if (this.f441OooO0OO != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f == null) {
                return;
            }
            if (this.f442OooO0Oo == f.floatValue()) {
                this.f441OooO0OO.OooO0O0(null);
                this.f441OooO0OO = null;
            }
        }
    }

    @Override // Oooo00O.o0OO0o00.OooO0O0
    public final void OooO0O0(float f, @NonNull o000Oo0.OooO00o<Void> oooO00o) {
        this.f440OooO0O0 = f;
        o000Oo0.OooO00o<Void> oooO00o2 = this.f441OooO0OO;
        if (oooO00o2 != null) {
            oooO00o2.OooO0OO(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f442OooO0Oo = this.f440OooO0O0;
        this.f441OooO0OO = oooO00o;
    }

    @Override // Oooo00O.o0OO0o00.OooO0O0
    public final float OooO0OO() {
        return ((Float) this.f439OooO00o.getLower()).floatValue();
    }

    @Override // Oooo00O.o0OO0o00.OooO0O0
    public final void OooO0Oo() {
        this.f440OooO0O0 = 1.0f;
        o000Oo0.OooO00o<Void> oooO00o = this.f441OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f441OooO0OO = null;
        }
    }

    @Override // Oooo00O.o0OO0o00.OooO0O0
    public final void OooO0o(@NonNull OooO00o.C0004OooO00o c0004OooO00o) {
        c0004OooO00o.OooO0OO(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f440OooO0O0));
    }

    @Override // Oooo00O.o0OO0o00.OooO0O0
    public final float OooO0o0() {
        return ((Float) this.f439OooO00o.getUpper()).floatValue();
    }
}
