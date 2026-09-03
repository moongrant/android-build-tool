package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseFragmentActivity;
import com.app.base.model.UserInfoPostsModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.model.MyGiftModel;
import com.yalla.yalla.ui.activity.moment.UserPostListActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.vm.user.UserInfoVM;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p043OooooO0.o00O0000;
import p139o00OOOo0.oo0oOO0;
import p160o00OoOO0.o00OO0O0;
import p176o00OoooO.oO0OOO00;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p381o0OOoOOO.o0O00o0;
import p391o0OOooOo.o0O00000;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
public class UserInfoLeftFragment extends o00OOO0.OooO00o {
    public static final String ARG_1 = "arg1";
    public static final String ARG_2 = "arg2";
    private p188o00o00o0.OooO0OO<MyGiftModel.Data> baseAdapter;
    private UserInfoModel dataBean;
    private LinearLayout layoutVehicle;
    private RecyclerView listVehicle;
    private UserMedalView mvMedal;
    private RecyclerView recyclerView;
    private NetImageView sdvPost1;
    private NetImageView sdvPost2;
    private NetImageView sdvPost3;
    private TextView tvRoomNum;
    private String userID;
    private p188o00o00o0.OooO0OO<ShopVehicleListModel> vehicleAdapter;
    private UserInfoVM vm;
    private XRefreshLayout xRefreshLayout;
    private int isFollow = 0;
    private int giftPageIndex = 1;
    private boolean isMyself = false;

    public class OooO extends p654o0ooo.o00Oo0 {
        public OooO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            UserInfoLeftFragment.this.toUserRooms();
        }
    }

    public class OooO00o extends o00OO0O0.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            UserInfoPostsModel userInfoPostsModel = (UserInfoPostsModel) com.android.billingclient.api.o0Oo0oo.OooO0O0(str, UserInfoPostsModel.class);
            if (userInfoPostsModel == null || com.yalla.support.common.util.OooO0OO.OooO00o(userInfoPostsModel.data) || UserInfoLeftFragment.this.isDetached()) {
                return;
            }
            if (UserInfoLeftFragment.this.dataBean == null || !UserInfoLeftFragment.this.dataBean.getInHeBlack()) {
                if (userInfoPostsModel.data.size() > 0) {
                    UserInfoLeftFragment.this.sdvPost1.setVisibility(0);
                    String strImgSize = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgPng(userInfoPostsModel.data.get(0).image), com.yalla.support.common.util.OooOo00.OooO00o(35), true);
                    oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
                    oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
                    oooO00o.f48429OooO0OO = strImgSize;
                    oooO00o.f48427OooO00o = 0;
                    oooO00o.OooO0oO(6);
                    oooO00o.OooO0o(UserInfoLeftFragment.this.sdvPost1);
                }
                if (userInfoPostsModel.data.size() > 1) {
                    UserInfoLeftFragment.this.sdvPost2.setVisibility(0);
                    String strImgSize2 = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgPng(userInfoPostsModel.data.get(1).image), com.yalla.support.common.util.OooOo00.OooO00o(35), true);
                    oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
                    oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
                    oooO00o2.f48429OooO0OO = strImgSize2;
                    oooO00o2.f48427OooO00o = 0;
                    oooO00o2.OooO0oO(6);
                    oooO00o2.OooO0o(UserInfoLeftFragment.this.sdvPost2);
                }
                if (userInfoPostsModel.data.size() > 2) {
                    UserInfoLeftFragment.this.sdvPost3.setVisibility(0);
                    String strImgSize3 = CloudImageUtilKt.imgSize(CloudImageUtilKt.imgPng(userInfoPostsModel.data.get(2).image), com.yalla.support.common.util.OooOo00.OooO00o(35), true);
                    oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(getContext());
                    oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o());
                    oooO00o3.f48429OooO0OO = strImgSize3;
                    oooO00o3.f48427OooO00o = 0;
                    oooO00o3.OooO0oO(6);
                    oooO00o3.OooO0o(UserInfoLeftFragment.this.sdvPost3);
                }
            }
        }
    }

    public class OooO0O0 extends p188o00o00o0.OooO0OO<MyGiftModel.Data> {
        public OooO0O0(Context context) {
            super(context, R.layout.item_user_gifts);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            MyGiftModel.Data data = (MyGiftModel.Data) obj;
            oooO0o.OooOO0(R.id.txt_propNum, data.getPropNum() + "");
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.f48441OooOOOo = R.drawable.icon_gift_default_gray;
            oooO00o2.f48429OooO0OO = data.getImageurl();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.img_propimage));
        }
    }

    public class OooO0OO extends p654o0ooo.o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            UserInfoLeftFragment.this.loadGifts(true);
        }
    }

    public class OooO0o extends p654o0ooo.o00Oo0 {
        public OooO0o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            if (UserInfoLeftFragment.this.dataBean == null) {
                return;
            }
            o0O00000.OooO0OO("Me_profile_badge");
            if (UserInfoLeftFragment.this.getContext() != null) {
                BadgeActivity.f23283OooooOo.OooO00o(UserInfoLeftFragment.this.getContext(), UserInfoLeftFragment.this.dataBean.getUserId(), UserInfoLeftFragment.this.dataBean.getUserName(), UserInfoLeftFragment.this.dataBean.getUserHeader(), UserInfoLeftFragment.this.dataBean.getMedal(), false);
            }
        }
    }

    public class OooOO0 extends p654o0ooo.o00Oo0 {
        public OooOO0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            if (com.yalla.support.common.util.OooO0OO.OooO00o(UserInfoLeftFragment.this.userID)) {
                return;
            }
            if (UserInfoLeftFragment.this.dataBean == null || !UserInfoLeftFragment.this.dataBean.getInHeBlack()) {
                o0O00000.OooO0OO("Me_profile_post");
                UserPostListActivity.OooO00o oooO00o = UserPostListActivity.f22674Ooooooo;
                FragmentActivity context = UserInfoLeftFragment.this.requireActivity();
                String str = UserInfoLeftFragment.this.userID;
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent = new Intent(context, (Class<?>) UserPostListActivity.class);
                intent.putExtra("Id", str);
                context.startActivity(intent);
                return;
            }
            String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.On_His_Blacklist);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
    }

    public class OooOO0O extends p188o00o00o0.OooO0OO<ShopVehicleListModel> {
        public OooOO0O(Context context) {
            super(context, R.layout.item_user_vehicle);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            ShopVehicleListModel shopVehicleListModel = (ShopVehicleListModel) obj;
            NetImageView netImageView = (NetImageView) oooO0o.OooO0Oo(R.id.img_image);
            TextView textView = (TextView) oooO0o.OooO0Oo(R.id.txt_days);
            TextView textView2 = (TextView) oooO0o.OooO0Oo(R.id.txt_use);
            ImageView imageView = (ImageView) oooO0o.OooO0Oo(R.id.img_add);
            if (shopVehicleListModel.getShopId() == 0) {
                imageView.setVisibility(0);
                return;
            }
            if (UserInfoLeftFragment.this.isMyself) {
                textView.setVisibility(0);
                textView.setText("");
                if (shopVehicleListModel.getIsSelected()) {
                    textView2.setVisibility(0);
                }
                if (shopVehicleListModel.getTimeLong() == -1) {
                    textView.setText(UserInfoLeftFragment.this.getString(R.string.user_info_vehicle_Permanent));
                } else {
                    textView.setText(com.yalla.support.common.util.OooOo.OooO00o(UserInfoLeftFragment.this.getString(R.string.user_info_vehicle_days), shopVehicleListModel.getDayNum() + ""));
                }
            } else {
                textView.setVisibility(8);
            }
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(shopVehicleListModel.getPic());
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48441OooOOOo = R.drawable.icon_vehicel_placeholder;
            oooO00o2.OooO0o(netImageView);
        }
    }

    private List<MyGiftModel.Data> filter(List<MyGiftModel.Data> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            MyGiftModel.Data data = list.get(i);
            if (data != null && data.getPropNum() > 0) {
                arrayList.add(data);
            }
        }
        return arrayList;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void initView() {
        XRefreshLayout xRefreshLayout = this.xRefreshLayout;
        xRefreshLayout.f19541o00O0O = false;
        xRefreshLayout.f19554o0ooOOo = false;
        xRefreshLayout.setOnLoadMoreListener(new p192o00o0O0.o0OO00O(this, 4));
        this.recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        OooO0O0 oooO0O0 = new OooO0O0(getContext());
        this.baseAdapter = oooO0O0;
        oooO0O0.setOnItemClickListener(new o0O0OOO.OooOo00(this));
        this.baseAdapter.setFirstLoading(true);
        this.baseAdapter.setEmptyImageRes(R.drawable.icon_no_gifts);
        this.baseAdapter.setEmptyText(R.string.UserInfo_Gift_havenot_gifts);
        this.baseAdapter.setEmptyFullScreen(false);
        this.baseAdapter.setLoadErrorClickListener(new OooO0OO());
        View viewInflate = View.inflate(getContext(), R.layout.layout_userinfo_left_header, null);
        viewInflate.findViewById(R.id.ll_badge).setOnClickListener(new OooO0o());
        this.mvMedal = (UserMedalView) viewInflate.findViewById(R.id.mv_medal);
        viewInflate.findViewById(R.id.ll_room).setOnClickListener(new OooO());
        this.tvRoomNum = (TextView) viewInflate.findViewById(R.id.tv_userinfo_room_num);
        viewInflate.findViewById(R.id.ll_post).setOnClickListener(new OooOO0());
        this.sdvPost1 = (NetImageView) viewInflate.findViewById(R.id.sdv_post1);
        this.sdvPost2 = (NetImageView) viewInflate.findViewById(R.id.sdv_post2);
        this.sdvPost3 = (NetImageView) viewInflate.findViewById(R.id.sdv_post3);
        this.layoutVehicle = (LinearLayout) viewInflate.findViewById(R.id.layout_vehicle);
        this.listVehicle = (RecyclerView) viewInflate.findViewById(R.id.list_vehicle);
        this.baseAdapter.setHeaderView(viewInflate);
        this.recyclerView.setAdapter(this.baseAdapter);
        OooOO0O oooOO0O = new OooOO0O(getContext());
        this.vehicleAdapter = oooOO0O;
        oooOO0O.setOnItemClickListener(new p142o00OOooO.o0OO00O(this, 3));
        this.listVehicle.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.layoutVehicle.setVisibility(8);
        this.listVehicle.setAdapter(this.vehicleAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2() {
        loadGifts(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$initView$3(int i, Boolean bool) {
        if (!bool.booleanValue()) {
            return null;
        }
        this.baseAdapter.getData().get(i).setPropNum(this.baseAdapter.getData().get(i).getPropNum() + 1);
        this.baseAdapter.notifyDataSetChanged();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initView$4(BaseQuickAdapter baseQuickAdapter, View view, final int i) {
        if (this.dataBean == null || kotlin.collections.unsigned.OooO00o.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o).equals(this.userID)) {
            return;
        }
        long j = Long.parseLong(this.dataBean.toOldModel().getId());
        MyGiftModel.Data gift = this.baseAdapter.getData().get(i);
        Function1 sendResultListener = new Function1() { // from class: o0oOoOoO.i3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f46864Oooo0o.lambda$initView$3(i, (Boolean) obj);
            }
        };
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(gift, "gift");
        Intrinsics.checkNotNullParameter(sendResultListener, "sendResultListener");
        if (gift.getIsShowUpgrade()) {
            ToastUtil.f12567OooO00o.OooO00o(R.string.update_app_send_gift);
        } else {
            showDialog(null, o00O0000.OooO0O0(1133612283, true, new oO0OOO00(gift, j, this, sendResultListener)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$5(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (this.vehicleAdapter.getData().get(i).getShopId() == 0 && this.isMyself) {
            VehicleStoreActivity.f23259OooooOO.OooO00o(requireActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadGifts$0(boolean z, ApiResult apiResult) {
        if (!apiResult.isSuccess()) {
            this.baseAdapter.loadError();
            this.xRefreshLayout.Oooo0o0(z, false, true);
            return;
        }
        if (apiResult.getData() == null || com.yalla.support.common.util.OooO0OO.OooO00o(apiResult.getData())) {
            this.baseAdapter.setLoadComplete();
            this.xRefreshLayout.Oooo0o0(z, true, true);
            return;
        }
        this.giftPageIndex++;
        if (z) {
            this.baseAdapter.setNewData(filter((List) apiResult.getData()));
        } else {
            this.baseAdapter.addData(filter((List) apiResult.getData()));
        }
        this.baseAdapter.setLoadComplete();
        this.xRefreshLayout.Oooo0o0(z, true, ((List) apiResult.getData()).size() < 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadVehicleList$1(ApiResult apiResult) {
        ArrayList arrayList = new ArrayList();
        if (apiResult.isSuccess() && !com.yalla.support.common.util.OooO0OO.OooO00o(apiResult.getData())) {
            arrayList.addAll((Collection) apiResult.getData());
        }
        if (com.yalla.support.common.util.OooO0OO.OooO00o(arrayList)) {
            this.layoutVehicle.setVisibility(8);
            return;
        }
        this.layoutVehicle.setVisibility(0);
        ShopVehicleListModel shopVehicleListModel = null;
        for (int i = 0; i < arrayList.size(); i++) {
            ShopVehicleListModel shopVehicleListModel2 = (ShopVehicleListModel) arrayList.get(i);
            if (shopVehicleListModel2.getIsSelected()) {
                arrayList.remove(i);
                shopVehicleListModel = shopVehicleListModel2;
                break;
            }
        }
        if (shopVehicleListModel != null) {
            arrayList.add(0, shopVehicleListModel);
        }
        if (this.isMyself) {
            ShopVehicleListModel shopVehicleListModel3 = new ShopVehicleListModel();
            shopVehicleListModel3.setShopId(0L);
            arrayList.add(0, shopVehicleListModel3);
        }
        this.vehicleAdapter.setNewData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAddPowerSeeroomFriend$6() {
        UserRoomsActivity.f23561Oooooo0.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$showAddPowerSeeroomFriend$7() {
        if (this.dataBean != null && (requireActivity() instanceof UserInfoActivity)) {
            UserInfoActivity userInfoActivity = (UserInfoActivity) requireActivity();
            userInfoActivity.f23467o00oO0O = new p192o00o0O0.o00000O(this);
            userInfoActivity.Oooo0o();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAddPowerSeeroomFriendAndFans$8() {
        UserRoomsActivity.f23561Oooooo0.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showAddPowerSeeroomFriendAndFans$9() {
        if (!(requireActivity() instanceof UserInfoActivity)) {
            return null;
        }
        ((UserInfoActivity) requireActivity()).Oooo00O(true, new o0O00o0(this));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadGifts(final boolean z) {
        if (z) {
            this.giftPageIndex = 1;
        }
        this.vm.propUserHonor(this.userID, this.giftPageIndex).observe(getViewLifecycleOwner(), new Observer() { // from class: o0oOoOoO.g3
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f46855OooO00o.lambda$loadGifts$0(z, (ApiResult) obj);
            }
        });
    }

    private void loadPosts() {
        p153o00Oo0oO.o00oO0o o00oo0o2 = p153o00Oo0oO.o00000OO.f32207OooO00o;
        p153o00Oo0oO.o0Oo0oo o0oo0oo2 = p153o00Oo0oO.o00000OO.f32213OooO0oO;
        String str = this.userID;
        OooO00o oooO00o = new OooO00o(getContext());
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("touserid", str);
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32298o0000OOo, p153o00Oo0oO.o0ooOOo.f32304o0000o0, mapOooO0O0, oooO00o);
    }

    private void loadVehicleList() {
        this.vm.userVehicleList(com.yalla.support.common.util.OooO.OooO0o(this.userID)).observe(getViewLifecycleOwner(), new p142o00OOooO.o000OOo(this, 5));
    }

    public static UserInfoLeftFragment newInstantce(String str) {
        UserInfoLeftFragment userInfoLeftFragment = new UserInfoLeftFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_1, str);
        userInfoLeftFragment.setArguments(bundle);
        return userInfoLeftFragment;
    }

    private void showAddPowerSeeroomFriend() {
        UserInfoModel userInfoModel = this.dataBean;
        if (userInfoModel == null) {
            return;
        }
        if (userInfoModel.getIsFriend()) {
            UserRoomsActivity.f23561Oooooo0.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
        } else {
            oo0oOO0.OooO00o((BaseFragmentActivity) requireActivity(), true, new p159o00OoOO.OooOO0O(this, 1));
        }
    }

    private void showAddPowerSeeroomFriendAndFans() {
        UserInfoModel userInfoModel = this.dataBean;
        if (userInfoModel == null) {
            return;
        }
        if (userInfoModel.getIsFollow() || this.dataBean.getIsFriend()) {
            UserRoomsActivity.f23561Oooooo0.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
        } else {
            oo0oOO0.OooO00o((BaseFragmentActivity) requireActivity(), false, new Function0() { // from class: o0oOoOoO.h3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f46858Oooo0o.lambda$showAddPowerSeeroomFriendAndFans$9();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toUserRooms() {
        if (this.dataBean == null) {
            return;
        }
        if (kotlin.collections.unsigned.OooO00o.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o).equals(this.userID)) {
            UserRoomsActivity.f23561Oooooo0.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
            return;
        }
        if (this.dataBean.getInHeBlack()) {
            ToastUtil.f12567OooO00o.OooO0O0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.On_His_Blacklist));
            return;
        }
        int seeRoom = this.dataBean.getPurview().getSeeRoom();
        if (seeRoom == 0) {
            UserRoomsActivity.f23561Oooooo0.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
        } else if (seeRoom == 1) {
            showAddPowerSeeroomFriend();
        } else {
            if (seeRoom != 2) {
                return;
            }
            showAddPowerSeeroomFriendAndFans();
        }
    }

    @Override // o00OOO0.OooO00o, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.vm = (UserInfoVM) new ViewModelProvider(requireActivity()).get(UserInfoVM.class);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (getArguments() != null) {
            String string = getArguments().getString(ARG_1);
            this.userID = string;
            if (com.yalla.support.common.util.OooO.OooO0o(string) == p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue().longValue()) {
                this.isMyself = true;
            }
        }
        return layoutInflater.inflate(R.layout.user_fragment_userinfo_left, viewGroup, false);
    }

    @Override // o00OOO0.OooO00o, p140o00OOOoO.OooO0o
    public void onEventMainThread(p140o00OOOoO.OooO0OO oooO0OO) {
        UserInfoModel userInfoModel;
        super.onEventMainThread(oooO0OO);
        if (oooO0OO.f31885OooO00o == 19 && (userInfoModel = this.dataBean) != null) {
            userInfoModel.setFollow(oooO0OO.f31886OooO0O0 == 1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.recyclerView = (RecyclerView) view.findViewById(R.id.rlUserInfoLeft);
        this.xRefreshLayout = (XRefreshLayout) view.findViewById(R.id.xrl);
        initView();
        loadGifts(true);
        loadVehicleList();
        loadPosts();
    }

    public void setIsFollow(int i) {
        this.isFollow = i;
    }

    public void updateInfo(UserInfoModel userInfoModel) {
        NetImageView netImageView;
        if (p254o00ooO0O.o0000Ooo.OooO00o(getActivity())) {
            this.dataBean = userInfoModel;
            if (userInfoModel == null) {
                return;
            }
            if (this.tvRoomNum != null) {
                if (userInfoModel.getJoinRoomNum() > 0) {
                    StringBuffer stringBuffer = new StringBuffer(this.dataBean.getJoinRoomNum() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    stringBuffer.append(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Joined));
                    this.tvRoomNum.setText(stringBuffer.toString());
                } else {
                    this.tvRoomNum.setText("");
                }
            }
            UserMedalView userMedalView = this.mvMedal;
            if (userMedalView != null) {
                userMedalView.OooO0O0(this.dataBean.getMedal(), getViewLifecycleOwner());
            }
            if (!this.dataBean.getInHeBlack() || (netImageView = this.sdvPost1) == null) {
                return;
            }
            netImageView.setVisibility(8);
            this.sdvPost2.setVisibility(8);
            this.sdvPost3.setVisibility(8);
        }
    }
}
