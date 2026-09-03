package io.opentelemetry.sdk.trace.samplers;

import android.os.Build;
import com.common.support.apm.otlp.compat.NumbersKt;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.internal.OtelEncodingUtils;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.trace.data.LinkData;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
final class TraceIdRatioBasedSampler implements Sampler {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final SamplingResult f33591OooO0o = ImmutableSamplingResult.f33582OooO00o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final SamplingResult f33592OooO0oO = ImmutableSamplingResult.f33583OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f33593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f33594OooO0o0;

    public TraceIdRatioBasedSampler(double d, long j) {
        this.f33593OooO0Oo = j;
        this.f33594OooO0o0 = String.format("TraceIdRatioBased{%.6f}", Double.valueOf(d));
    }

    @Override // io.opentelemetry.sdk.trace.samplers.Sampler
    public final SamplingResult OooO00o(Context context, String str, String str2, SpanKind spanKind, Attributes attributes, List<LinkData> list) {
        char[] cArr = OtelEncodingUtils.f33044OooO00o;
        return Math.abs((((long) OtelEncodingUtils.OooO00o(str.charAt(30), str.charAt(31))) & 255) | ((((((((((long) OtelEncodingUtils.OooO00o(str.charAt(16), str.charAt(17))) & 255) << 56) | ((((long) OtelEncodingUtils.OooO00o(str.charAt(18), str.charAt(19))) & 255) << 48)) | ((((long) OtelEncodingUtils.OooO00o(str.charAt(20), str.charAt(21))) & 255) << 40)) | ((((long) OtelEncodingUtils.OooO00o(str.charAt(22), str.charAt(23))) & 255) << 32)) | ((((long) OtelEncodingUtils.OooO00o(str.charAt(24), str.charAt(25))) & 255) << 24)) | ((((long) OtelEncodingUtils.OooO00o(str.charAt(26), str.charAt(27))) & 255) << 16)) | ((((long) OtelEncodingUtils.OooO00o(str.charAt(28), str.charAt(29))) & 255) << 8))) < this.f33593OooO0Oo ? f33591OooO0o : f33592OooO0oO;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof TraceIdRatioBasedSampler) && this.f33593OooO0Oo == ((TraceIdRatioBasedSampler) obj).f33593OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.trace.samplers.Sampler
    public final String getDescription() {
        return this.f33594OooO0o0;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        long j = this.f33593OooO0Oo;
        return i >= 24 ? (int) ((j >>> 32) ^ j) : NumbersKt.hashCodeCompat(j);
    }

    public final String toString() {
        return this.f33594OooO0o0;
    }
}
