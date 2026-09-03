package p185o00o000o;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.base.model.GiftAnimationModel;
import com.app.base.model.LuckyInstancesModel;
import com.google.android.gms.common.ConnectionResult;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.GiftPropTypeTag;
import com.yalla.yalla.util.netimage.NetImageView;
import p148o00Oo00o.oo0o0Oo;
import p517o0o0O00.o00O00;
import p522o0o0O0O0.o00Ooo;
import p559o0oOOoOo.oO0O0OoO;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends oo0o0Oo<GiftAnimationModel, View> {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public LinearLayout f33040OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f33041OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public TextView f33042OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public NetImageView f33043OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public LinearLayout f33044OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public oO0O0OoO f33045OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ImageView f33046Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public TextView f33047Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f33048OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public long f33049OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public OooO00o f33050OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f33051Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public NetImageView f33052o000oOoO;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1500) {
                return;
            }
            if (OooOo.this.f33049OooooOO == ((Long) message.obj).longValue()) {
                OooOo.this.f33047Ooooo0o.setVisibility(8);
            }
        }
    }

    public OooOo(Activity activity, int i) {
        super(activity, i);
        this.f33048OooooO0 = 0;
        this.f33049OooooOO = -1L;
        this.f33050OooooOo = new OooO00o();
        this.f33051Oooooo0 = false;
    }

    @Override // p148o00Oo00o.oo0o0Oo
    public final void OooO0O0() {
        LinearLayout linearLayout = this.f33040OoooOO0;
        if (linearLayout != null) {
            linearLayout.setBackgroundDrawable(null);
        }
        this.f33052o000oOoO.setImageDrawable(null);
        this.f33041OoooOOO.setText("");
        this.f33042OoooOOo.setText((CharSequence) null);
        this.f33043OoooOo0.setImageDrawable(null);
        this.f33042OoooOOo.setTextColor(this.f32184OoooO00.getResources().getColor(R.color.color_FAE976));
        this.f33047Ooooo0o.setVisibility(8);
        this.f32181Oooo.setVisibility(8);
    }

    @Override // p148o00Oo00o.oo0o0Oo
    public final void OooO0OO() {
        this.f33040OoooOO0 = (LinearLayout) OooO00o(R.id.item_room_gift_run_way_layout_content_layout);
        this.f33052o000oOoO = (NetImageView) OooO00o(R.id.item_room_gift_run_way_layout_from_head_iv);
        this.f33041OoooOOO = (TextView) OooO00o(R.id.item_room_gift_run_way_layout_from_user_tv);
        this.f33042OoooOOo = (TextView) OooO00o(R.id.item_room_gift_run_way_layout_to_user_tv);
        this.f33043OoooOo0 = (NetImageView) OooO00o(R.id.item_room_gift_run_way_layout_gift_iv);
        this.f33046Ooooo00 = (ImageView) OooO00o(R.id.iv_gift_bg);
        this.f33044OoooOoO = (LinearLayout) OooO00o(R.id.item_room_gift_run_way_layout_num_layout);
        this.f33047Ooooo0o = (TextView) OooO00o(R.id.item_room_gift_run_way_layout_content_tips);
        int i = 0;
        this.f33052o000oOoO.setOnClickListener(new OooOOOO(this, i));
        this.f33043OoooOo0.setOnClickListener(new OooOo00(this, i));
        OooO0O0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33044OoooOoO.removeAllViews();
        Activity activity = this.f32184OoooO00;
        LinearLayout linearLayout = this.f33044OoooOoO;
        if (!TextUtils.isEmpty(str)) {
            for (char c : str.toCharArray()) {
                ImageView imageView = new ImageView(activity);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
                String str2 = c + "";
                int i = R.drawable.icon_number_1;
                try {
                    int iIntValue = Integer.valueOf(str2).intValue();
                    if (iIntValue != 0) {
                        switch (iIntValue) {
                            case 2:
                                i = R.drawable.icon_number_2;
                                break;
                            case 3:
                                i = R.drawable.icon_number_3;
                                break;
                            case 4:
                                i = R.drawable.icon_number_4;
                                break;
                            case 5:
                                i = R.drawable.icon_number_5;
                                break;
                            case 6:
                                i = R.drawable.icon_number_6;
                                break;
                            case 7:
                                i = R.drawable.icon_number_7;
                                break;
                            case 8:
                                i = R.drawable.icon_number_8;
                                break;
                            case 9:
                                i = R.drawable.icon_number_9;
                                break;
                        }
                    } else {
                        i = R.drawable.icon_number_0;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                imageView.setImageResource(i);
                linearLayout.addView(imageView);
            }
        }
        oO0O0OoO oo0o0ooo = this.f33045OoooOoo;
        if (oo0o0ooo != null) {
            this.f33044OoooOoO.startAnimation(oo0o0ooo.f44691OooO0Oo);
        }
        try {
            Integer numValueOf = Integer.valueOf(str);
            GiftAnimationModel giftAnimationModel = (GiftAnimationModel) this.f32183OoooO0;
            if (giftAnimationModel == null || !giftAnimationModel.isLuckyflag() || OooO0OO.OooO00o(giftAnimationModel.luckyinstances)) {
                return;
            }
            int size = giftAnimationModel.luckyinstances.size();
            int i2 = this.f33048OooooO0;
            if (size <= i2 || giftAnimationModel.luckyinstances.get(i2) == null || numValueOf.intValue() < giftAnimationModel.luckyinstances.get(this.f33048OooooO0).getLnumtime()) {
                return;
            }
            LuckyInstancesModel luckyInstancesModel = giftAnimationModel.luckyinstances.get(this.f33048OooooO0);
            String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.lucky_gift_runway_tips), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLmultiple() + "</b></font> "), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLreward() + "</b></font> ");
            this.f33042OoooOOo.setTextColor(this.f32184OoooO00.getResources().getColor(R.color.white));
            ImageView imageView2 = this.f33046Ooooo00;
            if (imageView2 != null && !this.f33051Oooooo0) {
                this.f33051Oooooo0 = true;
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration(200L);
                imageView2.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new Oooo000(imageView2));
            }
            this.f33047Ooooo0o.setVisibility(0);
            this.f33047Ooooo0o.setText(Html.fromHtml(strOooO00o));
            this.f33048OooooO0++;
            this.f33049OooooOO++;
            Message message = new Message();
            message.what = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            message.obj = Long.valueOf(this.f33049OooooOO);
            this.f33050OooooOo.sendMessageDelayed(message, 1500L);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(GiftAnimationModel giftAnimationModel) {
        this.f32183OoooO0 = giftAnimationModel;
        OooO0O0();
        if (giftAnimationModel == 0) {
            return;
        }
        o00O00.OooO0O0("setData data = " + giftAnimationModel);
        this.f32181Oooo.setVisibility(0);
        this.f33040OoooOO0.setVisibility(0);
        oO0O0OoO oo0o0ooo = this.f33045OoooOoo;
        if (oo0o0ooo != null) {
            this.f33040OoooOO0.startAnimation(oo0o0ooo.f44689OooO0O0);
        }
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(this.f32184OoooO00);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o.f48447OooO0OO = CloudImageUtilKt.imgFormat(giftAnimationModel.giftUrl);
        oooO00o.f48445OooO00o = 0;
        oooO00o.OooO0o(this.f33043OoooOo0);
        oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this.f32184OoooO00);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgSize(giftAnimationModel.fromUserHead, OooOo00.OooO00o(38), true);
        oooO00o2.f48445OooO00o = 0;
        oooO00o2.OooO0o(this.f33052o000oOoO);
        o00Ooo o00ooo2 = o00Ooo.f42780OooO00o;
        this.f33041OoooOOO.setText(o00ooo2.OooO0O0(Long.parseLong(giftAnimationModel.fromUserId), giftAnimationModel.fromUserName));
        this.f33042OoooOOo.setText(o00ooo2.OooO0O0(giftAnimationModel.toUserId.longValue(), giftAnimationModel.toUserName));
        this.f33042OoooOOo.setTextColor(OooOOO.OooO00o(R.color.color_FAE976));
        int i = giftAnimationModel.type;
        if (i == 7) {
            this.f33046Ooooo00.setImageResource(R.drawable.icon_send_all_run_gift_bg);
            return;
        }
        if (i == 8) {
            this.f33046Ooooo00.setImageResource(R.drawable.icon_send_all_run_gift_bg2);
        } else if (giftAnimationModel.giftType == GiftPropTypeTag.Blind.getValue()) {
            this.f33046Ooooo00.setImageResource(R.drawable.icon_send_all_run_gift_bg_blind);
        } else {
            this.f33046Ooooo00.setImageResource(R.drawable.bg_round_tr85);
        }
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
    }
}
