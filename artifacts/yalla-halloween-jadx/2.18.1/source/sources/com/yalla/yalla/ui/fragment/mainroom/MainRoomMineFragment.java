package com.yalla.yalla.ui.fragment.mainroom;

import Oooo0.o00;
import Oooo000.o000OO00;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o0O0O00;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.android.billingclient.api.o00000O;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.RoomModel;
import com.app.base.view.tips.AppBarStateChangeListener;
import com.app.base.view.tips.TipsBubbleView;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFragment;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o00OO0O0.o0OOO0o;
import o0O0O00.o000000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o00O00o0;
import p028Oooo0o0.o0O00o00;
import p028Oooo0o0.o0O0OO0;
import p028Oooo0o0.oo00o;
import p031OoooO.o000000O;
import p031OoooO.o000Oo0;
import p032OoooO0.oo000o;
import p043OooooO0.o00O0000;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;
import p053o00000oO.o0000O00;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO00o0;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO00000o;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000O0Oo;
import p159o00OoOO.o000O;
import p254o00ooO0O.o0000oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000O0o;
import p261o00ooOoO.u;
import p263o00ooo.o000OO0O;
import p391o0OOooOo.o0O00000;
import p499o0o00OoO.o0OO00O;
import p507o0o00oOO.o0000O0;
import p510o0o00oo0.o0O0O0O;
import p563o0oOo0.o000OOo0;
import p649o0ooOOoo.db;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\bP\u0010QJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000f\u0010\u0005\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0002J\u001a\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0014J\u0006\u0010\u0019\u001a\u00020\u0003J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0014\u0010\u001f\u001a\u00020\u00032\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R+\u0010D\u001a\u00020<2\u0006\u0010=\u001a\u00020<8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010K\u001a\u00020E2\u0006\u0010=\u001a\u00020E8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010?\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010O\u001a\u00020<2\u0006\u0010=\u001a\u00020<8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010?\u001a\u0004\bM\u0010A\"\u0004\bN\u0010C¨\u0006S"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0ooOOoo/db;", "", "initView", "MyRoom", "(Lo000oOoO/oOO00O;I)V", "LOooo0o0/o00O00o0;", "CreateRoomContent", "(LOooo0o0/o00O00o0;Lo000oOoO/oOO00O;I)V", "Lcom/app/base/model/RoomIndexModel;", "roomInfo", "MyRoomContent", "(LOooo0o0/o00O00o0;Lcom/app/base/model/RoomIndexModel;Lo000oOoO/oOO00O;I)V", "TabIndicator", "resumeLeavePage", "updateIndicator", "showCreateRoomTipsBubble", "dismissCreateRoomTipsBubbleIfNeeded", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onRoomClick", "saveLeavePage", "onResume", "scrollToTop", "Lo00OOOoO/OooO0OO;", "msg", "onEventMainThread", "Lcom/app/base/view/tips/TipsBubbleView;", "bubbleView", "Lcom/app/base/view/tips/TipsBubbleView;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineRecentlyFragment;", "mainRoomRelatedRecentlyFragment$delegate", "Lkotlin/Lazy;", "getMainRoomRelatedRecentlyFragment", "()Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineRecentlyFragment;", "mainRoomRelatedRecentlyFragment", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineJoinedFragment;", "mainRoomRelatedRelatedJoinedFragment$delegate", "getMainRoomRelatedRelatedJoinedFragment", "()Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineJoinedFragment;", "mainRoomRelatedRelatedJoinedFragment", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment;", "mainRoomRelatedRelatedFollowingFragment$delegate", "getMainRoomRelatedRelatedFollowingFragment", "()Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment;", "mainRoomRelatedRelatedFollowingFragment", "", "Landroidx/fragment/app/Fragment;", "fragments", "Ljava/util/List;", "", "titles", "Lcom/app/base/view/tips/AppBarStateChangeListener;", "appBarStateChangeListener", "Lcom/app/base/view/tips/AppBarStateChangeListener;", "", "<set-?>", "appBarLayoutState$delegate", "Lo000oOoO/o0O00OO;", "getAppBarLayoutState", "()Z", "setAppBarLayoutState", "(Z)V", "appBarLayoutState", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment$OooO;", "currentItem$delegate", "getCurrentItem", "()Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment$OooO;", "setCurrentItem", "(Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFragment$OooO;)V", "currentItem", "haveHistory$delegate", "getHaveHistory", "setHaveHistory", "haveHistory", "<init>", "()V", "OooO", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomMineFragment extends MainRoomBaseFragment<db> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: appBarLayoutState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO appBarLayoutState;

    @NotNull
    private final AppBarStateChangeListener appBarStateChangeListener;

    @Nullable
    private TipsBubbleView bubbleView;

    /* JADX INFO: renamed from: currentItem$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO currentItem;

    /* JADX INFO: renamed from: haveHistory$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO haveHistory;

    /* JADX INFO: renamed from: mainRoomRelatedRecentlyFragment$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainRoomRelatedRecentlyFragment = LazyKt.lazy(o000oOoO.f24439Oooo0o);

    /* JADX INFO: renamed from: mainRoomRelatedRelatedJoinedFragment$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainRoomRelatedRelatedJoinedFragment = LazyKt.lazy(o00O0O.f24440Oooo0o);

    /* JADX INFO: renamed from: mainRoomRelatedRelatedFollowingFragment$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mainRoomRelatedRelatedFollowingFragment = LazyKt.lazy(o0OoOo0.f24443Oooo0o);

    @NotNull
    private final List<Fragment> fragments = new ArrayList();

    @NotNull
    private final List<String> titles = CollectionsKt.mutableListOf(o000O0O0.OooO0OO(R.string.room_type_add), o000O0O0.OooO0OO(R.string.room_type_follow));

    public enum OooO {
        RECENTLY,
        JOINED,
        FOLLOWING
    }

    public static final class OooO00o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f24421Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f24422Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00o0 o00o00o1, int i) {
            super(2);
            this.f24421Oooo0oO = o00o00o1;
            this.f24422Oooo0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            MainRoomMineFragment.this.CreateRoomContent(this.f24421Oooo0oO, ooo00o, this.f24422Oooo0oo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomMineFragment.this.onRoomClick();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f24425Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f24425Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            MainRoomMineFragment.this.MyRoom(ooo00o, this.f24425Oooo0oO | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f24426Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f24428Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RoomIndexModel f24429Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O00o0 o00o00o1, RoomIndexModel roomIndexModel, int i) {
            super(2);
            this.f24428Oooo0oO = o00o00o1;
            this.f24429Oooo0oo = roomIndexModel;
            this.f24426Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            MainRoomMineFragment.this.MyRoomContent(this.f24428Oooo0oO, this.f24429Oooo0oo, ooo00o, this.f24426Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((db) MainRoomMineFragment.this.getBinding()).f49165OooO0o.setCurrentItem(0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {
        public OooOO0O() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (MainRoomMineFragment.this.getHaveHistory()) {
                ((db) MainRoomMineFragment.this.getBinding()).f49165OooO0o.setCurrentItem(1);
            } else {
                ((db) MainRoomMineFragment.this.getBinding()).f49165OooO0o.setCurrentItem(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f24433Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(int i) {
            super(2);
            this.f24433Oooo0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            MainRoomMineFragment.this.TabIndicator(ooo00o, this.f24433Oooo0oO | 1);
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
            if (MainRoomMineFragment.this.getHaveHistory()) {
                ((db) MainRoomMineFragment.this.getBinding()).f49165OooO0o.setCurrentItem(2);
            } else {
                ((db) MainRoomMineFragment.this.getBinding()).f49165OooO0o.setCurrentItem(1);
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooOOOO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OooO.values().length];
            iArr[OooO.RECENTLY.ordinal()] = 1;
            iArr[OooO.JOINED.ordinal()] = 2;
            iArr[OooO.FOLLOWING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooOo implements ViewPager.OooOOO0 {
        public OooOo() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            o00000O.OooO0O0().OooO0o0(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + "USER_LEAVE_PAGE_RELATED", i);
            MainRoomMineFragment.this.updateIndicator();
        }
    }

    public static final class OooOo00 extends AppBarStateChangeListener {
        public OooOo00() {
        }

        @Override // com.app.base.view.tips.AppBarStateChangeListener
        public final void OooO0O0(@NotNull AppBarLayout appBarLayout, @NotNull AppBarStateChangeListener.State oldState, @NotNull AppBarStateChangeListener.State state) {
            TipsBubbleView tipsBubbleView;
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            Intrinsics.checkNotNullParameter(oldState, "oldState");
            Intrinsics.checkNotNullParameter(state, "state");
            AppBarStateChangeListener.State state2 = AppBarStateChangeListener.State.COLLAPSED;
            if (state == state2) {
                TipsBubbleView tipsBubbleView2 = MainRoomMineFragment.this.bubbleView;
                if (tipsBubbleView2 == null) {
                    return;
                }
                tipsBubbleView2.setVisibility(8);
                return;
            }
            if (oldState == state2 && state == AppBarStateChangeListener.State.IDLE && (tipsBubbleView = MainRoomMineFragment.this.bubbleView) != null) {
                tipsBubbleView.setVisibility(0);
            }
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public Oooo0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                MainRoomMineFragment.this.TabIndicator(ooo00o2, 8);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<oOO00O, Integer, Unit> {
        public Oooo000() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                MainRoomMineFragment.this.MyRoom(ooo00o2, 8);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<MainRoomMineRecentlyFragment> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o000oOoO f24439Oooo0o = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomMineRecentlyFragment invoke() {
            return new MainRoomMineRecentlyFragment();
        }
    }

    public static final class o00O0O extends Lambda implements Function0<MainRoomMineJoinedFragment> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00O0O f24440Oooo0o = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomMineJoinedFragment invoke() {
            return new MainRoomMineJoinedFragment();
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {
        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = MainRoomMineFragment.this.getContext();
            if (context != null) {
                o0O00000.OooO0OO("Room_create");
                CreateRoomActivity.f22774Ooooooo.OooO00o(context);
            }
            MainRoomMineFragment.this.dismissCreateRoomTipsBubbleIfNeeded();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo implements TipsBubbleView.OooO00o {
        public o00Ooo() {
        }

        @Override // com.app.base.view.tips.TipsBubbleView.OooO00o
        public final void OooO00o() {
            MainRoomMineFragment.this.dismissCreateRoomTipsBubbleIfNeeded();
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<MainRoomMineFollowingFragment> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0OoOo0 f24443Oooo0o = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomMineFollowingFragment invoke() {
            return new MainRoomMineFollowingFragment();
        }
    }

    public MainRoomMineFragment() {
        Boolean bool = Boolean.FALSE;
        this.appBarLayoutState = o0OOO00.OooO0Oo(bool);
        this.currentItem = o0OOO00.OooO0Oo(OooO.JOINED);
        this.haveHistory = o0OOO00.OooO0Oo(bool);
        this.appBarStateChangeListener = new OooOo00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v6, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void CreateRoomContent(o00O00o0 o00o00o1, oOO00O ooo00o, int i) {
        int i2;
        oOO00O composer = ooo00o.OooOOo(1629076778);
        if ((i & 14) == 0) {
            i2 = (composer.Oooo0oo(o00o00o1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composer.OooOo0()) {
            composer.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.mipmap.ic_main_room_create_bg, composer);
            o0O0O00.OooOO0.OooO00o.C0361OooO00o c0361OooO00o = o0O0O00.OooOO0.OooO00o.f35238OooO0O0;
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o00.OooO00o(o000oo0oOooO00o, null, o000O0o.OooO0OO(SizeKt.OooO0o0(oooO00o), composer), null, c0361OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
            o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, 81, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 65, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10);
            composer.OooO0o0(-483455358);
            p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
            o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
            composer.OooO0o0(-1323940314);
            o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o000.f6356OooO0o0);
            LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o000.f6360OooOO0O);
            o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o000.f6364OooOOOO);
            Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
            Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function0);
            } else {
                composer.Oooo00O();
            }
            composer.OooOo0O();
            Intrinsics.checkNotNullParameter(composer, "composer");
            oO00000o.OooO0O0(composer, o000000VarOooO00o, o000000.OooO00o.C0279OooO00o.f26581OooO0o0);
            oO00000o.OooO0O0(composer, oooO, o000000.OooO00o.C0279OooO00o.f26579OooO0Oo);
            oO00000o.OooO0O0(composer, layoutDirection, o000000.OooO00o.C0279OooO00o.f26580OooO0o);
            ((p043OooooO0.o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, o000000.OooO00o.C0279OooO00o.f26582OooO0oO, composer, "composer", composer), composer, 0);
            p031OoooO.o000O0O0.OooO0OO(p074o000O0oo.OooOOO.OooO00o(composer, 2058660585, -1163856341, R.string.Creat_Room, composer), SizeKt.OooO0oo(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 20, 1), u.OooO0O0(composer).OooO0oO(), o0000O0O.o00Oo0.OooO0OO(15), null, null, null, 0L, null, null, 0L, 2, false, 1, null, null, composer, 3120, 3120, 55280);
            o0000oo.OooO0OO(4, null, composer, 6, 2);
            p031OoooO.o000O0O0.OooO0OO(o00000.OooO0OO.OooO00o(R.string.Room_Describ, composer), SizeKt.OooO0oo(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 30, 1), u.OooO0O0(composer).OooO(), o0000O0O.o00Oo0.OooO0OO(13), null, null, null, 0L, null, null, 0L, 2, false, 1, null, null, composer, 3120, 3120, 55280);
            composer.Oooo0o0();
            composer.Oooo0o0();
            composer.Oooo0o();
            composer.Oooo0o0();
            composer.Oooo0o0();
            o000OO0O o000oo0oOooO00o2 = o00000.OooO0O0.OooO00o(R.mipmap.ic_main_room_crete_add, composer);
            o00OOOO0 o00oooo0OooOO0 = SizeKt.OooOO0(PaddingKt.OooO(o00o00o1.OooO00o(oooO00o, o00OO0O0.OooO00o.f4177OooO0oO), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 15, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 11), 35);
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            o00.OooO00o(o000oo0oOooO00o2, null, PaddingKt.OooO0o0(BackgroundKt.OooO0O0(o00oooo0OooOO0, o0000O0.f41710OooOo0, p033OoooO00.o00O0O.f3431OooO00o), 5), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 56, 120);
        }
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO00o(o00o00o1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r17v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MyRoom(oOO00O ooo00o, int i) {
        MainRoomMineFragment mainRoomMineFragment;
        oOO00O composer = ooo00o.OooOOo(643648320);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0o = SizeKt.OooO0o(oooO00o);
        composer.OooO0o0(733328855);
        o000000 o000000VarOooO0Oo = p028Oooo0o0.oOO00O.OooO0Oo(o00OO0O0.OooO00o.f4172OooO0O0, false, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r7 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO0Oo, r7);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r17 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((p043OooooO0.o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r17, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5741OooO00o;
        o00.OooO00o(o00000.OooO0O0.OooO00o(R.mipmap.ic_main_header_bg_bottom, composer), null, SizeKt.OooO0o(oooO00o), null, o0O0O00.OooOO0.OooO00o.f35242OooO0o0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 25016, 104);
        o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4176OooO0o0;
        float f = 16;
        float f2 = 8;
        p033OoooO00.o0OoOo0 o0oooo0OooO0OO = p033OoooO00.o00O0O.OooO0OO(15);
        o0000O0 o0000o1 = o0000O0.f41691OooO00o;
        long j = o0000O0.f41701OooOO0o;
        o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(p168o00Ooo0.OooOo.OooO0oO(SizeKt.OooO0oO(SizeKt.OooO0o(PaddingKt.OooO0oo(oooO00o, f, f2, f, f2)), 93), 12, o0oooo0OooO0OO, j, j, 4), false, false, null, new OooO0O0(), 253);
        o000000 o000000VarOooO00o = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((p043OooooO0.o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o, r7, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r17, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        oO0Oo oo0ooOooO0O0 = p044OooooOO.o00O00O.OooO0O0(p498o0o00Oo0.OooOOO.f41251Oooo0OO, composer);
        if (m465MyRoom$lambda6$lambda5$lambda4(oo0ooOooO0O0) != null) {
            composer.OooO0o0(-458586947);
            RoomIndexModel roomIndexModelM465MyRoom$lambda6$lambda5$lambda4 = m465MyRoom$lambda6$lambda5$lambda4(oo0ooOooO0O0);
            Intrinsics.checkNotNull(roomIndexModelM465MyRoom$lambda6$lambda5$lambda4);
            mainRoomMineFragment = this;
            mainRoomMineFragment.MyRoomContent(boxScopeInstance, roomIndexModelM465MyRoom$lambda6$lambda5$lambda4, composer, 582);
            composer.Oooo0o0();
        } else {
            mainRoomMineFragment = this;
            composer.OooO0o0(-458586876);
            mainRoomMineFragment.CreateRoomContent(boxScopeInstance, composer, 70);
            composer.Oooo0o0();
        }
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(mainRoomMineFragment.new OooO0OO(i));
    }

    /* JADX INFO: renamed from: MyRoom$lambda-6$lambda-5$lambda-4, reason: not valid java name */
    private static final RoomIndexModel m465MyRoom$lambda6$lambda5$lambda4(oO0Oo<? extends RoomIndexModel> oo0oo) {
        return oo0oo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    /* JADX WARN: Type inference failed for: r27v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r4v11, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MyRoomContent(o00O00o0 o00o00o1, RoomIndexModel roomIndexModel, oOO00O ooo00o, int i) {
        String str;
        oOO00O composer = ooo00o.OooOOo(1254035948);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o000OO0O o000oo0oOooO00o = o00000.OooO0O0.OooO00o(R.mipmap.ic_main_room_mine_bg, composer);
        o0O0O00.OooOO0.OooO00o.C0361OooO00o c0361OooO00o = o0O0O00.OooOO0.OooO00o.f35238OooO0O0;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00.OooO00o(o000oo0oOooO00o, null, o000O0o.OooO0OO(SizeKt.OooO0o0(oooO00o), composer), null, c0361OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 24632, 104);
        String str2 = roomIndexModel.barimage;
        if (str2 == null) {
            str2 = "";
        }
        composer.OooO0o0(604400049);
        oOO00O.OooOO0 oooOO0OooO00o = p114o00O00o.OooOOOO.OooO00o(p114o00O00o.o000oOoO.f30327OooO00o, composer);
        composer.OooO0o0(604401387);
        coil.request.OooO00o.C0072OooO00o c0072OooO00o = new coil.request.OooO00o.C0072OooO00o((Context) composer.OooOO0o(o0O0O00.f6591OooO0O0));
        c0072OooO00o.f9912OooO0OO = str2;
        Unit unit = Unit.INSTANCE;
        float f = 16;
        o00.OooO00o(com.umeng.analytics.pro.OooO00o.OooO0O0(c0072OooO00o, oooOO0OooO00o, composer), null, p442o0OoOo0.Oooo000.OooO00o(SizeKt.OooOO0(PaddingKt.OooO0oO(oooO00o, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), 56), p033OoooO00.o00O0O.OooO0OO(12)), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 48, 120);
        o00OOOO0 o00oooo0OooO = PaddingKt.OooO(oooO00o, 88, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 10);
        composer.OooO0o0(-483455358);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = oo00o.OooO00o(p028Oooo0o0.o00O000.f2032OooO0Oo, o00OO0O0.OooO00o.f4182OooOOO, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function0 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r13 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r13);
        ?? r3 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r3);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r27 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((p043OooooO0.o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r27, composer, "composer", composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-1163856341);
        String str3 = roomIndexModel.barname;
        if (str3 == null) {
            str3 = "";
        } else {
            Intrinsics.checkNotNullExpressionValue(str3, "roomInfo.barname ?: \"\"");
        }
        long jOooO0o = u.OooO0O0(composer).OooO0o();
        long jOooO0OO = o0000O0O.o00Oo0.OooO0OO(16);
        o0000O00.OooO00o oooO00o2 = o0000O00.f27125Oooo0oO;
        p031OoooO.o000O0O0.OooO0OO(str3, SizeKt.OooO0oo(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 20, 1), jOooO0o, jOooO0OO, null, o0000O00.f27127OoooO, null, 0L, null, null, 0L, 2, false, 1, null, null, composer, 199728, 3120, 55248);
        float f2 = 4;
        o0000oo.OooO0OO(f2, null, composer, 6, 2);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        composer.OooO0o0(693286680);
        o000000 o000000VarOooO00o2 = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0000O0O.OooO oooO2 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(oooO00o);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function0);
        } else {
            composer.Oooo00O();
        }
        ((p043OooooO0.o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r13, composer, oooO2, r3, composer, layoutDirection2, r4, composer, o00ooooo3, r27, composer, "composer", composer), composer, 0);
        float f3 = 14;
        o00.OooO00o(com.umeng.commonsdk.OooO00o.OooO00o(composer, 2058660585, -678309503, R.mipmap.ic_main_room_mine_lv, composer), null, SizeKt.OooOO0(oooO00o, f3), null, null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, composer, 440, 120);
        o0000oo.OooO0O0(f2, null, composer, 6, 2);
        String str4 = roomIndexModel.barlevel;
        String str5 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (str4 == null) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        } else {
            Intrinsics.checkNotNullExpressionValue(str4, "roomInfo.barlevel ?: \"0\"");
            str = str4;
        }
        p031OoooO.o000O0O0.OooO0OO(str, null, u.OooO0O0(composer).OooO0oO(), o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
        o0000oo.OooO0O0(f, null, composer, 6, 2);
        o0O0O0O.OooO00o("svga/anim_room_live.svga", true, 0, null, SizeKt.OooOO0(oooO00o, f3), composer, 24630, 12);
        o0000oo.OooO0O0(f2, null, composer, 6, 2);
        String str6 = roomIndexModel.onlinenum;
        if (str6 != null) {
            Intrinsics.checkNotNullExpressionValue(str6, "roomInfo.onlinenum ?: \"0\"");
            str5 = str6;
        }
        p031OoooO.o000O0O0.OooO0OO(str5, null, u.OooO0O0(composer).OooO0oO(), o0000O0O.o00Oo0.OooO0OO(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 3072, 0, 65522);
        o0O0OO0.OooO00o(composer);
        o0000oo.OooO0OO(f2, null, composer, 6, 2);
        String str7 = roomIndexModel.notice;
        if (!(str7 == null || StringsKt.isBlank(str7))) {
            String notice = roomIndexModel.notice;
            long jOooO = u.OooO0O0(composer).OooO();
            long jOooO0OO2 = o0000O0O.o00Oo0.OooO0OO(12);
            o00OOOO0 o00oooo0OooO0oo = SizeKt.OooO0oo(oooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 30, 1);
            Intrinsics.checkNotNullExpressionValue(notice, "notice");
            p031OoooO.o000O0O0.OooO0OO(notice, o00oooo0OooO0oo, jOooO, jOooO0OO2, null, null, null, 0L, null, null, 0L, 2, false, 1, null, null, composer, 3120, 3120, 55280);
        }
        oo0ooO oo0oooOooO00o = oo000o.OooO00o(composer);
        if (oo0oooOooO00o == null) {
            return;
        }
        oo0oooOooO00o.OooO00o(new OooO0o(o00o00o1, roomIndexModel, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r26v0, types: [kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.platform.o00OOOOo, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO] */
    /* JADX WARN: Type inference failed for: r4v11, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0000O0O.OooO, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO00o] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2<o000000.OooO00o, o0O0O00.o000000, kotlin.Unit>, o000000.OooO00o$OooO00o$OooO0OO] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void TabIndicator(oOO00O ooo00o, int i) {
        long j;
        String str;
        int i2;
        long j2;
        Function0<o000000.OooO00o> function0;
        long jOooO;
        long j3;
        long jOooO2;
        long j4;
        long jOooO3;
        oOO00O composer = ooo00o.OooOOo(53148941);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        if (getAppBarLayoutState()) {
            o0000O0 o0000o1 = o0000O0.f41691OooO00o;
            j = o0000O0.f41693OooO0OO;
        } else {
            o0000O0 o0000o2 = o0000O0.f41691OooO00o;
            j = o0000O0.f41692OooO0O0;
        }
        oO0Oo oo0ooOooO00o = o000OO00.OooO00o(j, null, composer, 0, 6);
        o00OO0OO.OooO0O0 oooO0O0 = o00OO0O0.OooO00o.f4181OooOO0o;
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o00OOOO0 o00oooo0OooO0oO = PaddingKt.OooO0oO(BackgroundKt.OooO0O0(SizeKt.OooO0oO(SizeKt.OooO0o(oooO00o), 44), m466TabIndicator$lambda10(oo0ooOooO00o), o000O0Oo.f32099OooO00o), 16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2);
        composer.OooO0o0(693286680);
        p028Oooo0o0.o00O000 o00o001 = p028Oooo0o0.o00O000.f2029OooO00o;
        o000000 o000000VarOooO00o = o0O00o00.OooO00o(p028Oooo0o0.o00O000.f2030OooO0O0, oooO0O0, composer);
        composer.OooO0o0(-1323940314);
        o0O0O0o0<o0000O0O.OooO> o0o0o0o0 = o000.f6356OooO0o0;
        o0000O0O.OooO oooO = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        o0O0O0o0<LayoutDirection> o0o0o0o1 = o000.f6360OooOO0O;
        LayoutDirection layoutDirection = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o0O0O0o0<o00OOOOo> o0o0o0o2 = o000.f6364OooOOOO;
        o00OOOOo o00ooooo2 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Objects.requireNonNull(o000000.OooO00o.f26575OooO0Oo);
        Function0<o000000.OooO00o> function1 = o000000.OooO00o.C0279OooO00o.f26577OooO0O0;
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O0 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0oO);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function1);
        } else {
            composer.Oooo00O();
        }
        composer.OooOo0O();
        Intrinsics.checkNotNullParameter(composer, "composer");
        ?? r9 = o000000.OooO00o.C0279OooO00o.f26581OooO0o0;
        oO00000o.OooO0O0(composer, o000000VarOooO00o, r9);
        ?? r7 = o000000.OooO00o.C0279OooO00o.f26579OooO0Oo;
        oO00000o.OooO0O0(composer, oooO, r7);
        ?? r4 = o000000.OooO00o.C0279OooO00o.f26580OooO0o;
        oO00000o.OooO0O0(composer, layoutDirection, r4);
        ?? r26 = o000000.OooO00o.C0279OooO00o.f26582OooO0oO;
        ((p043OooooO0.o00) function3OooO0O0).invoke(Oooo000.OooO0o.OooO00o(composer, o00ooooo2, r26, composer, "composer", composer), composer, 0);
        o000000O.OooO0O0(composer, 2058660585, -678309503, -1799152109);
        if (getHaveHistory()) {
            o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4175OooO0o;
            o00OOOO0 o00oooo0OooO0oO2 = SizeKt.OooO0oO(oooO00o, 31);
            OooO currentItem = getCurrentItem();
            OooO oooO2 = OooO.RECENTLY;
            if (currentItem == oooO2) {
                o0000O0 o0000o3 = o0000O0.f41691OooO00o;
                j4 = o0000O0.f41712OooOo0O;
            } else {
                o0000O0 o0000o4 = o0000O0.f41691OooO00o;
                j4 = o0000O0.f41787o000O000;
            }
            float f = 12;
            o00OOOO0 o00oooo0OooO0O0 = o000O0o.OooO0O0(PaddingKt.OooO0oO(BackgroundKt.OooO0O0(o00oooo0OooO0oO2, j4, p033OoooO00.o00O0O.OooO00o()), f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), false, false, null, new OooOO0(), 253);
            o000000 o000000VarOooO00o2 = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo, false, composer, -1323940314);
            o0000O0O.OooO oooO3 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
            LayoutDirection layoutDirection2 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
            o00OOOOo o00ooooo3 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
            Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O1 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O0);
            if (!(composer.OooOo0o() instanceof o00O000)) {
                o00O00O.OooO00o();
                throw null;
            }
            composer.OooOo00();
            if (composer.OooOOO0()) {
                composer.OooOoO0(function1);
            } else {
                composer.Oooo00O();
            }
            str = "composer";
            ((p043OooooO0.o00) function3OooO0O1).invoke(o000Oo0.OooO00o(composer, composer, "composer", composer, o000000VarOooO00o2, r9, composer, oooO3, r7, composer, layoutDirection2, r4, composer, o00ooooo3, r26, composer, str, composer), composer, 0);
            composer.OooO0o0(2058660585);
            composer.OooO0o0(-2137368960);
            String strOooO00o = o00000.OooO0OO.OooO00o(R.string.Recently, composer);
            composer.OooO0o0(-1799151441);
            if (getCurrentItem() == oooO2) {
                o0000O0 o0000o5 = o0000O0.f41691OooO00o;
                jOooO3 = o0000O0.f41710OooOo0;
            } else {
                jOooO3 = u.OooO0O0(composer).OooO();
            }
            composer.Oooo0o0();
            p031OoooO.o000O0O0.OooO0OO(strOooO00o, null, jOooO3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65530);
            o0O0OO0.OooO00o(composer);
            i2 = 2;
            o0000oo.OooO0O0(f, null, composer, 6, 2);
        } else {
            str = "composer";
            i2 = 2;
        }
        composer.Oooo0o0();
        o00OO0OO o00oo0oo2 = o00OO0O0.OooO00o.f4175OooO0o;
        float f2 = 31;
        o00OOOO0 o00oooo0OooO0oO3 = SizeKt.OooO0oO(oooO00o, f2);
        OooO currentItem2 = getCurrentItem();
        OooO oooO4 = OooO.JOINED;
        if (currentItem2 == oooO4) {
            o0000O0 o0000o6 = o0000O0.f41691OooO00o;
            j2 = o0000O0.f41712OooOo0O;
        } else {
            o0000O0 o0000o7 = o0000O0.f41691OooO00o;
            j2 = o0000O0.f41787o000O000;
        }
        float f3 = 12;
        o00OOOO0 o00oooo0OooO0O1 = o000O0o.OooO0O0(PaddingKt.OooO0oO(BackgroundKt.OooO0O0(o00oooo0OooO0oO3, j2, p033OoooO00.o00O0O.OooO00o()), f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i2), false, false, null, new OooOO0O(), 253);
        o000000 o000000VarOooO00o3 = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo2, false, composer, -1323940314);
        o0000O0O.OooO oooO5 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection3 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo4 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O2 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O1);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            function0 = function1;
            composer.OooOoO0(function0);
        } else {
            function0 = function1;
            composer.Oooo00O();
        }
        Function0<o000000.OooO00o> function2 = function0;
        ((p043OooooO0.o00) function3OooO0O2).invoke(o000Oo0.OooO00o(composer, composer, str, composer, o000000VarOooO00o3, r9, composer, oooO5, r7, composer, layoutDirection3, r4, composer, o00ooooo4, r26, composer, str, composer), composer, 0);
        composer.OooO0o0(2058660585);
        composer.OooO0o0(-2137368960);
        String strOooO00o2 = o00000.OooO0OO.OooO00o(R.string.Joined, composer);
        composer.OooO0o0(-1799150630);
        if (getCurrentItem() == oooO4) {
            o0000O0 o0000o8 = o0000O0.f41691OooO00o;
            jOooO = o0000O0.f41710OooOo0;
        } else {
            jOooO = u.OooO0O0(composer).OooO();
        }
        composer.Oooo0o0();
        p031OoooO.o000O0O0.OooO0OO(strOooO00o2, null, jOooO, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65530);
        o0O0OO0.OooO00o(composer);
        o0000oo.OooO0O0(f3, null, composer, 6, 2);
        o00OOOO0 o00oooo0OooO0oO4 = SizeKt.OooO0oO(oooO00o, f2);
        OooO currentItem3 = getCurrentItem();
        OooO oooO6 = OooO.FOLLOWING;
        if (currentItem3 == oooO6) {
            o0000O0 o0000o9 = o0000O0.f41691OooO00o;
            j3 = o0000O0.f41712OooOo0O;
        } else {
            o0000O0 o0000o10 = o0000O0.f41691OooO00o;
            j3 = o0000O0.f41787o000O000;
        }
        o00OOOO0 o00oooo0OooO0O2 = o000O0o.OooO0O0(PaddingKt.OooO0oO(BackgroundKt.OooO0O0(o00oooo0OooO0oO4, j3, p033OoooO00.o00O0O.OooO00o()), f3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 2), false, false, null, new OooOOO0(), 253);
        o000000 o000000VarOooO00o4 = o00O00O.OooO0OO.OooO00o(composer, 733328855, o00oo0oo2, false, composer, -1323940314);
        o0000O0O.OooO oooO7 = (o0000O0O.OooO) composer.OooOO0o(o0o0o0o0);
        LayoutDirection layoutDirection4 = (LayoutDirection) composer.OooOO0o(o0o0o0o1);
        o00OOOOo o00ooooo5 = (o00OOOOo) composer.OooOO0o(o0o0o0o2);
        Function3<o0OO00o0<o000000.OooO00o>, oOO00O, Integer, Unit> function3OooO0O3 = o0O0O00.o00Oo0.OooO0O0(o00oooo0OooO0O2);
        if (!(composer.OooOo0o() instanceof o00O000)) {
            o00O00O.OooO00o();
            throw null;
        }
        composer.OooOo00();
        if (composer.OooOOO0()) {
            composer.OooOoO0(function2);
        } else {
            composer.Oooo00O();
        }
        ((p043OooooO0.o00) function3OooO0O3).invoke(o000Oo0.OooO00o(composer, composer, str, composer, o000000VarOooO00o4, r9, composer, oooO7, r7, composer, layoutDirection4, r4, composer, o00ooooo5, r26, composer, str, composer), composer, 0);
        String strOooO00o3 = p074o000O0oo.OooOOO.OooO00o(composer, 2058660585, -2137368960, R.string.Following, composer);
        if (getCurrentItem() == oooO6) {
            o0000O0 o0000o11 = o0000O0.f41691OooO00o;
            jOooO2 = o0000O0.f41710OooOo0;
        } else {
            jOooO2 = u.OooO0O0(composer).OooO();
        }
        p031OoooO.o000O0O0.OooO0OO(strOooO00o3, null, jOooO2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 0, 0, 65530);
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o0();
        composer.Oooo0o();
        composer.Oooo0o0();
        composer.Oooo0o0();
        oo0ooO oo0oooOooOo = composer.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooOOO(i));
    }

    /* JADX INFO: renamed from: TabIndicator$lambda-10, reason: not valid java name */
    private static final long m466TabIndicator$lambda10(oO0Oo<o00000O0> oo0oo) {
        return oo0oo.getValue().f32070OooO00o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.google.android.material.appbar.AppBarLayout$OooO0O0>] */
    public final void dismissCreateRoomTipsBubbleIfNeeded() {
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p497o0o00Oo.OooOOO0.OooO0o0().OooOOo0(false);
        AppBarLayout appBarLayout = ((db) getBinding()).f49162OooO0O0;
        AppBarStateChangeListener appBarStateChangeListener = this.appBarStateChangeListener;
        ?? r0 = appBarLayout.f16369OoooO;
        if (r0 != 0 && appBarStateChangeListener != null) {
            r0.remove(appBarStateChangeListener);
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
    private final OooO getCurrentItem() {
        return (OooO) this.currentItem.getValue();
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
    /* JADX INFO: renamed from: getViewBinding$lambda-0, reason: not valid java name */
    public static final void m467getViewBinding$lambda0(MainRoomMineFragment this$0, AppBarLayout appBarLayout, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setAppBarLayoutState(Math.abs(i) == appBarLayout.getTotalScrollRange());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((db) getBinding()).f49161OooO00o.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o0oOoo0.o00O00O
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return MainRoomMineFragment.m468initView$lambda2(view, windowInsets);
            }
        });
        ((db) getBinding()).f49162OooO0O0.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o0oOoo0.oOO00O
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return MainRoomMineFragment.m469initView$lambda3(view, windowInsets);
            }
        });
        this.fragments.add(getMainRoomRelatedRelatedJoinedFragment());
        this.fragments.add(getMainRoomRelatedRelatedFollowingFragment());
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
            List<RoomHistory> listOooO00o = p491o0o00O00.OooO0OO.OooO00o().OooOoo().OooO00o(String.valueOf(oooOOO.OooOo().getValue()));
            Intrinsics.checkNotNullExpressionValue(listOooO00o, "DB.roomHistoryDao().getR….userId.value.toString())");
            if (!listOooO00o.isEmpty()) {
                this.fragments.add(0, getMainRoomRelatedRecentlyFragment());
                this.titles.add(0, o000O0O0.OooO0OO(R.string.Recently));
                setHaveHistory(true);
            }
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        ((db) getBinding()).f49165OooO0o.setAdapter(new o000OOo0(childFragmentManager, this.fragments));
        ((db) getBinding()).f49165OooO0o.setOffscreenPageLimit(2);
        ((db) getBinding()).f49165OooO0o.OooO0O0(new OooOo());
        ((db) getBinding()).f49166OooO0o0.setContent(o00O0000.OooO0O0(-113759210, true, new Oooo000()));
        ((db) getBinding()).f49164OooO0Oo.setContent(o00O0000.OooO0O0(-493011699, true, new Oooo0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final WindowInsets m468initView$lambda2(View view, WindowInsets windowInsets) {
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final WindowInsets m469initView$lambda3(View view, WindowInsets windowInsets) {
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-1, reason: not valid java name */
    public static final void m470onLazyInit$lambda1(MainRoomMineFragment this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.showCreateRoomTipsBubble();
            this$0.resumeLeavePage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resumeLeavePage() {
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.FALSE)) {
            ((db) getBinding()).f49165OooO0o.setCurrentItem(1);
            return;
        }
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        int iOooOO0o = p497o0o00Oo.OooOOO0.OooOOO0().OooOO0o();
        if (iOooOO0o == 0) {
            ((db) getBinding()).f49165OooO0o.setCurrentItem(0);
        } else if (iOooOO0o != 1) {
            if (iOooOO0o == 2) {
                if (getHaveHistory()) {
                    ((db) getBinding()).f49165OooO0o.setCurrentItem(2);
                } else {
                    ((db) getBinding()).f49165OooO0o.setCurrentItem(1);
                }
            }
        } else if (getHaveHistory()) {
            ((db) getBinding()).f49165OooO0o.setCurrentItem(1);
        } else {
            ((db) getBinding()).f49165OooO0o.setCurrentItem(0);
        }
        updateIndicator();
    }

    private final void setAppBarLayoutState(boolean z) {
        this.appBarLayoutState.setValue(Boolean.valueOf(z));
    }

    private final void setCurrentItem(OooO oooO) {
        this.currentItem.setValue(oooO);
    }

    private final void setHaveHistory(boolean z) {
        this.haveHistory.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showCreateRoomTipsBubble() {
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            o0OO00O o0oo00oOooO0o0 = p497o0o00Oo.OooOOO0.OooO0o0();
            StringBuilder sbOooO00o = p142o00OOooO.o000OO00.OooO00o(o0oo00oOooO0o0, "related");
            sbOooO00o.append(oooOOO.OooOo().getValue());
            if (o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false)) {
                if (this.bubbleView == null) {
                    this.bubbleView = (TipsBubbleView) ((db) getBinding()).f49167OooO0oO.inflate().findViewById(R.id.room_related_tips_bubble);
                }
                TipsBubbleView tipsBubbleView = this.bubbleView;
                if (tipsBubbleView != null) {
                    tipsBubbleView.setDismissListener(new o00Ooo());
                }
                TipsBubbleView tipsBubbleView2 = this.bubbleView;
                if (tipsBubbleView2 != null) {
                    tipsBubbleView2.setContent(o000O0O0.OooO0OO(R.string.tips_create_room));
                }
                TipsBubbleView tipsBubbleView3 = this.bubbleView;
                if (tipsBubbleView3 != null) {
                    tipsBubbleView3.OooO00o(false);
                }
                ((db) getBinding()).f49162OooO0O0.OooO00o(this.appBarStateChangeListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateIndicator() {
        OooO oooO;
        if (getHaveHistory()) {
            int currentItem = ((db) getBinding()).f49165OooO0o.getCurrentItem();
            if (currentItem == 0) {
                oooO = OooO.RECENTLY;
            } else if (currentItem != 1) {
                oooO = currentItem != 2 ? OooO.RECENTLY : OooO.FOLLOWING;
            } else {
                oooO = OooO.JOINED;
            }
        } else {
            int currentItem2 = ((db) getBinding()).f49165OooO0o.getCurrentItem();
            oooO = (currentItem2 == 0 || currentItem2 != 1) ? OooO.JOINED : OooO.FOLLOWING;
        }
        setCurrentItem(oooO);
    }

    @Override // p503o0o00o00.OooO, p140o00OOOoO.OooO0o
    public void onEventMainThread(@NotNull p140o00OOOoO.OooO0OO<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        int i = msg.f31885OooO00o;
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
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0o0().OooOOo0(false);
            dismissCreateRoomTipsBubbleIfNeeded();
            p498o0o00Oo0.OooOOO.f41216OooO00o.Oooo000();
        }
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().observe(getViewLifecycleOwner(), new o000O(this, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        p105o000oo0o.o00Ooo adapter = ((db) getBinding()).f49165OooO0o.getAdapter();
        boolean z = true;
        if (adapter != null && adapter.OooO0OO() == 2) {
            p517o0o0O00O.o00000O o00000oOooOoo = p491o0o00O00.OooO0OO.OooO00o().OooOoo();
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            List<RoomHistory> roomHistory = o00000oOooOoo.OooO00o(String.valueOf(oooOOO.OooOo().getValue()));
            Intrinsics.checkNotNullExpressionValue(roomHistory, "roomHistory");
            if ((!roomHistory.isEmpty()) && Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
                this.fragments.add(0, getMainRoomRelatedRecentlyFragment());
                getMainRoomRelatedRelatedJoinedFragment().setNeedReInit(true);
                getMainRoomRelatedRelatedFollowingFragment().setNeedReInit(true);
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
                o000OOo0 o000ooo1 = new o000OOo0(childFragmentManager, this.fragments);
                this.titles.add(0, o000O0O0.OooO0OO(R.string.Recently));
                ((db) getBinding()).f49165OooO0o.setAdapter(o000ooo1);
                setHaveHistory(true);
                updateIndicator();
                return;
            }
            return;
        }
        p105o000oo0o.o00Ooo adapter2 = ((db) getBinding()).f49165OooO0o.getAdapter();
        if (adapter2 != null && adapter2.OooO0OO() == 3) {
            p517o0o0O00O.o00000O o00000oOooOoo2 = p491o0o00O00.OooO0OO.OooO00o().OooOoo();
            p498o0o00Oo0.OooOOO oooOOO2 = p498o0o00Oo0.OooOOO.f41216OooO00o;
            List<RoomHistory> listOooO00o = o00000oOooOoo2.OooO00o(String.valueOf(oooOOO2.OooOo().getValue()));
            if (listOooO00o != null && !listOooO00o.isEmpty()) {
                z = false;
            }
            if (z && Intrinsics.areEqual(oooOOO2.OooOooO().getValue(), Boolean.FALSE)) {
                this.fragments.remove(0);
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "childFragmentManager");
                o000OOo0 o000ooo2 = new o000OOo0(childFragmentManager2, this.fragments);
                this.titles.remove(0);
                ((db) getBinding()).f49165OooO0o.setAdapter(o000ooo2);
                updateIndicator();
            }
        }
    }

    public final void onRoomClick() {
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (p498o0o00Oo0.OooOOO.f41250Oooo0O0) {
            if (p498o0o00Oo0.OooOOO.f41251Oooo0OO.getValue() == null) {
                o00Oo0 onLogin = new o00Oo0();
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return;
                }
                Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                    return;
                }
                return;
            }
            RoomIndexModel value = p498o0o00Oo0.OooOOO.f41251Oooo0OO.getValue();
            if (value != null) {
                RoomModel roomModel = new RoomModel();
                roomModel.setName(value.barname);
                roomModel.setImage(value.barimage);
                roomModel.setBaridx(value.baridx);
                roomModel.setRoomIp(value.roomserverip);
                String str = value.barid;
                Intrinsics.checkNotNullExpressionValue(str, "it.barid");
                roomModel.setId(com.yalla.support.common.util.OooO.OooO0oO(str));
                RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Related_mine);
                dismissCreateRoomTipsBubbleIfNeeded();
                o0O00000.OooO0OO("Room_myroom");
            }
        }
    }

    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void saveLeavePage() {
        if (getIsLazyInit()) {
            int i = OooOOOO.$EnumSwitchMapping$0[getCurrentItem().ordinal()];
            if (i == 1) {
                p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                p497o0o00Oo.OooOOO0.OooOOO0().OooOOOo(0);
            } else if (i == 2) {
                p497o0o00Oo.OooOOO0 oooOOO1 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                p497o0o00Oo.OooOOO0.OooOOO0().OooOOOo(1);
            } else {
                if (i != 3) {
                    return;
                }
                p497o0o00Oo.OooOOO0 oooOOO2 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                p497o0o00Oo.OooOOO0.OooOOO0().OooOOOo(2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        boolean z = false;
        ((db) getBinding()).f49162OooO0O0.OooO0o0(true, false, true);
        p105o000oo0o.o00Ooo adapter = ((db) getBinding()).f49165OooO0o.getAdapter();
        if (adapter != null && adapter.OooO0OO() == 2) {
            z = true;
        }
        if (z) {
            if (((db) getBinding()).f49165OooO0o.getCurrentItem() == 0) {
                getMainRoomRelatedRelatedJoinedFragment().scroolToTop();
                return;
            } else {
                if (((db) getBinding()).f49165OooO0o.getCurrentItem() == 1) {
                    getMainRoomRelatedRelatedFollowingFragment().scroolToTop();
                    return;
                }
                return;
            }
        }
        if (((db) getBinding()).f49165OooO0o.getCurrentItem() == 1) {
            getMainRoomRelatedRelatedJoinedFragment().scroolToTop();
        } else if (((db) getBinding()).f49165OooO0o.getCurrentItem() == 2) {
            getMainRoomRelatedRelatedFollowingFragment().scroolToTop();
        } else {
            getMainRoomRelatedRecentlyFragment().scrollToTop();
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public db getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        db dbVarInflate = db.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dbVarInflate, "inflate(inflater, container, false)");
        CollapsingToolbarLayout collapsingToolbarLayout = dbVarInflate.f49163OooO0OO;
        WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
        dbVarInflate.f49162OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0oOoo0.o00O00OO
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                MainRoomMineFragment.m467getViewBinding$lambda0(this.f46963OooO00o, appBarLayout, i);
            }
        });
        return dbVarInflate;
    }
}
