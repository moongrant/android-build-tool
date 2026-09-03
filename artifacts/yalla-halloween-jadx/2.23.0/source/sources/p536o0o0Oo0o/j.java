package p536o0o0Oo0o;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.vm.user.UserOutFitVM;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p148o00Oo0o.o00000O0;
import p148o00Oo0o.o0O0O00;
import p150o00Oo0oO.o0000Ooo;
import p158o00OoOOO.oo000o;
import p417o0OoO0.o00000O;
import p417o0OoO0.o00Oo0;
import p426o0OoOO.o000oOoO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p519o0o0O0oO.y4;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,360:1\n81#2,11:361\n81#2,11:372\n76#3:383\n76#3:419\n76#3:568\n72#4,6:384\n78#4:418\n82#4:424\n78#5,11:390\n91#5:423\n78#5,11:443\n78#5,11:481\n91#5:515\n78#5,11:528\n91#5:561\n91#5:566\n456#6,8:401\n464#6,3:415\n467#6,3:420\n36#6:430\n456#6,8:454\n464#6,3:468\n456#6,8:492\n464#6,3:506\n467#6,3:512\n456#6,8:539\n464#6,3:553\n467#6,3:558\n467#6,3:563\n4144#7,6:409\n4144#7,6:462\n4144#7,6:500\n4144#7,6:547\n154#8:425\n154#8:426\n154#8:427\n154#8:428\n154#8:429\n154#8:472\n154#8:473\n154#8:474\n154#8:510\n154#8:511\n154#8:517\n154#8:518\n154#8:519\n154#8:520\n154#8:521\n154#8:522\n154#8:557\n1097#9,6:431\n66#10,6:437\n72#10:471\n67#10,5:523\n72#10:556\n76#10:562\n76#10:567\n73#11,6:475\n79#11:509\n83#11:516\n81#12:569\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt\n*L\n87#1:361,11\n93#1:372,11\n94#1:383\n138#1:419\n351#1:568\n104#1:384,6\n104#1:418\n104#1:424\n104#1:390,11\n104#1:423\n249#1:443,11\n264#1:481,11\n264#1:515\n313#1:528,11\n313#1:561\n249#1:566\n104#1:401,8\n104#1:415,3\n104#1:420,3\n258#1:430\n249#1:454,8\n249#1:468,3\n264#1:492,8\n264#1:506,3\n264#1:512,3\n313#1:539,8\n313#1:553,3\n313#1:558,3\n249#1:563,3\n104#1:409,6\n249#1:462,6\n264#1:500,6\n313#1:547,6\n206#1:425\n219#1:426\n252#1:427\n254#1:428\n256#1:429\n267#1:472\n268#1:473\n273#1:474\n278#1:510\n280#1:511\n294#1:517\n295#1:518\n305#1:519\n306#1:520\n307#1:521\n317#1:522\n342#1:557\n258#1:431,6\n249#1:437,6\n249#1:471\n313#1:523,5\n313#1:556\n313#1:562\n249#1:567\n264#1:475,6\n264#1:509\n264#1:516\n137#1:569\n*E\n"})
public final class j {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54940OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f54940OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            j.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f54940OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<ShopVehicleListModel> f54941OooO0Oo;

        public OooO00o(o000O0.OooO0O0<ShopVehicleListModel> oooO0O0) {
            this.f54941OooO0Oo = oooO0O0;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            bool.booleanValue();
            this.f54941OooO0Oo.OooO0Oo();
        }
    }

    @SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,360:1\n154#2:361\n154#2:362\n154#2:363\n154#2:399\n73#3,6:364\n79#3:398\n83#3:411\n78#4,11:370\n91#4:410\n456#5,8:381\n464#5,3:395\n36#5:400\n467#5,3:407\n4144#6,6:389\n1097#7,6:401\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$1\n*L\n110#1:361\n111#1:362\n112#1:363\n129#1:399\n108#1:364,6\n108#1:398\n108#1:411\n108#1:370,11\n108#1:410\n108#1:381,8\n108#1:395,3\n130#1:400\n108#1:407,3\n108#1:389,6\n130#1:401,6\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54942OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<Boolean> mutableState) {
            super(3);
            this.f54942OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1689838803, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent.<anonymous>.<anonymous> (VehiclesScreen.kt:106)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 14;
            float f2 = 8;
            float f3 = 12;
            Modifier modifierHeight = IntrinsicKt.height(SizeKt.fillMaxWidth$default(PaddingKt.m479paddingqDBjuR0(BackgroundKt.m168backgroundbw27NRU(PaddingKt.m479paddingqDBjuR0(companion, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(10), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(2)), o0oO0O0o.f46946OooO0O0, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(6))), Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f2)), 0.0f, 1, null), IntrinsicSize.Min);
            composer2.startReplaceableGroup(693286680);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(companion2, start, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierHeight);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1251Text4IGK_g(o0000.OooO0OO(oO00OOo0.vehicle_store_title_hint), androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), o0oO0O0o.f46982Oooo0o, o0000O0.OooO0OO(13, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_close, composer2, 0);
            Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(rowScopeInstance.align(SizeKt.wrapContentWidth$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), null, false, 3, null), companion2.getCenterVertically()), Dp.m3765constructorimpl(16));
            composer2.startReplaceableGroup(1157296644);
            MutableState<Boolean> mutableState = this.f54942OooO0Oo;
            boolean zChanged = composer2.changed(mutableState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new k(mutableState);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m202clickableXHw0xAI$default(modifierM523size3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Pair<Boolean, Integer>> f54943OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f54944OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(State<Pair<Boolean, Integer>> state, FragmentActivity fragmentActivity) {
            super(3);
            this.f54943OooO0Oo = state;
            this.f54944OooO0o0 = fragmentActivity;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0057  */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            boolean z;
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1771107627, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent.<anonymous>.<anonymous> (VehiclesScreen.kt:141)");
                }
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.vehicle_mine_empty_hint);
                composer2.startReplaceableGroup(593354342);
                State<Pair<Boolean, Integer>> state = this.f54943OooO0Oo;
                Pair<Boolean, Integer> value = state.getValue();
                if (value != null) {
                    z = value.getFirst().booleanValue();
                }
                String strStringResource = z ? StringResources_androidKt.stringResource(oO00OOo0.Purchase_Now, composer2, 0) : o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium);
                composer2.endReplaceableGroup();
                o0000Ooo.OooO00o(strOooO0OO, 0, 0.0f, strStringResource, null, false, null, new l(state, this.f54944OooO0o0), null, composer2, 0, 374);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,360:1\n154#2:361\n154#2:362\n154#2:363\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$3\n*L\n162#1:361\n163#1:362\n164#1:363\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<ShopVehicleListModel> f54945OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f54946OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserOutFitVM f54947OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54948OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o000O0.OooO0O0<ShopVehicleListModel> oooO0O0, UserOutFitVM userOutFitVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f54945OooO0Oo = oooO0O0;
            this.f54947OooO0o0 = userOutFitVM;
            this.f54946OooO0o = o0o0ooo0;
            this.f54948OooO0oO = lifecycleOwner;
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
                    ComposerKt.traceEventStart(600609239, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent.<anonymous>.<anonymous> (VehiclesScreen.kt:158)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                PaddingValues paddingValuesM470PaddingValuesYgX7TsA = PaddingKt.m470PaddingValuesYgX7TsA(Dp.m3765constructorimpl(9), Dp.m3765constructorimpl(8));
                Arrangement arrangement = Arrangement.INSTANCE;
                float f = 1;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValuesM470PaddingValuesYgX7TsA, false, arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), arrangement.m390spacedBy0680j_4(Dp.m3765constructorimpl(f)), null, false, new p(this.f54945OooO0Oo, this.f54947OooO0o0, this.f54946OooO0o, this.f54948OooO0oO), composer2, 1772592, 404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f54949OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f54950OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Context context) {
            super(0);
            this.f54950OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f27140Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f54950OooO0Oo, PremiumLevel.Premium3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54951OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54952OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f54951OooO0Oo = mutableState;
            this.f54952OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54952OooO0o0 | 1);
            j.OooO0O0(this.f54951OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f54953OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(536437637);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(536437637, i, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent (VehiclesScreen.kt:85)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(UserOutFitVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            UserOutFitVM userOutFitVM = (UserOutFitVM) viewModel;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            o000O0.OooO0O0 oooO0O0OooO00o = o000O0.OooOOO.OooO00o(userOutFitVM.getMyVehiclesPager().f37667OooO0oo, composerStartRestartGroup);
            MutableState mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0.f54949OooO0Oo, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0O0OOO0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            OooO0O0(userOutFitVM.getShowPremiumBuyFrozenDialog(), composerStartRestartGroup, 0);
            y4.f53219OooO00o.OooO0O0(384, composerStartRestartGroup, userOutFitVM.getShowVehicleDialog(), userOutFitVM.getPicUrl());
            Observable<Object> observable = LiveEventBus.get("OUT_FIT_VEHICLES_REFRESH");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.OUT_FIT_VEHICLES_REFRESH)");
            o00000O.OooO00o(observable, new OooO00o(oooO0O0OooO00o), composerStartRestartGroup, 8);
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, o0oO0O0o.f47079o000o0O0, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            AnimatedVisibilityKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) mutableState.getValue()).booleanValue(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1689838803, true, new OooO0O0(mutableState)), composerStartRestartGroup, 1572870, 30);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.OooOO0o(), composerStartRestartGroup, 8);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1771107627, true, new OooO0OO(stateObserveAsState, (FragmentActivity) objConsume));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 600609239, true, new OooO0o(oooO0O0OooO00o, userOutFitVM, o0o0ooo0, lifecycleOwner));
            int i2 = o000O0.OooO0O0.f34327OooO0o0;
            o0O0O00.OooO00o(oooO0O0OooO00o, null, lazyListStateRememberLazyListState, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236168, 186);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(MutableState<Boolean> mutableState, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-478493561);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(mutableState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-478493561, i2, -1, "com.yalla.yalla.ui.screen.user.PremiumBuyFrozenDialog (VehiclesScreen.kt:349)");
            }
            composer2 = composerStartRestartGroup;
            oo000o.OooO0Oo(mutableState, o0000.OooO0OO(oO00OOo0.vehicle_mine_Vehicle_Frozen_title), o0000.OooO0OO(oO00OOo0.vehicle_mine_Vehicle_Frozen_content), null, false, false, null, null, o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium), false, null, false, new OooOO0O((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, false, false, null, OooOOO0.f54953OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913144);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(mutableState, i));
    }

    public static final void OooO0OO(ShopVehicleListModel shopVehicleListModel, UserOutFitVM userOutFitVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-795938905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-795938905, i, -1, "com.yalla.yalla.ui.screen.user.ItemBubbleUseButton (VehiclesScreen.kt:194)");
        }
        if (shopVehicleListModel.getIsFreeze()) {
            i2 = oO00OOo0.vehicle_mine_Frozen;
        } else {
            i2 = shopVehicleListModel.isSelected() ? oO00OOo0.In_Use : oO00OOo0.Use;
        }
        float f = 8;
        o00000O0.OooO00o(o0000.OooO0OO(i2), o0000O0.OooO0OO(16, composerStartRestartGroup, 6), null, null, Color.m1660boximpl(o0oO0O0o.f46946OooO0O0), Color.m1660boximpl(shopVehicleListModel.getIsFreeze() ? o0oO0O0o.f47044o000O00 : o0oO0O0o.f46993OoooOo0), RoundedCornerShapeKt.m729RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), 3, null), 0.0f, null, false, false, 0L, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1824524455, true, new d(shopVehicleListModel)), null, null, SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(36)), new e(shopVehicleListModel, userOutFitVM, o0o0ooo0, lifecycleOwner), composerStartRestartGroup, 0, 100859904, 229260);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(shopVehicleListModel, userOutFitVM, o0o0ooo0, lifecycleOwner, i));
    }

    public static final void OooO0Oo(ShopVehicleListModel shopVehicleListModel, Function0 function0, Composer composer, int i) {
        Composer composer2;
        ComposeUiNode.Companion companion;
        Composer composer3;
        String strOooO0OO;
        Composer composerStartRestartGroup = composer.startRestartGroup(1829007362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1829007362, i, -1, "com.yalla.yalla.ui.screen.user.ItemVehiclesInfo (VehiclesScreen.kt:247)");
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f = 6;
        float f2 = 0;
        Modifier modifierM180borderxT4_qwU = BorderKt.m180borderxT4_qwU(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3765constructorimpl(139)), Dp.m3765constructorimpl(1), shopVehicleListModel.isSelected() ? o0oO0O0o.f46993OoooOo0 : o0oO0O0o.f46945OooO00o, RoundedCornerShapeKt.m728RoundedCornerShapea9UjIt4(Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(f2), Dp.m3765constructorimpl(f2)));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new g(function0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(modifierM180borderxT4_qwU, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1673726684);
        if (shopVehicleListModel.getDayNum() <= 0 || shopVehicleListModel.getTimeLong() == -1) {
            composer2 = composerStartRestartGroup;
            companion = companion4;
        } else {
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            float f3 = 7;
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(BackgroundKt.m168backgroundbw27NRU(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(f3), Dp.m3765constructorimpl(f3), 0.0f, 0.0f, 12, null), Dp.m3765constructorimpl(20)), o0oO0O0o.f47099o000oooo, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3765constructorimpl(4), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ic_vehicle_limit_time_mine, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(11)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(2), null, composerStartRestartGroup, 6, 2);
            companion = companion4;
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.store_xxx_days), String.valueOf(shopVehicleListModel.getDayNum())), (Modifier) null, o0oO0O0o.f47054o000OO, o0000O0.OooO0OO(11, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
            o000oOoO.OooO00o(composer2);
        }
        composer2.endReplaceableGroup();
        Composer composer4 = composer2;
        float f4 = 7;
        ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.user_ic_vehicle_play, composer4, 0), (String) null, boxScopeInstance.align(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, Dp.m3765constructorimpl(f4), Dp.m3765constructorimpl(f4), 0.0f, 9, null), Dp.m3765constructorimpl(20)), companion3.getTopEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
        ImageKt.Image(o00Oo0.OooO0OO(shopVehicleListModel.getPic(), h.f54936OooO0Oo, composer4, 48, 0), "", boxScopeInstance.align(SizeKt.m528width3ABfNKs(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(29), 7, null), Dp.m3765constructorimpl(70)), Dp.m3765constructorimpl(110)), companion3.getBottomCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 48, 120);
        composer4.startReplaceableGroup(-705759282);
        if (shopVehicleListModel.isTagVisible()) {
            boolean z = shopVehicleListModel.getVehicleTagType() == 10 || shopVehicleListModel.getVehicleTagType() == 11;
            Alignment center = companion3.getCenter();
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(boxScopeInstance.align(SizeKt.m511heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3765constructorimpl(24), 0.0f, 2, null), companion3.getBottomCenter()), z ? o0oO0O0o.f47104o00O0000 : o0oO0O0o.f47005o00, null, 2, null);
            composer4.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 6);
            composer4.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM169backgroundbw27NRU$default);
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor3);
            } else {
                composer4.useNode();
            }
            Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer4);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl3, currentCompositionLocalMap3);
            if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer4)), composer4, 0);
            composer4.startReplaceableGroup(2058660585);
            int nVehicleTagType = shopVehicleListModel.getNVehicleTagType();
            if (nVehicleTagType == 300) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip300);
            } else if (nVehicleTagType != 400) {
                strOooO0OO = nVehicleTagType != 500 ? "" : o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip5);
            } else {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.vehicle_store_tag_vip400);
            }
            String str = strOooO0OO;
            long j = z ? o0oO0O0o.f47163o0O0ooO : o0oO0O0o.f47054o000OO;
            int iM3671getCentere0LSkKk = TextAlign.INSTANCE.m3671getCentere0LSkKk();
            long jOooO0OO = o0000O0.OooO0OO(12, composer4, 6);
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion2, companion3.getCenter()), 0.0f, 1, null), null, false, 3, null);
            float f5 = 5;
            composer3 = composer4;
            TextKt.m1251Text4IGK_g(str, PaddingKt.m480paddingqDBjuR0$default(modifierWrapContentHeight$default, Dp.m3765constructorimpl(f5), 0.0f, Dp.m3765constructorimpl(f5), 0.0f, 10, null), j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 130544);
            o000oOoO.OooO00o(composer3);
        } else {
            composer3 = composer4;
        }
        if (OooOo.OooO0o.OooO0O0(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i(shopVehicleListModel, function0, i));
    }
}
