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
    public final ContextPropagators f33187OooO00o = OooO00o.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public SdkTracerProvider f33188OooO0O0;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.opentelemetry.sdk.trace.IdGenerator, java.lang.Enum] */
    public final OpenTelemetrySdk OooO00o() {
        if (this.f33188OooO0O0 == null) {
            Logger logger = SdkTracerProvider.f33509OooO0o;
            SdkTracerProviderBuilder sdkTracerProviderBuilder = new SdkTracerProviderBuilder();
            this.f33188OooO0O0 = new SdkTracerProvider(sdkTracerProviderBuilder.f33514OooO0O0, sdkTracerProviderBuilder.f33515OooO0OO, sdkTracerProviderBuilder.f33516OooO0Oo, sdkTracerProviderBuilder.f33518OooO0o0, sdkTracerProviderBuilder.f33517OooO0o, sdkTracerProviderBuilder.f33513OooO00o);
        }
        OpenTelemetrySdk openTelemetrySdk = new OpenTelemetrySdk(new OpenTelemetrySdk.ObfuscatedTracerProvider(this.f33188OooO0O0), this.f33187OooO00o);
        GlobalOpenTelemetry.OooO00o(openTelemetrySdk);
        return openTelemetrySdk;
    }
}
