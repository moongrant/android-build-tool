package p022Oooo00O;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.MutableLiveData;
import java.util.concurrent.Executor;
import p023Oooo00o.oO00O0o0;
import p028Oooo0oO.o00O0O0;
import p028Oooo0oO.o0O0o;
import p033OoooO0O.o0O0O00;
import p034OoooOO0.o00Ooo;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f810OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f811OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mCurrentZoomState")
    public final o0OOooO0 f812OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MutableLiveData<o0O0o> f813OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f814OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f815OooO0o0;

    public class OooO00o implements o0Oo0oo.OooO0OO {
        public OooO00o() {
        }

        @Override // Oooo00O.o0Oo0oo.OooO0OO
        public final boolean OooO00o(@NonNull TotalCaptureResult totalCaptureResult) {
            o0OO0O0.this.f815OooO0o0.OooO00o(totalCaptureResult);
            return false;
        }
    }

    public interface OooO0O0 {
        void OooO00o(@NonNull TotalCaptureResult totalCaptureResult);

        void OooO0O0(float f, @NonNull o00O000.OooO00o<Void> oooO00o);

        float OooO0OO();

        void OooO0Oo();

        void OooO0o(@NonNull Oooo000.OooO00o.C0004OooO00o c0004OooO00o);

        float OooO0o0();
    }

    public o0OO0O0(@NonNull o0Oo0oo o0oo0oo2, @NonNull oO00O0o0 oo00o0o0, @NonNull o0O0O00 o0o0o00) {
        OooO00o oooO00o = new OooO00o();
        this.f810OooO00o = o0oo0oo2;
        this.f811OooO0O0 = o0o0o00;
        OooO0O0 oooO0O0OooO00o = OooO00o(oo00o0o0);
        this.f815OooO0o0 = oooO0O0OooO00o;
        o0OOooO0 o0ooooo0 = new o0OOooO0(oooO0O0OooO00o.OooO0o0(), oooO0O0OooO00o.OooO0OO());
        this.f812OooO0OO = o0ooooo0;
        o0ooooo0.OooO0O0(1.0f);
        this.f813OooO0Oo = new MutableLiveData<>(o00Ooo.OooO0O0(o0ooooo0));
        o0oo0oo2.OooOO0(oooO00o);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public static OooO0O0 OooO00o(@NonNull oO00O0o0 oo00o0o0) {
        Range range;
        boolean z;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) oo00o0o0.OooO00o(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e) {
                o00O0O0.OooO("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                range = null;
            }
            if (range != null) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return z ? new OooO0o(oo00o0o0) : new o00Oo00(oo00o0o0);
    }

    public final void OooO0O0(o0O0o o0o0o) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        MutableLiveData<o0O0o> mutableLiveData = this.f813OooO0Oo;
        if (looperMyLooper == mainLooper) {
            mutableLiveData.setValue(o0o0o);
        } else {
            mutableLiveData.postValue(o0o0o);
        }
    }
}
