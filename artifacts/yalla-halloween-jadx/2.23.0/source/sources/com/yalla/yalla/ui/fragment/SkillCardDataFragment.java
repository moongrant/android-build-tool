package com.yalla.yalla.ui.fragment;

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
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.SkillCardListModel;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public class SkillCardDataFragment extends com.yalla.yalla.base.fragment.OooO00o {
    public static final int WEAR_TYPE_CRAZY = 2;
    public static final int WEAR_TYPE_HAT = 1;
    public static final String WEAR_TYPE_KEY = "weartype";
    public static final int WEAR_TYPE_VOICE = 3;
    private p564o0oOo0OO.o000O<SkillCardListModel.DataBean> adapter;
    private List<SkillCardListModel.DataBean> adapterData;
    private Context mContext;
    private int wareType;
    private XRefreshLayout xrlTop;

    public class OooO00o implements p562o0oOo0O.o000oOoO {
        public OooO00o() {
        }

        @Override // p562o0oOo0O.o000oOoO
        public final void OooO0O0() {
            ((PurchaseSkillCardActivity) SkillCardDataFragment.this.getActivity()).OooOo0O();
        }
    }

    public class OooO0O0 extends p564o0oOo0OO.o000O<SkillCardListModel.DataBean> {
        public OooO0O0(Context context, int i, List list) {
            super(i, context, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            SkillCardListModel.DataBean dataBean = (SkillCardListModel.DataBean) obj;
            TextView textView = (TextView) viewHolder.getView(oO00O0oO.tvLimitTime);
            textView.setVisibility(8);
            int i = dataBean.limitDay;
            SkillCardDataFragment skillCardDataFragment = SkillCardDataFragment.this;
            if (i > 0) {
                textView.setVisibility(0);
                textView.setText(com.code.android.util.o0000O.OooO00o(skillCardDataFragment.getString(oO00OOo0.wear_store_xxx_days), com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(dataBean.limitDay), "")));
            }
            String strOooO0O0 = p022Oooo00O.OooOO0.OooO0O0(new StringBuilder(), dataBean.num, "");
            if (dataBean.num > 9999) {
                strOooO0O0 = "9999+";
            }
            viewHolder.setText(oO00O0oO.tv_skill_num, strOooO0O0);
            int i2 = skillCardDataFragment.wareType;
            if (i2 == 1) {
                SVGAView sVGAView = (SVGAView) viewHolder.getView(oO00O0oO.iv_skillicon);
                sVGAView.OooOO0O(dataBean.picurl, skillCardDataFragment.getViewLifecycleOwner());
                sVGAView.OooOO0o();
                if (dataBean.lowestVIPLv > 0) {
                    int i3 = oO00O0oO.ivType;
                    viewHolder.setGone(i3, true);
                    viewHolder.setImageResource(i3, oOo00OO0.ic_store_flag_premium);
                } else if (dataBean.activityType == 1) {
                    int i4 = oO00O0oO.ivType;
                    viewHolder.setGone(i4, true);
                    viewHolder.setImageResource(i4, oOo00OO0.ic_store_flag_activity);
                } else {
                    viewHolder.setGone(oO00O0oO.ivType, false);
                }
            } else if (i2 != 2) {
                NetImageView netImageView = (NetImageView) viewHolder.getView(oO00O0oO.iv_skillicon);
                o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f10108OooOOOo);
                oooO00o.f43911OooO0OO = dataBean.picurl;
                oooO00o.f43909OooO00o = 0;
                oooO00o.OooO0Oo(netImageView);
                int iOooO00o = com.code.android.util.o0000O0.OooO00o(75.0f);
                int iOooO00o2 = com.code.android.util.o0000O0.OooO00o(75.0f);
                Intrinsics.checkNotNullParameter(netImageView, "<this>");
                netImageView.getLayoutParams().width = iOooO00o;
                netImageView.getLayoutParams().height = iOooO00o2;
                netImageView.requestLayout();
                if (!dataBean.waresname.isEmpty()) {
                    int i5 = oO00O0oO.tv_name;
                    viewHolder.setVisible(i5, true);
                    viewHolder.setText(i5, dataBean.waresname);
                }
            } else {
                if (!dataBean.waresname.isEmpty()) {
                    int i6 = oO00O0oO.tv_name;
                    viewHolder.setVisible(i6, true);
                    viewHolder.setText(i6, dataBean.waresname);
                }
                if (Integer.parseInt(dataBean.shopid) != 10) {
                    viewHolder.setImageResource(oO00O0oO.iv_skillicon, oOo00OO0.bg_wear_crazy_love_line);
                } else {
                    viewHolder.setImageResource(oO00O0oO.iv_skillicon, oOo00OO0.bg_wear_crazy_nonsense);
                }
            }
            ImageView imageView = (ImageView) viewHolder.getView(oO00O0oO.ly_skill_coin);
            imageView.setVisibility(0);
            TextView textView2 = (TextView) viewHolder.getView(oO00O0oO.tv_skillprice);
            TextView textView3 = (TextView) viewHolder.getView(oO00O0oO.tv_skillpprice);
            textView2.getPaint().setFlags(16);
            textView2.setVisibility(0);
            textView2.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.price));
            textView3.setVisibility(0);
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0o().getValue();
            if (!((Boolean) pair.getFirst()).booleanValue() || ((Integer) pair.getSecond()).intValue() < PremiumLevel.Premium4.getValue()) {
                textView3.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.promotionprice));
                if (dataBean.price.equals(dataBean.promotionprice)) {
                    textView2.setVisibility(8);
                }
            } else {
                textView3.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.discountprice));
            }
            viewHolder.setViewOnClickListener(oO00O0oO.cl_item, new o0000O0O(this, dataBean, viewHolder));
            int i7 = oO00O0oO.ly_skillprice;
            viewHolder.getView(i7).setVisibility(0);
            if (com.code.android.util.o0OoOo0.OooO(0L, dataBean.price) <= 0 && com.code.android.util.o0OoOo0.OooO(0L, dataBean.promotionprice) <= 0 && com.code.android.util.o0OoOo0.OooO(0L, dataBean.discountprice) <= 0) {
                viewHolder.getView(i7).setVisibility(4);
            }
            TextView textView4 = (TextView) viewHolder.getView(oO00O0oO.purchase);
            textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Purchase));
            textView4.setSelected(false);
            if (dataBean.state == 1) {
                imageView.setVisibility(8);
                textView2.setVisibility(8);
                textView3.setVisibility(8);
                textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.skillcard_store_soldout));
                textView4.setSelected(true);
            }
            int i8 = dataBean.activityType;
            if (i8 == 1 || i8 == 2) {
                imageView.setVisibility(8);
                textView2.setVisibility(8);
                textView3.setVisibility(8);
                textView4.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Reward));
                textView4.setSelected(true);
            }
        }
    }

    public class OooO0OO implements BaseQuickAdapter.OooO0o {
        @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
        public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        }
    }

    public class OooO0o extends oo00o {
        public OooO0o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(View view) {
            SkillCardDataFragment skillCardDataFragment = SkillCardDataFragment.this;
            skillCardDataFragment.adapter.Oooo00O(true);
            ((PurchaseSkillCardActivity) skillCardDataFragment.getActivity()).OooOo0O();
        }
    }

    private void initIntent() {
        this.adapterData = new ArrayList();
        if (getArguments() != null) {
            this.wareType = getArguments().getInt(WEAR_TYPE_KEY, 1);
        }
    }

    private void initView(View view) {
        int i;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(oO00O0oO.rv_top_data);
        XRefreshLayout xRefreshLayout = (XRefreshLayout) view.findViewById(oO00O0oO.xrl_top);
        this.xrlTop = xRefreshLayout;
        xRefreshLayout.OooOo00(false);
        XRefreshLayout xRefreshLayout2 = this.xrlTop;
        xRefreshLayout2.f21330OooOooO = false;
        xRefreshLayout2.setOnRefreshListener(new OooO00o());
        int i2 = this.wareType;
        if (i2 != 2) {
            i = i2 != 3 ? oO00OO0O.item_skill_wear_hats : oO00OO0O.item_skill_wear_voice;
        } else {
            i = oO00OO0O.item_skill_wear_crazy;
        }
        OooO0O0 oooO0O0 = new OooO0O0(this.mContext, i, this.adapterData);
        this.adapter = oooO0O0;
        oooO0O0.Oooo00O(true);
        p564o0oOo0OO.o000O<SkillCardListModel.DataBean> o000o = this.adapter;
        o000o.f10098OooO0o = new OooO0OO();
        o000o.Oooo0OO(new OooO0o());
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
        this.adapter.OooOoo();
        this.xrlTop.OooOoo(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.rootView = layoutInflater.inflate(oO00OO0O.fragment_top_data, viewGroup, false);
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
        this.adapter.Oooo00o();
        this.adapterData.clear();
        this.adapterData.addAll(list);
        this.adapter.OooOoO0(this.adapterData);
    }
}
