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
import p475o0Ooooo0.o0O00oO0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<SkillCardListModel.DataBean> f27059OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f27060OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f27061OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f27062OooO0oO;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public NetImageView f27064OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ImageView f27065OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TextView f27066OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public TextView f27067OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f27068OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f27069OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public View f27070OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public View f27071OooO0oo;

        public OooO00o() {
        }
    }

    public o000O00O(Context context, List<SkillCardListModel.DataBean> list, int i, int i2) {
        this.f27062OooO0oO = 0;
        this.f27060OooO0o = context;
        this.f27059OooO0Oo = list;
        this.f27062OooO0oO = i2;
        int i3 = i * i2;
        int i4 = i2 + i3;
        if (this.f27061OooO0o0 == null) {
            this.f27061OooO0o0 = new ArrayList();
        }
        while (i3 < i4) {
            this.f27061OooO0o0.add(this.f27059OooO0Oo.get(i3));
            i3++;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27062OooO0oO;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (SkillCardListModel.DataBean) this.f27061OooO0o0.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f27061OooO0o0.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f27061OooO0o0.get(i)).shopid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            viewInflate = LayoutInflater.from(this.f27060OooO0o).inflate(p562o0oOo000.oo0o0Oo.item_room_wear_voice, viewGroup, false);
            oooO00o.f27069OooO0o0 = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_price);
            oooO00o.f27068OooO0o = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_promotion_price);
            oooO00o.f27066OooO0OO = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_name);
            oooO00o.f27067OooO0Oo = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_stock);
            oooO00o.f27064OooO00o = (NetImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.ivHeader);
            oooO00o.f27065OooO0O0 = (ImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.ivCoin);
            oooO00o.f27071OooO0oo = viewInflate.findViewById(p562o0oOo000.o0OO00O.v_item_selected);
            oooO00o.f27070OooO0oO = viewInflate.findViewById(p562o0oOo000.o0OO00O.view_item_wear_line_right);
            viewInflate.setTag(oooO00o);
            if (p595o0oo00O.OooOo00.OooO0o0()) {
                viewInflate.setLayoutDirection(1);
            } else {
                viewInflate.setLayoutDirection(0);
            }
        } else {
            viewInflate = view;
            oooO00o = (OooO00o) view.getTag();
        }
        SkillCardListModel.DataBean dataBean = (SkillCardListModel.DataBean) this.f27061OooO0o0.get(i);
        View view2 = oooO00o.f27071OooO0oo;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (com.code.android.util.OooOo00.OooO00o(dataBean.shopid)) {
            oooO00o.f27069OooO0o0.setVisibility(8);
            oooO00o.f27068OooO0o.setVisibility(8);
            oooO00o.f27067OooO0Oo.setVisibility(4);
            oooO00o.f27065OooO0O0.setVisibility(4);
            oooO00o.f27064OooO00o.setVisibility(4);
        } else {
            oooO00o.f27065OooO0O0.setVisibility(0);
            oooO00o.f27069OooO0o0.setVisibility(0);
            oooO00o.f27068OooO0o.setVisibility(0);
            oooO00o.f27067OooO0Oo.setText(dataBean.num > 9999 ? "9999+" : p022Oooo00O.OooOO0.OooO00o(new StringBuilder(), dataBean.num, ""));
            oooO00o.f27067OooO0Oo.setVisibility(0);
            oooO00o.f27064OooO00o.setVisibility(0);
            o000O00O o000o00o2 = o000O00O.this;
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(o000o00o2.f27060OooO0o);
            oooO00o2.f43126OooO0OO = dataBean.picurl;
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(oooO00o.f27064OooO00o);
            oooO00o.f27066OooO0OO.setText(dataBean.waresname);
            oooO00o.f27069OooO0o0.setText(o0O0O0Oo.OooO0Oo(dataBean.discountprice));
            if (((i + 1) * 2) % o000o00o2.f27062OooO0oO == 0) {
                oooO00o.f27070OooO0oO.setVisibility(8);
            }
            oooO00o.f27069OooO0o0.getPaint().setFlags(16);
            oooO00o.f27069OooO0o0.setText(o0O0O0Oo.OooO0Oo(dataBean.price));
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
            if (!((Boolean) pair.getFirst()).booleanValue() || ((Integer) pair.getSecond()).intValue() < PremiumLevel.Premium4.getValue()) {
                oooO00o.f27068OooO0o.setText(o0O0O0Oo.OooO0Oo(dataBean.promotionprice));
                if (dataBean.price.equals(dataBean.promotionprice)) {
                    oooO00o.f27069OooO0o0.setVisibility(8);
                }
            } else {
                oooO00o.f27068OooO0o.setText(o0O0O0Oo.OooO0Oo(dataBean.discountprice));
            }
        }
        return viewInflate;
    }
}
