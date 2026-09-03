package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class DoubleSummaryData implements Data<DoubleSummaryPointData> {
    public static DoubleSummaryData OooO0Oo(ArrayList arrayList) {
        return new AutoValue_DoubleSummaryData(arrayList);
    }
}
