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
import p023Oooo00o.oO000o00;
import p028Oooo0oO.o00O0O0;
import p028Oooo0oO.o0O0o;
import p033OoooO0O.o0O0O00;
import p034OoooOO0.o00Ooo;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0OO0o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f819OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f820OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mCurrentZoomState")
    public final o0OO0o f821OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final MutableLiveData<o0O0o> f822OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f823OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final OooO0O0 f824OooO0o0;

    public class OooO00o implements o0Oo0oo.OooO0OO {
        public OooO00o() {
        }

        @Override // Oooo00O.o0Oo0oo.OooO0OO
        public final boolean OooO00o(@NonNull TotalCaptureResult totalCaptureResult) {
            o0OO0o00.this.f824OooO0o0.OooO00o(totalCaptureResult);
            return false;
        }
    }

    public interface OooO0O0 {
        void OooO00o(@NonNull TotalCaptureResult totalCaptureResult);

        void OooO0O0(float f, @NonNull o000Oo0.OooO00o<Void> oooO00o);

        float OooO0OO();

        void OooO0Oo();

        void OooO0o(@NonNull Oooo000.OooO00o.C0004OooO00o c0004OooO00o);

        float OooO0o0();
    }

    public o0OO0o00(@NonNull o0Oo0oo o0oo0oo2, @NonNull oO000o00 oo000o00, @NonNull o0O0O00 o0o0o00) {
        OooO00o oooO00o = new OooO00o();
        this.f819OooO00o = o0oo0oo2;
        this.f820OooO0O0 = o0o0o00;
        OooO0O0 oooO0O0OooO00o = OooO00o(oo000o00);
        this.f824OooO0o0 = oooO0O0OooO00o;
        o0OO0o o0oo0o2 = new o0OO0o(oooO0O0OooO00o.OooO0o0(), oooO0O0OooO00o.OooO0OO());
        this.f821OooO0OO = o0oo0o2;
        o0oo0o2.OooO0O0(1.0f);
        this.f822OooO0Oo = new MutableLiveData<>(o00Ooo.OooO0O0(o0oo0o2));
        o0oo0oo2.OooOO0(oooO00o);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public static OooO0O0 OooO00o(@NonNull oO000o00 oo000o00) {
        Range range;
        boolean z;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) oo000o00.OooO00o(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
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
        return z ? new OooO0o(oo000o00) : new o00Oo00(oo000o00);
    }

    public final void OooO0O0(o0O0o o0o0o) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        MutableLiveData<o0O0o> mutableLiveData = this.f822OooO0Oo;
        if (looperMyLooper == mainLooper) {
            mutableLiveData.setValue(o0o0o);
        } else {
            mutableLiveData.postValue(o0o0o);
        }
    }
}
