package com.app.base.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.app.appConfig.apiDataModela.ApiUserFriendsUtils;
import com.app.base.app.appConfig.apiDataModela.FriendsModel;
import com.app.base.app.appConfig.apiDataModela.FriendsModelBean;
import com.app.base.application.App;
import com.app.base.fragment.FriendsListFragment;
import com.app.base.model.RoomModel;
import com.app.base.model.UserInBarModel;
import com.app.base.view.SearchView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.Oooo0;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.data.db.model.FriendsTableOld;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.youth.banner.config.BannerConfig;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p025Oooo0O0.o000O0Oo;
import p142o00OOooO.o00Oo0;
import p153o00Oo0oO.o000000O;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo000o;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p516o0o0O000.o00000O;
import p520o0o0O0O0.o00O0O;
import p616o0oo0Ooo.oO0O00;
import p620o0oo0o0O.o00O00o0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FriendsListFragment extends o00OOO0.OooO00o {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private p188o00o00o0.OooO0OO<FriendsTableOld> baseAdapter;
    private List<FriendsTableOld> friendsList;
    private List<FriendsTableOld> friendsListFromInterface;
    private SearchView mSearchView;
    private RecyclerView recFriends;
    private View rootView;
    private XRefreshLayout xRefreshLayout;
    private boolean loading = false;
    private int friendsMax = 2500;
    private List<FriendsModel> liveFrindsList = new ArrayList();
    private List<FriendsTableOld> liveFrindsListTemp = new ArrayList();

    public class OooO extends p188o00o00o0.OooO0OO<FriendsTableOld> {
        public OooO(Context context) {
            super(context, R.layout.item_rec_friends);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            final FriendsTableOld friendsTableOld = (FriendsTableOld) obj;
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o2.f48429OooO0OO = friendsTableOld.headphoto;
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.niv_header));
            SVGAView sVGAView = (SVGAView) oooO0o.OooO0Oo(R.id.niv_head_frame_svga);
            LifecycleOwner viewLifecycleOwner = FriendsListFragment.this.getViewLifecycleOwner();
            String str = friendsTableOld.headframeurl;
            sVGAView.setImageDrawable(null);
            sVGAView.setVisibility(8);
            sVGAView.OooO0o0(false);
            if (!com.yalla.support.common.util.OooO0OO.OooO00o(str) && !"/headframe/0.png".equals(str)) {
                sVGAView.setVisibility(0);
                sVGAView.f21010OooooO0 = 0;
                sVGAView.OooO0oo(str, viewLifecycleOwner);
                sVGAView.OooO();
            }
            TextView textView = (TextView) oooO0o.OooO0Oo(R.id.tv_name);
            TextView textView2 = (TextView) oooO0o.OooO0Oo(R.id.tv_bio);
            String strOooO0O0 = o00O0O.f42677OooO00o.OooO0O0(com.yalla.support.common.util.OooO.OooO0o(friendsTableOld.userid), "");
            friendsTableOld.memoName = strOooO0O0;
            textView.setText(com.yalla.support.common.util.OooO0OO.OooO0O0(strOooO0O0) ? strOooO0O0 : friendsTableOld.username);
            String strTrim = FriendsListFragment.this.mSearchView.getEditSearch().getText().toString().trim();
            if (strTrim.length() > 0) {
                String[] strArr = {strTrim};
                Oooo0.OooO0O0(textView, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9), strArr);
                if (com.yalla.support.common.util.OooO0OO.OooO0O0(strOooO0O0) && friendsTableOld.username.contains(strTrim)) {
                    textView2.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + friendsTableOld.username);
                    textView2.setVisibility(0);
                } else if (friendsTableOld.standbyone.contains(strTrim)) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ID:");
                    sbOooO0o0.append(friendsTableOld.standbyone);
                    textView2.setText(sbOooO0o0.toString());
                    textView2.setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                }
                Oooo0.OooO0O0(textView2, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9), strArr);
            } else {
                textView2.setVisibility(0);
                String str2 = friendsTableOld.sign;
                textView2.setText((str2 == null || !com.yalla.support.common.util.OooO0OO.OooO0O0(str2.trim())) ? com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Userinfo_Sign_Hint) : friendsTableOld.sign);
            }
            ((UserPremiumView) oooO0o.OooO0Oo(R.id.iv_vip)).OooO0OO(com.yalla.support.common.util.OooO0OO.OooO0O0(friendsTableOld.uservip) ? Integer.parseInt(friendsTableOld.uservip) : 0, com.yalla.support.common.util.OooO0OO.OooO0O0(friendsTableOld.supervip) ? Integer.parseInt(friendsTableOld.supervip) : 0);
            if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(friendsTableOld.standbythree)) {
                oooO0o.OooO0oO(R.id.iv_sex, true);
                oooO0o.OooO0oo(R.id.iv_sex, R.drawable.icon_female);
            } else if ("1".equals(friendsTableOld.standbythree)) {
                oooO0o.OooO0oO(R.id.iv_sex, true);
                oooO0o.OooO0oo(R.id.iv_sex, R.drawable.icon_male);
            } else {
                oooO0o.OooO0oO(R.id.iv_sex, false);
            }
            oooO0o.OooOO0o(R.id.iv_room, false);
            if (FriendsListFragment.this.liveFrindsList.size() > 0) {
                Iterator it = FriendsListFragment.this.liveFrindsList.iterator();
                while (it.hasNext()) {
                    if (((FriendsModel) it.next()).getUserid().equals(friendsTableOld.userid)) {
                        oooO0o.OooOO0o(R.id.iv_room, true);
                        break;
                    }
                }
            }
            oooO0o.OooOOOO(R.id.iv_room, new View.OnClickListener() { // from class: o00OOooO.o00Ooo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FriendsListFragment.OooO oooO = this.f31966Oooo0o;
                    FriendsTableOld friendsTableOld2 = friendsTableOld;
                    Objects.requireNonNull(oooO);
                    o0O00000.OooO0OO("Message_fiends_room");
                    FriendsListFragment.this.enterRoom(friendsTableOld2.userid);
                }
            });
            oooO0o.OooO0oO(R.id.iv_official, friendsTableOld.role == 2);
        }
    }

    public class OooO00o extends o00OO0O0.OooO0O0 {
        public OooO00o(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            UserInBarModel.DataBean dataBean;
            UserInBarModel userInBarModel = (UserInBarModel) o0Oo0oo.OooO0O0(str, UserInBarModel.class);
            if (userInBarModel == null || !"1000".equals(userInBarModel.f11899code) || (dataBean = userInBarModel.data) == null) {
                return;
            }
            if (!userInBarModel.isinbar) {
                ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.notinroom));
                FriendsListFragment.this.initData();
                return;
            }
            String str2 = dataBean.roomserverip;
            RoomModel roomModel = new RoomModel();
            roomModel.setRoomIp(str2);
            roomModel.setId(o0O0O00.OooOOO0(userInBarModel.data.barid));
            roomModel.setName(userInBarModel.data.barname);
            roomModel.setLevel(userInBarModel.data.barlevel);
            if (roomModel.getKinds() == 0 || roomModel.getKinds() == 1) {
                RoomStateManager.INSTANCE.enterRoom(roomModel, EnterRoomParentPage.Message_Friends_InRoom);
            }
        }
    }

    public class OooO0O0 extends o00OO0O0.OooO0O0 {
        public OooO0O0(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            FriendsListFragment friendsListFragment = FriendsListFragment.this;
            friendsListFragment.updateFriendsTotal(friendsListFragment.friendsList == null ? 0 : FriendsListFragment.this.friendsList.size());
            FriendsListFragment.this.baseAdapter.setNewData(FriendsListFragment.this.friendsList);
            FriendsListFragment.this.baseAdapter.setLoadComplete(false);
            FriendsListFragment.this.loading = false;
            if (FriendsListFragment.this.xRefreshLayout != null) {
                FriendsListFragment.this.xRefreshLayout.Oooo0o0(true, false, true);
            }
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            if (com.yalla.support.common.util.OooO0OO.OooO00o(FriendsListFragment.this.friendsList)) {
                FriendsListFragment.this.baseAdapter.setLoadComplete(true);
                return;
            }
            if (FriendsListFragment.this.liveFrindsList != null && FriendsListFragment.this.liveFrindsList.size() > 0) {
                FriendsListFragment.this.liveFrindsList.clear();
            }
            FriendsModelBean friendsModelBean = (FriendsModelBean) o0Oo0oo.OooO0O0(str, FriendsModelBean.class);
            if (friendsModelBean == null || !com.yalla.support.common.util.OooO0OO.OooO0O0(friendsModelBean.data)) {
                FriendsListFragment friendsListFragment = FriendsListFragment.this;
                friendsListFragment.updateFriendsTotal(friendsListFragment.friendsList.size());
                FriendsListFragment.this.baseAdapter.setNewData(FriendsListFragment.this.friendsList);
            } else {
                FriendsListFragment.this.liveFrindsList.addAll((Collection) friendsModelBean.data);
                if (FriendsListFragment.this.liveFrindsListTemp.size() > 0) {
                    FriendsListFragment.this.liveFrindsListTemp.clear();
                }
                ArrayList arrayList = new ArrayList();
                if (FriendsListFragment.this.friendsList == null || FriendsListFragment.this.friendsList.size() <= 0) {
                    FriendsListFragment friendsListFragment2 = FriendsListFragment.this;
                    friendsListFragment2.updateFriendsTotal(friendsListFragment2.friendsList.size());
                    FriendsListFragment.this.baseAdapter.setNewData(FriendsListFragment.this.friendsList);
                } else {
                    Iterator it = FriendsListFragment.this.friendsList.iterator();
                    loop0: while (true) {
                        boolean z = false;
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            FriendsTableOld friendsTableOld = (FriendsTableOld) it.next();
                            Iterator it2 = FriendsListFragment.this.liveFrindsList.iterator();
                            while (it2.hasNext()) {
                                if (friendsTableOld.userid.equals(((FriendsModel) it2.next()).getUserid())) {
                                    FriendsListFragment.this.liveFrindsListTemp.add(friendsTableOld);
                                    z = true;
                                    break;
                                }
                            }
                            if (!z) {
                                arrayList.add(friendsTableOld);
                            }
                        }
                    }
                    FriendsListFragment.this.liveFrindsListTemp.addAll(arrayList);
                    FriendsListFragment friendsListFragment3 = FriendsListFragment.this;
                    friendsListFragment3.updateFriendsTotal(friendsListFragment3.liveFrindsListTemp.size());
                    FriendsListFragment.this.baseAdapter.setNewData(FriendsListFragment.this.liveFrindsListTemp);
                }
            }
            FriendsListFragment.this.baseAdapter.setLoadComplete();
            FriendsListFragment.this.loading = false;
            FriendsListFragment.this.xRefreshLayout.Oooo0o0(true, true, true);
            if (friendsModelBean == null || !friendsModelBean.getIsreset()) {
                return;
            }
            p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO0OO(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()));
            ApiUserFriendsUtils.getInstance().getUserFriends(1, 0L);
        }
    }

    public class OooO0OO implements Observer<Object> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            FriendsListFragment.this.baseAdapter.notifyDataSetChanged();
        }
    }

    public class OooO0o implements XRefreshLayout.OooO0OO {
        public OooO0o() {
        }

        @Override // com.app.base.view.pullrefresh.XRefreshLayout.OooO0OO
        public final void OooO0OO() {
            o00000O.OooO00o(FriendsListFragment.this.mSearchView.getEditSearch(), FriendsListFragment.this.getActivity());
            FriendsListFragment.this.mSearchView.getEditSearch().clearFocus();
        }
    }

    public class OooOO0 implements BaseQuickAdapter.OooOOOO {

        public class OooO00o implements o00O00o0 {
            public OooO00o() {
            }

            @Override // p620o0oo0o0O.o00O00o0
            public final void onActivityResult(int i, Intent intent) {
                FriendsTableOld friendsTableOldOooO0oO;
                int i2 = -1;
                if (i != -1 || intent == null) {
                    return;
                }
                try {
                    String stringExtra = intent.getStringExtra("userid");
                    if (TextUtils.isEmpty(stringExtra) || (friendsTableOldOooO0oO = p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO0oO(stringExtra, String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()))) == null) {
                        return;
                    }
                    for (int i3 = 0; i3 < FriendsListFragment.this.baseAdapter.getData().size(); i3++) {
                        FriendsTableOld friendsTableOld = (FriendsTableOld) FriendsListFragment.this.baseAdapter.getData().get(i3);
                        if (friendsTableOld != null && friendsTableOld.userid.equals(stringExtra)) {
                            friendsTableOldOooO0oO.standbyfour = friendsTableOld.standbyfour;
                            FriendsListFragment.this.baseAdapter.getData().set(i3, friendsTableOldOooO0oO);
                            i2 = i3;
                        }
                    }
                    FriendsListFragment.this.baseAdapter.notifyItemChanged(i2 + FriendsListFragment.this.baseAdapter.getHeaderLayoutCount());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public OooOO0() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            o0O00000.OooO0OO("Message_friends_details");
            UserInfoActivity.f23452o0ooOO0.OooO0O0(FriendsListFragment.this.getActivity(), ((FriendsTableOld) FriendsListFragment.this.baseAdapter.getData().get(i)).userid, false, new OooO00o());
        }
    }

    public class OooOO0O implements BaseQuickAdapter.OooOo00 {
        public OooOO0O() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo00
        public final boolean OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
            FriendsListFragment friendsListFragment = FriendsListFragment.this;
            friendsListFragment.showRemarkDialog((FriendsTableOld) friendsListFragment.baseAdapter.getData().get(i));
            return false;
        }
    }

    public class OooOOO implements Function1<String, Unit> {
        public OooOOO() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            if (!str2.isEmpty()) {
                FriendsListFragment.this.mSearchView.setClearVisibility(0);
                FriendsListFragment.this.xRefreshLayout.f19541o00O0O = false;
                FriendsListFragment.this.baseAdapter.setHeaderAndEmpty(true);
                FriendsListFragment.this.searchMyFriend(str2);
                return null;
            }
            FriendsListFragment.this.mSearchView.setClearVisibility(8);
            FriendsListFragment.this.xRefreshLayout.f19541o00O0O = true;
            FriendsListFragment.this.baseAdapter.setHeaderAndEmpty(false);
            FriendsListFragment.this.baseAdapter.notifyDataSetChanged();
            FriendsListFragment.this.baseAdapter.hindEmptyView(false);
            FriendsListFragment.this.initData();
            return null;
        }
    }

    public class OooOOO0 implements Function1<Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                return null;
            }
            o0O00000.OooO0OO("Message_search");
            return null;
        }
    }

    public class OooOOOO implements Function2<Integer, String, Unit> {
        public OooOOOO() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, String str) {
            String str2 = str;
            if (num.intValue() != 3) {
                return null;
            }
            FriendsListFragment.this.searchMyFriend(str2);
            o00000O.OooO00o(FriendsListFragment.this.mSearchView.getEditSearch(), FriendsListFragment.this.getActivity());
            return null;
        }
    }

    public class OooOo00 implements View.OnClickListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FriendsTableOld f11542Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ p502o0o00o0.o00000O f11543Oooo0oO;

        public OooOo00(FriendsTableOld friendsTableOld, p502o0o00o0.o00000O o00000o) {
            this.f11542Oooo0o = friendsTableOld;
            this.f11543Oooo0oO = o00000o;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            UserInfoModel userInfoModel = new UserInfoModel();
            userInfoModel.setUserId(com.yalla.support.common.util.OooO.OooO0o(this.f11542Oooo0o.userid));
            userInfoModel.setMemoName(this.f11542Oooo0o.memoName);
            userInfoModel.setUserName(this.f11542Oooo0o.username);
            UserInfoEditRemarkActivity.f23529OooooOO.OooO00o(FriendsListFragment.this.getContext(), userInfoModel);
            this.f11543Oooo0oO.OooO0O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enterRoom(String str) {
        o000000O.OooO0OO(str, new OooO00o(getActivity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void freshLoad() {
        if (this.loading) {
            return;
        }
        this.loading = true;
        List<FriendsTableOld> listOooO0O0 = p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO0O0(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()));
        this.friendsListFromInterface = listOooO0O0;
        if (listOooO0O0 == null || listOooO0O0.size() <= 0) {
            ApiUserFriendsUtils.getInstance().getUserFriends(1, 0L);
        } else {
            ApiUserFriendsUtils.getInstance().getUserFriends(1, this.friendsListFromInterface.get(0).ctime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initData() {
        List<FriendsTableOld> listOooO00o = p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO00o(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()));
        this.friendsList = listOooO00o;
        if (!com.yalla.support.common.util.OooO0OO.OooO0O0(listOooO00o)) {
            updateFriendsTotal(this.friendsList.size());
            this.baseAdapter.setNewData(this.friendsList);
            this.baseAdapter.setLoadComplete();
            this.xRefreshLayout.Oooo0o0(true, false, true);
            this.loading = false;
            return;
        }
        updateFriendsTotal(this.friendsList.size());
        this.baseAdapter.setNewData(this.friendsList);
        this.baseAdapter.setLoadComplete();
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo000o oo000oVar = o00000OO.f32208OooO0O0;
        OooO0O0 oooO0O0 = new OooO0O0(App.f11458Oooo0oO);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32274Oooooo, mapOooO0O0, oooO0O0);
    }

    private void initObserver() {
        LiveEventBus.get("FRIENDS_DELETE", Long.TYPE).observe(this, new p142o00OOooO.o00O0O(this, 0));
    }

    private void initView() {
        XRefreshLayout xRefreshLayout = (XRefreshLayout) this.rootView.findViewById(R.id.friends_list_xrefresh);
        this.xRefreshLayout = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new o00Oo0(this, 0));
        this.xRefreshLayout.OooOoOO(false);
        this.recFriends = (RecyclerView) this.rootView.findViewById(R.id.rec_friends);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(getActivity());
        fixLinearLayoutManager.setItemPrefetchEnabled(false);
        this.recFriends.setLayoutManager(fixLinearLayoutManager);
        this.xRefreshLayout.setOnTouchDownListener(new OooO0o());
        OooO oooO = new OooO(getActivity());
        this.baseAdapter = oooO;
        oooO.setOnItemClickListener(new OooOO0());
        this.baseAdapter.setOnItemLongClickListener(new OooOO0O());
        this.baseAdapter.setHeaderAndEmpty(false);
        this.baseAdapter.setEmptyText(R.string.nulldata_friend);
        this.baseAdapter.setEmptyImageRes(R.drawable.ic_empty_friends);
        SearchView searchView = new SearchView(getActivity());
        this.mSearchView = searchView;
        searchView.setEditFocusListener(new OooOOO0());
        this.mSearchView.setSearchTextChangedListener(new OooOOO());
        this.mSearchView.setSearchClickListener(new OooOOOO());
        Pair<Boolean, Integer> value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue();
        if (value.getFirst().booleanValue()) {
            int iIntValue = value.getSecond().intValue();
            if (iIntValue > 4) {
                iIntValue = 4;
            }
            if (iIntValue == 1) {
                this.friendsMax = BannerConfig.LOOP_TIME;
            } else if (iIntValue == 2) {
                this.friendsMax = 3500;
            } else if (iIntValue == 3) {
                this.friendsMax = 4000;
            } else if (iIntValue == 4) {
                this.friendsMax = 4500;
            }
        }
        this.baseAdapter.setHeaderView(this.mSearchView);
        this.recFriends.setAdapter(this.baseAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initObserver$0(Long l) {
        if (this.mSearchView.getEditSearch().getText().toString().trim().length() == 0) {
            initData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void searchMyFriend(String str) {
        this.baseAdapter.setNewData(p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO0Oo(OooO0o.OooO0OO.OooO00o("%", str, "%"), String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue())));
        this.baseAdapter.setLoadComplete(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRemarkDialog(FriendsTableOld friendsTableOld) {
        p502o0o00o0.o00000O o00000o = new p502o0o00o0.o00000O(requireActivity(), 0);
        View.inflate(getContext(), R.layout.item_dialog_friend_remark, o00000o.f41545Oooo0oo).findViewById(R.id.tvItem).setOnClickListener(new OooOo00(friendsTableOld, o00000o));
        o00000o.OooOO0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFriendsTotal(int i) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.rootView = layoutInflater.inflate(R.layout.fragment_friends_list, viewGroup, false);
        initView();
        List<FriendsTableOld> listOooO0O0 = p491o0o00O00.OooO0OO.OooO00o().OooOo0O().OooO0O0(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()));
        this.friendsListFromInterface = listOooO0O0;
        if (listOooO0O0.size() > 0) {
            ApiUserFriendsUtils.getInstance().getUserFriends(1, this.friendsListFromInterface.get(0).ctime);
        } else {
            ApiUserFriendsUtils.getInstance().getUserFriends(1, 0L);
        }
        LiveEventBus.get("Friend_Remark").observe(this, new OooO0OO());
        return this.rootView;
    }

    @Override // o00OOO0.OooO00o, o00OOO0.OooO0OO, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.friendsList = null;
    }

    @Override // o00OOO0.OooO00o, p140o00OOOoO.OooO0o
    public void onEventMainThread(p140o00OOOoO.OooO0OO oooO0OO) {
        super.onEventMainThread(oooO0OO);
        int i = oooO0OO.f31885OooO00o;
        if ((i == 3 || i == 35 || i == 550) && this.mSearchView.getEditSearch().getText().toString().trim().length() == 0) {
            initData();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MobclickAgent.onPageStart("MessageFragment");
        MobclickAgent.onPageEnd(getClass().getName());
        SearchView searchView = this.mSearchView;
        if (searchView == null || searchView.getEditSearch() == null) {
            return;
        }
        EditText editSearch = this.mSearchView.getEditSearch();
        Oooo000.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editSearch.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editSearch, "view.context"), new Handler()));
    }

    @Override // o00OOO0.OooO0OO, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MobclickAgent.onPageEnd("MessageFragment");
        MobclickAgent.onPageStart(getClass().getName());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        initObserver();
    }

    public void scrollToTop() {
        RecyclerView recyclerView = this.recFriends;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(0);
        }
    }
}
