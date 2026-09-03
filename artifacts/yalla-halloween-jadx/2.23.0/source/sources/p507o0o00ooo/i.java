package p507o0o00ooo;

import OooOo.OooO0o;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOOOO;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p184o00o00o.Oooo000;
import p184o00o00o.o00oO0o;
import p469o0OoooOO.o0oO0O0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCommonTabBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTabBox.kt\ncom/yalla/yalla/ui/composable/common/CommonTabBoxKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,70:1\n25#2:71\n25#2:82\n456#2,8:110\n464#2,3:124\n467#2,3:129\n1097#3,6:72\n1097#3,3:83\n1100#3,3:89\n486#4,4:78\n490#4,2:86\n494#4:92\n486#5:88\n72#6,6:93\n78#6:127\n82#6:133\n78#7,11:99\n91#7:132\n4144#8,6:118\n154#9:128\n*S KotlinDebug\n*F\n+ 1 CommonTabBox.kt\ncom/yalla/yalla/ui/composable/common/CommonTabBoxKt\n*L\n37#1:71\n38#1:82\n40#1:110,8\n40#1:124,3\n40#1:129,3\n37#1:72,6\n38#1:83,3\n38#1:89,3\n38#1:78,4\n38#1:86,2\n38#1:92\n38#1:88\n40#1:93,6\n40#1:127\n40#1:133\n40#1:99,11\n40#1:132\n40#1:118,6\n44#1:128\n*E\n"})
public final class i {

    @SourceDebugExtension({"SMAP\nCommonTabBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTabBox.kt\ncom/yalla/yalla/ui/composable/common/CommonTabBoxKt$CommonTabBox$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,70:1\n66#2,6:71\n72#2:105\n76#2:110\n78#3,11:77\n91#3:109\n456#4,8:88\n464#4,3:102\n467#4,3:106\n4144#5,6:96\n*S KotlinDebug\n*F\n+ 1 CommonTabBox.kt\ncom/yalla/yalla/ui/composable/common/CommonTabBoxKt$CommonTabBox$1$1\n*L\n50#1:71,6\n50#1:105\n50#1:110\n50#1:77,11\n50#1:109\n50#1:88,8\n50#1:102,3\n50#1:106,3\n50#1:96,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<List<? extends TabPosition>, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f49888OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f49889OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f49890OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Oooo000 oooo000, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
            super(3);
            this.f49888OooO0Oo = oooo000;
            this.f49890OooO0o0 = function2;
            this.f49889OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(List<? extends TabPosition> list, Composer composer, Integer num) {
            List<? extends TabPosition> tabPositions = list;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(333229463, iIntValue, -1, "com.yalla.yalla.ui.composable.common.CommonTabBox.<anonymous>.<anonymous> (CommonTabBox.kt:47)");
            }
            Modifier modifierOooO00o = o00oO0o.OooO00o(Modifier.INSTANCE, this.f49888OooO0Oo, tabPositions);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
            Function2 function2OooO00o = OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2.startReplaceableGroup(-2104178927);
            Function2<Composer, Integer, Unit> function2 = this.f49890OooO0o0;
            if (function2 != null) {
                function2.invoke(composer2, Integer.valueOf((this.f49889OooO0o >> 9) & 14));
            }
            if (OooO0o.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nCommonTabBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTabBox.kt\ncom/yalla/yalla/ui/composable/common/CommonTabBoxKt$CommonTabBox$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n154#2:71\n73#3,6:72\n79#3:106\n83#3:114\n78#4,11:78\n91#4:113\n456#5,8:89\n464#5,3:103\n467#5,3:110\n4144#6,6:97\n1864#7,3:107\n*S KotlinDebug\n*F\n+ 1 CommonTabBox.kt\ncom/yalla/yalla/ui/composable/common/CommonTabBoxKt$CommonTabBox$1$2\n*L\n58#1:71\n57#1:72,6\n57#1:106\n57#1:114\n57#1:78,11\n57#1:113\n57#1:89,8\n57#1:103,3\n57#1:110,3\n57#1:97,6\n59#1:107,3\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<String> f49891OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f49892OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function5<String, Boolean, Function0<Unit>, Composer, Integer, Unit> f49893OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f49894OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f49895OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(List<String> list, Function5<? super String, ? super Boolean, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function5, Oooo000 oooo000, int i, CoroutineScope coroutineScope) {
            super(2);
            this.f49891OooO0Oo = list;
            this.f49893OooO0o0 = function5;
            this.f49892OooO0o = oooo000;
            this.f49894OooO0oO = i;
            this.f49895OooO0oo = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(896121751, iIntValue, -1, "com.yalla.yalla.ui.composable.common.CommonTabBox.<anonymous>.<anonymous> (CommonTabBox.kt:55)");
                }
                Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3765constructorimpl(12), 0.0f, 2, null);
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM478paddingVpY3zN4$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o = OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-2104178746);
                int i = 0;
                for (Object obj : this.f49891OooO0Oo) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj;
                    Function5<String, Boolean, Function0<Unit>, Composer, Integer, Unit> function5 = this.f49893OooO0o0;
                    if (function5 != null) {
                        Oooo000 oooo000 = this.f49892OooO0o;
                        function5.invoke(str, Boolean.valueOf(oooo000.OooO0oO() == i), new k(this.f49895OooO0oo, oooo000, i), composer2, Integer.valueOf((this.f49894OooO0oO >> 3) & 7168));
                    }
                    i = i2;
                }
                if (OooO0o.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f49896OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<String> f49897OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Modifier f49898OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Oooo000 f49899OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f49900OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function5<String, Boolean, Function0<Unit>, Composer, Integer, Unit> f49901OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f49902OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(List<String> list, Oooo000 oooo000, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function5<? super String, ? super Boolean, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function5, int i, int i2) {
            super(2);
            this.f49897OooO0Oo = list;
            this.f49899OooO0o0 = oooo000;
            this.f49898OooO0o = modifier;
            this.f49900OooO0oO = function2;
            this.f49901OooO0oo = function5;
            this.f49896OooO = i;
            this.f49902OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            i.OooO00o(this.f49897OooO0Oo, this.f49899OooO0o0, this.f49898OooO0o, this.f49900OooO0oO, this.f49901OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f49896OooO | 1), this.f49902OooOO0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OooO00o(@NotNull List<String> list, @NotNull Oooo000 pagerState, @NotNull Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function5<? super String, ? super Boolean, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function5, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(pagerState, "pagerState");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-985882451);
        Function2<? super Composer, ? super Integer, Unit> function3 = (i2 & 8) != 0 ? null : function2;
        Function5<? super String, ? super Boolean, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> function6 = (i2 & 16) != 0 ? null : function5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-985882451, i, -1, "com.yalla.yalla.ui.composable.common.CommonTabBox (CommonTabBox.kt:28)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(list);
            objRememberedValue = list;
        }
        composerStartRestartGroup.endReplaceableGroup();
        List list2 = (List) objRememberedValue;
        Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, 773894976, -492369756);
        if (objOooO00o == companion.getEmpty()) {
            objOooO00o = OooOOOO.OooO00o(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objOooO00o).getCoroutineScope();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(companion2, o0oO0O0o.f46946OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
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
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        long j = o0oO0O0o.f46945OooO00o;
        Modifier modifierThen = companion2.then(modifier);
        int iOooO0oO = pagerState.OooO0oO();
        float fM3765constructorimpl = Dp.m3765constructorimpl(0);
        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 333229463, true, new OooO00o(pagerState, function3, i));
        ComposableLambda composableLambda2 = q.f50175OooO00o;
        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 896121751, true, new OooO0O0(list2, function6, pagerState, i, coroutineScope));
        Function2<? super Composer, ? super Integer, Unit> function4 = function3;
        TabRowKt.m1220ScrollableTabRowsKfQg0A(iOooO0oO, modifierThen, j, 0L, fM3765constructorimpl, composableLambda, composableLambda2, composableLambda3, composerStartRestartGroup, 14376960, 8);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(list, pagerState, modifier, function4, function6, i, i2));
    }
}
