package com.code.android.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f13469OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Color f13470OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Dp f13471OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f13472OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Brush f13473OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(float f, Dp dp, Color color, long j, Brush brush) {
        super(1);
        this.f13469OooO0Oo = f;
        this.f13471OooO0o0 = dp;
        this.f13470OooO0o = color;
        this.f13472OooO0oO = j;
        this.f13473OooO0oo = brush;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope drawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        float fMo326toPx0680j_4 = drawWithContent.mo326toPx0680j_4(this.f13469OooO0Oo);
        Dp dp = this.f13471OooO0o0;
        float fMo326toPx0680j_5 = dp != null ? drawWithContent.mo326toPx0680j_4(dp.m3789unboximpl()) : 0.0f;
        long j = this.f13472OooO0oO;
        Color color = this.f13470OooO0o;
        if (color != null) {
            androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo(drawWithContent, color.m1691unboximpl(), fMo326toPx0680j_4, Offset.m1452plusMKHz9U(drawWithContent.mo2117getCenterF1C5BW0(), j), 0.0f, fMo326toPx0680j_5 > 0.0f ? new Stroke(fMo326toPx0680j_5, 0.0f, 0, 0, null, 30, null) : Fill.INSTANCE, null, 0, 104, null);
        } else {
            Brush brush = this.f13473OooO0oo;
            if (brush != null) {
                androidx.compose.ui.graphics.drawscope.OooO0O0.OooOo0o(drawWithContent, brush, fMo326toPx0680j_4, Offset.m1452plusMKHz9U(drawWithContent.mo2117getCenterF1C5BW0(), j), 0.0f, fMo326toPx0680j_5 > 0.0f ? new Stroke(fMo326toPx0680j_5, 0.0f, 0, 0, null, 30, null) : Fill.INSTANCE, null, 0, 104, null);
            }
        }
        drawWithContent.drawContent();
        return Unit.INSTANCE;
    }
}
