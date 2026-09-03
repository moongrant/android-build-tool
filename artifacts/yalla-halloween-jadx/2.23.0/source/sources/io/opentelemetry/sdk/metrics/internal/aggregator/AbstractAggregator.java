package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractAggregator<T> implements Aggregator<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Resource f33315OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InstrumentationLibraryInfo f33316OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MetricDescriptor f33317OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f33318OooO0Oo;

    public AbstractAggregator(Resource resource, InstrumentationLibraryInfo instrumentationLibraryInfo, MetricDescriptor metricDescriptor, boolean z) {
        this.f33315OooO00o = resource;
        this.f33316OooO0O0 = instrumentationLibraryInfo;
        this.f33317OooO0OO = metricDescriptor;
        this.f33318OooO0Oo = z;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public Object OooO00o(long j) {
        throw new UnsupportedOperationException("This aggregator does not support recording long values.");
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public final boolean OooO0o0() {
        return this.f33318OooO0Oo;
    }
}
