package com.code.android.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRedPointCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt$redPointNumber$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,293:1\n76#2:294\n83#3,3:295\n1097#4,6:298\n*S KotlinDebug\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt$redPointNumber$1\n*L\n63#1:294\n65#1:295,3\n65#1:298,6\n*E\n"})
public final class o00000OO extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ float f10337OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ float f10338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f10339OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f10340OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Integer f10341OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f10342OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f10343OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ long f10344OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ float f10345OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ boolean f10346OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f10347OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ boolean f10348OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ long f10349OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ long f10350OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(float f, float f2, float f3, Integer num, long j, float f4, boolean z, long j2, float f5, boolean z2, boolean z3, boolean z4, long j3, long j4) {
        super(3);
        this.f10338OooO0Oo = f;
        this.f10340OooO0o0 = f2;
        this.f10339OooO0o = f3;
        this.f10341OooO0oO = num;
        this.f10342OooO0oo = j;
        this.f10337OooO = f4;
        this.f10343OooOO0 = z;
        this.f10344OooOO0O = j2;
        this.f10345OooOO0o = f5;
        this.f10347OooOOO0 = z2;
        this.f10346OooOOO = z3;
        this.f10348OooOOOO = z4;
        this.f10349OooOOOo = j3;
        this.f10350OooOOo0 = j4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-1794745039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1794745039, iIntValue, -1, "com.code.android.util.redPointNumber.<anonymous> (RedPointCompose.kt:61)");
        }
        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        Object[] objArr = {Dp.m3763boximpl(this.f10338OooO0Oo), Dp.m3763boximpl(this.f10340OooO0o0), Dp.m3763boximpl(this.f10339OooO0o), this.f10341OooO0oO, TextUnit.m3936boximpl(this.f10342OooO0oo), Dp.m3763boximpl(this.f10337OooO), Boolean.valueOf(this.f10343OooOO0), Color.m1660boximpl(this.f10344OooOO0O), Float.valueOf(this.f10345OooOO0o), Boolean.valueOf(this.f10347OooOOO0), Boolean.valueOf(z), Boolean.valueOf(this.f10346OooOOO), Boolean.valueOf(this.f10348OooOOOO), Color.m1660boximpl(this.f10349OooOOOo), Color.m1660boximpl(this.f10350OooOOo0)};
        float f = this.f10338OooO0Oo;
        float f2 = this.f10340OooO0o0;
        float f3 = this.f10339OooO0o;
        Integer num2 = this.f10341OooO0oO;
        long j = this.f10342OooO0oo;
        float f4 = this.f10337OooO;
        boolean z2 = this.f10343OooOO0;
        boolean z3 = this.f10347OooOOO0;
        boolean z4 = this.f10346OooOOO;
        boolean z5 = this.f10348OooOOOO;
        long j2 = this.f10349OooOOOo;
        long j3 = this.f10350OooOOo0;
        long j4 = this.f10344OooOO0O;
        float f5 = this.f10345OooOO0o;
        composer2.startReplaceableGroup(-568225417);
        int i = 0;
        boolean zChanged = false;
        for (int i2 = 15; i < i2; i2 = 15) {
            zChanged |= composer2.changed(objArr[i]);
            i++;
        }
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o00000O(f, f2, f3, num2, j, f4, z2, z3, z, z4, z5, j2, j3, j4, f5);
            composer2.updateRememberedValue(objRememberedValue);
        }
        composer2.endReplaceableGroup();
        Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierDrawWithContent;
    }
}
