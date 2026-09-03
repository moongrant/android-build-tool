package p133o00OO00o;

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
import com.app.base.model.SkillCardListModel;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends BaseAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f31255Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<SkillCardListModel.DataBean> f31256Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List<SkillCardListModel.DataBean> f31257Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Context f31258Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f31259OoooO00;

    public class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ImageView f31260OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public TextView f31261OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public TextView f31262OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public SVGAView f31263OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public NetImageView f31264OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public TextView f31265OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f31266OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public TextView f31267OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public TextView f31268OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public ImageView f31269OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public View f31270OooOO0O;

        public OooO00o() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    public Oooo000(Context context, List<SkillCardListModel.DataBean> list, int i, int i2, RoomUserInfoModel roomUserInfoModel) {
        this.f31259OoooO00 = "";
        this.f31258Oooo0oo = context;
        this.f31256Oooo0o = list;
        this.f31255Oooo = i2;
        this.f31259OoooO00 = roomUserInfoModel.getUserHeader();
        int i3 = i * i2;
        int i4 = i2 + i3;
        if (this.f31257Oooo0oO == null) {
            this.f31257Oooo0oO = new ArrayList();
        }
        while (i3 < i4) {
            this.f31257Oooo0oO.add(this.f31256Oooo0o.get(i3));
            i3++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public final SkillCardListModel.DataBean getItem(int i) {
        return (SkillCardListModel.DataBean) this.f31257Oooo0oO.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f31255Oooo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.SkillCardListModel$DataBean>] */
    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (TextUtils.isEmpty(((SkillCardListModel.DataBean) this.f31257Oooo0oO.get(i)).shopid)) {
            return 0L;
        }
        return Long.parseLong(((SkillCardListModel.DataBean) this.f31257Oooo0oO.get(i)).shopid);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        OooO00o oooO00o;
        if (view == null) {
            oooO00o = new OooO00o();
            viewInflate = LayoutInflater.from(this.f31258Oooo0oo).inflate(R.layout.item_room_wear_hats, viewGroup, false);
            oooO00o.f31261OooO00o = (TextView) viewInflate.findViewById(R.id.tv_item_wear_stock);
            oooO00o.f31262OooO0O0 = (TextView) viewInflate.findViewById(R.id.tvLimitTime);
            oooO00o.f31264OooO0Oo = (NetImageView) viewInflate.findViewById(R.id.iv_item_wear_avatar);
            oooO00o.f31263OooO0OO = (SVGAView) viewInflate.findViewById(R.id.iv_item_wear_icon);
            oooO00o.f31266OooO0o0 = (TextView) viewInflate.findViewById(R.id.tv_item_wear_current_price);
            oooO00o.f31268OooO0oo = (TextView) viewInflate.findViewById(R.id.tv_item_wear_sold_out);
            oooO00o.f31269OooOO0 = (ImageView) viewInflate.findViewById(R.id.ivType);
            oooO00o.f31265OooO0o = (TextView) viewInflate.findViewById(R.id.tv_item_wear_current_promotion_price);
            oooO00o.f31260OooO = (ImageView) viewInflate.findViewById(R.id.wearCoin);
            oooO00o.f31267OooO0oO = (TextView) viewInflate.findViewById(R.id.tv_item_wear_none);
            oooO00o.f31270OooOO0O = viewInflate.findViewById(R.id.view_item_wear_line_right);
            ((RelativeLayout) viewInflate.findViewById(R.id.rl_item_wear_selected)).setVisibility(8);
            viewInflate.setTag(oooO00o);
            if (oo000o.OooO0o0()) {
                oooO00o.f31269OooOO0.setRotationY(180.0f);
            } else {
                oooO00o.f31269OooOO0.setRotationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
        } else {
            viewInflate = view;
            oooO00o = (OooO00o) view.getTag();
        }
        SkillCardListModel.DataBean item = getItem(i);
        TextView textView = oooO00o.f31261OooO00o;
        if (textView != null) {
            textView.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            oooO00o.f31261OooO00o.setVisibility(8);
        }
        ImageView imageView = oooO00o.f31269OooOO0;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        TextView textView2 = oooO00o.f31261OooO00o;
        if (textView2 != null) {
            textView2.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            oooO00o.f31261OooO00o.setVisibility(8);
        }
        SVGAView sVGAView = oooO00o.f31263OooO0OO;
        if (sVGAView != null) {
            sVGAView.OooOO0(false);
            oooO00o.f31263OooO0OO.setImageDrawable(null);
            oooO00o.f31263OooO0OO.setVisibility(8);
        }
        TextView textView3 = oooO00o.f31266OooO0o0;
        if (textView3 != null) {
            textView3.setText("");
        }
        TextView textView4 = oooO00o.f31265OooO0o;
        if (textView4 != null) {
            textView4.setText("");
        }
        TextView textView5 = oooO00o.f31267OooO0oO;
        if (textView5 != null) {
            textView5.setVisibility(8);
        }
        if (item.warestype == 0) {
            oooO00o.f31267OooO0oO.setVisibility(8);
        } else {
            TextView textView6 = oooO00o.f31262OooO0O0;
            textView6.setVisibility(8);
            if (item.limitDay > 0) {
                textView6.setVisibility(0);
                textView6.setText(OooOo.OooO00o(Oooo000.this.f31258Oooo0oo.getString(R.string.wear_store_xxx_days), OooO.OooO0oo(Integer.valueOf(item.limitDay), "")));
            }
            if (item.lowestVIPLv > 0) {
                oooO00o.f31269OooOO0.setVisibility(0);
                oooO00o.f31269OooOO0.setImageResource(R.drawable.ic_hats_vip);
            } else if (item.activityType == 1) {
                oooO00o.f31269OooOO0.setVisibility(0);
                oooO00o.f31269OooOO0.setImageResource(R.drawable.ic_hats_treasure_chest);
            } else {
                oooO00o.f31269OooOO0.setVisibility(8);
            }
            oooO00o.f31261OooO00o.setText(item.num);
            oooO00o.f31261OooO00o.setVisibility(0);
            SVGAView sVGAView2 = oooO00o.f31263OooO0OO;
            sVGAView2.OooO0oo(CloudImageUtilKt.imgFormat(item.picurl), (FragmentActivity) Oooo000.this.f31258Oooo0oo);
            sVGAView2.OooO();
            oooO00o.f31263OooO0OO.setVisibility(0);
            oooO00o.f31264OooO0Oo.setVisibility(0);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(Oooo000.this.f31258Oooo0oo);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o2.f48441OooOOOo = 0;
            oooO00o2.f48431OooO0o = 0;
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(Oooo000.this.f31259OoooO00);
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o(oooO00o.f31264OooO0Oo);
            oooO00o.f31266OooO0o0.setVisibility(0);
            if (item.activityType != 0) {
                oooO00o.f31266OooO0o0.setVisibility(8);
                oooO00o.f31268OooO0oo.setVisibility(0);
                oooO00o.f31268OooO0oo.setText(R.string.Reward);
            } else if (item.state == 1) {
                oooO00o.f31266OooO0o0.setVisibility(8);
                oooO00o.f31268OooO0oo.setVisibility(0);
                oooO00o.f31268OooO0oo.setText(R.string.skillcard_room_soldout);
            } else {
                oooO00o.f31260OooO.setVisibility(0);
                oooO00o.f31266OooO0o0.getPaint().setFlags(16);
                oooO00o.f31266OooO0o0.setText(o0O0O00.OooO0Oo(item.price));
                Pair<Boolean, Integer> value = OooOOO.f41216OooO00o.OooOOO0().getValue();
                if (!value.getFirst().booleanValue() || value.getSecond().intValue() < PremiumLevel.Premium4.getValue()) {
                    oooO00o.f31265OooO0o.setText(o0O0O00.OooO0Oo(item.promotionprice));
                    if (item.price.equals(item.promotionprice)) {
                        oooO00o.f31266OooO0o0.setVisibility(8);
                    }
                } else {
                    oooO00o.f31265OooO0o.setText(o0O0O00.OooO0Oo(item.discountprice));
                }
            }
            if (((i + 1) * 2) % Oooo000.this.f31255Oooo == 0) {
                oooO00o.f31270OooOO0O.setVisibility(8);
            }
        }
        return viewInflate;
    }
}
