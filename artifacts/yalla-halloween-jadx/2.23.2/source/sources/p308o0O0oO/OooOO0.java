package p308o0O0oO;

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
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Trace f41781OooO00o;

    public OooOO0(@NonNull Trace trace) {
        this.f41781OooO00o = trace;
    }

    public final TraceMetric OooO00o() {
        List listUnmodifiableList;
        TraceMetric.OooO0O0 oooO0O0NewBuilder = TraceMetric.newBuilder();
        oooO0O0NewBuilder.OooOOO0(this.f41781OooO00o.f19973OooO0oO);
        oooO0O0NewBuilder.OooOO0O(this.f41781OooO00o.f19978OooOOO.f20004OooO0Oo);
        Trace trace = this.f41781OooO00o;
        Timer timer = trace.f19978OooOOO;
        Timer timer2 = trace.f19980OooOOOO;
        timer.getClass();
        oooO0O0NewBuilder.OooOO0o(timer2.f20005OooO0o0 - timer.f20005OooO0o0);
        for (Counter counter : this.f41781OooO00o.f19974OooO0oo.values()) {
            oooO0O0NewBuilder.OooO(counter.f19967OooO0o0.get(), counter.f19966OooO0Oo);
        }
        ArrayList arrayList = this.f41781OooO00o.f19976OooOO0O;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                oooO0O0NewBuilder.OooO0o(new OooOO0((Trace) it.next()).OooO00o());
            }
        }
        oooO0O0NewBuilder.OooO0oo(this.f41781OooO00o.getAttributes());
        Trace trace2 = this.f41781OooO00o;
        synchronized (trace2.f19975OooOO0) {
            ArrayList arrayList2 = new ArrayList();
            for (PerfSession perfSession : trace2.f19975OooOO0) {
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
