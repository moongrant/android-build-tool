package p309o0O0oO0o;

import com.google.firebase.perf.v1.GaugeMetric;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final GaugeMetric f42500OooO00o;

    public oo000o(GaugeMetric gaugeMetric) {
        this.f42500OooO00o = gaugeMetric;
    }

    @Override // p309o0O0oO0o.o0OOO0o
    public final boolean OooO00o() {
        GaugeMetric gaugeMetric = this.f42500OooO00o;
        return gaugeMetric.hasSessionId() && (gaugeMetric.getCpuMetricReadingsCount() > 0 || gaugeMetric.getAndroidMemoryReadingsCount() > 0 || (gaugeMetric.hasGaugeMetadata() && gaugeMetric.getGaugeMetadata().hasMaxAppJavaHeapMemoryKb()));
    }
}
