package io.opentelemetry.api.internal;

import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceState;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_ImmutableSpanContext extends ImmutableSpanContext {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f33032OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f33033OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TraceFlags f33034OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f33035OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TraceState f33036OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f33037OooO0oO;

    public AutoValue_ImmutableSpanContext(String str, String str2, TraceFlags traceFlags, TraceState traceState, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null traceId");
        }
        this.f33032OooO0O0 = str;
        if (str2 == null) {
            throw new NullPointerException("Null spanId");
        }
        this.f33033OooO0OO = str2;
        if (traceFlags == null) {
            throw new NullPointerException("Null traceFlags");
        }
        this.f33034OooO0Oo = traceFlags;
        if (traceState == null) {
            throw new NullPointerException("Null traceState");
        }
        this.f33036OooO0o0 = traceState;
        this.f33035OooO0o = false;
        this.f33037OooO0oO = z;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final String OooO0OO() {
        return this.f33033OooO0OO;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final String OooO0Oo() {
        return this.f33032OooO0O0;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final boolean OooO0o0() {
        return this.f33035OooO0o;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final TraceState OooO0oO() {
        return this.f33036OooO0o0;
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final TraceFlags OooO0oo() {
        return this.f33034OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSpanContext)) {
            return false;
        }
        ImmutableSpanContext immutableSpanContext = (ImmutableSpanContext) obj;
        if (this.f33032OooO0O0.equals(((AutoValue_ImmutableSpanContext) immutableSpanContext).f33032OooO0O0)) {
            AutoValue_ImmutableSpanContext autoValue_ImmutableSpanContext = (AutoValue_ImmutableSpanContext) immutableSpanContext;
            if (this.f33033OooO0OO.equals(autoValue_ImmutableSpanContext.f33033OooO0OO) && this.f33034OooO0Oo.equals(autoValue_ImmutableSpanContext.f33034OooO0Oo) && this.f33036OooO0o0.equals(autoValue_ImmutableSpanContext.f33036OooO0o0) && this.f33035OooO0o == autoValue_ImmutableSpanContext.f33035OooO0o && this.f33037OooO0oO == autoValue_ImmutableSpanContext.f33037OooO0oO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f33032OooO0O0.hashCode() ^ 1000003) * 1000003) ^ this.f33033OooO0OO.hashCode()) * 1000003) ^ this.f33034OooO0Oo.hashCode()) * 1000003) ^ this.f33036OooO0o0.hashCode()) * 1000003) ^ (this.f33035OooO0o ? 1231 : 1237)) * 1000003) ^ (this.f33037OooO0oO ? 1231 : 1237);
    }

    @Override // io.opentelemetry.api.trace.SpanContext
    public final boolean isValid() {
        return this.f33037OooO0oO;
    }

    public final String toString() {
        return "ImmutableSpanContext{traceId=" + this.f33032OooO0O0 + ", spanId=" + this.f33033OooO0OO + ", traceFlags=" + this.f33034OooO0Oo + ", traceState=" + this.f33036OooO0o0 + ", remote=" + this.f33035OooO0o + ", valid=" + this.f33037OooO0oO + "}";
    }
}
