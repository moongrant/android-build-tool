package o00000O;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {
    public static final int OooO00o(@NotNull List<OooOOO0> paragraphInfoList, int i) {
        byte b;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            OooOOO0 oooOOO0 = paragraphInfoList.get(i3);
            if (oooOOO0.f26785OooO0O0 > i) {
                b = 1;
            } else {
                b = oooOOO0.f26786OooO0OO <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int OooO0O0(@NotNull List<OooOOO0> paragraphInfoList, int i) {
        byte b;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            OooOOO0 oooOOO0 = paragraphInfoList.get(i3);
            if (oooOOO0.f26787OooO0Oo > i) {
                b = 1;
            } else {
                b = oooOOO0.f26789OooO0o0 <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int OooO0OO(@NotNull List<OooOOO0> paragraphInfoList, float f) {
        byte b;
        Intrinsics.checkNotNullParameter(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            OooOOO0 oooOOO0 = paragraphInfoList.get(i2);
            if (oooOOO0.f26788OooO0o > f) {
                b = 1;
            } else {
                b = oooOOO0.f26790OooO0oO <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }
}
