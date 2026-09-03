package p133o00OO00o;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.base.model.RoomUserInfo;
import com.app.base.model.SkillCardListModel;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f31295Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<SkillCardListModel.DataBean> f31296Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<SkillCardListModel.DataBean> f31297Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Context f31298Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f31299OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public RoomUserInfo f31300OoooO00;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public TextView f31301OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public TextView f31302OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f31303OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public NetImageView f31304OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public NetImageView f31305OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public LinearLayout f31306OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f31307OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public TextView f31308OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public TextView f31309OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public TextView f31310OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public ImageView f31311OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public View f31312OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public RelativeLayout f31314OooOOO0;

        public OooO00o() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    public o0OOO0o(Context context, List<SkillCardListModel.DataBean> list, int i, int i2, RoomUserInfo roomUserInfo, int i3) {
        this.f31298Oooo0oo = context;
        this.f31296Oooo0o = list;
        this.f31295Oooo = i2;
        this.f31300OoooO00 = roomUserInfo;
        this.f31299OoooO0 = i3;
        int i4 = i * i2;
        int i5 = i2 + i4;
        if (this.f31297Oooo0oO == null) {
            this.f31297Oooo0oO = new ArrayList();
        }
        while (i4 < i5) {
            this.f31297Oooo0oO.add(this.f31296Oooo0o.get(i4));
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final SkillCardListModel.DataBean getItem(int i) {
        return (SkillCardListModel.DataBean) this.f31297Oooo0oO.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f31295Oooo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f31297Oooo0oO.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f31297Oooo0oO.get(i)).shopid);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            int i2 = getItem(i).warestype;
            int i3 = R.layout.item_room_wear_hats;
            if (i2 != 1 && i2 == 2) {
                i3 = R.layout.item_room_wear_crazy;
            }
            viewInflate = LayoutInflater.from(this.f31298Oooo0oo).inflate(i3, viewGroup, false);
            oooO00o.f31302OooO00o = (TextView) viewInflate.findViewById(R.id.tv_item_wear_stock);
            oooO00o.f31303OooO0O0 = (TextView) viewInflate.findViewById(R.id.tvLimitTime);
            oooO00o.f31305OooO0Oo = (NetImageView) viewInflate.findViewById(R.id.iv_item_wear_avatar);
            oooO00o.f31304OooO0OO = (NetImageView) viewInflate.findViewById(R.id.iv_item_wear_icon);
            oooO00o.f31307OooO0o0 = (TextView) viewInflate.findViewById(R.id.tv_item_wear_name);
            oooO00o.f31306OooO0o = (LinearLayout) viewInflate.findViewById(R.id.ll_item_wear_price);
            oooO00o.f31308OooO0oO = (TextView) viewInflate.findViewById(R.id.tv_item_wear_current_price);
            oooO00o.f31310OooOO0 = (TextView) viewInflate.findViewById(R.id.tv_item_wear_sold_out);
            oooO00o.f31309OooO0oo = (TextView) viewInflate.findViewById(R.id.tv_item_wear_current_pprice);
            oooO00o.f31311OooOO0O = (ImageView) viewInflate.findViewById(R.id.wearCoin);
            oooO00o.f31301OooO = (TextView) viewInflate.findViewById(R.id.tv_item_wear_none);
            oooO00o.f31312OooOO0o = viewInflate.findViewById(R.id.view_item_wear_line_right);
            oooO00o.f31314OooOOO0 = (RelativeLayout) viewInflate.findViewById(R.id.rl_item_wear_selected);
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
        TextView textView = oooO00o.f31302OooO00o;
        if (textView != null) {
            textView.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            oooO00o.f31302OooO00o.setVisibility(8);
        }
        NetImageView netImageView = oooO00o.f31304OooO0OO;
        if (netImageView != null) {
            netImageView.setImageDrawable(null);
            oooO00o.f31304OooO0OO.setVisibility(8);
        }
        TextView textView2 = oooO00o.f31307OooO0o0;
        if (textView2 != null) {
            textView2.setText("");
            oooO00o.f31307OooO0o0.setVisibility(8);
            oooO00o.f31307OooO0o0.setBackground(null);
        }
        LinearLayout linearLayout = oooO00o.f31306OooO0o;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView3 = oooO00o.f31308OooO0oO;
        if (textView3 != null) {
            textView3.setText("");
        }
        TextView textView4 = oooO00o.f31309OooO0oo;
        if (textView4 != null) {
            textView4.setText("");
        }
        TextView textView5 = oooO00o.f31301OooO;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        RelativeLayout relativeLayout = oooO00o.f31314OooOOO0;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (item.warestype != 0) {
            TextView textView6 = oooO00o.f31303OooO0O0;
            textView6.setVisibility(8);
            if (item.limitDay > 0) {
                textView6.setVisibility(0);
                textView6.setText(OooOo.OooO00o(o0OOO0o.this.f31298Oooo0oo.getString(R.string.wear_store_xxx_days), OooO.OooO0oo(Integer.valueOf(item.limitDay), "")));
            }
            oooO00o.f31302OooO00o.setText(item.num);
            oooO00o.f31302OooO00o.setVisibility(0);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(o0OOO0o.this.f31298Oooo0oo);
            oooO00o2.f48429OooO0OO = item.picurl;
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48432OooO0o0 = true;
            oooO00o2.f48454OooOoo0 = 3;
            oooO00o2.OooO0o(oooO00o.f31304OooO0OO);
            oooO00o.f31304OooO0OO.setVisibility(0);
            if (item.warestype == 2) {
                oooO00o.f31307OooO0o0.setText(item.waresname);
                oooO00o.f31307OooO0o0.setVisibility(0);
                int i4 = Integer.parseInt(item.shopid);
                if (i4 == 10) {
                    oooO00o.f31307OooO0o0.setBackgroundResource(R.drawable.bg_wear_crazy_nonsense);
                } else if (i4 == 38) {
                    oooO00o.f31307OooO0o0.setBackgroundResource(R.drawable.bg_wear_crazy_love_line);
                }
                oooO00o.f31305OooO0Oo.setVisibility(8);
            } else {
                oooO00o.f31305OooO0Oo.setVisibility(0);
                oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(o0OOO0o.this.f31298Oooo0oo);
                oooO00o3.OooO00o(o00OOO.OooO00o.OooO00o());
                oooO00o3.f48429OooO0OO = CloudImageUtilKt.imgFormat(o0OOO0o.this.f31300OoooO00.getHeadphoto());
                oooO00o3.f48427OooO00o = 0;
                oooO00o3.OooO0o(oooO00o.f31305OooO0Oo);
            }
            oooO00o.f31306OooO0o.setVisibility(0);
            oooO00o.f31308OooO0oO.setVisibility(0);
            if (item.state == 1 && 1 == item.warestype) {
                oooO00o.f31308OooO0oO.setVisibility(8);
                oooO00o.f31310OooOO0.setVisibility(0);
                oooO00o.f31311OooOO0O.setVisibility(8);
            } else {
                oooO00o.f31308OooO0oO.getPaint().setFlags(16);
                oooO00o.f31308OooO0oO.setText(o0O0O00.OooO0Oo(item.price));
                Pair<Boolean, Integer> value = OooOOO.f41216OooO00o.OooOOO0().getValue();
                if (!value.getFirst().booleanValue() || value.getSecond().intValue() < PremiumLevel.Premium4.getValue()) {
                    oooO00o.f31309OooO0oo.setText(o0O0O00.OooO0Oo(item.promotionprice));
                    if (item.price.equals(item.promotionprice)) {
                        oooO00o.f31308OooO0oO.setVisibility(8);
                    }
                } else {
                    oooO00o.f31309OooO0oo.setText(o0O0O00.OooO0Oo(item.discountprice));
                }
            }
            if (((i + 1) * 2) % o0OOO0o.this.f31295Oooo == 0) {
                oooO00o.f31312OooOO0o.setVisibility(8);
            }
        } else if (o0OOO0o.this.f31299OoooO0 == 1) {
            oooO00o.f31301OooO.setVisibility(8);
        } else {
            oooO00o.f31301OooO.setVisibility(0);
        }
        return viewInflate;
    }
}
