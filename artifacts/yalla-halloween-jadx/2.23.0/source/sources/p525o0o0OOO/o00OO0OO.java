package p525o0o0OOO;

import androidx.compose.animation.OooO;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p153o00OoO0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53531OooO00o = ComposableLambdaKt.composableLambdaInstance(-930149280, false, OooO00o.f53535OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53532OooO0O0 = ComposableLambdaKt.composableLambdaInstance(1196326751, false, OooO0O0.f53536OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53533OooO0OO = ComposableLambdaKt.composableLambdaInstance(-1874866404, false, OooO0OO.f53537OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53534OooO0Oo = ComposableLambdaKt.composableLambdaInstance(2081261273, false, OooO0o.f53538OooO0Oo);

    @SourceDebugExtension({"SMAP\nNestScrollScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestScrollScreen.kt\ncom/yalla/yalla/ui/screen/main/ComposableSingletons$NestScrollScreenKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,83:1\n154#2:84\n66#3,6:85\n72#3:119\n76#3:124\n78#4,11:91\n91#4:123\n456#5,8:102\n464#5,3:116\n467#5,3:120\n4144#6,6:110\n*S KotlinDebug\n*F\n+ 1 NestScrollScreen.kt\ncom/yalla/yalla/ui/screen/main/ComposableSingletons$NestScrollScreenKt$lambda-1$1\n*L\n49#1:84\n45#1:85,6\n45#1:119\n45#1:124\n45#1:91,11\n45#1:123\n45#1:102,8\n45#1:116,3\n45#1:120,3\n45#1:110,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53535OooO0Oo = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-930149280, iIntValue, -1, "com.yalla.yalla.ui.screen.main.ComposableSingletons$NestScrollScreenKt.lambda-1.<anonymous> (NestScrollScreen.kt:43)");
                }
                Modifier modifierOooO00o = OooOO0.OooO00o(50, SizeKt.fillMaxWidth$default(BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, o000OOo.OooO0OO(composer2).f37702OooO00o, null, 2, null), 0.0f, 1, null), composer2, 733328855);
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
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nNestScrollScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestScrollScreen.kt\ncom/yalla/yalla/ui/screen/main/ComposableSingletons$NestScrollScreenKt$lambda-2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,83:1\n66#2,6:84\n72#2:118\n76#2:123\n78#3,11:90\n91#3:122\n456#4,8:101\n464#4,3:115\n467#4,3:119\n4144#5,6:109\n*S KotlinDebug\n*F\n+ 1 NestScrollScreen.kt\ncom/yalla/yalla/ui/screen/main/ComposableSingletons$NestScrollScreenKt$lambda-2$1\n*L\n69#1:84,6\n69#1:118\n69#1:123\n69#1:90,11\n69#1:122\n69#1:101,8\n69#1:115,3\n69#1:119,3\n69#1:109,6\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f53536OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            PagerScope HorizontalPager = pagerScope;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1196326751, iIntValue2, -1, "com.yalla.yalla.ui.screen.main.ComposableSingletons$NestScrollScreenKt.lambda-2.<anonymous> (NestScrollScreen.kt:67)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Color.Companion companion2 = Color.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(SizeKt.fillMaxWidth$default(BackgroundKt.m169backgroundbw27NRU$default(companion, iIntValue == 0 ? companion2.m1704getRed0d7_KjU() : companion2.m1697getBlue0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, 1, null);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nNestScrollScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestScrollScreen.kt\ncom/yalla/yalla/ui/screen/main/ComposableSingletons$NestScrollScreenKt$lambda-3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,83:1\n154#2:84\n*S KotlinDebug\n*F\n+ 1 NestScrollScreen.kt\ncom/yalla/yalla/ui/screen/main/ComposableSingletons$NestScrollScreenKt$lambda-3$1\n*L\n65#1:84\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f53537OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(4);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            PagerScope HorizontalPager = pagerScope;
            int iIntValue = num.intValue();
            Composer composer2 = composer;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1874866404, iIntValue2, -1, "com.yalla.yalla.ui.screen.main.ComposableSingletons$NestScrollScreenKt.lambda-3.<anonymous> (NestScrollScreen.kt:60)");
            }
            PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, oo0O.f53567OooO0Oo, composer2, 384, 3);
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(100), 0.0f, 0.0f, 13, null);
            Color.Companion companion = Color.INSTANCE;
            PagerKt.m685HorizontalPagerxYaah8o(pagerStateRememberPagerState, SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(modifierM480paddingqDBjuR0$default, iIntValue == 0 ? companion.m1707getWhite0d7_KjU() : companion.m1696getBlack0d7_KjU(), null, 2, null), 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, o00OO0OO.f53532OooO0O0, composer2, 0, 384, 4092);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<PaddingValues, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f53538OooO0Oo = new OooO0o();

        public OooO0o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            PaddingValues it = paddingValues;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 14) == 0) {
                iIntValue |= composer2.changed(it) ? 4 : 2;
            }
            int i = iIntValue;
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2081261273, i, -1, "com.yalla.yalla.ui.screen.main.ComposableSingletons$NestScrollScreenKt.lambda-4.<anonymous> (NestScrollScreen.kt:53)");
                }
                PagerKt.m685HorizontalPagerxYaah8o(PagerStateKt.rememberPagerState(0, 0.0f, o00OO.f53528OooO0Oo, composer2, 384, 3), BackgroundKt.m169backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m1708getYellow0d7_KjU(), null, 2, null), it, null, 0, 0.0f, null, null, false, false, null, null, o00OO0OO.f53533OooO0OO, composer2, (i << 6) & 896, 384, 4088);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
