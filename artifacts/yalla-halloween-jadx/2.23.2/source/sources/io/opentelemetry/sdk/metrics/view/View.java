package io.opentelemetry.sdk.metrics.view;

import com.google.auto.value.AutoValue;
import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class View {
    public abstract Aggregation OooO00o();

    public abstract AttributesProcessor OooO0O0();

    @Nullable
    public abstract String OooO0OO();

    @Nullable
    public abstract String OooO0Oo();
}
