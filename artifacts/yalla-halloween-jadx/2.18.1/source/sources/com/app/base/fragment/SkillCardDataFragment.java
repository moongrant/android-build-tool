package com.app.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.model.SkillCardListModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p168o00Ooo0.o0O0O00;
import p186o00o00Oo.o0ooOOo;
import p522o0o0O0o.oo0oOO0;
import p616o0oo0Ooo.oO0O00;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public class SkillCardDataFragment extends o00OOO0.OooO00o {
    public static final int WEAR_TYPE_CRAZY = 2;
    public static final int WEAR_TYPE_HAT = 1;
    public static final String WEAR_TYPE_KEY = "weartype";
    public static final int WEAR_TYPE_VOICE = 3;
    private p188o00o00o0.OooO0OO<SkillCardListModel.DataBean> adapter;
    private List<SkillCardListModel.DataBean> adapterData;
    private Context mContext;
    private int wareType;
    private XRefreshLayout xrlTop;

    public class OooO00o implements o0ooOOo {
        public OooO00o() {
        }

        @Override // p186o00o00Oo.o0ooOOo
        public final void OooO0oO() {
            ((PurchaseSkillCardActivity) SkillCardDataFragment.this.getActivity()).OooOoO();
        }
    }

    public class OooO0O0 extends p188o00o00o0.OooO0OO<SkillCardListModel.DataBean> {
        public OooO0O0(Context context, int i, List list) {
            super(context, i, list);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            SkillCardListModel.DataBean dataBean = (SkillCardListModel.DataBean) obj;
            TextView textView = (TextView) oooO0o.OooO0Oo(R.id.tvLimitTime);
            textView.setVisibility(8);
            if (dataBean.limitDay > 0) {
                textView.setVisibility(0);
                textView.setText(OooOo.OooO00o(SkillCardDataFragment.this.getString(R.string.wear_store_xxx_days), com.yalla.support.common.util.OooO.OooO0oo(Integer.valueOf(dataBean.limitDay), "")));
            }
            oooO0o.OooOO0(R.id.tv_skill_num, dataBean.num);
            int i = SkillCardDataFragment.this.wareType;
            if (i == 1) {
                SVGAView sVGAView = (SVGAView) oooO0o.OooO0Oo(R.id.iv_skillicon);
                sVGAView.OooO0oo(dataBean.picurl, SkillCardDataFragment.this.getViewLifecycleOwner());
                sVGAView.OooO();
                if (dataBean.lowestVIPLv > 0) {
                    oooO0o.OooO0oO(R.id.ivType, true);
                    oooO0o.OooO0oo(R.id.ivType, R.drawable.ic_store_flag_premium);
                } else if (dataBean.activityType == 1) {
                    oooO0o.OooO0oO(R.id.ivType, true);
                    oooO0o.OooO0oo(R.id.ivType, R.drawable.ic_store_flag_activity);
                } else {
                    oooO0o.OooO0oO(R.id.ivType, false);
                }
            } else if (i != 2) {
                NetImageView netImageView = (NetImageView) oooO0o.OooO0Oo(R.id.iv_skillicon);
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
                oooO00o2.f48429OooO0OO = dataBean.picurl;
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO0o(netImageView);
                int iOooO00o = oo0oOO0.OooO00o(75.0f);
                int iOooO00o2 = oo0oOO0.OooO00o(75.0f);
                Intrinsics.checkNotNullParameter(netImageView, "<this>");
                netImageView.getLayoutParams().width = iOooO00o;
                netImageView.getLayoutParams().height = iOooO00o2;
                netImageView.requestLayout();
                if (!dataBean.waresname.isEmpty()) {
                    oooO0o.OooOO0o(R.id.tv_name, true);
                    oooO0o.OooOO0(R.id.tv_name, dataBean.waresname);
                }
            } else {
                if (!dataBean.waresname.isEmpty()) {
                    oooO0o.OooOO0o(R.id.tv_name, true);
                    oooO0o.OooOO0(R.id.tv_name, dataBean.waresname);
                }
                if (Integer.parseInt(dataBean.shopid) != 10) {
                    oooO0o.OooO0oo(R.id.iv_skillicon, R.drawable.bg_wear_crazy_love_line);
                } else {
                    oooO0o.OooO0oo(R.id.iv_skillicon, R.drawable.bg_wear_crazy_nonsense);
                }
            }
            ImageView imageView = (ImageView) oooO0o.OooO0Oo(R.id.ly_skill_coin);
            imageView.setVisibility(0);
            TextView textView2 = (TextView) oooO0o.OooO0Oo(R.id.tv_skillprice);
            TextView textView3 = (TextView) oooO0o.OooO0Oo(R.id.tv_skillpprice);
            textView2.getPaint().setFlags(16);
            textView2.setVisibility(0);
            textView2.setText(o0O0O00.OooO0Oo(dataBean.price));
            textView3.setVisibility(0);
            Pair<Boolean, Integer> value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO0().getValue();
            if (!value.getFirst().booleanValue() || value.getSecond().intValue() < PremiumLevel.Premium4.getValue()) {
                textView3.setText(o0O0O00.OooO0Oo(dataBean.promotionprice));
                if (dataBean.price.equals(dataBean.promotionprice)) {
                    textView2.setVisibility(8);
                }
            } else {
                textView3.setText(o0O0O00.OooO0Oo(dataBean.discountprice));
            }
            oooO0o.OooOOOO(R.id.cl_item, new OooOOO(this, dataBean, oooO0o));
            oooO0o.OooO0Oo(R.id.ly_skillprice).setVisibility(0);
            if (com.yalla.support.common.util.OooO.OooO0o(dataBean.price) <= 0 && com.yalla.support.common.util.OooO.OooO0o(dataBean.promotionprice) <= 0 && com.yalla.support.common.util.OooO.OooO0o(dataBean.discountprice) <= 0) {
                oooO0o.OooO0Oo(R.id.ly_skillprice).setVisibility(4);
            }
            TextView textView4 = (TextView) oooO0o.OooO0Oo(R.id.purchase);
            textView4.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Purchase));
            textView4.setSelected(false);
            if (dataBean.state == 1) {
                imageView.setVisibility(8);
                textView2.setVisibility(8);
                textView3.setVisibility(8);
                textView4.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.skillcard_store_soldout));
                textView4.setSelected(true);
            }
            if (dataBean.activityType == 1) {
                imageView.setVisibility(8);
                textView2.setVisibility(8);
                textView3.setVisibility(8);
                textView4.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Reward));
                textView4.setSelected(true);
            }
        }
    }

    public class OooO0OO implements BaseQuickAdapter.OooOOOO {
        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        }
    }

    public class OooO0o extends o00Oo0 {
        public OooO0o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(View view) {
            SkillCardDataFragment.this.adapter.setFirstLoading(true);
            ((PurchaseSkillCardActivity) SkillCardDataFragment.this.getActivity()).OooOoO();
        }
    }

    private void initIntent() {
        this.adapterData = new ArrayList();
        if (getArguments() != null) {
            this.wareType = getArguments().getInt(WEAR_TYPE_KEY, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
    private void initView(View view) {
        int i;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_top_data);
        XRefreshLayout xRefreshLayout = (XRefreshLayout) view.findViewById(R.id.xrl_top);
        this.xrlTop = xRefreshLayout;
        xRefreshLayout.OooOoOO(false);
        XRefreshLayout xRefreshLayout2 = this.xrlTop;
        xRefreshLayout2.f19541o00O0O = false;
        xRefreshLayout2.setOnRefreshListener(new OooO00o());
        int i2 = this.wareType;
        if (i2 == 1) {
            i = R.layout.item_skill_wear_hats;
        } else if (i2 == 2) {
            i = R.layout.item_skill_wear_crazy;
        } else if (i2 != 3) {
            i = R.layout.item_skill_wear_hats;
        } else {
            i = R.layout.item_skill_wear_voice;
        }
        OooO0O0 oooO0O0 = new OooO0O0(this.mContext, i, this.adapterData);
        this.adapter = oooO0O0;
        oooO0O0.setFirstLoading(true);
        this.adapter.setOnItemClickListener(new OooO0OO());
        this.adapter.setLoadErrorClickListener(new OooO0o());
        recyclerView.setLayoutManager(new FixGridLayoutManager(this.mContext, 2));
        recyclerView.setAdapter(this.adapter);
    }

    public static SkillCardDataFragment newInstence(int i) {
        SkillCardDataFragment skillCardDataFragment = new SkillCardDataFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(WEAR_TYPE_KEY, i);
        skillCardDataFragment.setArguments(bundle);
        return skillCardDataFragment;
    }

    public void loadError(String str, String str2) {
        if (this.xrlTop == null) {
            return;
        }
        this.adapter.loadError();
        this.xrlTop.Oooo0O0(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(R.layout.fragment_top_data, viewGroup, false);
        initIntent();
        initView(this.rootView);
        return this.rootView;
    }

    public void setData(List<SkillCardListModel.DataBean> list) {
        XRefreshLayout xRefreshLayout = this.xrlTop;
        if (xRefreshLayout == null) {
            return;
        }
        xRefreshLayout.setLoadComplete(true);
        this.adapter.setLoadComplete();
        this.adapterData.clear();
        this.adapterData.addAll(list);
        this.adapter.setNewData(this.adapterData);
    }
}
