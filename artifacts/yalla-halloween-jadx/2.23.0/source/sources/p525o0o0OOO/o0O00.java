package p525o0o0OOO;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material.OooO0o;
import androidx.compose.material.TabRowKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.accompanist.pager.Pager;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p147o00Oo0Oo.o000OOo;
import p184o00o00o.Oooo000;
import p184o00o00o.o000oOoO;
import p507o0o00ooo.j1;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMainSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchScreen.kt\ncom/yalla/yalla/ui/screen/main/MainSearchScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,107:1\n72#2,6:108\n78#2:142\n82#2:177\n78#3,11:114\n91#3:176\n456#4,8:125\n464#4,3:139\n25#4:143\n36#4:150\n25#4:161\n467#4,3:173\n4144#5,6:133\n1097#6,6:144\n1097#6,6:151\n1097#6,3:162\n1100#6,3:168\n486#7,4:157\n490#7,2:165\n494#7:171\n486#8:167\n154#9:172\n81#10:178\n107#10,2:179\n*S KotlinDebug\n*F\n+ 1 MainSearchScreen.kt\ncom/yalla/yalla/ui/screen/main/MainSearchScreenKt\n*L\n44#1:108,6\n44#1:142\n44#1:177\n44#1:114,11\n44#1:176\n44#1:125,8\n44#1:139,3\n45#1:143\n47#1:150\n57#1:161\n44#1:173,3\n44#1:133,6\n45#1:144,6\n47#1:151,6\n57#1:162,3\n57#1:168,3\n57#1:157,4\n57#1:165,2\n57#1:171\n57#1:167\n66#1:172\n45#1:178\n45#1:179,2\n*E\n"})
public final class o0O00 {
    public static final void OooO00o(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(231617571);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(231617571, i, -1, "com.yalla.yalla.ui.screen.main.MainSearchScreenContent (MainSearchScreen.kt:42)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            j1 j1Var = j1.f49943OooO00o;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new oo00oO(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            j1Var.OooO00o(null, null, (Function1) objRememberedValue2, null, null, 0L, false, 0L, null, 0, null, null, SizeKt.fillMaxWidth$default(WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m169backgroundbw27NRU$default(companion, o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, null, 2, null)), 0.0f, 1, null), 0L, 0L, 0, composerStartRestartGroup, 0, 2097152, 61435);
            Oooo000 oooo000OooO00o = o000oOoO.OooO00o(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            TabRowKt.m1221TabRowpAZo6Ak(oooo000OooO00o.OooO0oO(), SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(44)), 0.0f, 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37703OooO0O0, o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 973103665, true, new o0oOOo(oooo000OooO00o)), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -543386575, true, new o0O0000O(oooo000OooO00o, columnScopeInstance, coroutineScope)), composerStartRestartGroup, 1597488, 32);
            composer2 = composerStartRestartGroup;
            Pager.OooO00o(2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), oooo000OooO00o, false, 0.0f, null, null, null, null, false, o00OO0O0.f53529OooO00o, composerStartRestartGroup, 54, 6, 1016);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O000(i));
    }

    public static final void OooO0O0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1316891419);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1316891419, i, -1, "com.yalla.yalla.ui.screen.main.SearchRoomPage (MainSearchScreen.kt:101)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, null, false, o0O000O.f53555OooO0Oo, composerStartRestartGroup, 100663302, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOoOo(i));
    }

    public static final void OooO0OO(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1978911701);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1978911701, i, -1, "com.yalla.yalla.ui.screen.main.SearchUserPage (MainSearchScreen.kt:94)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, false, null, null, null, false, o0O000Oo.f53556OooO0Oo, composerStartRestartGroup, 100663302, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O000o0(i));
    }
}
