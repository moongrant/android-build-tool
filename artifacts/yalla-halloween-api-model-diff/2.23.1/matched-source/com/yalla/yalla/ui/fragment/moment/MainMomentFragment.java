package com.yalla.yalla.ui.fragment.moment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.code.android.util.o000O;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.MainPage;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicCreateCheckModel;
import com.yalla.yalla.model.topic.TopicState;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.activity.moment.TopicCreateCheckActivity;
import com.yalla.yalla.ui.activity.moment.TopicReviewActivity;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p196o00o0OOO.o00O00o0;
import p270o00oooo0.o0O0OO0;
import p407o0Oo0OOO.o0OO000;
import p425o0OoO0OO.o000OOo0;
import p425o0OoO0OO.o00O0000;
import p474o0OoooOO.oo0oO0;
import p477o0Ooooo0.o0O0o;
import p519o0o0O0O.o00OO00O;
import p527o0o0OO0.o00OO0O0;
import p587o0oOooO.oO00OOo0;
import p587o0oOooO.oOOO0OO0;
import p588o0oOooO0.o0oO0O0o;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0014J\b\u0010\u0016\u001a\u00020\u0005H\u0016J3\u0010\u001d\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R+\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00067²\u0006\f\u00104\u001a\u0002038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u0002058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/yalla/yalla/ui/fragment/moment/MainMomentFragment;", "Lo0o0OO0/o00OO0O0;", "Lo0Oo0OOO/o0OO000;", "", "isClick", "", "checkTopicState", "initView", "changeCreateImageButtonState", "initObserver", "uploadMomentStatisticalTime", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "onResume", "Landroidx/compose/foundation/layout/RowScope;", "", ShareConstants.WEB_DIALOG_PARAM_TITLE, "isSelected", "Lkotlin/Function0;", "onClick", "TabItem", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "vm", "Lcom/yalla/yalla/model/topic/TopicState;", "topicState", "Lcom/yalla/yalla/model/topic/TopicState;", "", "<set-?>", "currentSelectTab$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentSelectTab", "()I", "setCurrentSelectTab", "(I)V", "currentSelectTab", "<init>", "()V", "", "scaleAnimate", "Landroidx/compose/ui/graphics/Color;", "colorAnimate", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainMomentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,344:1\n106#2,15:345\n81#3:360\n107#3,2:361\n81#3:410\n81#3:411\n36#4:363\n456#4,8:387\n464#4,3:401\n467#4,3:405\n1097#5,6:364\n154#6:370\n67#7,5:371\n72#7:404\n76#7:409\n78#8,11:376\n91#8:408\n4144#9,6:395\n*S KotlinDebug\n*F\n+ 1 MainMomentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFragment\n*L\n69#1:345,15\n137#1:360\n137#1:361,2\n250#1:410\n254#1:411\n245#1:363\n242#1:387,8\n242#1:401,3\n242#1:405,3\n245#1:364,6\n248#1:370\n242#1:371,5\n242#1:404\n242#1:409\n242#1:376,11\n242#1:408\n242#1:395,6\n*E\n"})
public final class MainMomentFragment extends o00OO0O0<o0OO000> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: currentSelectTab$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentSelectTab;

    @Nullable
    private TopicState topicState;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    @SourceDebugExtension({"SMAP\nMainMomentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFragment$initView$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,344:1\n66#2,6:345\n72#2:379\n76#2:425\n78#3,11:351\n78#3,11:387\n91#3:419\n91#3:424\n456#4,8:362\n464#4,3:376\n456#4,8:398\n464#4,3:412\n467#4,3:416\n467#4,3:421\n4144#5,6:370\n4144#5,6:406\n154#6:380\n73#7,6:381\n79#7:415\n83#7:420\n*S KotlinDebug\n*F\n+ 1 MainMomentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFragment$initView$2\n*L\n165#1:345,6\n165#1:379\n165#1:425\n165#1:351,11\n166#1:387,11\n166#1:419\n165#1:424\n165#1:362,8\n165#1:376,3\n166#1:398,8\n166#1:412,3\n166#1:416,3\n165#1:421,3\n165#1:370,6\n166#1:406,6\n169#1:380\n166#1:381,6\n166#1:415\n166#1:420\n*E\n"})
    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentListFeaturedFragment f28097OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainMomentFollowingFragment f28098OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MainMomentTopicFragment f28099OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MainMomentFollowingFragment mainMomentFollowingFragment, MomentListFeaturedFragment momentListFeaturedFragment, MainMomentTopicFragment mainMomentTopicFragment) {
            super(2);
            this.f28098OooO0o0 = mainMomentFollowingFragment;
            this.f28097OooO0o = momentListFeaturedFragment;
            this.f28099OooO0oO = mainMomentTopicFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1499735689, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFragment.initView.<anonymous> (MainMomentFragment.kt:164)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MainMomentFragment mainMomentFragment = MainMomentFragment.this;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
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
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                Modifier modifierAlign = BoxScopeInstance.INSTANCE.align(PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(48), 0.0f, Dp.m3775constructorimpl(16), 0.0f, 10, null), companion2.getCenter());
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
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                mainMomentFragment.TabItem(rowScopeInstance, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.moments_following, composer2, 0), mainMomentFragment.getCurrentSelectTab() == 0, new o0OoOo0(mainMomentFragment, this.f28098OooO0o0), composer2, 32774, 0);
                mainMomentFragment.TabItem(rowScopeInstance, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.Featured, composer2, 0), mainMomentFragment.getCurrentSelectTab() == 1, new o00O0O(mainMomentFragment, this.f28097OooO0o), composer2, 32774, 0);
                mainMomentFragment.TabItem(rowScopeInstance, StringResources_androidKt.stringResource(p565o0oOo000.o000OOo.Topics, composer2, 0), mainMomentFragment.getCurrentSelectTab() == 2, new o00Oo0(mainMomentFragment, this.f28099OooO0oO), composer2, 32774, 0);
                if (o00O00o0.OooO00o(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28100OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f28100OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28100OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f28101OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f28103OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RowScope f28104OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f28105OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28106OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f28107OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RowScope rowScope, String str, boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f28104OooO0o0 = rowScope;
            this.f28103OooO0o = str;
            this.f28105OooO0oO = z;
            this.f28106OooO0oo = function0;
            this.f28101OooO = i;
            this.f28107OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MainMomentFragment.this.TabItem(this.f28104OooO0o0, this.f28103OooO0o, this.f28105OooO0oO, this.f28106OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28101OooO | 1), this.f28107OooOO0);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TopicState.values().length];
            try {
                iArr[TopicState.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TopicState.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TopicState.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nMainMomentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainMomentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFragment$initView$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,344:1\n66#2,6:345\n72#2:379\n76#2:385\n78#3,11:351\n91#3:384\n456#4,8:362\n464#4,3:376\n467#4,3:381\n4144#5,6:370\n154#6:380\n*S KotlinDebug\n*F\n+ 1 MainMomentFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MainMomentFragment$initView$1\n*L\n148#1:345,6\n148#1:379\n148#1:385\n148#1:351,11\n148#1:384\n148#1:362,8\n148#1:376,3\n148#1:381,3\n148#1:370,6\n152#1:380\n*E\n"})
    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO0o() {
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
                    ComposerKt.traceEventStart(2134507712, iIntValue, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFragment.initView.<anonymous> (MainMomentFragment.kt:145)");
                }
                FragmentActivity activity = MainMomentFragment.this.getActivity();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    composer2.startReplaceableGroup(733328855);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
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
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                    o00OO00O.f52263OooO00o.OooO00o(PaddingKt.m482paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getBottomEnd()), 0.0f, 0.0f, Dp.m3775constructorimpl(6), Dp.m3775constructorimpl(38), 3, null), new o000oOoO(activity), composer2, 384, 0);
                    o00O00OO.OooO0O0(composer2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements ViewPager.OooOOO0 {
        public OooOO0() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            MainMomentFragment mainMomentFragment = MainMomentFragment.this;
            mainMomentFragment.setCurrentSelectTab(i);
            mainMomentFragment.changeCreateImageButtonState();
            if (mainMomentFragment.topicState == null) {
                MainMomentFragment.checkTopicState$default(mainMomentFragment, false, 1, null);
            }
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            h0.OooO0O0("103021");
            Context context = MainMomentFragment.this.getContext();
            if (context != null) {
                int i = MomentMessageListActivity.f25669OooOoOO;
                MomentMessageListActivity.OooO00o.OooO00o(context);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28111OooO0Oo;

        public OooOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28111OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28111OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28111OooO0Oo;
        }

        public final int hashCode() {
            return this.f28111OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28111OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Integer, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int i;
            Integer num2 = num;
            LinearLayout linearLayout = MainMomentFragment.this.getBinding().f44552OooO0Oo;
            oOOO0OO0 oooo0oo0 = oOOO0OO0.f56825OooO00o;
            Intrinsics.checkNotNull(num2);
            int iIntValue = num2.intValue();
            MutableLiveData<Integer> mutableLiveData = p431o0OoOO.OooOo00.f46776OooO00o;
            int i2 = oOOO0OO0.OooO0O0.$EnumSwitchMapping$0[p431o0OoOO.OooOo00.OooO00o(Integer.valueOf(iIntValue)).ordinal()];
            if (i2 == 1) {
                i = p565o0oOo000.oo0o0Oo.ic_moment_top_notice_bg;
            } else if (i2 == 2) {
                i = p565o0oOo000.oo0o0Oo.ic_moment_top_notice_bg_seven_ramdan;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = p565o0oOo000.oo0o0Oo.ic_moment_top_notice_bg_seven_year;
            }
            linearLayout.setBackgroundResource(i);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<ApiResult<Object>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f28113OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<Object> apiResult) {
            o0O0OO0.OooO0O0().OooO0Oo(0L, "MOMENT_STATISTICAL_TIME");
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.moment.MainMomentFragment$special$$inlined$viewModels$default$1] */
    public MainMomentFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(BaseMomentDetailVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28117OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28117OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.moment.MainMomentFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.currentSelectTab = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
    }

    private static final float TabItem$lambda$6$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long TabItem$lambda$6$lambda$5(State<Color> state) {
        return state.getValue().m1691unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeCreateImageButtonState() {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        T value = oo0oO0.OooOo0O().getValue();
        Boolean bool = Boolean.FALSE;
        if (!Intrinsics.areEqual(value, bool) && getBinding().f44553OooO0o.getCurrentItem() == 2) {
            if (this.topicState == null && Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), bool)) {
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(Boolean.TRUE);
                return;
            }
            TopicState topicState = this.topicState;
            int i = topicState == null ? -1 : OooO0OO.$EnumSwitchMapping$0[topicState.ordinal()];
            if (i == -1) {
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(bool);
                return;
            }
            if (i == 1) {
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(Boolean.TRUE);
            } else if (i == 2) {
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(Boolean.TRUE);
            } else {
                if (i != 3) {
                    return;
                }
                LiveEventBus.get("TOPIC_CREATE_VIEW_VISIBLE").post(bool);
            }
        }
    }

    private final void checkTopicState(final boolean isClick) {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.FALSE)) {
            return;
        }
        getVm().checkTopicState().observe(getViewLifecycleOwner(), new Observer() { // from class: o0o0OO.Oooo0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainMomentFragment.checkTopicState$lambda$2(this.f53263OooO0Oo, isClick, (Response) obj);
            }
        });
    }

    public static /* synthetic */ void checkTopicState$default(MainMomentFragment mainMomentFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        mainMomentFragment.checkTopicState(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkTopicState$lambda$2(MainMomentFragment this$0, boolean z, Response response) {
        Context context;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!response.getIsSuccess()) {
            this$0.changeCreateImageButtonState();
            return;
        }
        TopicCreateCheckModel topicCreateCheckModel = (TopicCreateCheckModel) response.getData();
        if (topicCreateCheckModel != null) {
            this$0.topicState = topicCreateCheckModel.getTopicState();
            this$0.changeCreateImageButtonState();
            if (z && (context = this$0.getContext()) != null) {
                TopicState topicState = this$0.topicState;
                int i = topicState == null ? -1 : OooO0OO.$EnumSwitchMapping$0[topicState.ordinal()];
                Boolean boolValueOf3 = null;
                if (i == 1) {
                    int i2 = TopicCreateCheckActivity.f25846OooOo0;
                    Intrinsics.checkNotNull(context);
                    Integer userLevel = topicCreateCheckModel.getUserLevel();
                    if (userLevel != null) {
                        boolValueOf = Boolean.valueOf(userLevel.intValue() == 1);
                    } else {
                        boolValueOf = null;
                    }
                    Integer regTime = topicCreateCheckModel.getRegTime();
                    if (regTime != null) {
                        boolValueOf2 = Boolean.valueOf(regTime.intValue() == 1);
                    } else {
                        boolValueOf2 = null;
                    }
                    Integer keepLaw = topicCreateCheckModel.getKeepLaw();
                    if (keepLaw != null) {
                        boolValueOf3 = Boolean.valueOf(keepLaw.intValue() == 1);
                    }
                    TopicCreateCheckActivity.OooO00o.OooO00o(context, boolValueOf, boolValueOf2, boolValueOf3);
                    return;
                }
                if (i == 2) {
                    int i3 = TopicReviewActivity.f25947OooOo00;
                    Intrinsics.checkNotNull(context);
                    Intrinsics.checkNotNullParameter(context, "context");
                    context.startActivity(new Intent(context, (Class<?>) TopicReviewActivity.class));
                    return;
                }
                if (i != 3) {
                    return;
                }
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.topic_exist);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        com.code.android.util.o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                    }
                }
                LiveEventBus.get("TOPIC_TO_CREATED").post(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentSelectTab() {
        return ((Number) this.currentSelectTab.getValue()).intValue();
    }

    private final BaseMomentDetailVM getVm() {
        return (BaseMomentDetailVM) this.vm.getValue();
    }

    private final void initObserver() {
        LiveData<Integer> unreadMomentsMessageCount = SharedMessageVM.INSTANCE.getUnreadMomentsMessageCount();
        Intrinsics.checkNotNull(unreadMomentsMessageCount);
        int i = 2;
        unreadMomentsMessageCount.observe(getViewLifecycleOwner(), new p459o0Ooo0O.o0000oo(i, this));
        LiveEventBus.get("MESSAGE_TOPIC_STATE_CHANGE").observe(this, new p459o0Ooo0O.o0000O0(1, this));
        LiveEventBus.get("TOPIC_CREATE_CHECK").observe(this, new o000OOo0(this, 3));
        LiveEventBus.get("TOPIC_CREATE_CHECK_CLICK", Boolean.TYPE).observe(this, new o00O0000(this, i));
        LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE", Integer.TYPE).observeSticky(this, new Observer() { // from class: o0o0OO.o000oOoO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainMomentFragment.initObserver$lambda$11(this.f53266OooO0Oo, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$10(MainMomentFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkTopicState(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$11(MainMomentFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == MainPage.MomentFollowingPage.getValue()) {
            this$0.getBinding().f44553OooO0o.setCurrentItem(0);
        } else if (iIntValue == MainPage.MomentFeaturedPage.getValue()) {
            this$0.getBinding().f44553OooO0o.setCurrentItem(1);
        } else if (iIntValue == MainPage.MomentTopicsPage.getValue()) {
            this$0.getBinding().f44553OooO0o.setCurrentItem(2);
        }
        this$0.setCurrentSelectTab(this$0.getBinding().f44553OooO0o.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$7(MainMomentFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.getBinding().f44554OooO0o0;
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.moment_notice_XXX);
        boolean z = true;
        String[] strArr = new String[1];
        strArr[0] = String.valueOf(num == null ? 0 : num.intValue());
        textView.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr));
        LinearLayout llMainMomentNotice = this$0.getBinding().f44552OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(llMainMomentNotice, "llMainMomentNotice");
        if (num != null && num.intValue() == 0) {
            z = false;
        }
        o000O.OooOOO0(llMainMomentNotice, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$8(MainMomentFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        checkTopicState$default(this$0, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initObserver$lambda$9(MainMomentFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        checkTopicState$default(this$0, false, 1, null);
    }

    private final void initView() {
        oO00OOo0.OooO0oO();
        MainMomentFollowingFragment mainMomentFollowingFragment = new MainMomentFollowingFragment();
        MomentListFeaturedFragment momentListFeaturedFragment = new MomentListFeaturedFragment();
        MainMomentTopicFragment mainMomentTopicFragment = new MainMomentTopicFragment();
        List listMutableListOf = CollectionsKt.mutableListOf(mainMomentFollowingFragment, momentListFeaturedFragment, mainMomentTopicFragment);
        ComposeView composeMomentCreate = getBinding().f44550OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeMomentCreate, "composeMomentCreate");
        p193o00o0O0O.o0000oo.OooO0Oo(composeMomentCreate, ComposableLambdaKt.composableLambdaInstance(2134507712, true, new OooO0o()));
        ComposeView composeView = getBinding().f44551OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
        p193o00o0O0O.o0000oo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-1499735689, true, new OooO(mainMomentFollowingFragment, momentListFeaturedFragment, mainMomentTopicFragment)));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        getBinding().f44553OooO0o.setAdapter(new o0oO0O0o(childFragmentManager, listMutableListOf));
        getBinding().f44553OooO0o.setOffscreenPageLimit(listMutableListOf.size() - 1);
        getBinding().f44553OooO0o.OooO0O0(new OooOO0());
        LinearLayout llMainMomentNotice = getBinding().f44552OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(llMainMomentNotice, "llMainMomentNotice");
        o000O.OooO(llMainMomentNotice, new OooOO0O());
        p487o0o000oO.o0000 o0000VarOooO0O0 = o0O0OO0.OooO0O0();
        o0000VarOooO0O0.getClass();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (o0000VarOooO0O0.OooO0O0("FIRST_FEATURED_MOMENT_FOR_NEW_USER".concat(String.valueOf(oo0oO0.OooOOo0().getValue())), true)) {
            getBinding().f44553OooO0o.setCurrentItem(1);
            p487o0o000oO.o0000 o0000VarOooO0O1 = o0O0OO0.OooO0O0();
            o0000VarOooO0O1.getClass();
            o0000VarOooO0O1.OooO0o("FIRST_FEATURED_MOMENT_FOR_NEW_USER".concat(String.valueOf(oo0oO0.OooOOo0().getValue())), false);
            return;
        }
        p487o0o000oO.o0000 o0000VarOooO0O2 = o0O0OO0.OooO0O0();
        o0000VarOooO0O2.getClass();
        if (o0000VarOooO0O2.OooO0O0("FIRST_RECOMMEND_TOPIC".concat(String.valueOf(oo0oO0.OooOOo0().getValue())), true)) {
            getBinding().f44553OooO0o.setCurrentItem(2);
        } else {
            int lastLeaveMomentPage = getVm().getLastLeaveMomentPage();
            if (lastLeaveMomentPage == 0) {
                getBinding().f44553OooO0o.setCurrentItem(0);
            } else if (lastLeaveMomentPage == 1) {
                getBinding().f44553OooO0o.setCurrentItem(1);
            } else if (lastLeaveMomentPage == 2 || lastLeaveMomentPage == 3) {
                getBinding().f44553OooO0o.setCurrentItem(2);
            }
        }
        setCurrentSelectTab(getBinding().f44553OooO0o.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSelectTab(int i) {
        this.currentSelectTab.setValue(Integer.valueOf(i));
    }

    private final void uploadMomentStatisticalTime() {
        SharedPreferences sharedPreferences = o0O0OO0.OooO0O0().f48716OooO00o;
        getVm().momentsDurationAdd(sharedPreferences != null ? sharedPreferences.getLong("MOMENT_STATISTICAL_TIME", 0L) : 0L).observe(getViewLifecycleOwner(), new OooOOO(OooOOOO.f28113OooO0Oo));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:66:0x014b  */
    /* JADX WARN: Code duplicated, block: B:67:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0160  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x021c  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TabItem(@NotNull RowScope rowScope, @NotNull String title, boolean z, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i, int i2) {
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
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1031038240);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
            }
            if ((i2 & 4) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i4 = 2048;
                } else {
                    i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((i5 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i6 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1031038240, i5, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFragment.TabItem (MainMomentFragment.kt:240)");
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
                Modifier modifierOooO0O0 = com.app.base.protobuf.OooO0O0.OooO0O0(8, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.fillMaxHeight$default(com.code.android.util.o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (z3) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                int i7 = o0O0o.f48305o00OOooO;
                if (z3) {
                    j = o0O0o.f48093OooO0O0;
                } else {
                    j = o0O0o.f48105OooOOOO;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m1261Text4IGK_g(title, ScaleKt.scale(companion, TabItem$lambda$6$lambda$4(stateAnimateFloatAsState)), TabItem$lambda$6$lambda$5(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(500, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i5 >> 3) & 14) | 199680, 0, 131024);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, title, z4, onClick, i, i2));
        }
        i3 |= 384;
        z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i4 = 2048;
            } else {
                i4 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i4;
        }
        i5 = i3;
        if ((i5 & 5851) == 1170) {
            if (i6 != 0) {
                z3 = false;
            } else {
                z3 = z2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1031038240, i5, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFragment.TabItem (MainMomentFragment.kt:240)");
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
            Modifier modifierOooO0O1 = com.app.base.protobuf.OooO0O0.OooO0O0(8, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.fillMaxHeight$default(com.code.android.util.o0O0O00.OooO0O0(companion3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
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
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            if (z3) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            int i8 = o0O0o.f48305o00OOooO;
            if (z3) {
                j = o0O0o.f48093OooO0O0;
            } else {
                j = o0O0o.f48105OooOOOO;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(title, ScaleKt.scale(companion3, TabItem$lambda$6$lambda$4(stateAnimateFloatAsState2)), TabItem$lambda$6$lambda$5(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(500, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i5 >> 3) & 14) | 199680, 0, 131024);
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
                ComposerKt.traceEventStart(-1031038240, i5, -1, "com.yalla.yalla.ui.fragment.moment.MainMomentFragment.TabItem (MainMomentFragment.kt:240)");
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
            Modifier modifierOooO0O2 = com.app.base.protobuf.OooO0O0.OooO0O0(8, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.fillMaxHeight$default(com.code.android.util.o0O0O00.OooO0O0(companion5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O2);
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
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            if (z3) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            int i9 = o0O0o.f48305o00OOooO;
            if (z3) {
                j = o0O0o.f48093OooO0O0;
            } else {
                j = o0O0o.f48105OooOOOO;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1261Text4IGK_g(title, ScaleKt.scale(companion5, TabItem$lambda$6$lambda$4(stateAnimateFloatAsState3)), TabItem$lambda$6$lambda$5(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(500, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i5 >> 3) & 14) | 199680, 0, 131024);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, title, z4, onClick, i, i2));
    }

    @Override // p588o0oOooO0.o0O0O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initObserver();
        checkTopicState$default(this, false, 1, null);
    }

    @Override // p527o0o0OO0.o00OO0O0, p588o0oOooO0.o0O0O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        changeCreateImageButtonState();
        uploadMomentStatisticalTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MutableLiveData<Integer> mutableLiveData = p431o0OoOO.OooOo00.f46776OooO00o;
        p431o0OoOO.OooOo00.f46776OooO00o.observe(getViewLifecycleOwner(), new OooOOO(new OooOOO0()));
    }

    @Override // p527o0o0OO0.o00OO0O0
    @NotNull
    public o0OO000 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0OO000 o0oo000Inflate = o0OO000.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o0oo000Inflate, "inflate(...)");
        return o0oo000Inflate;
    }
}
