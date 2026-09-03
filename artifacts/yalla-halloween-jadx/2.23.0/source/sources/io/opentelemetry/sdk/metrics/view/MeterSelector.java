package io.opentelemetry.sdk.metrics.view;

import com.google.auto.value.AutoValue;
import io.opentelemetry.compat.Predicate;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class MeterSelector {

    @AutoValue.Builder
    public static abstract class Builder {
    }

    public abstract Predicate<String> OooO00o();

    public abstract Predicate<String> OooO0O0();

    public abstract Predicate<String> OooO0OO();
}
