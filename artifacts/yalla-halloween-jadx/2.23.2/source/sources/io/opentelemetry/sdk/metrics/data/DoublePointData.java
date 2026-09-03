package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.common.Attributes;
import java.util.Collections;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class DoublePointData implements PointData {
    public static DoublePointData OooO0OO(long j, long j2, Attributes attributes, double d) {
        return new AutoValue_DoublePointData(d, j, j2, attributes, Collections.emptyList());
    }

    public abstract double OooO0o();
}
