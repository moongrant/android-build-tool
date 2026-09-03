package com.yalla.yalla.ui.fragment.mainroom;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.animation.Oooo000;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
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
import androidx.compose.ui.unit.TextUnitKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o000Oo0;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0O0O00;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.manager.main.MainDialogManager$Link;
import com.yalla.yalla.ui.activity.store.ArrearsDetailActivity;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O.o0ooOOo;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO000o00;
import p415o0Oo0oO0.o00Ooo;
import p417o0Oo0oo0.o0000oo;
import p423o0OoO0OO.o00O00OO;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p492o0o00OO0.o0000O0;
import p492o0o00OO0.o0000O00;
import p492o0o00OO0.o0000O0O;
import p492o0o00OO0.o000OO;
import p527o0o0OO0o.o000O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0014J/\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0016R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR+\u0010)\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00060²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO000o00;", "", "initObserver", "initView", "resumeLeavePage", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "", ShareConstants.WEB_DIALOG_PARAM_TITLE, "", "isSelected", "Lkotlin/Function0;", "onClick", "TabItem", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "onStop", "Lcom/yalla/yalla/ui/vm/main/MainRoomVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/MainRoomVM;", "vm", "", "titles", "Ljava/util/List;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "fragments", "", "<set-?>", "currentSelectTab$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentSelectTab", "()I", "setCurrentSelectTab", "(I)V", "currentSelectTab", "<init>", "()V", "", "scaleAnimate", "Landroidx/compose/ui/graphics/Color;", "colorAnimate", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainRoomFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,280:1\n106#2,15:281\n81#3:296\n107#3,2:297\n81#3:346\n81#3:347\n36#4:299\n456#4,8:323\n464#4,3:337\n467#4,3:341\n1097#5,6:300\n154#6:306\n67#7,5:307\n72#7:340\n76#7:345\n78#8,11:312\n91#8:344\n4144#9,6:331\n*S KotlinDebug\n*F\n+ 1 MainRoomFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomFragment\n*L\n55#1:281,15\n143#1:296\n143#1:297,2\n245#1:346\n246#1:347\n241#1:299\n238#1:323,8\n238#1:337,3\n238#1:341,3\n241#1:300,6\n243#1:306\n238#1:307,5\n238#1:340\n238#1:345\n238#1:312,11\n238#1:344\n238#1:331,6\n*E\n"})
public final class MainRoomFragment extends o000O<oO000o00> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: currentSelectTab$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentSelectTab;

    @NotNull
    private final List<MainRoomBaseFragment<?>> fragments;
    private List<String> titles;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<Boolean, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            MainRoomFragment mainRoomFragment = MainRoomFragment.this;
            MainRoomVM vm = mainRoomFragment.getVm();
            Intrinsics.checkNotNull(bool2);
            vm.setLoginState(bool2.booleanValue());
            if (bool2.booleanValue()) {
                mainRoomFragment.resumeLeavePage();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(((MutableLiveData) o0O00oO0.f47938OooO0OO.getValue()).getValue(), Boolean.TRUE)) {
                    MainRoomVM.loadAll$default(mainRoomFragment.getVm(), MainDialogManager$Link.SignIn, false, 2, null);
                } else {
                    MainRoomVM.loadAll$default(mainRoomFragment.getVm(), null, false, 3, null);
                }
            } else {
                mainRoomFragment.getBinding().f44786OooO0o0.setCurrentItem(1);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f27895OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f27895OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f27895OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f27896OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f27898OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f27899OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f27900OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f27901OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f27899OooO0o0 = str;
            this.f27898OooO0o = z;
            this.f27900OooO0oO = function0;
            this.f27901OooO0oo = i;
            this.f27896OooO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MainRoomFragment.this.TabItem(this.f27899OooO0o0, this.f27898OooO0o, this.f27900OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f27901OooO0oo | 1), this.f27896OooO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            MutableState<Boolean> dialogShowBindYallaChatTips = MainRoomFragment.this.getVm().getDialogShowBindYallaChatTips();
            Intrinsics.checkNotNull(bool2);
            dialogShowBindYallaChatTips.setValue(bool2);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                MainRoomFragment.this.getVm().getDialogShowWelcome().setValue(bool2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
            Pair<? extends Boolean, ? extends Integer> pair2 = pair;
            boolean zBooleanValue = pair2.getFirst().booleanValue();
            MainRoomFragment mainRoomFragment = MainRoomFragment.this;
            if (!zBooleanValue || pair2.getSecond().intValue() <= 0) {
                LinearLayoutCompat llArrears = mainRoomFragment.getBinding().f44785OooO0Oo.f44818OooO0O0;
                Intrinsics.checkNotNullExpressionValue(llArrears, "llArrears");
                com.code.android.util.o000O.OooO0O0(llArrears);
            } else {
                mainRoomFragment.getBinding().f44785OooO0Oo.f44819OooO0OO.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.main_arrears_amount_tip), o00O00OO.OooO0O0(String.valueOf(pair2.getSecond().intValue()))));
                LinearLayoutCompat llArrears2 = mainRoomFragment.getBinding().f44785OooO0Oo.f44818OooO0O0;
                Intrinsics.checkNotNullExpressionValue(llArrears2, "llArrears");
                com.code.android.util.o000O.OooOOOO(llArrears2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooOO0O() {
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
                    ComposerKt.traceEventStart(-1312788596, iIntValue, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment.initView.<anonymous> (MainRoomFragment.kt:146)");
                }
                MainRoomFragment mainRoomFragment = MainRoomFragment.this;
                FragmentActivity activity = mainRoomFragment.getActivity();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && mainRoomFragment.getVm().isLoginState()) {
                    p536o0o0Oo00.OooO0o.f54473OooO00o.OooO0O0(activity, composer2, 56);
                    p536o0o0Oo00.OooO0OO.f54351OooO00o.OooO0O0(activity, composer2, 72);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements ViewPager.OooOOO0 {
        public OooOOO() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            MainRoomFragment.this.setCurrentSelectTab(i);
        }
    }

    @SourceDebugExtension({"SMAP\nMainRoomFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomFragment$initView$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,280:1\n66#2,6:281\n72#2:315\n76#2:363\n78#3,11:287\n78#3,11:323\n91#3:355\n91#3:362\n456#4,8:298\n464#4,3:312\n456#4,8:334\n464#4,3:348\n467#4,3:352\n467#4,3:359\n4144#5,6:306\n4144#5,6:342\n154#6:316\n154#6:357\n154#6:358\n73#7,6:317\n79#7:351\n83#7:356\n*S KotlinDebug\n*F\n+ 1 MainRoomFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomFragment$initView$2\n*L\n159#1:281,6\n159#1:315\n159#1:363\n159#1:287,11\n160#1:323,11\n160#1:355\n159#1:362\n159#1:298,8\n159#1:312,3\n160#1:334,8\n160#1:348,3\n160#1:352,3\n159#1:359,3\n159#1:306,6\n160#1:342,6\n163#1:316\n194#1:357\n195#1:358\n160#1:317,6\n160#1:351\n160#1:356\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooOOO0() {
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
                    ComposerKt.traceEventStart(-2040591869, iIntValue, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment.initView.<anonymous> (MainRoomFragment.kt:157)");
                }
                o0000oo.f46553OooO00o.OooO00o(composer2, 8);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MainRoomFragment mainRoomFragment = MainRoomFragment.this;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
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
                Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(48), 0.0f, Dp.m3775constructorimpl(40), 0.0f, 10, null), companion2.getCenter());
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOO0O.OooO00o(companion2, Arrangement.INSTANCE.getStart(), composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierAlign);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO00o2, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                mainRoomFragment.TabItem(StringResources_androidKt.stringResource(o000000.Mine, composer2, 0), mainRoomFragment.getCurrentSelectTab() == 0, new com.yalla.yalla.ui.fragment.mainroom.OooO00o(mainRoomFragment), composer2, 4096, 0);
                mainRoomFragment.TabItem(StringResources_androidKt.stringResource(o000000.tab_recommend, composer2, 0), mainRoomFragment.getCurrentSelectTab() == 1, new com.yalla.yalla.ui.fragment.mainroom.OooO0O0(mainRoomFragment), composer2, 4096, 0);
                mainRoomFragment.TabItem(StringResources_androidKt.stringResource(o000000.Popular, composer2, 0), mainRoomFragment.getCurrentSelectTab() == 2, new com.yalla.yalla.ui.fragment.mainroom.OooO0OO(mainRoomFragment), composer2, 4096, 0);
                o0ooOOo.OooO00o(composer2);
                IconKt.m1119Iconww6aTOc(PainterResources_androidKt.painterResource(o0Oo0oo.icv_search, composer2, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterEnd()), 0.0f, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 11, null), Dp.m3775constructorimpl(24)), false, false, 0L, false, null, null, new com.yalla.yalla.ui.fragment.mainroom.OooO0o(mainRoomFragment), new com.yalla.yalla.ui.fragment.mainroom.OooOO0(mainRoomFragment), 189), o0OOo000.f48135OooO0O0, composer2, 56, 0);
                if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainRoomFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomFragment$initView$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
    public static final class OooOOOO extends Lambda implements Function1<View, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0oo0000.OooO00o.OooO0O0("101019");
            Context context = MainRoomFragment.this.getContext();
            if (context != null) {
                int i = ArrearsDetailActivity.f26503OooOo0o;
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) ArrearsDetailActivity.class));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27909OooO0Oo;

        public OooOo00(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27909OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27909OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27909OooO0Oo;
        }

        public final int hashCode() {
            return this.f27909OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27909OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$1] */
    public MainRoomFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(MainRoomVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27913OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27913OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.fragments = new ArrayList();
        this.currentSelectTab = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
    }

    private static final float TabItem$lambda$10$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long TabItem$lambda$10$lambda$9(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentSelectTab() {
        return ((Number) this.currentSelectTab.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainRoomVM getVm() {
        return (MainRoomVM) this.vm.getValue();
    }

    private final void initObserver() {
        getActivity();
        MainRoomVM vm = getVm();
        Intrinsics.checkNotNullParameter(vm, "vm");
        int i = 2;
        LiveEventBus.get("RegionChange", Boolean.TYPE).observe(getViewLifecycleOwner(), new p492o0o00OO0.o0000(this, i));
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        ((MutableLiveData) o0O00oO0.f47938OooO0OO.getValue()).observe(getViewLifecycleOwner(), new OooOo00(new OooO0o()));
        o0O00oO0.OooOo0O().observe(getViewLifecycleOwner(), new OooOo00(new OooO()));
        Class cls = Integer.TYPE;
        int i2 = 1;
        LiveEventBus.get("MAIN_ROOM_PAGE", cls).observe(this, new o0000O00(this, i2));
        LiveEventBus.get("DISMISS_CLOCK_ICON").observe(this, new p492o0o00OO0.o0000oo(this, i2));
        LiveEventBus.get("SHOW_CLOCK_ANIMATION").observe(this, new o0000O0(this, i));
        LiveEventBus.get("SHOW_CLOCK_ICON").observe(this, new o0000O0O(this, i));
        ((MutableLiveData) o0O00oO0.f47970Oooo00o.getValue()).observe(this, new OooOo00(new OooOO0()));
        LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE", cls).observe(this, new o000OO(this, i));
        ((MutableLiveData) o0O00oO0.f47983OoooOOo.getValue()).observe(this, new OooOo00(new OooO0OO()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$0(MainRoomFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MainRoomVM.loadAll$default(this$0.getVm(), null, true, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$1(MainRoomFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RtlViewPager rtlViewPager = this$0.getBinding().f44786OooO0o0;
        Intrinsics.checkNotNull(num);
        rtlViewPager.setCurrentItem(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$2(MainRoomFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVm().setCheckVisibility(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$3(MainRoomFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVm().setCheckVisibility(false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$4(MainRoomFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVm().setCheckVisibility(true, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$6(MainRoomFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num == null) {
            return;
        }
        int currentItem = this$0.getBinding().f44786OooO0o0.getCurrentItem();
        RtlViewPager rtlViewPager = this$0.getBinding().f44786OooO0o0;
        if (currentItem < 0 || currentItem > 2) {
            currentItem = 0;
        }
        rtlViewPager.setCurrentItem(currentItem);
    }

    private final void initView() {
        ComposeView composeSideTask = getBinding().f44783OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeSideTask, "composeSideTask");
        p193o00o0O0O.o0000oo.OooO0Oo(composeSideTask, ComposableLambdaKt.composableLambdaInstance(-1312788596, true, new OooOO0O()));
        ComposeView composeView = getBinding().f44784OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        p193o00o0O0O.o0000oo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-2040591869, true, new OooOOO0()));
        getBinding().f44786OooO0o0.OooO0O0(new OooOOO());
        LinearLayoutCompat llArrears = getBinding().f44785OooO0Oo.f44818OooO0O0;
        Intrinsics.checkNotNullExpressionValue(llArrears, "llArrears");
        com.code.android.util.o000O.OooO(llArrears, new OooOOOO());
        this.fragments.add(new MainRoomMineFragment());
        this.fragments.add(new MainRoomRecommendFragment());
        this.fragments.add(new MainRoomPopularFragment());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        getBinding().f44786OooO0o0.setAdapter(new oO0o0000(childFragmentManager, this.fragments));
        getBinding().f44786OooO0o0.setOffscreenPageLimit(2);
        this.titles = CollectionsKt.mutableListOf(o0000.OooO0OO(o000000.Mine), o0000.OooO0OO(o000000.tab_recommend), o0000.OooO0OO(o000000.Popular));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resumeLeavePage() {
        int iOooOOO = o00Ooo.OooOO0o().OooOOO();
        if (iOooOOO == 0 || iOooOOO == 1 || iOooOOO == 2) {
            getBinding().f44786OooO0o0.setCurrentItem(0);
        } else if (iOooOOO == 3) {
            getBinding().f44786OooO0o0.setCurrentItem(1);
        } else if (iOooOOO == 4) {
            getBinding().f44786OooO0o0.setCurrentItem(2);
        }
        setCurrentSelectTab(getBinding().f44786OooO0o0.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSelectTab(int i) {
        this.currentSelectTab.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x011b  */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x014f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:71:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TabItem(@NotNull String title, boolean z, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1320constructorimpl;
        Function2 function2OooO00o;
        float f;
        long j;
        Composer composer2;
        boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1716476500);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 112) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1716476500, i5, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment.TabItem (MainRoomFragment.kt:236)");
                }
                Alignment center = Alignment.INSTANCE.getCenter();
                Modifier.Companion companion = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(onClick);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO00o(onClick);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOooO00o = p454o0Ooo000.OooOo00.OooO00o(8, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (z3) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                int i7 = o0OOo000.f48347o00OOooO;
                if (z3) {
                    j = o0OOo000.f48135OooO0O0;
                } else {
                    j = o0OOo000.f48147OooOOOO;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(title, ScaleKt.scale(companion, TabItem$lambda$10$lambda$8(stateAnimateFloatAsState)), TabItem$lambda$10$lambda$9(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 199680, 0, 131024);
                if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z4 = z2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(title, z4, onClick, i, i2));
        }
        i3 |= 48;
        z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i4 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 731) == 146) {
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1716476500, i5, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment.TabItem (MainRoomFragment.kt:236)");
            }
            Alignment center2 = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO00o2 = p454o0Ooo000.OooOo00.OooO00o(8, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1320constructorimpl, currentCompositionLocalMap2);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (z3) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            int i8 = o0OOo000.f48347o00OOooO;
            if (z3) {
                j = o0OOo000.f48135OooO0O0;
            } else {
                j = o0OOo000.f48147OooOOOO;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(title, ScaleKt.scale(companion3, TabItem$lambda$10$lambda$8(stateAnimateFloatAsState2)), TabItem$lambda$10$lambda$9(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 199680, 0, 131024);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
        } else {
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1716476500, i5, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment.TabItem (MainRoomFragment.kt:236)");
            }
            Alignment center3 = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(onClick);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new OooO00o(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new OooO00o(onClick);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOooO00o3 = p454o0Ooo000.OooOo00.OooO00o(8, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1320constructorimpl, currentCompositionLocalMap3);
            if (composerM1320constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            if (z3) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            int i9 = o0OOo000.f48347o00OOooO;
            if (z3) {
                j = o0OOo000.f48135OooO0O0;
            } else {
                j = o0OOo000.f48147OooOOOO;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(title, ScaleKt.scale(companion5, TabItem$lambda$10$lambda$8(stateAnimateFloatAsState3)), TabItem$lambda$10$lambda$9(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i5 & 14) | 199680, 0, 131024);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(title, z4, onClick, i, i2));
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        getVm().getDateFormat().setTimeZone(TimeZone.getTimeZone("GMT+02"));
        initView();
        initObserver();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (!Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE) || this.fragments.size() <= 0) {
            return;
        }
        int currentItem = getBinding().f44786OooO0o0.getCurrentItem();
        if (currentItem == 0) {
            this.fragments.get(getBinding().f44786OooO0o0.getCurrentItem()).saveLeavePage();
        } else if (currentItem == 1) {
            o00Ooo.OooOO0o().OooOOo0(3);
        } else {
            if (currentItem != 2) {
                return;
            }
            o00Ooo.OooOO0o().OooOOo0(4);
        }
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO000o00 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO000o00 oo000o00Inflate = oO000o00.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(oo000o00Inflate, "inflate(...)");
        return oo000o00Inflate;
    }
}
