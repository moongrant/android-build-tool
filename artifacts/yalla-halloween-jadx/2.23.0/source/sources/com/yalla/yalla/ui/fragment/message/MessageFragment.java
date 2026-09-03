package com.yalla.yalla.ui.fragment.message;

import android.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
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
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.code.android.util.o0000Ooo;
import com.code.android.util.o0O0O00;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.service.im.IMMessageService;
import com.yalla.yalla.ui.fragment.FriendListFragment;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p379o0OOoo.OooOOOO;
import p401o0Oo0OO0.o00Oo0;
import p426o0OoOO.o000oOoO;
import p445o0OoOoo.o0oOO;
import p469o0OoooOO.o0oO0O0o;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.h5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\b\u0010\f\u001a\u00020\u0003H\u0016J9\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR+\u0010&\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R+\u0010-\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010!\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/yalla/yalla/ui/fragment/message/MessageFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/h5;", "", "updateNavigatorDot", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "", ShareConstants.WEB_DIALOG_PARAM_TITLE, "", "isSelected", "showRedDot", "Lkotlin/Function0;", "onClick", "TabItem", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lo0Oo0OO0/o00Oo0;", "fragmentPagerAdapter", "Lo0Oo0OO0/o00Oo0;", "Lcom/yalla/yalla/ui/fragment/message/MessageListFragment;", "messageListFragment", "Lcom/yalla/yalla/ui/fragment/message/MessageListFragment;", "Lcom/yalla/yalla/ui/fragment/FriendListFragment;", "friendsListFragment", "Lcom/yalla/yalla/ui/fragment/FriendListFragment;", "<set-?>", "showMessageRedDot$delegate", "Landroidx/compose/runtime/MutableState;", "getShowMessageRedDot", "()Z", "setShowMessageRedDot", "(Z)V", "showMessageRedDot", "", "currentSelectTab$delegate", "getCurrentSelectTab", "()I", "setCurrentSelectTab", "(I)V", "currentSelectTab", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMessageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageFragment\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,173:1\n81#2:174\n107#2,2:175\n81#2:177\n107#2,2:178\n81#2:229\n81#2:230\n36#3:180\n456#3,8:204\n464#3,3:218\n467#3,3:224\n1097#4,6:181\n154#5:187\n164#5:222\n154#5:223\n67#6,5:188\n72#6:221\n76#6:228\n78#7,11:193\n91#7:227\n4144#8,6:212\n*S KotlinDebug\n*F\n+ 1 MessageFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageFragment\n*L\n70#1:174\n70#1:175,2\n85#1:177\n85#1:178,2\n159#1:229\n160#1:230\n155#1:180\n152#1:204,8\n152#1:218,3\n152#1:224,3\n155#1:181,6\n157#1:187\n168#1:222\n168#1:223\n152#1:188,5\n152#1:221\n152#1:228\n152#1:193,11\n152#1:227\n152#1:212,6\n*E\n"})
public final class MessageFragment extends p508o0o0O.OooOO0O<h5> {
    public static final int $stable = 8;

    @Nullable
    private o00Oo0 fragmentPagerAdapter;

    @Nullable
    private FriendListFragment friendsListFragment;

    @Nullable
    private MessageListFragment messageListFragment;

    /* JADX INFO: renamed from: showMessageRedDot$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showMessageRedDot = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: currentSelectTab$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentSelectTab = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            MessageFragment.this.updateNavigatorDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28516OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(0);
            this.f28516OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28516OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f28517OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f28519OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f28520OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f28521OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28522OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f28523OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, boolean z, boolean z2, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.f28520OooO0o0 = str;
            this.f28519OooO0o = z;
            this.f28521OooO0oO = z2;
            this.f28522OooO0oo = function0;
            this.f28517OooO = i;
            this.f28523OooOO0 = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MessageFragment.this.TabItem(this.f28520OooO0o0, this.f28519OooO0o, this.f28521OooO0oO, this.f28522OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28517OooO | 1), this.f28523OooOO0);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMessageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageFragment$initView$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,173:1\n66#2,6:174\n72#2:208\n76#2:257\n78#3,11:180\n78#3,11:216\n91#3:248\n91#3:256\n456#4,8:191\n464#4,3:205\n456#4,8:227\n464#4,3:241\n467#4,3:245\n467#4,3:253\n4144#5,6:199\n4144#5,6:235\n154#6:209\n154#6:250\n154#6:251\n154#6:252\n73#7,6:210\n79#7:244\n83#7:249\n*S KotlinDebug\n*F\n+ 1 MessageFragment.kt\ncom/yalla/yalla/ui/fragment/message/MessageFragment$initView$1\n*L\n89#1:174,6\n89#1:208\n89#1:257\n89#1:180,11\n90#1:216,11\n90#1:248\n89#1:256\n89#1:191,8\n89#1:205,3\n90#1:227,8\n90#1:241,3\n90#1:245,3\n89#1:253,3\n89#1:199,6\n90#1:235,6\n93#1:209\n116#1:250\n117#1:251\n124#1:252\n90#1:210,6\n90#1:244\n90#1:249\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO0OO() {
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
                    ComposerKt.traceEventStart(703664671, iIntValue, -1, "com.yalla.yalla.ui.fragment.message.MessageFragment.initView.<anonymous> (MessageFragment.kt:87)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                MessageFragment messageFragment = MessageFragment.this;
                composer2.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(companion2, false, composer2, 0, -1323940314);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(48), 0.0f, Dp.m3765constructorimpl(40), 0.0f, 10, null), companion2.getCenter());
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooOOO.OooO00o(companion2, Arrangement.INSTANCE.getStart(), composer2, 0, -1323940314);
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
                Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                messageFragment.TabItem(StringResources_androidKt.stringResource(oO00OOo0.nav_title_message, composer2, 0), messageFragment.getCurrentSelectTab() == 0, messageFragment.getShowMessageRedDot(), new com.yalla.yalla.ui.fragment.message.OooO00o(messageFragment), composer2, ShareRequest.THUMB_DATA_SIZE_LIMIT, 0);
                messageFragment.TabItem(StringResources_androidKt.stringResource(oO00OOo0.relation_friends, composer2, 0), messageFragment.getCurrentSelectTab() == 1, false, new com.yalla.yalla.ui.fragment.message.OooO0O0(messageFragment), composer2, ShareRequest.THUMB_DATA_SIZE_LIMIT, 4);
                o000oOoO.OooO00o(composer2);
                IconKt.m1103Iconww6aTOc(PainterResources_androidKt.painterResource(oO00OOO.icon_friends_addfriends, composer2, 0), (String) null, PaddingKt.m476padding3ABfNKs(o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterEnd()), 0.0f, 0.0f, Dp.m3765constructorimpl(10), 0.0f, 11, null), Dp.m3765constructorimpl(30)), false, false, 0L, false, null, null, null, new com.yalla.yalla.ui.fragment.message.OooO0o(messageFragment), 253), Dp.m3765constructorimpl(4)), o0oO0O0o.f46946OooO0O0, composer2, 56, 0);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements ViewPager.OooOOO0 {
        public OooO0o() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            MessageFragment messageFragment = MessageFragment.this;
            messageFragment.setCurrentSelectTab(i);
            if (i == 0) {
                FragmentActivity activity = messageFragment.getActivity();
                Intrinsics.checkNotNull(activity);
                Intrinsics.checkNotNullParameter(activity, "activity");
                Object systemService = activity.getSystemService("input_method");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(activity.findViewById(R.id.content).getWindowToken(), 0);
            }
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Integer, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            MessageFragment.this.updateNavigatorDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28527OooO0Oo;

        public OooOO0O(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28527OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28527OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28527OooO0Oo;
        }

        public final int hashCode() {
            return this.f28527OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28527OooO0Oo.invoke(obj);
        }
    }

    private static final float TabItem$lambda$3$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long TabItem$lambda$3$lambda$2(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentSelectTab() {
        return ((Number) this.currentSelectTab.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowMessageRedDot() {
        return ((Boolean) this.showMessageRedDot.getValue()).booleanValue();
    }

    private final void initView() {
        ComposeView composeView = getBinding().f58035OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeView");
        o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(703664671, true, new OooO0OO()));
        ArrayList arrayList = new ArrayList();
        MessageListFragment messageListFragment = new MessageListFragment();
        this.messageListFragment = messageListFragment;
        Intrinsics.checkNotNull(messageListFragment);
        arrayList.add(messageListFragment);
        FriendListFragment friendListFragment = new FriendListFragment();
        this.friendsListFragment = friendListFragment;
        Intrinsics.checkNotNull(friendListFragment);
        arrayList.add(friendListFragment);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        this.fragmentPagerAdapter = new o00Oo0(childFragmentManager, arrayList);
        getBinding().f58036OooO0OO.setAdapter(this.fragmentPagerAdapter);
        getBinding().f58036OooO0OO.setOffscreenPageLimit(1);
        getBinding().f58036OooO0OO.OooO0O0(new OooO0o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSelectTab(int i) {
        this.currentSelectTab.setValue(Integer.valueOf(i));
    }

    private final void setShowMessageRedDot(boolean z) {
        this.showMessageRedDot.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNavigatorDot() {
        Integer value;
        Integer value2;
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        MediatorLiveData<Integer> unreadMessageCount = sharedMessageVM.getUnreadMessageCount();
        Integer num = 0;
        if (unreadMessageCount == null || (value = unreadMessageCount.getValue()) == null) {
            value = num;
        }
        int iIntValue = value.intValue();
        LiveData<Integer> unreadMomentsMessageCount = sharedMessageVM.getUnreadMomentsMessageCount();
        if (unreadMomentsMessageCount != null && (value2 = unreadMomentsMessageCount.getValue()) != null) {
            num = value2;
        }
        setShowMessageRedDot(iIntValue > 0 || num.intValue() > 0);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x013f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0150  */
    /* JADX WARN: Code duplicated, block: B:77:0x015e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0173  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    /* JADX WARN: Code duplicated, block: B:84:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:0x0193  */
    /* JADX WARN: Code duplicated, block: B:88:0x021d  */
    /* JADX WARN: Code duplicated, block: B:93:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TabItem(@NotNull String title, boolean z, boolean z2, @NotNull Function0<Unit> onClick, @Nullable Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        boolean z5;
        boolean z6;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM1309constructorimpl;
        Function2 function2OooO00o;
        float f;
        long j;
        Composer composer2;
        boolean z7;
        boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1602811515);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 112) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(onClick)) {
                        i6 = 2048;
                    } else {
                        i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                    }
                    i3 |= i6;
                }
                i7 = i3;
                if ((i7 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i8 != 0) {
                        z5 = false;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1602811515, i7, -1, "com.yalla.yalla.ui.fragment.message.MessageFragment.TabItem (MessageFragment.kt:150)");
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
                    Modifier modifierOooO00o = o0oOO.OooO00o(12, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
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
                    composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                    function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
                    if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                    }
                    androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (z5) {
                        f = 1.06f;
                    } else {
                        f = 1.0f;
                    }
                    State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                    int i9 = o0oO0O0o.f47152o00OOOo;
                    if (z5) {
                        j = o0oO0O0o.f46946OooO0O0;
                    } else {
                        j = o0oO0O0o.f46958OooOOOO;
                    }
                    composer2 = composerStartRestartGroup;
                    TextKt.m1251Text4IGK_g(title, o0000Ooo.OooO00o(ScaleKt.scale(companion, TabItem$lambda$3$lambda$1(stateAnimateFloatAsState)), z6, 0L, Dp.m3765constructorimpl((float) 3.5d), true, false, Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(3), 0.0f, 818), TabItem$lambda$3$lambda$2(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 199680, 0, 131024);
                    if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z8 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z7 = z3;
                    z8 = z4;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(title, z7, z8, onClick, i, i2));
            }
            i3 |= 384;
            z4 = z2;
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1602811515, i7, -1, "com.yalla.yalla.ui.fragment.message.MessageFragment.TabItem (MessageFragment.kt:150)");
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
                Modifier modifierOooO00o2 = o0oOO.OooO00o(12, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion3, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
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
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM1309constructorimpl, currentCompositionLocalMap2);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (z5) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                int i10 = o0oO0O0o.f47152o00OOOo;
                if (z5) {
                    j = o0oO0O0o.f46946OooO0O0;
                } else {
                    j = o0oO0O0o.f46958OooOOOO;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(title, o0000Ooo.OooO00o(ScaleKt.scale(companion3, TabItem$lambda$3$lambda$1(stateAnimateFloatAsState2)), z6, 0L, Dp.m3765constructorimpl((float) 3.5d), true, false, Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(3), 0.0f, 818), TabItem$lambda$3$lambda$2(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 199680, 0, 131024);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            } else {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1602811515, i7, -1, "com.yalla.yalla.ui.fragment.message.MessageFragment.TabItem (MessageFragment.kt:150)");
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
                Modifier modifierOooO00o3 = o0oOO.OooO00o(12, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion5, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
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
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion6, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM1309constructorimpl, currentCompositionLocalMap3);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                if (z5) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                State<Float> stateAnimateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                int i11 = o0oO0O0o.f47152o00OOOo;
                if (z5) {
                    j = o0oO0O0o.f46946OooO0O0;
                } else {
                    j = o0oO0O0o.f46958OooOOOO;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(title, o0000Ooo.OooO00o(ScaleKt.scale(companion5, TabItem$lambda$3$lambda$1(stateAnimateFloatAsState3)), z6, 0L, Dp.m3765constructorimpl((float) 3.5d), true, false, Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(3), 0.0f, 818), TabItem$lambda$3$lambda$2(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 199680, 0, 131024);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(title, z7, z8, onClick, i, i2));
        }
        i3 |= 48;
        z3 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 896) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i5 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i6 = 2048;
                } else {
                    i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
                }
                i3 |= i6;
            }
            i7 = i3;
            if ((i7 & 5851) == 1170) {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1602811515, i7, -1, "com.yalla.yalla.ui.fragment.message.MessageFragment.TabItem (MessageFragment.kt:150)");
                }
                Alignment center4 = Alignment.INSTANCE.getCenter();
                Modifier.Companion companion7 = Modifier.INSTANCE;
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
                Modifier modifierOooO00o4 = o0oOO.OooO00o(12, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion7, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierOooO00o4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion8, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM1309constructorimpl, currentCompositionLocalMap4);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                if (z5) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                State<Float> stateAnimateFloatAsState4 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                int i12 = o0oO0O0o.f47152o00OOOo;
                if (z5) {
                    j = o0oO0O0o.f46946OooO0O0;
                } else {
                    j = o0oO0O0o.f46958OooOOOO;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(title, o0000Ooo.OooO00o(ScaleKt.scale(companion7, TabItem$lambda$3$lambda$1(stateAnimateFloatAsState4)), z6, 0L, Dp.m3765constructorimpl((float) 3.5d), true, false, Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(3), 0.0f, 818), TabItem$lambda$3$lambda$2(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 199680, 0, 131024);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            } else {
                if (i8 != 0) {
                    z5 = false;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1602811515, i7, -1, "com.yalla.yalla.ui.fragment.message.MessageFragment.TabItem (MessageFragment.kt:150)");
                }
                Alignment center5 = Alignment.INSTANCE.getCenter();
                Modifier.Companion companion9 = Modifier.INSTANCE;
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
                Modifier modifierOooO00o5 = o0oOO.OooO00o(12, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion9, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                constructor = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierOooO00o5);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
                function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion10, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM1309constructorimpl, currentCompositionLocalMap5);
                if (composerM1309constructorimpl.getInserting()) {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                } else {
                    androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                if (z5) {
                    f = 1.06f;
                } else {
                    f = 1.0f;
                }
                State<Float> stateAnimateFloatAsState5 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                int i13 = o0oO0O0o.f47152o00OOOo;
                if (z5) {
                    j = o0oO0O0o.f46946OooO0O0;
                } else {
                    j = o0oO0O0o.f46958OooOOOO;
                }
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(title, o0000Ooo.OooO00o(ScaleKt.scale(companion9, TabItem$lambda$3$lambda$1(stateAnimateFloatAsState5)), z6, 0L, Dp.m3765constructorimpl((float) 3.5d), true, false, Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(3), 0.0f, 818), TabItem$lambda$3$lambda$2(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 199680, 0, 131024);
                if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(title, z7, z8, onClick, i, i2));
        }
        i3 |= 384;
        z4 = z2;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i6 = 2048;
            } else {
                i6 = LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
            }
            i3 |= i6;
        }
        i7 = i3;
        if ((i7 & 5851) == 1170) {
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1602811515, i7, -1, "com.yalla.yalla.ui.fragment.message.MessageFragment.TabItem (MessageFragment.kt:150)");
            }
            Alignment center6 = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion11 = Modifier.INSTANCE;
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
            Modifier modifierOooO00o6 = o0oOO.OooO00o(12, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion11, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
            constructor = companion12.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierOooO00o6);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion12, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM1309constructorimpl, currentCompositionLocalMap6);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf6, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            if (z5) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            State<Float> stateAnimateFloatAsState6 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            int i14 = o0oO0O0o.f47152o00OOOo;
            if (z5) {
                j = o0oO0O0o.f46946OooO0O0;
            } else {
                j = o0oO0O0o.f46958OooOOOO;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(title, o0000Ooo.OooO00o(ScaleKt.scale(companion11, TabItem$lambda$3$lambda$1(stateAnimateFloatAsState6)), z6, 0L, Dp.m3765constructorimpl((float) 3.5d), true, false, Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(3), 0.0f, 818), TabItem$lambda$3$lambda$2(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 199680, 0, 131024);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z7 = z5;
            z8 = z6;
        } else {
            if (i8 != 0) {
                z5 = false;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1602811515, i7, -1, "com.yalla.yalla.ui.fragment.message.MessageFragment.TabItem (MessageFragment.kt:150)");
            }
            Alignment center7 = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion13 = Modifier.INSTANCE;
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
            Modifier modifierOooO00o7 = o0oOO.OooO00o(12, SizeKt.fillMaxHeight$default(o0O0O00.OooO0O0(companion13, false, false, 0L, false, null, null, null, (Function0) objRememberedValue, 253), 0.0f, 1, null), 0.0f, 2, null, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
            constructor = companion14.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierOooO00o7);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
            function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion14, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM1309constructorimpl, currentCompositionLocalMap7);
            if (composerM1309constructorimpl.getInserting()) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            } else {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf7, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            if (z5) {
                f = 1.06f;
            } else {
                f = 1.0f;
            }
            State<Float> stateAnimateFloatAsState7 = AnimateAsStateKt.animateFloatAsState(f, AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            int i15 = o0oO0O0o.f47152o00OOOo;
            if (z5) {
                j = o0oO0O0o.f46946OooO0O0;
            } else {
                j = o0oO0O0o.f46958OooOOOO;
            }
            composer2 = composerStartRestartGroup;
            TextKt.m1251Text4IGK_g(title, o0000Ooo.OooO00o(ScaleKt.scale(companion13, TabItem$lambda$3$lambda$1(stateAnimateFloatAsState7)), z6, 0L, Dp.m3765constructorimpl((float) 3.5d), true, false, Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(3), 0.0f, 818), TabItem$lambda$3$lambda$2(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(300, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12)), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i7 & 14) | 199680, 0, 131024);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
            z7 = z5;
            z8 = z6;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(title, z7, z8, onClick, i, i2));
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
        MediatorLiveData<Integer> unreadMessageCount = sharedMessageVM.getUnreadMessageCount();
        Intrinsics.checkNotNull(unreadMessageCount);
        unreadMessageCount.observe(getViewLifecycleOwner(), new OooOO0O(new OooO()));
        LiveData<Integer> unreadMomentsMessageCount = sharedMessageVM.getUnreadMomentsMessageCount();
        Intrinsics.checkNotNull(unreadMomentsMessageCount);
        unreadMomentsMessageCount.observe(getViewLifecycleOwner(), new OooOO0O(new OooOO0()));
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        IMMessageService iMMessageService = IMMessageService.f24939OooO0o;
        if (iMMessageService != null) {
            iMMessageService.OooO00o();
        }
        if (OooOOOO.f44246OooO0oO > 0) {
            OooOOOO.f44246OooO0oO = 0;
        }
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public h5 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        h5 h5VarInflate = h5.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(h5VarInflate, "inflate(inflater, container, false)");
        return h5VarInflate;
    }
}
