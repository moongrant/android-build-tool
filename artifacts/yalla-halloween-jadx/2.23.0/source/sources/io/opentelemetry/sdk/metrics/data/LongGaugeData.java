package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class LongGaugeData implements GaugeData<LongPointData> {
    public static LongGaugeData OooO0Oo(ArrayList arrayList) {
        return new AutoValue_LongGaugeData(arrayList);
    }
}
