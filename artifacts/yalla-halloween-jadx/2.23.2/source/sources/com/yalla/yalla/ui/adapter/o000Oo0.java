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
import p475o0Ooooo0.o0O00oO0;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<SkillCardListModel.DataBean> f27088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f27089OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f27090OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f27091OooO0oO;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public RelativeLayout f27092OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public TextView f27093OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f27094OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TextView f27095OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public LinearLayout f27096OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f27097OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f27098OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public TextView f27099OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public View f27100OooO0oo;

        public OooO00o() {
        }
    }

    public o000Oo0(Context context, List<SkillCardListModel.DataBean> list, int i, int i2) {
        this.f27089OooO0o = context;
        this.f27088OooO0Oo = list;
        this.f27091OooO0oO = i2;
        int i3 = i * i2;
        int i4 = i2 + i3;
        if (this.f27090OooO0o0 == null) {
            this.f27090OooO0o0 = new ArrayList();
        }
        while (i3 < i4) {
            this.f27090OooO0o0.add(this.f27088OooO0Oo.get(i3));
            i3++;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27091OooO0oO;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (SkillCardListModel.DataBean) this.f27090OooO0o0.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f27090OooO0o0.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f27090OooO0o0.get(i)).shopid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            viewInflate = LayoutInflater.from(this.f27089OooO0o).inflate(p562o0oOo000.oo0o0Oo.item_room_wear_crazy, viewGroup, false);
            oooO00o.f27093OooO00o = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_stock);
            oooO00o.f27094OooO0O0 = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tvLimitTime);
            oooO00o.f27095OooO0OO = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_name);
            oooO00o.f27096OooO0Oo = (LinearLayout) viewInflate.findViewById(p562o0oOo000.o0OO00O.ll_item_wear_price);
            oooO00o.f27098OooO0o0 = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_current_price);
            oooO00o.f27097OooO0o = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_current_pprice);
            oooO00o.f27099OooO0oO = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_none);
            oooO00o.f27100OooO0oo = viewInflate.findViewById(p562o0oOo000.o0OO00O.view_item_wear_line_right);
            oooO00o.f27092OooO = (RelativeLayout) viewInflate.findViewById(p562o0oOo000.o0OO00O.rl_item_wear_selected);
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
        SkillCardListModel.DataBean dataBean = (SkillCardListModel.DataBean) this.f27090OooO0o0.get(i);
        TextView textView = oooO00o.f27093OooO00o;
        if (textView != null) {
            textView.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            oooO00o.f27093OooO00o.setVisibility(8);
        }
        TextView textView2 = oooO00o.f27095OooO0OO;
        if (textView2 != null) {
            textView2.setText("");
            oooO00o.f27095OooO0OO.setVisibility(8);
            oooO00o.f27095OooO0OO.setBackground(null);
        }
        LinearLayout linearLayout = oooO00o.f27096OooO0Oo;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView3 = oooO00o.f27098OooO0o0;
        if (textView3 != null) {
            textView3.setText("");
        }
        TextView textView4 = oooO00o.f27097OooO0o;
        if (textView4 != null) {
            textView4.setText("");
        }
        TextView textView5 = oooO00o.f27099OooO0oO;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        RelativeLayout relativeLayout = oooO00o.f27092OooO;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (dataBean.warestype == 0) {
            oooO00o.f27099OooO0oO.setVisibility(0);
        } else {
            TextView textView6 = oooO00o.f27094OooO0O0;
            textView6.setVisibility(8);
            int i2 = dataBean.limitDay;
            o000Oo0 o000oo1 = o000Oo0.this;
            if (i2 > 0) {
                textView6.setVisibility(0);
                textView6.setText(com.code.android.util.o0000O.OooO00o(o000oo1.f27089OooO0o.getString(p562o0oOo000.o000000.wear_store_xxx_days), com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(dataBean.limitDay), "")));
            }
            oooO00o.f27093OooO00o.setText(dataBean.num > 9999 ? "9999+" : p022Oooo00O.OooOO0.OooO00o(new StringBuilder(), dataBean.num, ""));
            oooO00o.f27093OooO00o.setVisibility(0);
            oooO00o.f27095OooO0OO.setText(dataBean.waresname);
            oooO00o.f27095OooO0OO.setVisibility(0);
            int i3 = Integer.parseInt(dataBean.shopid);
            if (i3 == 10) {
                oooO00o.f27095OooO0OO.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_wear_crazy_nonsense);
            } else if (i3 == 38) {
                oooO00o.f27095OooO0OO.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_wear_crazy_love_line);
            }
            oooO00o.f27096OooO0Oo.setVisibility(0);
            oooO00o.f27098OooO0o0.setVisibility(0);
            oooO00o.f27098OooO0o0.getPaint().setFlags(16);
            oooO00o.f27098OooO0o0.setText(o0O0O0Oo.OooO0Oo(dataBean.price));
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
            if (!((Boolean) pair.getFirst()).booleanValue() || ((Integer) pair.getSecond()).intValue() < PremiumLevel.Premium4.getValue()) {
                oooO00o.f27097OooO0o.setText(o0O0O0Oo.OooO0Oo(dataBean.promotionprice));
                if (dataBean.price.equals(dataBean.promotionprice)) {
                    oooO00o.f27098OooO0o0.setVisibility(8);
                }
            } else {
                oooO00o.f27097OooO0o.setText(o0O0O0Oo.OooO0Oo(dataBean.discountprice));
            }
            if (((i + 1) * 2) % o000oo1.f27091OooO0oO == 0) {
                oooO00o.f27100OooO0oo.setVisibility(8);
            }
        }
        return viewInflate;
    }
}
