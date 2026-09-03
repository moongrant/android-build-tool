package io.opentelemetry.sdk.metrics;

import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.metrics.internal.view.ViewRegistry;
import io.opentelemetry.sdk.metrics.internal.view.ViewRegistryBuilder;
import io.opentelemetry.sdk.metrics.view.View;
import io.opentelemetry.sdk.resources.Resource;

/* JADX INFO: loaded from: classes5.dex */
public final class SdkMeterProviderBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Clock f32701OooO00o = io.opentelemetry.sdk.common.OooO00o.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Resource f32702OooO0O0 = Resource.f32906OooO0OO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ViewRegistryBuilder f32703OooO0OO;

    public SdkMeterProviderBuilder() {
        View view = ViewRegistry.f32870OooO0O0;
        this.f32703OooO0OO = new ViewRegistryBuilder();
    }
}
