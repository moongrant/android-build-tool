package p281o0O00o;

import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O {
    @Deprecated(message = "\naccompanist/insets is deprecated.\nThe androidx.compose equivalent is WindowInsets.copy.\nFor more migration information, please visit https://google.github.io/accompanist/insets/#migration\n")
    @NotNull
    public static final OooOO0 OooO00o(@NotNull OooOO0 oooOO1, @NotNull OooOO0 minimumValue) {
        Intrinsics.checkNotNullParameter(oooOO1, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        OooOO0 oooOO2 = oooOO1.OooO0oO() >= minimumValue.OooO0oO() && oooOO1.OooOO0O() >= minimumValue.OooOO0O() && oooOO1.OooOOO() >= minimumValue.OooOOO() && oooOO1.OooO0o0() >= minimumValue.OooO0o0() ? oooOO1 : null;
        return oooOO2 == null ? new OooOOO(RangesKt.coerceAtLeast(oooOO1.OooO0oO(), minimumValue.OooO0oO()), RangesKt.coerceAtLeast(oooOO1.OooOO0O(), minimumValue.OooOO0O()), RangesKt.coerceAtLeast(oooOO1.OooOOO(), minimumValue.OooOOO()), RangesKt.coerceAtLeast(oooOO1.OooO0o0(), minimumValue.OooO0o0())) : oooOO2;
    }
}
