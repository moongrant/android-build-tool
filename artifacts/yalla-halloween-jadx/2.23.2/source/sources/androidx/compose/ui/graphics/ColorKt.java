package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a2\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a-\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a!\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020,*\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", ReportItem.LogTypeBlock, "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,672:1\n587#1:673\n587#1:674\n587#1:675\n646#1:676\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:673\n568#1:674\n569#1:675\n658#1:676\n*E\n"})
public final class ColorKt {
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    @Stable
    public static final long Color(float f, float f2, float f3, float f4, @NotNull ColorSpace colorSpace) {
        boolean z;
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        if (f <= colorSpace.getMaxValue(0) && colorSpace.getMinValue(0) <= f) {
            if (f2 <= colorSpace.getMaxValue(1) && colorSpace.getMinValue(1) <= f2) {
                if (f3 <= colorSpace.getMaxValue(2) && colorSpace.getMinValue(2) <= f3) {
                    if (0.0f <= f4 && f4 <= 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
        }
        if (colorSpace.getIsSrgb()) {
            return Color.m1677constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & 4294967295L) << 32));
        }
        if (!(colorSpace.getComponentCount() == 3)) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components".toString());
        }
        int id = colorSpace.getId();
        if (!(id != -1)) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces".toString());
        }
        return Color.m1677constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(Float16.m1784constructorimpl(f2)) & 65535) << 32) | ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(Float16.m1784constructorimpl(f)) & 65535) << 48)) | ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(Float16.m1784constructorimpl(f3)) & 65535) << 16)) | ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m4389constructorimpl(ULong.m4389constructorimpl(id) & 63)));
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f3) * (f2 * f4)) + (f * f3)) / f5;
    }

    @Stable
    /* JADX INFO: renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m1726compositeOverOWjLjI(long j, long j2) {
        float f;
        float f2;
        long jM1678convertvNxB06k = Color.m1678convertvNxB06k(j, Color.m1685getColorSpaceimpl(j2));
        float fM1683getAlphaimpl = Color.m1683getAlphaimpl(j2);
        float fM1683getAlphaimpl2 = Color.m1683getAlphaimpl(jM1678convertvNxB06k);
        float f3 = 1.0f - fM1683getAlphaimpl2;
        float f4 = (fM1683getAlphaimpl * f3) + fM1683getAlphaimpl2;
        float fM1687getRedimpl = Color.m1687getRedimpl(jM1678convertvNxB06k);
        float fM1687getRedimpl2 = Color.m1687getRedimpl(j2);
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fM1687getRedimpl2 * fM1683getAlphaimpl) * f3) + (fM1687getRedimpl * fM1683getAlphaimpl2)) / f4;
        }
        float fM1686getGreenimpl = Color.m1686getGreenimpl(jM1678convertvNxB06k);
        float fM1686getGreenimpl2 = Color.m1686getGreenimpl(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fM1686getGreenimpl2 * fM1683getAlphaimpl) * f3) + (fM1686getGreenimpl * fM1683getAlphaimpl2)) / f4;
        }
        return Color(f, f2, f4 == 0.0f ? 0.0f : (((Color.m1684getBlueimpl(j2) * fM1683getAlphaimpl) * f3) + (Color.m1684getBlueimpl(jM1678convertvNxB06k) * fM1683getAlphaimpl2)) / f4, f4, Color.m1685getColorSpaceimpl(j2));
    }

    /* JADX INFO: renamed from: getComponents-8_81llA, reason: not valid java name */
    private static final float[] m1727getComponents8_81llA(long j) {
        return new float[]{Color.m1687getRedimpl(j), Color.m1686getGreenimpl(j), Color.m1684getBlueimpl(j), Color.m1683getAlphaimpl(j)};
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m1728isSpecified8_81llA(long j) {
        return j != Color.INSTANCE.m1717getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1729isSpecified8_81llA$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m1730isUnspecified8_81llA(long j) {
        return j == Color.INSTANCE.m1717getUnspecified0d7_KjU();
    }

    @Stable
    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m1731isUnspecified8_81llA$annotations(long j) {
    }

    @Stable
    /* JADX INFO: renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m1732lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM1678convertvNxB06k = Color.m1678convertvNxB06k(j, oklab);
        long jM1678convertvNxB06k2 = Color.m1678convertvNxB06k(j2, oklab);
        float fM1683getAlphaimpl = Color.m1683getAlphaimpl(jM1678convertvNxB06k);
        float fM1687getRedimpl = Color.m1687getRedimpl(jM1678convertvNxB06k);
        float fM1686getGreenimpl = Color.m1686getGreenimpl(jM1678convertvNxB06k);
        float fM1684getBlueimpl = Color.m1684getBlueimpl(jM1678convertvNxB06k);
        float fM1683getAlphaimpl2 = Color.m1683getAlphaimpl(jM1678convertvNxB06k2);
        float fM1687getRedimpl2 = Color.m1687getRedimpl(jM1678convertvNxB06k2);
        float fM1686getGreenimpl2 = Color.m1686getGreenimpl(jM1678convertvNxB06k2);
        float fM1684getBlueimpl2 = Color.m1684getBlueimpl(jM1678convertvNxB06k2);
        return Color.m1678convertvNxB06k(Color(MathHelpersKt.lerp(fM1687getRedimpl, fM1687getRedimpl2, f), MathHelpersKt.lerp(fM1686getGreenimpl, fM1686getGreenimpl2, f), MathHelpersKt.lerp(fM1684getBlueimpl, fM1684getBlueimpl2, f), MathHelpersKt.lerp(fM1683getAlphaimpl, fM1683getAlphaimpl2, f), oklab), Color.m1685getColorSpaceimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m1733luminance8_81llA(long j) {
        ColorSpace colorSpaceM1685getColorSpaceimpl = Color.m1685getColorSpaceimpl(j);
        if (!ColorModel.m2059equalsimpl0(colorSpaceM1685getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m2066getRgbxdoWZVw())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m2062toStringimpl(colorSpaceM1685getColorSpaceimpl.getModel()))).toString());
        }
        Intrinsics.checkNotNull(colorSpaceM1685getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc = ((Rgb) colorSpaceM1685getColorSpaceimpl).getEotfFunc();
        double dInvoke = eotfFunc.invoke(Color.m1687getRedimpl(j));
        return saturate((float) ((eotfFunc.invoke(Color.m1684getBlueimpl(j)) * 0.0722d) + (eotfFunc.invoke(Color.m1686getGreenimpl(j)) * 0.7152d) + (dInvoke * 0.2126d)));
    }

    private static final float saturate(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            f2 = 1.0f;
            if (f < 1.0f) {
                return f;
            }
        }
        return f2;
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m1734takeOrElseDxMtmZc(long j, @NotNull Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return (j > Color.INSTANCE.m1717getUnspecified0d7_KjU() ? 1 : (j == Color.INSTANCE.m1717getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? j : block.invoke().m1691unboximpl();
    }

    @Stable
    /* JADX INFO: renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m1735toArgb8_81llA(long j) {
        return (int) ULong.m4389constructorimpl(Color.m1678convertvNxB06k(j, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    public static final long Color(int i) {
        return Color.m1677constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(i) << 32));
    }

    @Stable
    public static final long Color(long j) {
        return Color.m1677constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(ULong.m4389constructorimpl(j) & 4294967295L) << 32));
    }

    @Stable
    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
