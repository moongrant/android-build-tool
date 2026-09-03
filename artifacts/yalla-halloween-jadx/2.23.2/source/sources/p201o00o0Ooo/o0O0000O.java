package p201o00o0Ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.OooO0o;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.paging.OooOOO0;
import com.code.android.util.o0O0O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p107o000ooO0.OooOOOO;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0000;
import p194o00o0OO.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nLoadMoreFooter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadMoreFooter.kt\ncom/code/android/uikit/swiprefresh/LoadMoreFooterKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,124:1\n154#2:125\n154#2:173\n154#2:209\n154#2:215\n66#3,6:126\n72#3:160\n76#3:172\n66#3,6:174\n72#3:208\n76#3:214\n66#3,6:216\n72#3:250\n76#3:255\n78#4,11:132\n91#4:171\n78#4,11:180\n91#4:213\n78#4,11:222\n91#4:254\n456#5,8:143\n464#5,3:157\n36#5:161\n467#5,3:168\n456#5,8:191\n464#5,3:205\n467#5,3:210\n456#5,8:233\n464#5,3:247\n467#5,3:251\n4144#6,6:151\n4144#6,6:199\n4144#6,6:241\n1097#7,6:162\n*S KotlinDebug\n*F\n+ 1 LoadMoreFooter.kt\ncom/code/android/uikit/swiprefresh/LoadMoreFooterKt\n*L\n74#1:125\n97#1:173\n101#1:209\n115#1:215\n71#1:126,6\n71#1:160\n71#1:172\n94#1:174,6\n94#1:208\n94#1:214\n112#1:216,6\n112#1:250\n112#1:255\n71#1:132,11\n71#1:171\n94#1:180,11\n94#1:213\n112#1:222,11\n112#1:254\n71#1:143,8\n71#1:157,3\n82#1:161\n71#1:168,3\n94#1:191,8\n94#1:205,3\n94#1:210,3\n112#1:233,8\n112#1:247,3\n112#1:251,3\n71#1:151,6\n94#1:199,6\n112#1:241,6\n82#1:162,6\n*E\n"})
public final class o0O0000O {

    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOOO<?> f39321OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f39322OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOOOO<?> oooOOOO, String str) {
            super(3);
            this.f39321OooO0Oo = oooOOOO;
            this.f39322OooO0o0 = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            LazyItemScope item = lazyItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2122232755, iIntValue, -1, "com.code.android.uikit.swiprefresh.LoadMoreFooterItem.<anonymous> (LoadMoreFooter.kt:39)");
                }
                OooOOOO<?> oooOOOO = this.f39321OooO0Oo;
                OooOOO0 oooOOO0 = oooOOOO.OooO0OO().f35620OooO0OO;
                if (oooOOO0 instanceof OooOOO0.OooO0O0) {
                    composer2.startReplaceableGroup(410997384);
                    o0O0000O.OooO0o0(composer2, 0);
                    composer2.endReplaceableGroup();
                } else if (oooOOO0 instanceof OooOOO0.OooO0OO) {
                    composer2.startReplaceableGroup(410997481);
                    if (oooOOOO.OooO0O0() > 0) {
                        if (oooOOOO.OooO0OO().f35620OooO0OO.f10257OooO00o) {
                            composer2.startReplaceableGroup(410997625);
                            o0O0000O.OooO0OO(this.f39322OooO0o0, composer2, 0);
                            composer2.endReplaceableGroup();
                        } else if (oooOOOO.OooO0OO().f35620OooO0OO.f10257OooO00o) {
                            composer2.startReplaceableGroup(410997896);
                            composer2.endReplaceableGroup();
                        } else {
                            composer2.startReplaceableGroup(410997768);
                            o0O0000O.OooO0o0(composer2, 0);
                            composer2.endReplaceableGroup();
                        }
                    }
                    composer2.endReplaceableGroup();
                } else if (oooOOO0 instanceof OooOOO0.OooO00o) {
                    composer2.startReplaceableGroup(410997975);
                    o0O0000O.OooO0Oo(new o0O00000(oooOOOO), composer2, 0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(410998121);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final void OooO00o(@NotNull LazyListScope lazyListScope, @NotNull OooOOOO<?> lazyPagingItems, @NotNull String noMoreText) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(lazyPagingItems, "lazyPagingItems");
        Intrinsics.checkNotNullParameter(noMoreText, "noMoreText");
        if (lazyPagingItems.OooO0O0() > 0) {
            LazyListScope.CC.OooO(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-2122232755, true, new OooO00o(lazyPagingItems, noMoreText)), 3, null);
        }
    }

    public static final void OooO0OO(String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1158257006);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1158257006, i2, -1, "com.code.android.uikit.swiprefresh.EndPage (LoadMoreFooter.kt:110)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(60, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(str, BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter()), o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 & 14) | 3072, 0, 131056);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0oOOo(str, i));
    }

    public static final void OooO0Oo(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-60682094);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-60682094, i2, -1, "com.code.android.uikit.swiprefresh.ErrorPage (LoadMoreFooter.kt:69)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(60, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(o00O00o0.refreshcontentstate_try_again, composerStartRestartGroup, 0);
            long sp = TextUnitKt.getSp(14);
            long jColor = ColorKt.Color(4278245577L);
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenter());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(function0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o0O0o(function0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(strStringResource, o0O0O00.OooO0O0(modifierAlign, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), jColor, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131056);
            if (OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0(i, function0));
    }

    public static final void OooO0o0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-364280672);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-364280672, i, -1, "com.code.android.uikit.swiprefresh.LoadingPage (LoadMoreFooter.kt:92)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(60, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            o00O0000.f38681OooO00o.OooO0O0(BoxScopeInstance.INSTANCE.align(SizeKt.m527sizeVpY3zN4(companion, Dp.m3775constructorimpl(75), Dp.m3775constructorimpl(45)), companion2.getCenter()), composerStartRestartGroup, 48);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0O000(i));
    }
}
