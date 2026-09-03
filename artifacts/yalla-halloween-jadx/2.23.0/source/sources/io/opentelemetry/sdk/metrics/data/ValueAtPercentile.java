package io.opentelemetry.sdk.metrics.data;

import com.google.auto.value.AutoValue;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class ValueAtPercentile {
    public static ValueAtPercentile OooO00o(double d, double d2) {
        return new AutoValue_ValueAtPercentile(d, d2);
    }

    public abstract double OooO0O0();

    public abstract double OooO0OO();
}
