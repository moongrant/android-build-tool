package io.opencensus.trace.export;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

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
/* JADX INFO: loaded from: classes5.dex */
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
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries = new SampledSpanStore$LatencyBucketBoundaries("ZERO_MICROSx10", 0L, timeUnit.toNanos(10L), 0);
        ZERO_MICROSx10 = sampledSpanStore$LatencyBucketBoundaries;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries2 = new SampledSpanStore$LatencyBucketBoundaries("MICROSx10_MICROSx100", timeUnit.toNanos(10L), timeUnit.toNanos(100L), 1);
        MICROSx10_MICROSx100 = sampledSpanStore$LatencyBucketBoundaries2;
        long nanos = timeUnit.toNanos(100L);
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries3 = new SampledSpanStore$LatencyBucketBoundaries("MICROSx100_MILLIx1", nanos, timeUnit2.toNanos(1L), 2);
        MICROSx100_MILLIx1 = sampledSpanStore$LatencyBucketBoundaries3;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries4 = new SampledSpanStore$LatencyBucketBoundaries("MILLIx1_MILLIx10", timeUnit2.toNanos(1L), timeUnit2.toNanos(10L), 3);
        MILLIx1_MILLIx10 = sampledSpanStore$LatencyBucketBoundaries4;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries5 = new SampledSpanStore$LatencyBucketBoundaries("MILLIx10_MILLIx100", timeUnit2.toNanos(10L), timeUnit2.toNanos(100L), 4);
        MILLIx10_MILLIx100 = sampledSpanStore$LatencyBucketBoundaries5;
        long nanos2 = timeUnit2.toNanos(100L);
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries6 = new SampledSpanStore$LatencyBucketBoundaries("MILLIx100_SECONDx1", nanos2, timeUnit3.toNanos(1L), 5);
        MILLIx100_SECONDx1 = sampledSpanStore$LatencyBucketBoundaries6;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries7 = new SampledSpanStore$LatencyBucketBoundaries("SECONDx1_SECONDx10", timeUnit3.toNanos(1L), timeUnit3.toNanos(10L), 6);
        SECONDx1_SECONDx10 = sampledSpanStore$LatencyBucketBoundaries7;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries8 = new SampledSpanStore$LatencyBucketBoundaries("SECONDx10_SECONDx100", timeUnit3.toNanos(10L), timeUnit3.toNanos(100L), 7);
        SECONDx10_SECONDx100 = sampledSpanStore$LatencyBucketBoundaries8;
        SampledSpanStore$LatencyBucketBoundaries sampledSpanStore$LatencyBucketBoundaries9 = new SampledSpanStore$LatencyBucketBoundaries("SECONDx100_MAX", timeUnit3.toNanos(100L), LongCompanionObject.MAX_VALUE, 8);
        SECONDx100_MAX = sampledSpanStore$LatencyBucketBoundaries9;
        $VALUES = new SampledSpanStore$LatencyBucketBoundaries[]{sampledSpanStore$LatencyBucketBoundaries, sampledSpanStore$LatencyBucketBoundaries2, sampledSpanStore$LatencyBucketBoundaries3, sampledSpanStore$LatencyBucketBoundaries4, sampledSpanStore$LatencyBucketBoundaries5, sampledSpanStore$LatencyBucketBoundaries6, sampledSpanStore$LatencyBucketBoundaries7, sampledSpanStore$LatencyBucketBoundaries8, sampledSpanStore$LatencyBucketBoundaries9};
    }

    public SampledSpanStore$LatencyBucketBoundaries(String str, long j, long j2, int i) {
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
