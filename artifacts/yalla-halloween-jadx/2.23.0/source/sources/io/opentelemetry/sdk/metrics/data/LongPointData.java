package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.common.Attributes;
import java.util.Collections;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class LongPointData implements PointData {
    public static LongPointData OooO0o0(long j, long j2, Attributes attributes, long j3) {
        return new AutoValue_LongPointData(j, j2, j3, attributes, Collections.emptyList());
    }

    public abstract long OooO0o();
}
