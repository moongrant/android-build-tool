package com.app.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.model.ContributionModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.app.base.view.recyclerview.FixedRecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.user.TopDataVM;
import com.yalla.yalla.util.netimage.NetImageView;
import java.text.SimpleDateFormat;
import java.util.Map;
import kotlin.Pair;
import p142o00OOooO.OooOOOO;
import p152o00Oo0o0.o00Oo00;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p175o00OooOo.o0OO0;
import p254o00ooO0O.o000O0O0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.q7;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public class ContributionFragment extends o00OOO0.OooO00o {
    public static final String ARG_1 = "roomId";
    public static final String ARG_2 = "type";
    private p188o00o00o0.OooO0OO<ContributionModel.DataBean> adapter;
    private FixedRecyclerView lvContribution;
    private q7 mHeaderBinding;
    private String roomId;
    private UserTagView selfUserTagView;
    private TextView tv_coin;
    private String type;
    private XRefreshLayout xRefreshLayout;
    private int[] indexPic = {R.drawable.ic_contribution_2, R.drawable.ic_contribution_3, R.drawable.ic_contribution_4, R.drawable.ic_contribution_5, R.drawable.ic_contribution_6, R.drawable.ic_contribution_7, R.drawable.ic_contribution_8, R.drawable.ic_contribution_9, R.drawable.ic_contribution_10};
    private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");

    public class OooO00o extends p188o00o00o0.OooO0OO<ContributionModel.DataBean> {
        public OooO00o(Context context) {
            super(context, R.layout.item_contribution);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            ContributionModel.DataBean dataBean = (ContributionModel.DataBean) obj;
            oooO0o.OooO0oo(R.id.iv_index, ContributionFragment.this.indexPic[oooO0o.getLayoutPosition() - ContributionFragment.this.adapter.getHeaderLayoutCount()]);
            UserTagView userTagView = (UserTagView) oooO0o.OooO0Oo(R.id.contributionUserTagView);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(dataBean.getUserHeader(), OooOo00.OooO00o(40), true);
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.sdv_header));
            userTagView.OooO0oO(dataBean.isPremium(), dataBean.getPremiumLevel());
            userTagView.setKaVip(dataBean.getVipLevel());
            userTagView.setName(dataBean.getUserName());
            userTagView.setNameFlash(dataBean.getVipLevel() >= VipLevel.Vip4.getValue());
            userTagView.setSex(dataBean.getSex());
            userTagView.OooO(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 9.0f);
            oooO0o.OooOO0(R.id.tv_coin, o0O0O00.OooO0oO(dataBean.number, false));
        }
    }

    public class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            ContributionFragment.this.adapter.setFirstLoading(true);
            ContributionFragment.this.lambda$initView$1();
        }
    }

    public class OooO0OO extends o00OO0O0.OooO0O0 {
        public OooO0OO(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            ContributionFragment.this.adapter.loadError();
            ContributionFragment.this.xRefreshLayout.Oooo0O0(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            super.onFinish(str);
            ContributionModel contributionModel = (ContributionModel) o0Oo0oo.OooO0O0(str, ContributionModel.class);
            if (contributionModel != null && TopDataVM.TYPE_WEEKLY.equals(ContributionFragment.this.type)) {
                o00OO00O.f43313OooooOo.OooO00o().f43331OooOOo.postValue(Long.valueOf(contributionModel.sumamount));
                o00O.OooO00o.f43196OooO00o.OooO00o(contributionModel.sumamount);
            }
            if (contributionModel == null || com.yalla.support.common.util.OooO0OO.OooO00o(contributionModel.data)) {
                ContributionFragment.this.xRefreshLayout.setLoadComplete(true);
                ContributionFragment.this.adapter.setLoadComplete();
                ContributionFragment.this.tv_coin.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                ContributionFragment.this.selfUserTagView.OooO(Integer.valueOf(o00O.f43140OooO00o.OooO0o0()), (String) o00O.f43149OooOO0O.getValue(), ((Boolean) o00O.f43151OooOOO.getValue()).booleanValue(), 9.0f);
                return;
            }
            ContributionFragment.this.setHeader(contributionModel);
            ContributionFragment.this.tv_coin.setText(o0O0O00.OooO0oO(contributionModel.own, false));
            if (!o00OO00O.f43313OooooOo.OooO00o().OooOOo0()) {
                for (int i = 0; i < contributionModel.data.size(); i++) {
                    ContributionModel.DataBean dataBean = contributionModel.data.get(i);
                    if (dataBean.getUserId() == p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue().longValue()) {
                        ContributionFragment.this.selfUserTagView.OooO(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 9.0f);
                        break;
                    } else {
                        if (i == contributionModel.data.size() - 1) {
                            ContributionFragment.this.selfUserTagView.OooO(Integer.valueOf(o00O.f43140OooO00o.OooO0o0()), (String) o00O.f43149OooOO0O.getValue(), ((Boolean) o00O.f43151OooOOO.getValue()).booleanValue(), 9.0f);
                        }
                    }
                }
            }
            contributionModel.data.remove(0);
            ContributionFragment.this.adapter.setNewData(contributionModel.data);
            ContributionFragment.this.adapter.hindEmptyView(com.yalla.support.common.util.OooO0OO.OooO00o(contributionModel.data));
            if (contributionModel.data.size() == 0) {
                ContributionFragment.this.adapter.setEmptyFullScreen(false);
            }
            ContributionFragment.this.adapter.setLoadComplete();
            ContributionFragment.this.xRefreshLayout.setLoadComplete(true);
        }
    }

    public class OooO0o extends o00Oo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ContributionModel.DataBean f11529Oooo;

        public OooO0o(ContributionModel.DataBean dataBean) {
            this.f11529Oooo = dataBean;
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            UserInfoActivity.f23452o0ooOO0.OooO00o(ContributionFragment.this.getActivity(), this.f11529Oooo.getUserId() + "");
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00e9  */
    private void initView(View view) {
        this.xRefreshLayout = (XRefreshLayout) view.findViewById(R.id.xrl);
        FixedRecyclerView fixedRecyclerView = (FixedRecyclerView) view.findViewById(R.id.lv_contribution);
        this.lvContribution = fixedRecyclerView;
        int i = 0;
        fixedRecyclerView.setNestedScrollingEnabled(false);
        NetImageView netImageView = (NetImageView) view.findViewById(R.id.sdv_header);
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o.OooO0OO(1, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_f2c653));
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        oooO00o.f48429OooO0OO = oooOOO.OooO0oo().getValue();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(netImageView);
        UserTagView userTagView = (UserTagView) view.findViewById(R.id.myselfUserTagView);
        this.selfUserTagView = userTagView;
        userTagView.setName(oooOOO.OooOoO().getValue());
        this.selfUserTagView.setPremium(oooOOO.OooOOO0().getValue());
        MutableLiveData<Pair<Integer, Integer>> mutableLiveDataOooO = oooOOO.OooO();
        if (mutableLiveDataOooO.getValue() != null) {
            int iIntValue = mutableLiveDataOooO.getValue().getFirst().intValue();
            VipState vipState = VipState.Vip;
            if (iIntValue == vipState.getValue()) {
                this.selfUserTagView.OooO0OO(mutableLiveDataOooO.getValue().getSecond().intValue(), mutableLiveDataOooO.getValue().getFirst().intValue() == vipState.getValue());
                this.selfUserTagView.setNameFlash(mutableLiveDataOooO.getValue().getSecond().intValue() >= VipLevel.Vip4.getValue());
            } else {
                this.selfUserTagView.setNameFlash(false);
            }
        } else {
            this.selfUserTagView.setNameFlash(false);
        }
        this.selfUserTagView.setSex(oooOOO.OooOOOo().getValue().intValue());
        this.tv_coin = (TextView) view.findViewById(R.id.tv_coin);
        this.type = getArguments().getString("type");
        OooO00o oooO00o2 = new OooO00o(getContext());
        this.adapter = oooO00o2;
        oooO00o2.setOnItemClickListener(new OooOOOO(this, i));
        this.adapter.setLoadErrorClickListener(new OooO0O0());
        this.adapter.setFirstLoading(true);
        if (TopDataVM.TYPE_WEEKLY.equals(this.type)) {
            this.adapter.setEmptyText(R.string.contribution_noda_tips_7d);
        } else {
            this.adapter.setEmptyText(R.string.contribution_noda_tips_24h);
        }
        this.adapter.setEmptyImageRes(R.drawable.ic_empty_contribution);
        this.adapter.setHeaderAndEmpty(true);
        this.xRefreshLayout.setOnRefreshListener(new p142o00OOooO.OooOo00(this, i));
        this.xRefreshLayout.OooOoOO(false);
        this.xRefreshLayout.setNestedScrollingEnabled(false);
        if (this.mHeaderBinding == null) {
            this.mHeaderBinding = q7.inflate(getLayoutInflater());
        }
        this.lvContribution.setLayoutManager(new FixLinearLayoutManager(getContext()));
        this.lvContribution.addItemDecoration(new o0OO0(getContext(), getContext().getResources().getColor(R.color.color_F8F8F8), 72));
        this.lvContribution.setAdapter(this.adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        ContributionModel.DataBean dataBean = (ContributionModel.DataBean) baseQuickAdapter.getData().get(i);
        UserInfoActivity.f23452o0ooOO0.OooO00o(getActivity(), dataBean.getUserId() + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: loadData, reason: merged with bridge method [inline-methods] */
    public void lambda$initView$1() {
        String str = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue() + "";
        String str2 = this.type;
        OooO0OO oooO0OO = new OooO0OO(getContext());
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", str);
        mapOooO0O0.put("type", str2);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32342ooOO, mapOooO0O0, oooO0OO);
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
        this.mHeaderBinding.f50345OooO0OO.setOnClickListener(new OooO0o(dataBean));
        if (TopDataVM.TYPE_WEEKLY.equals(this.type)) {
            o00Oo00.OooO0O0(this.mHeaderBinding.f50349OooO0oO, o000O0O0.OooO0O0(R.drawable.icon_room_contribution_week), "", ViewLocation.start, oo000o.OooO0o0());
        } else {
            o00Oo00.OooO0O0(this.mHeaderBinding.f50349OooO0oO, o000O0O0.OooO0O0(R.drawable.icon_room_contribution_day), "", ViewLocation.start, oo000o.OooO0o0());
        }
        this.mHeaderBinding.f50349OooO0oO.setText(o0O0O00.OooO0oO(contributionModel.sumamount, false));
        this.mHeaderBinding.f50347OooO0o.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.title_room_Contribution_uptime), this.formatter.format(Long.valueOf(contributionModel.upstamp * 1000))));
        this.mHeaderBinding.f50344OooO0O0.OooO0oO(dataBean.isPremium(), dataBean.getPremiumLevel());
        this.mHeaderBinding.f50344OooO0O0.setSex(dataBean.getSex());
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(dataBean.getUserHeader(), OooOo00.OooO00o(50), true);
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.mHeaderBinding.f50346OooO0Oo);
        this.mHeaderBinding.f50344OooO0O0.setKaVip(dataBean.getVipLevel());
        this.mHeaderBinding.f50344OooO0O0.setName(dataBean.getUserName());
        this.mHeaderBinding.f50344OooO0O0.setNameFlash(dataBean.getVipLevel() >= VipLevel.Vip4.getValue());
        this.mHeaderBinding.f50344OooO0O0.setNameTextSize(20.0f);
        this.mHeaderBinding.f50344OooO0O0.OooO(Integer.valueOf(dataBean.getMemberLevel()), dataBean.getBadgeUrl(), dataBean.getIsTopRank(), 12.0f);
        this.mHeaderBinding.f50348OooO0o0.setText(o0O0O00.OooO0oO(dataBean.number, false));
        this.adapter.removeAllHeaderView();
        this.adapter.setHeaderView(this.mHeaderBinding.f50343OooO00o);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_contribution, viewGroup, false);
        this.rootView = viewInflate;
        initView(viewInflate);
        lambda$initView$1();
        return this.rootView;
    }
}
