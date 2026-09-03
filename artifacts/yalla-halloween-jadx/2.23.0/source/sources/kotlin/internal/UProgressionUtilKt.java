package kotlin.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m5429differenceModuloWZ9TVnA(int i, int i2, int i3) {
        long j = ((long) i3) & 4294967295L;
        int i4 = (int) ((((long) i) & 4294967295L) % j);
        int i5 = (int) ((((long) i2) & 4294967295L) % j);
        int iCompare = Integer.compare(i4 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i5);
        int iM4308constructorimpl = UInt.m4308constructorimpl(i4 - i5);
        return iCompare >= 0 ? iM4308constructorimpl : UInt.m4308constructorimpl(iM4308constructorimpl + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m5430differenceModulosambcqE(long j, long j2, long j3) {
        if (j3 < 0) {
            if ((j ^ Long.MIN_VALUE) >= (j3 ^ Long.MIN_VALUE)) {
                j -= j3;
            }
        } else if (j >= 0) {
            j %= j3;
        } else {
            long j4 = j - ((((j >>> 1) / j3) << 1) * j3);
            j = j4 - ((j4 ^ Long.MIN_VALUE) >= (j3 ^ Long.MIN_VALUE) ? j3 : 0L);
        }
        if (j3 < 0) {
            if ((j2 ^ Long.MIN_VALUE) >= (j3 ^ Long.MIN_VALUE)) {
                j2 -= j3;
            }
        } else if (j2 >= 0) {
            j2 %= j3;
        } else {
            long j5 = j2 - ((((j2 >>> 1) / j3) << 1) * j3);
            j2 = j5 - ((j5 ^ Long.MIN_VALUE) >= (j3 ^ Long.MIN_VALUE) ? j3 : 0L);
        }
        int iCompare = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        long jM4387constructorimpl = ULong.m4387constructorimpl(j - j2);
        return iCompare >= 0 ? jM4387constructorimpl : ULong.m4387constructorimpl(jM4387constructorimpl + j3);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m5431getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j2 : ULong.m4387constructorimpl(j2 - m5430differenceModulosambcqE(j2, j, ULong.m4387constructorimpl(j3)));
        }
        if (j3 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j2 : ULong.m4387constructorimpl(j2 + m5430differenceModulosambcqE(j, j2, ULong.m4387constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m5432getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return Integer.compare(i ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i2) >= 0 ? i2 : UInt.m4308constructorimpl(i2 - m5429differenceModuloWZ9TVnA(i2, i, UInt.m4308constructorimpl(i3)));
        }
        if (i3 < 0) {
            return Integer.compare(i ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i2) <= 0 ? i2 : UInt.m4308constructorimpl(i2 + m5429differenceModuloWZ9TVnA(i, i2, UInt.m4308constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
