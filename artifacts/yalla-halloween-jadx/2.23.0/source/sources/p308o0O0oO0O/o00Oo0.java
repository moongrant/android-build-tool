package p308o0O0oO0O;

import androidx.annotation.NonNull;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Trace f42489OooO00o;

    public o00Oo0(@NonNull Trace trace) {
        this.f42489OooO00o = trace;
    }

    public final TraceMetric OooO00o() {
        List listUnmodifiableList;
        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
        oooO0O0NewBuilder.OooOOO0(this.f42489OooO00o.f20445OooO0oO);
        oooO0O0NewBuilder.OooOO0O(this.f42489OooO00o.f20450OooOOO.f20477OooO0Oo);
        Trace trace = this.f42489OooO00o;
        Timer timer = trace.f20450OooOOO;
        Timer timer2 = trace.f20452OooOOOO;
        timer.getClass();
        oooO0O0NewBuilder.OooOO0o(timer2.f20478OooO0o0 - timer.f20478OooO0o0);
        for (Counter counter : this.f42489OooO00o.f20446OooO0oo.values()) {
            oooO0O0NewBuilder.OooO(counter.f20439OooO0o0.get(), counter.f20438OooO0Oo);
        }
        ArrayList arrayList = this.f42489OooO00o.f20448OooOO0O;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                oooO0O0NewBuilder.OooO0o(new o00Oo0((Trace) it.next()).OooO00o());
            }
        }
        oooO0O0NewBuilder.OooO0oo(this.f42489OooO00o.getAttributes());
        Trace trace2 = this.f42489OooO00o;
        synchronized (trace2.f20447OooOO0) {
            ArrayList arrayList2 = new ArrayList();
            for (PerfSession perfSession : trace2.f20447OooOO0) {
                if (perfSession != null) {
                    arrayList2.add(perfSession);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArrOooO0O0 = PerfSession.OooO0O0(listUnmodifiableList);
        if (perfSessionArrOooO0O0 != null) {
            oooO0O0NewBuilder.OooO0O0(Arrays.asList(perfSessionArrOooO0O0));
        }
        return oooO0O0NewBuilder.build();
    }
}
