package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f\u001a+\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\u0006\u0010\u0010\u001a\u0002H\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a-\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\u001aÃ\u0001\u0010\u001a\u001a\u00020\b*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u00012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u00010\u00132\b\u00107\u001a\u0004\u0018\u000108H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a\u0018\u0010;\u001a\u0004\u0018\u00010\u0013*\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u0013H\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "fastMerge", "color", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "fontSize", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "platformStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "mergePlatformStyle", "other", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,951:1\n658#2:952\n646#2:953\n646#2:955\n646#2:957\n658#2:958\n646#2:959\n250#3:954\n250#3:956\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n849#1:952\n849#1:953\n892#1:955\n907#1:957\n939#1:958\n939#1:959\n891#1:954\n897#1:956\n*E\n"})
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.INSTANCE;
        DefaultBackgroundColor = companion.m1716getTransparent0d7_KjU();
        DefaultColor = companion.m1707getBlack0d7_KjU();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0038  */
    /* JADX WARN: Code duplicated, block: B:80:0x0151  */
    @NotNull
    /* JADX INFO: renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    public static final SpanStyle m3284fastMergedSHsh3o(@NotNull SpanStyle fastMerge, long j, @Nullable Brush brush, float f, long j2, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String str, long j3, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long j4, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable PlatformSpanStyle platformSpanStyle, @Nullable DrawStyle drawStyle) {
        boolean z;
        boolean z2;
        Shadow shadow2;
        PlatformSpanStyle platformSpanStyle2;
        DrawStyle drawStyle2;
        boolean z3;
        boolean z4;
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle2 = fontStyle;
        FontSynthesis fontSynthesis2 = fontSynthesis;
        String fontFeatureSettings = str;
        BaselineShift baselineShift2 = baselineShift;
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        Intrinsics.checkNotNullParameter(fastMerge, "$this$fastMerge");
        if ((!TextUnitKt.m3974isUnspecifiedR2X_6o(j2)) && !TextUnit.m3953equalsimpl0(j2, fastMerge.getFontSize())) {
            shadow2 = shadow;
            platformSpanStyle2 = platformSpanStyle;
            drawStyle2 = drawStyle;
            z = true;
            z3 = z;
        } else if (brush != null) {
            if ((fontStyle2 != null || Intrinsics.areEqual(fontStyle2, fastMerge.getFontStyle())) && ((fontWeight2 == null || Intrinsics.areEqual(fontWeight2, fastMerge.getFontWeight())) && (fontFamily == null || fontFamily == fastMerge.getFontFamily()))) {
                z = true;
                if (!(!TextUnitKt.m3974isUnspecifiedR2X_6o(j3)) && !TextUnit.m3953equalsimpl0(j3, fastMerge.getLetterSpacing())) {
                    shadow2 = shadow;
                    platformSpanStyle2 = platformSpanStyle;
                    drawStyle2 = drawStyle;
                } else if ((textDecoration == null && !Intrinsics.areEqual(textDecoration, fastMerge.getTextDecoration())) || !Intrinsics.areEqual(brush, fastMerge.getTextForegroundStyle().getBrush())) {
                    shadow2 = shadow;
                    platformSpanStyle2 = platformSpanStyle;
                    drawStyle2 = drawStyle;
                } else if (brush != null) {
                    if (f == fastMerge.getTextForegroundStyle().getAlpha()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        shadow2 = shadow;
                        platformSpanStyle2 = platformSpanStyle;
                        drawStyle2 = drawStyle;
                    } else if (fontSynthesis2 != null) {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    } else {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    }
                } else if ((fontSynthesis2 != null || Intrinsics.areEqual(fontSynthesis2, fastMerge.getFontSynthesis())) && ((fontFeatureSettings == null || Intrinsics.areEqual(fontFeatureSettings, fastMerge.getFontFeatureSettings())) && ((baselineShift2 == null || Intrinsics.areEqual(baselineShift2, fastMerge.getBaselineShift())) && ((textGeometricTransform2 == null || Intrinsics.areEqual(textGeometricTransform2, fastMerge.getTextGeometricTransform())) && (localeList == null || Intrinsics.areEqual(localeList, fastMerge.getLocaleList())))))) {
                    if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || Color.m1682equalsimpl0(j4, fastMerge.getBackground())) {
                        shadow2 = shadow;
                        if (shadow2 != null || Intrinsics.areEqual(shadow2, fastMerge.getShadow())) {
                            platformSpanStyle2 = platformSpanStyle;
                            if (platformSpanStyle2 != null || Intrinsics.areEqual(platformSpanStyle2, fastMerge.getPlatformStyle())) {
                                drawStyle2 = drawStyle;
                                if (drawStyle2 != null || Intrinsics.areEqual(drawStyle2, fastMerge.getDrawStyle())) {
                                    z3 = false;
                                }
                            }
                        }
                        drawStyle2 = drawStyle;
                    } else {
                        shadow2 = shadow;
                    }
                    platformSpanStyle2 = platformSpanStyle;
                    drawStyle2 = drawStyle;
                } else {
                    shadow2 = shadow;
                    platformSpanStyle2 = platformSpanStyle;
                    drawStyle2 = drawStyle;
                }
            } else {
                shadow2 = shadow;
                platformSpanStyle2 = platformSpanStyle;
                drawStyle2 = drawStyle;
                z = true;
            }
            z3 = z;
        } else {
            if ((j != Color.INSTANCE.m1717getUnspecified0d7_KjU()) && !Color.m1682equalsimpl0(j, fastMerge.getTextForegroundStyle().mo3588getColor0d7_KjU())) {
                shadow2 = shadow;
                platformSpanStyle2 = platformSpanStyle;
                drawStyle2 = drawStyle;
                z = true;
                z3 = z;
            } else if (fontStyle2 != null) {
                z = true;
                if (!(!TextUnitKt.m3974isUnspecifiedR2X_6o(j3))) {
                }
                if (textDecoration == null) {
                    if (brush != null) {
                        if (f == fastMerge.getTextForegroundStyle().getAlpha()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            shadow2 = shadow;
                            platformSpanStyle2 = platformSpanStyle;
                            drawStyle2 = drawStyle;
                            z3 = z;
                        } else if (fontSynthesis2 != null) {
                            if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                            shadow2 = shadow;
                            if (shadow2 != null) {
                            }
                            platformSpanStyle2 = platformSpanStyle;
                            if (platformSpanStyle2 != null) {
                            }
                            drawStyle2 = drawStyle;
                            if (drawStyle2 != null) {
                            }
                            z3 = false;
                        } else {
                            if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                            shadow2 = shadow;
                            if (shadow2 != null) {
                            }
                            platformSpanStyle2 = platformSpanStyle;
                            if (platformSpanStyle2 != null) {
                            }
                            drawStyle2 = drawStyle;
                            if (drawStyle2 != null) {
                            }
                            z3 = false;
                        }
                    } else if (fontSynthesis2 != null) {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    } else {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    }
                } else if (brush != null) {
                    if (f == fastMerge.getTextForegroundStyle().getAlpha()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        shadow2 = shadow;
                        platformSpanStyle2 = platformSpanStyle;
                        drawStyle2 = drawStyle;
                        z3 = z;
                    } else if (fontSynthesis2 != null) {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    } else {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    }
                } else if (fontSynthesis2 != null) {
                    if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                    shadow2 = shadow;
                    if (shadow2 != null) {
                    }
                    platformSpanStyle2 = platformSpanStyle;
                    if (platformSpanStyle2 != null) {
                    }
                    drawStyle2 = drawStyle;
                    if (drawStyle2 != null) {
                    }
                    z3 = false;
                } else {
                    if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                    shadow2 = shadow;
                    if (shadow2 != null) {
                    }
                    platformSpanStyle2 = platformSpanStyle;
                    if (platformSpanStyle2 != null) {
                    }
                    drawStyle2 = drawStyle;
                    if (drawStyle2 != null) {
                    }
                    z3 = false;
                }
            } else {
                z = true;
                if (!(!TextUnitKt.m3974isUnspecifiedR2X_6o(j3))) {
                }
                if (textDecoration == null) {
                    if (brush != null) {
                        if (f == fastMerge.getTextForegroundStyle().getAlpha()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            shadow2 = shadow;
                            platformSpanStyle2 = platformSpanStyle;
                            drawStyle2 = drawStyle;
                            z3 = z;
                        } else if (fontSynthesis2 != null) {
                            if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                            shadow2 = shadow;
                            if (shadow2 != null) {
                            }
                            platformSpanStyle2 = platformSpanStyle;
                            if (platformSpanStyle2 != null) {
                            }
                            drawStyle2 = drawStyle;
                            if (drawStyle2 != null) {
                            }
                            z3 = false;
                        } else {
                            if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                            }
                            shadow2 = shadow;
                            if (shadow2 != null) {
                            }
                            platformSpanStyle2 = platformSpanStyle;
                            if (platformSpanStyle2 != null) {
                            }
                            drawStyle2 = drawStyle;
                            if (drawStyle2 != null) {
                            }
                            z3 = false;
                        }
                    } else if (fontSynthesis2 != null) {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    } else {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    }
                } else if (brush != null) {
                    if (f == fastMerge.getTextForegroundStyle().getAlpha()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        shadow2 = shadow;
                        platformSpanStyle2 = platformSpanStyle;
                        drawStyle2 = drawStyle;
                        z3 = z;
                    } else if (fontSynthesis2 != null) {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    } else {
                        if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                        shadow2 = shadow;
                        if (shadow2 != null) {
                        }
                        platformSpanStyle2 = platformSpanStyle;
                        if (platformSpanStyle2 != null) {
                        }
                        drawStyle2 = drawStyle;
                        if (drawStyle2 != null) {
                        }
                        z3 = false;
                    }
                } else if (fontSynthesis2 != null) {
                    if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                    shadow2 = shadow;
                    if (shadow2 != null) {
                    }
                    platformSpanStyle2 = platformSpanStyle;
                    if (platformSpanStyle2 != null) {
                    }
                    drawStyle2 = drawStyle;
                    if (drawStyle2 != null) {
                    }
                    z3 = false;
                } else {
                    if (j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                    shadow2 = shadow;
                    if (shadow2 != null) {
                    }
                    platformSpanStyle2 = platformSpanStyle;
                    if (platformSpanStyle2 != null) {
                    }
                    drawStyle2 = drawStyle;
                    if (drawStyle2 != null) {
                    }
                    z3 = false;
                }
            }
        }
        if (!z3) {
            return fastMerge;
        }
        TextForegroundStyle textForegroundStyleMerge = fastMerge.getTextForegroundStyle().merge(brush != null ? TextForegroundStyle.INSTANCE.from(brush, f) : TextForegroundStyle.INSTANCE.m3700from8_81llA(j));
        FontFamily fontFamily2 = fontFamily == null ? fastMerge.getFontFamily() : fontFamily;
        long fontSize = !TextUnitKt.m3974isUnspecifiedR2X_6o(j2) ? j2 : fastMerge.getFontSize();
        if (fontWeight2 == null) {
            fontWeight2 = fastMerge.getFontWeight();
        }
        if (fontStyle2 == null) {
            fontStyle2 = fastMerge.getFontStyle();
        }
        if (fontSynthesis2 == null) {
            fontSynthesis2 = fastMerge.getFontSynthesis();
        }
        if (fontFeatureSettings == null) {
            fontFeatureSettings = fastMerge.getFontFeatureSettings();
        }
        long letterSpacing = !TextUnitKt.m3974isUnspecifiedR2X_6o(j3) ? j3 : fastMerge.getLetterSpacing();
        if (baselineShift2 == null) {
            baselineShift2 = fastMerge.getBaselineShift();
        }
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = fastMerge.getTextGeometricTransform();
        }
        LocaleList localeList2 = localeList == null ? fastMerge.getLocaleList() : localeList;
        long background = j4 != Color.INSTANCE.m1717getUnspecified0d7_KjU() ? z : false ? j4 : fastMerge.getBackground();
        TextDecoration textDecoration2 = textDecoration == null ? fastMerge.getTextDecoration() : textDecoration;
        if (shadow2 == null) {
            shadow2 = fastMerge.getShadow();
        }
        PlatformSpanStyle platformSpanStyleMergePlatformStyle = mergePlatformStyle(fastMerge, platformSpanStyle2);
        if (drawStyle2 == null) {
            drawStyle2 = fastMerge.getDrawStyle();
        }
        return new SpanStyle(textForegroundStyleMerge, fontSize, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, fontFeatureSettings, letterSpacing, baselineShift2, textGeometricTransform2, localeList2, background, textDecoration2, shadow2, platformSpanStyleMergePlatformStyle, drawStyle2, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(start.getTextForegroundStyle(), stop.getTextForegroundStyle(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f);
        long jM3285lerpTextUnitInheritableC3pnCVY = m3285lerpTextUnitInheritableC3pnCVY(start.getFontSize(), stop.getFontSize(), f);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.getFontStyle(), stop.getFontStyle(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.getFontSynthesis(), stop.getFontSynthesis(), f);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f);
        long jM3285lerpTextUnitInheritableC3pnCVY2 = m3285lerpTextUnitInheritableC3pnCVY(start.getLetterSpacing(), stop.getLetterSpacing(), f);
        BaselineShift baselineShift = start.getBaselineShift();
        float fM3580unboximpl = baselineShift != null ? baselineShift.m3580unboximpl() : BaselineShift.m3575constructorimpl(0.0f);
        BaselineShift baselineShift2 = stop.getBaselineShift();
        float fM3587lerpjWV1Mfo = BaselineShiftKt.m3587lerpjWV1Mfo(fM3580unboximpl, baselineShift2 != null ? baselineShift2.m3580unboximpl() : BaselineShift.m3575constructorimpl(0.0f), f);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransformLerp = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f);
        long jM1732lerpjxsXWHM = ColorKt.m1732lerpjxsXWHM(start.getBackground(), stop.getBackground(), f);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(textForegroundStyleLerp, jM3285lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM3285lerpTextUnitInheritableC3pnCVY2, BaselineShift.m3574boximpl(fM3587lerpjWV1Mfo), textGeometricTransformLerp, localeList, jM1732lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(start.getDrawStyle(), stop.getDrawStyle(), f), (DefaultConstructorMarker) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.INSTANCE.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.INSTANCE.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    /* JADX INFO: renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m3285lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        return (TextUnitKt.m3974isUnspecifiedR2X_6o(j) || TextUnitKt.m3974isUnspecifiedR2X_6o(j2)) ? ((TextUnit) lerpDiscrete(TextUnit.m3946boximpl(j), TextUnit.m3946boximpl(j2), f)).getPackedValue() : TextUnitKt.m3976lerpC3pnCVY(j, j2, f);
    }

    private static final PlatformSpanStyle mergePlatformStyle(SpanStyle spanStyle, PlatformSpanStyle platformSpanStyle) {
        if (spanStyle.getPlatformStyle() == null) {
            return platformSpanStyle;
        }
        return platformSpanStyle == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().merge(platformSpanStyle);
    }

    @NotNull
    public static final SpanStyle resolveSpanStyleDefaults(@NotNull SpanStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        TextForegroundStyle textForegroundStyleTakeOrElse = style.getTextForegroundStyle().takeOrElse(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextForegroundStyle invoke() {
                return TextForegroundStyle.INSTANCE.m3700from8_81llA(SpanStyleKt.DefaultColor);
            }
        });
        long fontSize = TextUnitKt.m3974isUnspecifiedR2X_6o(style.getFontSize()) ? DefaultFontSize : style.getFontSize();
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = style.getFontStyle();
        FontStyle fontStyleM3413boximpl = FontStyle.m3413boximpl(fontStyle != null ? fontStyle.m3419unboximpl() : FontStyle.INSTANCE.m3421getNormal_LCdwA());
        FontSynthesis fontSynthesis = style.getFontSynthesis();
        FontSynthesis fontSynthesisM3422boximpl = FontSynthesis.m3422boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m3431getAllGVVA2EU());
        FontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.INSTANCE.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = TextUnitKt.m3974isUnspecifiedR2X_6o(style.getLetterSpacing()) ? DefaultLetterSpacing : style.getLetterSpacing();
        BaselineShift baselineShift = style.getBaselineShift();
        BaselineShift baselineShiftM3574boximpl = BaselineShift.m3574boximpl(baselineShift != null ? baselineShift.m3580unboximpl() : BaselineShift.INSTANCE.m3584getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long background = style.getBackground();
        if (!(background != Color.INSTANCE.m1717getUnspecified0d7_KjU())) {
            background = DefaultBackgroundColor;
        }
        long j = background;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = style.getPlatformStyle();
        DrawStyle drawStyle = style.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, fontSize, fontWeight2, fontStyleM3413boximpl, fontSynthesisM3422boximpl, fontFamily2, str, letterSpacing, baselineShiftM3574boximpl, textGeometricTransform2, localeList2, j, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}
