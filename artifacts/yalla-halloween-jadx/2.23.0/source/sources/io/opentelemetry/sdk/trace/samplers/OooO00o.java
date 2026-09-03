package io.opentelemetry.sdk.trace.samplers;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o {
    public static Sampler OooO00o() {
        return AlwaysOnSampler.INSTANCE;
    }

    public static Sampler OooO0O0(Sampler sampler) {
        return new ParentBasedSampler(sampler);
    }

    public static Sampler OooO0OO(double d) {
        long j;
        SamplingResult samplingResult = TraceIdRatioBasedSampler.f33591OooO0o;
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("ratio must be in range [0.0, 1.0]");
        }
        if (d == 0.0d) {
            j = Long.MIN_VALUE;
        } else {
            j = d == 1.0d ? LongCompanionObject.MAX_VALUE : (long) (9.223372036854776E18d * d);
        }
        return new TraceIdRatioBasedSampler(d, j);
    }
}
