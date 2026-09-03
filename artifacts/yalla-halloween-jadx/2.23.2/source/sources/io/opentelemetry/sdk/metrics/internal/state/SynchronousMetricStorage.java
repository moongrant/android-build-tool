package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.OooO0O0;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes5.dex */
public final class SynchronousMetricStorage<T> implements MetricStorage, WriteableMetricStorage {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MetricDescriptor f32857OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Aggregator<T> f32860OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AttributesProcessor f32861OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InstrumentProcessor<T> f32862OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final BoundStorageHandle f32863OooO0oO = new BoundStorageHandle() { // from class: io.opentelemetry.sdk.metrics.internal.state.SynchronousMetricStorage.1
        @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
        public final void OooO00o(Attributes attributes, Context context) {
            SynchronousMetricStorage.this.OooO00o(attributes, context);
        }

        @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
        public final void release() {
        }
    };

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ConcurrentHashMap<Attributes, AggregatorHandle<T>> f32858OooO0O0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ReentrantLock f32859OooO0OO = new ReentrantLock();

    public SynchronousMetricStorage(MetricDescriptor metricDescriptor, Aggregator<T> aggregator, InstrumentProcessor<T> instrumentProcessor, AttributesProcessor attributesProcessor) {
        this.f32857OooO00o = metricDescriptor;
        this.f32860OooO0Oo = aggregator;
        this.f32862OooO0o0 = instrumentProcessor;
        this.f32861OooO0o = attributesProcessor;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public final void OooO00o(Attributes attributes, Context context) {
        Objects.requireNonNull(attributes, "attributes");
        Attributes attributesOooO00o = this.f32861OooO0o.OooO00o(attributes, context);
        AggregatorHandle aggregatorHandleOooO0o0 = OooO0o0(attributesOooO00o);
        try {
            aggregatorHandleOooO0o0.OooO00o(attributesOooO00o, context);
        } finally {
            aggregatorHandleOooO0o0.release();
        }
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.WriteableMetricStorage
    public final BoundStorageHandle OooO0O0(Attributes attributes) {
        Objects.requireNonNull(attributes, "attributes");
        AttributesProcessor attributesProcessor = this.f32861OooO0o;
        return attributesProcessor.OooO0O0() ? this.f32863OooO0oO : OooO0o0(attributesProcessor.OooO00o(attributes, OooO0O0.OooO00o()));
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public final MetricDescriptor OooO0OO() {
        return this.f32857OooO00o;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.MetricStorage
    public final MetricData OooO0Oo(long j) {
        T tOooO0O0;
        this.f32859OooO0OO.lock();
        try {
            for (Map.Entry<Attributes, AggregatorHandle<T>> entry : this.f32858OooO0O0.entrySet()) {
                AtomicLong atomicLong = entry.getValue().f32789OooO00o;
                if (atomicLong.get() != 0 ? false : atomicLong.compareAndSet(0L, 1L)) {
                    this.f32858OooO0O0.remove(entry.getKey(), entry.getValue());
                }
                AggregatorHandle<T> value = entry.getValue();
                if (value.f32790OooO0O0) {
                    value.f32790OooO0O0 = false;
                    tOooO0O0 = value.OooO0O0();
                } else {
                    tOooO0O0 = null;
                }
                if (tOooO0O0 != null) {
                    InstrumentProcessor<T> instrumentProcessor = this.f32862OooO0o0;
                    Attributes key = entry.getKey();
                    HashMap map = instrumentProcessor.f32850OooO0Oo;
                    Object objPut = map.get(key);
                    if (objPut == null) {
                        objPut = map.put(key, tOooO0O0);
                    }
                    if (objPut != null) {
                        instrumentProcessor.f32850OooO0Oo.put(key, instrumentProcessor.f32847OooO00o.OooO0O0((T) objPut, tOooO0O0));
                    }
                }
            }
            return this.f32862OooO0o0.OooO00o(j);
        } finally {
            this.f32859OooO0OO.unlock();
        }
    }

    public final AggregatorHandle OooO0o0(Attributes attributes) {
        ConcurrentHashMap<Attributes, AggregatorHandle<T>> concurrentHashMap = this.f32858OooO0O0;
        AggregatorHandle<T> aggregatorHandle = concurrentHashMap.get(attributes);
        if (aggregatorHandle != null) {
            if ((aggregatorHandle.f32789OooO00o.addAndGet(2L) & 1) == 0) {
                return aggregatorHandle;
            }
        }
        AggregatorHandle<T> aggregatorHandleOooO0OO = this.f32860OooO0Oo.OooO0OO();
        while (true) {
            AggregatorHandle<T> aggregatorHandlePutIfAbsent = concurrentHashMap.putIfAbsent(attributes, aggregatorHandleOooO0OO);
            if (aggregatorHandlePutIfAbsent == null) {
                return aggregatorHandleOooO0OO;
            }
            if ((aggregatorHandlePutIfAbsent.f32789OooO00o.addAndGet(2L) & 1) == 0) {
                return aggregatorHandlePutIfAbsent;
            }
            concurrentHashMap.remove(attributes, aggregatorHandlePutIfAbsent);
        }
    }
}
