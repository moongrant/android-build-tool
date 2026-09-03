package io.opentelemetry.sdk.metrics.internal.state;

import com.google.auto.value.AutoValue;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.metrics.internal.view.ViewRegistry;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class MeterProviderSharedState {
    public static MeterProviderSharedState OooO00o(Clock clock, Resource resource, ViewRegistry viewRegistry) {
        return new AutoValue_MeterProviderSharedState(clock, resource, viewRegistry, clock.OooO00o());
    }

    public abstract Clock OooO0O0();

    public abstract Resource OooO0OO();

    public abstract long OooO0Oo();

    public abstract ViewRegistry OooO0o0();
}
