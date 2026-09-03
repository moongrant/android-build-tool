package com.code.android.util;

import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRedPointCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt$redPointNumber$1$1$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,293:1\n245#2:294\n154#3:295\n154#3:296\n154#3:297\n154#3:298\n*S KotlinDebug\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt$redPointNumber$1$1$1\n*L\n88#1:294\n142#1:295\n143#1:296\n160#1:297\n161#1:298\n*E\n"})
public final class o00000O extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ float f13375OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f13376OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f13377OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f13378OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Integer f13379OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f13380OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f13381OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f13382OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f13383OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ boolean f13384OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f13385OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ long f13386OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ long f13387OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final /* synthetic */ float f13388OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ long f13389OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(float f, float f2, float f3, Integer num, long j, float f4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, long j4, float f5) {
        super(1);
        this.f13376OooO0Oo = f;
        this.f13378OooO0o0 = f2;
        this.f13377OooO0o = f3;
        this.f13379OooO0oO = num;
        this.f13380OooO0oo = j;
        this.f13375OooO = f4;
        this.f13381OooOO0 = z;
        this.f13382OooOO0O = z2;
        this.f13383OooOO0o = z3;
        this.f13385OooOOO0 = z4;
        this.f13384OooOOO = z5;
        this.f13386OooOOOO = j2;
        this.f13387OooOOOo = j3;
        this.f13389OooOOo0 = j4;
        this.f13388OooOOo = f5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        float f;
        float f2;
        float f3;
        float f4;
        ContentDrawScope drawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        float fMo326toPx0680j_4 = drawWithContent.mo326toPx0680j_4(this.f13376OooO0Oo);
        float fMo326toPx0680j_5 = drawWithContent.mo326toPx0680j_4(this.f13378OooO0o0);
        float fM1516getWidthimpl = fMo326toPx0680j_5 + 0.0f;
        float fMo326toPx0680j_6 = drawWithContent.mo326toPx0680j_4(this.f13377OooO0o) + 0.0f;
        Integer num = this.f13379OooO0oO;
        if ((num != null ? num.intValue() : 0) > 0) {
            Intrinsics.checkNotNull(num);
            String string = num.intValue() > 99 ? "..." : num.toString();
            long j = this.f13386OooOOOO;
            long j2 = this.f13387OooOOOo;
            Canvas canvas = drawWithContent.getDrawContext().getCanvas();
            float fMo325toPxR2X_6o = drawWithContent.mo325toPxR2X_6o(this.f13380OooO0oo);
            float f5 = 2;
            float fMo326toPx0680j_7 = drawWithContent.mo326toPx0680j_4(this.f13375OooO) * f5;
            float f6 = (this.f13381OooOO0 || num.toString().length() != 2) ? fMo326toPx0680j_7 : 1.34375f * fMo326toPx0680j_7;
            Paint internalPaint = AndroidPaint_androidKt.Paint().getInternalPaint();
            internalPaint.setAntiAlias(true);
            internalPaint.setDither(true);
            internalPaint.setColor(ColorKt.m1735toArgb8_81llA(this.f13389OooOOo0));
            internalPaint.setTextSize(num.intValue() > 99 ? this.f13388OooOOo * fMo325toPxR2X_6o : fMo325toPxR2X_6o);
            internalPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
            internalPaint.setTextAlign(Paint.Align.CENTER);
            float fMeasureText = internalPaint.measureText(string);
            boolean z = this.f13382OooOO0O;
            boolean z2 = this.f13385OooOOO0;
            if (z && this.f13383OooOO0o) {
                fM1516getWidthimpl += (Size.m1516getWidthimpl(drawWithContent.mo2118getSizeNHjbRc()) - f6) - (fMo326toPx0680j_5 * f5);
                if (z2) {
                    fM1516getWidthimpl -= Size.m1516getWidthimpl(drawWithContent.mo2118getSizeNHjbRc()) - f6;
                }
            } else if (z2) {
                fM1516getWidthimpl += Size.m1516getWidthimpl(drawWithContent.mo2118getSizeNHjbRc()) - f6;
            }
            float f7 = fM1516getWidthimpl;
            if (this.f13384OooOOO) {
                fMo326toPx0680j_6 += Size.m1513getHeightimpl(drawWithContent.mo2118getSizeNHjbRc()) - fMo326toPx0680j_7;
            }
            float f8 = fMo326toPx0680j_6;
            float f9 = 1000;
            float f10 = f6;
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, j, OffsetKt.Offset(f7, f8), SizeKt.Size(f6, fMo326toPx0680j_7), CornerRadiusKt.CornerRadius(drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f9)), drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f9))), null, 0.0f, null, 0, 240, null);
            if (fMo326toPx0680j_4 > 0.0f) {
                long jSize = SizeKt.Size(f10, fMo326toPx0680j_7);
                long jOffset = OffsetKt.Offset(f7, f8);
                long jCornerRadius = CornerRadiusKt.CornerRadius(drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f9)), drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f9)));
                Stroke stroke = new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null);
                f3 = f8;
                f4 = f7;
                f2 = f10;
                f = fMo326toPx0680j_7;
                androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, j2, jOffset, jSize, jCornerRadius, stroke, 0.0f, null, 0, 224, null);
            } else {
                f = fMo326toPx0680j_7;
                f2 = f10;
                f3 = f8;
                f4 = f7;
            }
            AndroidCanvas_androidKt.getNativeCanvas(canvas).drawText(string, ((f2 - fMeasureText) / 2.0f) + (fMeasureText / 2.0f) + f4, (f / 2.0f) + f3 + ((fMo325toPxR2X_6o / 100.0f) * (num.intValue() > 99 ? 6 : 34)), internalPaint);
        }
        return Unit.INSTANCE;
    }
}
