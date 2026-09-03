package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.OooO0OO;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001ai\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001ak\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0083\u0001\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001am\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020/2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a)\u00102\u001a\u000203*\u00020\u00062\u0006\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00066"}, d2 = {"clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", ViewHierarchyConstants.TEXT_KEY, "Landroidx/compose/ui/text/AnnotatedString;", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "size", "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,398:1\n261#2,11:399\n261#2,11:410\n261#2,8:421\n269#2,3:432\n261#2,11:435\n652#3:429\n658#3:430\n646#3:431\n159#4:446\n159#4:447\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n167#1:399,11\n233#1:410,11\n277#1:421,8\n277#1:432,3\n337#1:435,11\n284#1:429\n297#1:430\n297#1:431\n375#1:446\n387#1:447\n*E\n"})
public final class TextPainterKt {
    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m3711equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m3720getVisiblegIe3tQ8())) {
            return;
        }
        OooO0OO.OooO0Oo(drawTransform, 0.0f, 0.0f, IntSize.m3925getWidthimpl(textLayoutResult.getSize()), IntSize.m3924getHeightimpl(textLayoutResult.getSize()), 0, 16, null);
    }

    /* JADX INFO: renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m3289drawTextJFhB2K4(@NotNull DrawScope drawText, @NotNull TextMeasurer textMeasurer, @NotNull AnnotatedString text, long j, @NotNull TextStyle style, int i, boolean z, int i2, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, long j2, int i3) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        TextLayoutResult textLayoutResultM3286measurexDpz5zY$default = TextMeasurer.m3286measurexDpz5zY$default(textMeasurer, text, style, i, z, i2, placeholders, m3297textLayoutConstraintsv_w8tDc(drawText, j2, j), drawText.getLayoutDirection(), drawText, null, false, 1536, null);
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2114getSizeNHjbRc = drawContext.mo2114getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m1436getXimpl(j), Offset.m1437getYimpl(j));
        clip(transform, textLayoutResultM3286measurexDpz5zY$default);
        textLayoutResultM3286measurexDpz5zY$default.getMultiParagraph().m3203paintLG529CI(drawText.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m1706getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m2138getDefaultBlendMode0nO6VwU() : i3);
        drawContext.getCanvas().restore();
        drawContext.mo2115setSizeuvyYCjk(jMo2114getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m3291drawTextLVfH_YU(@NotNull DrawScope drawText, @NotNull TextLayoutResult textLayoutResult, @NotNull Brush brush, long j, float f, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2114getSizeNHjbRc = drawContext.mo2114getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m1436getXimpl(j), Offset.m1437getYimpl(j));
        clip(transform, textLayoutResult);
        textLayoutResult.getMultiParagraph().m3205painthn5TExg(drawText.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
        drawContext.getCanvas().restore();
        drawContext.mo2115setSizeuvyYCjk(jMo2114getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m3293drawTextTPWCCtM(@NotNull DrawScope drawText, @NotNull TextMeasurer textMeasurer, @NotNull String text, long j, @NotNull TextStyle style, int i, boolean z, int i2, long j2, int i3) {
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        TextLayoutResult textLayoutResultM3286measurexDpz5zY$default = TextMeasurer.m3286measurexDpz5zY$default(textMeasurer, new AnnotatedString(text, null, null, 6, null), style, i, z, i2, null, m3297textLayoutConstraintsv_w8tDc(drawText, j2, j), drawText.getLayoutDirection(), drawText, null, false, 1568, null);
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2114getSizeNHjbRc = drawContext.mo2114getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m1436getXimpl(j), Offset.m1437getYimpl(j));
        clip(transform, textLayoutResultM3286measurexDpz5zY$default);
        textLayoutResultM3286measurexDpz5zY$default.getMultiParagraph().m3203paintLG529CI(drawText.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m1706getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m2138getDefaultBlendMode0nO6VwU() : i3);
        drawContext.getCanvas().restore();
        drawContext.mo2115setSizeuvyYCjk(jMo2114getSizeNHjbRc);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX INFO: renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m3295drawTextd8rzKo(@NotNull DrawScope drawText, @NotNull TextLayoutResult textLayoutResult, long j, long j2, float f, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int i) {
        long jM3331getColor0d7_KjU;
        Intrinsics.checkNotNullParameter(drawText, "$this$drawText");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawText.getDrawContext();
        long jMo2114getSizeNHjbRc = drawContext.mo2114getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        transform.translate(Offset.m1436getXimpl(j2), Offset.m1437getYimpl(j2));
        clip(transform, textLayoutResult);
        Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
        if (brush == null) {
            MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
            Canvas canvas = drawText.getDrawContext().getCanvas();
            if (j != Color.INSTANCE.m1706getUnspecified0d7_KjU()) {
                jM3331getColor0d7_KjU = j;
            } else {
                jM3331getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m3331getColor0d7_KjU();
            }
            multiParagraph.m3203paintLG529CI(canvas, TextDrawStyleKt.m3689modulateDxMtmZc(jM3331getColor0d7_KjU, f), shadow2, textDecoration2, drawStyle2, i);
        } else {
            if (j == Color.INSTANCE.m1706getUnspecified0d7_KjU()) {
                textLayoutResult.getMultiParagraph().m3205painthn5TExg(drawText.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i);
            } else {
                MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
                Canvas canvas2 = drawText.getDrawContext().getCanvas();
                if (j != Color.INSTANCE.m1706getUnspecified0d7_KjU()) {
                    jM3331getColor0d7_KjU = j;
                } else {
                    jM3331getColor0d7_KjU = textLayoutResult.getLayoutInput().getStyle().m3331getColor0d7_KjU();
                }
                multiParagraph2.m3203paintLG529CI(canvas2, TextDrawStyleKt.m3689modulateDxMtmZc(jM3331getColor0d7_KjU, f), shadow2, textDecoration2, drawStyle2, i);
            }
        }
        drawContext.getCanvas().restore();
        drawContext.mo2115setSizeuvyYCjk(jMo2114getSizeNHjbRc);
    }

    /* JADX INFO: renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m3297textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j, long j2) {
        int iRoundToInt;
        int iRoundToInt2;
        int iRoundToInt3;
        Size.Companion companion = Size.INSTANCE;
        boolean z = true;
        int iRoundToInt4 = 0;
        if (((j > companion.m1513getUnspecifiedNHjbRc() ? 1 : (j == companion.m1513getUnspecifiedNHjbRc() ? 0 : -1)) == 0) || Float.isNaN(Size.m1505getWidthimpl(j))) {
            iRoundToInt2 = MathKt.roundToInt((float) Math.ceil(Size.m1505getWidthimpl(drawScope.mo2108getSizeNHjbRc()) - Offset.m1436getXimpl(j2)));
            iRoundToInt = 0;
        } else {
            iRoundToInt = MathKt.roundToInt((float) Math.ceil(Size.m1505getWidthimpl(j)));
            iRoundToInt2 = iRoundToInt;
        }
        if (!(j == companion.m1513getUnspecifiedNHjbRc()) && !Float.isNaN(Size.m1502getHeightimpl(j))) {
            z = false;
        }
        if (z) {
            iRoundToInt3 = MathKt.roundToInt((float) Math.ceil(Size.m1502getHeightimpl(drawScope.mo2108getSizeNHjbRc()) - Offset.m1437getYimpl(j2)));
        } else {
            iRoundToInt4 = MathKt.roundToInt((float) Math.ceil(Size.m1502getHeightimpl(j)));
            iRoundToInt3 = iRoundToInt4;
        }
        return ConstraintsKt.Constraints(iRoundToInt, iRoundToInt2, iRoundToInt4, iRoundToInt3);
    }
}
