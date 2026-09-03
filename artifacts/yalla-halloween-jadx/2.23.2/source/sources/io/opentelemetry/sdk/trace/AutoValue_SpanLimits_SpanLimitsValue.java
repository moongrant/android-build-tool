package io.opentelemetry.sdk.trace;

import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_SpanLimits_SpanLimitsValue extends SpanLimits.SpanLimitsValue {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f32921OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f32922OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f32923OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f32924OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f32925OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f32926OooO0oO;

    public AutoValue_SpanLimits_SpanLimitsValue(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f32921OooO0O0 = i;
        this.f32922OooO0OO = i2;
        this.f32923OooO0Oo = i3;
        this.f32925OooO0o0 = i4;
        this.f32924OooO0o = i5;
        this.f32926OooO0oO = i6;
    }

    @Override // io.opentelemetry.sdk.trace.SpanLimits.SpanLimitsValue, io.opentelemetry.sdk.trace.SpanLimits
    public final int OooO00o() {
        return this.f32926OooO0oO;
    }

    @Override // io.opentelemetry.sdk.trace.SpanLimits
    public final int OooO0O0() {
        return this.f32921OooO0O0;
    }

    @Override // io.opentelemetry.sdk.trace.SpanLimits
    public final int OooO0OO() {
        return this.f32925OooO0o0;
    }

    @Override // io.opentelemetry.sdk.trace.SpanLimits
    public final int OooO0Oo() {
        return this.f32924OooO0o;
    }

    @Override // io.opentelemetry.sdk.trace.SpanLimits
    public final int OooO0o() {
        return this.f32923OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.trace.SpanLimits
    public final int OooO0o0() {
        return this.f32922OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpanLimits.SpanLimitsValue)) {
            return false;
        }
        SpanLimits.SpanLimitsValue spanLimitsValue = (SpanLimits.SpanLimitsValue) obj;
        return this.f32921OooO0O0 == spanLimitsValue.OooO0O0() && this.f32922OooO0OO == spanLimitsValue.OooO0o0() && this.f32923OooO0Oo == spanLimitsValue.OooO0o() && this.f32925OooO0o0 == spanLimitsValue.OooO0OO() && this.f32924OooO0o == spanLimitsValue.OooO0Oo() && this.f32926OooO0oO == spanLimitsValue.OooO00o();
    }

    public final int hashCode() {
        return ((((((((((this.f32921OooO0O0 ^ 1000003) * 1000003) ^ this.f32922OooO0OO) * 1000003) ^ this.f32923OooO0Oo) * 1000003) ^ this.f32925OooO0o0) * 1000003) ^ this.f32924OooO0o) * 1000003) ^ this.f32926OooO0oO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanLimitsValue{maxNumberOfAttributes=");
        sb.append(this.f32921OooO0O0);
        sb.append(", maxNumberOfEvents=");
        sb.append(this.f32922OooO0OO);
        sb.append(", maxNumberOfLinks=");
        sb.append(this.f32923OooO0Oo);
        sb.append(", maxNumberOfAttributesPerEvent=");
        sb.append(this.f32925OooO0o0);
        sb.append(", maxNumberOfAttributesPerLink=");
        sb.append(this.f32924OooO0o);
        sb.append(", maxAttributeValueLength=");
        return OooOO0.OooO00o(sb, this.f32926OooO0oO, "}");
    }
}
