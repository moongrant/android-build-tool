package io.opentelemetry.sdk;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerBuilder;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public final class OpenTelemetrySdk implements OpenTelemetry {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ObfuscatedTracerProvider f33184OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ContextPropagators f33185OooO0O0;

    @ThreadSafe
    public static class ObfuscatedTracerProvider implements TracerProvider {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final SdkTracerProvider f33186OooO0Oo;

        public ObfuscatedTracerProvider(SdkTracerProvider sdkTracerProvider) {
            this.f33186OooO0Oo = sdkTracerProvider;
        }

        public final Tracer OooO00o(String str) {
            return this.f33186OooO0Oo.OooO00o(str);
        }

        public final TracerBuilder OooO0O0(String str) {
            return this.f33186OooO0Oo.OooO0oO(str);
        }

        @Override // io.opentelemetry.api.trace.TracerProvider
        public final Tracer get() {
            throw null;
        }
    }

    public OpenTelemetrySdk(ObfuscatedTracerProvider obfuscatedTracerProvider, ContextPropagators contextPropagators) {
        this.f33184OooO00o = obfuscatedTracerProvider;
        this.f33185OooO0O0 = contextPropagators;
    }

    public final Tracer OooO00o(String str) {
        return this.f33184OooO00o.OooO00o(str);
    }

    public final TracerBuilder OooO0O0(String str) {
        return this.f33184OooO00o.OooO0O0(str);
    }
}
