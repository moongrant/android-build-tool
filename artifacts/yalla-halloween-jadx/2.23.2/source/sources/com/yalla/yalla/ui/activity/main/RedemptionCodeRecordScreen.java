package com.yalla.yalla.ui.activity.main;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.RedemptionCodeAwards;
import com.yalla.yalla.model.RedemptionCodeModel;
import com.yalla.yalla.model.RedemptionCodeType;
import com.yalla.yalla.ui.vm.main.RedemptionCodeVm;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.oo00o;
import p423o0OoO0OO.o000OO;
import p448o0OoOoo.oo0oOO0;
import p476o0OooooO.o0OOo000;
import p487o0o00O.o0000Ooo;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0Oo0oo;
import p598o0oo00Oo.o0000O00;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\bJ!\u0010\r\u001a\u00020\u00022\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0018\u0010\u0013\u001a\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/RedemptionCodeRecordScreen;", "Lo0o0OOo0/o000O0;", "", "HistoryList", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/model/RedemptionCodeModel;", "it", "ItemView", "(Lcom/yalla/yalla/model/RedemptionCodeModel;Landroidx/compose/runtime/Composer;I)V", "ItemTimeView", "", "Lcom/yalla/yalla/model/RedemptionCodeAwards;", "awards", "ItemAwardsView", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "navigate", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "Landroidx/compose/foundation/layout/ColumnScope;", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "item", "ItemAwardsItemView", "(Lcom/yalla/yalla/model/RedemptionCodeAwards;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRedemptionCodeRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedemptionCodeRecordScreen.kt\ncom/yalla/yalla/ui/activity/main/RedemptionCodeRecordScreen\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,245:1\n72#2,6:246\n78#2:280\n82#2:285\n72#2,6:299\n78#2:333\n82#2:338\n72#2,6:385\n78#2:419\n82#2:427\n78#3,11:252\n91#3:284\n78#3,11:305\n91#3:337\n78#3,11:346\n91#3:381\n78#3,11:391\n91#3:426\n78#3,11:436\n78#3,11:474\n91#3:506\n91#3:512\n456#4,8:263\n464#4,3:277\n467#4,3:281\n456#4,8:316\n464#4,3:330\n467#4,3:334\n456#4,8:357\n464#4,3:371\n467#4,3:378\n456#4,8:402\n464#4,3:416\n467#4,3:423\n456#4,8:447\n464#4,3:461\n456#4,8:485\n464#4,3:499\n467#4,3:503\n467#4,3:509\n4144#5,6:271\n4144#5,6:324\n4144#5,6:365\n4144#5,6:410\n4144#5,6:455\n4144#5,6:493\n81#6,11:286\n154#7:297\n154#7:298\n154#7:339\n154#7:375\n154#7:376\n154#7:377\n154#7:383\n154#7:384\n154#7:428\n154#7:429\n154#7:465\n154#7:466\n154#7:467\n154#7:508\n73#8,6:340\n79#8:374\n83#8:382\n73#8,6:430\n79#8:464\n83#8:513\n1864#9,3:420\n66#10,6:468\n72#10:502\n76#10:507\n*S KotlinDebug\n*F\n+ 1 RedemptionCodeRecordScreen.kt\ncom/yalla/yalla/ui/activity/main/RedemptionCodeRecordScreen\n*L\n69#1:246,6\n69#1:280\n69#1:285\n112#1:299,6\n112#1:333\n112#1:338\n150#1:385,6\n150#1:419\n150#1:427\n69#1:252,11\n69#1:284\n112#1:305,11\n112#1:337\n126#1:346,11\n126#1:381\n150#1:391,11\n150#1:426\n167#1:436,11\n208#1:474,11\n208#1:506\n167#1:512\n69#1:263,8\n69#1:277,3\n69#1:281,3\n112#1:316,8\n112#1:330,3\n112#1:334,3\n126#1:357,8\n126#1:371,3\n126#1:378,3\n150#1:402,8\n150#1:416,3\n150#1:423,3\n167#1:447,8\n167#1:461,3\n208#1:485,8\n208#1:499,3\n208#1:503,3\n167#1:509,3\n69#1:271,6\n112#1:324,6\n126#1:365,6\n150#1:410,6\n167#1:455,6\n208#1:493,6\n81#1:286,11\n114#1:297\n116#1:298\n129#1:339\n136#1:375\n138#1:376\n143#1:377\n152#1:383\n155#1:384\n169#1:428\n171#1:429\n202#1:465\n203#1:466\n206#1:467\n220#1:508\n126#1:340,6\n126#1:374\n126#1:382\n167#1:430,6\n167#1:464\n167#1:513\n157#1:420,3\n208#1:468,6\n208#1:502\n208#1:507\n*E\n"})
public final class RedemptionCodeRecordScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final RedemptionCodeRecordScreen INSTANCE = new RedemptionCodeRecordScreen();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25027OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeAwards f25028OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RedemptionCodeAwards redemptionCodeAwards, int i) {
            super(2);
            this.f25028OooO0o0 = redemptionCodeAwards;
            this.f25027OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25027OooO0o | 1);
            RedemptionCodeRecordScreen.this.ItemAwardsItemView(this.f25028OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25030OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f25031OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f25031OooO0o0 = columnScope;
            this.f25030OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25030OooO0o | 1);
            RedemptionCodeRecordScreen.this.Content(this.f25031OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f25032OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<RedemptionCodeModel> f25033OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LazyListState lazyListState, p107o000ooO0.OooOOOO<RedemptionCodeModel> oooOOOO) {
            super(3);
            this.f25032OooO0Oo = lazyListState;
            this.f25033OooO0o0 = oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(965523631, iIntValue, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.HistoryList.<anonymous> (RedemptionCodeRecordScreen.kt:91)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f25032OooO0Oo, null, false, null, null, null, false, new OooOOOO(this.f25033OooO0o0), composer2, 6, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f25035OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f25035OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25035OooO0o0 | 1);
            RedemptionCodeRecordScreen.this.HistoryList(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f25036OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o000OO.OooO0o0(it, o0Oo0oo.icon_picture_default);
            it.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25038OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<RedemptionCodeAwards> f25039OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(List<RedemptionCodeAwards> list, int i) {
            super(2);
            this.f25039OooO0o0 = list;
            this.f25038OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25038OooO0o | 1);
            RedemptionCodeRecordScreen.this.ItemAwardsView(this.f25039OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25041OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeModel f25042OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(RedemptionCodeModel redemptionCodeModel, int i) {
            super(2);
            this.f25042OooO0o0 = redemptionCodeModel;
            this.f25041OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25041OooO0o | 1);
            RedemptionCodeRecordScreen.this.ItemTimeView(this.f25042OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f25044OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RedemptionCodeModel f25045OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(RedemptionCodeModel redemptionCodeModel, int i) {
            super(2);
            this.f25045OooO0o0 = redemptionCodeModel;
            this.f25044OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f25044OooO0o | 1);
            RedemptionCodeRecordScreen.this.ItemView(this.f25045OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private RedemptionCodeRecordScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void HistoryList(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1355964149);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1355964149, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.HistoryList (RedemptionCodeRecordScreen.kt:79)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(RedemptionCodeVm.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            p107o000ooO0.OooOOOO oooOOOOOooO00o = p107o000ooO0.o00O0O.OooO00o(((RedemptionCodeVm) viewModel).getCdkeyListPager().f38501OooO0oo, composerStartRestartGroup);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposableLambda composableLambda = o0000Ooo.f48768OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 965523631, true, new OooO0O0(lazyListStateRememberLazyListState, oooOOOOOooO00o));
            int i2 = p107o000ooO0.OooOOOO.f35803OooO0o0;
            oo00o.OooO00o(oooOOOOOooO00o, modifierFillMaxSize$default, lazyListStateRememberLazyListState, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236216, 184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ItemAwardsView(List<RedemptionCodeAwards> list, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1052436993);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1052436993, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.ItemAwardsView (RedemptionCodeRecordScreen.kt:148)");
        }
        Modifier modifierClip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(16)));
        int i2 = o0OOo000.f48347o00OOooO;
        Modifier modifierM513heightInVpY3zN4$default = SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(BackgroundKt.m171backgroundbw27NRU$default(modifierClip, o0OOo000.f48135OooO0O0, null, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(72), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        int i3 = 0;
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM513heightInVpY3zN4$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-313454672);
        if (list != null) {
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                RedemptionCodeAwards redemptionCodeAwards = (RedemptionCodeAwards) obj;
                o0000O00.OooO0O0("WRM RedemptionCodeRecordScreen itemAwardsView index = " + i3 + " , item = " + p187o00o00o0.OooO.OooO00o(redemptionCodeAwards));
                INSTANCE.ItemAwardsItemView(redemptionCodeAwards, composerStartRestartGroup, 56);
                i3 = i4;
            }
        }
        if (androidx.compose.animation.OooOo.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(list, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ItemTimeView(RedemptionCodeModel redemptionCodeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(351818179);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(351818179, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.ItemTimeView (RedemptionCodeRecordScreen.kt:123)");
        }
        o0000O00.OooO0O0("WRM RedemptionCodeRecordScreen itemTimeView it = ".concat(p187o00o00o0.OooO.OooO00o(redemptionCodeModel)));
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(49));
        Alignment.Vertical top = Alignment.INSTANCE.getTop();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, top, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        TextKt.m1261Text4IGK_g(o0O0O0o0.OooO0Oo(redemptionCodeModel.getTime(), System.currentTimeMillis()), PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(20), 0.0f, 0.0f, 13, null), o0000oo.OooO0OO(composerStartRestartGroup).f38625OooOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(8), androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 6, 0);
        TextKt.m1261Text4IGK_g(o0000O.OooO00o(StringResources_androidKt.stringResource(o000000.Redemption_Code_XXX, composerStartRestartGroup, 0), redemptionCodeModel.getCdk()), PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl(22), 0.0f, 0.0f, 13, null), o0000oo.OooO0OO(composerStartRestartGroup).f38627OooOO0o, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 0, 131056);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(redemptionCodeModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ItemView(RedemptionCodeModel redemptionCodeModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(152365334);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(152365334, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.ItemView (RedemptionCodeRecordScreen.kt:110)");
        }
        Modifier modifierM513heightInVpY3zN4$default = SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m3775constructorimpl(16), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(121), 0.0f, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM513heightInVpY3zN4$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        RedemptionCodeRecordScreen redemptionCodeRecordScreen = INSTANCE;
        redemptionCodeRecordScreen.ItemTimeView(redemptionCodeModel, composerStartRestartGroup, 56);
        redemptionCodeRecordScreen.ItemAwardsView(redemptionCodeModel.getRewards(), composerStartRestartGroup, 56);
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(redemptionCodeModel, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2095332748);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2095332748, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.Content (RedemptionCodeRecordScreen.kt:67)");
            }
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), o0000oo.OooO0OO(composerStartRestartGroup).f38619OooO0OO, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(o000000.Exchange_Records, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, null, null, composerStartRestartGroup, 0, 510);
            INSTANCE.HistoryList(composer2, 6);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void ItemAwardsItemView(@Nullable RedemptionCodeAwards redemptionCodeAwards, @Nullable Composer composer, int i) {
        String strOooO00o;
        Painter painterOooO0OO;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1921808366);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1921808366, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.ItemAwardsItemView (RedemptionCodeRecordScreen.kt:164)");
        }
        if (redemptionCodeAwards == null) {
            composer2 = composerStartRestartGroup;
        } else {
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 16;
            Modifier modifierM511height3ABfNKs = SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m480paddingVpY3zN4$default(companion, Dp.m3775constructorimpl(f), 0.0f, 2, null), 0.0f, 1, null), Dp.m3775constructorimpl(72));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM511height3ABfNKs);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int unit = redemptionCodeAwards.getUnit();
            RedemptionCodeType.Unit unit2 = RedemptionCodeType.Unit.INSTANCE;
            if (unit == unit2.getCount()) {
                strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.Exchange_Records_X_xxx), String.valueOf(redemptionCodeAwards.getRewardCount()));
            } else if (unit == unit2.getDays()) {
                strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000000.Exchange_Records_X_xxx_Days), String.valueOf(redemptionCodeAwards.getRewardCount()));
            } else {
                strOooO00o = unit == unit2.getCoin() ? o0000O.OooO00o(o0000.OooO0OO(o000000.Exchange_Records_X_xxx), String.valueOf(redemptionCodeAwards.getRewardCount())) : o0000O.OooO00o(o0000.OooO0OO(o000000.Exchange_Records_X_xxx), String.valueOf(redemptionCodeAwards.getRewardCount()));
            }
            String str = strOooO00o;
            if (redemptionCodeAwards.getRewardType() == RedemptionCodeType.RewardType.INSTANCE.getCoin()) {
                composerStartRestartGroup.startReplaceableGroup(628377650);
                painterOooO0OO = PainterResources_androidKt.painterResource(o0O0O00.ic_redemption_code_reward_coin, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(628377765);
                painterOooO0OO = o000OO.OooO0OO(redemptionCodeAwards.getRewardImage(), OooO0o.f25036OooO0Oo, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.endReplaceableGroup();
            }
            float f2 = 40;
            ImageKt.Image(painterOooO0OO, (String) null, SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f2)), Dp.m3775constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            oo0oOO0.OooO00o(f, companion, composerStartRestartGroup, 6);
            Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m1261Text4IGK_g(redemptionCodeAwards.getRewardName(), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120818);
            o0ooOOo.OooO00o(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m530width3ABfNKs(companion, Dp.m3775constructorimpl(24)), composer2, 6);
            TextKt.m1261Text4IGK_g(str, (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, TextDirection.m3687boximpl(TextDirection.INSTANCE.m3694getContents_7Xco()), 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16711679, (DefaultConstructorMarker) null), composer2, 3072, 0, 65522);
            o0ooOOo.OooO00o(composer2);
            Unit unit3 = Unit.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(redemptionCodeAwards, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4200getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1623959825);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1623959825, i, -1, "com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen.getWindowBackgroundColor (RedemptionCodeRecordScreen.kt:64)");
        }
        long j = o0000oo.OooO0OO(composer).f38619OooO0OO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public final void navigate() {
        o00O00.OooO0o0(INSTANCE, null, false, null, 14);
    }
}
