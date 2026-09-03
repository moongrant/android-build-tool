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
    public final /* synthetic */ boolean f13364OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f13365OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f13366OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f13367OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f13368OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ float f13369OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f13370OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f13371OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f13372OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ long f13373OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ long f13374OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(boolean z, float f, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, boolean z5, long j, long j2) {
        super(1);
        this.f13365OooO0Oo = z;
        this.f13367OooO0o0 = f;
        this.f13366OooO0o = f2;
        this.f13368OooO0oO = f3;
        this.f13369OooO0oo = f4;
        this.f13364OooO = z2;
        this.f13370OooOO0 = z3;
        this.f13371OooOO0O = z4;
        this.f13372OooOO0o = z5;
        this.f13374OooOOO0 = j;
        this.f13373OooOOO = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ContentDrawScope contentDrawScope) {
        ContentDrawScope drawWithContent = contentDrawScope;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        if (this.f13365OooO0Oo) {
            float fMo326toPx0680j_4 = drawWithContent.mo326toPx0680j_4(this.f13367OooO0o0);
            float fMo326toPx0680j_5 = drawWithContent.mo326toPx0680j_4(this.f13366OooO0o);
            float fMo326toPx0680j_6 = drawWithContent.mo326toPx0680j_4(this.f13368OooO0oO);
            float fM1516getWidthimpl = fMo326toPx0680j_6 + 0.0f;
            float fMo326toPx0680j_7 = drawWithContent.mo326toPx0680j_4(this.f13369OooO0oo) + 0.0f;
            float f = 2;
            float f2 = fMo326toPx0680j_5 * f;
            boolean z = this.f13364OooO;
            boolean z2 = this.f13371OooOO0O;
            if (z && this.f13370OooOO0) {
                fM1516getWidthimpl += (Size.m1516getWidthimpl(drawWithContent.mo2118getSizeNHjbRc()) - f2) - (fMo326toPx0680j_6 * f);
                if (z2) {
                    fM1516getWidthimpl -= Size.m1516getWidthimpl(drawWithContent.mo2118getSizeNHjbRc()) - f2;
                }
            } else if (z2) {
                fM1516getWidthimpl += Size.m1516getWidthimpl(drawWithContent.mo2118getSizeNHjbRc()) - f2;
            }
            float f3 = fM1516getWidthimpl;
            if (this.f13372OooOO0o) {
                fMo326toPx0680j_7 += Size.m1513getHeightimpl(drawWithContent.mo2118getSizeNHjbRc()) - f2;
            }
            float f4 = fMo326toPx0680j_7;
            float f5 = 1000;
            androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, this.f13374OooOOO0, OffsetKt.Offset(f3, f4), SizeKt.Size(f2, f2), CornerRadiusKt.CornerRadius(drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f5)), drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f5))), null, 0.0f, null, 0, 240, null);
            if (fMo326toPx0680j_4 > 0.0f) {
                androidx.compose.ui.graphics.drawscope.OooO0O0.Oooo0o(drawWithContent, this.f13373OooOOO, OffsetKt.Offset(f3, f4), SizeKt.Size(f2, f2), CornerRadiusKt.CornerRadius(drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f5)), drawWithContent.mo326toPx0680j_4(Dp.m3775constructorimpl(f5))), new Stroke(fMo326toPx0680j_4, 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
            }
        }
        return Unit.INSTANCE;
    }
}
