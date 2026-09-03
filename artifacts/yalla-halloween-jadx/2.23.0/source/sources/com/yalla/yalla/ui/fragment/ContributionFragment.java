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
import p207o00o0oOo.o0O000O;
import p466o0Oooo0o.oo00o;
import p539o0o0OoOO.q1;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.f1;

/* JADX INFO: loaded from: classes4.dex */
public class ContributionFragment extends com.yalla.yalla.base.fragment.OooO00o {
    public static final String ARG_1 = "roomId";
    public static final String ARG_2 = "type";
    private p564o0oOo0OO.o000O<ContributionModel.DataBean> adapter;
    private FixedRecyclerView lvContribution;
    private f1 mHeaderBinding;
    private String roomId;
    private UserTagView selfUserTagView;
    private TextView tv_coin;
    private String type;
    private XRefreshLayout xRefreshLayout;
    private int[] indexPic = {oOo00OO0.ic_contribution_2, oOo00OO0.ic_contribution_3, oOo00OO0.ic_contribution_4, oOo00OO0.ic_contribution_5, oOo00OO0.ic_contribution_6, oOo00OO0.ic_contribution_7, oOo00OO0.ic_contribution_8, oOo00OO0.ic_contribution_9, oOo00OO0.ic_contribution_10};
    private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

    public class OooO00o extends p564o0oOo0OO.o000O<ContributionModel.DataBean> {
        public OooO00o(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            ContributionModel.DataBean dataBean = (ContributionModel.DataBean) obj;
            int i = oO00O0oO.iv_index;
            ContributionFragment contributionFragment = ContributionFragment.this;
            viewHolder.setImageResource(i, contributionFragment.indexPic[viewHolder.getLayoutPosition() - contributionFragment.adapter.OooOOO0()]);
            UserTagView userTagView = (UserTagView) viewHolder.getView(oO00O0oO.contributionUserTagView);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
            oooO00o.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(dataBean.getUserHeader());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.sdv_header));
            userTagView.OooO0oo(dataBean.getPremiumLevel(), dataBean.isPremium());
            userTagView.OooO0Oo(dataBean.getVipLevel(), true, contributionFragment.getActivity());
            userTagView.setName(dataBean.getUserName());
            userTagView.setNameFlash(dataBean.getVipLevel() >= VipLevel.Vip4.getValue());
            userTagView.setSex(dataBean.getSex());
            userTagView.OooOO0(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 9.0f);
            userTagView.OooOO0O(contributionFragment.getViewLifecycleOwner(), Integer.valueOf(dataBean.getWealthLevel()), dataBean.getWealthBadgeWithBg(), 10.0f);
            viewHolder.setText(oO00O0oO.tv_coin, p590o0oo0.OooOOOO.OooO0o(dataBean.number, false));
        }
    }

    public class OooO0O0 extends oo00o {
        public OooO0O0() {
        }

        @Override // p466o0Oooo0o.oo00o
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
            ContributionModel contributionModel = (ContributionModel) p579o0oOoo.oOo00OO0.OooO00o(str, ContributionModel.class);
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
            ContributionFragment contributionFragment = ContributionFragment.this;
            if (contributionModel != null && TopDataVM.TYPE_WEEKLY.equals(contributionFragment.type)) {
                oooO00o.OooO00o().f25011OooOOOO.postValue(Long.valueOf(contributionModel.sumamount));
                com.yalla.yalla.service.room.OooO00o.f24972OooO.f47478OooO00o.setValue(Long.valueOf(contributionModel.sumamount));
            }
            if (contributionModel == null || com.code.android.util.OooOo00.OooO00o(contributionModel.data)) {
                contributionFragment.xRefreshLayout.setLoadComplete(true);
                contributionFragment.adapter.Oooo00o();
                contributionFragment.tv_coin.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                UserTagView userTagView = contributionFragment.selfUserTagView;
                p475o0o000.oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
                userTagView.OooOO0(Integer.valueOf(oo0o0oo.OooO0Oo()), (String) oo0o0oo.f47508OooO0OO.getValue(), ((Boolean) oo0o0oo.f47510OooO0o.getValue()).booleanValue(), 9.0f);
                return;
            }
            contributionFragment.setHeader(contributionModel);
            contributionFragment.tv_coin.setText(p590o0oo0.OooOOOO.OooO0o(contributionModel.own, false));
            if (!oooO00o.OooO00o().OooOOO()) {
                for (int i = 0; i < contributionModel.data.size(); i++) {
                    ContributionModel.DataBean dataBean = contributionModel.data.get(i);
                    long userId = dataBean.getUserId();
                    p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                    if (userId == ((Long) p464o0Oooo.o000000O.OooOOo0().getValue()).longValue()) {
                        contributionFragment.selfUserTagView.OooOO0(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 9.0f);
                        break;
                    }
                    if (i == contributionModel.data.size() - 1) {
                        UserTagView userTagView2 = contributionFragment.selfUserTagView;
                        p475o0o000.oo0o0Oo oo0o0oo2 = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
                        userTagView2.OooOO0(Integer.valueOf(oo0o0oo2.OooO0Oo()), (String) oo0o0oo2.f47508OooO0OO.getValue(), ((Boolean) oo0o0oo2.f47510OooO0o.getValue()).booleanValue(), 9.0f);
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

    public class OooO0o extends oo00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ContributionModel.DataBean f28087OooO0oO;

        public OooO0o(ContributionModel.DataBean dataBean) {
            this.f28087OooO0oO = dataBean;
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            UserInfoActivity.f27240Oooo0o.OooO00o(ContributionFragment.this.getActivity(), this.f28087OooO0oO.getUserId() + "");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    private void initView(View view) {
        this.xRefreshLayout = (XRefreshLayout) view.findViewById(oO00O0oO.xrl);
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) view.findViewById(oO00O0oO.lv_contribution);
        this.lvContribution = fixedRecyclerView;
        fixedRecyclerView.setNestedScrollingEnabled(false);
        NetImageView netImageView = (NetImageView) view.findViewById(oO00O0oO.sdv_header);
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.OooO0O0(1, com.code.android.util.o0000.OooO00o(oO00O0o.color_f2c653));
        p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
        oooO00o.f43911OooO0OO = (String) p464o0Oooo.o000000O.OooO().getValue();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(netImageView);
        this.selfUserTagView = (UserTagView) view.findViewById(oO00O0oO.myselfUserTagView);
        if (p464o0Oooo.o000000O.OooOOoo().getValue() != 0) {
            this.selfUserTagView.setName((String) p464o0Oooo.o000000O.OooOOoo().getValue());
        }
        if (p464o0Oooo.o000000O.OooOO0o().getValue() != 0) {
            this.selfUserTagView.setPremium((Pair) p464o0Oooo.o000000O.OooOO0o().getValue());
        }
        MutableLiveData mutableLiveDataOooOO0 = p464o0Oooo.o000000O.OooOO0();
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
        if (p464o0Oooo.o000000O.OooOOO().getValue() != 0) {
            this.selfUserTagView.setSex(((Integer) p464o0Oooo.o000000O.OooOOO().getValue()).intValue());
        }
        if (Boolean.TRUE.equals(p464o0Oooo.o000000O.OooOo().getValue())) {
            this.selfUserTagView.OooOO0O(getViewLifecycleOwner(), (Integer) p464o0Oooo.o000000O.OooO0oO().getValue(), (String) p464o0Oooo.o000000O.OooO0o0().getValue(), 10.0f);
        }
        this.tv_coin = (TextView) view.findViewById(oO00O0oO.tv_coin);
        if (getArguments() != null) {
            this.type = getArguments().getString("type");
        }
        OooO00o oooO00o2 = new OooO00o(getContext(), oO00OO0O.item_contribution);
        this.adapter = oooO00o2;
        oooO00o2.f10098OooO0o = new o0O000O(this, 2);
        oooO00o2.Oooo0OO(new OooO0O0());
        this.adapter.Oooo00O(true);
        if (TopDataVM.TYPE_WEEKLY.equals(this.type)) {
            this.adapter.Oooo000(oO00OOo0.contribution_noda_tips_7d);
        } else {
            this.adapter.Oooo000(oO00OOo0.contribution_noda_tips_24h);
        }
        this.adapter.OooOooo(oOo00OO0.ic_empty_contribution);
        this.adapter.OooOo0o();
        this.xRefreshLayout.setOnRefreshListener(new OooO0O0.OooO(this));
        this.xRefreshLayout.OooOo00(false);
        this.xRefreshLayout.setNestedScrollingEnabled(false);
        if (this.mHeaderBinding == null) {
            this.mHeaderBinding = f1.inflate(getLayoutInflater());
        }
        this.lvContribution.setLayoutManager(new FixLinearLayoutManager(getContext()));
        this.lvContribution.addItemDecoration(new q1(getContext(), getContext().getResources().getColor(oO00O0o.color_F8F8F8)));
        this.lvContribution.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initView$0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        o0OO000.OooO00o("102282");
        ContributionModel.DataBean dataBean = (ContributionModel.DataBean) baseQuickAdapter.f10111OooOOoo.get(i);
        UserInfoActivity.f27240Oooo0o.OooO00o(getActivity(), dataBean.getUserId() + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData, reason: merged with bridge method [inline-methods] */
    public void lambda$initView$1() {
        String str = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue() + "";
        String str2 = this.type;
        OooO0OO oooO0OO = new OooO0OO(getContext());
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("barid", str);
        linkedHashMapOooO00o.put("type", str2);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44132OoooooO, linkedHashMapOooO00o, oooO0OO);
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
        this.mHeaderBinding.f57892OooO0OO.setOnClickListener(new OooO0o(dataBean));
        if (TopDataVM.TYPE_WEEKLY.equals(this.type)) {
            oO000Oo.OooO0O0(this.mHeaderBinding.f57896OooO0oO, com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_room_contribution_week), "", ViewLocation.start, p591o0oo000O.OooO.OooO0o0());
        } else {
            oO000Oo.OooO0O0(this.mHeaderBinding.f57896OooO0oO, com.code.android.util.o0000.OooO0O0(oOo00OO0.icon_room_contribution_day), "", ViewLocation.start, p591o0oo000O.OooO.OooO0o0());
        }
        this.mHeaderBinding.f57896OooO0oO.setText(p590o0oo0.OooOOOO.OooO0o(contributionModel.sumamount, false));
        this.mHeaderBinding.f57894OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.title_room_Contribution_uptime), this.formatter.format(Long.valueOf(contributionModel.upstamp * 1000))));
        this.mHeaderBinding.f57891OooO0O0.OooO0oo(dataBean.getPremiumLevel(), dataBean.isPremium());
        this.mHeaderBinding.f57891OooO0O0.setSex(dataBean.getSex());
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        oooO00o.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(dataBean.getUserHeader());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(this.mHeaderBinding.f57893OooO0Oo);
        this.mHeaderBinding.f57891OooO0O0.OooOO0O(this, Integer.valueOf(dataBean.getWealthLevel()), dataBean.getWealthBadgeWithBg(), 13.0f);
        this.mHeaderBinding.f57891OooO0O0.OooO0Oo(dataBean.getVipLevel(), true, getActivity());
        this.mHeaderBinding.f57891OooO0O0.setName(dataBean.getUserName());
        this.mHeaderBinding.f57891OooO0O0.setNameFlash(dataBean.getVipLevel() >= VipLevel.Vip4.getValue());
        this.mHeaderBinding.f57891OooO0O0.setNameTextSize(20.0f);
        this.mHeaderBinding.f57891OooO0O0.OooOO0(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 12.0f);
        this.mHeaderBinding.f57891OooO0O0.OooO0O0(24, 2);
        this.mHeaderBinding.f57895OooO0o0.setText(p590o0oo0.OooOOOO.OooO0o(dataBean.number, false));
        this.adapter.OooOOoo();
        this.adapter.OooOo(this.mHeaderBinding.f57890OooO00o);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.fragment_contribution, viewGroup, false);
        this.rootView = viewInflate;
        initView(viewInflate);
        lambda$initView$1();
        return this.rootView;
    }
}
