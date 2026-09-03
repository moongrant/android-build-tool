package p650o0ooo;

import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.manager.main.MainDialogManager$PriorityType;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207o00o0oO0.o0000O0;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o000OO0O;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oOO0O00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMainDialogWelcomeFirstLogin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDialogWelcomeFirstLogin.kt\ncom/yalla/yalla/ui/dialog/MainDialogWelcomeFirstLogin\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,199:1\n81#2,11:200\n81#2,11:297\n154#3:211\n154#3:247\n154#3:248\n154#3:284\n154#3:285\n154#3:291\n154#3:308\n154#3:340\n154#3:341\n154#3:349\n154#3:350\n154#3:351\n154#3:352\n66#4,6:212\n72#4:246\n66#4,6:249\n72#4:283\n76#4:290\n76#4:296\n78#5,11:218\n78#5,11:255\n91#5:289\n91#5:295\n78#5,11:311\n91#5:356\n456#6,8:229\n464#6,3:243\n456#6,8:266\n464#6,3:280\n467#6,3:286\n467#6,3:292\n456#6,8:322\n464#6,3:336\n25#6:342\n467#6,3:353\n4144#7,6:237\n4144#7,6:274\n4144#7,6:330\n76#8,2:309\n78#8:339\n82#8:357\n1097#9,6:343\n*S KotlinDebug\n*F\n+ 1 MainDialogWelcomeFirstLogin.kt\ncom/yalla/yalla/ui/dialog/MainDialogWelcomeFirstLogin\n*L\n68#1:200,11\n125#1:297,11\n92#1:211\n96#1:247\n97#1:248\n107#1:284\n108#1:285\n118#1:291\n131#1:308\n134#1:340\n144#1:341\n161#1:349\n164#1:350\n165#1:351\n194#1:352\n90#1:212,6\n90#1:246\n94#1:249,6\n94#1:283\n94#1:290\n90#1:296\n90#1:218,11\n94#1:255,11\n94#1:289\n90#1:295\n126#1:311,11\n126#1:356\n90#1:229,8\n90#1:243,3\n94#1:266,8\n94#1:280,3\n94#1:286,3\n90#1:292,3\n126#1:322,8\n126#1:336,3\n146#1:342\n126#1:353,3\n90#1:237,6\n94#1:274,6\n126#1:330,6\n126#1:309,2\n126#1:339\n126#1:357\n146#1:343,6\n*E\n"})
public final class oOO0O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO0O000 f58948OooO00o = new oOO0O000();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f58950OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f58950OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58950OooO0o0 | 1);
            oOO0O000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f58951OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MainRoomVM mainRoomVM) {
            super(0);
            this.f58951OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oOO0O000.OooO0Oo(this.f58951OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f58952OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MainRoomVM mainRoomVM) {
            super(2);
            this.f58952OooO0Oo = mainRoomVM;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1824809764, iIntValue, -1, "com.yalla.yalla.ui.dialog.MainDialogWelcomeFirstLogin.ShowAnimation.<anonymous> (MainDialogWelcomeFirstLogin.kt:79)");
                }
                MainDialogManager$PriorityType mainDialogManager$PriorityType = MainDialogManager$PriorityType.Welcome;
                MainRoomVM mainRoomVM = this.f58952OooO0Oo;
                mainRoomVM.setShowingPriorityType(mainDialogManager$PriorityType);
                oOO0O000.OooO0O0(oOO0O000.f58948OooO00o, mainRoomVM, ComposableLambdaKt.composableLambda(composer2, -1690816273, true, new oOO0O00O(mainRoomVM)), composer2, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f58954OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f58954OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f58954OooO0o0 | 1);
            oOO0O000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(oOO0O000 ooo0o000, MainRoomVM mainRoomVM, Function3 function3, Composer composer, int i) {
        ooo0o000.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-217949831);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-217949831, i, -1, "com.yalla.yalla.ui.dialog.MainDialogWelcomeFirstLogin.Background (MainDialogWelcomeFirstLogin.kt:88)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 44;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
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
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(o00O0O0.OooO00o(16, PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(61), 0.0f, 0.0f, 13, null)), o0OOo000.f48135OooO0O0, null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o2 = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        function3.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf((i & 112) | 6));
        float f2 = 10;
        ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.icon_sheet_dialog_close, composerStartRestartGroup, 0), "", com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getTopEnd()), 0.0f, Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2), 0.0f, 9, null), Dp.m3775constructorimpl(24)), false, false, 0L, false, null, null, null, new oOO000o(mainRoomVM), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        o0ooOOo.OooO00o(composerStartRestartGroup);
        ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.welcome_sign, composerStartRestartGroup, 0), "", SizeKt.m511height3ABfNKs(boxScopeInstance.align(companion, companion2.getTopCenter()), Dp.m3775constructorimpl(122)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOO00(ooo0o000, mainRoomVM, function3, i));
    }

    public static final void OooO0OO(oOO0O000 ooo0o000, MainRoomVM mainRoomVM, Composer composer, int i) {
        ooo0o000.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(602149077);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(602149077, i, -1, "com.yalla.yalla.ui.dialog.MainDialogWelcomeFirstLogin.Content (MainDialogWelcomeFirstLogin.kt:123)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(TaskViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        TaskViewModel taskViewModel = (TaskViewModel) viewModel;
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Modifier.Companion companion = Modifier.INSTANCE;
        float f = 29;
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, centerHorizontally, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
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
        Function2 function2OooO00o = OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyColumnMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(54), null, composerStartRestartGroup, 6, 2);
        String strOooO0OO = o0000.OooO0OO(o000000.welcome_yalla);
        long sp = TextUnitKt.getSp(21);
        long j = o0OOo000.f48367oOooo0o;
        TextKt.m1261Text4IGK_g(strOooO0OO, (Modifier) null, j, sp, FontStyle.m3413boximpl(FontStyle.INSTANCE.m3421getNormal_LCdwA()), (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(TextAlign.INSTANCE.m3681getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130530);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(20), null, composerStartRestartGroup, 6, 2);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            String strOooO0OO2 = o0000.OooO0OO(o000000.welcome_reward);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            objRememberedValue = o0000O.OooO00o(strOooO0OO2, o00O0O0.OooO0O0("ImageTag x", o0O00oO0.OooO0Oo().getValue()));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        oOO0O00O.OooO0O0((String) objRememberedValue, null, o0OOo000.f48172Oooo0o0, TextUnitKt.getSp(15), o00O00O.f58532OooO00o, composerStartRestartGroup, 27654, 2);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(44), null, composerStartRestartGroup, 6, 2);
        o000OO0O.OooO00o(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(36), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(18)), j, o0OOo000.f48135OooO0O0, TextUnitKt.getSp(18), o0000.OooO0OO(o000000.sgin_ok), new ooooO000(taskViewModel, mainRoomVM), composerStartRestartGroup, 196662, 0);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(25), null, composerStartRestartGroup, 6, 2);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOO0(ooo0o000, mainRoomVM, i));
    }

    public static final void OooO0Oo(MainRoomVM mainRoomVM) {
        MutableState<Boolean> dialogShowWelcome = mainRoomVM.getDialogShowWelcome();
        Boolean bool = Boolean.FALSE;
        dialogShowWelcome.setValue(bool);
        mainRoomVM.setShowingPriorityType(null);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        ((MutableLiveData) o0O00oO0.f47938OooO0OO.getValue()).postValue(bool);
        p536o0o0Oo00.OooO0OO.f54352OooO0O0.postValue(Boolean.TRUE);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1699447246);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1699447246, i, -1, "com.yalla.yalla.ui.dialog.MainDialogWelcomeFirstLogin.ShowAnimation (MainDialogWelcomeFirstLogin.kt:66)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MainRoomVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MainRoomVM mainRoomVM = (MainRoomVM) viewModel;
            if (mainRoomVM.getShowingPriorityType() != null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
                return;
            }
            o0000O0.OooO00o(mainRoomVM.getDialogShowWelcome(), false, false, null, new OooO0O0(mainRoomVM), 17, o000000O.WindowAnimBottomWithAlpha, 0.0f, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1824809764, true, new OooO0OO(mainRoomVM)), composerStartRestartGroup, 100863024, 132);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(i));
    }
}
