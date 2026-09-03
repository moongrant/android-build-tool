package io.opentelemetry.sdk.trace.samplers;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.common.OooO;
import io.opentelemetry.api.trace.TraceState;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
abstract class ImmutableSamplingResult implements SamplingResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SamplingResult f33582OooO00o = new AutoValue_ImmutableSamplingResult(SamplingDecision.RECORD_AND_SAMPLE, OooO.OooO0O0());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final SamplingResult f33583OooO0O0 = new AutoValue_ImmutableSamplingResult(SamplingDecision.DROP, OooO.OooO0O0());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final SamplingResult f33584OooO0OO = new AutoValue_ImmutableSamplingResult(SamplingDecision.RECORD_ONLY, OooO.OooO0O0());

    @Override // io.opentelemetry.sdk.trace.samplers.SamplingResult
    public final TraceState OooO0OO(TraceState traceState) {
        return traceState;
    }
}
