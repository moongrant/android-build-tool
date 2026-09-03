package io.opentelemetry.sdk.trace.samplers;

import io.opentelemetry.api.common.Attributes;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_ImmutableSamplingResult extends ImmutableSamplingResult {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SamplingDecision f33580OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Attributes f33581OooO0o0;

    public AutoValue_ImmutableSamplingResult(SamplingDecision samplingDecision, Attributes attributes) {
        if (samplingDecision == null) {
            throw new NullPointerException("Null decision");
        }
        this.f33580OooO0Oo = samplingDecision;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f33581OooO0o0 = attributes;
    }

    @Override // io.opentelemetry.sdk.trace.samplers.SamplingResult
    public final Attributes OooO00o() {
        return this.f33581OooO0o0;
    }

    @Override // io.opentelemetry.sdk.trace.samplers.SamplingResult
    public final SamplingDecision OooO0O0() {
        return this.f33580OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSamplingResult)) {
            return false;
        }
        ImmutableSamplingResult immutableSamplingResult = (ImmutableSamplingResult) obj;
        return this.f33580OooO0Oo.equals(((AutoValue_ImmutableSamplingResult) immutableSamplingResult).f33580OooO0Oo) && this.f33581OooO0o0.equals(((AutoValue_ImmutableSamplingResult) immutableSamplingResult).f33581OooO0o0);
    }

    public final int hashCode() {
        return ((this.f33580OooO0Oo.hashCode() ^ 1000003) * 1000003) ^ this.f33581OooO0o0.hashCode();
    }

    public final String toString() {
        return "ImmutableSamplingResult{decision=" + this.f33580OooO0Oo + ", attributes=" + this.f33581OooO0o0 + "}";
    }
}
