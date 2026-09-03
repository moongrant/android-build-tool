package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.room.RoomModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.roomExplore.RoomExploreHeadView;
import com.yalla.yalla.ui.adapter.roomExplore.RoomExploreHotHeadView;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.StatusView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel;
import com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadCountryHotSort$1;
import com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadTagData$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O00OO;
import p499o0o00o0O.o00O0O0O;
import p503o0o00oOo.oOO0O0O;
import p573o0oOoOOO.oOo0oooO;
import p579o0oOoo.oO0OOO00;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.m2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0014J\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0016\u0010\u0018\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0016J\u0014\u0010\u0019\u001a\u00020\f2\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0002J\b\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\fH\u0002R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainExploreFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0ooOOOO/m2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "onLazyInit", "uploadApiStatistical", "onResume", "onPause", "", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "data", "removeDuplicatesData", "Lo0OoO000/OooOo;", "msg", "onEvent", "onEventMainThread", "scrollToTop", "initView", "initObserver", "showOrInitErrorView", "item", "", "index", "enterRoom", "refreshLoad", "Lcom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "getMViewModel", "()Lcom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel;", "mViewModel", "Lo0oOo0OO/o000O;", "mAdapter", "Lo0oOo0OO/o000O;", "hotTop3List", "Ljava/util/List;", "hotDataList", "Lcom/yalla/yalla/ui/adapter/roomExplore/RoomExploreHeadView;", "mRoomExploreHeadView$delegate", "getMRoomExploreHeadView", "()Lcom/yalla/yalla/ui/adapter/roomExplore/RoomExploreHeadView;", "mRoomExploreHeadView", "Lcom/yalla/yalla/ui/adapter/roomExplore/RoomExploreHotHeadView;", "mHotHeadView", "Lcom/yalla/yalla/ui/adapter/roomExplore/RoomExploreHotHeadView;", "Landroid/util/LongSparseArray;", "", "sparseArray", "Landroid/util/LongSparseArray;", "Lo0o00oOo/oOO0O0O;", "mEventsManager", "Lo0o00oOo/oOO0O0O;", "Lcom/yalla/yalla/ui/view/StatusView;", "mErrorView", "Lcom/yalla/yalla/ui/view/StatusView;", "", "isFirstApiStatistical", "Z", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MainExploreFragment extends MainRoomBaseFragment<m2> {
    public static final int $stable = 8;
    private boolean isFirstApiStatistical;

    @Nullable
    private p564o0oOo0OO.o000O<RoomIndexModel> mAdapter;

    @Nullable
    private StatusView mErrorView;

    @Nullable
    private oOO0O0O mEventsManager;

    @Nullable
    private RoomExploreHotHeadView mHotHeadView;

    /* JADX INFO: renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt.lazy(new OooOOOO());

    @NotNull
    private final List<RoomIndexModel> hotTop3List = new ArrayList();

    @NotNull
    private final List<RoomIndexModel> hotDataList = new ArrayList();

    /* JADX INFO: renamed from: mRoomExploreHeadView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRoomExploreHeadView = LazyKt.lazy(new OooOOO());

    @NotNull
    private final LongSparseArray<String> sparseArray = new LongSparseArray<>();

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0ooOOo onLogin = new o0ooOOo(MainExploreFragment.this);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(p464o0Oooo.o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<List<? extends CategoryModel>, Unit> {
        public OooO00o() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends CategoryModel> list) {
            MainExploreFragment.this.getMRoomExploreHeadView().OooO(list, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Pair<? extends CommonParseMultiListModel<RoomIndexModel>, ? extends Boolean>, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Pair<? extends CommonParseMultiListModel<RoomIndexModel>, ? extends Boolean> pair) {
            p564o0oOo0OO.o000O o000o;
            Pair<? extends CommonParseMultiListModel<RoomIndexModel>, ? extends Boolean> pair2 = pair;
            CommonParseMultiListModel<RoomIndexModel> first = pair2.getFirst();
            boolean zBooleanValue = pair2.getSecond().booleanValue();
            MainExploreFragment mainExploreFragment = MainExploreFragment.this;
            if (first == null || com.code.android.util.OooOo00.OooO00o(first.data)) {
                ((m2) mainExploreFragment.getBinding()).f58397OooO0o.OooOooo(zBooleanValue, true, true);
                p564o0oOo0OO.o000O o000o2 = mainExploreFragment.mAdapter;
                if (o000o2 != null) {
                    o000o2.Oooo00o();
                }
            } else {
                boolean z = first.data.size() == 0;
                List<RoomIndexModel> list = first.data;
                Intrinsics.checkNotNullExpressionValue(list, "model.data");
                mainExploreFragment.removeDuplicatesData(list);
                if (zBooleanValue) {
                    mainExploreFragment.hotTop3List.clear();
                    mainExploreFragment.hotDataList.clear();
                    if (first.data.size() > 3) {
                        int size = first.data.size();
                        for (int i = 0; i < size; i++) {
                            if (i < 3) {
                                List list2 = mainExploreFragment.hotTop3List;
                                RoomIndexModel roomIndexModel = first.data.get(i);
                                Intrinsics.checkNotNullExpressionValue(roomIndexModel, "model.data[i]");
                                list2.add(roomIndexModel);
                            } else {
                                List list3 = mainExploreFragment.hotDataList;
                                RoomIndexModel roomIndexModel2 = first.data.get(i);
                                Intrinsics.checkNotNullExpressionValue(roomIndexModel2, "model.data[i]");
                                list3.add(roomIndexModel2);
                            }
                        }
                    } else {
                        List list4 = mainExploreFragment.hotTop3List;
                        List<RoomIndexModel> list5 = first.data;
                        Intrinsics.checkNotNullExpressionValue(list5, "model.data");
                        list4.addAll(list5);
                    }
                    RoomExploreHotHeadView roomExploreHotHeadView = mainExploreFragment.mHotHeadView;
                    Intrinsics.checkNotNull(roomExploreHotHeadView);
                    roomExploreHotHeadView.f27765Oooo000 = mainExploreFragment.hotTop3List;
                    int iOooO0O0 = com.code.android.util.o0000O00.OooO0O0();
                    Context context = roomExploreHotHeadView.f22736OooOO0;
                    int iOooO00o = (iOooO0O0 - com.android.billingclient.api.o0Oo0oo.OooO00o(context, 42.0d)) / 3;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) roomExploreHotHeadView.f27747OooOOO0.getLayoutParams();
                    layoutParams.width = (iOooO0O0 - com.android.billingclient.api.o0Oo0oo.OooO00o(context, 37.0d)) - iOooO00o;
                    layoutParams.height = (iOooO0O0 - com.android.billingclient.api.o0Oo0oo.OooO00o(context, 37.0d)) - iOooO00o;
                    roomExploreHotHeadView.f27747OooOOO0.setLayoutParams(layoutParams);
                    if (roomExploreHotHeadView.f27765Oooo000.size() > 0) {
                        roomExploreHotHeadView.f27745OooOO0o.setVisibility(0);
                        int i2 = oO00O0oO.lav_hot_room_live1;
                        SVGAView sVGAView = (SVGAView) roomExploreHotHeadView.OooO0O0(i2);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) roomExploreHotHeadView.f22732OooO0o;
                        sVGAView.OooOO0O("svga/anim_room_live.svga", lifecycleOwner);
                        ((SVGAView) roomExploreHotHeadView.OooO0O0(i2)).OooOO0o();
                        if (roomExploreHotHeadView.f27765Oooo000.size() == 1) {
                            roomExploreHotHeadView.f27747OooOOO0.setVisibility(0);
                            roomExploreHotHeadView.f27746OooOOO.setVisibility(8);
                            roomExploreHotHeadView.f27748OooOOOO.setVisibility(8);
                        } else if (roomExploreHotHeadView.f27765Oooo000.size() == 2) {
                            int i3 = oO00O0oO.lav_hot_room_live2;
                            ((SVGAView) roomExploreHotHeadView.OooO0O0(i3)).OooOO0O("svga/anim_room_live.svga", lifecycleOwner);
                            ((SVGAView) roomExploreHotHeadView.OooO0O0(i3)).OooOO0o();
                            roomExploreHotHeadView.f27747OooOOO0.setVisibility(0);
                            roomExploreHotHeadView.f27746OooOOO.setVisibility(0);
                            roomExploreHotHeadView.f27748OooOOOO.setVisibility(8);
                        } else if (roomExploreHotHeadView.f27765Oooo000.size() >= 3) {
                            int i4 = oO00O0oO.lav_hot_room_live2;
                            ((SVGAView) roomExploreHotHeadView.OooO0O0(i4)).OooOO0O("svga/anim_room_live.svga", lifecycleOwner);
                            int i5 = oO00O0oO.lav_hot_room_live3;
                            ((SVGAView) roomExploreHotHeadView.OooO0O0(i5)).OooOO0O("svga/anim_room_live.svga", lifecycleOwner);
                            ((SVGAView) roomExploreHotHeadView.OooO0O0(i4)).OooOO0o();
                            ((SVGAView) roomExploreHotHeadView.OooO0O0(i5)).OooOO0o();
                            roomExploreHotHeadView.f27747OooOOO0.setVisibility(0);
                            roomExploreHotHeadView.f27746OooOOO.setVisibility(0);
                            roomExploreHotHeadView.f27748OooOOOO.setVisibility(0);
                        }
                        for (int i6 = 0; i6 < roomExploreHotHeadView.f27765Oooo000.size(); i6++) {
                            ((TextView) roomExploreHotHeadView.f27762OooOoo0.get(i6)).setText(roomExploreHotHeadView.f27765Oooo000.get(i6).onlinenum);
                            ((LottieAnimationView) roomExploreHotHeadView.f27763OooOooO.get(i6)).setVisibility(0);
                            LottieAnimationView lottieAnimationView = (LottieAnimationView) roomExploreHotHeadView.f27763OooOooO.get(i6);
                            lottieAnimationView.OooO0OO();
                            String str = roomExploreHotHeadView.f27765Oooo000.get(i6).bartype;
                            str.getClass();
                            switch (str) {
                                case "2":
                                    lottieAnimationView.setImageResource(oOo00OO0.room_princess_garden1);
                                    break;
                                case "3":
                                    lottieAnimationView.setImageResource(oOo00OO0.room_dreamland1);
                                    break;
                                case "4":
                                    lottieAnimationView.setImageResource(oOo00OO0.upgraderoom_crown_somall);
                                    break;
                                case "5":
                                    lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                                    lottieAnimationView.setRepeatCount(-1);
                                    lottieAnimationView.OooO0oO();
                                    break;
                                default:
                                    lottieAnimationView.setVisibility(8);
                                    break;
                            }
                            ((TextView) roomExploreHotHeadView.f27761OooOoo.get(i6)).setText(roomExploreHotHeadView.f27765Oooo000.get(i6).barname);
                            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(context);
                            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0o0());
                            oooO00o.f43911OooO0OO = roomExploreHotHeadView.f27765Oooo000.get(i6).barimage;
                            oooO00o.f43909OooO00o = 0;
                            oooO00o.OooO0o0(12);
                            oooO00o.f43930OooOo0O = true;
                            oooO00o.OooO0Oo((ImageView) roomExploreHotHeadView.f27764OooOooo.get(i6));
                        }
                    } else {
                        roomExploreHotHeadView.f27745OooOO0o.setVisibility(8);
                    }
                } else {
                    List list6 = mainExploreFragment.hotDataList;
                    List<RoomIndexModel> list7 = first.data;
                    Intrinsics.checkNotNullExpressionValue(list7, "model.data");
                    list6.addAll(list7);
                }
                if (mainExploreFragment.hotDataList.size() == 0 && mainExploreFragment.hotTop3List.size() > 0 && (o000o = mainExploreFragment.mAdapter) != null) {
                    o000o.OooOoOO(true);
                }
                p564o0oOo0OO.o000O o000o3 = mainExploreFragment.mAdapter;
                if (o000o3 != null) {
                    o000o3.notifyDataSetChanged();
                }
                MainRoomExploreViewModel mViewModel = mainExploreFragment.getMViewModel();
                int i7 = first.index + 1;
                first.index = i7;
                mViewModel.f31748OooO0o = i7;
                ((m2) mainExploreFragment.getBinding()).f58397OooO0o.OooOooo(zBooleanValue, true, z);
                p564o0oOo0OO.o000O o000o4 = mainExploreFragment.mAdapter;
                if (o000o4 != null) {
                    o000o4.Oooo00o();
                }
                mainExploreFragment.uploadApiStatistical();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Pair<? extends List<? extends CountryModel>, ? extends Integer>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Pair<? extends List<? extends CountryModel>, ? extends Integer> pair) {
            Pair<? extends List<? extends CountryModel>, ? extends Integer> pair2 = pair;
            MainExploreFragment.this.getMRoomExploreHeadView().OooO0oo(pair2.getSecond().intValue(), pair2.getFirst(), true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public OooO0o() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            Pair<? extends Boolean, ? extends Boolean> pair2 = pair;
            boolean zBooleanValue = pair2.getFirst().booleanValue();
            Boolean second = pair2.getSecond();
            MainExploreFragment mainExploreFragment = MainExploreFragment.this;
            StateLayout stateLayout = ((m2) mainExploreFragment.getBinding()).f58399OooO0oO;
            Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
            com.code.android.util.o000OO00.OooO0O0(stateLayout);
            if (!zBooleanValue && second != null) {
                ((m2) mainExploreFragment.getBinding()).f58397OooO0o.OooOoo(second.booleanValue());
                mainExploreFragment.showOrInitErrorView();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<RoomIndexModel, Integer, Unit> {
        public OooOO0() {
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

    public static final class OooOO0O extends p564o0oOo0OO.o000O<RoomIndexModel> {
        public OooOO0O(Context context, int i, List<RoomIndexModel> list) {
            super(i, context, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:25:0x0097  */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder helper = (ViewHolder) baseViewHolder;
            RoomIndexModel item = (RoomIndexModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            int layoutPosition = helper.getLayoutPosition();
            MainExploreFragment mainExploreFragment = MainExploreFragment.this;
            p564o0oOo0OO.o000O o000o = mainExploreFragment.mAdapter;
            Intrinsics.checkNotNull(o000o);
            if (layoutPosition - o000o.OooOOO0() > 2) {
                helper.setGone(oO00O0oO.ll_room_online, false);
                helper.setGone(oO00O0oO.ll_room_name, false);
            } else {
                helper.setGone(oO00O0oO.ll_room_online, true);
                helper.setGone(oO00O0oO.ll_room_name, true);
                int i = oO00O0oO.iv_honor;
                helper.setGone(i, true);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) helper.getView(i);
                lottieAnimationView.OooO0OO();
                String str = item.bartype;
                if (str != null) {
                    switch (str) {
                        case "2":
                            helper.setImageResource(i, oOo00OO0.room_princess_garden1);
                            break;
                        case "3":
                            helper.setImageResource(i, oOo00OO0.room_dreamland1);
                            break;
                        case "4":
                            helper.setImageResource(i, oOo00OO0.upgraderoom_crown_somall);
                            break;
                        case "5":
                            lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                            lottieAnimationView.setRepeatCount(-1);
                            lottieAnimationView.OooO0oO();
                            break;
                        default:
                            helper.setGone(i, false);
                            break;
                    }
                } else {
                    helper.setGone(i, false);
                }
                helper.setText(oO00O0oO.tv_room_name, item.barname);
                SVGAView sVGAView = (SVGAView) helper.getView(oO00O0oO.lav_hot_room_live);
                sVGAView.OooOO0O("svga/anim_room_live.svga", mainExploreFragment.getActivity());
                sVGAView.OooOO0o();
                int i2 = oO00O0oO.tv_online_num;
                String str2 = item.onlinenum;
                if (str2 == null) {
                    str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                helper.setText(i2, str2);
            }
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0o());
            oooO00o.f43930OooOo0O = true;
            oooO00o.f43911OooO0OO = item.barimage;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0o0(12);
            oooO00o.OooO0Oo((ImageView) helper.getView(oO00O0oO.room_header));
            helper.getView(oO00O0oO.item_hot_bg).setOnClickListener(new o0OOO0o(mainExploreFragment, item, helper));
        }
    }

    public static final class OooOOO extends Lambda implements Function0<RoomExploreHeadView> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomExploreHeadView invoke() {
            return new RoomExploreHeadView(MainExploreFragment.this.getActivity());
        }
    }

    public static final class OooOOO0 extends p565o0oOo0Oo.o000OOo0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ p565o0oOo0Oo.o000OO00 f28168OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p565o0oOo0Oo.o000OO00 f28169OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p565o0oOo0Oo.o000OO00 f28170OooO0o0;

        public OooOOO0(p565o0oOo0Oo.o000OO00 o000oo01, p565o0oOo0Oo.o000OO00 o000oo02, p565o0oOo0Oo.o000OO00 o000oo03) {
            this.f28168OooO0OO = o000oo01;
            this.f28169OooO0Oo = o000oo02;
            this.f28170OooO0o0 = o000oo03;
        }

        @Override // p565o0oOo0Oo.o000OOo0
        @Nullable
        public final p565o0oOo0Oo.o000OO00 OooO0Oo(int i) {
            p564o0oOo0OO.o000O o000o = MainExploreFragment.this.mAdapter;
            Integer numValueOf = o000o != null ? Integer.valueOf(o000o.OooOOO0()) : null;
            Intrinsics.checkNotNull(numValueOf);
            int iIntValue = (i - numValueOf.intValue()) % 3;
            if (iIntValue == 0) {
                return this.f28168OooO0OO;
            }
            if (iIntValue == 1) {
                return this.f28169OooO0Oo;
            }
            if (iIntValue != 2) {
                return null;
            }
            return this.f28170OooO0o0;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<MainRoomExploreViewModel> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainRoomExploreViewModel invoke() {
            return (MainRoomExploreViewModel) new ViewModelProvider(MainExploreFragment.this).get(MainRoomExploreViewModel.class);
        }
    }

    public static final class OooOo extends Lambda implements Function1<List<EventModel>, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<EventModel> list) {
            List<EventModel> result = list;
            if (result != null) {
                oOO0O0O ooo0o0o = MainExploreFragment.this.mEventsManager;
                Intrinsics.checkNotNull(ooo0o0o);
                ooo0o0o.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                com.code.android.util.o000OO00.OooOOOO(ooo0o0o.f49713OooO00o);
                com.code.android.util.o000OO00.OooOOOO(ooo0o0o.f49714OooO0O0);
                SnapshotStateList<EventModel> snapshotStateList = ooo0o0o.f49715OooO0OO;
                snapshotStateList.clear();
                snapshotStateList.addAll(result);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<Integer, Unit> {
        public OooOo00() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            ImageView imageView = ((m2) MainExploreFragment.this.getBinding()).f58395OooO0OO;
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            imageView.setImageResource(oOOOOo0O.OooO0OO(it.intValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28174OooO0Oo;

        public Oooo000(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28174OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28174OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28174OooO0Oo;
        }

        public final int hashCode() {
            return this.f28174OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28174OooO0Oo.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void enterRoom(RoomIndexModel item, int index) {
        o0o000o0.OooOo00.OooO00o oooO00oOooO0O0 = p481o0o000o0.OooOo00.OooO0O0(((m2) getBinding()).f58398OooO0o0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = oooO00oOooO0O0.f47695OooO0O0;
        int i2 = oooO00oOooO0O0.f47694OooO00o;
        if (i2 == 0) {
            for (RoomIndexModel roomIndexModel : this.hotTop3List) {
                arrayList.add(roomIndexModel.barid);
                arrayList2.add(roomIndexModel.sessionId);
            }
            if (i > 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    if (this.hotDataList.size() > i3) {
                        arrayList.add(this.hotDataList.get(i3).barid);
                        arrayList2.add(this.hotDataList.get(i3).sessionId);
                    }
                }
            }
        } else {
            for (int i4 = i2 - 1; i4 < i; i4++) {
                if (this.hotDataList.size() > i4) {
                    arrayList.add(this.hotDataList.get(i4).barid);
                    arrayList2.add(this.hotDataList.get(i4).sessionId);
                }
            }
        }
        String str = item.barid;
        Intrinsics.checkNotNullExpressionValue(str, "item.barid");
        if (str.length() > 0) {
            WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
            String str2 = item.barid;
            Intrinsics.checkNotNullExpressionValue(str2, "item.barid");
            EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.Explore_Hot_Rooms;
            webEventRepository.getClass();
            WebEventRepository.OooO0OO(this, arrayList, arrayList2, str2, enterRoomParentPage);
        }
        String strOooO00o = "00";
        if (index >= 0) {
            if (index < 10) {
                int i5 = index + 1;
                strOooO00o = i5 < 10 ? o00O00OO.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO, com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(i5), AppEventsConstants.EVENT_PARAM_VALUE_NO)) : com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(i5), "00");
            } else {
                strOooO00o = "11";
            }
        }
        o0OO000.OooO0O0("201010", MapsKt.mapOf(new Pair("roompoint", strOooO00o)));
        RoomModel roomModel = new RoomModel();
        roomModel.setName(item.barname);
        roomModel.setImage(item.barimage);
        roomModel.setBaridx(item.baridx);
        roomModel.setRoomIp(item.roomserverip);
        roomModel.websocketaddr = item.websocketaddr;
        roomModel.setId(p590o0oo0.OooOOOO.OooOO0o(item.barid));
        roomModel.setSessionId(item.sessionId);
        MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
        p427o0OoOO00.o0OOO0o.OooO0o(roomModel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomExploreHeadView getMRoomExploreHeadView() {
        return (RoomExploreHeadView) this.mRoomExploreHeadView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MainRoomExploreViewModel getMViewModel() {
        return (MainRoomExploreViewModel) this.mViewModel.getValue();
    }

    private final void initObserver() {
        ((MutableLiveData) getMViewModel().f31745OooO0O0.getValue()).observe(this, new Oooo000(new OooO00o()));
        ((MutableLiveData) getMViewModel().f31746OooO0OO.getValue()).observe(this, new Oooo000(new OooO0O0()));
        ((MutableLiveData) getMViewModel().f31747OooO0Oo.getValue()).observe(this, new Oooo000(new OooO0OO()));
        ((MutableLiveData) getMViewModel().f31749OooO0o0.getValue()).observe(this, new Oooo000(new OooO0o()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((m2) getBinding()).f58394OooO0O0.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_nav_explore));
        ImageView imageView = ((m2) getBinding()).f58396OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivSearchRoom");
        com.code.android.util.o000OO00.OooO(imageView, new OooO());
        XRefreshLayout xRefreshLayout = ((m2) getBinding()).f58397OooO0o;
        xRefreshLayout.setOnRefreshListener(new com.facebook.login.OooOOOO(this));
        xRefreshLayout.f21341Oooo0oO = true;
        xRefreshLayout.f21343OoooO = true;
        xRefreshLayout.f21347OoooOO0 = true;
        xRefreshLayout.f21332Oooo = false;
        getMRoomExploreHeadView().OooO0oO(null);
        View viewOooO00o = getMRoomExploreHeadView().OooO00o(oO00O0oO.room_explore_head_country_layout);
        Intrinsics.checkNotNull(viewOooO00o, "null cannot be cast to non-null type android.view.ViewGroup");
        this.mEventsManager = new oOO0O0O((ViewGroup) viewOooO00o);
        RoomExploreHotHeadView roomExploreHotHeadView = new RoomExploreHotHeadView(getActivity());
        roomExploreHotHeadView.f27766Oooo00O = new OooOO0();
        roomExploreHotHeadView.OooO0oO(null);
        this.mHotHeadView = roomExploreHotHeadView;
        OooOO0O oooOO0O = new OooOO0O(getContext(), oO00OO0O.item_hot_room_list, this.hotDataList);
        oooOO0O.OooOooo(oOo00OO0.ic_empty_room);
        oooOO0O.Oooo000(oO00OOo0.blank_ta_no_rooms);
        oooOO0O.OooOooO(false);
        this.mAdapter = oooOO0O;
        ((m2) getBinding()).f58397OooO0o.f31259o00000Oo = new o00O0O0O(this, 1);
        ((m2) getBinding()).f58398OooO0o0.setLayoutManager(new GridLayoutManager(3, getContext()));
        ((m2) getBinding()).f58398OooO0o0.setHasFixedSize(true);
        p565o0oOo0Oo.o00 o00Var = new p565o0oOo0Oo.o00(15.0f, 0, true);
        p565o0oOo0Oo.o00 o00Var2 = new p565o0oOo0Oo.o00(8.0f, 0, true);
        p565o0oOo0Oo.o00 o00Var3 = new p565o0oOo0Oo.o00(0.0f, -10066330, false);
        p565o0oOo0Oo.o000OO00 o000oo01 = new p565o0oOo0Oo.o000OO00(o00Var, o00Var2, o00Var3, o00Var3);
        p565o0oOo0Oo.o000OO00 o000oo02 = new p565o0oOo0Oo.o000OO00(new p565o0oOo0Oo.o00(8.0f, 0, true), new p565o0oOo0Oo.o00(8.0f, 0, true), new p565o0oOo0Oo.o00(8.0f, 0, true), new p565o0oOo0Oo.o00(0.0f, -10066330, false));
        p565o0oOo0Oo.o00 o00Var4 = new p565o0oOo0Oo.o00(15.0f, 0, true);
        p565o0oOo0Oo.o00 o00Var5 = new p565o0oOo0Oo.o00(8.0f, 0, true);
        p565o0oOo0Oo.o00 o00Var6 = new p565o0oOo0Oo.o00(0.0f, -10066330, false);
        p565o0oOo0Oo.o000OO00 o000oo03 = new p565o0oOo0Oo.o000OO00(o00Var6, o00Var5, o00Var4, o00Var6);
        RecyclerView recyclerView = ((m2) getBinding()).f58398OooO0o0;
        getContext();
        recyclerView.addItemDecoration(new OooOOO0(o000oo01, o000oo02, o000oo03));
        p564o0oOo0OO.o000O<RoomIndexModel> o000o = this.mAdapter;
        if (o000o != null) {
            View view = getMRoomExploreHeadView().f22730OooO;
            LinearLayout linearLayout = o000o.f10102OooOO0;
            if (linearLayout == null || linearLayout.getChildCount() <= 1) {
                o000o.OooO0o0(view, 1);
            } else {
                o000o.f10102OooOO0.removeViewAt(1);
                o000o.f10102OooOO0.addView(view, 1);
            }
        }
        p564o0oOo0OO.o000O<RoomIndexModel> o000o2 = this.mAdapter;
        if (o000o2 != null) {
            RoomExploreHotHeadView roomExploreHotHeadView2 = this.mHotHeadView;
            Intrinsics.checkNotNull(roomExploreHotHeadView2);
            View view2 = roomExploreHotHeadView2.f22730OooO;
            LinearLayout linearLayout2 = o000o2.f10102OooOO0;
            if (linearLayout2 == null || linearLayout2.getChildCount() <= 2) {
                o000o2.OooO0o0(view2, 2);
            } else {
                o000o2.f10102OooOO0.removeViewAt(2);
                o000o2.f10102OooOO0.addView(view2, 2);
            }
        }
        ((m2) getBinding()).f58398OooO0o0.setAdapter(this.mAdapter);
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView2 = ((m2) getBinding()).f58398OooO0o0;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.recyclerView");
        oO0OOO00.OooO0O0(recyclerView2);
        p564o0oOo0OO.o000O<RoomIndexModel> o000o3 = this.mAdapter;
        if (o000o3 != null) {
            o000o3.Oooo00O(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1$lambda$0(MainExploreFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.refreshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(MainExploreFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMViewModel().OooO0O0(false);
    }

    private final void refreshLoad() {
        StatusView statusView = this.mErrorView;
        if (statusView != null) {
            com.code.android.util.o000OO00.OooO0O0(statusView);
        }
        this.sparseArray.clear();
        MainRoomExploreViewModel mViewModel = getMViewModel();
        mViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(mViewModel), null, null, new MainRoomExploreViewModel$loadTagData$1(mViewModel, null), 3, null);
        MainRoomExploreViewModel mViewModel2 = getMViewModel();
        mViewModel2.getClass();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(mViewModel2), null, null, new MainRoomExploreViewModel$loadCountryHotSort$1(mViewModel2, null), 3, null);
        getMViewModel().getClass();
        com.code.android.util.o00oO0o.OooO00o(new oOo0oooO(null)).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooOo(), null, null, false, 14));
        getMViewModel().OooO0O0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void showOrInitErrorView() {
        StatusView statusView = this.mErrorView;
        if (statusView != null) {
            com.code.android.util.o000OO00.OooOOOO(statusView);
            return;
        }
        StatusView statusView2 = new StatusView(getContext());
        statusView2.setLayoutParams(new ViewGroup.LayoutParams(-1, ((m2) getBinding()).f58397OooO0o.getMeasuredHeight()));
        this.mErrorView = statusView2;
        Intrinsics.checkNotNull(statusView2);
        statusView2.OooO0O0(true);
        statusView2.OooO0Oo(false);
        statusView2.OooO00o(false);
        StatusView statusView3 = this.mErrorView;
        Intrinsics.checkNotNull(statusView3);
        statusView3.setOnErrorClickListener(new o00oO0o(this, 0));
        p564o0oOo0OO.o000O<RoomIndexModel> o000o = this.mAdapter;
        if (o000o != null) {
            StatusView statusView4 = this.mErrorView;
            LinearLayout linearLayout = o000o.f10102OooOO0;
            if (linearLayout == null || linearLayout.getChildCount() <= 3) {
                o000o.OooO0o0(statusView4, 3);
            } else {
                o000o.f10102OooOO0.removeViewAt(3);
                o000o.f10102OooOO0.addView(statusView4, 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showOrInitErrorView$lambda$6(MainExploreFragment this$0, View view) {
        StatusView statusView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p564o0oOo0OO.o000O<RoomIndexModel> o000o = this$0.mAdapter;
        if (o000o != null && (statusView = o000o.f56197OooOoO) != null) {
            com.code.android.util.o000OO00.OooO0O0(statusView);
        }
        StatusView statusView2 = this$0.mErrorView;
        Intrinsics.checkNotNull(statusView2);
        com.code.android.util.o000OO00.OooO0O0(statusView2);
        ((m2) this$0.getBinding()).f58397OooO0o.OooOoOO();
    }

    @Override // p508o0o0O.OooOO0O, p418o0OoO000.Oooo000
    public void onEvent(@Nullable p418o0OoO000.OooOo<?> msg) {
    }

    @Override // p508o0o0O.OooOO0O, p418o0OoO000.Oooo000
    public void onEventMainThread(@NotNull p418o0OoO000.OooOo<?> msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        int i = msg.f45532OooO00o;
        if (i == 15 || i == 36 || i == 109) {
            refreshLoad();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        initObserver();
        refreshLoad();
        ((m2) getBinding()).f58399OooO0oO.OooOO0O(true);
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o0OO000.OooO0O0("401001", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MutableLiveData<Integer> mutableLiveData = p427o0OoOO00.OooOo.f45669OooO00o;
        p427o0OoOO00.OooOo.f45669OooO00o.observe(getViewLifecycleOwner(), new Oooo000(new OooOo00()));
    }

    public final void removeDuplicatesData(@NotNull List<RoomIndexModel> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (com.code.android.util.OooOo00.OooO0O0(data)) {
            int i = 0;
            while (i < data.size()) {
                String str = data.get(i).barid;
                if (!com.code.android.util.OooOo00.OooO00o(str)) {
                    long jOooO = com.code.android.util.o0OoOo0.OooO(0L, str);
                    if (com.code.android.util.OooOo00.OooO0O0(this.sparseArray.get(jOooO, ""))) {
                        data.remove(i);
                        i--;
                    } else {
                        this.sparseArray.put(jOooO, str);
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
        ((m2) getBinding()).f58398OooO0o0.scrollToPosition(0);
        if (((m2) getBinding()).f58397OooO0o.getState() == RefreshState.None) {
            ((m2) getBinding()).f58397OooO0o.OooO();
            ((m2) getBinding()).f58397OooO0o.OooO0oo();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void uploadApiStatistical() {
        if (this.isFirstApiStatistical || !(!this.hotTop3List.isEmpty())) {
            return;
        }
        try {
            o0o000o0.OooOo00.OooO00o oooO00oOooO0O0 = p481o0o000o0.OooOo00.OooO0O0(((m2) getBinding()).f58398OooO0o0);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i = oooO00oOooO0O0.f47694OooO00o;
            int i2 = oooO00oOooO0O0.f47695OooO0O0;
            if (i == 0) {
                for (RoomIndexModel roomIndexModel : this.hotTop3List) {
                    arrayList.add(roomIndexModel.barid);
                    arrayList2.add(roomIndexModel.sessionId);
                }
                if (i2 > 0 && (!this.hotDataList.isEmpty())) {
                    int i3 = i2 - 1;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (this.hotDataList.size() > i4) {
                            arrayList.add(this.hotDataList.get(i4).barid);
                            arrayList2.add(this.hotDataList.get(i4).sessionId);
                        }
                    }
                }
            } else if (!this.hotDataList.isEmpty()) {
                int i5 = i2 - 1;
                for (int i6 = i - 1; i6 < i5; i6++) {
                    if (this.hotDataList.size() > i6) {
                        arrayList.add(this.hotDataList.get(i6).barid);
                        arrayList2.add(this.hotDataList.get(i6).sessionId);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.Explore_Hot_Rooms;
                webEventRepository.getClass();
                WebEventRepository.OooO0oO(this, arrayList, arrayList2, enterRoomParentPage);
            }
            this.isFirstApiStatistical = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public m2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m2 m2VarInflate = m2.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(m2VarInflate, "inflate(inflater, container, false)");
        return m2VarInflate;
    }
}
