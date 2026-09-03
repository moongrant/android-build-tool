package com.code.android.util;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRedPointCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt$redPointCircle$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,293:1\n154#2:294\n154#2:295\n154#2:296\n154#2:297\n*S KotlinDebug\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt$redPointCircle$1$1$1\n*L\n262#1:294\n263#1:295\n280#1:296\n281#1:297\n*E\n"})
public final class o00000 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f10301OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f10302OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f10303OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f10304OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f10305OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ float f10306OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f10307OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f10308OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f10309OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ long f10310OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ long f10311OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(boolean z, float f, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, boolean z5, long j, long j2) {
        super(1);
        this.f10302OooO0Oo = z;
        this.f10304OooO0o0 = f;
        this.f10303OooO0o = f2;
        this.f10305OooO0oO = f3;
        this.f10306OooO0oo = f4;
        this.f10301OooO = z2;
        this.f10307OooOO0 = z3;
        this.f10308OooOO0O = z4;
        this.f10309OooOO0o = z5;
        this.f10311OooOOO0 = j;
        this.f10310OooOOO = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope drawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        if (this.f10302OooO0Oo) {
            float fMo324toPx0680j_4 = drawWithContent.mo324toPx0680j_4(this.f10304OooO0o0);
            float fMo324toPx0680j_5 = drawWithContent.mo324toPx0680j_4(this.f10303OooO0o);
            float fMo324toPx0680j_6 = drawWithContent.mo324toPx0680j_4(this.f10305OooO0oO);
            float fM1505getWidthimpl = fMo324toPx0680j_6 + 0.0f;
            float fMo324toPx0680j_7 = drawWithContent.mo324toPx0680j_4(this.f10306OooO0oo) + 0.0f;
            float f = 2;
            float f2 = fMo324toPx0680j_5 * f;
            boolean z = this.f10301OooO;
            boolean z2 = this.f10308OooOO0O;
            if (z && this.f10307OooOO0) {
                fM1505getWidthimpl += (Size.m1505getWidthimpl(drawWithContent.mo2108getSizeNHjbRc()) - f2) - (fMo324toPx0680j_6 * f);
                if (z2) {
                    fM1505getWidthimpl -= Size.m1505getWidthimpl(drawWithContent.mo2108getSizeNHjbRc()) - f2;
                }
            } else if (z2) {
                fM1505getWidthimpl += Size.m1505getWidthimpl(drawWithContent.mo2108getSizeNHjbRc()) - f2;
            }
            float f3 = fM1505getWidthimpl;
            if (this.f10309OooOO0o) {
                fMo324toPx0680j_7 += Size.m1502getHeightimpl(drawWithContent.mo2108getSizeNHjbRc()) - f2;
            }
            float f4 = fMo324toPx0680j_7;
            float f5 = 1000;
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, this.f10311OooOOO0, OffsetKt.Offset(f3, f4), SizeKt.Size(f2, f2), CornerRadiusKt.CornerRadius(drawWithContent.mo324toPx0680j_4(Dp.m3765constructorimpl(f5)), drawWithContent.mo324toPx0680j_4(Dp.m3765constructorimpl(f5))), null, 0.0f, null, 0, 240, null);
            if (fMo324toPx0680j_4 > 0.0f) {
                androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, this.f10310OooOOO, OffsetKt.Offset(f3, f4), SizeKt.Size(f2, f2), CornerRadiusKt.CornerRadius(drawWithContent.mo324toPx0680j_4(Dp.m3765constructorimpl(f5)), drawWithContent.mo324toPx0680j_4(Dp.m3765constructorimpl(f5))), new Stroke(fMo324toPx0680j_4, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
            }
        }
        return Unit.INSTANCE;
    }
}
