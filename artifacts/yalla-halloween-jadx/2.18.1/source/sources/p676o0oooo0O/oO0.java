package p676o0oooo0O;

import kotlin.jvm.internal.Intrinsics;
import okio.SegmentedByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0 {
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int OooO00o(@NotNull SegmentedByteString segment, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(segment, "$this$segment");
        int[] binarySearch = segment.f53052OoooO0O;
        int i3 = i + 1;
        int i4 = 0;
        int length = segment.f53051OoooO0.length;
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        int i5 = length - 1;
        while (i4 <= i5) {
            i2 = (i4 + i5) >>> 1;
            int i6 = binarySearch[i2];
            if (i6 < i3) {
                i4 = i2 + 1;
            } else {
                if (i6 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                i5 = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }
}
