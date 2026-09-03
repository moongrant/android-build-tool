package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.metrics.data.PointData;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public interface SumData<T extends PointData> extends Data<T> {
    AggregationTemporality OooO0O0();

    boolean OooO0OO();
}
