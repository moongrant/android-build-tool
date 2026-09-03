package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.trace.TracerBuilder;
import io.opentelemetry.sdk.internal.ComponentRegistry;

/* JADX INFO: loaded from: classes5.dex */
class SdkTracerBuilder implements TracerBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComponentRegistry<SdkTracer> f32975OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f32976OooO0O0;

    public SdkTracerBuilder(ComponentRegistry<SdkTracer> componentRegistry, String str) {
        this.f32975OooO00o = componentRegistry;
        this.f32976OooO0O0 = str;
    }
}
