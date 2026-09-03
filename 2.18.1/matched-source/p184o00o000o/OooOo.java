package p184o00o000o;

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
import p147o00Oo00o.oo0o0Oo;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.o00O0O;
import p557o0oOOoOo.oO00O0o0;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends oo0o0Oo<GiftAnimationModel, View> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f33017OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public LinearLayout f33018OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public NetImageView f33019OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f33020OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public LinearLayout f33021OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public oO00O0o0 f33022OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public ImageView f33023OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public TextView f33024OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f33025OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f33026Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooO00o f33027Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f33028OooooO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public NetImageView f33029o000oOoO;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1500) {
                return;
            }
            if (OooOo.this.f33026Ooooo00 == ((Long) message.obj).longValue()) {
                OooOo.this.f33024OoooOoO.setVisibility(8);
            }
        }
    }

    public OooOo(Activity activity, int i) {
        super(activity, i);
        this.f33025OoooOoo = 0;
        this.f33026Ooooo00 = -1L;
        this.f33027Ooooo0o = new OooO00o();
        this.f33028OooooO0 = false;
    }

    @Override // p147o00Oo00o.oo0o0Oo
    public final void OooO0O0() {
        LinearLayout linearLayout = this.f33018OoooO0;
        if (linearLayout != null) {
            linearLayout.setBackgroundDrawable(null);
        }
        this.f33019OoooO0O.setImageDrawable(null);
        this.f33017OoooO.setText("");
        this.f33020OoooOO0.setText((CharSequence) null);
        this.f33029o000oOoO.setImageDrawable(null);
        this.f33020OoooOO0.setTextColor(this.f32162Oooo0oO.getResources().getColor(R.color.color_FAE976));
        this.f33024OoooOoO.setVisibility(8);
        this.f32161Oooo0o.setVisibility(8);
    }

    @Override // p147o00Oo00o.oo0o0Oo
    public final void OooO0OO() {
        this.f33018OoooO0 = (LinearLayout) OooO00o(R.id.item_room_gift_run_way_layout_content_layout);
        this.f33019OoooO0O = (NetImageView) OooO00o(R.id.item_room_gift_run_way_layout_from_head_iv);
        this.f33017OoooO = (TextView) OooO00o(R.id.item_room_gift_run_way_layout_from_user_tv);
        this.f33020OoooOO0 = (TextView) OooO00o(R.id.item_room_gift_run_way_layout_to_user_tv);
        this.f33029o000oOoO = (NetImageView) OooO00o(R.id.item_room_gift_run_way_layout_gift_iv);
        this.f33023OoooOo0 = (ImageView) OooO00o(R.id.iv_gift_bg);
        this.f33021OoooOOO = (LinearLayout) OooO00o(R.id.item_room_gift_run_way_layout_num_layout);
        this.f33024OoooOoO = (TextView) OooO00o(R.id.item_room_gift_run_way_layout_content_tips);
        int i = 0;
        this.f33019OoooO0O.setOnClickListener(new OooOOOO(this, i));
        this.f33029o000oOoO.setOnClickListener(new OooOo00(this, i));
        OooO0O0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33021OoooOOO.removeAllViews();
        Activity activity = this.f32162Oooo0oO;
        LinearLayout linearLayout = this.f33021OoooOOO;
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
        oO00O0o0 oo00o0o0 = this.f33022OoooOOo;
        if (oo00o0o0 != null) {
            this.f33021OoooOOO.startAnimation(oo00o0o0.f44674OooO0Oo);
        }
        try {
            Integer numValueOf = Integer.valueOf(str);
            GiftAnimationModel giftAnimationModel = (GiftAnimationModel) this.f32163Oooo0oo;
            if (giftAnimationModel == null || !giftAnimationModel.isLuckyflag() || OooO0OO.OooO00o(giftAnimationModel.luckyinstances)) {
                return;
            }
            int size = giftAnimationModel.luckyinstances.size();
            int i2 = this.f33025OoooOoo;
            if (size <= i2 || giftAnimationModel.luckyinstances.get(i2) == null || numValueOf.intValue() < giftAnimationModel.luckyinstances.get(this.f33025OoooOoo).getLnumtime()) {
                return;
            }
            LuckyInstancesModel luckyInstancesModel = giftAnimationModel.luckyinstances.get(this.f33025OoooOoo);
            String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.lucky_gift_runway_tips), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLmultiple() + "</b></font> "), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLreward() + "</b></font> ");
            this.f33020OoooOO0.setTextColor(this.f32162Oooo0oO.getResources().getColor(R.color.white));
            ImageView imageView2 = this.f33023OoooOo0;
            if (imageView2 != null && !this.f33028OooooO0) {
                this.f33028OooooO0 = true;
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setDuration(200L);
                imageView2.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new Oooo000(imageView2));
            }
            this.f33024OoooOoO.setVisibility(0);
            this.f33024OoooOoO.setText(Html.fromHtml(strOooO00o));
            this.f33025OoooOoo++;
            this.f33026Ooooo00++;
            Message message = new Message();
            message.what = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            message.obj = Long.valueOf(this.f33026Ooooo00);
            this.f33027Ooooo0o.sendMessageDelayed(message, 1500L);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0o0(GiftAnimationModel giftAnimationModel) {
        this.f32163Oooo0oo = giftAnimationModel;
        OooO0O0();
        if (giftAnimationModel == 0) {
            return;
        }
        o00O00.OooO0O0("setData data = " + giftAnimationModel);
        this.f32161Oooo0o.setVisibility(0);
        this.f33018OoooO0.setVisibility(0);
        oO00O0o0 oo00o0o0 = this.f33022OoooOOo;
        if (oo00o0o0 != null) {
            this.f33018OoooO0.startAnimation(oo00o0o0.f44672OooO0O0);
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f32162Oooo0oO);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(giftAnimationModel.giftUrl);
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f33029o000oOoO);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f32162Oooo0oO);
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(giftAnimationModel.fromUserHead, OooOo00.OooO00o(38), true);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(this.f33019OoooO0O);
        o00O0O o00o0o2 = o00O0O.f42677OooO00o;
        this.f33017OoooO.setText(o00o0o2.OooO0O0(Long.parseLong(giftAnimationModel.fromUserId), giftAnimationModel.fromUserName));
        this.f33020OoooOO0.setText(o00o0o2.OooO0O0(giftAnimationModel.toUserId.longValue(), giftAnimationModel.toUserName));
        this.f33020OoooOO0.setTextColor(OooOOO.OooO00o(R.color.color_FAE976));
        int i = giftAnimationModel.type;
        if (i == 7) {
            this.f33023OoooOo0.setImageResource(R.drawable.icon_send_all_run_gift_bg);
            return;
        }
        if (i == 8) {
            this.f33023OoooOo0.setImageResource(R.drawable.icon_send_all_run_gift_bg2);
        } else if (giftAnimationModel.giftType == GiftPropTypeTag.Blind.getValue()) {
            this.f33023OoooOo0.setImageResource(R.drawable.icon_send_all_run_gift_bg_blind);
        } else {
            this.f33023OoooOo0.setImageResource(R.drawable.bg_round_tr85);
        }
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
    }
}
