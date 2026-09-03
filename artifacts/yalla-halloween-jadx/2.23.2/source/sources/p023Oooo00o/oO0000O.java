package p023Oooo00o;

import OooOOOO.OooO0o;
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
public final class oO0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0OOo0o f917OooO00o;

    public interface OooO00o {
        int OooO00o(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull o00O0O0O o00o0o0o2) throws CameraAccessException;

        int OooO0O0(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    @RequiresApi(21)
    public static final class OooO0O0 extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CameraCaptureSession.CaptureCallback f918OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f919OooO0O0;

        public OooO0O0(@NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) {
            this.f919OooO0O0 = executor;
            this.f918OooO00o = captureCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        @RequiresApi(24)
        public final void onCaptureBufferLost(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final Surface surface, final long j) {
            this.f919OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0000o0
                @Override // java.lang.Runnable
                public final void run() {
                    oO0Oo.OooO00o(this.f925OooO0Oo.f918OooO00o, cameraCaptureSession, captureRequest, surface, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final TotalCaptureResult totalCaptureResult) {
            this.f919OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO000O0O
                @Override // java.lang.Runnable
                public final void run() {
                    this.f934OooO0Oo.f918OooO00o.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureFailure captureFailure) {
            this.f919OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0o0o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f986OooO0Oo.f918OooO00o.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureProgressed(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, @NonNull final CaptureResult captureResult) {
            this.f919OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO000O0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f930OooO0Oo.f918OooO00o.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i) {
            this.f919OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0000Oo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f922OooO0Oo.f918OooO00o.onCaptureSequenceAborted(cameraCaptureSession, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(@NonNull final CameraCaptureSession cameraCaptureSession, final int i, final long j) {
            this.f919OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO000
                @Override // java.lang.Runnable
                public final void run() {
                    this.f913OooO0Oo.f918OooO00o.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final CaptureRequest captureRequest, final long j, final long j2) {
            this.f919OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO0Ooooo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f981OooO0Oo.f918OooO00o.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
                }
            });
        }
    }

    @RequiresApi(21)
    public static final class OooO0OO extends CameraCaptureSession.StateCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f920OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f921OooO0O0;

        public OooO0OO(@NonNull Executor executor, @NonNull CameraCaptureSession.StateCallback stateCallback) {
            this.f921OooO0O0 = executor;
            this.f920OooO00o = stateCallback;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
            this.f921OooO0O0.execute(new oO0Oo0oo(0, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(26)
        public final void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
            this.f921OooO0O0.execute(new oO0OoOO0(0, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
            this.f921OooO0O0.execute(new OooOO0O.OooO0OO(1, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
            this.f921OooO0O0.execute(new OooOOOO.OooO00o(1, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
            this.f921OooO0O0.execute(new OooOO0.OooO00o(1, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public final void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
            this.f921OooO0O0.execute(new OooO0o(1, this, cameraCaptureSession));
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(23)
        public final void onSurfacePrepared(@NonNull final CameraCaptureSession cameraCaptureSession, @NonNull final Surface surface) {
            this.f921OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO000OOo
                @Override // java.lang.Runnable
                public final void run() {
                    o0OOo000.OooO00o(this.f938OooO0Oo.f920OooO00o, cameraCaptureSession, surface);
                }
            });
        }
    }

    public oO0000O(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f917OooO00o = new ooOOOOoo(cameraCaptureSession);
        } else {
            this.f917OooO00o = new oO0OOo0o(cameraCaptureSession, new oO0OOo0o.OooO00o(handler));
        }
    }

    @NonNull
    public final CameraCaptureSession OooO00o() {
        return this.f917OooO00o.f972OooO00o;
    }
}
