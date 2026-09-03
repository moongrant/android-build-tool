package io.opentelemetry.sdk.trace.samplers;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.trace.data.LinkData;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
final class ParentBasedSampler implements Sampler {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Sampler f33052OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Sampler f33053OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Sampler f33054OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Sampler f33055OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Sampler f33056OooO0oo;

    public ParentBasedSampler(Sampler sampler) {
        this.f33052OooO0Oo = sampler;
        AlwaysOnSampler alwaysOnSampler = AlwaysOnSampler.INSTANCE;
        this.f33054OooO0o0 = alwaysOnSampler;
        AlwaysOffSampler alwaysOffSampler = AlwaysOffSampler.INSTANCE;
        this.f33053OooO0o = alwaysOffSampler;
        this.f33055OooO0oO = alwaysOnSampler;
        this.f33056OooO0oo = alwaysOffSampler;
    }

    @Override // io.opentelemetry.sdk.trace.samplers.Sampler
    public final SamplingResult OooO00o(Context context, String str, String str2, SpanKind spanKind, Attributes attributes, List<LinkData> list) {
        SpanContext spanContextOooO0O0 = io.opentelemetry.api.trace.OooO00o.OooO0O0(context).OooO0O0();
        if (!spanContextOooO0O0.isValid()) {
            return this.f33052OooO0Oo.OooO00o(context, str, str2, spanKind, attributes, list);
        }
        if (spanContextOooO0O0.OooO0o0()) {
            return spanContextOooO0O0.OooO00o() ? this.f33054OooO0o0.OooO00o(context, str, str2, spanKind, attributes, list) : this.f33053OooO0o.OooO00o(context, str, str2, spanKind, attributes, list);
        }
        return spanContextOooO0O0.OooO00o() ? this.f33055OooO0oO.OooO00o(context, str, str2, spanKind, attributes, list) : this.f33056OooO0oo.OooO00o(context, str, str2, spanKind, attributes, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentBasedSampler)) {
            return false;
        }
        ParentBasedSampler parentBasedSampler = (ParentBasedSampler) obj;
        return this.f33052OooO0Oo.equals(parentBasedSampler.f33052OooO0Oo) && this.f33054OooO0o0.equals(parentBasedSampler.f33054OooO0o0) && this.f33053OooO0o.equals(parentBasedSampler.f33053OooO0o) && this.f33055OooO0oO.equals(parentBasedSampler.f33055OooO0oO) && this.f33056OooO0oo.equals(parentBasedSampler.f33056OooO0oo);
    }

    @Override // io.opentelemetry.sdk.trace.samplers.Sampler
    public final String getDescription() {
        return String.format("ParentBased{root:%s,remoteParentSampled:%s,remoteParentNotSampled:%s,localParentSampled:%s,localParentNotSampled:%s}", this.f33052OooO0Oo.getDescription(), this.f33054OooO0o0.getDescription(), this.f33053OooO0o.getDescription(), this.f33055OooO0oO.getDescription(), this.f33056OooO0oo.getDescription());
    }

    public final int hashCode() {
        return this.f33056OooO0oo.hashCode() + ((this.f33055OooO0oO.hashCode() + ((this.f33053OooO0o.hashCode() + ((this.f33054OooO0o0.hashCode() + (this.f33052OooO0Oo.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return getDescription();
    }
}
