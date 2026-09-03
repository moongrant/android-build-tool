package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.trace.OooO0o;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.TracerProvider;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;

/* JADX INFO: loaded from: classes5.dex */
final class SdkTracer implements Tracer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TracerSharedState f32973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InstrumentationLibraryInfo f32974OooO0O0;

    public SdkTracer(TracerSharedState tracerSharedState, InstrumentationLibraryInfo instrumentationLibraryInfo) {
        this.f32973OooO00o = tracerSharedState;
        this.f32974OooO0O0 = instrumentationLibraryInfo;
    }

    @Override // io.opentelemetry.api.trace.Tracer
    public final SpanBuilder OooO00o(String str) {
        if (str == null || str.trim().isEmpty()) {
            str = "<unspecified span name>";
        }
        TracerSharedState tracerSharedState = this.f32973OooO00o;
        boolean z = tracerSharedState.f33000OooO != null;
        InstrumentationLibraryInfo instrumentationLibraryInfo = this.f32974OooO0O0;
        if (!z) {
            return new SdkSpanBuilder(str, instrumentationLibraryInfo, tracerSharedState, tracerSharedState.f33005OooO0o.get());
        }
        TracerProvider tracerProviderOooO00o = OooO0o.OooO00o();
        instrumentationLibraryInfo.OooO0O0();
        return tracerProviderOooO00o.get().OooO00o(str);
    }
}
