package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public interface Aggregator<T> {
    T OooO00o(long j);

    T OooO0O0(T t, T t2);

    AggregatorHandle<T> OooO0OO();

    @Nullable
    MetricData OooO0Oo(Map<Attributes, T> map, long j, long j2, long j3);

    boolean OooO0o0();
}
