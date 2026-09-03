package p124o00O0o00;

import androidx.annotation.Px;
import coil.size.Scale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            iArr[Scale.FILL.ordinal()] = 1;
            iArr[Scale.FIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final double OooO00o(@Px int i, @Px int i2, @Px int i3, @Px int i4, @NotNull Scale scale) {
        double d = ((double) i3) / ((double) i);
        double d2 = ((double) i4) / ((double) i2);
        int i5 = OooO00o.$EnumSwitchMapping$0[scale.ordinal()];
        if (i5 == 1) {
            return Math.max(d, d2);
        }
        if (i5 == 2) {
            return Math.min(d, d2);
        }
        throw new NoWhenBranchMatchedException();
    }
}
