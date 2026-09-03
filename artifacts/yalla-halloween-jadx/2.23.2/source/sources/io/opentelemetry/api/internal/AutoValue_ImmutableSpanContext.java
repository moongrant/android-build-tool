package io.opentelemetry.api.internal;

import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceState;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_ImmutableSpanContext extends ImmutableSpanContext {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f32497OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f32498OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TraceFlags f32499OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f32500OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TraceState f32501OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f32502OooO0oO;

    public AutoValue_ImmutableSpanContext(String str, String str2, TraceFlags traceFlags, TraceState traceState, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null traceId");
        }
        this.f32497OooO0O0 = str;
        if (str2 == null) {
            throw new NullPointerException("Null spanId");
        }
        this.f32498OooO0OO = str2;
        if (traceFlags == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f32499OooO0Oo = traceFlags;
        if (traceState == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f32501OooO0o0 = traceState;
        this.f32500OooO0o = false;
        this.f32502OooO0oO = z;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final String OooO0OO() {
        return this.f32498OooO0OO;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final String OooO0Oo() {
        return this.f32497OooO0O0;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final boolean OooO0o0() {
        return this.f32500OooO0o;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final TraceState OooO0oO() {
        return this.f32501OooO0o0;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final TraceFlags OooO0oo() {
        return this.f32499OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSpanContext)) {
            return false;
        }
        ImmutableSpanContext immutableSpanContext = (ImmutableSpanContext) obj;
        if (this.f32497OooO0O0.equals(((AutoValue_ImmutableSpanContext) immutableSpanContext).f32497OooO0O0)) {
            AutoValue_ImmutableSpanContext autoValue_ImmutableSpanContext = (AutoValue_ImmutableSpanContext) immutableSpanContext;
            if (this.f32498OooO0OO.equals(autoValue_ImmutableSpanContext.f32498OooO0OO) && this.f32499OooO0Oo.equals(autoValue_ImmutableSpanContext.f32499OooO0Oo) && this.f32501OooO0o0.equals(autoValue_ImmutableSpanContext.f32501OooO0o0) && this.f32500OooO0o == autoValue_ImmutableSpanContext.f32500OooO0o && this.f32502OooO0oO == autoValue_ImmutableSpanContext.f32502OooO0oO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f32497OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f32498OooO0OO.hashCode()) * 1000003) ^ this.f32499OooO0Oo.hashCode()) * 1000003) ^ this.f32501OooO0o0.hashCode()) * 1000003) ^ (this.f32500OooO0o ? 1231 : 1237)) * 1000003) ^ (this.f32502OooO0oO ? 1231 : 1237);
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final boolean isValid() {
        return this.f32502OooO0oO;
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=" + this.f32497OooO0O0 + ", spanId=" + this.f32498OooO0OO + ", traceFlags=" + this.f32499OooO0Oo + ", traceState=" + this.f32501OooO0o0 + ", remote=" + this.f32500OooO0o + ", valid=" + this.f32502OooO0oO + "}";
    }
}
