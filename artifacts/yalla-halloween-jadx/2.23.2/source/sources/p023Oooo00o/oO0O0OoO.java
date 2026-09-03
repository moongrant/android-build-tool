package p023Oooo00o;

import OooOOOO.OooOOO0;
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
public final class oO0O0OoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00O0oO f968OooO00o;

    public interface OooO00o {
        void OooO00o(@NonNull SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat;
    }

    @RequiresApi(21)
    public static final class OooO0O0 extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CameraDevice.StateCallback f969OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Executor f970OooO0O0;

        public OooO0O0(@NonNull o0O0O00 o0o0o00, @NonNull CameraDevice.StateCallback stateCallback) {
            this.f970OooO0O0 = o0o0o00;
            this.f969OooO00o = stateCallback;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(@NonNull CameraDevice cameraDevice) {
            this.f970OooO0O0.execute(new OooOOO0(1, this, cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(@NonNull CameraDevice cameraDevice) {
            this.f970OooO0O0.execute(new oO00O0o0(0, this, cameraDevice));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(@NonNull final CameraDevice cameraDevice, final int i) {
            this.f970OooO0O0.execute(new Runnable() { // from class: Oooo00o.oOo00OO0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f992OooO0Oo.f969OooO00o.onError(cameraDevice, i);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(@NonNull CameraDevice cameraDevice) {
            this.f970OooO0O0.execute(new oO00O0o(0, this, cameraDevice));
        }
    }

    public oO0O0OoO(@NonNull CameraDevice cameraDevice, @NonNull Handler handler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f968OooO00o = new oO00OOO(cameraDevice);
        } else if (i >= 24) {
            this.f968OooO00o = new oO00OO0O(cameraDevice, new oO00OOo0.OooO00o(handler));
        } else {
            this.f968OooO00o = new oO00O0oO(cameraDevice, new oO00OOo0.OooO00o(handler));
        }
    }
}
