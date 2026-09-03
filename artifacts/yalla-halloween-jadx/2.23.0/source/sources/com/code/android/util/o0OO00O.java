package com.code.android.util;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nModifierUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierUtil.kt\ncom/code/android/util/ModifierUtilKt$avoidFastClick$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,230:1\n25#2:231\n25#2:239\n1097#3,6:232\n1097#3,6:240\n76#4:238\n*S KotlinDebug\n*F\n+ 1 ModifierUtil.kt\ncom/code/android/util/ModifierUtilKt$avoidFastClick$1\n*L\n41#1:231\n45#1:239\n41#1:232,6\n45#1:240,6\n44#1:238\n*E\n"})
public final class o0OO00O extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f10394OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f10395OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f10396OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f10397OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Role f10398OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f10399OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ boolean f10400OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ long f10401OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f10402OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(boolean z, boolean z2, String str, Role role, Function0<Unit> function0, Function0<Unit> function1, boolean z3, long j, Function0<Unit> function2) {
        super(3);
        this.f10395OooO0Oo = z;
        this.f10397OooO0o0 = z2;
        this.f10396OooO0o = str;
        this.f10398OooO0oO = role;
        this.f10399OooO0oo = function0;
        this.f10394OooO = function1;
        this.f10400OooOO0 = z3;
        this.f10401OooOO0O = j;
        this.f10402OooOO0o = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        Modifier modifierM203combinedClickableXVZzFYc;
        Modifier composed = modifier;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer2.startReplaceableGroup(-146647568);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-146647568, iIntValue, -1, "com.code.android.util.avoidFastClick.<anonymous> (ModifierUtil.kt:38)");
        }
        if (this.f10395OooO0Oo) {
            Ref.LongRef longRef = new Ref.LongRef();
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = 0L;
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            longRef.element = ((Number) objRememberedValue).longValue();
            composer2.startReplaceableGroup(433529234);
            Indication indication = this.f10397OooO0o0 ? (Indication) composer2.consume(IndicationKt.getLocalIndication()) : null;
            composer2.endReplaceableGroup();
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            modifierM203combinedClickableXVZzFYc = ClickableKt.m203combinedClickableXVZzFYc(composed, (MutableInteractionSource) objRememberedValue2, indication, (36 & 4) != 0, (36 & 8) != 0 ? null : this.f10396OooO0o, (36 & 16) != 0 ? null : this.f10398OooO0oO, (36 & 32) != 0 ? null : null, (36 & 64) != 0 ? null : this.f10399OooO0oo, (36 & 128) != 0 ? null : this.f10394OooO, new o0Oo0oo(this.f10400OooOO0, this.f10401OooOO0O, this.f10402OooOO0o, longRef));
        } else {
            modifierM203combinedClickableXVZzFYc = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceableGroup();
        return modifierM203combinedClickableXVZzFYc;
    }
}
