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
public final class oO00o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("mCameraCharacteristicsMap")
    public final ArrayMap f963OooO0O0 = new ArrayMap(4);

    @RequiresApi(21)
    public static final class OooO00o extends CameraManager.AvailabilityCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Executor f964OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final CameraManager.AvailabilityCallback f965OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Object f966OooO0OO = new Object();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @GuardedBy("mLock")
        public boolean f967OooO0Oo = false;

        public OooO00o(@NonNull o0O0O00 o0o0o00, @NonNull o000OO.OooO0OO oooO0OO) {
            this.f964OooO00o = o0o0o00;
            this.f965OooO0O0 = oooO0OO;
        }

        public final void OooO00o() {
            synchronized (this.f966OooO0OO) {
                this.f967OooO0Oo = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        @RequiresApi(29)
        public final void onCameraAccessPrioritiesChanged() {
            synchronized (this.f966OooO0OO) {
                if (!this.f967OooO0Oo) {
                    this.f964OooO00o.execute(new Runnable() { // from class: Oooo00o.oO00Oo00
                        @Override // java.lang.Runnable
                        public final void run() {
                            oO00000o.OooO00o(this.f957OooO0Oo.f965OooO0O0);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(@NonNull final String str) {
            synchronized (this.f966OooO0OO) {
                if (!this.f967OooO0Oo) {
                    this.f964OooO00o.execute(new Runnable() { // from class: Oooo00o.oOOoOOO0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f990OooO0Oo.f965OooO0O0.onCameraAvailable(str);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(@NonNull final String str) {
            synchronized (this.f966OooO0OO) {
                if (!this.f967OooO0Oo) {
                    this.f964OooO00o.execute(new Runnable() { // from class: Oooo00o.oO00Oo0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f955OooO0Oo.f965OooO0O0.onCameraUnavailable(str);
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

    public oO00o000(oO00o0 oo00o0) {
        this.f962OooO00o = oo00o0;
    }

    @NonNull
    public static oO00o000 OooO00o(@NonNull Context context, @NonNull Handler handler) {
        oO00o0 oo00o00;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            oo00o00 = new oO00o00O(context);
        } else if (i >= 29) {
            oo00o00 = new oO0OOO00(context);
        } else {
            oo00o00 = i >= 28 ? new oO00o00(context) : new oO00o0(context, new oO00o0.OooO00o(handler));
        }
        return new oO00o000(oo00o00);
    }

    @NonNull
    public final oO000o00 OooO0O0(@NonNull String str) throws CameraAccessExceptionCompat {
        oO000o00 oo000o00;
        synchronized (this.f963OooO0O0) {
            oo000o00 = (oO000o00) this.f963OooO0O0.get(str);
            if (oo000o00 == null) {
                try {
                    oO000o00 oo000o01 = new oO000o00(this.f962OooO00o.OooO0O0(str), str);
                    this.f963OooO0O0.put(str, oo000o01);
                    oo000o00 = oo000o01;
                } catch (AssertionError e) {
                    throw new CameraAccessExceptionCompat(e, e.getMessage());
                }
            }
        }
        return oo000o00;
    }
}
