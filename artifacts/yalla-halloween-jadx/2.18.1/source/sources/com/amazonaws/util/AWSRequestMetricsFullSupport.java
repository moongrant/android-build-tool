package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.MetricType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AWSRequestMetricsFullSupport extends AWSRequestMetrics {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, List<Object>> f11169OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, TimingInfo> f11170OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f11166OooO0Oo = LogFactory.OooO0O0("com.amazonaws.latency");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f11168OooO0o0 = "=";

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f11167OooO0o = ", ";

    public AWSRequestMetricsFullSupport() {
        super(new TimingInfoFullSupport(Long.valueOf(System.currentTimeMillis()), System.nanoTime()));
        this.f11169OooO0O0 = new HashMap();
        this.f11170OooO0OO = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO00o(MetricType metricType, Object obj) {
        String strName = ((Enum) metricType).name();
        List<Object> arrayList = this.f11169OooO0O0.get(strName);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f11169OooO0O0.put(strName, arrayList);
        }
        arrayList.add(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.amazonaws.util.TimingInfo>] */
    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0O0(MetricType metricType) {
        String strName = ((Enum) metricType).name();
        TimingInfo timingInfo = (TimingInfo) this.f11170OooO0OO.get(strName);
        if (timingInfo == null) {
            LogFactory.OooO00o(getClass()).OooO("Trying to end an event which was never started: " + strName);
            return;
        }
        timingInfo.OooO0O0();
        TimingInfo timingInfo2 = this.f11165OooO00o;
        long j = timingInfo.f11187OooO00o;
        Long l = timingInfo.f11188OooO0O0;
        timingInfo2.OooO00o(strName, new TimingInfoUnmodifiable(j, Long.valueOf(l == null ? -1L : l.longValue())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0OO(MetricType metricType) {
        this.f11165OooO00o.OooO0o0(((Enum) metricType).name());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>] */
    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0Oo() {
        if (f11166OooO0Oo.OooO0o0()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : this.f11169OooO0O0.entrySet()) {
                OooO0oO(entry.getKey(), entry.getValue(), sb);
            }
            for (Map.Entry<String, Number> entry2 : this.f11165OooO00o.OooO0OO().entrySet()) {
                OooO0oO(entry2.getKey(), entry2.getValue(), sb);
            }
            for (Map.Entry<String, List<TimingInfo>> entry3 : this.f11165OooO00o.OooO0Oo().entrySet()) {
                OooO0oO(entry3.getKey(), entry3.getValue(), sb);
            }
            f11166OooO0Oo.OooO0o(sb.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0o(MetricType metricType) {
        this.f11170OooO0OO.put(((Enum) metricType).name(), new TimingInfoFullSupport(null, System.nanoTime()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0o0(MetricType metricType, long j) {
        this.f11165OooO00o.OooO0o(((Enum) metricType).name(), j);
    }

    public final void OooO0oO(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append((Object) f11168OooO0o0);
        sb.append(obj2);
        sb.append((Object) f11167OooO0o);
    }
}
