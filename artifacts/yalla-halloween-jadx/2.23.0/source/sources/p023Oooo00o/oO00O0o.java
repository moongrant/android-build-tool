package p023Oooo00o;

import OooO0O0.OooOO0O;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.concurrent.Executor;
import p033OoooO0O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oO00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00OOO f956OooO00o;

    public interface OooO00o {
        void OooO00o(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat;
    }

    @RequiresApi(21)
    public static final class OooO0O0 extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CameraDevice.StateCallback f957OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f958OooO0O0;

        public OooO0O0(@NonNull o0O0O00 o0o0o00, @NonNull CameraDevice.StateCallback stateCallback) {
            this.f958OooO0O0 = o0o0o00;
            this.f957OooO00o = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull CameraDevice cameraDevice) {
            this.f958OooO0O0.execute(new OooOO0O(1, this, cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            this.f958OooO0O0.execute(new oOo00OO0(0, this, cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull CameraDevice cameraDevice, int i) {
            this.f958OooO0O0.execute(new oO00OO0O(this, cameraDevice, i));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull final CameraDevice cameraDevice) {
            this.f958OooO0O0.execute(new Runnable() { // from class: Oooo00o.oO00O0oO
                @Override // java.lang.Runnable
                public final void run() {
                    this.f963OooO0Oo.f957OooO00o.onOpened(cameraDevice);
                }
            });
        }
    }

    public oO00O0o(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f956OooO00o = new oO00OOo0(cameraDevice);
        } else if (i >= 24) {
            this.f956OooO00o = new oO00OOOo(cameraDevice, new oO00Oo0.OooO00o(handler));
        } else {
            this.f956OooO00o = new oO00OOO(cameraDevice, new oO00Oo0.OooO00o(handler));
        }
    }
}
