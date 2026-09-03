package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO extends OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static OooO f6282OooO0OO;

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO00o(int i) {
        int length = OooO0Oo().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && OooO0Oo().charAt(i) == '\n' && !OooO0oO(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !OooO0o(i2)) {
            i2++;
        }
        return OooO0OO(i, i2);
    }

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO0O0(int i) {
        int length = OooO0Oo().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            int i2 = i - 1;
            if (OooO0Oo().charAt(i2) != '\n' || OooO0o(i)) {
                break;
            }
            i = i2;
        }
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        while (i3 > 0 && !OooO0oO(i3)) {
            i3--;
        }
        return OooO0OO(i3, i);
    }

    public final boolean OooO0o(int i) {
        return i > 0 && OooO0Oo().charAt(i + (-1)) != '\n' && (i == OooO0Oo().length() || OooO0Oo().charAt(i) == '\n');
    }

    public final boolean OooO0oO(int i) {
        return OooO0Oo().charAt(i) != '\n' && (i == 0 || OooO0Oo().charAt(i - 1) == '\n');
    }
}
