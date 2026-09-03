package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.app.base.adapter.roomExplore.RoomExploreEventsManager;
import com.app.base.adapter.roomExplore.RoomExploreHeadView;
import com.app.base.adapter.roomExplore.RoomExploreHotHeadView;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.RoomIndexModel;
import com.app.base.model.RoomModel;
import com.app.base.view.StatusView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.facebook.appevents.AppEventsConstants;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment;
import com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel;
import com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadCountryHotSort$1;
import com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadTagData$1;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p144o00OOooo.o00O00;
import p144o00OOooo.o00O0O0;
import p177o00OoooO.oO00o00O;
import p178o00Ooooo.oO0O00O;
import p255o00ooO0O.oOO00O;
import p393o0OOooOo.o0O00000;
import p500o0o00Oo0.o00O;
import p500o0o00Oo0.o00O0OO0;
import p526o0o0O0oO.oo00oO;
import p568o0oOo00O.oO0000o0;
import p607o0oo00oo.oO0OOo0o;
import p618o0oo0Ooo.oO0O000o;
import p651o0ooOOoo.y8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0014J\u0006\u0010\u0013\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0014\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016J\u0016\u0010\u001b\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0019H\u0016J\u0014\u0010\u001c\u001a\u00020\u00032\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainExploreFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0ooOOoo/y8;", "", "initView", "initObserver", "showOrInitErrorView", "Lcom/app/base/model/RoomIndexModel;", "item", "", "index", "enterRoom", "refreshLoad", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "uploadApiStatistical", "onResume", "onPause", "", "data", "removeDuplicatesData", "Lo00OOOoO/OooO0OO;", "msg", "onEvent", "onEventMainThread", "scrollToTop", "Lcom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "getMViewModel", "()Lcom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel;", "mViewModel", "hotTop3List", "Ljava/util/List;", "hotDataList", "Lcom/app/base/adapter/roomExplore/RoomExploreHeadView;", "mRoomExploreHeadView$delegate", "getMRoomExploreHeadView", "()Lcom/app/base/adapter/roomExplore/RoomExploreHeadView;", "mRoomExploreHeadView", "Lcom/app/base/adapter/roomExplore/RoomExploreHotHeadView;", "mHotHeadView", "Lcom/app/base/adapter/roomExplore/RoomExploreHotHeadView;", "Landroid/util/LongSparseArray;", "", "sparseArray", "Landroid/util/LongSparseArray;", "Lcom/app/base/adapter/roomExplore/RoomExploreEventsManager;", "mEventsManager", "Lcom/app/base/adapter/roomExplore/RoomExploreEventsManager;", "Lcom/app/base/view/StatusView;", "mErrorView", "Lcom/app/base/view/StatusView;", "", "isFirstApiStatistical", "Z", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainExploreFragment extends MainRoomBaseFragment<y8> {
    public static final int $stable = 8;
    private boolean isFirstApiStatistical;

    @Nullable
    private p189o00o00o0.OooO0OO<RoomIndexModel> mAdapter;

    @Nullable
    private StatusView mErrorView;

    @Nullable
    private RoomExploreEventsManager mEventsManager;

    @Nullable
    private RoomExploreHotHeadView mHotHeadView;

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt.lazy(new OooOO0());

    @NotNull
    private final List<RoomIndexModel> hotTop3List = new ArrayList();

    @NotNull
    private final List<RoomIndexModel> hotDataList = new ArrayList();

    /* JADX INFO: renamed from: mRoomExploreHeadView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRoomExploreHeadView = LazyKt.lazy(new OooO());

    @NotNull
    private final LongSparseArray<String> sparseArray = new LongSparseArray<>();

    public static final class OooO extends Lambda implements Function0<RoomExploreHeadView> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomExploreHeadView invoke() {
            return new RoomExploreHeadView(MainExploreFragment.this.getActivity());
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            com.yalla.yalla.ui.fragment.OooO0OO onLogin = new com.yalla.yalla.ui.fragment.OooO0OO(MainExploreFragment.this);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = p255o00ooO0O.o00000O.f34276OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21771Oooooo0;
                    o00OO0O0.o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<RoomIndexModel, Integer, Unit> {
        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(RoomIndexModel roomIndexModel, Integer num) {
            RoomIndexModel data = roomIndexModel;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(data, "data");
            MainExploreFragment.this.enterRoom(data, iIntValue);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends p189o00o00o0.OooO0OO<RoomIndexModel> {
        public OooO0OO(Context context, List<RoomIndexModel> list) {
            super(context, R.layout.item_hot_room_list, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:25:0x0099  */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p189o00o00o0.OooO0o helper = (p189o00o00o0.OooO0o) oooO00o;
            RoomIndexModel item = (RoomIndexModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            int layoutPosition = helper.getLayoutPosition();
            p189o00o00o0.OooO0OO oooO0OO = MainExploreFragment.this.mAdapter;
            Intrinsics.checkNotNull(oooO0OO);
            if (layoutPosition - oooO0OO.getHeaderLayoutCount() > 2) {
                helper.OooO0oO(R.id.ll_room_online, false);
                helper.OooO0oO(R.id.ll_room_name, false);
            } else {
                helper.OooO0oO(R.id.ll_room_online, true);
                helper.OooO0oO(R.id.ll_room_name, true);
                helper.OooO0oO(R.id.iv_honor, true);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) helper.OooO0Oo(R.id.iv_honor);
                lottieAnimationView.OooO0Oo();
                String str = item.bartype;
                if (str != null) {
                    switch (str) {
                        case "2":
                            helper.OooO0oo(R.id.iv_honor, R.drawable.room_princess_garden1);
                            break;
                        case "3":
                            helper.OooO0oo(R.id.iv_honor, R.drawable.room_dreamland1);
                            break;
                        case "4":
                            helper.OooO0oo(R.id.iv_honor, R.drawable.upgraderoom_crown_somall);
                            break;
                        case "5":
                            lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                            lottieAnimationView.setRepeatCount(-1);
                            lottieAnimationView.OooOO0();
                            break;
                        default:
                            helper.OooO0oO(R.id.iv_honor, false);
                            break;
                    }
                } else {
                    helper.OooO0oO(R.id.iv_honor, false);
                }
                helper.OooOO0(R.id.tv_room_name, item.barname);
                SVGAView sVGAView = (SVGAView) helper.OooO0Oo(R.id.lav_hot_room_live);
                sVGAView.OooO0oo("svga/anim_room_live.svga", MainExploreFragment.this.getActivity());
                sVGAView.OooO();
                String str2 = item.onlinenum;
                if (str2 == null) {
                    str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                helper.OooOO0(R.id.tv_online_num, str2);
            }
            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0oo());
            oooO00o2.f48466OooOo0O = true;
            oooO00o2.f48447OooO0OO = item.barimage;
            oooO00o2.f48445OooO00o = 0;
            oooO00o2.OooO0oO(12);
            oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.room_header));
            helper.OooO0Oo(R.id.item_hot_bg).setOnClickListener(new com.yalla.yalla.ui.fragment.OooO0o(MainExploreFragment.this, item, helper));
        }
    }

    public static final class OooO0o extends p188o00o00o.o00Oo0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ p188o00o00o.o00O0O f23923OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p188o00o00o.o00O0O f23924OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p188o00o00o.o00O0O f23925OooO0o0;

        public OooO0o(p188o00o00o.o00O0O o00o0o2, p188o00o00o.o00O0O o00o0o3, p188o00o00o.o00O0O o00o0o4, Context context) {
            this.f23923OooO0OO = o00o0o2;
            this.f23924OooO0Oo = o00o0o3;
            this.f23925OooO0o0 = o00o0o4;
        }

        @Override // p188o00o00o.o00Oo0
        @Nullable
        public final p188o00o00o.o00O0O OooO0Oo(int i) {
            p189o00o00o0.OooO0OO oooO0OO = MainExploreFragment.this.mAdapter;
            Integer numValueOf = oooO0OO != null ? Integer.valueOf(oooO0OO.getHeaderLayoutCount()) : null;
            Intrinsics.checkNotNull(numValueOf);
            int iIntValue = (i - numValueOf.intValue()) % 3;
            if (iIntValue == 0) {
                return this.f23923OooO0OO;
            }
            if (iIntValue == 1) {
                return this.f23924OooO0Oo;
            }
            if (iIntValue != 2) {
                return null;
            }
            return this.f23925OooO0o0;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MainRoomExploreViewModel> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomExploreViewModel invoke() {
            return (MainRoomExploreViewModel) new ViewModelProvider(MainExploreFragment.this).get(MainRoomExploreViewModel.class);
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<List<EventModel>, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<EventModel> list) {
            List<EventModel> result = list;
            if (result != null) {
                RoomExploreEventsManager roomExploreEventsManager = MainExploreFragment.this.mEventsManager;
                Intrinsics.checkNotNull(roomExploreEventsManager);
                Objects.requireNonNull(roomExploreEventsManager);
                Intrinsics.checkNotNullParameter(result, "result");
                oOO00O.OooO(roomExploreEventsManager.f11408OooO0OO);
                oOO00O.OooO(roomExploreEventsManager.f11409OooO0Oo);
                roomExploreEventsManager.f11410OooO0o0.clear();
                roomExploreEventsManager.f11410OooO0o0.addAll(result);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void enterRoom(RoomIndexModel item, int index) {
        o0o00Ooo.o0000Ooo.OooO00o oooO00oOooO0O0 = p502o0o00Ooo.o0000Ooo.f41401OooO00o.OooO0O0(((y8) getBinding()).f50998OooO0Oo);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = oooO00oOooO0O0.f41404OooO00o;
        if (i == 0) {
            for (RoomIndexModel roomIndexModel : this.hotTop3List) {
                arrayList.add(roomIndexModel.barid);
                arrayList2.add(roomIndexModel.sessionId);
            }
            int i2 = oooO00oOooO0O0.f41405OooO0O0;
            if (i2 > 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (this.hotDataList.size() > i3) {
                        arrayList.add(this.hotDataList.get(i3).barid);
                        arrayList2.add(this.hotDataList.get(i3).sessionId);
                    }
                }
            }
        } else {
            int i4 = oooO00oOooO0O0.f41405OooO0O0;
            for (int i5 = i - 1; i5 < i4; i5++) {
                if (this.hotDataList.size() > i5) {
                    arrayList.add(this.hotDataList.get(i5).barid);
                    arrayList2.add(this.hotDataList.get(i5).sessionId);
                }
            }
        }
        String str = item.barid;
        Intrinsics.checkNotNullExpressionValue(str, "item.barid");
        if (str.length() > 0) {
            String roomId = item.barid;
            Intrinsics.checkNotNullExpressionValue(roomId, "item.barid");
            EnterRoomParentPage sourcePage = EnterRoomParentPage.Explore_Hot_Rooms;
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o00O0OO0(arrayList, arrayList2, roomId, sourcePage, null), 3, null);
        }
        o0O00000.OooO0o0("Room_hotlive", o0O00000.OooO0O0(index));
        String str2 = item.roomserverip;
        RoomModel roomModel = new RoomModel();
        roomModel.setName(item.barname);
        roomModel.setImage(item.barimage);
        roomModel.setBaridx(item.baridx);
        roomModel.setRoomIp(str2);
        roomModel.setId(p169o00Ooo0.o0O0O00.OooOOO0(item.barid));
        roomModel.setSessionId(item.sessionId);
        RoomStateManager.INSTANCE.enterRoom(roomModel, (EnterRoomParentPage) null);
    }

    private final RoomExploreHeadView getMRoomExploreHeadView() {
        return (RoomExploreHeadView) this.mRoomExploreHeadView.getValue();
    }

    private final MainRoomExploreViewModel getMViewModel() {
        return (MainRoomExploreViewModel) this.mViewModel.getValue();
    }

    private final void initObserver() {
        ((MutableLiveData) getMViewModel().f25485OooO0O0.getValue()).observe(this, new o00O0O0(this, 4));
        ((MutableLiveData) getMViewModel().f25486OooO0OO.getValue()).observe(this, new oO0000o0(this, 2));
        ((MutableLiveData) getMViewModel().f25487OooO0Oo.getValue()).observe(this, new oo00oO(this, 5));
        getMViewModel().OooO0OO().observe(this, new oO00o00O(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-5, reason: not valid java name */
    public static final void m335initObserver$lambda5(MainExploreFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMRoomExploreHeadView().OooOO0(list, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x01f3  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: initObserver$lambda-6, reason: not valid java name */
    public static final void m336initObserver$lambda6(MainExploreFragment this$0, Pair pair) {
        p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO;
        byte b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        if (commonParseMultiListModel == null || com.yalla.support.common.util.OooO0OO.OooO00o(commonParseMultiListModel.data)) {
            ((y8) this$0.getBinding()).f51000OooO0o0.Oooo0o0(zBooleanValue, true, true);
            p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO2 = this$0.mAdapter;
            if (oooO0OO2 != null) {
                oooO0OO2.setLoadComplete();
                return;
            }
            return;
        }
        boolean z = commonParseMultiListModel.data.size() == 0;
        List<T> list = commonParseMultiListModel.data;
        Intrinsics.checkNotNullExpressionValue(list, "model.data");
        this$0.removeDuplicatesData(list);
        if (zBooleanValue) {
            this$0.hotTop3List.clear();
            this$0.hotDataList.clear();
            if (commonParseMultiListModel.data.size() > 3) {
                int size = commonParseMultiListModel.data.size();
                for (int i = 0; i < size; i++) {
                    if (i < 3) {
                        List<RoomIndexModel> list2 = this$0.hotTop3List;
                        Object obj = commonParseMultiListModel.data.get(i);
                        Intrinsics.checkNotNullExpressionValue(obj, "model.data[i]");
                        list2.add((RoomIndexModel) obj);
                    } else {
                        List<RoomIndexModel> list3 = this$0.hotDataList;
                        Object obj2 = commonParseMultiListModel.data.get(i);
                        Intrinsics.checkNotNullExpressionValue(obj2, "model.data[i]");
                        list3.add((RoomIndexModel) obj2);
                    }
                }
            } else {
                List<RoomIndexModel> list4 = this$0.hotTop3List;
                Collection<? extends RoomIndexModel> collection = commonParseMultiListModel.data;
                Intrinsics.checkNotNullExpressionValue(collection, "model.data");
                list4.addAll(collection);
            }
            RoomExploreHotHeadView roomExploreHotHeadView = this$0.mHotHeadView;
            Intrinsics.checkNotNull(roomExploreHotHeadView);
            roomExploreHotHeadView.f11451o00oO0o = this$0.hotTop3List;
            int iOooO0oo = p207o00o0o0o.o000O0O0.OooO0oo();
            int iOooO0O0 = (iOooO0oo - p032OoooO0.o0000OO0.OooO0O0(roomExploreHotHeadView.f11731o000oOoO, 42.0d)) / 3;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) roomExploreHotHeadView.f11435OoooOoO.getLayoutParams();
            layoutParams.width = (iOooO0oo - p032OoooO0.o0000OO0.OooO0O0(roomExploreHotHeadView.f11731o000oOoO, 37.0d)) - iOooO0O0;
            layoutParams.height = (iOooO0oo - p032OoooO0.o0000OO0.OooO0O0(roomExploreHotHeadView.f11731o000oOoO, 37.0d)) - iOooO0O0;
            roomExploreHotHeadView.f11435OoooOoO.setLayoutParams(layoutParams);
            if (roomExploreHotHeadView.f11451o00oO0o.size() > 0) {
                roomExploreHotHeadView.f11434OoooOo0.setVisibility(0);
                ((SVGAView) roomExploreHotHeadView.OooO0O0(R.id.lav_hot_room_live1)).OooO0oo("svga/anim_room_live.svga", (LifecycleOwner) roomExploreHotHeadView.f11725OoooO0);
                ((SVGAView) roomExploreHotHeadView.OooO0O0(R.id.lav_hot_room_live1)).OooO();
                if (roomExploreHotHeadView.f11451o00oO0o.size() == 1) {
                    roomExploreHotHeadView.f11435OoooOoO.setVisibility(0);
                    roomExploreHotHeadView.f11436OoooOoo.setVisibility(8);
                    roomExploreHotHeadView.f11437Ooooo00.setVisibility(8);
                } else if (roomExploreHotHeadView.f11451o00oO0o.size() == 2) {
                    ((SVGAView) roomExploreHotHeadView.OooO0O0(R.id.lav_hot_room_live2)).OooO0oo("svga/anim_room_live.svga", (LifecycleOwner) roomExploreHotHeadView.f11725OoooO0);
                    ((SVGAView) roomExploreHotHeadView.OooO0O0(R.id.lav_hot_room_live2)).OooO();
                    roomExploreHotHeadView.f11435OoooOoO.setVisibility(0);
                    roomExploreHotHeadView.f11436OoooOoo.setVisibility(0);
                    roomExploreHotHeadView.f11437Ooooo00.setVisibility(8);
                } else if (roomExploreHotHeadView.f11451o00oO0o.size() >= 3) {
                    ((SVGAView) roomExploreHotHeadView.OooO0O0(R.id.lav_hot_room_live2)).OooO0oo("svga/anim_room_live.svga", (LifecycleOwner) roomExploreHotHeadView.f11725OoooO0);
                    ((SVGAView) roomExploreHotHeadView.OooO0O0(R.id.lav_hot_room_live3)).OooO0oo("svga/anim_room_live.svga", (LifecycleOwner) roomExploreHotHeadView.f11725OoooO0);
                    ((SVGAView) roomExploreHotHeadView.OooO0O0(R.id.lav_hot_room_live2)).OooO();
                    ((SVGAView) roomExploreHotHeadView.OooO0O0(R.id.lav_hot_room_live3)).OooO();
                    roomExploreHotHeadView.f11435OoooOoO.setVisibility(0);
                    roomExploreHotHeadView.f11436OoooOoo.setVisibility(0);
                    roomExploreHotHeadView.f11437Ooooo00.setVisibility(0);
                }
                for (int i2 = 0; i2 < roomExploreHotHeadView.f11451o00oO0o.size(); i2++) {
                    roomExploreHotHeadView.f11448o00Ooo.get(i2).setText(roomExploreHotHeadView.f11451o00oO0o.get(i2).onlinenum);
                    roomExploreHotHeadView.f11452o00ooo.get(i2).setVisibility(0);
                    LottieAnimationView lottieAnimationView = roomExploreHotHeadView.f11452o00ooo.get(i2);
                    lottieAnimationView.OooO0Oo();
                    String str = roomExploreHotHeadView.f11451o00oO0o.get(i2).bartype;
                    Objects.requireNonNull(str);
                    switch (str) {
                        case "2":
                            b = 0;
                            break;
                        case "3":
                            b = 1;
                            break;
                        case "4":
                            b = 2;
                            break;
                        case "5":
                            b = 3;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        lottieAnimationView.setImageResource(R.drawable.room_princess_garden1);
                    } else if (b == 1) {
                        lottieAnimationView.setImageResource(R.drawable.room_dreamland1);
                    } else if (b == 2) {
                        lottieAnimationView.setImageResource(R.drawable.upgraderoom_crown_somall);
                    } else if (b != 3) {
                        lottieAnimationView.setVisibility(8);
                    } else {
                        lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                        lottieAnimationView.setRepeatCount(-1);
                        lottieAnimationView.OooOO0();
                    }
                    roomExploreHotHeadView.f11449o00o0O.get(i2).setText(roomExploreHotHeadView.f11451o00oO0o.get(i2).barname);
                    oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(roomExploreHotHeadView.f11731o000oOoO);
                    oooO00o.OooO00o(o00OOO.OooO00o.OooO0oO());
                    oooO00o.f48447OooO0OO = roomExploreHotHeadView.f11451o00oO0o.get(i2).barimage;
                    oooO00o.f48445OooO00o = 0;
                    oooO00o.OooO0oO(12);
                    oooO00o.f48466OooOo0O = true;
                    oooO00o.OooO0o(roomExploreHotHeadView.f11454oo000o.get(i2));
                }
            } else {
                roomExploreHotHeadView.f11434OoooOo0.setVisibility(8);
            }
        } else {
            List<RoomIndexModel> list5 = this$0.hotDataList;
            Collection<? extends RoomIndexModel> collection2 = commonParseMultiListModel.data;
            Intrinsics.checkNotNullExpressionValue(collection2, "model.data");
            list5.addAll(collection2);
        }
        if (this$0.hotDataList.size() == 0 && this$0.hotTop3List.size() > 0 && (oooO0OO = this$0.mAdapter) != null) {
            oooO0OO.hindEmptyView(true);
        }
        p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO3 = this$0.mAdapter;
        if (oooO0OO3 != null) {
            oooO0OO3.notifyDataSetChanged();
        }
        MainRoomExploreViewModel mViewModel = this$0.getMViewModel();
        int i3 = commonParseMultiListModel.index + 1;
        commonParseMultiListModel.index = i3;
        mViewModel.f25488OooO0o = i3;
        ((y8) this$0.getBinding()).f51000OooO0o0.Oooo0o0(zBooleanValue, true, z);
        p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO4 = this$0.mAdapter;
        if (oooO0OO4 != null) {
            oooO0OO4.setLoadComplete();
        }
        this$0.uploadApiStatistical();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initObserver$lambda-7, reason: not valid java name */
    public static final void m337initObserver$lambda7(MainExploreFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMRoomExploreHeadView().OooO((List) pair.getFirst(), true, ((Number) pair.getSecond()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: initObserver$lambda-9, reason: not valid java name */
    public static final void m338initObserver$lambda9(MainExploreFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        Boolean bool = (Boolean) pair.getSecond();
        StateLayout stateLayout = ((y8) this$0.getBinding()).f50999OooO0o;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        oOO00O.OooO00o(stateLayout);
        if (zBooleanValue || bool == null) {
            return;
        }
        ((y8) this$0.getBinding()).f51000OooO0o0.Oooo0O0(bool.booleanValue());
        this$0.showOrInitErrorView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((y8) getBinding()).f50996OooO0O0.setText(p255o00ooO0O.o000O0O0.OooO0OO(R.string.room_nav_explore));
        ImageView imageView = ((y8) getBinding()).f50997OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSearchRoom");
        oOO00O.OooO0oO(imageView, new OooO00o());
        XRefreshLayout xRefreshLayout = ((y8) getBinding()).f51000OooO0o0;
        xRefreshLayout.setOnRefreshListener(new o00O00(this, 3));
        xRefreshLayout.f19569o0OO00O = true;
        xRefreshLayout.f19519o000000o = true;
        xRefreshLayout.f19516o00000 = true;
        xRefreshLayout.f19568o0O0O00 = false;
        RoomExploreHeadView mRoomExploreHeadView = getMRoomExploreHeadView();
        mRoomExploreHeadView.f11727OoooO0O = null;
        mRoomExploreHeadView.f11724OoooO = -1;
        mRoomExploreHeadView.OooO(mRoomExploreHeadView.f11428OooooOo, false, 6);
        mRoomExploreHeadView.OooOO0(mRoomExploreHeadView.f11430Oooooo0, false);
        View viewOooO00o = getMRoomExploreHeadView().OooO00o(R.id.room_explore_head_country_layout);
        Intrinsics.checkNotNull(viewOooO00o, "null cannot be cast to non-null type android.view.ViewGroup");
        this.mEventsManager = new RoomExploreEventsManager(this, (ViewGroup) viewOooO00o);
        RoomExploreHotHeadView roomExploreHotHeadView = new RoomExploreHotHeadView(getActivity());
        roomExploreHotHeadView.f11450o00oO0O = new OooO0O0();
        roomExploreHotHeadView.OooO0oo(null, -1);
        this.mHotHeadView = roomExploreHotHeadView;
        OooO0OO oooO0OO = new OooO0OO(getContext(), this.hotDataList);
        oooO0OO.setEmptyImageRes(R.drawable.ic_empty_room);
        oooO0OO.setEmptyText(R.string.blank_ta_no_rooms);
        oooO0OO.setEmptyFullScreen(false);
        this.mAdapter = oooO0OO;
        ((y8) getBinding()).f51000OooO0o0.f12238o000O0oO = new oO0O00O(this, 2);
        ((y8) getBinding()).f50998OooO0Oo.setLayoutManager(new GridLayoutManager(getContext(), 3, 1, false));
        ((y8) getBinding()).f50998OooO0Oo.setHasFixedSize(true);
        p188o00o00o.o00Ooo o00ooo2 = new p188o00o00o.o00Ooo(true, 0, 15.0f);
        p188o00o00o.o00Ooo o00ooo3 = new p188o00o00o.o00Ooo(true, 0, 8.0f);
        p188o00o00o.o00Ooo o00ooo4 = new p188o00o00o.o00Ooo(false, -10066330, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        p188o00o00o.o00O0O o00o0o2 = new p188o00o00o.o00O0O(o00ooo2, o00ooo3, o00ooo4, o00ooo4);
        p188o00o00o.o00O0O o00o0o3 = new p188o00o00o.o00O0O(new p188o00o00o.o00Ooo(true, 0, 8.0f), new p188o00o00o.o00Ooo(true, 0, 8.0f), new p188o00o00o.o00Ooo(true, 0, 8.0f), new p188o00o00o.o00Ooo(false, -10066330, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
        p188o00o00o.o00Ooo o00ooo5 = new p188o00o00o.o00Ooo(true, 0, 15.0f);
        p188o00o00o.o00Ooo o00ooo6 = new p188o00o00o.o00Ooo(true, 0, 8.0f);
        p188o00o00o.o00Ooo o00ooo7 = new p188o00o00o.o00Ooo(false, -10066330, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        ((y8) getBinding()).f50998OooO0Oo.addItemDecoration(new OooO0o(o00o0o2, o00o0o3, new p188o00o00o.o00O0O(o00ooo7, o00ooo6, o00ooo5, o00ooo7), getContext()));
        p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO2 = this.mAdapter;
        if (oooO0OO2 != null) {
            oooO0OO2.setHeaderView(getMRoomExploreHeadView().f11728OoooOO0, 1);
        }
        p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO3 = this.mAdapter;
        if (oooO0OO3 != null) {
            RoomExploreHotHeadView roomExploreHotHeadView2 = this.mHotHeadView;
            Intrinsics.checkNotNull(roomExploreHotHeadView2);
            oooO0OO3.setHeaderView(roomExploreHotHeadView2.f11728OoooOO0, 2);
        }
        ((y8) getBinding()).f50998OooO0Oo.setAdapter(this.mAdapter);
        p619o0oo0o.o00000OO o00000oo2 = p619o0oo0o.o00000OO.f48493OooO00o;
        RecyclerView recyclerView = ((y8) getBinding()).f50998OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerView");
        p619o0oo0o.o00000OO.OooO00o(recyclerView);
        p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO4 = this.mAdapter;
        if (oooO0OO4 != null) {
            oooO0OO4.setFirstLoading(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1$lambda-0, reason: not valid java name */
    public static final void m339initView$lambda1$lambda0(MainExploreFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-4, reason: not valid java name */
    public static final void m340initView$lambda4(MainExploreFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMViewModel().OooO0O0(false);
    }

    private final void refreshLoad() {
        StatusView statusView = this.mErrorView;
        if (statusView != null) {
            oOO00O.OooO00o(statusView);
        }
        this.sparseArray.clear();
        MainRoomExploreViewModel mViewModel = getMViewModel();
        Objects.requireNonNull(mViewModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(mViewModel), null, null, new MainRoomExploreViewModel$loadTagData$1(mViewModel, null), 3, null);
        MainRoomExploreViewModel mViewModel2 = getMViewModel();
        Objects.requireNonNull(mViewModel2);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(mViewModel2), null, null, new MainRoomExploreViewModel$loadCountryHotSort$1(mViewModel2, null), 3, null);
        Objects.requireNonNull(getMViewModel());
        p255o00ooO0O.o0000O0O.OooO00o(new oO0OOo0o(null)).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooOO0O(), null, null, false, 14));
        getMViewModel().OooO0O0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showOrInitErrorView() {
        StatusView statusView = this.mErrorView;
        if (statusView != null) {
            if (statusView != null) {
                oOO00O.OooO(statusView);
                return;
            }
            return;
        }
        StatusView statusView2 = new StatusView(getContext());
        statusView2.setLayoutParams(new ViewGroup.LayoutParams(-1, ((y8) getBinding()).f51000OooO0o0.getMeasuredHeight()));
        this.mErrorView = statusView2;
        Intrinsics.checkNotNull(statusView2);
        statusView2.OooO0O0();
        StatusView statusView3 = this.mErrorView;
        Intrinsics.checkNotNull(statusView3);
        statusView3.setOnErrorClickListener(new p566o0oOo00.o000O00O(this, 1));
        p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO = this.mAdapter;
        if (oooO0OO != null) {
            oooO0OO.setHeaderView(this.mErrorView, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: showOrInitErrorView$lambda-11, reason: not valid java name */
    public static final void m341showOrInitErrorView$lambda11(MainExploreFragment this$0, View view) {
        StatusView emptyHolderView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p189o00o00o0.OooO0OO<RoomIndexModel> oooO0OO = this$0.mAdapter;
        if (oooO0OO != null && (emptyHolderView = oooO0OO.getEmptyHolderView()) != null) {
            oOO00O.OooO00o(emptyHolderView);
        }
        StatusView statusView = this$0.mErrorView;
        Intrinsics.checkNotNull(statusView);
        oOO00O.OooO00o(statusView);
        ((y8) this$0.getBinding()).f51000OooO0o0.Oooo00o();
    }

    @Override // p505o0o00o00.OooO, p141o00OOOoO.OooO0o
    public void onEvent(@Nullable p141o00OOOoO.OooO0OO<?> msg) {
    }

    @Override // p505o0o00o00.OooO, p141o00OOOoO.OooO0o
    public void onEventMainThread(@NotNull p141o00OOOoO.OooO0OO<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        int i = msg.f31906OooO00o;
        if (i == 15 || i == 36 || i == 109) {
            refreshLoad();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p464o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initObserver();
        refreshLoad();
        ((y8) getBinding()).f50999OooO0o.OooOO0O(true);
    }

    @Override // p505o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageEnd("Main_Room_Explore");
        o0O00000.OooO0o0("Room_explore_stay", getTimeLengthStr());
        p608o0oo0O.OooOo.OooO0OO("401001", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // p505o0o00o00.OooO, p464o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageStart("Main_Room_Explore");
        o0O00000.OooO0OO("Room_explore");
    }

    public final void removeDuplicatesData(@NotNull List<RoomIndexModel> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (com.yalla.support.common.util.OooO0OO.OooO0O0(data)) {
            int i = 0;
            while (i < data.size()) {
                String barid = data.get(i).barid;
                if (!com.yalla.support.common.util.OooO0OO.OooO00o(barid)) {
                    Intrinsics.checkNotNullExpressionValue(barid, "barid");
                    long jOooO0o = com.yalla.support.common.util.OooO.OooO0o(barid);
                    if (com.yalla.support.common.util.OooO0OO.OooO0O0(this.sparseArray.get(jOooO0o, ""))) {
                        data.remove(i);
                        i--;
                    } else {
                        this.sparseArray.put(jOooO0o, barid);
                    }
                }
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        super.scrollToTop();
        ((y8) getBinding()).f50998OooO0Oo.scrollToPosition(0);
        if (((y8) getBinding()).f51000OooO0o0.getState() == RefreshState.None) {
            ((y8) getBinding()).f51000OooO0o0.OooO();
            ((y8) getBinding()).f51000OooO0o0.OooO0oo();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void uploadApiStatistical() {
        if (this.isFirstApiStatistical || !(!this.hotTop3List.isEmpty())) {
            return;
        }
        try {
            o0o00Ooo.o0000Ooo.OooO00o oooO00oOooO0O0 = p502o0o00Ooo.o0000Ooo.f41401OooO00o.OooO0O0(((y8) getBinding()).f50998OooO0Oo);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (oooO00oOooO0O0.f41404OooO00o == 0) {
                for (RoomIndexModel roomIndexModel : this.hotTop3List) {
                    arrayList.add(roomIndexModel.barid);
                    arrayList2.add(roomIndexModel.sessionId);
                }
                if (oooO00oOooO0O0.f41405OooO0O0 > 0 && (!this.hotDataList.isEmpty())) {
                    int i = oooO00oOooO0O0.f41405OooO0O0 - 1;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (this.hotDataList.size() > i2) {
                            arrayList.add(this.hotDataList.get(i2).barid);
                            arrayList2.add(this.hotDataList.get(i2).sessionId);
                        }
                    }
                }
            } else if (!this.hotDataList.isEmpty()) {
                int i3 = oooO00oOooO0O0.f41405OooO0O0 - 1;
                for (int i4 = oooO00oOooO0O0.f41404OooO00o - 1; i4 < i3; i4++) {
                    if (this.hotDataList.size() > i4) {
                        arrayList.add(this.hotDataList.get(i4).barid);
                        arrayList2.add(this.hotDataList.get(i4).sessionId);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                EnterRoomParentPage expoSource = EnterRoomParentPage.Explore_Hot_Rooms;
                Intrinsics.checkNotNullParameter(this, "fragment");
                Intrinsics.checkNotNullParameter(expoSource, "expoSource");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o00O(arrayList, arrayList2, expoSource, null), 3, null);
            }
            this.isFirstApiStatistical = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p505o0o00o00.OooO
    @NotNull
    public y8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        y8 y8VarInflate = y8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(y8VarInflate, "inflate(inflater, container, false)");
        return y8VarInflate;
    }
}
