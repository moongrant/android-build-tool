package p022Oooo00O;

import Oooo000.OooO00o;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import p023Oooo00o.oO00O0o0;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00Oo00 implements o0OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00O0o0 f662OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00O000.OooO00o<Void> f664OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Rect f663OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Rect f665OooO0Oo = null;

    public o00Oo00(@NonNull oO00O0o0 oo00o0o0) {
        this.f662OooO00o = oo00o0o0;
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final void OooO00o(@NonNull TotalCaptureResult totalCaptureResult) {
        if (this.f664OooO0OO != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = this.f665OooO0Oo;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f664OooO0OO.OooO0O0(null);
            this.f664OooO0OO = null;
            this.f665OooO0Oo = null;
        }
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final void OooO0O0(float f, @NonNull o00O000.OooO00o<Void> oooO00o) {
        Rect rect = (Rect) this.f662OooO00o.OooO00o(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float fWidth = rect.width() / f;
        float fHeight = rect.height() / f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        this.f663OooO0O0 = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        o00O000.OooO00o<Void> oooO00o2 = this.f664OooO0OO;
        if (oooO00o2 != null) {
            oooO00o2.OooO0OO(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f665OooO0Oo = this.f663OooO0O0;
        this.f664OooO0OO = oooO00o;
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final float OooO0OO() {
        return 1.0f;
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final void OooO0Oo() {
        this.f665OooO0Oo = null;
        this.f663OooO0O0 = null;
        o00O000.OooO00o<Void> oooO00o = this.f664OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO0OO(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f664OooO0OO = null;
        }
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public final void OooO0o(@NonNull OooO00o.C0004OooO00o c0004OooO00o) {
        Rect rect = this.f663OooO0O0;
        if (rect != null) {
            c0004OooO00o.OooO0OO(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // Oooo00O.o0OO0O0.OooO0O0
    public final float OooO0o0() {
        Float f = (Float) this.f662OooO00o.OooO00o(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }
}
