package p658o0oooO0;

import kotlin.jvm.internal.Intrinsics;
import okio.SegmentedByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO000 {
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int OooO00o(@NotNull SegmentedByteString segmentedByteString, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(segmentedByteString, "<this>");
        int[] iArr = segmentedByteString.f60870OooO;
        int i3 = i + 1;
        int length = segmentedByteString.f60871OooO0oo.length;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (i5 <= i4) {
            i2 = (i5 + i4) >>> 1;
            int i6 = iArr[i2];
            if (i6 < i3) {
                i5 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i4 = i2 - 1;
            }
        }
        i2 = (-i5) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
