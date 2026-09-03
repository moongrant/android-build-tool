package o00OO00O;

import coil.size.Scale;
import coil.transform.PixelOpacity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import p130o00O0oo.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "-GifUtils")
public final class OooOO0 {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PixelOpacity.values().length];
            iArr[PixelOpacity.UNCHANGED.ordinal()] = 1;
            iArr[PixelOpacity.TRANSLUCENT.ordinal()] = 2;
            iArr[PixelOpacity.OPAQUE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Scale.values().length];
            iArr2[Scale.FILL.ordinal()] = 1;
            iArr2[Scale.FIT.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final int OooO00o(@NotNull o000Oo0 o000oo1, @NotNull Scale scale) {
        if (o000oo1 instanceof o000Oo0.OooO00o) {
            return ((o000Oo0.OooO00o) o000oo1).f36773OooO00o;
        }
        int i = OooO00o.$EnumSwitchMapping$1[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
