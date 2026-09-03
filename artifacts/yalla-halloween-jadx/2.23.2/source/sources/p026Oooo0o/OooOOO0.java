package p026Oooo0o;

import Oooo000.OooO00o;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.o00O0O00;
import androidx.camera.core.impl.o00OOO0;
import java.util.concurrent.Executor;
import p022Oooo00O.OooOo00;
import p022Oooo00O.o0Oo0oo;
import p033OoooO0O.o0O0O00;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
@ExperimentalCamera2Interop
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0Oo0oo f1075OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f1076OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o000Oo0.OooO00o<Void> f1079OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f1073OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f1074OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f1078OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public OooO00o.C0004OooO00o f1077OooO0o = new OooO00o.C0004OooO00o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0O f1080OooO0oo = new o0Oo0oo.OooO0OO() { // from class: Oooo0o.OooOO0O
        /* JADX WARN: Code duplicated, block: B:11:0x0034  */
        @Override // Oooo00O.o0Oo0oo.OooO0OO
        public final boolean OooO00o(TotalCaptureResult totalCaptureResult) {
            o000Oo0.OooO00o<Void> oooO00o;
            Integer num;
            OooOOO0 oooOOO0 = this.f1071OooO00o;
            if (oooOOO0.f1079OooO0oO != null) {
                Object tag = totalCaptureResult.getRequest().getTag();
                if ((tag instanceof o00OOO0) && (num = (Integer) ((o00OOO0) tag).OooO00o("Camera2CameraControl")) != null && num.equals(Integer.valueOf(oooOOO0.f1079OooO0oO.hashCode()))) {
                    oooO00o = oooOOO0.f1079OooO0oO;
                    oooOOO0.f1079OooO0oO = null;
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

    /* JADX WARN: Type inference failed for: r0v3, types: [Oooo0o.OooOO0O] */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public OooOOO0(@NonNull o0Oo0oo o0oo0oo2, @NonNull o0O0O00 o0o0o00) {
        this.f1075OooO0OO = o0oo0oo2;
        this.f1076OooO0Oo = o0o0o00;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final OooO00o OooO00o() {
        OooO00o oooO00o;
        synchronized (this.f1078OooO0o0) {
            o000Oo0.OooO00o<Void> oooO00o2 = this.f1079OooO0oO;
            if (oooO00o2 != null) {
                this.f1077OooO0o.f433OooO00o.Oooo0oO(OooO00o.f432Oooo0o0, Integer.valueOf(oooO00o2.hashCode()));
            }
            OooO00o.C0004OooO00o c0004OooO00o = this.f1077OooO0o;
            c0004OooO00o.getClass();
            oooO00o = new OooO00o(o00O0O00.Oooo0O0(c0004OooO00o.f433OooO00o));
        }
        return oooO00o;
    }

    public final void OooO0O0(o000Oo0.OooO00o<Void> oooO00o) {
        this.f1074OooO0O0 = true;
        o000Oo0.OooO00o<Void> oooO00o2 = this.f1079OooO0oO;
        if (oooO00o2 == null) {
            oooO00o2 = null;
        }
        this.f1079OooO0oO = oooO00o;
        if (this.f1073OooO00o) {
            o0Oo0oo o0oo0oo2 = this.f1075OooO0OO;
            o0oo0oo2.getClass();
            o0oo0oo2.f847OooO0OO.execute(new OooOo00(o0oo0oo2));
            this.f1074OooO0O0 = false;
        }
        if (oooO00o2 != null) {
            oooO00o2.OooO0OO(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }
}
