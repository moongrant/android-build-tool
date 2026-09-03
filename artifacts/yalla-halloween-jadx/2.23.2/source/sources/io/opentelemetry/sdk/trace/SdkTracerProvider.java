package io.opentelemetry.sdk.trace;

import androidx.media3.session.o000OO00;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerBuilder;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.compat.Function;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.internal.ComponentRegistry;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.samplers.Sampler;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class SdkTracerProvider implements TracerProvider, Closeable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Logger f32977OooO0o = Logger.getLogger(SdkTracerProvider.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TracerSharedState f32978OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ComponentRegistry<SdkTracer> f32979OooO0o0 = new ComponentRegistry<>(new Function() { // from class: io.opentelemetry.sdk.trace.OooO0O0
        @Override // io.opentelemetry.compat.Function
        public final Object apply(Object obj) {
            return new SdkTracer(this.f32943OooO00o.f32978OooO0Oo, (InstrumentationLibraryInfo) obj);
        }
    });

    public SdkTracerProvider(Clock clock, IdGenerator idGenerator, Resource resource, o000OO00 o000oo01, Sampler sampler, ArrayList arrayList) {
        this.f32978OooO0Oo = new TracerSharedState(clock, idGenerator, resource, o000oo01, sampler, arrayList);
    }

    public final Tracer OooO00o(String str) {
        SdkTracerBuilder sdkTracerBuilder = (SdkTracerBuilder) OooO0oO(str);
        sdkTracerBuilder.getClass();
        return sdkTracerBuilder.f32975OooO00o.OooO00o(sdkTracerBuilder.f32976OooO0O0, "1.0.0", null);
    }

    public final void OooO0OO(Sampler sampler) {
        this.f32978OooO0Oo.f33007OooO0oO = sampler;
    }

    public final TracerBuilder OooO0oO(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            f32977OooO0o.fine("Tracer requested without instrumentation name.");
            str = "";
        }
        return new SdkTracerBuilder(this.f32979OooO0o0, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CompletableResultCode completableResultCode;
        if (this.f32978OooO0Oo.f33000OooO != null) {
            f32977OooO0o.log(Level.WARNING, "Calling shutdown() multiple times.");
            completableResultCode = CompletableResultCode.f32659OooO0Oo;
        } else {
            TracerSharedState tracerSharedState = this.f32978OooO0Oo;
            synchronized (tracerSharedState.f33001OooO00o) {
                if (tracerSharedState.f33000OooO != null) {
                    completableResultCode = tracerSharedState.f33000OooO;
                } else {
                    tracerSharedState.f33000OooO = tracerSharedState.f33008OooO0oo.shutdown();
                    completableResultCode = tracerSharedState.f33000OooO;
                }
            }
        }
        completableResultCode.OooO0OO(10L, TimeUnit.SECONDS);
    }

    @Override // io.opentelemetry.api.trace.TracerProvider
    public final Tracer get() {
        throw null;
    }
}
