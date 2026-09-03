package kotlin.collections;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0014\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0016\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018\u001a*\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", ViewHierarchyConstants.DIMENSION_LEFT_KEY, "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m4670partitionnroSd4(long[] jArr, int i, int i2) {
        long j;
        long jM4449getsVKNKU = ULongArray.m4449getsVKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                j = jM4449getsVKNKU ^ Long.MIN_VALUE;
                if (Long.compare(ULongArray.m4449getsVKNKU(jArr, i) ^ Long.MIN_VALUE, j) >= 0) {
                    break;
                }
                i++;
            }
            while (Long.compare(ULongArray.m4449getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, j) > 0) {
                i2--;
            }
            if (i <= i2) {
                long jM4449getsVKNKU2 = ULongArray.m4449getsVKNKU(jArr, i);
                ULongArray.m4454setk8EXiF4(jArr, i, ULongArray.m4449getsVKNKU(jArr, i2));
                ULongArray.m4454setk8EXiF4(jArr, i2, jM4449getsVKNKU2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m4671partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte bM4291getw2LRezQ = UByteArray.m4291getw2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM4291getw2LRezQ = UByteArray.m4291getw2LRezQ(bArr, i) & UByte.MAX_VALUE;
                i3 = bM4291getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM4291getw2LRezQ, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UByteArray.m4291getw2LRezQ(bArr, i2) & UByte.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte bM4291getw2LRezQ2 = UByteArray.m4291getw2LRezQ(bArr, i);
                UByteArray.m4296setVurrAj0(bArr, i, UByteArray.m4291getw2LRezQ(bArr, i2));
                UByteArray.m4296setVurrAj0(bArr, i2, bM4291getw2LRezQ2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m4672partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short sM4554getMh2AYeg = UShortArray.m4554getMh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                int iM4554getMh2AYeg = UShortArray.m4554getMh2AYeg(sArr, i) & UShort.MAX_VALUE;
                i3 = sM4554getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM4554getMh2AYeg, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Intrinsics.compare(UShortArray.m4554getMh2AYeg(sArr, i2) & UShort.MAX_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short sM4554getMh2AYeg2 = UShortArray.m4554getMh2AYeg(sArr, i);
                UShortArray.m4559set01HTLdE(sArr, i, UShortArray.m4554getMh2AYeg(sArr, i2));
                UShortArray.m4559set01HTLdE(sArr, i2, sM4554getMh2AYeg2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m4673partitionoBK06Vg(int[] iArr, int i, int i2) {
        int i3;
        int iM4370getpVg5ArA = UIntArray.m4370getpVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = iM4370getpVg5ArA ^ Integer.MIN_VALUE;
                if (Integer.compare(UIntArray.m4370getpVg5ArA(iArr, i) ^ Integer.MIN_VALUE, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (Integer.compare(UIntArray.m4370getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                int iM4370getpVg5ArA2 = UIntArray.m4370getpVg5ArA(iArr, i);
                UIntArray.m4375setVXSXFK8(iArr, i, UIntArray.m4370getpVg5ArA(iArr, i2));
                UIntArray.m4375setVXSXFK8(iArr, i2, iM4370getpVg5ArA2);
                i++;
                i2--;
            }
        }
        return i;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m4674quickSortnroSd4(long[] jArr, int i, int i2) {
        int iM4670partitionnroSd4 = m4670partitionnroSd4(jArr, i, i2);
        int i3 = iM4670partitionnroSd4 - 1;
        if (i < i3) {
            m4674quickSortnroSd4(jArr, i, i3);
        }
        if (iM4670partitionnroSd4 < i2) {
            m4674quickSortnroSd4(jArr, iM4670partitionnroSd4, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m4675quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int iM4671partition4UcCI2c = m4671partition4UcCI2c(bArr, i, i2);
        int i3 = iM4671partition4UcCI2c - 1;
        if (i < i3) {
            m4675quickSort4UcCI2c(bArr, i, i3);
        }
        if (iM4671partition4UcCI2c < i2) {
            m4675quickSort4UcCI2c(bArr, iM4671partition4UcCI2c, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m4676quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int iM4672partitionAa5vz7o = m4672partitionAa5vz7o(sArr, i, i2);
        int i3 = iM4672partitionAa5vz7o - 1;
        if (i < i3) {
            m4676quickSortAa5vz7o(sArr, i, i3);
        }
        if (iM4672partitionAa5vz7o < i2) {
            m4676quickSortAa5vz7o(sArr, iM4672partitionAa5vz7o, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m4677quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int iM4673partitionoBK06Vg = m4673partitionoBK06Vg(iArr, i, i2);
        int i3 = iM4673partitionoBK06Vg - 1;
        if (i < i3) {
            m4677quickSortoBK06Vg(iArr, i, i3);
        }
        if (iM4673partitionoBK06Vg < i2) {
            m4677quickSortoBK06Vg(iArr, iM4673partitionoBK06Vg, i2);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m4678sortArraynroSd4(@NotNull long[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m4674quickSortnroSd4(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m4679sortArray4UcCI2c(@NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m4675quickSort4UcCI2c(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m4680sortArrayAa5vz7o(@NotNull short[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m4676quickSortAa5vz7o(array, i, i2 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m4681sortArrayoBK06Vg(@NotNull int[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        m4677quickSortoBK06Vg(array, i, i2 - 1);
    }
}
