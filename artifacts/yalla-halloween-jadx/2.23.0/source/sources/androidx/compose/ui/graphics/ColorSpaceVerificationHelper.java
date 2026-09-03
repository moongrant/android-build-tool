package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import androidx.compose.ui.graphics.colorspace.WhitePoint;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0007J\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/graphics/ColorSpaceVerificationHelper;", "", "()V", "androidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ColorSpaceVerificationHelper {

    @NotNull
    public static final ColorSpaceVerificationHelper INSTANCE = new ColorSpaceVerificationHelper();

    private ColorSpaceVerificationHelper() {
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.compose.ui.graphics.o00OO0OO] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.ui.graphics.oo0O] */
    @JvmStatic
    @NotNull
    @DoNotInline
    @RequiresApi(26)
    public static final ColorSpace androidColorSpace(@NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        ColorSpace colorSpaceOooO00o;
        ColorSpace.Rgb.TransferParameters transferParametersOooO00o;
        ColorSpace.Rgb rgbOooO00o;
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSrgb())) {
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace2, "get(android.graphics.ColorSpace.Named.SRGB)");
            return colorSpace2;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAces())) {
            ColorSpace colorSpace3 = ColorSpace.get(ColorSpace.Named.ACES);
            Intrinsics.checkNotNullExpressionValue(colorSpace3, "get(android.graphics.ColorSpace.Named.ACES)");
            return colorSpace3;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAcescg())) {
            ColorSpace colorSpace4 = ColorSpace.get(ColorSpace.Named.ACESCG);
            Intrinsics.checkNotNullExpressionValue(colorSpace4, "get(android.graphics.ColorSpace.Named.ACESCG)");
            return colorSpace4;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getAdobeRgb())) {
            ColorSpace colorSpace5 = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace5, "get(android.graphics.ColorSpace.Named.ADOBE_RGB)");
            return colorSpace5;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt2020())) {
            ColorSpace colorSpace6 = ColorSpace.get(ColorSpace.Named.BT2020);
            Intrinsics.checkNotNullExpressionValue(colorSpace6, "get(android.graphics.ColorSpace.Named.BT2020)");
            return colorSpace6;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getBt709())) {
            ColorSpace colorSpace7 = ColorSpace.get(ColorSpace.Named.BT709);
            Intrinsics.checkNotNullExpressionValue(colorSpace7, "get(android.graphics.ColorSpace.Named.BT709)");
            return colorSpace7;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieLab())) {
            ColorSpace colorSpace8 = ColorSpace.get(ColorSpace.Named.CIE_LAB);
            Intrinsics.checkNotNullExpressionValue(colorSpace8, "get(android.graphics.ColorSpace.Named.CIE_LAB)");
            return colorSpace8;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getCieXyz())) {
            ColorSpace colorSpace9 = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
            Intrinsics.checkNotNullExpressionValue(colorSpace9, "get(android.graphics.ColorSpace.Named.CIE_XYZ)");
            return colorSpace9;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getDciP3())) {
            ColorSpace colorSpace10 = ColorSpace.get(ColorSpace.Named.DCI_P3);
            Intrinsics.checkNotNullExpressionValue(colorSpace10, "get(android.graphics.ColorSpace.Named.DCI_P3)");
            return colorSpace10;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getDisplayP3())) {
            ColorSpace colorSpace11 = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
            Intrinsics.checkNotNullExpressionValue(colorSpace11, "get(android.graphics.ColorSpace.Named.DISPLAY_P3)");
            return colorSpace11;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getExtendedSrgb())) {
            ColorSpace colorSpace12 = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace12, "get(android.graphics.Col…pace.Named.EXTENDED_SRGB)");
            return colorSpace12;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            ColorSpace colorSpace13 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace13, "get(android.graphics.Col…med.LINEAR_EXTENDED_SRGB)");
            return colorSpace13;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getLinearSrgb())) {
            ColorSpace colorSpace14 = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace14, "get(android.graphics.ColorSpace.Named.LINEAR_SRGB)");
            return colorSpace14;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getNtsc1953())) {
            ColorSpace colorSpace15 = ColorSpace.get(ColorSpace.Named.NTSC_1953);
            Intrinsics.checkNotNullExpressionValue(colorSpace15, "get(android.graphics.ColorSpace.Named.NTSC_1953)");
            return colorSpace15;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getProPhotoRgb())) {
            ColorSpace colorSpace16 = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
            Intrinsics.checkNotNullExpressionValue(colorSpace16, "get(android.graphics.Col…pace.Named.PRO_PHOTO_RGB)");
            return colorSpace16;
        }
        if (Intrinsics.areEqual(colorSpace, colorSpaces.getSmpteC())) {
            ColorSpace colorSpace17 = ColorSpace.get(ColorSpace.Named.SMPTE_C);
            Intrinsics.checkNotNullExpressionValue(colorSpace17, "get(android.graphics.ColorSpace.Named.SMPTE_C)");
            return colorSpace17;
        }
        if (colorSpace instanceof Rgb) {
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            TransferParameters transferParameters = rgb.getTransferParameters();
            if (transferParameters != null) {
                oo0o0O0.OooO00o();
                transferParametersOooO00o = o00O0O0.OooO00o(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
            } else {
                transferParametersOooO00o = null;
            }
            if (transferParametersOooO00o != null) {
                o00O0OO.OooO00o();
                rgbOooO00o = o00O0OO0.OooO0O0(colorSpace.getName(), ((Rgb) colorSpace).getPrimaries(), xyz$ui_graphics_release, transferParametersOooO00o);
            } else {
                o00O0OO.OooO00o();
                String name = colorSpace.getName();
                Rgb rgb2 = (Rgb) colorSpace;
                float[] primaries = rgb2.getPrimaries();
                final Function1<Double, Double> oetf = rgb2.getOetf();
                ?? r6 = new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.o00OO0OO
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        return ColorSpaceVerificationHelper.androidColorSpace$lambda$0(oetf, d);
                    }
                };
                final Function1<Double, Double> eotf = rgb2.getEotf();
                rgbOooO00o = o00O0O0O.OooO00o(name, primaries, xyz$ui_graphics_release, r6, new DoubleUnaryOperator() { // from class: androidx.compose.ui.graphics.oo0O
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        return ColorSpaceVerificationHelper.androidColorSpace$lambda$1(eotf, d);
                    }
                }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0));
            }
            colorSpaceOooO00o = o0000OO0.OooO00o(rgbOooO00o);
        } else {
            colorSpaceOooO00o = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Intrinsics.checkNotNullExpressionValue(colorSpaceOooO00o, "{\n                if (th…          }\n            }");
        return colorSpaceOooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$0(Function1 tmp0, double d) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double androidColorSpace$lambda$1(Function1 tmp0, double d) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(Double.valueOf(d))).doubleValue();
    }

    @JvmStatic
    @NotNull
    @DoNotInline
    @RequiresApi(26)
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace composeColorSpace(@NotNull final ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        if (!o000O0O0.OooO0OO(colorSpace)) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        ColorSpace.Rgb.TransferParameters transferParameters = o000Oo0.OooO00o(colorSpace).getTransferParameters();
        WhitePoint whitePoint = o000Oo0.OooO00o(colorSpace).getWhitePoint().length == 3 ? new WhitePoint(o000Oo0.OooO00o(colorSpace).getWhitePoint()[0], o000Oo0.OooO00o(colorSpace).getWhitePoint()[1], o000Oo0.OooO00o(colorSpace).getWhitePoint()[2]) : new WhitePoint(o000Oo0.OooO00o(colorSpace).getWhitePoint()[0], o000Oo0.OooO00o(colorSpace).getWhitePoint()[1]);
        TransferParameters transferParameters2 = transferParameters != null ? new TransferParameters(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        String name = o000Oo0.OooO00o(colorSpace).getName();
        Intrinsics.checkNotNullExpressionValue(name, "this.name");
        float[] primaries = o000Oo0.OooO00o(colorSpace).getPrimaries();
        Intrinsics.checkNotNullExpressionValue(primaries, "this.primaries");
        return new Rgb(name, primaries, whitePoint, o000Oo0.OooO00o(colorSpace).getTransform(), new DoubleFunction() { // from class: androidx.compose.ui.graphics.o00OO
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return ColorSpaceVerificationHelper.composeColorSpace$lambda$2(colorSpace, d);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.o00OOO00
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return ColorSpaceVerificationHelper.composeColorSpace$lambda$3(colorSpace, d);
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters2, o000Oo0.OooO00o(colorSpace).getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$2(ColorSpace this_composeColorSpace, double d) {
        Intrinsics.checkNotNullParameter(this_composeColorSpace, "$this_composeColorSpace");
        return o000Oo0.OooO00o(this_composeColorSpace).getOetf().applyAsDouble(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double composeColorSpace$lambda$3(ColorSpace this_composeColorSpace, double d) {
        Intrinsics.checkNotNullParameter(this_composeColorSpace, "$this_composeColorSpace");
        return o000Oo0.OooO00o(this_composeColorSpace).getEotf().applyAsDouble(d);
    }
}
