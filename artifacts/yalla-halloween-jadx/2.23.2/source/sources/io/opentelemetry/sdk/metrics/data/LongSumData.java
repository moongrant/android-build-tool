package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class LongSumData implements SumData<LongPointData> {
    public static LongSumData OooO0Oo(AggregationTemporality aggregationTemporality, ArrayList arrayList, boolean z) {
        return new AutoValue_LongSumData(aggregationTemporality, arrayList, z);
    }
}
