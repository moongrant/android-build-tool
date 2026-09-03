package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a9\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001aS\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042&\u0010\u0012\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0001\u001a\f\u0010\u001b\u001a\u00020\b*\u00020\u0004H\u0000\u001a\u0016\u0010\u001c\u001a\u00020\u001d*\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"correctBlurRadius", "", "blurRadius", "generateFallbackSpanStyle", "Landroidx/compose/ui/text/SpanStyle;", "letterSpacing", "Landroidx/compose/ui/unit/TextUnit;", "requiresLetterSpacing", "", "background", "Landroidx/compose/ui/graphics/Color;", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "generateFallbackSpanStyle-62GTOB8", "(JZJLandroidx/compose/ui/text/style/BaselineShift;)Landroidx/compose/ui/text/SpanStyle;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "resolveTypeface", "Lkotlin/Function4;", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "Landroidx/compose/ui/text/font/FontSynthesis;", "Landroid/graphics/Typeface;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "setTextMotion", "", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextPaintExtensions_androidKt {
    /* JADX WARN: Code duplicated, block: B:56:0x019c  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ae  */
    @Nullable
    public static final SpanStyle applySpanStyle(@NotNull AndroidTextPaint androidTextPaint, @NotNull SpanStyle style, @NotNull Function4<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> resolveTypeface, @NotNull Density density, boolean z) {
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(resolveTypeface, "resolveTypeface");
        Intrinsics.checkNotNullParameter(density, "density");
        long jM3955getTypeUIouoOA = TextUnit.m3955getTypeUIouoOA(style.getFontSize());
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m3984equalsimpl0(jM3955getTypeUIouoOA, companion.m3989getSpUIouoOA())) {
            androidTextPaint.setTextSize(density.mo325toPxR2X_6o(style.getFontSize()));
        } else if (TextUnitType.m3984equalsimpl0(jM3955getTypeUIouoOA, companion.m3988getEmUIouoOA())) {
            androidTextPaint.setTextSize(TextUnit.m3956getValueimpl(style.getFontSize()) * androidTextPaint.getTextSize());
        }
        if (hasFontAttributes(style)) {
            FontFamily fontFamily = style.getFontFamily();
            FontWeight fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            FontStyle fontStyle = style.getFontStyle();
            FontStyle fontStyleM3413boximpl = FontStyle.m3413boximpl(fontStyle != null ? fontStyle.m3419unboximpl() : FontStyle.INSTANCE.m3421getNormal_LCdwA());
            FontSynthesis fontSynthesis = style.getFontSynthesis();
            androidTextPaint.setTypeface(resolveTypeface.invoke(fontFamily, fontWeight, fontStyleM3413boximpl, FontSynthesis.m3422boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m3431getAllGVVA2EU())));
        }
        if (style.getLocaleList() != null && !Intrinsics.areEqual(style.getLocaleList(), LocaleList.INSTANCE.getCurrent())) {
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint, style.getLocaleList());
            } else {
                androidTextPaint.setTextLocale(LocaleExtensions_androidKt.toJavaLocale(style.getLocaleList().isEmpty() ? Locale.INSTANCE.getCurrent() : style.getLocaleList().get(0)));
            }
        }
        if (style.getFontFeatureSettings() != null && !Intrinsics.areEqual(style.getFontFeatureSettings(), "")) {
            androidTextPaint.setFontFeatureSettings(style.getFontFeatureSettings());
        }
        if (style.getTextGeometricTransform() != null && !Intrinsics.areEqual(style.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.getNone$ui_text_release())) {
            androidTextPaint.setTextScaleX(style.getTextGeometricTransform().getScaleX() * androidTextPaint.getTextScaleX());
            androidTextPaint.setTextSkewX(style.getTextGeometricTransform().getSkewX() + androidTextPaint.getTextSkewX());
        }
        androidTextPaint.m3555setColor8_81llA(style.m3279getColor0d7_KjU());
        androidTextPaint.m3554setBrush12SF9DM(style.getBrush(), Size.INSTANCE.m1524getUnspecifiedNHjbRc(), style.getAlpha());
        androidTextPaint.setShadow(style.getShadow());
        androidTextPaint.setTextDecoration(style.getTextDecoration());
        androidTextPaint.setDrawStyle(style.getDrawStyle());
        if (TextUnitType.m3984equalsimpl0(TextUnit.m3955getTypeUIouoOA(style.getLetterSpacing()), companion.m3989getSpUIouoOA())) {
            if (!(TextUnit.m3956getValueimpl(style.getLetterSpacing()) == 0.0f)) {
                float textScaleX = androidTextPaint.getTextScaleX() * androidTextPaint.getTextSize();
                float fMo325toPxR2X_6o = density.mo325toPxR2X_6o(style.getLetterSpacing());
                if (!(textScaleX == 0.0f)) {
                    androidTextPaint.setLetterSpacing(fMo325toPxR2X_6o / textScaleX);
                }
            } else if (TextUnitType.m3984equalsimpl0(TextUnit.m3955getTypeUIouoOA(style.getLetterSpacing()), companion.m3988getEmUIouoOA())) {
                androidTextPaint.setLetterSpacing(TextUnit.m3956getValueimpl(style.getLetterSpacing()));
            }
        } else if (TextUnitType.m3984equalsimpl0(TextUnit.m3955getTypeUIouoOA(style.getLetterSpacing()), companion.m3988getEmUIouoOA())) {
            androidTextPaint.setLetterSpacing(TextUnit.m3956getValueimpl(style.getLetterSpacing()));
        }
        return m3569generateFallbackSpanStyle62GTOB8(style.getLetterSpacing(), z, style.getBackground(), style.getBaselineShift());
    }

    public static /* synthetic */ SpanStyle applySpanStyle$default(AndroidTextPaint androidTextPaint, SpanStyle spanStyle, Function4 function4, Density density, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(androidTextPaint, spanStyle, function4, density, z);
    }

    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX INFO: renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final SpanStyle m3569generateFallbackSpanStyle62GTOB8(long j, boolean z, long j2, BaselineShift baselineShift) {
        boolean z2;
        boolean z3;
        long jM1717getUnspecified0d7_KjU = j2;
        if (z && TextUnitType.m3984equalsimpl0(TextUnit.m3955getTypeUIouoOA(j), TextUnitType.INSTANCE.m3989getSpUIouoOA())) {
            if (TextUnit.m3956getValueimpl(j) == 0.0f) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        Color.Companion companion = Color.INSTANCE;
        boolean z4 = (Color.m1682equalsimpl0(jM1717getUnspecified0d7_KjU, companion.m1717getUnspecified0d7_KjU()) || Color.m1682equalsimpl0(jM1717getUnspecified0d7_KjU, companion.m1716getTransparent0d7_KjU())) ? false : true;
        if (baselineShift != null) {
            z3 = BaselineShift.m3577equalsimpl0(baselineShift.m3580unboximpl(), BaselineShift.INSTANCE.m3584getNoney9eOQZs()) ? false : true;
        }
        if (!z2 && !z4 && !z3) {
            return null;
        }
        long jM3967getUnspecifiedXSAIIZE = z2 ? j : TextUnit.INSTANCE.m3967getUnspecifiedXSAIIZE();
        if (!z4) {
            jM1717getUnspecified0d7_KjU = companion.m1717getUnspecified0d7_KjU();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, jM3967getUnspecifiedXSAIIZE, z3 ? baselineShift : null, (TextGeometricTransform) null, (LocaleList) null, jM1717getUnspecified0d7_KjU, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 63103, (DefaultConstructorMarker) null);
    }

    public static final boolean hasFontAttributes(@NotNull SpanStyle spanStyle) {
        Intrinsics.checkNotNullParameter(spanStyle, "<this>");
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(@NotNull AndroidTextPaint androidTextPaint, @Nullable TextMotion textMotion) {
        Intrinsics.checkNotNullParameter(androidTextPaint, "<this>");
        if (textMotion == null) {
            textMotion = TextMotion.INSTANCE.getStatic();
        }
        androidTextPaint.setFlags(textMotion.getSubpixelTextPositioning() ? androidTextPaint.getFlags() | 128 : androidTextPaint.getFlags() & (-129));
        int iM3707getLinearity4e0Vf04$ui_text_release = textMotion.getLinearity();
        TextMotion.Linearity.Companion companion = TextMotion.Linearity.INSTANCE;
        if (TextMotion.Linearity.m3711equalsimpl0(iM3707getLinearity4e0Vf04$ui_text_release, companion.m3716getLinear4e0Vf04())) {
            androidTextPaint.setFlags(androidTextPaint.getFlags() | 64);
            androidTextPaint.setHinting(0);
        } else if (TextMotion.Linearity.m3711equalsimpl0(iM3707getLinearity4e0Vf04$ui_text_release, companion.m3715getFontHinting4e0Vf04())) {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(1);
        } else if (!TextMotion.Linearity.m3711equalsimpl0(iM3707getLinearity4e0Vf04$ui_text_release, companion.m3717getNone4e0Vf04())) {
            androidTextPaint.getFlags();
        } else {
            androidTextPaint.getFlags();
            androidTextPaint.setHinting(0);
        }
    }
}
