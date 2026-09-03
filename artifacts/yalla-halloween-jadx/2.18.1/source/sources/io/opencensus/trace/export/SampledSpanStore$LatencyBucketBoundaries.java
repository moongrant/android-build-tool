package io.opencensus.trace.export;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ZERO_MICROSx10' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class SampledSpanStore$LatencyBucketBoundaries {
    private static final /* synthetic */ SampledSpanStore$LatencyBucketBoundaries[] $VALUES;
    public static final SampledSpanStore$LatencyBucketBoundaries MICROSx100_MILLIx1;
    public static final SampledSpanStore$LatencyBucketBoundaries MICROSx10_MICROSx100;
    public static final SampledSpanStore$LatencyBucketBoundaries MILLIx100_SECONDx1;
    public static final SampledSpanStore$LatencyBucketBoundaries MILLIx10_MILLIx100;
    public static final SampledSpanStore$LatencyBucketBoundaries MILLIx1_MILLIx10;
    public static final SampledSpanStore$LatencyBucketBoundaries SECONDx100_MAX;
    public static final SampledSpanStore$LatencyBucketBoundaries SECONDx10_SECONDx100;
    public static final SampledSpanStore$LatencyBucketBoundaries SECONDx1_SECONDx10;
    public static final SampledSpanStore$LatencyBucketBoundaries ZERO_MICROSx10;
    private final long latencyLowerNs;
    private final long latencyUpperNs;

    static {
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries = new SampledSpanStore$LatencyBucketBoundaries("ZERO_MICROSx10", 0, 0L, timeUnit.toNanos(10L));
        ZERO_MICROSx10 = sampledSpanStore$LatencyBucketBoundaries;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries2 = new SampledSpanStore$LatencyBucketBoundaries("MICROSx10_MICROSx100", 1, timeUnit.toNanos(10L), timeUnit.toNanos(100L));
        MICROSx10_MICROSx100 = sampledSpanStore$LatencyBucketBoundaries2;
        long nanos = timeUnit.toNanos(100L);
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries3 = new SampledSpanStore$LatencyBucketBoundaries("MICROSx100_MILLIx1", 2, nanos, timeUnit2.toNanos(1L));
        MICROSx100_MILLIx1 = sampledSpanStore$LatencyBucketBoundaries3;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries4 = new SampledSpanStore$LatencyBucketBoundaries("MILLIx1_MILLIx10", 3, timeUnit2.toNanos(1L), timeUnit2.toNanos(10L));
        MILLIx1_MILLIx10 = sampledSpanStore$LatencyBucketBoundaries4;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries5 = new SampledSpanStore$LatencyBucketBoundaries("MILLIx10_MILLIx100", 4, timeUnit2.toNanos(10L), timeUnit2.toNanos(100L));
        MILLIx10_MILLIx100 = sampledSpanStore$LatencyBucketBoundaries5;
        long nanos2 = timeUnit2.toNanos(100L);
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries6 = new SampledSpanStore$LatencyBucketBoundaries("MILLIx100_SECONDx1", 5, nanos2, timeUnit3.toNanos(1L));
        MILLIx100_SECONDx1 = sampledSpanStore$LatencyBucketBoundaries6;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries7 = new SampledSpanStore$LatencyBucketBoundaries("SECONDx1_SECONDx10", 6, timeUnit3.toNanos(1L), timeUnit3.toNanos(10L));
        SECONDx1_SECONDx10 = sampledSpanStore$LatencyBucketBoundaries7;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries8 = new SampledSpanStore$LatencyBucketBoundaries("SECONDx10_SECONDx100", 7, timeUnit3.toNanos(10L), timeUnit3.toNanos(100L));
        SECONDx10_SECONDx100 = sampledSpanStore$LatencyBucketBoundaries8;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries9 = new SampledSpanStore$LatencyBucketBoundaries("SECONDx100_MAX", 8, timeUnit3.toNanos(100L), Long.MAX_VALUE);
        SECONDx100_MAX = sampledSpanStore$LatencyBucketBoundaries9;
        $VALUES = new SampledSpanStore$LatencyBucketBoundaries[]{sampledSpanStore$LatencyBucketBoundaries, sampledSpanStore$LatencyBucketBoundaries2, sampledSpanStore$LatencyBucketBoundaries3, sampledSpanStore$LatencyBucketBoundaries4, sampledSpanStore$LatencyBucketBoundaries5, sampledSpanStore$LatencyBucketBoundaries6, sampledSpanStore$LatencyBucketBoundaries7, sampledSpanStore$LatencyBucketBoundaries8, sampledSpanStore$LatencyBucketBoundaries9};
    }

    public SampledSpanStore$LatencyBucketBoundaries(String str, int i, long j, long j2) {
        super(str, i);
        this.latencyLowerNs = j;
        this.latencyUpperNs = j2;
    }

    public static SampledSpanStore$LatencyBucketBoundaries valueOf(String str) {
        return (SampledSpanStore$LatencyBucketBoundaries) Enum.valueOf(SampledSpanStore$LatencyBucketBoundaries.class, str);
    }

    public static SampledSpanStore$LatencyBucketBoundaries[] values() {
        return (SampledSpanStore$LatencyBucketBoundaries[]) $VALUES.clone();
    }
}
