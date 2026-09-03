package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class DoubleHistogramData implements Data<DoubleHistogramPointData> {
    public static DoubleHistogramData OooO0Oo(AggregationTemporality aggregationTemporality, ArrayList arrayList) {
        return new AutoValue_DoubleHistogramData(aggregationTemporality, arrayList);
    }

    public abstract AggregationTemporality OooO0O0();
}
