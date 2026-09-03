package p023Oooo00o;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;
import java.util.concurrent.Executor;
import p022Oooo00O.o000OO;
import p033OoooO0O.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oO0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f982OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mCameraCharacteristicsMap")
    public final ArrayMap f983OooO0O0 = new ArrayMap(4);

    @RequiresApi(21)
    public static final class OooO00o extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Executor f984OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CameraManager.AvailabilityCallback f985OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f986OooO0OO = new Object();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @GuardedBy("mLock")
        public boolean f987OooO0Oo = false;

        public OooO00o(@NonNull o0O0O00 o0o0o00, @NonNull o000OO.OooO0OO oooO0OO) {
            this.f984OooO00o = o0o0o00;
            this.f985OooO0O0 = oooO0OO;
        }

        public final void OooO00o() {
            synchronized (this.f986OooO0OO) {
                this.f987OooO0Oo = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        @RequiresApi(29)
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f986OooO0OO) {
                if (!this.f987OooO0Oo) {
                    this.f984OooO00o.execute(new Runnable() { // from class: Oooo00o.oOOoOOO0
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.OooO00o(this.f1001OooO0Oo.f985OooO0O0);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(@NonNull String str) {
            synchronized (this.f986OooO0OO) {
                if (!this.f987OooO0Oo) {
                    this.f984OooO00o.execute(new oO00o00(0, str, this));
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(@NonNull final String str) {
            synchronized (this.f986OooO0OO) {
                if (!this.f987OooO0Oo) {
                    this.f984OooO00o.execute(new Runnable() { // from class: Oooo00o.oO00o000
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f975OooO0Oo.f985OooO0O0.onCameraUnavailable(str);
                        }
                    });
                }
            }
        }
    }

    public interface OooO0O0 {
        void OooO00o(@NonNull o000OO.OooO0OO oooO0OO);

        @NonNull
        CameraCharacteristics OooO0O0(@NonNull String str) throws CameraAccessExceptionCompat;

        @NonNull
        Set<Set<String>> OooO0OO() throws CameraAccessExceptionCompat;

        void OooO0Oo(@NonNull o0O0O00 o0o0o00, @NonNull o000OO.OooO0OO oooO0OO);

        @RequiresPermission("android.permission.CAMERA")
        void OooO0o0(@NonNull String str, @NonNull o0O0O00 o0o0o00, @NonNull CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat;
    }

    public oO0OOO00(oOo00ooO ooo00ooo) {
        this.f982OooO00o = ooo00ooo;
    }

    @NonNull
    public static oO0OOO00 OooO00o(@NonNull Context context, @NonNull Handler handler) {
        oOo00ooO oo00o00o;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            oo00o00o = new oOo00o0o(context);
        } else if (i >= 29) {
            oo00o00o = new oO00o0(context);
        } else {
            oo00o00o = i >= 28 ? new oO00o00O(context) : new oOo00ooO(context, new oOo00ooO.OooO00o(handler));
        }
        return new oO0OOO00(oo00o00o);
    }

    @NonNull
    public final oO00O0o0 OooO0O0(@NonNull String str) throws CameraAccessExceptionCompat {
        oO00O0o0 oo00o0o0;
        synchronized (this.f983OooO0O0) {
            oo00o0o0 = (oO00O0o0) this.f983OooO0O0.get(str);
            if (oo00o0o0 == null) {
                try {
                    oO00O0o0 oo00o0o1 = new oO00O0o0(this.f982OooO00o.OooO0O0(str), str);
                    this.f983OooO0O0.put(str, oo00o0o1);
                    oo00o0o0 = oo00o0o1;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e, e.getMessage());
                }
            }
        }
        return oo00o0o0;
    }
}
