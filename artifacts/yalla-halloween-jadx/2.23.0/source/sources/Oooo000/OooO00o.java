package Oooo000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OooO0o;
import androidx.camera.core.impl.o00O00;
import androidx.camera.core.impl.o00O00O;
import p026Oooo0o.OooOo00;
import p028Oooo0oO.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {ExperimentalCamera2Interop.class})
@RequiresApi(21)
public final class OooO00o extends OooOo00 {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final OooO0o f427Oooo000 = Config.OooO00o.OooO00o(Integer.TYPE, "camera2.captureRequest.templateType");

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final OooO0o f428Oooo00O = Config.OooO00o.OooO00o(Long.TYPE, "camera2.cameraCaptureSession.streamUseCase");

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final OooO0o f429Oooo00o = Config.OooO00o.OooO00o(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final OooO0o f426Oooo0 = Config.OooO00o.OooO00o(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final OooO0o f430Oooo0O0 = Config.OooO00o.OooO00o(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final OooO0o f431Oooo0OO = Config.OooO00o.OooO00o(OooO0OO.class, "camera2.cameraEvent.callback");

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final OooO0o f433Oooo0o0 = Config.OooO00o.OooO00o(Object.class, "camera2.captureRequest.tag");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final OooO0o f432Oooo0o = Config.OooO00o.OooO00o(String.class, "camera2.cameraCaptureSession.physicalCameraId");

    /* JADX INFO: renamed from: Oooo000.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0004OooO00o implements o00O000o<OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O00O f434OooO00o = o00O00O.Oooo0OO();

        @Override // p028Oooo0oO.o00O000o
        @NonNull
        public final o00O00 OooO00o() {
            throw null;
        }

        @NonNull
        public final void OooO0OO(@NonNull CaptureRequest.Key key, @NonNull Object obj) {
            this.f434OooO00o.Oooo0oO(OooO00o.Oooo0O0(key), obj);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static OooO0o Oooo0O0(@NonNull CaptureRequest.Key key) {
        return new OooO0o("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
