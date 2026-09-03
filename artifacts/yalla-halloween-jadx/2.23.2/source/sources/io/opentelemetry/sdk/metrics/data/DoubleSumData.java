package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class DoubleSumData implements SumData<DoublePointData> {
    public static DoubleSumData OooO0Oo(AggregationTemporality aggregationTemporality, ArrayList arrayList, boolean z) {
        return new AutoValue_DoubleSumData(aggregationTemporality, arrayList, z);
    }
}
