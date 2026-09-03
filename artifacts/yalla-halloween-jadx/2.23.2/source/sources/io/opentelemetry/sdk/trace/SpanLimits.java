package io.opentelemetry.sdk.trace;

import com.google.auto.value.AutoValue;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class SpanLimits {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SpanLimits f32993OooO00o;

    @AutoValue
    @Immutable
    public static abstract class SpanLimitsValue extends SpanLimits {
        @Override // io.opentelemetry.sdk.trace.SpanLimits
        public abstract int OooO00o();
    }

    static {
        SpanLimitsBuilder spanLimitsBuilder = new SpanLimitsBuilder();
        f32993OooO00o = new AutoValue_SpanLimits_SpanLimitsValue(spanLimitsBuilder.f32994OooO00o, spanLimitsBuilder.f32995OooO0O0, spanLimitsBuilder.f32996OooO0OO, spanLimitsBuilder.f32997OooO0Oo, spanLimitsBuilder.f32999OooO0o0, spanLimitsBuilder.f32998OooO0o);
    }

    @Deprecated
    public SpanLimits() {
    }

    public int OooO00o() {
        return Integer.MAX_VALUE;
    }

    public abstract int OooO0O0();

    public abstract int OooO0OO();

    public abstract int OooO0Oo();

    public abstract int OooO0o();

    public abstract int OooO0o0();
}
