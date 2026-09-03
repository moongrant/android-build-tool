package p507o0o00oo;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p595o0oo00O.OooOo00;
import p605o0oo0O0O.o0O0O0Oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends o0000oo<RoomHistory> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public EnterRoomParentPage f50617OooOoo0;

    public o00oO0o(FragmentActivity fragmentActivity) {
        super(fragmentActivity, oo0o0Oo.item_room_base);
        new LongSparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder viewHolder = (ViewHolder) baseViewHolder;
        RoomHistory roomHistory = (RoomHistory) obj;
        Context context = this.f56423OooOo;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
        oooO00o.OooO00o(d1.OooO0o());
        oooO00o.f43126OooO0OO = OooO0OO.OooO0oo(0, 0, roomHistory.barimage);
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo((ImageView) viewHolder.getView(o0OO00O.sdv_header));
        viewHolder.setGone(o0OO00O.iv_lock, !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(roomHistory.isencrypt));
        int i = o0OO00O.item_bg;
        viewHolder.setBackgroundRes(i, roomHistory.istop > 0 ? o0Oo0oo.shape_bg_item_room_top : o0Oo0oo.shape_bg_item_room);
        int i2 = o0OO00O.iv_honor;
        viewHolder.setGone(i2, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) viewHolder.getView(i2);
        lottieAnimationView.OooO0OO();
        String str = roomHistory.bartype;
        if (str != null) {
            switch (str) {
                case "2":
                    viewHolder.setImageResource(i2, o0Oo0oo.room_princess_garden1);
                    break;
                case "3":
                    viewHolder.setImageResource(i2, o0Oo0oo.room_dreamland1);
                    break;
                case "4":
                    viewHolder.setImageResource(i2, o0Oo0oo.upgraderoom_crown_somall);
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
        viewHolder.setText(o0OO00O.tv_room_name, roomHistory.barname);
        String str2 = roomHistory.countryid;
        if (str2 == null || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str2)) {
            viewHolder.setGone(o0OO00O.sdv_country, false);
        } else {
            int i3 = o0OO00O.sdv_country;
            viewHolder.setGone(i3, true);
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this.f13186OooOOOo);
            oooO00o2.f43126OooO0OO = OooOo00.OooO00o(roomHistory.countryid);
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo((ImageView) viewHolder.getView(i3));
        }
        if (com.code.android.util.OooOo00.OooO00o(roomHistory.labelname)) {
            viewHolder.setGone(o0OO00O.tv_tag, false);
        } else {
            int i4 = o0OO00O.tv_tag;
            viewHolder.setGone(i4, true);
            viewHolder.setText(i4, o0O0O0Oo.OooO(roomHistory.labelname.trim()));
        }
        viewHolder.setText(o0OO00O.tv_desc, com.code.android.util.OooOo00.OooO00o(roomHistory.notice) ? "" : roomHistory.notice);
        viewHolder.setGone(o0OO00O.iv_official, roomHistory.isofficial == 1);
        viewHolder.getView(i).setOnClickListener(new oo000o(this, viewHolder, roomHistory));
        viewHolder.setGone(o0OO00O.lav_live, false);
        viewHolder.setGone(o0OO00O.tv_online_num, false);
        ((UserMedalView) viewHolder.getView(o0OO00O.mv_medal)).OooO00o(roomHistory.medal, (LifecycleOwner) context);
    }
}
