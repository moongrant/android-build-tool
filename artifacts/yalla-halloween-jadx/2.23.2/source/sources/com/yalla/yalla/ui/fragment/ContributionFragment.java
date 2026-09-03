package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.lifecycle.MutableLiveData;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.ContributionModel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.UserTagView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.FixedRecyclerView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import kotlin.Pair;
import p405o0Oo0OOO.o00Oo00;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p573o0oOoOO.o0O0o0;
import p587o0oOooOO.n0;
import p590o0oOooo0.oOOO00;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public class ContributionFragment extends com.yalla.yalla.base.fragment.OooO00o {
    public static final String ARG_1 = "roomId";
    public static final String ARG_2 = "type";
    private p571o0oOoO0.o0000oo<ContributionModel.DataBean> adapter;
    private FixedRecyclerView lvContribution;
    private o00Oo00 mHeaderBinding;
    private String roomId;
    private UserTagView selfUserTagView;
    private TextView tv_coin;
    private String type;
    private XRefreshLayout xRefreshLayout;
    private int[] indexPic = {p562o0oOo000.o0Oo0oo.ic_contribution_2, p562o0oOo000.o0Oo0oo.ic_contribution_3, p562o0oOo000.o0Oo0oo.ic_contribution_4, p562o0oOo000.o0Oo0oo.ic_contribution_5, p562o0oOo000.o0Oo0oo.ic_contribution_6, p562o0oOo000.o0Oo0oo.ic_contribution_7, p562o0oOo000.o0Oo0oo.ic_contribution_8, p562o0oOo000.o0Oo0oo.ic_contribution_9, p562o0oOo000.o0Oo0oo.ic_contribution_10};
    private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

    public class OooO00o extends p571o0oOoO0.o0000oo<ContributionModel.DataBean> {
        public OooO00o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            ContributionModel.DataBean dataBean = (ContributionModel.DataBean) obj;
            int i = p562o0oOo000.o0OO00O.iv_index;
            ContributionFragment contributionFragment = ContributionFragment.this;
            viewHolder.setImageResource(i, contributionFragment.indexPic[viewHolder.getLayoutPosition() - contributionFragment.adapter.OooOOO0()]);
            UserTagView userTagView = (UserTagView) viewHolder.getView(p562o0oOo000.o0OO00O.contributionUserTagView);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f13186OooOOOo);
            oooO00o.OooO00o(d1.OooO00o());
            oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(dataBean.getUserHeader());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.sdv_header));
            userTagView.OooO0oo(dataBean.getPremiumLevel(), dataBean.isPremium());
            userTagView.OooO0Oo(dataBean.getVipLevel(), true, contributionFragment.getActivity());
            userTagView.setName(dataBean.getUserName());
            userTagView.setNameFlash(dataBean.getVipLevel() >= VipLevel.Vip4.getValue());
            userTagView.setSex(dataBean.getSex());
            userTagView.OooOO0(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 9.0f);
            userTagView.OooOO0O(contributionFragment.getViewLifecycleOwner(), Integer.valueOf(dataBean.getWealthLevel()), dataBean.getWealthBadgeWithBg(), 10.0f);
            viewHolder.setText(p562o0oOo000.o0OO00O.tv_coin, o0O0O0Oo.OooO0o(dataBean.number, false));
        }
    }

    public class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            ContributionFragment contributionFragment = ContributionFragment.this;
            contributionFragment.adapter.Oooo00O(true);
            contributionFragment.lambda$initView$1();
        }
    }

    public class OooO0OO extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {
        public OooO0OO(Context context) {
            super(context);
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
            ContributionFragment contributionFragment = ContributionFragment.this;
            contributionFragment.adapter.OooOoo();
            contributionFragment.xRefreshLayout.OooOoo(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            ContributionModel contributionModel = (ContributionModel) oOOO00.OooO00o(str, ContributionModel.class);
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            ContributionFragment contributionFragment = ContributionFragment.this;
            if (contributionModel != null && TopDataVM.TYPE_WEEKLY.equals(contributionFragment.type)) {
                oooO00o.OooO00o().f24549OooOOOO.postValue(Long.valueOf(contributionModel.sumamount));
                com.yalla.yalla.service.room.OooO00o.f24510OooO.f48637OooO00o.setValue(Long.valueOf(contributionModel.sumamount));
            }
            if (contributionModel == null || com.code.android.util.OooOo00.OooO00o(contributionModel.data)) {
                contributionFragment.xRefreshLayout.setLoadComplete(true);
                contributionFragment.adapter.Oooo00o();
                contributionFragment.tv_coin.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                UserTagView userTagView = contributionFragment.selfUserTagView;
                p483o0o000Oo.o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
                userTagView.OooOO0(Integer.valueOf(o0000ooo.OooO0Oo()), (String) o0000ooo.f48521OooO0OO.getValue(), ((Boolean) o0000ooo.f48523OooO0o.getValue()).booleanValue(), 9.0f);
                return;
            }
            contributionFragment.setHeader(contributionModel);
            contributionFragment.tv_coin.setText(o0O0O0Oo.OooO0o(contributionModel.own, false));
            if (!oooO00o.OooO00o().OooOOO()) {
                for (int i = 0; i < contributionModel.data.size(); i++) {
                    ContributionModel.DataBean dataBean = contributionModel.data.get(i);
                    long userId = dataBean.getUserId();
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (userId == ((Long) o0O00oO0.OooOOo0().getValue()).longValue()) {
                        contributionFragment.selfUserTagView.OooOO0(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 9.0f);
                        break;
                    }
                    if (i == contributionModel.data.size() - 1) {
                        UserTagView userTagView2 = contributionFragment.selfUserTagView;
                        p483o0o000Oo.o0000Ooo o0000ooo2 = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
                        userTagView2.OooOO0(Integer.valueOf(o0000ooo2.OooO0Oo()), (String) o0000ooo2.f48521OooO0OO.getValue(), ((Boolean) o0000ooo2.f48523OooO0o.getValue()).booleanValue(), 9.0f);
                    }
                }
            }
            contributionModel.data.remove(0);
            contributionFragment.adapter.OooOoO0(contributionModel.data);
            contributionFragment.adapter.OooOoOO(com.code.android.util.OooOo00.OooO00o(contributionModel.data));
            if (contributionModel.data.size() == 0) {
                contributionFragment.adapter.OooOooO(false);
            }
            contributionFragment.adapter.Oooo00o();
            contributionFragment.xRefreshLayout.setLoadComplete(true);
        }
    }

    public class OooO0o extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ContributionModel.DataBean f27606OooO0oO;

        public OooO0o(ContributionModel.DataBean dataBean) {
            this.f27606OooO0oO = dataBean;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(View view) {
            UserInfoActivity.f26775Oooo0o.OooO00o(ContributionFragment.this.getActivity(), this.f27606OooO0oO.getUserId() + "");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    private void initView(View view) {
        this.xRefreshLayout = (XRefreshLayout) view.findViewById(p562o0oOo000.o0OO00O.xrl);
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) view.findViewById(p562o0oOo000.o0OO00O.lv_contribution);
        this.lvContribution = fixedRecyclerView;
        fixedRecyclerView.setNestedScrollingEnabled(false);
        NetImageView netImageView = (NetImageView) view.findViewById(p562o0oOo000.o0OO00O.sdv_header);
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(getContext());
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.OooO0O0(1, com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_f2c653));
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        oooO00o.f43126OooO0OO = (String) o0O00oO0.OooO().getValue();
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        this.selfUserTagView = (UserTagView) view.findViewById(p562o0oOo000.o0OO00O.myselfUserTagView);
        if (o0O00oO0.OooOOoo().getValue() != 0) {
            this.selfUserTagView.setName((String) o0O00oO0.OooOOoo().getValue());
        }
        if (o0O00oO0.OooOO0o().getValue() != 0) {
            this.selfUserTagView.setPremium((Pair) o0O00oO0.OooOO0o().getValue());
        }
        MutableLiveData mutableLiveDataOooOO0 = o0O00oO0.OooOO0();
        if (mutableLiveDataOooOO0.getValue() != 0) {
            int iIntValue = ((Integer) ((Pair) mutableLiveDataOooOO0.getValue()).getFirst()).intValue();
            VipState vipState = VipState.Vip;
            if (iIntValue == vipState.getValue()) {
                this.selfUserTagView.OooO0Oo(((Integer) ((Pair) mutableLiveDataOooOO0.getValue()).getSecond()).intValue(), ((Integer) ((Pair) mutableLiveDataOooOO0.getValue()).getFirst()).intValue() == vipState.getValue(), getActivity());
                this.selfUserTagView.setNameFlash(((Integer) ((Pair) mutableLiveDataOooOO0.getValue()).getSecond()).intValue() >= VipLevel.Vip4.getValue());
            } else {
                this.selfUserTagView.setNameFlash(false);
            }
        } else {
            this.selfUserTagView.setNameFlash(false);
        }
        if (o0O00oO0.OooOOO().getValue() != 0) {
            this.selfUserTagView.setSex(((Integer) o0O00oO0.OooOOO().getValue()).intValue());
        }
        if (Boolean.TRUE.equals(o0O00oO0.OooOo().getValue())) {
            this.selfUserTagView.OooOO0O(getViewLifecycleOwner(), (Integer) o0O00oO0.OooO0oO().getValue(), (String) o0O00oO0.OooO0o0().getValue(), 10.0f);
        }
        this.tv_coin = (TextView) view.findViewById(p562o0oOo000.o0OO00O.tv_coin);
        if (getArguments() != null) {
            this.type = getArguments().getString("type");
        }
        OooO00o oooO00o2 = new OooO00o(getContext(), p562o0oOo000.oo0o0Oo.item_contribution);
        this.adapter = oooO00o2;
        oooO00o2.f13176OooO0o = new OooOOOO(this);
        oooO00o2.Oooo0OO(new OooO0O0());
        this.adapter.Oooo00O(true);
        if (TopDataVM.TYPE_WEEKLY.equals(this.type)) {
            this.adapter.Oooo000(p562o0oOo000.o000000.contribution_noda_tips_7d);
        } else {
            this.adapter.Oooo000(p562o0oOo000.o000000.contribution_noda_tips_24h);
        }
        this.adapter.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_contribution);
        this.adapter.OooOo0o();
        this.xRefreshLayout.setOnRefreshListener(new p559o0oOo.o00O0O() { // from class: com.yalla.yalla.ui.fragment.OooOo00
            @Override // p559o0oOo.o00O0O
            public final void OooO0OO() {
                this.f27751OooO0Oo.lambda$initView$1();
            }
        });
        this.xRefreshLayout.OooOo00(false);
        this.xRefreshLayout.setNestedScrollingEnabled(false);
        if (this.mHeaderBinding == null) {
            this.mHeaderBinding = o00Oo00.inflate(getLayoutInflater());
        }
        this.lvContribution.setLayoutManager(new FixLinearLayoutManager(getContext()));
        this.lvContribution.addItemDecoration(new n0(getContext(), getContext().getResources().getColor(p562o0oOo000.o0OOO0o.color_F8F8F8)));
        this.lvContribution.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initView$0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o0oo0000.OooO00o.OooO0O0("102282");
        ContributionModel.DataBean dataBean = (ContributionModel.DataBean) baseQuickAdapter.f13189OooOOoo.get(i);
        UserInfoActivity.f26775Oooo0o.OooO00o(getActivity(), dataBean.getUserId() + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData, reason: merged with bridge method [inline-methods] */
    public void lambda$initView$1() {
        String str = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue() + "";
        String str2 = this.type;
        OooO0OO oooO0OO = new OooO0OO(getContext());
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("barid", str);
        linkedHashMapOooO00o.put("type", str2);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43391OoooooO, linkedHashMapOooO00o, oooO0OO);
    }

    public static ContributionFragment newInstantce(String str) {
        ContributionFragment contributionFragment = new ContributionFragment();
        Bundle bundle = new Bundle();
        bundle.putString("type", str);
        contributionFragment.setArguments(bundle);
        return contributionFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeader(ContributionModel contributionModel) {
        if (contributionModel.data.size() <= 0) {
            return;
        }
        ContributionModel.DataBean dataBean = contributionModel.data.get(0);
        this.mHeaderBinding.f44368OooO0OO.setOnClickListener(new OooO0o(dataBean));
        if (TopDataVM.TYPE_WEEKLY.equals(this.type)) {
            o0O0o0.OooO0O0(this.mHeaderBinding.f44372OooO0oO, com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_room_contribution_week), "", ViewLocation.start, p595o0oo00O.OooOo00.OooO0o0());
        } else {
            o0O0o0.OooO0O0(this.mHeaderBinding.f44372OooO0oO, com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.icon_room_contribution_day), "", ViewLocation.start, p595o0oo00O.OooOo00.OooO0o0());
        }
        this.mHeaderBinding.f44372OooO0oO.setText(o0O0O0Oo.OooO0o(contributionModel.sumamount, false));
        this.mHeaderBinding.f44370OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.title_room_Contribution_uptime), this.formatter.format(Long.valueOf(contributionModel.upstamp * 1000))));
        this.mHeaderBinding.f44367OooO0O0.OooO0oo(dataBean.getPremiumLevel(), dataBean.isPremium());
        this.mHeaderBinding.f44367OooO0O0.setSex(dataBean.getSex());
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(getContext());
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(dataBean.getUserHeader());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(this.mHeaderBinding.f44369OooO0Oo);
        this.mHeaderBinding.f44367OooO0O0.OooOO0O(this, Integer.valueOf(dataBean.getWealthLevel()), dataBean.getWealthBadgeWithBg(), 13.0f);
        this.mHeaderBinding.f44367OooO0O0.OooO0Oo(dataBean.getVipLevel(), true, getActivity());
        this.mHeaderBinding.f44367OooO0O0.setName(dataBean.getUserName());
        this.mHeaderBinding.f44367OooO0O0.setNameFlash(dataBean.getVipLevel() >= VipLevel.Vip4.getValue());
        this.mHeaderBinding.f44367OooO0O0.setNameTextSize(20.0f);
        this.mHeaderBinding.f44367OooO0O0.OooOO0(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 12.0f);
        this.mHeaderBinding.f44367OooO0O0.OooO0O0(24, 2);
        this.mHeaderBinding.f44371OooO0o0.setText(o0O0O0Oo.OooO0o(dataBean.number, false));
        this.adapter.OooOOoo();
        this.adapter.OooOo(this.mHeaderBinding.f44366OooO00o);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(p562o0oOo000.oo0o0Oo.fragment_contribution, viewGroup, false);
        this.rootView = viewInflate;
        initView(viewInflate);
        lambda$initView$1();
        return this.rootView;
    }
}
