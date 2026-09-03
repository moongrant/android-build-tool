package p026Oooo0o;

import Oooo000.OooO00o;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.o00O0;
import androidx.camera.core.impl.o00OO;
import java.util.concurrent.Executor;
import p022Oooo00O.o00Ooo;
import p022Oooo00O.o0Oo0oo;
import p033OoooO0O.o0O0O00;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@ExperimentalCamera2Interop
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0Oo0oo f1089OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f1090OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00O000.OooO00o<Void> f1093OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f1087OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f1088OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f1092OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public OooO00o.C0004OooO00o f1091OooO0o = new OooO00o.C0004OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO f1094OooO0oo = new o0Oo0oo.OooO0OO() { // from class: Oooo0o.OooO
        /* JADX WARN: Code duplicated, block: B:11:0x0034  */
        @Override // Oooo00O.o0Oo0oo.OooO0OO
        public final boolean OooO00o(TotalCaptureResult totalCaptureResult) {
            o00O000.OooO00o<Void> oooO00o;
            Integer num;
            OooOOO0 oooOOO0 = this.f1075OooO00o;
            if (oooOOO0.f1093OooO0oO != null) {
                Object tag = totalCaptureResult.getRequest().getTag();
                if ((tag instanceof o00OO) && (num = (Integer) ((o00OO) tag).OooO00o("Camera2CameraControl")) != null && num.equals(Integer.valueOf(oooOOO0.f1093OooO0oO.hashCode()))) {
                    oooO00o = oooOOO0.f1093OooO0oO;
                    oooOOO0.f1093OooO0oO = null;
                } else {
                    oooO00o = null;
                }
            } else {
                oooO00o = null;
            }
            if (oooO00o == null) {
                return false;
            }
            oooO00o.OooO0O0(null);
            return false;
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [Oooo0o.OooO] */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OooOOO0(@NonNull o0Oo0oo o0oo0oo2, @NonNull o0O0O00 o0o0o00) {
        this.f1089OooO0OO = o0oo0oo2;
        this.f1090OooO0Oo = o0o0o00;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final OooO00o OooO00o() {
        OooO00o oooO00o;
        synchronized (this.f1092OooO0o0) {
            o00O000.OooO00o<Void> oooO00o2 = this.f1093OooO0oO;
            if (oooO00o2 != null) {
                this.f1091OooO0o.f434OooO00o.Oooo0oO(OooO00o.f433Oooo0o0, Integer.valueOf(oooO00o2.hashCode()));
            }
            OooO00o.C0004OooO00o c0004OooO00o = this.f1091OooO0o;
            c0004OooO00o.getClass();
            oooO00o = new OooO00o(o00O0.Oooo0O0(c0004OooO00o.f434OooO00o));
        }
        return oooO00o;
    }

    public final void OooO0O0(o00O000.OooO00o<Void> oooO00o) {
        this.f1088OooO0O0 = true;
        o00O000.OooO00o<Void> oooO00o2 = this.f1093OooO0oO;
        if (oooO00o2 == null) {
            oooO00o2 = null;
        }
        this.f1093OooO0oO = oooO00o;
        if (this.f1087OooO00o) {
            o0Oo0oo o0oo0oo2 = this.f1089OooO0OO;
            o0oo0oo2.getClass();
            o0oo0oo2.f840OooO0OO.execute(new o00Ooo(o0oo0oo2, 0));
            this.f1088OooO0O0 = false;
        }
        if (oooO00o2 != null) {
            oooO00o2.OooO0OO(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }
}
