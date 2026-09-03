package p678oooOO0;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.util.OooO;
import java.util.HashMap;
import java.util.Map;
import p308o0O0oO.OooO0o;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0O0O00 f60364OooO0o0 = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Activity f60365OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final FrameMetricsAggregator f60366OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Fragment, OooO0o> f60367OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f60368OooO0Oo;

    @VisibleForTesting
    public o000000() {
        throw null;
    }

    public o000000(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.f60368OooO0Oo = false;
        this.f60365OooO00o = activity;
        this.f60366OooO0O0 = frameMetricsAggregator;
        this.f60367OooO0OO = map;
    }

    public final OooO<OooO0o> OooO00o() {
        int i;
        int i2;
        boolean z = this.f60368OooO0Oo;
        o0O0O00 o0o0o00 = f60364OooO0o0;
        if (!z) {
            o0o0o00.OooO00o("No recording has been started.");
            return new OooO<>();
        }
        SparseIntArray[] sparseIntArrayArrOooO0O0 = this.f60366OooO0O0.f5234OooO00o.OooO0O0();
        if (sparseIntArrayArrOooO0O0 == null) {
            o0o0o00.OooO00o("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new OooO<>();
        }
        int i3 = 0;
        SparseIntArray sparseIntArray = sparseIntArrayArrOooO0O0[0];
        if (sparseIntArray == null) {
            o0o0o00.OooO00o("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new OooO<>();
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
        return new OooO<>(new OooO0o(i3, i, i2));
    }
}
