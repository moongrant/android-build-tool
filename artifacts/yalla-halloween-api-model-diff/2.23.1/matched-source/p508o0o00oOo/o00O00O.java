package p508o0o00oOo;

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
import p184o00o00O0.OooO0OO;
import p370o0OOo0Oo.Oooo000;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0Oo0oo;
import p570o0oOo0o.o000O0;
import p596o0oo000O.OooO0o;
import p645o0ooOOO0.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends o000O0<RoomHistory> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public EnterRoomParentPage f50598OooOoo0;

    public o00O00O(FragmentActivity fragmentActivity) {
        super(fragmentActivity, o0OO00O.item_room_base);
        new LongSparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        RoomHistory roomHistory = (RoomHistory) obj;
        Context context = this.f56318OooOo;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
        oooO00o.OooO00o(o0O0O0Oo.OooO0o());
        oooO00o.f43127OooO0OO = OooO0OO.OooO0oo(0, 0, roomHistory.barimage);
        oooO00o.f43125OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0Oo0oo.sdv_header));
        viewHolder.setGone(o0Oo0oo.iv_lock, !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(roomHistory.isencrypt));
        int i = o0Oo0oo.item_bg;
        viewHolder.setBackgroundRes(i, roomHistory.istop > 0 ? o0OOO0o.shape_bg_item_room_top : o0OOO0o.shape_bg_item_room);
        int i2 = o0Oo0oo.iv_honor;
        viewHolder.setGone(i2, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewHolder.getView(i2);
        lottieAnimationView.OooO0OO();
        String str = roomHistory.bartype;
        if (str != null) {
            switch (str) {
                case "2":
                    viewHolder.setImageResource(i2, o0OOO0o.room_princess_garden1);
                    break;
                case "3":
                    viewHolder.setImageResource(i2, o0OOO0o.room_dreamland1);
                    break;
                case "4":
                    viewHolder.setImageResource(i2, o0OOO0o.upgraderoom_crown_somall);
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
        viewHolder.setText(o0Oo0oo.tv_room_name, roomHistory.barname);
        String str2 = roomHistory.countryid;
        if (str2 == null || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str2)) {
            viewHolder.setGone(o0Oo0oo.sdv_country, false);
        } else {
            int i3 = o0Oo0oo.sdv_country;
            viewHolder.setGone(i3, true);
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this.f13197OooOOOo);
            oooO00o2.f43127OooO0OO = OooO0o.OooO00o(roomHistory.countryid);
            oooO00o2.f43125OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i3));
        }
        if (OooOo00.OooO00o(roomHistory.labelname)) {
            viewHolder.setGone(o0Oo0oo.tv_tag, false);
        } else {
            int i4 = o0Oo0oo.tv_tag;
            viewHolder.setGone(i4, true);
            viewHolder.setText(i4, p595o0oo0.OooOo00.OooO(roomHistory.labelname.trim()));
        }
        viewHolder.setText(o0Oo0oo.tv_desc, OooOo00.OooO00o(roomHistory.notice) ? "" : roomHistory.notice);
        viewHolder.setGone(o0Oo0oo.iv_official, roomHistory.isofficial == 1);
        viewHolder.getView(i).setOnClickListener(new o00O00(this, viewHolder, roomHistory));
        viewHolder.setGone(o0Oo0oo.lav_live, false);
        viewHolder.setGone(o0Oo0oo.tv_online_num, false);
        ((UserMedalView) viewHolder.getView(o0Oo0oo.mv_medal)).OooO00o(roomHistory.medal, (LifecycleOwner) context);
    }
}
