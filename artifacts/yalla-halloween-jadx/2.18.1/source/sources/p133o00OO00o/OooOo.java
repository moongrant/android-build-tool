package p133o00OO00o;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.model.SkillCardListModel;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f31226Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<SkillCardListModel.DataBean> f31227Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<SkillCardListModel.DataBean> f31228Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Context f31229Oooo0oo;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public RelativeLayout f31230OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public TextView f31231OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f31232OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public TextView f31233OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public LinearLayout f31234OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f31235OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f31236OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public TextView f31237OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public View f31238OooO0oo;

        public OooO00o() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    public OooOo(Context context, List<SkillCardListModel.DataBean> list, int i, int i2) {
        this.f31229Oooo0oo = context;
        this.f31227Oooo0o = list;
        this.f31226Oooo = i2;
        int i3 = i * i2;
        int i4 = i2 + i3;
        if (this.f31228Oooo0oO == null) {
            this.f31228Oooo0oO = new ArrayList();
        }
        while (i3 < i4) {
            this.f31228Oooo0oO.add(this.f31227Oooo0o.get(i3));
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final SkillCardListModel.DataBean getItem(int i) {
        return (SkillCardListModel.DataBean) this.f31228Oooo0oO.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f31226Oooo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f31228Oooo0oO.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f31228Oooo0oO.get(i)).shopid);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            viewInflate = LayoutInflater.from(this.f31229Oooo0oo).inflate(R.layout.item_room_wear_crazy, viewGroup, false);
            oooO00o.f31231OooO00o = (TextView) viewInflate.findViewById(R.id.tv_item_wear_stock);
            oooO00o.f31232OooO0O0 = (TextView) viewInflate.findViewById(R.id.tvLimitTime);
            oooO00o.f31233OooO0OO = (TextView) viewInflate.findViewById(R.id.tv_item_wear_name);
            oooO00o.f31234OooO0Oo = (LinearLayout) viewInflate.findViewById(R.id.ll_item_wear_price);
            oooO00o.f31236OooO0o0 = (TextView) viewInflate.findViewById(R.id.tv_item_wear_current_price);
            oooO00o.f31235OooO0o = (TextView) viewInflate.findViewById(R.id.tv_item_wear_current_pprice);
            oooO00o.f31237OooO0oO = (TextView) viewInflate.findViewById(R.id.tv_item_wear_none);
            oooO00o.f31238OooO0oo = viewInflate.findViewById(R.id.view_item_wear_line_right);
            oooO00o.f31230OooO = (RelativeLayout) viewInflate.findViewById(R.id.rl_item_wear_selected);
            viewInflate.setTag(oooO00o);
            if (oo000o.OooO0o0()) {
                viewInflate.setLayoutDirection(1);
            } else {
                viewInflate.setLayoutDirection(0);
            }
        } else {
            viewInflate = view;
            oooO00o = (OooO00o) view.getTag();
        }
        SkillCardListModel.DataBean item = getItem(i);
        TextView textView = oooO00o.f31231OooO00o;
        if (textView != null) {
            textView.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            oooO00o.f31231OooO00o.setVisibility(8);
        }
        TextView textView2 = oooO00o.f31233OooO0OO;
        if (textView2 != null) {
            textView2.setText("");
            oooO00o.f31233OooO0OO.setVisibility(8);
            oooO00o.f31233OooO0OO.setBackground(null);
        }
        LinearLayout linearLayout = oooO00o.f31234OooO0Oo;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView3 = oooO00o.f31236OooO0o0;
        if (textView3 != null) {
            textView3.setText("");
        }
        TextView textView4 = oooO00o.f31235OooO0o;
        if (textView4 != null) {
            textView4.setText("");
        }
        TextView textView5 = oooO00o.f31237OooO0oO;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        RelativeLayout relativeLayout = oooO00o.f31230OooO;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (item.warestype == 0) {
            oooO00o.f31237OooO0oO.setVisibility(0);
        } else {
            TextView textView6 = oooO00o.f31232OooO0O0;
            textView6.setVisibility(8);
            if (item.limitDay > 0) {
                textView6.setVisibility(0);
                textView6.setText(com.yalla.support.common.util.OooOo.OooO00o(OooOo.this.f31229Oooo0oo.getString(R.string.wear_store_xxx_days), OooO.OooO0oo(Integer.valueOf(item.limitDay), "")));
            }
            oooO00o.f31231OooO00o.setText(item.num);
            oooO00o.f31231OooO00o.setVisibility(0);
            oooO00o.f31233OooO0OO.setText(item.waresname);
            oooO00o.f31233OooO0OO.setVisibility(0);
            int i2 = Integer.parseInt(item.shopid);
            if (i2 == 10) {
                oooO00o.f31233OooO0OO.setBackgroundResource(R.drawable.bg_wear_crazy_nonsense);
            } else if (i2 == 38) {
                oooO00o.f31233OooO0OO.setBackgroundResource(R.drawable.bg_wear_crazy_love_line);
            }
            oooO00o.f31234OooO0Oo.setVisibility(0);
            oooO00o.f31236OooO0o0.setVisibility(0);
            oooO00o.f31236OooO0o0.getPaint().setFlags(16);
            oooO00o.f31236OooO0o0.setText(o0O0O00.OooO0Oo(item.price));
            Pair<Boolean, Integer> value = OooOOO.f41216OooO00o.OooOOO0().getValue();
            if (!value.getFirst().booleanValue() || value.getSecond().intValue() < PremiumLevel.Premium4.getValue()) {
                oooO00o.f31235OooO0o.setText(o0O0O00.OooO0Oo(item.promotionprice));
                if (item.price.equals(item.promotionprice)) {
                    oooO00o.f31236OooO0o0.setVisibility(8);
                }
            } else {
                oooO00o.f31235OooO0o.setText(o0O0O00.OooO0Oo(item.discountprice));
            }
            if (((i + 1) * 2) % OooOo.this.f31226Oooo == 0) {
                oooO00o.f31238OooO0oo.setVisibility(8);
            }
        }
        return viewInflate;
    }
}
