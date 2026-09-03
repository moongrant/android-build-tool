package p309o0O0oO0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000 extends oo0oOO0<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static o00O000 f41794OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<Long, String> f41795OooO0O0 = Collections.unmodifiableMap(new OooO00o());

    public class OooO00o extends HashMap<Long, String> {
        public OooO00o() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    @Override // p309o0O0oO0.oo0oOO0
    public final String OooO00o() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // p309o0O0oO0.oo0oOO0
    public final String OooO0OO() {
        return "fpr_log_source";
    }
}
