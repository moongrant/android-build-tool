package p507o0o00ooo;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
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
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p153o00OoO0.OooOO0;
import p539o0o0OoOO.c1;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLoadMore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadMore.kt\ncom/yalla/yalla/ui/composable/common/LoadMoreKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,92:1\n154#2:93\n154#2:129\n154#2:135\n66#3,6:94\n72#3:128\n76#3:134\n66#3,6:136\n72#3:170\n76#3:175\n78#4,11:100\n91#4:133\n78#4,11:142\n91#4:174\n456#5,8:111\n464#5,3:125\n467#5,3:130\n456#5,8:153\n464#5,3:167\n467#5,3:171\n4144#6,6:119\n4144#6,6:161\n*S KotlinDebug\n*F\n+ 1 LoadMore.kt\ncom/yalla/yalla/ui/composable/common/LoadMoreKt\n*L\n65#1:93\n69#1:129\n83#1:135\n62#1:94,6\n62#1:128\n62#1:134\n80#1:136,6\n80#1:170\n80#1:175\n62#1:100,11\n62#1:133\n80#1:142,11\n80#1:174\n62#1:111,8\n62#1:125,3\n62#1:130,3\n80#1:153,8\n80#1:167,3\n80#1:171,3\n62#1:119,6\n80#1:161,6\n*E\n"})
public final class u0 {

    public /* synthetic */ class OooO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadMoreState.values().length];
            try {
                iArr[LoadMoreState.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadMoreState.NoMore.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f50281OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50282OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f50283OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, int i, int i2) {
            super(2);
            this.f50281OooO0Oo = str;
            this.f50283OooO0o0 = i;
            this.f50282OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50283OooO0o0 | 1);
            u0.OooO00o(this.f50281OooO0Oo, composer, iUpdateChangedFlags, this.f50282OooO0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<?> f50284OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50285OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f50286OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50287OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o000O0.OooO0O0<?> oooO0O0, String str, int i, int i2) {
            super(2);
            this.f50284OooO0Oo = oooO0O0;
            this.f50286OooO0o0 = str;
            this.f50285OooO0o = i;
            this.f50287OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50285OooO0o | 1);
            u0.OooO0OO(this.f50284OooO0Oo, this.f50286OooO0o0, composer, iUpdateChangedFlags, this.f50287OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LoadMoreState f50288OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f50289OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f50290OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f50291OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(LoadMoreState loadMoreState, String str, int i, int i2) {
            super(2);
            this.f50288OooO0Oo = loadMoreState;
            this.f50290OooO0o0 = str;
            this.f50289OooO0o = i;
            this.f50291OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f50289OooO0o | 1);
            u0.OooO0O0(this.f50288OooO0Oo, this.f50290OooO0o0, composer, iUpdateChangedFlags, this.f50291OooO0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f50292OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f50292OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            u0.OooO0Oo(composer, RecomposeScopeImplKt.updateChangedFlags(this.f50292OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(String str, Composer composer, int i, int i2) {
        String strStringResource;
        int i3;
        Composer composer2;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-558660911);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                strStringResource = str;
                if (composerStartRestartGroup.changed(strStringResource)) {
                    i4 = 4;
                }
                i3 = i4 | i;
            } else {
                strStringResource = str;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            strStringResource = str;
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            } else if ((i2 & 1) != 0) {
                strStringResource = StringResources_androidKt.stringResource(oO00OOo0.No_more_data, composerStartRestartGroup, 0);
                i3 &= -15;
            }
            String str2 = strStringResource;
            int i5 = i3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-558660911, i5, -1, "com.yalla.yalla.ui.composable.common.EndPage (LoadMore.kt:78)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO00o = OooOO0.OooO00o(50, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long sp = TextUnitKt.getSp(14);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(str2, boxScopeInstance.align(companion, companion2.getCenter()), o000OOo.OooO0OO(composerStartRestartGroup).f37711OooOO0O, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 3072, 0, 131056);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            strStringResource = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(strStringResource, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(@NotNull LoadMoreState state, @Nullable String str, @Nullable Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1850514328);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(str)) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                str = StringResources_androidKt.stringResource(oO00OOo0.event_not_more, composerStartRestartGroup, 0);
                i3 &= -113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1850514328, i3, -1, "com.yalla.yalla.ui.composable.common.LoadMore (LoadMore.kt:48)");
            }
            int i4 = OooO.$EnumSwitchMapping$0[state.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceableGroup(-1527370704);
                OooO0Oo(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (i4 != 2) {
                composerStartRestartGroup.startReplaceableGroup(-1527370622);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1527370658);
                OooO00o(str, composerStartRestartGroup, (i3 >> 3) & 14, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(state, str, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "使用com.code.android包")
    @Composable
    public static final void OooO0OO(@NotNull o000O0.OooO0O0<?> lazyPagingItems, @Nullable String str, @Nullable Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(lazyPagingItems, "lazyPagingItems");
        Composer composerStartRestartGroup = composer.startRestartGroup(-197906382);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(str)) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                str = StringResources_androidKt.stringResource(oO00OOo0.event_not_more, composerStartRestartGroup, 0);
                i3 &= -113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-197906382, i3, -1, "com.yalla.yalla.ui.composable.common.LoadMore (LoadMore.kt:30)");
            }
            OooOOO0 oooOOO0 = lazyPagingItems.OooO0OO().f34457OooO0OO;
            if (oooOOO0 instanceof OooOOO0.OooO0O0) {
                composerStartRestartGroup.startReplaceableGroup(-1527371183);
                OooO0O0(LoadMoreState.Loading, str, composerStartRestartGroup, (i3 & 112) | 6, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (oooOOO0 instanceof OooOOO0.OooO0OO) {
                composerStartRestartGroup.startReplaceableGroup(-1527371080);
                if (lazyPagingItems.OooO0OO().f34457OooO0OO.f7163OooO00o) {
                    OooO0O0(LoadMoreState.NoMore, str, composerStartRestartGroup, (i3 & 112) | 6, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1527370904);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(lazyPagingItems, str, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1375938813);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1375938813, i, -1, "com.yalla.yalla.ui.composable.common.LoadingPage (LoadMore.kt:60)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO00o = OooOO0.OooO00o(60, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, 733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            c1.OooO00o(BoxScopeInstance.INSTANCE.align(SizeKt.m525sizeVpY3zN4(companion, Dp.m3765constructorimpl(75), Dp.m3765constructorimpl(45)), companion2.getCenter()), composerStartRestartGroup, 0);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }
}
