package com.code.android.util;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p186o00o00oO.o00O0;
import p186o00o00oO.o00O00OO;
import p186o00o00oO.o00O00o0;
import p186o00o00oO.oo00o;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nStatusBarUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusBarUtil.kt\ncom/code/android/util/StatusBarUtilKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,232:1\n67#2,3:233\n66#2:236\n1097#3,6:237\n*S KotlinDebug\n*F\n+ 1 StatusBarUtil.kt\ncom/code/android/util/StatusBarUtilKt\n*L\n229#1:233,3\n229#1:236\n229#1:237,6\n*E\n"})
public final class o000OO {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo00o f10363OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f10364OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f10365OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00OO o00o00oo2, long j, boolean z) {
            super(0);
            this.f10363OooO0Oo = o00o00oo2;
            this.f10365OooO0o0 = j;
            this.f10364OooO0o = z;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O00o0.OooO0O0(this.f10363OooO0Oo, this.f10365OooO0o0, this.f10364OooO0o, 4);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f10366OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f10367OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f10368OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, boolean z, int i) {
            super(2);
            this.f10366OooO0Oo = j;
            this.f10368OooO0o0 = z;
            this.f10367OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10367OooO0o | 1);
            o000OO.OooO00o(this.f10366OooO0Oo, this.f10368OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public static final void OooO00o(long j, boolean z, @Nullable Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1847825797);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1847825797, i2, -1, "com.code.android.util.setStatusBarColor (StatusBarUtil.kt:226)");
            }
            o00O00OO o00o00ooOooO00o = o00O0.OooO00o(composerStartRestartGroup);
            Color colorM1660boximpl = Color.m1660boximpl(j);
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(colorM1660boximpl) | composerStartRestartGroup.changed(o00o00ooOooO00o) | composerStartRestartGroup.changed(boolValueOf);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO00o(o00o00ooOooO00o, j, z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(j, z, i));
    }
}
