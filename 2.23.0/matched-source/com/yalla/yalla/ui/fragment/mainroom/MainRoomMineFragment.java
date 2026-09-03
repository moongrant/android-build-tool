package com.yalla.yalla.ui.fragment.mainroom;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.android.billingclient.api.o0000OO0;
import com.code.android.util.o0000;
import com.code.android.util.o0O0O00;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.adapter.o000O0o;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.view.tips.AppBarStateChangeListener;
import com.yalla.yalla.ui.view.tips.TipsBubbleView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoo.o0000O0;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o00000OO;
import p403o0Oo0OOo.oO0O0OoO;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p480o0o000Oo.o0OOO0o;
import p538o0o0OoO0.o00OO;
import p538o0o0OoO0.oo0O;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.k4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\bX\u0010YJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0014J\u0006\u0010\n\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\u000f\u0010\u0013\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\b*\u00020\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\b*\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001c\u0010\u0014J1\u0010$\u001a\u00020\b*\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"H\u0003¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020\bH\u0002J\b\u0010'\u001a\u00020\bH\u0002J\b\u0010(\u001a\u00020\bH\u0002J\b\u0010)\u001a\u00020\bH\u0002R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001e0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R+\u0010I\u001a\u00020 2\u0006\u0010B\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010P\u001a\u00020J2\u0006\u0010B\u001a\u00020J8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bK\u0010D\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR+\u0010T\u001a\u00020 2\u0006\u0010B\u001a\u00020 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010D\u001a\u0004\bR\u0010F\"\u0004\bS\u0010HR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0ooOOOO/k4;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "onRoomClick", "saveLeavePage", "onResume", "scrollToTop", "Lo0OoO000/OooOo;", "msg", "onEventMainThread", "initView", "setIndicator", "MyRoom", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/layout/BoxScope;", "CreateRoomContent", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "roomInfo", "MyRoomContent", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/yalla/yalla/model/room/RoomIndexModel;Landroidx/compose/runtime/Composer;I)V", "TabIndicator", "Landroidx/compose/foundation/layout/RowScope;", "", ShareConstants.WEB_DIALOG_PARAM_TITLE, "", "isSelected", "Lkotlin/Function0;", "onClick", "MineTab", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "resumeLeavePage", "updateIndicator", "showCreateRoomTipsBubble", "dismissCreateRoomTipsBubbleIfNeeded", "Lcom/yalla/yalla/ui/view/tips/TipsBubbleView;", "bubbleView", "Lcom/yalla/yalla/ui/view/tips/TipsBubbleView;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineRecentlyFragment;", "mainRoomRelatedRecentlyFragment$delegate", "Lkotlin/Lazy;", "getMainRoomRelatedRecentlyFragment", "()Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineRecentlyFragment;", "mainRoomRelatedRecentlyFragment", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineJoinedFragment;", "mainRoomRelatedRelatedJoinedFragment$delegate", "getMainRoomRelatedRelatedJoinedFragment", "()Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineJoinedFragment;", "mainRoomRelatedRelatedJoinedFragment", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment;", "mainRoomRelatedRelatedFollowingFragment$delegate", "getMainRoomRelatedRelatedFollowingFragment", "()Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment;", "mainRoomRelatedRelatedFollowingFragment", "", "Landroidx/fragment/app/Fragment;", "fragments", "Ljava/util/List;", "titles", "<set-?>", "appBarLayoutState$delegate", "Landroidx/compose/runtime/MutableState;", "getAppBarLayoutState", "()Z", "setAppBarLayoutState", "(Z)V", "appBarLayoutState", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment$OooOO0;", "currentItem$delegate", "getCurrentItem", "()Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment$OooOO0;", "setCurrentItem", "(Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment$OooOO0;)V", "currentItem", "haveHistory$delegate", "getHaveHistory", "setHaveHistory", "haveHistory", "Lcom/yalla/yalla/ui/view/tips/AppBarStateChangeListener;", "appBarStateChangeListener", "Lcom/yalla/yalla/ui/view/tips/AppBarStateChangeListener;", "<init>", "()V", "OooOO0", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainRoomMineFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomMineFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,514:1\n81#2:515\n107#2,2:516\n81#2:518\n107#2,2:519\n81#2:521\n107#2,2:522\n81#2:828\n81#2:829\n81#2:830\n66#3,6:524\n72#3:558\n67#3,5:563\n72#3:596\n76#3:601\n76#3:606\n67#3,5:789\n72#3:822\n76#3:827\n78#4,11:530\n78#4,11:568\n91#4:600\n91#4:605\n78#4,11:614\n91#4:649\n78#4,11:664\n78#4,11:702\n91#4:739\n91#4:744\n78#4,11:754\n91#4:786\n78#4,11:794\n91#4:826\n456#5,8:541\n464#5,3:555\n456#5,8:579\n464#5,3:593\n467#5,3:597\n467#5,3:602\n456#5,8:625\n464#5,3:639\n467#5,3:646\n456#5,8:675\n464#5,3:689\n456#5,8:713\n464#5,3:727\n467#5,3:736\n467#5,3:741\n456#5,8:765\n464#5,3:779\n467#5,3:783\n456#5,8:805\n464#5,3:819\n467#5,3:823\n4144#6,6:549\n4144#6,6:587\n4144#6,6:633\n4144#6,6:683\n4144#6,6:721\n4144#6,6:773\n4144#6,6:813\n154#7:559\n154#7:560\n154#7:561\n154#7:562\n154#7:607\n154#7:643\n154#7:644\n154#7:645\n154#7:651\n154#7:652\n154#7:653\n154#7:654\n154#7:655\n154#7:656\n154#7:657\n154#7:693\n154#7:694\n154#7:731\n154#7:732\n154#7:733\n154#7:734\n154#7:735\n154#7:746\n154#7:747\n154#7:788\n72#8,6:608\n78#8:642\n82#8:650\n72#8,6:658\n78#8:692\n82#8:745\n72#9,7:695\n79#9:730\n83#9:740\n73#9,6:748\n79#9:782\n83#9:787\n*S KotlinDebug\n*F\n+ 1 MainRoomMineFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment\n*L\n101#1:515\n101#1:516,2\n170#1:518\n170#1:519,2\n171#1:521\n171#1:522,2\n200#1:828\n302#1:829\n336#1:830\n181#1:524,6\n181#1:558\n184#1:563,5\n184#1:596\n184#1:601\n181#1:606\n329#1:789,5\n329#1:822\n329#1:827\n181#1:530,11\n184#1:568,11\n184#1:600\n181#1:605\n220#1:614,11\n220#1:649\n264#1:664,11\n272#1:702,11\n272#1:739\n264#1:744\n303#1:754,11\n303#1:786\n329#1:794,11\n329#1:826\n181#1:541,8\n181#1:555,3\n184#1:579,8\n184#1:593,3\n184#1:597,3\n181#1:602,3\n220#1:625,8\n220#1:639,3\n220#1:646,3\n264#1:675,8\n264#1:689,3\n272#1:713,8\n272#1:727,3\n272#1:736,3\n264#1:741,3\n303#1:765,8\n303#1:779,3\n303#1:783,3\n329#1:805,8\n329#1:819,3\n329#1:823,3\n181#1:549,6\n184#1:587,6\n220#1:633,6\n264#1:683,6\n272#1:721,6\n303#1:773,6\n329#1:813,6\n187#1:559\n189#1:560\n191#1:561\n192#1:562\n220#1:607\n224#1:643\n226#1:644\n230#1:645\n238#1:651\n239#1:652\n241#1:653\n260#1:654\n261#1:655\n262#1:656\n264#1:657\n269#1:693\n271#1:694\n276#1:731\n278#1:732\n280#1:733\n284#1:734\n286#1:735\n307#1:746\n309#1:747\n332#1:788\n220#1:608,6\n220#1:642\n220#1:650\n264#1:658,6\n264#1:692\n264#1:745\n272#1:695,7\n272#1:730\n272#1:740\n303#1:748,6\n303#1:782\n303#1:787\n*E\n"})
public final class MainRoomMineFragment extends MainRoomBaseFragment<k4> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: appBarLayoutState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState appBarLayoutState;

    @NotNull
    private final AppBarStateChangeListener appBarStateChangeListener;

    @Nullable
    private TipsBubbleView bubbleView;

    /* JADX INFO: renamed from: currentItem$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentItem;

    /* JADX INFO: renamed from: haveHistory$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState haveHistory;

    /* JADX INFO: renamed from: mainRoomRelatedRecentlyFragment$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainRoomRelatedRecentlyFragment = LazyKt.lazy(o0OoOo0.f28463OooO0Oo);

    /* JADX INFO: renamed from: mainRoomRelatedRelatedJoinedFragment$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainRoomRelatedRelatedJoinedFragment = LazyKt.lazy(o00Oo0.f28460OooO0Oo);

    /* JADX INFO: renamed from: mainRoomRelatedRelatedFollowingFragment$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainRoomRelatedRelatedFollowingFragment = LazyKt.lazy(o00O0O.f28459OooO0Oo);

    @NotNull
    private final List<Fragment> fragments = new ArrayList();

    @NotNull
    private final List<String> titles = CollectionsKt.mutableListOf(o0000.OooO0OO(oO00OOo0.room_type_add), o0000.OooO0OO(oO00OOo0.room_type_follow));

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f28435OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28436OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f28437OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(BoxScope boxScope, RoomIndexModel roomIndexModel, int i) {
            super(2);
            this.f28436OooO0o0 = boxScope;
            this.f28435OooO0o = roomIndexModel;
            this.f28437OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28437OooO0oO | 1);
            BoxScope boxScope = this.f28436OooO0o0;
            RoomIndexModel roomIndexModel = this.f28435OooO0o;
            MainRoomMineFragment.this.MyRoomContent(boxScope, roomIndexModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f28439OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f28440OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, int i) {
            super(2);
            this.f28440OooO0o0 = boxScope;
            this.f28439OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28439OooO0o | 1);
            MainRoomMineFragment.this.CreateRoomContent(this.f28440OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f28441OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f28443OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RowScope f28444OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f28445OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28446OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RowScope rowScope, String str, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.f28444OooO0o0 = rowScope;
            this.f28443OooO0o = str;
            this.f28445OooO0oO = z;
            this.f28446OooO0oo = function0;
            this.f28441OooO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            MainRoomMineFragment.this.MineTab(this.f28444OooO0o0, this.f28443OooO0o, this.f28445OooO0oO, this.f28446OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28441OooO | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomMineFragment.this.onRoomClick();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28449OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f28449OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28449OooO0o0 | 1);
            MainRoomMineFragment.this.MyRoom(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public enum OooOO0 {
        RECENTLY,
        JOINED,
        FOLLOWING
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {
        public OooOO0O() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((k4) MainRoomMineFragment.this.getBinding()).f58254OooO0oO.setCurrentItem(0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {
        public OooOOO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomMineFragment mainRoomMineFragment = MainRoomMineFragment.this;
            if (mainRoomMineFragment.getHaveHistory()) {
                ((k4) mainRoomMineFragment.getBinding()).f58254OooO0oO.setCurrentItem(2);
            } else {
                ((k4) mainRoomMineFragment.getBinding()).f58254OooO0oO.setCurrentItem(1);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomMineFragment mainRoomMineFragment = MainRoomMineFragment.this;
            if (mainRoomMineFragment.getHaveHistory()) {
                ((k4) mainRoomMineFragment.getBinding()).f58254OooO0oO.setCurrentItem(1);
            } else {
                ((k4) mainRoomMineFragment.getBinding()).f58254OooO0oO.setCurrentItem(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28454OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(int i) {
            super(2);
            this.f28454OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28454OooO0o0 | 1);
            MainRoomMineFragment.this.TabIndicator(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends AppBarStateChangeListener {
        public OooOo() {
        }

        @Override // com.yalla.yalla.ui.view.tips.AppBarStateChangeListener
        public final void OooO0O0(@NotNull AppBarLayout appBarLayout, @NotNull AppBarStateChangeListener.State oldState, @NotNull AppBarStateChangeListener.State state) {
            TipsBubbleView tipsBubbleView;
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            Intrinsics.checkNotNullParameter(oldState, "oldState");
            Intrinsics.checkNotNullParameter(state, "state");
            AppBarStateChangeListener.State state2 = AppBarStateChangeListener.State.COLLAPSED;
            MainRoomMineFragment mainRoomMineFragment = MainRoomMineFragment.this;
            if (state == state2) {
                TipsBubbleView tipsBubbleView2 = mainRoomMineFragment.bubbleView;
                if (tipsBubbleView2 == null) {
                    return;
                }
                tipsBubbleView2.setVisibility(8);
                return;
            }
            if (oldState == state2 && state == AppBarStateChangeListener.State.IDLE && (tipsBubbleView = mainRoomMineFragment.bubbleView) != null) {
                tipsBubbleView.setVisibility(0);
            }
        }
    }

    public /* synthetic */ class OooOo00 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OooOO0.values().length];
            try {
                iArr[OooOO0.RECENTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OooOO0.JOINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OooOO0.FOLLOWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {
        public Oooo0() {
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
                    ComposerKt.traceEventStart(-2012873492, iIntValue, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment.initView.<anonymous> (MainRoomMineFragment.kt:143)");
                }
                MainRoomMineFragment.this.MyRoom(composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 implements ViewPager.OooOOO0 {
        public Oooo000() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o0ooo0oOooO0O0.OooO0OO(i, o000000O.OooOOo0().getValue() + "USER_LEAVE_PAGE_RELATED");
            MainRoomMineFragment.this.updateIndicator();
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {
        public o000oOoO() {
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
                    ComposerKt.traceEventStart(-180735901, iIntValue, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment.initView.<anonymous> (MainRoomMineFragment.kt:146)");
                }
                MainRoomMineFragment.this.TabIndicator(composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<MainRoomMineFollowingFragment> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f28459OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomMineFollowingFragment invoke() {
            return new MainRoomMineFollowingFragment();
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<MainRoomMineJoinedFragment> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f28460OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomMineJoinedFragment invoke() {
            return new MainRoomMineJoinedFragment();
        }
    }

    public static final class o00Ooo implements Observer<Boolean> {
        public o00Ooo() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                MainRoomMineFragment mainRoomMineFragment = MainRoomMineFragment.this;
                mainRoomMineFragment.showCreateRoomTipsBubble();
                mainRoomMineFragment.resumeLeavePage();
            }
        }
    }

    public static final class o00oO0o implements TipsBubbleView.OooO00o {
        public o00oO0o() {
        }

        @Override // com.yalla.yalla.ui.view.tips.TipsBubbleView.OooO00o
        public final void OooO00o() {
            MainRoomMineFragment.this.dismissCreateRoomTipsBubbleIfNeeded();
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<MainRoomMineRecentlyFragment> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OoOo0 f28463OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomMineRecentlyFragment invoke() {
            return new MainRoomMineRecentlyFragment();
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {
        public oo000o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomMineFragment mainRoomMineFragment = MainRoomMineFragment.this;
            Context context = mainRoomMineFragment.getContext();
            if (context != null) {
                o0OO000.OooO00o("101027");
                int i = CreateRoomActivity.f26502OooOoo0;
                CreateRoomActivity.OooO00o.OooO00o(context);
            }
            mainRoomMineFragment.dismissCreateRoomTipsBubbleIfNeeded();
            return Unit.INSTANCE;
        }
    }

    public MainRoomMineFragment() {
        Boolean bool = Boolean.FALSE;
        this.appBarLayoutState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.currentItem = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooOO0.JOINED, null, 2, null);
        this.haveHistory = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.appBarStateChangeListener = new OooOo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void CreateRoomContent(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1629076778);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1629076778, i, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment.CreateRoomContent (MainRoomMineFragment.kt:210)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_main_room_create_bg, composerStartRestartGroup, 0);
            ContentScale crop = ContentScale.INSTANCE.getCrop();
            Modifier.Companion companion = Modifier.INSTANCE;
            ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0Oo(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 6), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
            Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion, Dp.m3765constructorimpl(81), 0.0f, Dp.m3765constructorimpl(65), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Creat_Room, composerStartRestartGroup, 0);
            long j = o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
            long sp = TextUnitKt.getSp(15);
            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
            TextKt.m1251Text4IGK_g(strStringResource, SizeKt.m511heightInVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(20), 1, null), j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120816);
            composerStartRestartGroup = composerStartRestartGroup;
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Room_Describ, composerStartRestartGroup, 0), SizeKt.m511heightInVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(30), 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3120, 3120, 120816);
            p426o0OoOO.o000oOoO.OooO00o(composerStartRestartGroup);
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_main_room_crete_add, composerStartRestartGroup, 0), (String) null, PaddingKt.m476padding3ABfNKs(BackgroundKt.m168backgroundbw27NRU(SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(boxScope.align(companion, companion2.getCenterEnd()), 0.0f, 0.0f, Dp.m3765constructorimpl(15), 0.0f, 11, null), Dp.m3765constructorimpl(35)), o0oO0O0o.f46993OoooOo0, RoundedCornerShapeKt.getCircleShape()), Dp.m3765constructorimpl(5)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MineTab(RowScope rowScope, String str, boolean z, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-594840110);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-594840110, i2, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment.MineTab (MainRoomMineFragment.kt:327)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierOooO0O0 = o0O0O00.OooO0O0(androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, SizeKt.m509height3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(31)), 1.0f, false, 2, null), false, false, 0L, false, null, null, null, function0, 253);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1339994579);
            long j = z ? o0oO0O0o.f46993OoooOo0 : o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o;
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(str, (Modifier) null, MineTab$lambda$12$lambda$11(SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, null, null, null, composerStartRestartGroup, 0, 14)), TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i2 >> 3) & 14) | 199680, 0, 131026);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(rowScope, str, z, function0, i));
    }

    private static final long MineTab$lambda$12$lambda$11(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MyRoom(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(643648320);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(643648320, i, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment.MyRoom (MainRoomMineFragment.kt:179)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        oOOOOo0O.f56683OooO00o.OooO00o(64, 1, composerStartRestartGroup, null);
        Alignment centerStart = companion2.getCenterStart();
        float f = 16;
        Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m479paddingqDBjuR0(companion, Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(8), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(4)), 0.0f, 1, null), Dp.m3765constructorimpl(93));
        float fM3765constructorimpl = Dp.m3765constructorimpl(12);
        RoundedCornerShape roundedCornerShapeM727RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(15));
        long j = o0oO0O0o.f46963OooOo;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(ShadowKt.m1348shadows4CzXII$default(modifierM509height3ABfNKs, fM3765constructorimpl, roundedCornerShapeM727RoundedCornerShape0680j_4, false, j, j, 4, null), false, false, 0L, false, null, null, null, new OooO0OO(), 253);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.f46724OoooOoo, composerStartRestartGroup, 8);
        if (MyRoom$lambda$5$lambda$4$lambda$3(stateObserveAsState) != null) {
            composerStartRestartGroup.startReplaceableGroup(-458585610);
            RoomIndexModel roomIndexModelMyRoom$lambda$5$lambda$4$lambda$3 = MyRoom$lambda$5$lambda$4$lambda$3(stateObserveAsState);
            Intrinsics.checkNotNull(roomIndexModelMyRoom$lambda$5$lambda$4$lambda$3);
            MyRoomContent(boxScopeInstance, roomIndexModelMyRoom$lambda$5$lambda$4$lambda$3, composerStartRestartGroup, 582);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-458585539);
            CreateRoomContent(boxScopeInstance, composerStartRestartGroup, 70);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }

    private static final RoomIndexModel MyRoom$lambda$5$lambda$4$lambda$3(State<? extends RoomIndexModel> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MyRoomContent(BoxScope boxScope, RoomIndexModel roomIndexModel, Composer composer, int i) {
        String str;
        String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1254035948);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1254035948, i, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment.MyRoomContent (MainRoomMineFragment.kt:245)");
        }
        Painter painterPainterResource = PainterResources_androidKt.painterResource(oO00OOO.ic_main_room_mine_bg, composerStartRestartGroup, 0);
        ContentScale.Companion companion = ContentScale.INSTANCE;
        ContentScale crop = companion.getCrop();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        ImageKt.Image(painterPainterResource, (String) null, o0O0O00.OooO0Oo(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), composerStartRestartGroup, 6), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        o0000O0 o0000o0OooO0O0 = p417o0OoO0.o00Oo0.OooO0O0(roomIndexModel.barimage, null, composerStartRestartGroup, 0, 1);
        ContentScale crop2 = companion.getCrop();
        float f = 16;
        ImageKt.Image(o0000o0OooO0O0, (String) null, com.facebook.OooOo.OooO0O0(12, SizeKt.m523size3ABfNKs(PaddingKt.m478paddingVpY3zN4$default(companion2, Dp.m3765constructorimpl(f), 0.0f, 2, null), Dp.m3765constructorimpl(54))), (Alignment) null, crop2, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(companion2, Dp.m3765constructorimpl(84), 0.0f, Dp.m3765constructorimpl(f), 0.0f, 10, null);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion3, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM480paddingqDBjuR0$default);
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
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        String str3 = roomIndexModel.barname;
        if (str3 == null) {
            str3 = "";
        } else {
            Intrinsics.checkNotNullExpressionValue(str3, "roomInfo.barname ?: \"\"");
        }
        TextKt.m1251Text4IGK_g(str3, SizeKt.m511heightInVpY3zN4$default(companion2, 0.0f, Dp.m3765constructorimpl(20), 1, null), o000OOo.OooO0OO(composerStartRestartGroup).f37701OooO, TextUnitKt.getSp(15), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199728, 3120, 120784);
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(7), null, composerStartRestartGroup, 6, 2);
        Alignment.Vertical centerVertically = companion3.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
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
        float f2 = 14;
        ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_main_room_mine_lv, composerStartRestartGroup, 0), (String) null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(f2)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, 120);
        float f3 = 4;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
        String str4 = roomIndexModel.barlevel;
        if (str4 == null) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        } else {
            Intrinsics.checkNotNullExpressionValue(str4, "roomInfo.barlevel ?: \"0\"");
            str = str4;
        }
        TextKt.m1251Text4IGK_g(str, (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        p154o00OoO00.OooOo00.OooO00o("svga/anim_room_live.svga", true, 0, null, null, SizeKt.m523size3ABfNKs(companion2, Dp.m3765constructorimpl(f2)), composerStartRestartGroup, 196662, 28);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
        String str5 = roomIndexModel.onlinenum;
        if (str5 == null) {
            str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        } else {
            Intrinsics.checkNotNullExpressionValue(str5, "roomInfo.onlinenum ?: \"0\"");
            str2 = str5;
        }
        TextKt.m1251Text4IGK_g(str2, (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(boxScope, roomIndexModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TabIndicator(Composer composer, int i) {
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(53148941);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(53148941, i, -1, "com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment.TabIndicator (MainRoomMineFragment.kt:300)");
        }
        if (getAppBarLayoutState()) {
            int i2 = o0oO0O0o.f47152o00OOOo;
            j = o0oO0O0o.f46946OooO0O0;
        } else {
            int i3 = o0oO0O0o.f47152o00OOOo;
            j = o0oO0O0o.f46945OooO00o;
        }
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j, null, null, null, composerStartRestartGroup, 0, 14);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        Modifier modifierOooO00o = o0oOO.OooO00o(16, BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(44)), TabIndicator$lambda$9(stateM58animateColorAsStateeuL9pac), null, 2, null), 0.0f, 2, null, composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(-1799150715);
        if (getHaveHistory()) {
            MineTab(rowScopeInstance, StringResources_androidKt.stringResource(oO00OOo0.Recently, composerStartRestartGroup, 0), getCurrentItem() == OooOO0.RECENTLY, new OooOO0O(), composerStartRestartGroup, 32774);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MineTab(rowScopeInstance, StringResources_androidKt.stringResource(oO00OOo0.Joined, composerStartRestartGroup, 0), getCurrentItem() == OooOO0.JOINED, new OooOOO0(), composerStartRestartGroup, 32774);
        MineTab(rowScopeInstance, StringResources_androidKt.stringResource(oO00OOo0.Following, composerStartRestartGroup, 0), getCurrentItem() == OooOO0.FOLLOWING, new OooOOO(), composerStartRestartGroup, 32774);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(i));
    }

    private static final long TabIndicator$lambda$9(State<Color> state) {
        return state.getValue().m1680unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dismissCreateRoomTipsBubbleIfNeeded() {
        p408o0Oo0o0O.o00Oo0.OooO0o0().OooOOO(false);
        AppBarLayout appBarLayout = ((k4) getBinding()).f58249OooO0O0;
        AppBarStateChangeListener appBarStateChangeListener = this.appBarStateChangeListener;
        ArrayList arrayList = appBarLayout.f16167OooOO0O;
        if (arrayList != null && appBarStateChangeListener != null) {
            arrayList.remove(appBarStateChangeListener);
        }
        TipsBubbleView tipsBubbleView = this.bubbleView;
        if (tipsBubbleView == null) {
            return;
        }
        tipsBubbleView.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAppBarLayoutState() {
        return ((Boolean) this.appBarLayoutState.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final OooOO0 getCurrentItem() {
        return (OooOO0) this.currentItem.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHaveHistory() {
        return ((Boolean) this.haveHistory.getValue()).booleanValue();
    }

    private final MainRoomMineRecentlyFragment getMainRoomRelatedRecentlyFragment() {
        return (MainRoomMineRecentlyFragment) this.mainRoomRelatedRecentlyFragment.getValue();
    }

    private final MainRoomMineFollowingFragment getMainRoomRelatedRelatedFollowingFragment() {
        return (MainRoomMineFollowingFragment) this.mainRoomRelatedRelatedFollowingFragment.getValue();
    }

    private final MainRoomMineJoinedFragment getMainRoomRelatedRelatedJoinedFragment() {
        return (MainRoomMineJoinedFragment) this.mainRoomRelatedRelatedJoinedFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$0(MainRoomMineFragment this$0, AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setAppBarLayoutState(Math.abs(i) == appBarLayout.getTotalScrollRange());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((k4) getBinding()).f58248OooO00o.setOnApplyWindowInsetsListener(new oo0O());
        ((k4) getBinding()).f58249OooO0O0.setOnApplyWindowInsetsListener(new o00OO());
        this.fragments.add(getMainRoomRelatedRelatedJoinedFragment());
        this.fragments.add(getMainRoomRelatedRelatedFollowingFragment());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            ArrayList arrayListOooO00o = p581o0oOoo00.o000OOo.OooO00o().OooOoOO().OooO00o(String.valueOf(o000000O.OooOOo0().getValue()));
            Intrinsics.checkNotNullExpressionValue(arrayListOooO00o, "DB.roomHistoryDao().getR….userId.value.toString())");
            if (!arrayListOooO00o.isEmpty()) {
                this.fragments.add(0, getMainRoomRelatedRecentlyFragment());
                this.titles.add(0, o0000.OooO0OO(oO00OOo0.Recently));
                setHaveHistory(true);
            }
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        ((k4) getBinding()).f58254OooO0oO.setAdapter(new o000O0o(childFragmentManager, this.fragments));
        ((k4) getBinding()).f58254OooO0oO.setOffscreenPageLimit(2);
        ((k4) getBinding()).f58254OooO0oO.OooO0O0(new Oooo000());
        ComposeView composeView = ((k4) getBinding()).f58253OooO0o0;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.myRoomCV");
        o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-2012873492, true, new Oooo0()));
        ComposeView composeView2 = ((k4) getBinding()).f58251OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView2, "binding.cvIndicator");
        o000OOo.OooO0Oo(composeView2, ComposableLambdaKt.composableLambdaInstance(-180735901, true, new o000oOoO()));
        setIndicator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets initView$lambda$1(View v, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets initView$lambda$2(View v, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void resumeLeavePage() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.FALSE)) {
            ((k4) getBinding()).f58254OooO0oO.setCurrentItem(1);
            return;
        }
        int iOooOO0o = p408o0Oo0o0O.o00Oo0.OooOO0o().OooOO0o();
        if (iOooOO0o == 0) {
            ((k4) getBinding()).f58254OooO0oO.setCurrentItem(0);
        } else if (iOooOO0o != 1) {
            if (iOooOO0o == 2) {
                if (getHaveHistory()) {
                    ((k4) getBinding()).f58254OooO0oO.setCurrentItem(2);
                } else {
                    ((k4) getBinding()).f58254OooO0oO.setCurrentItem(1);
                }
            }
        } else if (getHaveHistory()) {
            ((k4) getBinding()).f58254OooO0oO.setCurrentItem(1);
        } else {
            ((k4) getBinding()).f58254OooO0oO.setCurrentItem(0);
        }
        updateIndicator();
    }

    private final void setAppBarLayoutState(boolean z) {
        this.appBarLayoutState.setValue(Boolean.valueOf(z));
    }

    private final void setCurrentItem(OooOO0 oooOO1) {
        this.currentItem.setValue(oooOO1);
    }

    private final void setHaveHistory(boolean z) {
        this.haveHistory.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setIndicator() {
        FragmentActivity context = requireActivity();
        Intrinsics.checkNotNullExpressionValue(context, "requireActivity()");
        Intrinsics.checkNotNullParameter(context, "context");
        o0oOOoo.o0oO0O0o.OooO00o oooO00o = new o0oOOoo.o0oO0O0o.OooO00o(context);
        oooO00o.OooO0O0(this.titles);
        ViewPagerFixed viewPagerFixed = ((k4) getBinding()).f58254OooO0oO;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.vpRoomRelated");
        oooO00o.OooO0Oo(viewPagerFixed);
        int i = oO00O0o.transparent;
        oooO00o.f56022OooO0o0 = o0000.OooO00o(i);
        oooO00o.f56024OooO0oo = o0000.OooO00o(i);
        oooO00o.f56016OooO = com.code.android.util.o0000O0.OooO00o(2.0f);
        oooO00o.f56025OooOO0 = o0000.OooO00o(oO00O0o.color_00d8c9);
        oooO00o.f56026OooOO0O = com.code.android.util.o0000O0.OooO00o(8.0f);
        oooO00o.f56027OooOO0o = com.code.android.util.o0000O0.OooO00o(2.0f);
        oooO00o.f56017OooO00o.setAdjustMode(true);
        YlTableLayout ylTableLayout = ((k4) getBinding()).f58252OooO0o;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.relatedMagicIndicator");
        oooO00o.OooO00o(ylTableLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showCreateRoomTipsBubble() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            if (o0o0o00OooO0o0.OooO0O0("related" + o000000O.OooOOo0().getValue(), false)) {
                if (this.bubbleView == null) {
                    this.bubbleView = (TipsBubbleView) ((k4) getBinding()).f58255OooO0oo.inflate().findViewById(oO00O0oO.room_related_tips_bubble);
                }
                TipsBubbleView tipsBubbleView = this.bubbleView;
                if (tipsBubbleView != null) {
                    tipsBubbleView.setDismissListener(new o00oO0o());
                }
                TipsBubbleView tipsBubbleView2 = this.bubbleView;
                if (tipsBubbleView2 != null) {
                    tipsBubbleView2.setContent(o0000.OooO0OO(oO00OOo0.tips_create_room));
                }
                TipsBubbleView tipsBubbleView3 = this.bubbleView;
                if (tipsBubbleView3 != null) {
                    tipsBubbleView3.OooO00o(false);
                }
                ((k4) getBinding()).f58249OooO0O0.OooO00o(this.appBarStateChangeListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateIndicator() {
        OooOO0 oooOO1;
        if (getHaveHistory()) {
            int currentItem = ((k4) getBinding()).f58254OooO0oO.getCurrentItem();
            if (currentItem == 0) {
                oooOO1 = OooOO0.RECENTLY;
            } else if (currentItem != 1) {
                oooOO1 = currentItem != 2 ? OooOO0.RECENTLY : OooOO0.FOLLOWING;
            } else {
                oooOO1 = OooOO0.JOINED;
            }
        } else {
            int currentItem2 = ((k4) getBinding()).f58254OooO0oO.getCurrentItem();
            oooOO1 = (currentItem2 == 0 || currentItem2 != 1) ? OooOO0.JOINED : OooOO0.FOLLOWING;
        }
        setCurrentItem(oooOO1);
    }

    @Override // p508o0o0O.OooOO0O, p418o0OoO000.Oooo000
    public void onEventMainThread(@NotNull p418o0OoO000.OooOo<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        int i = msg.f45532OooO00o;
        if (i != 54 && i != 158) {
            if (i != 159) {
                switch (i) {
                }
            } else {
                if (getIsLazyInit()) {
                    onRoomClick();
                    return;
                }
                return;
            }
        }
        if (getIsLazyInit()) {
            p408o0Oo0o0O.o00Oo0.OooO0o0().OooOOO(false);
            dismissCreateRoomTipsBubbleIfNeeded();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooOoO();
        }
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observe(getViewLifecycleOwner(), new o00Ooo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        p082o000OoOo.OooOO0O adapter = ((k4) getBinding()).f58254OooO0oO.getAdapter();
        boolean z = true;
        if (adapter != null && adapter.OooO0OO() == 2) {
            oO0O0OoO oo0o0oooOooOoOO = p581o0oOoo00.o000OOo.OooO00o().OooOoOO();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            ArrayList roomHistory = oo0o0oooOooOoOO.OooO00o(String.valueOf(o000000O.OooOOo0().getValue()));
            Intrinsics.checkNotNullExpressionValue(roomHistory, "roomHistory");
            if ((!roomHistory.isEmpty()) && Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                this.fragments.add(0, getMainRoomRelatedRecentlyFragment());
                getMainRoomRelatedRelatedJoinedFragment().setNeedReInit(true);
                getMainRoomRelatedRelatedFollowingFragment().setNeedReInit(true);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
                o000O0o o000o0o2 = new o000O0o(childFragmentManager, this.fragments);
                this.titles.add(0, o0000.OooO0OO(oO00OOo0.Recently));
                ((k4) getBinding()).f58254OooO0oO.setAdapter(o000o0o2);
                setHaveHistory(true);
                updateIndicator();
                setIndicator();
                return;
            }
            return;
        }
        p082o000OoOo.OooOO0O adapter2 = ((k4) getBinding()).f58254OooO0oO.getAdapter();
        if (adapter2 != null && adapter2.OooO0OO() == 3) {
            oO0O0OoO oo0o0oooOooOoOO2 = p581o0oOoo00.o000OOo.OooO00o().OooOoOO();
            o000000O o000000o3 = o000000O.f46674OooO00o;
            ArrayList arrayListOooO00o = oo0o0oooOooOoOO2.OooO00o(String.valueOf(o000000O.OooOOo0().getValue()));
            if (arrayListOooO00o != null && !arrayListOooO00o.isEmpty()) {
                z = false;
            }
            if (z && Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.FALSE)) {
                this.fragments.remove(0);
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
                o000O0o o000o0o3 = new o000O0o(childFragmentManager2, this.fragments);
                this.titles.remove(0);
                ((k4) getBinding()).f58254OooO0oO.setAdapter(o000o0o3);
                updateIndicator();
                setIndicator();
            }
        }
    }

    public final void onRoomClick() {
        if (o000000O.f46723OoooOoO) {
            o000000O.o0000 o0000Var = o000000O.f46724OoooOoo;
            if (o0000Var.getValue() == null) {
                oo000o onLogin = new oo000o();
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    return;
                }
                return;
            }
            RoomIndexModel value = o0000Var.getValue();
            if (value != null) {
                RoomModel roomModel = new RoomModel();
                roomModel.setName(value.barname);
                roomModel.setImage(value.barimage);
                roomModel.setBaridx(value.baridx);
                roomModel.setRoomIp(value.roomserverip);
                roomModel.websocketaddr = value.websocketaddr;
                roomModel.setId(com.code.android.util.o0OoOo0.OooO(0L, value.barid));
                MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
                p427o0OoOO00.o0OOO0o.OooO0o(roomModel, EnterRoomParentPage.Related_mine);
                dismissCreateRoomTipsBubbleIfNeeded();
            }
        }
    }

    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void saveLeavePage() {
        if (getIsLazyInit()) {
            int i = OooOo00.$EnumSwitchMapping$0[getCurrentItem().ordinal()];
            if (i == 1) {
                p408o0Oo0o0O.o00Oo0.OooOO0o().OooOOOO(0);
            } else if (i == 2) {
                p408o0Oo0o0O.o00Oo0.OooOO0o().OooOOOO(1);
            } else {
                if (i != 3) {
                    return;
                }
                p408o0Oo0o0O.o00Oo0.OooOO0o().OooOOOO(2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        boolean z = false;
        ((k4) getBinding()).f58249OooO0O0.OooO0o0(true, false, true);
        p082o000OoOo.OooOO0O adapter = ((k4) getBinding()).f58254OooO0oO.getAdapter();
        if (adapter != null && adapter.OooO0OO() == 2) {
            z = true;
        }
        if (z) {
            if (((k4) getBinding()).f58254OooO0oO.getCurrentItem() == 0) {
                getMainRoomRelatedRelatedJoinedFragment().scroolToTop();
                return;
            } else {
                if (((k4) getBinding()).f58254OooO0oO.getCurrentItem() == 1) {
                    getMainRoomRelatedRelatedFollowingFragment().scroolToTop();
                    return;
                }
                return;
            }
        }
        if (((k4) getBinding()).f58254OooO0oO.getCurrentItem() == 1) {
            getMainRoomRelatedRelatedJoinedFragment().scroolToTop();
        } else if (((k4) getBinding()).f58254OooO0oO.getCurrentItem() == 2) {
            getMainRoomRelatedRelatedFollowingFragment().scroolToTop();
        } else {
            getMainRoomRelatedRecentlyFragment().scrollToTop();
        }
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public k4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        k4 k4VarInflate = k4.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(k4VarInflate, "inflate(inflater, container, false)");
        CollapsingToolbarLayout collapsingToolbarLayout = k4VarInflate.f58250OooO0OO;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
        k4VarInflate.f58249OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o0OoO0.o00OOO00
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                MainRoomMineFragment.getViewBinding$lambda$0(this.f55422OooO00o, appBarLayout, i);
            }
        });
        return k4VarInflate;
    }
}
