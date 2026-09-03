package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.common.Attributes;
import java.util.Collections;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class DoubleSummaryPointData implements PointData {
    public static DoubleSummaryPointData OooO0OO(long j, long j2, Attributes attributes, long j3, double d, List<ValueAtPercentile> list) {
        return new AutoValue_DoubleSummaryPointData(j, j2, attributes, Collections.emptyList(), j3, d, list);
    }

    public abstract long OooO0o();

    public abstract List<ValueAtPercentile> OooO0oO();

    public abstract double OooO0oo();
}
