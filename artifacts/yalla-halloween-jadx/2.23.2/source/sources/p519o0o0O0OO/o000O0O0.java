package p519o0o0O0OO;

import android.text.TextUtils;
import androidx.compose.animation.OooO;
import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OooOO0O;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.moment.MomentAdDataModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.vm.AdVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O000o;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O00OO;
import p476o0OooooO.o0OOo000;
import p521o0o0O0o0.o0000OO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentAdComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentAdComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentAdCompKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,231:1\n81#2,11:232\n72#3,6:243\n78#3:277\n72#3,6:317\n78#3:351\n82#3:359\n72#3,6:368\n78#3:402\n82#3:494\n82#3:500\n78#4,11:249\n78#4,11:285\n78#4,11:323\n91#4:358\n91#4:365\n78#4,11:374\n78#4,11:409\n78#4,11:446\n91#4:483\n91#4:488\n91#4:493\n91#4:499\n456#5,8:260\n464#5,3:274\n456#5,8:296\n464#5,3:310\n456#5,8:334\n464#5,3:348\n467#5,3:355\n467#5,3:362\n456#5,8:385\n464#5,3:399\n456#5,8:420\n464#5,3:434\n456#5,8:457\n464#5,3:471\n467#5,3:480\n467#5,3:485\n467#5,3:490\n467#5,3:496\n4144#6,6:268\n4144#6,6:304\n4144#6,6:342\n4144#6,6:393\n4144#6,6:428\n4144#6,6:465\n154#7:278\n154#7:314\n154#7:315\n154#7:316\n154#7:352\n154#7:353\n154#7:354\n154#7:360\n154#7:361\n154#7:367\n154#7:438\n154#7:439\n154#7:475\n154#7:478\n154#7:479\n154#7:495\n73#8,6:279\n79#8:313\n83#8:366\n73#8,6:440\n79#8:474\n83#8:484\n66#9,6:403\n72#9:437\n76#9:489\n76#10:476\n76#10:477\n*S KotlinDebug\n*F\n+ 1 MomentAdComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentAdCompKt\n*L\n67#1:232,11\n69#1:243,6\n69#1:277\n92#1:317,6\n92#1:351\n92#1:359\n132#1:368,6\n132#1:402\n132#1:494\n69#1:500\n69#1:249,11\n76#1:285,11\n92#1:323,11\n92#1:358\n76#1:365\n132#1:374,11\n145#1:409,11\n162#1:446,11\n162#1:483\n145#1:488\n132#1:493\n69#1:499\n69#1:260,8\n69#1:274,3\n76#1:296,8\n76#1:310,3\n92#1:334,8\n92#1:348,3\n92#1:355,3\n76#1:362,3\n132#1:385,8\n132#1:399,3\n145#1:420,8\n145#1:434,3\n162#1:457,8\n162#1:471,3\n162#1:480,3\n145#1:485,3\n132#1:490,3\n69#1:496,3\n69#1:268,6\n76#1:304,6\n92#1:342,6\n132#1:393,6\n145#1:428,6\n162#1:465,6\n79#1:278\n88#1:314\n89#1:315\n94#1:316\n98#1:352\n103#1:353\n115#1:354\n123#1:360\n124#1:361\n135#1:367\n155#1:438\n165#1:439\n174#1:475\n190#1:478\n193#1:479\n202#1:495\n76#1:279,6\n76#1:313\n76#1:366\n162#1:440,6\n162#1:474\n162#1:484\n145#1:403,6\n145#1:437\n145#1:489\n176#1:476\n186#1:477\n*E\n"})
public final class o000O0O0 {

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentAdDataModel f51918OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AdVM f51919OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51920OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentAdDataModel momentAdDataModel, FragmentActivity fragmentActivity, AdVM adVM) {
            super(0);
            this.f51918OooO0Oo = momentAdDataModel;
            this.f51920OooO0o0 = fragmentActivity;
            this.f51919OooO0o = adVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentAdDataModel momentAdDataModel = this.f51918OooO0Oo;
            this.f51919OooO0o.advertUserLogInsClick(momentAdDataModel.getAdId());
            FragmentActivity fragmentActivity = this.f51920OooO0o0;
            if (fragmentActivity != null && (!StringsKt.isBlank(momentAdDataModel.getAdUrl()))) {
                o0oo0000.OooO00o.OooO0O0("103049");
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Ad);
                webPageInfo.OooO0o0(momentAdDataModel.getAdUrl());
                webPageInfo.OooO0Oo(momentAdDataModel.getAdTitle());
                int i = WebActivity.f25130OooOoO0;
                WebActivity.OooO00o.OooO00o(fragmentActivity, webPageInfo);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51921OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentDetailModel momentDetailModel) {
            super(0);
            this.f51921OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LiveEventBus.get("POST_FEATURED_AD_DELETE").post(this.f51921OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51922OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51923OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51924OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51925OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51926OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, MomentDetailModel momentDetailModel, FragmentActivity fragmentActivity, int i, int i2) {
            super(2);
            this.f51922OooO0Oo = modifier;
            this.f51924OooO0o0 = momentDetailModel;
            this.f51923OooO0o = fragmentActivity;
            this.f51925OooO0oO = i;
            this.f51926OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000O0O0.OooO00o(this.f51922OooO0Oo, this.f51924OooO0o0, this.f51923OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51925OooO0oO | 1), this.f51926OooO0oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51927OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f51928OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51929OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51930OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f51931OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Modifier modifier, MomentDetailModel momentDetailModel, FragmentActivity fragmentActivity, int i, int i2) {
            super(2);
            this.f51927OooO0Oo = modifier;
            this.f51929OooO0o0 = momentDetailModel;
            this.f51928OooO0o = fragmentActivity;
            this.f51930OooO0oO = i;
            this.f51931OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000O0O0.OooO00o(this.f51927OooO0Oo, this.f51929OooO0o0, this.f51928OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f51930OooO0oO | 1), this.f51931OooO0oo);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Modifier modifier, @NotNull MomentDetailModel data, @Nullable FragmentActivity fragmentActivity, @Nullable Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-367639358);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-367639358, i, -1, "com.yalla.yalla.ui.composable.moment.MomentAdComp (MomentAdComp.kt:63)");
        }
        MomentAdDataModel adData = data.getAdData();
        if (adData == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(modifier2, data, fragmentActivity, i, i2));
            return;
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(AdVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, new OooO00o(adData, fragmentActivity, (AdVM) viewModel), 253);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
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
        Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        float f = 61;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m511height3ABfNKs(companion.then(modifier2), Dp.m3775constructorimpl(f)), 0.0f, 1, null);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
        Function2 function2OooO00o2 = OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
        float f2 = 15;
        oooO00o.OooOO0(p403o0Oo0OO.OooO0OO.OooO00o(p184o00o00O0.OooO0OO.OooO0Oo(adData.getAdHeadUrl())), SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f2), 0.0f, 0.0f, 0.0f, 14, null), Dp.m3775constructorimpl(38)), 0.0f, null, false, composerStartRestartGroup, 262192, 28);
        float f3 = 8;
        Modifier modifierOooO00o = OooOO0O.OooO00o(rowScopeInstance, SizeKt.fillMaxHeight$default(PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 1, null), 1.0f, false, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O2 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO0O2, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        float f4 = 12;
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f4), null, composerStartRestartGroup, 6, 2);
        Modifier modifier3 = modifier2;
        oooO00o.OooOOOo(adData.getAdTitle(), 0L, false, TextUnitKt.getSp(15), 0, 0, null, false, null, composerStartRestartGroup, 1073744896, YallaTeamMessage.JumpId.RoomList_Recommended);
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(3), null, composerStartRestartGroup, 6, 2);
        TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.ad, composerStartRestartGroup, 0), PaddingKt.m479paddingVpY3zN4(companion.then(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape()), o0OOo000.f48164Oooo, null, 2, null)), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(1)), o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65520);
        o0ooOOo.OooO00o(composerStartRestartGroup);
        ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0O0O00.ic_moment_delete, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(f2), 0.0f, 11, null), Dp.m3775constructorimpl(19)), false, false, 0L, false, null, null, null, new OooO0O0(data), 255), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(f), 0.0f, Dp.m3775constructorimpl(32), 0.0f, 10, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O3 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl4 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = OooO.OooO00o(companion3, composerM1320constructorimpl4, measurePolicyOooO0O3, composerM1320constructorimpl4, currentCompositionLocalMap4);
        if (composerM1320constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash4, composerM1320constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        function3ModifierMaterializerOf4.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        TextKt.m1261Text4IGK_g(adData.getAdDescription(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        composerStartRestartGroup.startReplaceableGroup(146123202);
        if (TextUtils.isEmpty(adData.getAdImage())) {
            i3 = 6;
        } else {
            Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(o0000OO0.OooO00o(true)));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierClip);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1320constructorimpl5 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o5 = OooO.OooO00o(companion3, composerM1320constructorimpl5, measurePolicyOooO00o, composerM1320constructorimpl5, currentCompositionLocalMap5);
            if (composerM1320constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash5, composerM1320constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String adImage = adData.getAdImage();
            int iOooO00o = o0000O0.OooO00o(280);
            float f5 = 10;
            ImageKt.Image(o000OO.OooO0OO(p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, adImage), null, composerStartRestartGroup, 0, 1), (String) null, ClipKt.clip(AspectRatioKt.aspectRatio$default(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(f5), 0.0f, 0.0f, 13, null), 1.5444444f, false, 2, null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(o0000OO0.OooO00o(true))), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            composerStartRestartGroup.startReplaceableGroup(-269129636);
            if (o00O00OO.OooO0o(adData.getAdDescription2()) || o00O00OO.OooO0o(adData.getAdButtonName())) {
                Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(boxScopeInstance.align(SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(41), 0.0f, 2, null), companion2.getBottomStart()), o0OOo000.f48159OooOoOO, null, 2, null);
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO0O4 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM1320constructorimpl6 = Updater.m1320constructorimpl(composerStartRestartGroup);
                Function2 function2OooO00o6 = OooO.OooO00o(companion3, composerM1320constructorimpl6, measurePolicyOooO0O4, composerM1320constructorimpl6, currentCompositionLocalMap6);
                if (composerM1320constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash6, composerM1320constructorimpl6, currentCompositeKeyHash6, function2OooO00o6);
                }
                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                String adDescription2 = adData.getAdDescription2();
                Modifier modifierOooO00o2 = OooOO0O.OooO00o(rowScopeInstance, PaddingKt.m482paddingqDBjuR0$default(companion, Dp.m3775constructorimpl(f5), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
                ProvidableCompositionLocal<Boolean> providableCompositionLocal = o0000oo.f38633OooO00o;
                TextKt.m1261Text4IGK_g(adDescription2, modifierOooO00o2, ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue() ? o0OOo000.f48149OooOOo : o0OOo000.f48135OooO0O0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 3120, 55280);
                composerStartRestartGroup.startReplaceableGroup(-1495548078);
                if (o00O00OO.OooO0o(adData.getAdButtonName())) {
                    TextKt.m1261Text4IGK_g(adData.getAdButtonName(), PaddingKt.m479paddingVpY3zN4(BackgroundKt.m171backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f5), 0.0f, 2, null), RoundedCornerShapeKt.getCircleShape()), o0000oo.OooO0OO(composerStartRestartGroup).f38617OooO00o, null, 2, null), Dp.m3775constructorimpl(16), Dp.m3775constructorimpl(6)), ((Boolean) composerStartRestartGroup.consume(providableCompositionLocal)).booleanValue() ? o0OOo000.f48149OooOOo : o0OOo000.f48135OooO0O0, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65520);
                    i3 = 6;
                } else {
                    i3 = 6;
                }
                o00O000o.OooO00o(composerStartRestartGroup);
            } else {
                i3 = 6;
            }
            o00O000o.OooO00o(composerStartRestartGroup);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f4), null, composerStartRestartGroup, i3, 2);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0OO(modifier3, data, fragmentActivity, i, i2));
    }
}
