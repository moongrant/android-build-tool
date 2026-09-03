package com.code.android.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRedPointCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt$redPointCircle$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,293:1\n76#2:294\n83#3,3:295\n1097#4,6:298\n*S KotlinDebug\n*F\n+ 1 RedPointCompose.kt\ncom/code/android/util/RedPointComposeKt$redPointCircle$1\n*L\n214#1:294\n216#1:295,3\n216#1:298,6\n*E\n"})
public final class o00000O0 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ boolean f13390OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f13391OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f13392OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ float f13393OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ float f13394OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ float f13395OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f13396OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f13397OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ long f13398OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ long f13399OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(boolean z, float f, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, long j, long j2) {
        super(3);
        this.f13391OooO0Oo = z;
        this.f13393OooO0o0 = f;
        this.f13392OooO0o = f2;
        this.f13394OooO0oO = f3;
        this.f13395OooO0oo = f4;
        this.f13390OooO = z2;
        this.f13396OooOO0 = z3;
        this.f13397OooOO0O = z4;
        this.f13398OooOO0o = j;
        this.f13399OooOOO0 = j2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(709648673);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(709648673, iIntValue, -1, "com.code.android.util.redPointCircle.<anonymous> (RedPointCompose.kt:213)");
        }
        boolean z = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
        Object[] objArr = {Boolean.valueOf(this.f13391OooO0Oo), Dp.m3773boximpl(this.f13393OooO0o0), Dp.m3773boximpl(this.f13392OooO0o), Dp.m3773boximpl(this.f13394OooO0oO), Dp.m3773boximpl(this.f13395OooO0oo), Boolean.valueOf(this.f13390OooO), Boolean.valueOf(z), Boolean.valueOf(this.f13396OooOO0), Boolean.valueOf(this.f13397OooOO0O), Color.m1671boximpl(this.f13398OooOO0o), Color.m1671boximpl(this.f13399OooOOO0)};
        boolean z2 = this.f13391OooO0Oo;
        float f = this.f13393OooO0o0;
        float f2 = this.f13392OooO0o;
        float f3 = this.f13394OooO0oO;
        float f4 = this.f13395OooO0oo;
        boolean z3 = this.f13390OooO;
        boolean z4 = this.f13396OooOO0;
        boolean z5 = this.f13397OooOO0O;
        long j = this.f13398OooOO0o;
        long j2 = this.f13399OooOOO0;
        composer2.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i = 0; i < 11; i++) {
            zChanged |= composer2.changed(objArr[i]);
        }
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new o00000(z2, f, f2, f3, f4, z3, z, z4, z5, j, j2);
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
