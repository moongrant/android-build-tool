package p313o0O0oOO0;

import com.google.firebase.perf.v1.GaugeMetric;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final GaugeMetric f41854OooO00o;

    public Oooo0(GaugeMetric gaugeMetric) {
        this.f41854OooO00o = gaugeMetric;
    }

    @Override // p313o0O0oOO0.o00O0O
    public final boolean OooO00o() {
        GaugeMetric gaugeMetric = this.f41854OooO00o;
        return gaugeMetric.hasSessionId() && (gaugeMetric.getCpuMetricReadingsCount() > 0 || gaugeMetric.getAndroidMemoryReadingsCount() > 0 || (gaugeMetric.hasGaugeMetadata() && gaugeMetric.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb()));
    }
}
