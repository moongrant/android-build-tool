package p115o00O00oO;

import androidx.annotation.Px;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Scale;
import coil.size.Size;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final ByteString f30343OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Oooo000 f30344OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ByteString f30345OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ByteString f30346OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ByteString f30347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final ByteString f30348OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final ByteString f30349OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final ByteString f30350OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final ByteString f30351OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final ByteString f30352OooOO0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            iArr[Scale.FILL.ordinal()] = 1;
            iArr[Scale.FIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        f30345OooO0O0 = oooO00o.OooO0OO("GIF87a");
        f30346OooO0OO = oooO00o.OooO0OO("GIF89a");
        f30347OooO0Oo = oooO00o.OooO0OO("RIFF");
        f30349OooO0o0 = oooO00o.OooO0OO("WEBP");
        f30348OooO0o = oooO00o.OooO0OO("VP8X");
        f30350OooO0oO = oooO00o.OooO0OO("ftyp");
        f30351OooO0oo = oooO00o.OooO0OO("msf1");
        f30343OooO = oooO00o.OooO0OO("hevc");
        f30352OooOO0 = oooO00o.OooO0OO("hevx");
    }

    @JvmStatic
    @NotNull
    public static final PixelSize OooO00o(int i, int i2, @NotNull Size dstSize, @NotNull Scale scale) {
        Intrinsics.checkNotNullParameter(dstSize, "dstSize");
        Intrinsics.checkNotNullParameter(scale, "scale");
        if (dstSize instanceof OriginalSize) {
            return new PixelSize(i, i2);
        }
        if (!(dstSize instanceof PixelSize)) {
            throw new NoWhenBranchMatchedException();
        }
        PixelSize pixelSize = (PixelSize) dstSize;
        double dOooO0O0 = OooO0O0(i, i2, pixelSize.f9946Oooo0o, pixelSize.f9947Oooo0oO, scale);
        return new PixelSize(MathKt.roundToInt(((double) i) * dOooO0O0), MathKt.roundToInt(dOooO0O0 * ((double) i2)));
    }

    @JvmStatic
    public static final double OooO0O0(@Px int i, @Px int i2, @Px int i3, @Px int i4, @NotNull Scale scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
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

    @JvmStatic
    public static final boolean OooO0OO(@NotNull o0oOOo source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source.Ooooo00(0L, f30346OooO0OO) || source.Ooooo00(0L, f30345OooO0O0);
    }
}
