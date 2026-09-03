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
    public final /* synthetic */ float f10312OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f10313OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f10314OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f10315OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Integer f10316OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f10317OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f10318OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f10319OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f10320OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ boolean f10321OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f10322OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ long f10323OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ long f10324OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final /* synthetic */ float f10325OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ long f10326OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(float f, float f2, float f3, Integer num, long j, float f4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j2, long j3, long j4, float f5) {
        super(1);
        this.f10313OooO0Oo = f;
        this.f10315OooO0o0 = f2;
        this.f10314OooO0o = f3;
        this.f10316OooO0oO = num;
        this.f10317OooO0oo = j;
        this.f10312OooO = f4;
        this.f10318OooOO0 = z;
        this.f10319OooOO0O = z2;
        this.f10320OooOO0o = z3;
        this.f10322OooOOO0 = z4;
        this.f10321OooOOO = z5;
        this.f10323OooOOOO = j2;
        this.f10324OooOOOo = j3;
        this.f10326OooOOo0 = j4;
        this.f10325OooOOo = f5;
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
        float fMo324toPx0680j_4 = drawWithContent.mo324toPx0680j_4(this.f10313OooO0Oo);
        float fMo324toPx0680j_5 = drawWithContent.mo324toPx0680j_4(this.f10315OooO0o0);
        float fM1505getWidthimpl = fMo324toPx0680j_5 + 0.0f;
        float fMo324toPx0680j_6 = drawWithContent.mo324toPx0680j_4(this.f10314OooO0o) + 0.0f;
        Integer num = this.f10316OooO0oO;
        if ((num != null ? num.intValue() : 0) > 0) {
            Intrinsics.checkNotNull(num);
            String string = num.intValue() > 99 ? "..." : num.toString();
            long j = this.f10323OooOOOO;
            long j2 = this.f10324OooOOOo;
            Canvas canvas = drawWithContent.getDrawContext().getCanvas();
            float fMo323toPxR2X_6o = drawWithContent.mo323toPxR2X_6o(this.f10317OooO0oo);
            float f5 = 2;
            float fMo324toPx0680j_7 = drawWithContent.mo324toPx0680j_4(this.f10312OooO) * f5;
            float f6 = (this.f10318OooOO0 || num.toString().length() != 2) ? fMo324toPx0680j_7 : 1.34375f * fMo324toPx0680j_7;
            Paint internalPaint = AndroidPaint_androidKt.Paint().getInternalPaint();
            internalPaint.setAntiAlias(true);
            internalPaint.setDither(true);
            internalPaint.setColor(ColorKt.m1724toArgb8_81llA(this.f10326OooOOo0));
            internalPaint.setTextSize(num.intValue() > 99 ? this.f10325OooOOo * fMo323toPxR2X_6o : fMo323toPxR2X_6o);
            internalPaint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
            internalPaint.setTextAlign(Paint.Align.CENTER);
            float fMeasureText = internalPaint.measureText(string);
            boolean z = this.f10319OooOO0O;
            boolean z2 = this.f10322OooOOO0;
            if (z && this.f10320OooOO0o) {
                fM1505getWidthimpl += (Size.m1505getWidthimpl(drawWithContent.mo2108getSizeNHjbRc()) - f6) - (fMo324toPx0680j_5 * f5);
                if (z2) {
                    fM1505getWidthimpl -= Size.m1505getWidthimpl(drawWithContent.mo2108getSizeNHjbRc()) - f6;
                }
            } else if (z2) {
                fM1505getWidthimpl += Size.m1505getWidthimpl(drawWithContent.mo2108getSizeNHjbRc()) - f6;
            }
            float f7 = fM1505getWidthimpl;
            if (this.f10321OooOOO) {
                fMo324toPx0680j_6 += Size.m1502getHeightimpl(drawWithContent.mo2108getSizeNHjbRc()) - fMo324toPx0680j_7;
            }
            float f8 = fMo324toPx0680j_6;
            float f9 = 1000;
            float f10 = f6;
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, j, OffsetKt.Offset(f7, f8), SizeKt.Size(f6, fMo324toPx0680j_7), CornerRadiusKt.CornerRadius(drawWithContent.mo324toPx0680j_4(Dp.m3765constructorimpl(f9)), drawWithContent.mo324toPx0680j_4(Dp.m3765constructorimpl(f9))), null, 0.0f, null, 0, 240, null);
            if (fMo324toPx0680j_4 > 0.0f) {
                long jSize = SizeKt.Size(f10, fMo324toPx0680j_7);
                long jOffset = OffsetKt.Offset(f7, f8);
                long jCornerRadius = CornerRadiusKt.CornerRadius(drawWithContent.mo324toPx0680j_4(Dp.m3765constructorimpl(f9)), drawWithContent.mo324toPx0680j_4(Dp.m3765constructorimpl(f9)));
                Stroke stroke = new Stroke(fMo324toPx0680j_4, 0.0f, 0, 0, null, 30, null);
                f3 = f8;
                f4 = f7;
                f2 = f10;
                f = fMo324toPx0680j_7;
                androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, j2, jOffset, jSize, jCornerRadius, stroke, 0.0f, null, 0, 224, null);
            } else {
                f = fMo324toPx0680j_7;
                f2 = f10;
                f3 = f8;
                f4 = f7;
            }
            AndroidCanvas_androidKt.getNativeCanvas(canvas).drawText(string, ((f2 - fMeasureText) / 2.0f) + (fMeasureText / 2.0f) + f4, (f / 2.0f) + f3 + ((fMo323toPxR2X_6o / 100.0f) * (num.intValue() > 99 ? 6 : 34)), internalPaint);
        }
        return Unit.INSTANCE;
    }
}
