package p313o0O0oOO0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Iterator;
import java.util.Map;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends o00O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O0O00 f41860OooO0O0 = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TraceMetric f41861OooO00o;

    public o0OoOo0(@NonNull TraceMetric traceMetric) {
        this.f41861OooO00o = traceMetric;
    }

    public static boolean OooO0Oo(@Nullable TraceMetric traceMetric, int i) {
        boolean z;
        if (traceMetric == null) {
            return false;
        }
        o0O0O00 o0o0o00 = f41860OooO0O0;
        if (i > 1) {
            o0o0o00.OooO0o("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : traceMetric.getCountersMap().entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                z = false;
            } else {
                String strTrim = key.trim();
                if (strTrim.isEmpty()) {
                    o0o0o00.OooO0o("counterId is empty");
                } else if (strTrim.length() > 100) {
                    o0o0o00.OooO0o("counterId exceeded max length 100");
                } else {
                    z = true;
                }
                z = false;
            }
            if (!z) {
                o0o0o00.OooO0o("invalid CounterId:" + entry.getKey());
                return false;
            }
            if (!(entry.getValue() != null)) {
                o0o0o00.OooO0o("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
        while (it.hasNext()) {
            if (!OooO0Oo(it.next(), i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    public static boolean OooO0o0(@Nullable TraceMetric traceMetric, int i) {
        boolean z;
        boolean z2;
        o0O0O00 o0o0o00 = f41860OooO0O0;
        if (traceMetric == null) {
            o0o0o00.OooO0o("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            o0o0o00.OooO0o("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String name = traceMetric.getName();
        if (name == null) {
            z = false;
        } else {
            String strTrim = name.trim();
            if (strTrim.isEmpty() || strTrim.length() > 100) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z) {
            o0o0o00.OooO0o("invalid TraceId:" + traceMetric.getName());
            return false;
        }
        if (!(traceMetric.getDurationUs() > 0)) {
            o0o0o00.OooO0o("invalid TraceDuration:" + traceMetric.getDurationUs());
            return false;
        }
        if (!traceMetric.hasClientStartTimeUs()) {
            o0o0o00.OooO0o("clientStartTimeUs is null.");
            return false;
        }
        if (traceMetric.getName().startsWith("_st_")) {
            Long l = traceMetric.getCountersMap().get(Constants$CounterNames.FRAMES_TOTAL.toString());
            if (!(l != null && l.compareTo((Long) 0L) > 0)) {
                o0o0o00.OooO0o("non-positive totalFrames in screen trace " + traceMetric.getName());
                return false;
            }
        }
        Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
        while (it.hasNext()) {
            if (!OooO0o0(it.next(), i + 1)) {
                return false;
            }
        }
        for (Map.Entry<String, String> entry : traceMetric.getCustomAttributesMap().entrySet()) {
            try {
                o00O0O.OooO0O0(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e) {
                o0o0o00.OooO0o(e.getLocalizedMessage());
                z2 = false;
            }
        }
        z2 = true;
        return z2;
    }

    @Override // p313o0O0oOO0.o00O0O
    public final boolean OooO00o() {
        boolean z;
        TraceMetric traceMetric = this.f41861OooO00o;
        boolean zOooO0o0 = OooO0o0(traceMetric, 0);
        o0O0O00 o0o0o00 = f41860OooO0O0;
        if (!zOooO0o0) {
            o0o0o00.OooO0o("Invalid Trace:" + traceMetric.getName());
            return false;
        }
        if (!(traceMetric.getCountersCount() > 0)) {
            Iterator<TraceMetric> it = traceMetric.getSubtracesList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (it.next().getCountersCount() > 0) {
                    z = true;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        if (!z || OooO0Oo(traceMetric, 0)) {
            return true;
        }
        o0o0o00.OooO0o("Invalid Counters for Trace:" + traceMetric.getName());
        return false;
    }
}
