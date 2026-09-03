package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.SkillCardListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<SkillCardListModel.DataBean> f27551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f27552OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f27553OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f27554OooO0oO;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public RelativeLayout f27555OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public TextView f27556OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f27557OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TextView f27558OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public LinearLayout f27559OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f27560OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f27561OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public TextView f27562OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public View f27563OooO0oo;

        public OooO00o() {
        }
    }

    public o000Oo0(Context context, List<SkillCardListModel.DataBean> list, int i, int i2) {
        this.f27552OooO0o = context;
        this.f27551OooO0Oo = list;
        this.f27554OooO0oO = i2;
        int i3 = i * i2;
        int i4 = i2 + i3;
        if (this.f27553OooO0o0 == null) {
            this.f27553OooO0o0 = new ArrayList();
        }
        while (i3 < i4) {
            this.f27553OooO0o0.add(this.f27551OooO0Oo.get(i3));
            i3++;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27554OooO0oO;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (SkillCardListModel.DataBean) this.f27553OooO0o0.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f27553OooO0o0.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f27553OooO0o0.get(i)).shopid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            viewInflate = LayoutInflater.from(this.f27552OooO0o).inflate(oO00OO0O.item_room_wear_crazy, viewGroup, false);
            oooO00o.f27556OooO00o = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_wear_stock);
            oooO00o.f27557OooO0O0 = (TextView) viewInflate.findViewById(oO00O0oO.tvLimitTime);
            oooO00o.f27558OooO0OO = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_wear_name);
            oooO00o.f27559OooO0Oo = (LinearLayout) viewInflate.findViewById(oO00O0oO.ll_item_wear_price);
            oooO00o.f27561OooO0o0 = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_wear_current_price);
            oooO00o.f27560OooO0o = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_wear_current_pprice);
            oooO00o.f27562OooO0oO = (TextView) viewInflate.findViewById(oO00O0oO.tv_item_wear_none);
            oooO00o.f27563OooO0oo = viewInflate.findViewById(oO00O0oO.view_item_wear_line_right);
            oooO00o.f27555OooO = (RelativeLayout) viewInflate.findViewById(oO00O0oO.rl_item_wear_selected);
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
        SkillCardListModel.DataBean dataBean = (SkillCardListModel.DataBean) this.f27553OooO0o0.get(i);
        TextView textView = oooO00o.f27556OooO00o;
        if (textView != null) {
            textView.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            oooO00o.f27556OooO00o.setVisibility(8);
        }
        TextView textView2 = oooO00o.f27558OooO0OO;
        if (textView2 != null) {
            textView2.setText("");
            oooO00o.f27558OooO0OO.setVisibility(8);
            oooO00o.f27558OooO0OO.setBackground(null);
        }
        LinearLayout linearLayout = oooO00o.f27559OooO0Oo;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView3 = oooO00o.f27561OooO0o0;
        if (textView3 != null) {
            textView3.setText("");
        }
        TextView textView4 = oooO00o.f27560OooO0o;
        if (textView4 != null) {
            textView4.setText("");
        }
        TextView textView5 = oooO00o.f27562OooO0oO;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        RelativeLayout relativeLayout = oooO00o.f27555OooO;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (dataBean.warestype == 0) {
            oooO00o.f27562OooO0oO.setVisibility(0);
        } else {
            TextView textView6 = oooO00o.f27557OooO0O0;
            textView6.setVisibility(8);
            int i2 = dataBean.limitDay;
            o000Oo0 o000oo1 = o000Oo0.this;
            if (i2 > 0) {
                textView6.setVisibility(0);
                textView6.setText(com.code.android.util.o0000O.OooO00o(o000oo1.f27552OooO0o.getString(oO00OOo0.wear_store_xxx_days), com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(dataBean.limitDay), "")));
            }
            oooO00o.f27556OooO00o.setText(dataBean.num > 9999 ? "9999+" : p022Oooo00O.OooOO0.OooO0O0(new StringBuilder(), dataBean.num, ""));
            oooO00o.f27556OooO00o.setVisibility(0);
            oooO00o.f27558OooO0OO.setText(dataBean.waresname);
            oooO00o.f27558OooO0OO.setVisibility(0);
            int i3 = Integer.parseInt(dataBean.shopid);
            if (i3 == 10) {
                oooO00o.f27558OooO0OO.setBackgroundResource(oOo00OO0.bg_wear_crazy_nonsense);
            } else if (i3 == 38) {
                oooO00o.f27558OooO0OO.setBackgroundResource(oOo00OO0.bg_wear_crazy_love_line);
            }
            oooO00o.f27559OooO0Oo.setVisibility(0);
            oooO00o.f27561OooO0o0.setVisibility(0);
            oooO00o.f27561OooO0o0.getPaint().setFlags(16);
            oooO00o.f27561OooO0o0.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.price));
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            Pair pair = (Pair) p464o0Oooo.o000000O.OooOO0o().getValue();
            if (!((Boolean) pair.getFirst()).booleanValue() || ((Integer) pair.getSecond()).intValue() < PremiumLevel.Premium4.getValue()) {
                oooO00o.f27560OooO0o.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.promotionprice));
                if (dataBean.price.equals(dataBean.promotionprice)) {
                    oooO00o.f27561OooO0o0.setVisibility(8);
                }
            } else {
                oooO00o.f27560OooO0o.setText(p590o0oo0.OooOOOO.OooO0Oo(dataBean.discountprice));
            }
            if (((i + 1) * 2) % o000oo1.f27554OooO0oO == 0) {
                oooO00o.f27563OooO0oo.setVisibility(8);
            }
        }
        return viewInflate;
    }
}
