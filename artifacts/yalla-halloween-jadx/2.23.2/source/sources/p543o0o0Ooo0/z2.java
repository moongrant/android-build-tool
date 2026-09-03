package p543o0o0Ooo0;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.OooOo;
import androidx.compose.animation.Oooo000;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import o000O.o0ooOOo;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.o00O0O;
import p194o00o0OO.o00O0OO0;
import p194o00o0OO.oo00o;
import p196o00o0OOO.oOO00O;
import p207o00o0oO0.o000O0Oo;
import p423o0OoO0OO.o000OO;
import p423o0OoO0OO.o00O0000;
import p476o0OooooO.o0OOo000;
import p487o0o00O.o0O000O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;
import p562o0oOo000.o0Oo0oo;
import p577o0oOoOo.o0oOo0O0;
import p650o0ooo.y4;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,361:1\n81#2,11:362\n81#2,11:373\n76#3:384\n76#3:420\n76#3:569\n72#4,6:385\n78#4:419\n82#4:425\n78#5,11:391\n91#5:424\n78#5,11:444\n78#5,11:482\n91#5:516\n78#5,11:529\n91#5:562\n91#5:567\n456#6,8:402\n464#6,3:416\n467#6,3:421\n36#6:431\n456#6,8:455\n464#6,3:469\n456#6,8:493\n464#6,3:507\n467#6,3:513\n456#6,8:540\n464#6,3:554\n467#6,3:559\n467#6,3:564\n4144#7,6:410\n4144#7,6:463\n4144#7,6:501\n4144#7,6:548\n154#8:426\n154#8:427\n154#8:428\n154#8:429\n154#8:430\n154#8:473\n154#8:474\n154#8:475\n154#8:511\n154#8:512\n154#8:518\n154#8:519\n154#8:520\n154#8:521\n154#8:522\n154#8:523\n154#8:558\n1097#9,6:432\n66#10,6:438\n72#10:472\n67#10,5:524\n72#10:557\n76#10:563\n76#10:568\n73#11,6:476\n79#11:510\n83#11:517\n81#12:570\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt\n*L\n87#1:362,11\n93#1:373,11\n94#1:384\n139#1:420\n352#1:569\n104#1:385,6\n104#1:419\n104#1:425\n104#1:391,11\n104#1:424\n250#1:444,11\n265#1:482,11\n265#1:516\n314#1:529,11\n314#1:562\n250#1:567\n104#1:402,8\n104#1:416,3\n104#1:421,3\n259#1:431\n250#1:455,8\n250#1:469,3\n265#1:493,8\n265#1:507,3\n265#1:513,3\n314#1:540,8\n314#1:554,3\n314#1:559,3\n250#1:564,3\n104#1:410,6\n250#1:463,6\n265#1:501,6\n314#1:548,6\n207#1:426\n220#1:427\n253#1:428\n255#1:429\n257#1:430\n268#1:473\n269#1:474\n274#1:475\n279#1:511\n281#1:512\n295#1:518\n296#1:519\n306#1:520\n307#1:521\n308#1:522\n318#1:523\n343#1:558\n259#1:432,6\n250#1:438,6\n250#1:472\n314#1:524,5\n314#1:557\n314#1:563\n250#1:568\n265#1:476,6\n265#1:510\n265#1:517\n138#1:570\n*E\n"})
public final class z2 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55725OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i) {
            super(2);
            this.f55725OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            z2.OooO00o(composer, RecomposeScopeImplKt.updateChangedFlags(this.f55725OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55726OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,361:1\n154#2:362\n154#2:363\n154#2:364\n154#2:400\n73#3,6:365\n79#3:399\n83#3:412\n78#4,11:371\n91#4:411\n456#5,8:382\n464#5,3:396\n36#5:401\n467#5,3:408\n4144#6,6:390\n1097#7,6:402\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$2\n*L\n111#1:362\n112#1:363\n113#1:364\n130#1:400\n109#1:365,6\n109#1:399\n109#1:412\n109#1:371,11\n109#1:411\n109#1:382,8\n109#1:396,3\n131#1:401\n109#1:408,3\n109#1:390,6\n131#1:402,6\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55727OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<Boolean> mutableState) {
            super(3);
            this.f55727OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1689838803, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent.<anonymous>.<anonymous> (VehiclesScreen.kt:108)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 14;
            float f2 = 8;
            float f3 = 12;
            Modifier modifierHeight = IntrinsicKt.height(SizeKt.fillMaxWidth$default(PaddingKt.m481paddingqDBjuR0(BackgroundKt.m170backgroundbw27NRU(PaddingKt.m481paddingqDBjuR0(companion, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(10), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(2)), o0OOo000.f48135OooO0O0, RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl(6))), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f2)), 0.0f, 1, null), IntrinsicSize.Min);
            composer2.startReplaceableGroup(693286680);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0O.OooO00o(companion2, start, composer2, 0, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1261Text4IGK_g(o0000.OooO0OO(o000000.vehicle_store_title_hint), androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScopeInstance, companion, 1.0f, false, 2, null), o0OOo000.f48173Oooo0oO, o0000O0.OooO0OO(13, composer2, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131056);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(o0O0O00.ic_close, composer2, 0);
            Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(rowScopeInstance.align(SizeKt.wrapContentWidth$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), null, false, 3, null), companion2.getCenterVertically()), Dp.m3775constructorimpl(16));
            composer2.startReplaceableGroup(1157296644);
            MutableState<Boolean> mutableState = this.f55727OooO0Oo;
            boolean zChanged = composer2.changed(mutableState);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new a3(mutableState);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            ImageKt.Image(painterPainterResource, (String) null, ClickableKt.m204clickableXHw0xAI$default(modifierM525size3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ State<Pair<Boolean, Integer>> f55728OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f55729OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(State<Pair<Boolean, Integer>> state, FragmentActivity fragmentActivity) {
            super(3);
            this.f55728OooO0Oo = state;
            this.f55729OooO0o0 = fragmentActivity;
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
                    ComposerKt.traceEventStart(-1771107627, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent.<anonymous>.<anonymous> (VehiclesScreen.kt:143)");
                }
                String strOooO0OO = o0000.OooO0OO(o000000.vehicle_mine_empty_hint);
                composer2.startReplaceableGroup(593354389);
                State<Pair<Boolean, Integer>> state = this.f55728OooO0Oo;
                Pair<Boolean, Integer> value = state.getValue();
                if (value != null) {
                    z = value.getFirst().booleanValue();
                }
                String strStringResource = z ? StringResources_androidKt.stringResource(o000000.Purchase_Now, composer2, 0) : o0000.OooO0OO(o000000.Get_Yalla_Premium);
                composer2.endReplaceableGroup();
                oOO00O.OooO00o(strOooO0OO, 0, 0.0f, strStringResource, null, false, null, new b3(state, this.f55729OooO0o0), null, composer2, 0, 374);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nVehiclesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,361:1\n154#2:362\n154#2:363\n154#2:364\n*S KotlinDebug\n*F\n+ 1 VehiclesScreen.kt\ncom/yalla/yalla/ui/screen/user/VehiclesScreenKt$MyVehiclesContent$2$4\n*L\n163#1:362\n164#1:363\n165#1:364\n*E\n"})
    public static final class OooO0o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOOOO<ShopVehicleListModel> f55730OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f55731OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ UserOutFitVM f55732OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f55733OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooOOOO<ShopVehicleListModel> oooOOOO, UserOutFitVM userOutFitVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(3);
            this.f55730OooO0Oo = oooOOOO;
            this.f55732OooO0o0 = userOutFitVM;
            this.f55731OooO0o = o0ooo0o1;
            this.f55733OooO0oO = lifecycleOwner;
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
                    ComposerKt.traceEventStart(600609239, iIntValue, -1, "com.yalla.yalla.ui.screen.user.MyVehiclesContent.<anonymous>.<anonymous> (VehiclesScreen.kt:160)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                PaddingValues paddingValuesM472PaddingValuesYgX7TsA = PaddingKt.m472PaddingValuesYgX7TsA(Dp.m3775constructorimpl(9), Dp.m3775constructorimpl(8));
                Arrangement arrangement = Arrangement.INSTANCE;
                float f = 1;
                LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, paddingValuesM472PaddingValuesYgX7TsA, false, arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), null, false, new e3(this.f55730OooO0Oo, this.f55732OooO0o0, this.f55731OooO0o, this.f55733OooO0oO), composer2, 1772592, 404);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55734OooO0Oo = new OooOO0();

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
        public final /* synthetic */ Context f55735OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Context context) {
            super(0);
            this.f55735OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f26673Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f55735OooO0Oo, PremiumLevel.Premium3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55736OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55737OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(MutableState<Boolean> mutableState, int i) {
            super(2);
            this.f55736OooO0Oo = mutableState;
            this.f55737OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55737OooO0o0 | 1);
            z2.OooO0O0(this.f55736OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f55738OooO0Oo = new OooOOO0();

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
            OooOOOO oooOOOOOooO00o = o00O0O.OooO00o(userOutFitVM.getMyVehiclesPager().f38501OooO0oo, composerStartRestartGroup);
            MutableState mutableState = (MutableState) RememberSaveableKt.m1333rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOO0.f55734OooO0Oo, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0oOo0O0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0oOo0O0 o0ooo0o1 = (o0oOo0O0) viewModel2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            OooO0O0(userOutFitVM.getShowPremiumBuyFrozenDialog(), composerStartRestartGroup, 0);
            y4.f59227OooO00o.OooO0O0(384, composerStartRestartGroup, userOutFitVM.getShowVehicleDialog(), userOutFitVM.getPicUrl());
            Observable<Object> observable = LiveEventBus.get("OUT_FIT_VEHICLES_REFRESH");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new o0O000O(oooOOOOOooO00o, 1), composerStartRestartGroup, 72);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48270o000o0Oo, null, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            AnimatedVisibilityKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, ((Boolean) mutableState.getValue()).booleanValue(), SemanticsModifierKt.semantics$default(companion, false, OooO00o.f55726OooO0Oo, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1689838803, true, new OooO0O0(mutableState)), composerStartRestartGroup, 1572870, 28);
            p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(p475o0Ooooo0.o0O00oO0.OooOO0o(), composerStartRestartGroup, 8);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1771107627, true, new OooO0OO(stateObserveAsState, (FragmentActivity) objConsume));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 600609239, true, new OooO0o(oooOOOOOooO00o, userOutFitVM, o0ooo0o1, lifecycleOwner));
            int i2 = OooOOOO.f35803OooO0o0;
            oo00o.OooO00o(oooOOOOOooO00o, null, lazyListStateRememberLazyListState, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236168, 186);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
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
                ComposerKt.traceEventStart(-478493561, i2, -1, "com.yalla.yalla.ui.screen.user.PremiumBuyFrozenDialog (VehiclesScreen.kt:350)");
            }
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(mutableState, o0000.OooO0OO(o000000.vehicle_mine_Vehicle_Frozen_title), o0000.OooO0OO(o000000.vehicle_mine_Vehicle_Frozen_content), null, false, false, null, null, o0000.OooO0OO(o000000.Get_Yalla_Premium), false, null, false, new OooOO0O((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null, false, false, null, OooOOO0.f55738OooO0Oo, null, null, composer2, i2 & 14, 12582912, 913144);
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

    public static final void OooO0OO(ShopVehicleListModel shopVehicleListModel, UserOutFitVM userOutFitVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-795938905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-795938905, i, -1, "com.yalla.yalla.ui.screen.user.ItemBubbleUseButton (VehiclesScreen.kt:200)");
        }
        if (shopVehicleListModel.getIsFreeze()) {
            i2 = o000000.vehicle_mine_Frozen;
        } else {
            i2 = shopVehicleListModel.isSelected() ? o000000.In_Use : o000000.Use;
        }
        float f = 8;
        o00O0OO0.OooO00o(o0000.OooO0OO(i2), o0000O0.OooO0OO(16, composerStartRestartGroup, 6), null, null, Color.m1671boximpl(o0OOo000.f48135OooO0O0), Color.m1671boximpl(shopVehicleListModel.getIsFreeze() ? o0OOo000.f48238o000O0Oo : o0OOo000.f48185Ooooo00), RoundedCornerShapeKt.m731RoundedCornerShapea9UjIt4$default(0.0f, 0.0f, Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), 3, null), 0.0f, null, false, false, 0L, false, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1824524455, true, new t2(shopVehicleListModel)), null, null, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3775constructorimpl(36)), new u2(shopVehicleListModel, userOutFitVM, o0ooo0o1, lifecycleOwner), composerStartRestartGroup, 0, 100859904, 229260);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new v2(shopVehicleListModel, userOutFitVM, o0ooo0o1, lifecycleOwner, i));
    }

    public static final void OooO0Oo(ShopVehicleListModel shopVehicleListModel, Function0 function0, Composer composer, int i) {
        Composer composer2;
        ComposeUiNode.Companion companion;
        Composer composer3;
        String strOooO0OO;
        Composer composerStartRestartGroup = composer.startRestartGroup(1829007362);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1829007362, i, -1, "com.yalla.yalla.ui.screen.user.ItemVehiclesInfo (VehiclesScreen.kt:248)");
        }
        Modifier.Companion companion2 = Modifier.INSTANCE;
        float f = 6;
        float f2 = 0;
        Modifier modifierM182borderxT4_qwU = BorderKt.m182borderxT4_qwU(SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(139)), Dp.m3775constructorimpl(1), shopVehicleListModel.isSelected() ? o0OOo000.f48185Ooooo00 : o0OOo000.f48134OooO00o, RoundedCornerShapeKt.m730RoundedCornerShapea9UjIt4(Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(f2), Dp.m3775constructorimpl(f2)));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(function0);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new w2(function0);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(modifierM182borderxT4_qwU, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 255);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion3, false, composerStartRestartGroup, 0, -1323940314);
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
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1673726637);
        if (shopVehicleListModel.getDayNum() <= 0 || shopVehicleListModel.getTimeLong() == -1) {
            composer2 = composerStartRestartGroup;
            companion = companion4;
        } else {
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            float f3 = 7;
            Modifier modifierM482paddingqDBjuR0$default = PaddingKt.m482paddingqDBjuR0$default(BackgroundKt.m170backgroundbw27NRU(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, Dp.m3775constructorimpl(f3), Dp.m3775constructorimpl(f3), 0.0f, 0.0f, 12, null), Dp.m3775constructorimpl(20)), o0OOo000.f48357o0O0ooO, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3775constructorimpl(4), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM482paddingqDBjuR0$default);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.user_ic_vehicle_limit_time_mine, composerStartRestartGroup, 0), (String) null, SizeKt.m525size3ABfNKs(companion2, Dp.m3775constructorimpl(11)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(2), null, composerStartRestartGroup, 6, 2);
            companion = companion4;
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(o0000O.OooO00o(o0000.OooO0OO(o000000.store_xxx_days), String.valueOf(shopVehicleListModel.getDayNum())), (Modifier) null, o0OOo000.f48212o0000OO, o0000O0.OooO0OO(11, composerStartRestartGroup, 6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131058);
            o0ooOOo.OooO00o(composer2);
        }
        composer2.endReplaceableGroup();
        Composer composer4 = composer2;
        float f4 = 7;
        ImageKt.Image(PainterResources_androidKt.painterResource(o0Oo0oo.user_ic_vehicle_play, composer4, 0), (String) null, boxScopeInstance.align(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, Dp.m3775constructorimpl(f4), Dp.m3775constructorimpl(f4), 0.0f, 9, null), Dp.m3775constructorimpl(20)), companion3.getTopEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 56, 120);
        ImageKt.Image(o000OO.OooO0OO(shopVehicleListModel.getPic(), x2.f55714OooO0Oo, composer4, 48, 0), "", boxScopeInstance.align(SizeKt.m530width3ABfNKs(SizeKt.m511height3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(29), 7, null), Dp.m3775constructorimpl(70)), Dp.m3775constructorimpl(110)), companion3.getBottomCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer4, 48, 120);
        composer4.startReplaceableGroup(-705759235);
        if (shopVehicleListModel.isTagVisible()) {
            boolean z = shopVehicleListModel.getVehicleTagType() == 10 || shopVehicleListModel.getVehicleTagType() == 11;
            Alignment center = companion3.getCenter();
            Modifier modifierM171backgroundbw27NRU$default = BackgroundKt.m171backgroundbw27NRU$default(boxScopeInstance.align(SizeKt.m513heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m3775constructorimpl(24), 0.0f, 2, null), companion3.getBottomCenter()), z ? o0OOo000.f48292o00O000 : o0OOo000.f48354o00oOoo, null, 2, null);
            composer4.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer4, 6);
            composer4.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM171backgroundbw27NRU$default);
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor3);
            } else {
                composer4.useNode();
            }
            Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer4);
            Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion, composerM1320constructorimpl3, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl3, currentCompositionLocalMap3);
            if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 0);
            composer4.startReplaceableGroup(2058660585);
            int nVehicleTagType = shopVehicleListModel.getNVehicleTagType();
            if (nVehicleTagType == 300) {
                strOooO0OO = o0000.OooO0OO(o000000.vehicle_store_tag_vip300);
            } else if (nVehicleTagType != 400) {
                strOooO0OO = nVehicleTagType != 500 ? "" : o0000.OooO0OO(o000000.vehicle_store_tag_vip5);
            } else {
                strOooO0OO = o0000.OooO0OO(o000000.vehicle_store_tag_vip400);
            }
            String str = strOooO0OO;
            long j = z ? o0OOo000.f48294o00O000o : o0OOo000.f48212o0000OO;
            int iM3681getCentere0LSkKk = TextAlign.INSTANCE.m3681getCentere0LSkKk();
            long jOooO0OO = o0000O0.OooO0OO(12, composer4, 6);
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion2, companion3.getCenter()), 0.0f, 1, null), null, false, 3, null);
            float f5 = 5;
            composer3 = composer4;
            TextKt.m1261Text4IGK_g(str, PaddingKt.m482paddingqDBjuR0$default(modifierWrapContentHeight$default, Dp.m3775constructorimpl(f5), 0.0f, Dp.m3775constructorimpl(f5), 0.0f, 10, null), j, jOooO0OO, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3674boximpl(iM3681getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 130544);
            o0ooOOo.OooO00o(composer3);
        } else {
            composer3 = composer4;
        }
        if (OooOo.OooO00o(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new y2(shopVehicleListModel, function0, i));
    }
}
