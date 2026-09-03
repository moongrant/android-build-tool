package p305o0O0o0oo;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.util.OooOO0;
import java.util.HashMap;
import java.util.Map;
import p307o0O0oO0.OooOOO0;
import p308o0O0oO0O.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooOOO0 f42437OooO0o0 = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Activity f42438OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final FrameMetricsAggregator f42439OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Fragment, o0OoOo0> f42440OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f42441OooO0Oo;

    @VisibleForTesting
    public o00oO0o() {
        throw null;
    }

    public o00oO0o(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.f42441OooO0Oo = false;
        this.f42438OooO00o = activity;
        this.f42439OooO0O0 = frameMetricsAggregator;
        this.f42440OooO0OO = map;
    }

    public final OooOO0<o0OoOo0> OooO00o() {
        int i;
        int i2;
        boolean z = this.f42441OooO0Oo;
        OooOOO0 oooOOO0 = f42437OooO0o0;
        if (!z) {
            oooOOO0.OooO00o("No recording has been started.");
            return new OooOO0<>();
        }
        SparseIntArray[] sparseIntArrayArrOooO0O0 = this.f42439OooO0O0.f5228OooO00o.OooO0O0();
        if (sparseIntArrayArrOooO0O0 == null) {
            oooOOO0.OooO00o("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new OooOO0<>();
        }
        int i3 = 0;
        SparseIntArray sparseIntArray = sparseIntArrayArrOooO0O0[0];
        if (sparseIntArray == null) {
            oooOOO0.OooO00o("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new OooOO0<>();
        }
        if (sparseIntArray != null) {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        } else {
            i = 0;
            i2 = 0;
        }
        return new OooOO0<>(new o0OoOo0(i3, i, i2));
    }
}
