package p500o0o00oO;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.OooOo00;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p543o0oO0O00.OooO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends o000O<RoomHistory> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public EnterRoomParentPage f49421OooOoo0;

    public o00000(FragmentActivity fragmentActivity) {
        super(fragmentActivity, oO00OO0O.item_room_base);
        new LongSparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        RoomHistory roomHistory = (RoomHistory) obj;
        Context context = this.f56196OooOo;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(context);
        oooO00o.OooO00o(OooO.OooO0o());
        oooO00o.f43911OooO0OO = OooO0o.OooO0oo(0, 0, roomHistory.barimage);
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.sdv_header));
        viewHolder.setGone(oO00O0oO.iv_lock, !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(roomHistory.isencrypt));
        int i = oO00O0oO.item_bg;
        viewHolder.setBackgroundRes(i, roomHistory.istop > 0 ? oOo00OO0.shape_bg_item_room_top : oOo00OO0.shape_bg_item_room);
        int i2 = oO00O0oO.iv_honor;
        viewHolder.setGone(i2, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewHolder.getView(i2);
        lottieAnimationView.OooO0OO();
        String str = roomHistory.bartype;
        if (str != null) {
            switch (str) {
                case "2":
                    viewHolder.setImageResource(i2, oOo00OO0.room_princess_garden1);
                    break;
                case "3":
                    viewHolder.setImageResource(i2, oOo00OO0.room_dreamland1);
                    break;
                case "4":
                    viewHolder.setImageResource(i2, oOo00OO0.upgraderoom_crown_somall);
                    break;
                case "5":
                    lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                    lottieAnimationView.setRepeatCount(-1);
                    lottieAnimationView.OooO0oO();
                    break;
                default:
                    viewHolder.setGone(i2, false);
                    break;
            }
        }
        viewHolder.setText(oO00O0oO.tv_room_name, roomHistory.barname);
        String str2 = roomHistory.countryid;
        if (str2 == null || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str2)) {
            viewHolder.setGone(oO00O0oO.sdv_country, false);
        } else {
            int i3 = oO00O0oO.sdv_country;
            viewHolder.setGone(i3, true);
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(this.f10108OooOOOo);
            oooO00o2.f43911OooO0OO = p591o0oo000O.OooO.OooO00o(roomHistory.countryid);
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i3));
        }
        if (OooOo00.OooO00o(roomHistory.labelname)) {
            viewHolder.setGone(oO00O0oO.tv_tag, false);
        } else {
            int i4 = oO00O0oO.tv_tag;
            viewHolder.setGone(i4, true);
            viewHolder.setText(i4, OooOOOO.OooO(roomHistory.labelname.trim()));
        }
        viewHolder.setText(oO00O0oO.tv_desc, OooOo00.OooO00o(roomHistory.notice) ? "" : roomHistory.notice);
        viewHolder.setGone(oO00O0oO.iv_official, roomHistory.isofficial == 1);
        viewHolder.getView(i).setOnClickListener(new o000000O(this, viewHolder, roomHistory));
        viewHolder.setGone(oO00O0oO.lav_live, false);
        viewHolder.setGone(oO00O0oO.tv_online_num, false);
        ((UserMedalView) viewHolder.getView(oO00O0oO.mv_medal)).OooO00o(roomHistory.medal, (LifecycleOwner) context);
    }
}
