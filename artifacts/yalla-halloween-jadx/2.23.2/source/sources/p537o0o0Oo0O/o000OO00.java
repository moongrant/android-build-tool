package p537o0o0Oo0O;

import android.os.Looper;
import androidx.compose.animation.OooOo;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.DividerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.ReportModel;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.screen.report.utils.ReportParam;
import com.yalla.yalla.ui.vm.report.ReportVm;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p196o00o0OOO.oOO00O;
import p454o0Ooo000.OooOo00;
import p532o0o0OOo0.o00O00O;
import p537o0o0Oo0O.o000OO00;
import p537o0o0Oo0O.o000OOo0;
import p538o0o0Oo0o.o00O0000;
import p538o0o0Oo0o.o0O0ooO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p577o0oOoOo.o0oOo0O0;
import p590o0oOooo0.oOO0O00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nReportScreenCommonPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportScreenCommonPage.kt\ncom/yalla/yalla/ui/screen/report/ReportScreenCommonPage\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,239:1\n81#2,11:240\n81#2,11:268\n76#3:251\n76#3:267\n36#4:252\n36#4:260\n456#4,8:296\n464#4,3:310\n467#4,3:316\n456#4,8:339\n464#4,3:353\n456#4,8:375\n464#4,3:389\n467#4,3:396\n467#4,3:402\n1097#5,6:253\n1097#5,6:261\n154#6:259\n154#6:314\n154#6:315\n154#6:321\n154#6:357\n154#6:393\n154#6:394\n154#6:395\n164#6:401\n72#7,6:279\n78#7:313\n82#7:320\n72#7,6:322\n78#7:356\n82#7:406\n78#8,11:285\n91#8:319\n78#8,11:328\n78#8,11:364\n91#8:399\n91#8:405\n4144#9,6:304\n4144#9,6:347\n4144#9,6:383\n73#10,6:358\n79#10:392\n83#10:400\n*S KotlinDebug\n*F\n+ 1 ReportScreenCommonPage.kt\ncom/yalla/yalla/ui/screen/report/ReportScreenCommonPage\n*L\n44#1:240,11\n111#1:268,11\n46#1:251\n109#1:267\n50#1:252\n86#1:260\n113#1:296,8\n113#1:310,3\n113#1:316,3\n149#1:339,8\n149#1:353,3\n154#1:375,8\n154#1:389,3\n154#1:396,3\n149#1:402,3\n50#1:253,6\n86#1:261,6\n82#1:259\n130#1:314\n135#1:315\n152#1:321\n157#1:357\n168#1:393\n175#1:394\n181#1:395\n186#1:401\n113#1:279,6\n113#1:313\n113#1:320\n149#1:322,6\n149#1:356\n149#1:406\n113#1:285,11\n113#1:319\n149#1:328,11\n154#1:364,11\n154#1:399\n149#1:405\n113#1:304,6\n149#1:347,6\n154#1:383,6\n154#1:358,6\n154#1:392\n154#1:400\n*E\n"})
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000OO00 f54510OooO00o = new o000OO00();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f54511OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f54512OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54513OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(ReportVm reportVm, LifecycleOwner lifecycleOwner, o0oOo0O0 o0ooo0o1) {
            super(0);
            this.f54511OooO0Oo = reportVm;
            this.f54513OooO0o0 = lifecycleOwner;
            this.f54512OooO0o = o0ooo0o1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ReportVm reportVm = this.f54511OooO0Oo;
            ReportModel reportModel = reportVm.getListData().get(reportVm.getCurrentSelectedPosition());
            o00O0000.OooO00o(this.f54513OooO0o0, this.f54512OooO0o, reportVm, reportModel.getId(), reportModel.getCatagoryId());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f54514OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ReportVm reportVm) {
            super(0);
            this.f54514OooO0Oo = reportVm;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f54514OooO0Oo.loadReportReason();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f54515OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(ReportVm reportVm) {
            super(3);
            this.f54515OooO0Oo = reportVm;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope ContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1091330524, iIntValue, -1, "com.yalla.yalla.ui.screen.report.ReportScreenCommonPage.MainContent.<anonymous> (ReportScreenCommonPage.kt:96)");
                }
                o000OO00 o000oo01 = o000OO00.f54510OooO00o;
                ReportVm reportVm = this.f54515OooO0Oo;
                o000oo01.OooO0O0(reportVm, reportVm.getReportType(), composer2, 392);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f54516OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ReportVm f54518OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f54519OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Integer f54520OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f54521OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ColumnScope columnScope, ReportVm reportVm, Integer num, boolean z, int i) {
            super(2);
            this.f54519OooO0o0 = columnScope;
            this.f54518OooO0o = reportVm;
            this.f54520OooO0oO = num;
            this.f54521OooO0oo = z;
            this.f54516OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o000OO00.this.OooO00o(this.f54519OooO0o0, this.f54518OooO0o, this.f54520OooO0oO, this.f54521OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54516OooO | 1));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nReportScreenCommonPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportScreenCommonPage.kt\ncom/yalla/yalla/ui/screen/report/ReportScreenCommonPage$ReportList$1$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,239:1\n171#2,12:240\n*S KotlinDebug\n*F\n+ 1 ReportScreenCommonPage.kt\ncom/yalla/yalla/ui/screen/report/ReportScreenCommonPage$ReportList$1$1\n*L\n119#1:240,12\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ReportVm f54522OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f54523OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54524OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54525OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ReportVm reportVm, LifecycleOwner lifecycleOwner, o0oOo0O0 o0ooo0o1, int i) {
            super(1);
            this.f54522OooO0Oo = reportVm;
            this.f54524OooO0o0 = lifecycleOwner;
            this.f54523OooO0o = o0ooo0o1;
            this.f54525OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final List<ReportModel> listData = this.f54522OooO0Oo.getListData();
            final ReportVm reportVm = this.f54522OooO0Oo;
            final LifecycleOwner lifecycleOwner = this.f54524OooO0o0;
            final o0oOo0O0 o0ooo0o1 = this.f54523OooO0o;
            final int i = this.f54525OooO0oO;
            LazyColumn.items(listData.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.report.ReportScreenCommonPage$ReportList$1$1$invoke$$inlined$itemsIndexed$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    listData.get(num.intValue());
                    return null;
                }
            }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.report.ReportScreenCommonPage$ReportList$1$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i2;
                    LazyItemScope items = lazyItemScope;
                    int iIntValue = num.intValue();
                    Composer composer2 = composer;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i2 = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i2 = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i2 |= composer2.changed(iIntValue) ? 32 : 16;
                    }
                    if ((i2 & 731) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1091073711, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                        }
                        ReportModel reportModel = (ReportModel) listData.get(iIntValue);
                        o000OO00.OooO0Oo(o000OO00.f54510OooO00o, o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new o000OOo0(lifecycleOwner, reportVm, o0ooo0o1, i, reportModel, iIntValue), 255), reportModel, reportVm, iIntValue, composer2, ((((i2 & 112) | (i2 & 14)) << 6) & 7168) | 25152);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54527OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ReportVm f54528OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54529OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ReportVm reportVm, int i, int i2) {
            super(2);
            this.f54528OooO0o0 = reportVm;
            this.f54527OooO0o = i;
            this.f54529OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54529OooO0oO | 1);
            ReportVm reportVm = this.f54528OooO0o0;
            int i = this.f54527OooO0o;
            o000OO00.this.OooO0O0(reportVm, i, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f54531OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f54532OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54533OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(ColumnScope columnScope, boolean z, int i) {
            super(2);
            this.f54532OooO0o0 = columnScope;
            this.f54531OooO0o = z;
            this.f54533OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54533OooO0oO | 1);
            ColumnScope columnScope = this.f54532OooO0o0;
            boolean z = this.f54531OooO0o;
            o000OO00.this.OooO0OO(columnScope, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f54535OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f54536OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54537OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(ColumnScope columnScope, boolean z, int i) {
            super(2);
            this.f54536OooO0o0 = columnScope;
            this.f54535OooO0o = z;
            this.f54537OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54537OooO0oO | 1);
            ColumnScope columnScope = this.f54536OooO0o0;
            boolean z = this.f54535OooO0o;
            o000OO00.this.OooO0OO(columnScope, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0Oo(o000OO00 o000oo01, Modifier modifier, ReportModel reportModel, ReportVm reportVm, int i, Composer composer, int i2) {
        o000oo01.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(433640142);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433640142, i2, -1, "com.yalla.yalla.ui.screen.report.ReportScreenCommonPage.ReportListItem (ReportScreenCommonPage.kt:147)");
        }
        Modifier modifierOooO00o = OooOo00.OooO00o(15, SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, -483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(20), 1, null);
        Alignment.Vertical centerVertically = companion.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingVpY3zN4$default);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String text = reportModel.getText();
        if (text == null) {
            text = "";
        }
        TextKt.m1261Text4IGK_g(text, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion3, 1.0f, false, 2, null), o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, oOO0O00O.OooO0OO(15, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131056);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(12), null, composerStartRestartGroup, 6, 2);
        Integer nodeType = reportModel.getNodeType();
        if (nodeType != null && nodeType.intValue() == 3) {
            composerStartRestartGroup.startReplaceableGroup(-1276522178);
            ImageKt.Image(PainterResources_androidKt.painterResource(reportVm.getCurrentSelectedPosition() == i ? o0Oo0oo.icon_circle_green : o0Oo0oo.icon_move_room_dialog_gou_no_select, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(17)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1276521763);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.ic_poll_time_long, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion3, Dp.m3775constructorimpl(17)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            composerStartRestartGroup.endReplaceableGroup();
        }
        o0ooOOo.OooO00o(composerStartRestartGroup);
        DividerKt.m1074DivideroMI9zvI(null, o0000oo.OooO0OO(composerStartRestartGroup).f38621OooO0o, Dp.m3775constructorimpl((float) 0.5d), 0.0f, composerStartRestartGroup, 384, 9);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00(o000oo01, modifier, reportModel, reportVm, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(ColumnScope columnScope, ReportVm reportVm, Integer num, boolean z, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1253848089);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1253848089, i, -1, "com.yalla.yalla.ui.screen.report.ReportScreenCommonPage.MainContent (ReportScreenCommonPage.kt:73)");
        }
        Pair pairOooO00o = o0O0ooO.OooO00o(reportVm.getReportType(), num, reportVm.getPrivateChatReportType());
        int i2 = i >> 6;
        ReportScreen.INSTANCE.ReportTitleBar((String) pairOooO00o.getFirst(), z, composerStartRestartGroup, (i2 & 112) | 384, 0);
        String str = (String) pairOooO00o.getSecond();
        long j = o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o;
        long jOooO0OO = oOO0O00O.OooO0OO(13, composerStartRestartGroup);
        Modifier.Companion companion = Modifier.INSTANCE;
        TextKt.m1261Text4IGK_g(str, PaddingKt.m478padding3ABfNKs(companion, Dp.m3775constructorimpl(16)), j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 48, 0, 131056);
        if (reportVm.getListData().isEmpty()) {
            composerStartRestartGroup.startReplaceableGroup(240972143);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(reportVm);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                reportVm.loadReportReason();
                composerStartRestartGroup.updateRememberedValue(null);
            }
            composerStartRestartGroup.endReplaceableGroup();
            oOO00O.OooO0o0(reportVm.getContentState(), false, androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, companion, 1.0f, false, 2, null), null, null, null, new OooO00o(reportVm), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1091330524, true, new OooO0O0(reportVm)), composerStartRestartGroup, 12582912, 58);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(240972582);
            OooO0O0(reportVm, reportVm.getReportType(), composerStartRestartGroup, (i2 & 896) | 8);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(columnScope, reportVm, num, z, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(ReportVm reportVm, int i, Composer composer, int i2) {
        Integer nodeType;
        Composer composerStartRestartGroup = composer.startRestartGroup(830285183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(830285183, i2, -1, "com.yalla.yalla.ui.screen.report.ReportScreenCommonPage.ReportList (ReportScreenCommonPage.kt:107)");
        }
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(o0oOo0O0.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        o0oOo0O0 o0ooo0o1 = (o0oOo0O0) viewModel;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        LazyDslKt.LazyColumn(androidx.compose.foundation.layout.OooOO0.OooO00o(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), null, null, false, null, null, null, false, new OooO0o(reportVm, lifecycleOwner, o0ooo0o1, i), composerStartRestartGroup, 0, 254);
        composerStartRestartGroup.startReplaceableGroup(2032169170);
        ReportModel reportModel = (ReportModel) CollectionsKt.getOrNull(reportVm.getListData(), 0);
        if ((reportModel == null || (nodeType = reportModel.getNodeType()) == null || nodeType.intValue() != 3) ? false : true) {
            o00O0OO0.OooO00o(o0000.OooO0OO(o000000.submit_report), oOO0O00O.OooO0OO(16, composerStartRestartGroup), null, reportVm.getCurrentSelectedPosition() >= 0 ? TextButtonStyle.Green : TextButtonStyle.GreyDisable, null, null, null, 0.0f, PaddingKt.m471PaddingValues0680j_4(Dp.m3775constructorimpl(9)), reportVm.getCurrentSelectedPosition() >= 0, false, 0L, false, null, null, null, null, null, PaddingKt.m479paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(25), Dp.m3775constructorimpl(12)), new OooO(reportVm, lifecycleOwner, o0ooo0o1), composerStartRestartGroup, 100663296, 100663296, 261364);
        }
        if (OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(reportVm, i, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0OO(@NotNull ColumnScope columnScope, boolean z, @Nullable Composer composer, int i) {
        int i2;
        List<ReportModel> listEmptyList;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(625255354);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(625255354, i2, -1, "com.yalla.yalla.ui.screen.report.ReportScreenCommonPage.ReportScreenCommonMainPage (ReportScreenCommonPage.kt:42)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(ReportVm.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            ReportVm reportVm = (ReportVm) viewModel;
            Object obj = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup).get(ReportScreen.PARAM_DATA);
            ReportParam reportParam = obj instanceof ReportParam ? (ReportParam) obj : null;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(reportParam);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                reportVm.setReportType(reportParam != null ? reportParam.f29112OooO0Oo : -1);
                reportVm.setSourceId(reportParam != null ? reportParam.f29114OooO0o0 : null);
                reportVm.setMessagesList(reportParam != null ? reportParam.f29111OooO : null);
                reportVm.setExtendSourceId(reportParam != null ? reportParam.f29117OooOO0 : null);
                reportVm.setViewSourceType(reportParam != null ? reportParam.f29119OooOO0o : null);
                reportVm.setPrivateChatReportType(reportParam != null ? reportParam.f29121OooOOO0 : null);
                reportVm.setFriendRequestMessage(reportParam != null ? reportParam.f29120OooOOO : null);
                if (reportVm.getListData().isEmpty()) {
                    if (reportParam == null || (listEmptyList = reportParam.f29113OooO0o) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    reportVm.setListData(listEmptyList);
                }
                composerStartRestartGroup.updateRememberedValue(null);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (reportVm.getReportType() < 0) {
                if (!StringsKt.isBlank("argumentType is empty")) {
                    o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o("argumentType is empty", "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(columnScope, z, i));
                return;
            }
            Integer num = reportParam != null ? reportParam.f29118OooOO0O : null;
            int i3 = (i2 & 14) | 64;
            int i4 = i2 << 6;
            composer2 = composerStartRestartGroup;
            OooO00o(columnScope, reportVm, num, z, composerStartRestartGroup, i3 | (i4 & 7168) | (i4 & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO0(columnScope, z, i));
    }
}
