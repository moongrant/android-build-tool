package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.WealthLevel;
import com.yalla.yalla.model.gift.MyGiftModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.model.user.UserInfoPostsModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserRoomsActivity;
import com.yalla.yalla.ui.screen.user.UserMomentListScreen;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.user.UserInfoVM;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p022Oooo00O.o00OOO00;
import p022Oooo00O.o0O0o0;
import p022Oooo00O.o0O0o000;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOOO00;
import p642o0ooOOO0.d1;
import p650o0ooo.m5;
import p650o0ooo.o5;
import p650o0ooo.oO0O000o;
import p650o0ooo.r4;

/* JADX INFO: loaded from: classes4.dex */
public class UserInfoLeftFragment extends com.yalla.yalla.base.fragment.OooO00o {
    public static final String ARG_1 = "arg1";
    public static final String ARG_2 = "arg2";
    private p571o0oOoO0.o0000oo<MyGiftModel.Data> baseAdapter;
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
    private p571o0oOoO0.o0000oo<ShopVehicleListModel> vehicleAdapter;
    private UserInfoVM vm;
    private XRefreshLayout xRefreshLayout;
    private int isFollow = 0;
    private int giftPageIndex = 1;
    private boolean isMyself = false;

    public class OooO extends o0OOOO0o {
        public OooO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            UserInfoLeftFragment.this.toUserRooms();
        }
    }

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            UserInfoPostsModel userInfoPostsModel = (UserInfoPostsModel) oOOO00.OooO00o(str, UserInfoPostsModel.class);
            if (userInfoPostsModel == null || com.code.android.util.OooOo00.OooO00o(userInfoPostsModel.data)) {
                return;
            }
            UserInfoLeftFragment userInfoLeftFragment = UserInfoLeftFragment.this;
            if (userInfoLeftFragment.isDetached()) {
                return;
            }
            if (userInfoLeftFragment.dataBean == null || !userInfoLeftFragment.dataBean.getInHeBlack()) {
                int size = userInfoPostsModel.data.size();
                Context context = this.f22925OooO00o;
                if (size > 0) {
                    userInfoLeftFragment.sdvPost1.setVisibility(0);
                    String strOooO00o = p403o0Oo0OO.OooO0OO.OooO00o(p184o00o00O0.OooO0OO.OooO0o0(userInfoPostsModel.data.get(0).image));
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(context);
                    oooO00o.OooO00o(d1.OooO0Oo());
                    oooO00o.f43126OooO0OO = strOooO00o;
                    oooO00o.f43124OooO00o = 0;
                    oooO00o.OooO0o0(6);
                    oooO00o.OooO0Oo(userInfoLeftFragment.sdvPost1);
                }
                if (userInfoPostsModel.data.size() > 1) {
                    userInfoLeftFragment.sdvPost2.setVisibility(0);
                    String strOooO00o2 = p403o0Oo0OO.OooO0OO.OooO00o(p184o00o00O0.OooO0OO.OooO0o0(userInfoPostsModel.data.get(1).image));
                    o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(context);
                    oooO00o2.OooO00o(d1.OooO0Oo());
                    oooO00o2.f43126OooO0OO = strOooO00o2;
                    oooO00o2.f43124OooO00o = 0;
                    oooO00o2.OooO0o0(6);
                    oooO00o2.OooO0Oo(userInfoLeftFragment.sdvPost2);
                }
                if (userInfoPostsModel.data.size() > 2) {
                    userInfoLeftFragment.sdvPost3.setVisibility(0);
                    String strOooO00o3 = p403o0Oo0OO.OooO0OO.OooO00o(p184o00o00O0.OooO0OO.OooO0o0(userInfoPostsModel.data.get(2).image));
                    o0OOo0Oo.Oooo000.OooO00o oooO00o3 = new o0OOo0Oo.Oooo000.OooO00o(context);
                    oooO00o3.OooO00o(d1.OooO0Oo());
                    oooO00o3.f43126OooO0OO = strOooO00o3;
                    oooO00o3.f43124OooO00o = 0;
                    oooO00o3.OooO0o0(6);
                    oooO00o3.OooO0Oo(userInfoLeftFragment.sdvPost3);
                }
            }
        }
    }

    public class OooO0O0 extends p571o0oOoO0.o0000oo<MyGiftModel.Data> {
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            MyGiftModel.Data data = (MyGiftModel.Data) obj;
            viewHolder.setText(p562o0oOo000.o0OO00O.txt_propNum, data.getPropNum() + "");
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
            oooO00o.f43138OooOOOo = p562o0oOo000.o0Oo0oo.icon_gift_default_gray;
            oooO00o.f43126OooO0OO = data.getImageurl();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.img_propimage));
        }
    }

    public class OooO0OO extends o0OOOO0o {
        public OooO0OO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            UserInfoLeftFragment.this.loadGifts(true);
        }
    }

    public class OooO0o extends o0OOOO0o {
        public OooO0o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            UserInfoLeftFragment userInfoLeftFragment = UserInfoLeftFragment.this;
            if (userInfoLeftFragment.dataBean == null) {
                return;
            }
            o0oo0000.OooO00o.OooO0O0("105074");
            if (userInfoLeftFragment.getContext() != null) {
                int i = BadgeActivity.f26604OooOo;
                BadgeActivity.OooO00o.OooO00o(userInfoLeftFragment.getContext(), userInfoLeftFragment.dataBean.getUserId(), userInfoLeftFragment.dataBean.getUserName(), userInfoLeftFragment.dataBean.getUserHeader(), userInfoLeftFragment.dataBean.getMedal(), false);
            }
        }
    }

    public class OooOO0 extends o0OOOO0o {
        public OooOO0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            UserInfoLeftFragment userInfoLeftFragment = UserInfoLeftFragment.this;
            if (com.code.android.util.OooOo00.OooO00o(userInfoLeftFragment.userID)) {
                return;
            }
            if (userInfoLeftFragment.dataBean == null || !userInfoLeftFragment.dataBean.getInHeBlack()) {
                o0oo0000.OooO00o.OooO0O0("105078");
                UserMomentListScreen.INSTANCE.navigate(userInfoLeftFragment.userID);
                return;
            }
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.On_His_Blacklist);
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    public class OooOO0O extends p571o0oOoO0.o0000oo<ShopVehicleListModel> {
        public OooOO0O(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            ShopVehicleListModel shopVehicleListModel = (ShopVehicleListModel) obj;
            NetImageView netImageView = (NetImageView) viewHolder.getView(p562o0oOo000.o0OO00O.img_image);
            TextView textView = (TextView) viewHolder.getView(p562o0oOo000.o0OO00O.txt_days);
            TextView textView2 = (TextView) viewHolder.getView(p562o0oOo000.o0OO00O.txt_use);
            ImageView imageView = (ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.img_add);
            if (shopVehicleListModel.getShopId() == 0) {
                imageView.setVisibility(0);
                return;
            }
            UserInfoLeftFragment userInfoLeftFragment = UserInfoLeftFragment.this;
            if (userInfoLeftFragment.isMyself) {
                textView.setVisibility(0);
                textView.setText("");
                if (shopVehicleListModel.isSelected()) {
                    textView2.setVisibility(0);
                }
                if (shopVehicleListModel.getTimeLong() == -1) {
                    textView.setText(userInfoLeftFragment.getString(p562o0oOo000.o000000.user_info_vehicle_Permanent));
                } else {
                    textView.setText(com.code.android.util.o0000O.OooO00o(userInfoLeftFragment.getString(p562o0oOo000.o000000.user_info_vehicle_days), shopVehicleListModel.getDayNum() + ""));
                }
            } else {
                textView.setVisibility(8);
            }
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(shopVehicleListModel.getPic());
            oooO00o.f43124OooO00o = 0;
            oooO00o.f43138OooOOOo = p562o0oOo000.o0Oo0oo.icon_vehicel_placeholder;
            oooO00o.OooO0Oo(netImageView);
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
        xRefreshLayout.f20857OooOooO = false;
        xRefreshLayout.f20866Oooo0o = false;
        xRefreshLayout.setOnLoadMoreListener(new androidx.media3.session.o00O0O(this));
        this.recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        OooO0O0 oooO0O0 = new OooO0O0(getContext(), p562o0oOo000.oo0o0Oo.item_user_gifts);
        this.baseAdapter = oooO0O0;
        oooO0O0.f13176OooO0o = new o00OOO00(this);
        oooO0O0.Oooo00O(true);
        this.baseAdapter.OooOooo(p562o0oOo000.o0Oo0oo.icon_no_gifts);
        this.baseAdapter.Oooo000(p562o0oOo000.o000000.UserInfo_Gift_havenot_gifts);
        this.baseAdapter.OooOooO(false);
        this.baseAdapter.Oooo0OO(new OooO0OO());
        View viewInflate = View.inflate(getContext(), p562o0oOo000.oo0o0Oo.layout_userinfo_left_header, null);
        viewInflate.findViewById(p562o0oOo000.o0OO00O.ll_badge).setOnClickListener(new OooO0o());
        this.mvMedal = (UserMedalView) viewInflate.findViewById(p562o0oOo000.o0OO00O.mv_medal);
        viewInflate.findViewById(p562o0oOo000.o0OO00O.ll_room).setOnClickListener(new OooO());
        this.tvRoomNum = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_userinfo_room_num);
        viewInflate.findViewById(p562o0oOo000.o0OO00O.ll_post).setOnClickListener(new OooOO0());
        this.sdvPost1 = (NetImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.sdv_post1);
        this.sdvPost2 = (NetImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.sdv_post2);
        this.sdvPost3 = (NetImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.sdv_post3);
        this.layoutVehicle = (LinearLayout) viewInflate.findViewById(p562o0oOo000.o0OO00O.layout_vehicle);
        this.listVehicle = (RecyclerView) viewInflate.findViewById(p562o0oOo000.o0OO00O.list_vehicle);
        this.baseAdapter.OooOo(viewInflate);
        this.recyclerView.setAdapter(this.baseAdapter);
        OooOO0O oooOO0O = new OooOO0O(getContext(), p562o0oOo000.oo0o0Oo.item_user_vehicle);
        this.vehicleAdapter = oooOO0O;
        oooOO0O.f13176OooO0o = new o0O0o0(this);
        this.listVehicle.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.layoutVehicle.setVisibility(8);
        this.listVehicle.setAdapter(this.vehicleAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2() {
        loadGifts(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$initView$3(int i, Boolean bool) {
        if (!bool.booleanValue()) {
            return null;
        }
        this.baseAdapter.f13189OooOOoo.get(i).setPropNum(this.baseAdapter.f13189OooOOoo.get(i).getPropNum() + 1);
        this.baseAdapter.notifyDataSetChanged();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.yalla.yalla.ui.fragment.o000OO0O, java.lang.Object] */
    public void lambda$initView$4(BaseQuickAdapter baseQuickAdapter, View view, final int i) {
        if (this.dataBean == null) {
            return;
        }
        UserInfoActivity userInfoActivity = (UserInfoActivity) requireActivity();
        long j = Long.parseLong(this.userID);
        MyGiftModel.Data gift = this.baseAdapter.f13189OooOOoo.get(i);
        ?? sendResultListener = new Function1() { // from class: com.yalla.yalla.ui.fragment.o000OO0O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f28394OooO0Oo.lambda$initView$3(i, (Boolean) obj);
            }
        };
        Intrinsics.checkNotNullParameter(gift, "gift");
        Intrinsics.checkNotNullParameter(sendResultListener, "sendResultListener");
        if (userInfoActivity != null) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && l.longValue() == j) {
                return;
            }
            boolean z = true;
            if (!gift.getIsShowUpgrade()) {
                if (gift.isGiftWealth()) {
                    if (!WealthLevel.Companion.isUnlocked$default(WealthLevel.INSTANCE, null, 1, null)) {
                        p423o0OoO0OO.oo0o0Oo.OooO00o(userInfoActivity, new m5(new p511o0o0O.oo0o0Oo(userInfoActivity)));
                        return;
                    } else if (gift.isNotGiftWealthLevel()) {
                        String sendLvLimit = com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(gift.getSendLevelLimit()), "");
                        Intrinsics.checkNotNullParameter(sendLvLimit, "sendLvLimit");
                        p423o0OoO0OO.oo0o0Oo.OooO00o(userInfoActivity, new o5(sendLvLimit, null));
                        return;
                    }
                }
                userInfoActivity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-548148568, true, new p511o0o0O.o00000(j, gift, userInfoActivity, sendResultListener)));
                return;
            }
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.update_app_send_gift);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initView$5(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (this.vehicleAdapter.f13189OooOOoo.get(i).getShopId() == 0 && this.isMyself) {
            int i2 = VehicleStoreActivity.f26578OooOo;
            VehicleStoreActivity.OooO00o.OooO00o(requireActivity(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadGifts$0(boolean z, ApiResult apiResult) {
        if (!apiResult.isSuccess()) {
            this.baseAdapter.OooOoo();
            this.xRefreshLayout.OooOooo(z, false, true);
            return;
        }
        if (apiResult.getData() == null || com.code.android.util.OooOo00.OooO00o(apiResult.getData())) {
            this.baseAdapter.Oooo00o();
            this.xRefreshLayout.OooOooo(z, true, true);
            return;
        }
        this.giftPageIndex++;
        if (z) {
            this.baseAdapter.OooOoO0(filter((List) apiResult.getData()));
        } else {
            this.baseAdapter.OooO0O0(filter((List) apiResult.getData()));
        }
        this.baseAdapter.Oooo00o();
        this.xRefreshLayout.OooOooo(z, true, ((List) apiResult.getData()).size() < 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadVehicleList$1(ApiResult apiResult) {
        ShopVehicleListModel shopVehicleListModel;
        ArrayList arrayList = new ArrayList();
        if (apiResult.isSuccess() && !com.code.android.util.OooOo00.OooO00o(apiResult.getData())) {
            arrayList.addAll((Collection) apiResult.getData());
        }
        if (com.code.android.util.OooOo00.OooO00o(arrayList)) {
            this.layoutVehicle.setVisibility(8);
            return;
        }
        this.layoutVehicle.setVisibility(0);
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                shopVehicleListModel = null;
                break;
            }
            shopVehicleListModel = (ShopVehicleListModel) arrayList.get(i);
            if (shopVehicleListModel.isSelected()) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (shopVehicleListModel != null) {
            arrayList.add(0, shopVehicleListModel);
        }
        if (this.isMyself) {
            ShopVehicleListModel shopVehicleListModel2 = new ShopVehicleListModel();
            shopVehicleListModel2.setShopId(0L);
            arrayList.add(0, shopVehicleListModel2);
        }
        this.vehicleAdapter.OooOoO0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAddPowerSeeroomFriend$6() {
        int i = UserRoomsActivity.f26896OooOoO0;
        UserRoomsActivity.OooO00o.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$showAddPowerSeeroomFriend$7() {
        if (this.dataBean != null && (requireActivity() instanceof UserInfoActivity)) {
            UserInfoActivity userInfoActivity = (UserInfoActivity) requireActivity();
            userInfoActivity.f26795Oooo0o0 = new androidx.media3.session.o00Oo0(this);
            UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
            if (userInfoModel != null) {
                userInfoActivity.OooOoO(userInfoModel.getPurview().getIsVerify(), userInfoModel.getIsBlack(), userInfoModel.getInHeBlack());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAddPowerSeeroomFriendAndFans$8() {
        int i = UserRoomsActivity.f26896OooOoO0;
        UserRoomsActivity.OooO00o.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$showAddPowerSeeroomFriendAndFans$9() {
        if (!(requireActivity() instanceof UserInfoActivity)) {
            return null;
        }
        ((UserInfoActivity) requireActivity()).OooOoo(true, new o0O0o000(this));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadGifts(final boolean z) {
        if (z) {
            this.giftPageIndex = 1;
        }
        this.vm.propUserHonor(this.userID, this.giftPageIndex).observe(getViewLifecycleOwner(), new Observer() { // from class: com.yalla.yalla.ui.fragment.o000O0O0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f28382OooO0Oo.lambda$loadGifts$0(z, (ApiResult) obj);
            }
        });
    }

    private void loadPosts() {
        p384o0OOoo0O.o00Ooo o00ooo2 = p384o0OOoo0O.o0OO00O.f43463OooO0O0;
        String str = this.userID;
        OooO00o oooO00o = new OooO00o(getContext());
        o00ooo2.getClass();
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("touserid", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43408o0000O0O, p384o0OOoo0O.Oooo0.f43410o0000OO0, linkedHashMapOooO00o, oooO00o);
    }

    private void loadVehicleList() {
        this.vm.userVehicleList(com.code.android.util.o0OoOo0.OooO(0L, this.userID)).observe(getViewLifecycleOwner(), new oO0O000o(1, this));
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
            int i = UserRoomsActivity.f26896OooOoO0;
            UserRoomsActivity.OooO00o.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
            return;
        }
        BaseFragmentActivity activity = (BaseFragmentActivity) requireActivity();
        Function0 onConfirmClick = new Function0() { // from class: com.yalla.yalla.ui.fragment.o000O0Oo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f28384OooO0Oo.lambda$showAddPowerSeeroomFriend$7();
            }
        };
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-1822011199, true, new r4(true, onConfirmClick)));
    }

    private void showAddPowerSeeroomFriendAndFans() {
        UserInfoModel userInfoModel = this.dataBean;
        if (userInfoModel == null) {
            return;
        }
        if (userInfoModel.getIsFollow() || this.dataBean.getIsFriend()) {
            int i = UserRoomsActivity.f26896OooOoO0;
            UserRoomsActivity.OooO00o.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
            return;
        }
        BaseFragmentActivity activity = (BaseFragmentActivity) requireActivity();
        Function0 onConfirmClick = new Function0() { // from class: com.yalla.yalla.ui.fragment.o000O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f28378OooO0Oo.lambda$showAddPowerSeeroomFriendAndFans$9();
            }
        };
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-1822011199, true, new r4(false, onConfirmClick)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toUserRooms() {
        if (this.dataBean == null) {
            return;
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (p004OooO0oO.o0OoOo0.OooO00o().equals(this.userID)) {
            int i = UserRoomsActivity.f26896OooOoO0;
            UserRoomsActivity.OooO00o.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
            return;
        }
        boolean z = true;
        if (this.dataBean.getInHeBlack()) {
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.On_His_Blacklist);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
                return;
            } else {
                com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        int seeRoom = this.dataBean.getPurview().getSeeRoom();
        if (seeRoom == 0) {
            int i2 = UserRoomsActivity.f26896OooOoO0;
            UserRoomsActivity.OooO00o.OooO00o(requireActivity(), this.userID, this.dataBean.toOldModel());
        } else if (seeRoom == 1) {
            showAddPowerSeeroomFriend();
        } else {
            if (seeRoom != 2) {
                return;
            }
            showAddPowerSeeroomFriendAndFans();
        }
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.vm = (UserInfoVM) new ViewModelProvider(requireActivity()).get(UserInfoVM.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (getArguments() != null) {
            String string = getArguments().getString(ARG_1);
            this.userID = string;
            long jOooO = com.code.android.util.o0OoOo0.OooO(0L, string);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (jOooO == ((Long) o0O00oO0.OooOOo0().getValue()).longValue()) {
                this.isMyself = true;
            }
        }
        return layoutInflater.inflate(p562o0oOo000.oo0o0Oo.user_fragment_userinfo_left, viewGroup, false);
    }

    @Override // com.yalla.yalla.base.fragment.OooO00o, p545o0oO0O00.OooOOOO
    public void onEventMainThread(p545o0oO0O00.OooOOO oooOOO) {
        UserInfoModel userInfoModel;
        super.onEventMainThread(oooOOO);
        if (oooOOO.f55758OooO00o == 19 && (userInfoModel = this.dataBean) != null) {
            userInfoModel.setFollow(oooOOO.f55759OooO0O0 == 1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.recyclerView = (RecyclerView) view.findViewById(p562o0oOo000.o0OO00O.rlUserInfoLeft);
        this.xRefreshLayout = (XRefreshLayout) view.findViewById(p562o0oOo000.o0OO00O.xrl);
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
        if (com.code.android.util.OooO0OO.OooO00o(getActivity())) {
            this.dataBean = userInfoModel;
            if (userInfoModel == null) {
                return;
            }
            if (this.tvRoomNum != null) {
                if (userInfoModel.getJoinRoomNum() > 0) {
                    StringBuffer stringBuffer = new StringBuffer(this.dataBean.getJoinRoomNum() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    stringBuffer.append(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Joined));
                    this.tvRoomNum.setText(stringBuffer.toString());
                } else {
                    this.tvRoomNum.setText("");
                }
            }
            UserMedalView userMedalView = this.mvMedal;
            if (userMedalView != null) {
                userMedalView.OooO00o(this.dataBean.getMedal(), getViewLifecycleOwner());
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
