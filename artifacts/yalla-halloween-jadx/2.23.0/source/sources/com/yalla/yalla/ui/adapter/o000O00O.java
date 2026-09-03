package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.SkillCardListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<SkillCardListModel.DataBean> f27518OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f27519OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f27520OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f27521OooO0oO;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public NetImageView f27523OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ImageView f27524OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TextView f27525OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public TextView f27526OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f27527OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f27528OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public View f27529OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public View f27530OooO0oo;

        public OooO00o() {
        }
    }

    public o000O00O(Context context, List<SkillCardListModel.DataBean> list, int i, int i2) {
        this.f27521OooO0oO = 0;
        this.f27519OooO0o = context;
        this.f27518OooO0Oo = list;
        this.f27521OooO0oO = i2;
        int i3 = i * i2;
        int i4 = i2 + i3;
        if (this.f27520OooO0o0 == null) {
            this.f27520OooO0o0 = new ArrayList();
        }
        while (i3 < i4) {
            this.f27520OooO0o0.add(this.f27518OooO0Oo.get(i3));
            i3++;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27521OooO0oO;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (SkillCardListModel.DataBean) this.f27520OooO0o0.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f27520OooO0o0.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f27520OooO0o0.get(i)).shopid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            viewInflate = LayoutInflater.from(this.f27519OooO0o).inflate(oO00OO0O.item_room_wear_voice, viewGroup, false);
            oooO00o.f27528OooO0o0 = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_price);
            oooO00o.f27527OooO0o = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_promotion_price);
            oooO00o.f27525OooO0OO = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_name);
            oooO00o.f27526OooO0Oo = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_stock);
            oooO00o.f27523OooO00o = (NetImageView) viewInflate.findViewById(oO00O0oO.ivHeader);
            oooO00o.f27524OooO0O0 = (ImageView) viewInflate.findViewById(oO00O0oO.ivCoin);
            oooO00o.f27530OooO0oo = viewInflate.findViewById(oO00O0oO.v_item_selected);
            oooO00o.f27529OooO0oO = viewInflate.findViewById(oO00O0oO.view_item_wear_line_right);
            viewInflate.setTag(oooO00o);
            if (p591o0oo000O.OooO.OooO0o0()) {
                viewInflate.setLayoutDirection(1);
            } else {
                viewInflate.setLayoutDirection(0);
            }
        } else {
            viewInflate = view;
            oooO00o = (OooO00o) view.getTag();
        }
        SkillCardListModel.DataBean dataBean = (SkillCardListModel.DataBean) this.f27520OooO0o0.get(i);
        View view2 = oooO00o.f27530OooO0oo;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (com.code.android.util.OooOo00.OooO00o(dataBean.shopid)) {
            oooO00o.f27528OooO0o0.setVisibility(8);
            oooO00o.f27527OooO0o.setVisibility(8);
            oooO00o.f27526OooO0Oo.setVisibility(4);
            oooO00o.f27524OooO0O0.setVisibility(4);
            oooO00o.f27523OooO00o.setVisibility(4);
        } else {
            oooO00o.f27524OooO0O0.setVisibility(0);
            oooO00o.f27528OooO0o0.setVisibility(0);
            oooO00o.f27527OooO0o.setVisibility(0);
            oooO00o.f27526OooO0Oo.setText(dataBean.num > 9999 ? "9999+" : p022Oooo00O.OooOO0.OooO0O0(new StringBuilder(), dataBean.num, ""));
            oooO00o.f27526OooO0Oo.setVisibility(0);
            oooO00o.f27523OooO00o.setVisibility(0);
            o000O00O o000o00o2 = o000O00O.this;
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(o000o00o2.f27519OooO0o);
            oooO00o2.f43911OooO0OO = dataBean.picurl;
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo(oooO00o.f27523OooO00o);
            oooO00o.f27525OooO0OO.setText(dataBean.waresname);
            oooO00o.f27528OooO0o0.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.discountprice));
            if (((i + 1) * 2) % o000o00o2.f27521OooO0oO == 0) {
                oooO00o.f27529OooO0oO.setVisibility(8);
            }
            oooO00o.f27528OooO0o0.getPaint().setFlags(16);
            oooO00o.f27528OooO0o0.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.price));
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0o().getValue();
            if (!((Boolean) pair.getFirst()).booleanValue() || ((Integer) pair.getSecond()).intValue() < PremiumLevel.Premium4.getValue()) {
                oooO00o.f27527OooO0o.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.promotionprice));
                if (dataBean.price.equals(dataBean.promotionprice)) {
                    oooO00o.f27528OooO0o0.setVisibility(8);
                }
            } else {
                oooO00o.f27527OooO0o.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.discountprice));
            }
        }
        return viewInflate;
    }
}
