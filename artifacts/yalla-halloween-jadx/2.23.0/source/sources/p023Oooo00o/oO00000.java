package p023Oooo00o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p022Oooo00O.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oO00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO000Oo f921OooO00o;

    public interface OooO00o {
        int OooO00o(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull o00O0O0O o00o0o0o2) throws CameraAccessException;

        int OooO0O0(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    @RequiresApi(21)
    public static final class OooO0O0 extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f922OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f923OooO0O0;

        public OooO0O0(@NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
            this.f923OooO0O0 = executor;
            this.f922OooO00o = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(24)
        public final void onCaptureBufferLost(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final Surface surface, final long j) {
            this.f923OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0000O
                @Override // java.lang.Runnable
                public final void run() {
                    o0OOo000.OooO00o(this.f929OooO0Oo.f922OooO00o, cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.f923OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO000
                @Override // java.lang.Runnable
                public final void run() {
                    this.f917OooO0Oo.f922OooO00o.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureFailure captureFailure) {
            this.f923OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO000O0O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f947OooO0Oo.f922OooO00o.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureResult captureResult) {
            this.f923OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0000o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f938OooO0Oo.f922OooO00o.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f923OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO00000o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f926OooO0Oo.f922OooO00o.onCaptureSequenceAborted(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f923OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0000Oo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f934OooO0Oo.f922OooO00o.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, final long j, final long j2) {
            this.f923OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO000O0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f942OooO0Oo.f922OooO00o.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    @RequiresApi(21)
    public static final class OooO0OO extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f924OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f925OooO0O0;

        public OooO0OO(@NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.f925OooO0O0 = executor;
            this.f924OooO00o = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
            this.f925OooO0O0.execute(new oO0Oo0oo(0, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(26)
        public final void onCaptureQueueEmpty(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f925OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0OoOO0
                @Override // java.lang.Runnable
                public final void run() {
                    o0oo0000.OooO0O0(this.f995OooO0Oo.f924OooO00o, cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f925OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0o0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f999OooO0Oo.f924OooO00o.onClosed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f925OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO000OOo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f951OooO0Oo.f924OooO00o.onConfigureFailed(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(@NonNull final CameraCaptureSession cameraCaptureSession) {
            this.f925OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0Ooooo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f997OooO0Oo.f924OooO00o.onConfigured(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
            this.f925OooO0O0.execute(new ooOOOOoo(0, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(23)
        public final void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
            this.f925OooO0O0.execute(new oO0OOo0o(0, this, cameraCaptureSession, surface));
        }
    }

    public oO00000(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f921OooO00o = new oO000Oo0(cameraCaptureSession);
        } else {
            this.f921OooO00o = new oO000Oo(cameraCaptureSession, new oO000Oo.OooO00o(handler));
        }
    }

    @NonNull
    public final CameraCaptureSession OooO00o() {
        return this.f921OooO00o.f953OooO00o;
    }
}
