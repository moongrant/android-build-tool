package com.yalla.yalla.ui.screen.report;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material.OooOOO;
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
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.screen.report.utils.ReportParam;
import kotlin.Metadata;
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
import p147o00Oo0Oo.o000OOo;
import p186o00o00oO.o00O00o0;
import p469o0OoooOO.o0oO0O0o;
import p526o0o0OOO0.o00O;
import p526o0o0OOO0.o00O00O;
import p530o0o0OOoO.Oo0000;
import p579o0oOoo.oO0Ooooo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\nH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/screen/report/ReportRuleExplainPageScreen;", "Lo0o0OOO0/o00O00O;", "", ViewHierarchyConstants.TEXT_KEY, "", "ContentView", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportRuleExplainPageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportRuleExplainPageScreen.kt\ncom/yalla/yalla/ui/screen/report/ReportRuleExplainPageScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,101:1\n76#2:102\n154#3:103\n154#3:104\n154#3:139\n154#3:140\n73#4,5:105\n78#4:138\n82#4:145\n78#5,11:110\n91#5:144\n78#5,11:153\n91#5:185\n456#6,8:121\n464#6,3:135\n467#6,3:141\n456#6,8:164\n464#6,3:178\n467#6,3:182\n4144#7,6:129\n4144#7,6:172\n72#8,7:146\n79#8:181\n83#8:186\n*S KotlinDebug\n*F\n+ 1 ReportRuleExplainPageScreen.kt\ncom/yalla/yalla/ui/screen/report/ReportRuleExplainPageScreen\n*L\n31#1:102\n45#1:103\n46#1:104\n51#1:139\n63#1:140\n42#1:105,5\n42#1:138\n42#1:145\n42#1:110,11\n42#1:144\n85#1:153,11\n85#1:185\n42#1:121,8\n42#1:135,3\n42#1:141,3\n85#1:164,8\n85#1:178,3\n85#1:182,3\n42#1:129,6\n85#1:172,6\n85#1:146,7\n85#1:181\n85#1:186\n*E\n"})
public final class ReportRuleExplainPageScreen extends o00O00O {
    public static final int $stable = 0;

    @NotNull
    public static final ReportRuleExplainPageScreen INSTANCE = new ReportRuleExplainPageScreen();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29591OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29592OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29592OooO0o0 = columnScope;
            this.f29591OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29591OooO0o | 1);
            ReportRuleExplainPageScreen.this.Content(this.f29592OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29594OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f29595OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, int i) {
            super(2);
            this.f29595OooO0o0 = str;
            this.f29594OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29594OooO0o | 1);
            ReportRuleExplainPageScreen.this.ContentView(this.f29595OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private ReportRuleExplainPageScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ContentView(String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2145177960);
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
                ComposerKt.traceEventStart(-2145177960, i2, -1, "com.yalla.yalla.ui.screen.report.ReportRuleExplainPageScreen.ContentView (ReportRuleExplainPageScreen.kt:83)");
            }
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getStart(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
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
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1251Text4IGK_g("·   ", (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, oO0Ooooo.OooO0O0(13, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 6, 0, 131058);
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(str, (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, oO0Ooooo.OooO0O0(13, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, i2 & 14, 0, 131058);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(str, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1979488388);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1979488388, i, -1, "com.yalla.yalla.ui.screen.report.ReportRuleExplainPageScreen.Content (ReportRuleExplainPageScreen.kt:28)");
            }
            Object obj = o00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O.f53592OooO00o), composerStartRestartGroup).get(ReportScreen.PARAM_DATA);
            ReportParam reportParam = obj instanceof ReportParam ? (ReportParam) obj : null;
            int i2 = reportParam != null ? reportParam.f29650OooO0Oo : 0;
            ReportScreen.INSTANCE.ReportTitleBar((String) Oo0000.OooO00o(i2, reportParam != null ? reportParam.f29656OooOO0O : null, null).getFirst(), false, composerStartRestartGroup, 384, 2);
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 15;
            float f2 = 20;
            Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM390spacedBy0680j_4 = Arrangement.INSTANCE.m390spacedBy0680j_4(Dp.m3765constructorimpl(f2));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = o00O00o0.OooO00o(Alignment.INSTANCE, horizontalOrVerticalM390spacedBy0680j_4, composerStartRestartGroup, 6, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM477paddingVpY3zN4);
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
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (i2 == 3) {
                composerStartRestartGroup.startReplaceableGroup(222551762);
                TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.report_topic_rule_description_title), PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f), 0.0f, 2, null), o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, oO0Ooooo.OooO0O0(15, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 48, 0, 131056);
                ReportRuleExplainPageScreen reportRuleExplainPageScreen = INSTANCE;
                reportRuleExplainPageScreen.ContentView(o0000.OooO0OO(oO00OOo0.report_topic_rule_description_content_1), composerStartRestartGroup, 48);
                reportRuleExplainPageScreen.ContentView(o0000.OooO0OO(oO00OOo0.report_topic_rule_description_content_2), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceableGroup(222552250);
                TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.report_post_comment_rule_description_title), PaddingKt.m478paddingVpY3zN4$default(companion, Dp.m3765constructorimpl(f), 0.0f, 2, null), o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, oO0Ooooo.OooO0O0(15, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 48, 0, 131056);
                ReportRuleExplainPageScreen reportRuleExplainPageScreen2 = INSTANCE;
                composer2 = composerStartRestartGroup;
                reportRuleExplainPageScreen2.ContentView(o0000.OooO0OO(oO00OOo0.report_post_comment_rule_description_content_1), composer2, 48);
                reportRuleExplainPageScreen2.ContentView(o0000.OooO0OO(oO00OOo0.report_post_comment_rule_description_content_2), composer2, 48);
                reportRuleExplainPageScreen2.ContentView(o0000.OooO0OO(oO00OOo0.report_post_comment_rule_description_content_3), composer2, 48);
                reportRuleExplainPageScreen2.ContentView(o0000.OooO0OO(oO00OOo0.report_post_comment_rule_description_content_4), composer2, 48);
                reportRuleExplainPageScreen2.ContentView(o0000.OooO0OO(oO00OOo0.report_post_comment_rule_description_content_5), composer2, 48);
                composer2.endReplaceableGroup();
            }
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    @Override // p526o0o0OOO0.o00O00O
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4198getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(38324535);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(38324535, i, -1, "com.yalla.yalla.ui.screen.report.ReportRuleExplainPageScreen.getWindowBackgroundColor (ReportRuleExplainPageScreen.kt:95)");
        }
        int i2 = o0oO0O0o.f47152o00OOOo;
        long j = o0oO0O0o.f46946OooO0O0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
