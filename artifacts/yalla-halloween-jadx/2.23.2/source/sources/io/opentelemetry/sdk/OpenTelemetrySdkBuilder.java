package io.opentelemetry.sdk;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.context.propagation.OooO00o;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SdkTracerProviderBuilder;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenTelemetrySdkBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ContextPropagators f32654OooO00o = OooO00o.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public SdkTracerProvider f32655OooO0O0;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.opentelemetry.sdk.trace.IdGenerator, java.lang.Enum] */
    public final OpenTelemetrySdk OooO00o() {
        if (this.f32655OooO0O0 == null) {
            Logger logger = SdkTracerProvider.f32977OooO0o;
            SdkTracerProviderBuilder sdkTracerProviderBuilder = new SdkTracerProviderBuilder();
            this.f32655OooO0O0 = new SdkTracerProvider(sdkTracerProviderBuilder.f32982OooO0O0, sdkTracerProviderBuilder.f32983OooO0OO, sdkTracerProviderBuilder.f32984OooO0Oo, sdkTracerProviderBuilder.f32986OooO0o0, sdkTracerProviderBuilder.f32985OooO0o, sdkTracerProviderBuilder.f32981OooO00o);
        }
        OpenTelemetrySdk openTelemetrySdk = new OpenTelemetrySdk(new OpenTelemetrySdk.ObfuscatedTracerProvider(this.f32655OooO0O0), this.f32654OooO00o);
        GlobalOpenTelemetry.OooO00o(openTelemetrySdk);
        return openTelemetrySdk;
    }
}
