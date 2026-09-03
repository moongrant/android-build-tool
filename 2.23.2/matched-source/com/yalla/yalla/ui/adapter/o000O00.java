package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.SkillCardListModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p475o0Ooooo0.o0O00oO0;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends BaseAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<SkillCardListModel.DataBean> f27040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f27041OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList f27042OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f27043OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f27044OooO0oo;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ImageView f27045OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public TextView f27046OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f27047OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public SVGAView f27048OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public NetImageView f27049OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f27050OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f27051OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public TextView f27052OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public TextView f27053OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public ImageView f27054OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public View f27055OooOO0O;

        public OooO00o() {
        }
    }

    public o000O00(Context context, List<SkillCardListModel.DataBean> list, int i, int i2, RoomUserInfoModel roomUserInfoModel) {
        this.f27044OooO0oo = "";
        this.f27041OooO0o = context;
        this.f27040OooO0Oo = list;
        this.f27043OooO0oO = i2;
        this.f27044OooO0oo = roomUserInfoModel.getUserHeader().getValue();
        int i3 = i * i2;
        int i4 = i2 + i3;
        if (this.f27042OooO0o0 == null) {
            this.f27042OooO0o0 = new ArrayList();
        }
        while (i3 < i4) {
            this.f27042OooO0o0.add(this.f27040OooO0Oo.get(i3));
            i3++;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f27043OooO0oO;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return (SkillCardListModel.DataBean) this.f27042OooO0o0.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f27042OooO0o0.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f27042OooO0o0.get(i)).shopid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            viewInflate = LayoutInflater.from(this.f27041OooO0o).inflate(p562o0oOo000.oo0o0Oo.item_room_wear_hats, viewGroup, false);
            oooO00o.f27046OooO00o = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_stock);
            oooO00o.f27047OooO0O0 = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tvLimitTime);
            oooO00o.f27049OooO0Oo = (NetImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.iv_item_wear_avatar);
            oooO00o.f27048OooO0OO = (SVGAView) viewInflate.findViewById(p562o0oOo000.o0OO00O.iv_item_wear_icon);
            oooO00o.f27051OooO0o0 = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_current_price);
            oooO00o.f27053OooO0oo = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_sold_out);
            oooO00o.f27054OooOO0 = (ImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.ivType);
            oooO00o.f27050OooO0o = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_current_promotion_price);
            oooO00o.f27045OooO = (ImageView) viewInflate.findViewById(p562o0oOo000.o0OO00O.wearCoin);
            oooO00o.f27052OooO0oO = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tv_item_wear_none);
            oooO00o.f27055OooOO0O = viewInflate.findViewById(p562o0oOo000.o0OO00O.view_item_wear_line_right);
            ((RelativeLayout) viewInflate.findViewById(p562o0oOo000.o0OO00O.rl_item_wear_selected)).setVisibility(8);
            viewInflate.setTag(oooO00o);
            if (p595o0oo00O.OooOo00.OooO0o0()) {
                oooO00o.f27054OooOO0.setRotationY(180.0f);
            } else {
                oooO00o.f27054OooOO0.setRotationY(0.0f);
            }
        } else {
            viewInflate = view;
            oooO00o = (OooO00o) view.getTag();
        }
        SkillCardListModel.DataBean dataBean = (SkillCardListModel.DataBean) this.f27042OooO0o0.get(i);
        TextView textView = oooO00o.f27046OooO00o;
        if (textView != null) {
            textView.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            oooO00o.f27046OooO00o.setVisibility(8);
        }
        ImageView imageView = oooO00o.f27054OooOO0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        SVGAView sVGAView = oooO00o.f27048OooO0OO;
        if (sVGAView != null) {
            sVGAView.OooOOO0(false);
            oooO00o.f27048OooO0OO.setImageDrawable(null);
            oooO00o.f27048OooO0OO.setVisibility(8);
        }
        TextView textView2 = oooO00o.f27051OooO0o0;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = oooO00o.f27050OooO0o;
        if (textView3 != null) {
            textView3.setText("");
        }
        TextView textView4 = oooO00o.f27052OooO0oO;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        if (dataBean.warestype == 0) {
            oooO00o.f27052OooO0oO.setVisibility(8);
        } else {
            TextView textView5 = oooO00o.f27047OooO0O0;
            textView5.setVisibility(8);
            int i2 = dataBean.limitDay;
            o000O00 o000o01 = o000O00.this;
            if (i2 > 0) {
                textView5.setVisibility(0);
                textView5.setText(com.code.android.util.o0000O.OooO00o(o000o01.f27041OooO0o.getString(p562o0oOo000.o000000.wear_store_xxx_days), com.code.android.util.o0OoOo0.OooOO0o(Integer.valueOf(dataBean.limitDay), "")));
            }
            if (dataBean.lowestVIPLv > 0) {
                oooO00o.f27054OooOO0.setVisibility(0);
                oooO00o.f27054OooOO0.setImageResource(p562o0oOo000.o0Oo0oo.ic_hats_vip);
            } else if (dataBean.activityType == 1) {
                oooO00o.f27054OooOO0.setVisibility(0);
                oooO00o.f27054OooOO0.setImageResource(p562o0oOo000.o0Oo0oo.ic_hats_treasure_chest);
            } else {
                oooO00o.f27054OooOO0.setVisibility(8);
            }
            oooO00o.f27046OooO00o.setText(dataBean.num > 9999 ? "9999+" : p022Oooo00O.OooOO0.OooO00o(new StringBuilder(), dataBean.num, ""));
            oooO00o.f27046OooO00o.setVisibility(0);
            SVGAView sVGAView2 = oooO00o.f27048OooO0OO;
            sVGAView2.OooOO0O(p184o00o00O0.OooO0OO.OooO0Oo(dataBean.picurl), (FragmentActivity) o000o01.f27041OooO0o);
            sVGAView2.OooOO0o();
            oooO00o.f27048OooO0OO.setVisibility(0);
            oooO00o.f27049OooO0Oo.setVisibility(0);
            o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(o000o01.f27041OooO0o);
            oooO00o2.OooO00o(d1.OooO00o());
            oooO00o2.f43138OooOOOo = 0;
            oooO00o2.f43128OooO0o = 0;
            oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(o000o01.f27044OooO0oo);
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(oooO00o.f27049OooO0Oo);
            oooO00o.f27051OooO0o0.setVisibility(0);
            if (dataBean.activityType != 0) {
                oooO00o.f27051OooO0o0.setVisibility(8);
                oooO00o.f27053OooO0oo.setVisibility(0);
                if (dataBean.activityType == 100 && com.code.android.util.OooOo00.OooO0O0(dataBean.activityMsg)) {
                    oooO00o.f27053OooO0oo.setText(dataBean.activityMsg);
                } else {
                    oooO00o.f27053OooO0oo.setText(p562o0oOo000.o000000.Reward);
                }
            } else if (dataBean.state == 1) {
                oooO00o.f27051OooO0o0.setVisibility(8);
                oooO00o.f27053OooO0oo.setVisibility(0);
                oooO00o.f27053OooO0oo.setText(p562o0oOo000.o000000.skillcard_room_soldout);
            } else {
                oooO00o.f27045OooO.setVisibility(0);
                oooO00o.f27051OooO0o0.getPaint().setFlags(16);
                oooO00o.f27051OooO0o0.setText(o0O0O0Oo.OooO0Oo(dataBean.price));
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Pair pair = (Pair) o0O00oO0.OooOO0o().getValue();
                if (!((Boolean) pair.getFirst()).booleanValue() || ((Integer) pair.getSecond()).intValue() < PremiumLevel.Premium4.getValue()) {
                    oooO00o.f27050OooO0o.setText(o0O0O0Oo.OooO0Oo(dataBean.promotionprice));
                    if (dataBean.price.equals(dataBean.promotionprice)) {
                        oooO00o.f27051OooO0o0.setVisibility(8);
                    }
                } else {
                    oooO00o.f27050OooO0o.setText(o0O0O0Oo.OooO0Oo(dataBean.discountprice));
                }
            }
            if (((i + 1) * 2) % o000o01.f27043OooO0oO == 0) {
                oooO00o.f27055OooOO0O.setVisibility(8);
            }
        }
        return viewInflate;
    }
}
