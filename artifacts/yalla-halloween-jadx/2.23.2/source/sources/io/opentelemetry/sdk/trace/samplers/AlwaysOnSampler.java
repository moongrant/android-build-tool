package io.opentelemetry.sdk.trace.samplers;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.trace.data.LinkData;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
enum AlwaysOnSampler implements Sampler {
    INSTANCE;

    @Override // io.opentelemetry.sdk.trace.samplers.Sampler
    public final SamplingResult OooO00o(Context context, String str, String str2, SpanKind spanKind, Attributes attributes, List<LinkData> list) {
        return ImmutableSamplingResult.f33049OooO00o;
    }

    @Override // io.opentelemetry.sdk.trace.samplers.Sampler
    public final String getDescription() {
        return "AlwaysOnSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOnSampler";
    }
}
