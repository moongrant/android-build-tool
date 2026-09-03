package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.metrics.ObservableDoubleMeasurement;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public final class AsynchronousMetricStorage implements MetricStorage {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MetricDescriptor f33368OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ReentrantLock f33369OooO0O0 = new ReentrantLock();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InstrumentProcessor<?> f33370OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Runnable f33371OooO0Oo;

    /* JADX INFO: renamed from: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage$1, reason: invalid class name */
    class AnonymousClass1 implements ObservableDoubleMeasurement {
    }

    public AsynchronousMetricStorage(MetricDescriptor metricDescriptor, InstrumentProcessor instrumentProcessor, OooO00o oooO00o) {
        this.f33368OooO00o = metricDescriptor;
        this.f33370OooO0OO = instrumentProcessor;
        this.f33371OooO0Oo = oooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public final MetricDescriptor OooO0OO() {
        return this.f33368OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public final MetricData OooO0Oo(long j) {
        ReentrantLock reentrantLock = this.f33369OooO0O0;
        reentrantLock.lock();
        try {
            this.f33371OooO0Oo.run();
            return this.f33370OooO0OO.OooO00o(j);
        } finally {
            reentrantLock.unlock();
        }
    }
}
