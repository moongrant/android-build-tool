package io.opentelemetry.api.internal;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.trace.OooO0O0;
import io.opentelemetry.api.trace.OooO0OO;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceState;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class ImmutableSpanContext implements SpanContext {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SpanContext f33039OooO00o = OooO0O0("00000000000000000000000000000000", "0000000000000000", OooO0O0.OooO00o(), OooO0OO.OooO00o(), false);

    public static AutoValue_ImmutableSpanContext OooO0O0(String str, String str2, TraceFlags traceFlags, TraceState traceState, boolean z) {
        return new AutoValue_ImmutableSpanContext(str, str2, traceFlags, traceState, z);
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final byte[] OooO() {
        return OtelEncodingUtils.OooO0OO(32, ((AutoValue_ImmutableSpanContext) this).f33032OooO0O0);
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final boolean OooO00o() {
        return ((AutoValue_ImmutableSpanContext) this).OooO0oo().OooO00o();
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final byte[] OooO0o() {
        return OtelEncodingUtils.OooO0OO(16, ((AutoValue_ImmutableSpanContext) this).f33033OooO0OO);
    }
}
