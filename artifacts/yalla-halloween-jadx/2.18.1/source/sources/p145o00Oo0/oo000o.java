package p145o00Oo0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p167o00Ooo.OooO;
import p167o00Ooo.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class oo000o {
    @JvmStatic
    @DoNotInline
    @NotNull
    public static final OooO OooO00o(@NotNull Bitmap bitmap) {
        OooO oooOOooO0O0;
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (oooOOooO0O0 = OooO0O0(colorSpace)) != null) {
            return oooOOooO0O0;
        }
        OooOOO0 oooOOO0 = OooOOO0.f32567OooO00o;
        return OooOOO0.f32570OooO0Oo;
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    public static final OooO OooO0O0(@NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB))) {
            OooOOO0 oooOOO0 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32570OooO0Oo;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.ACES))) {
            OooOOO0 oooOOO1 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32581OooOOOo;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG))) {
            OooOOO0 oooOOO2 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32583OooOOo0;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            OooOOO0 oooOOO3 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32578OooOOO;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020))) {
            OooOOO0 oooOOO4 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32566OooO;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.BT709))) {
            OooOOO0 oooOOO5 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32574OooO0oo;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            OooOOO0 oooOOO6 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32584OooOOoo;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            OooOOO0 oooOOO7 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32582OooOOo;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            OooOOO0 oooOOO8 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32575OooOO0;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            OooOOO0 oooOOO9 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32576OooOO0O;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            OooOOO0 oooOOO10 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32571OooO0o;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            OooOOO0 oooOOO11 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32573OooO0oO;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            OooOOO0 oooOOO12 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32572OooO0o0;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            OooOOO0 oooOOO13 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32577OooOO0o;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            OooOOO0 oooOOO14 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32580OooOOOO;
        }
        if (Intrinsics.areEqual(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
            OooOOO0 oooOOO15 = OooOOO0.f32567OooO00o;
            return OooOOO0.f32579OooOOO0;
        }
        OooOOO0 oooOOO16 = OooOOO0.f32567OooO00o;
        return OooOOO0.f32570OooO0Oo;
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    public static final Bitmap OooO0OO(int i, int i2, int i3, boolean z, @NotNull OooO colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, OooOo.OooO0O0(i3), z, OooO0Oo(colorSpace));
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    @JvmStatic
    @DoNotInline
    @NotNull
    public static final ColorSpace OooO0Oo(@NotNull OooO oooO) {
        ColorSpace.Named named;
        Intrinsics.checkNotNullParameter(oooO, "<this>");
        OooOOO0 oooOOO0 = OooOOO0.f32567OooO00o;
        if (Intrinsics.areEqual(oooO, OooOOO0.f32570OooO0Oo)) {
            named = ColorSpace.Named.SRGB;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32581OooOOOo)) {
            named = ColorSpace.Named.ACES;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32583OooOOo0)) {
            named = ColorSpace.Named.ACESCG;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32578OooOOO)) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32566OooO)) {
            named = ColorSpace.Named.BT2020;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32574OooO0oo)) {
            named = ColorSpace.Named.BT709;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32584OooOOoo)) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32582OooOOo)) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32575OooOO0)) {
            named = ColorSpace.Named.DCI_P3;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32576OooOO0O)) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32571OooO0o)) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32573OooO0oO)) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32572OooO0o0)) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32577OooOO0o)) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (Intrinsics.areEqual(oooO, OooOOO0.f32580OooOOOO)) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else {
            named = Intrinsics.areEqual(oooO, OooOOO0.f32579OooOOO0) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
        }
        ColorSpace colorSpace = ColorSpace.get(named);
        Intrinsics.checkNotNullExpressionValue(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
