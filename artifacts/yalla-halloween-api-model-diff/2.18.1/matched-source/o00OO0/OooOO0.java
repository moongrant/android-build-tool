package o00OO0;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.app.base.model.RoomModel;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.data.db.model.RoomHistory;
import p168o00Ooo0.o0O0O00;
import p168o00Ooo0.oo000o;
import p391o0OOooOo.o0O00000;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends p188o00o00o0.OooO0OO<RoomHistory> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public EnterRoomParentPage f31181OooO00o;

    public OooOO0(Context context) {
        super(context, R.layout.item_room_base);
        new LongSparseArray();
    }

    public final void OooO00o(long j, String str, int i) {
        o0O00000.OooO0o0("Room_recently_room", o0O00000.OooO0O0(i));
        RoomModel roomModel = new RoomModel();
        roomModel.setId(j);
        roomModel.setRoomIp(str);
        RoomStateManager.INSTANCE.enterRoom(roomModel, this.f31181OooO00o);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        byte b;
        p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
        RoomHistory roomHistory = (RoomHistory) obj;
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0oo());
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(roomHistory.barimage, 0, 0);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.sdv_header));
        oooO0o.OooO0oO(R.id.iv_lock, !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(roomHistory.isencrypt));
        oooO0o.OooO0o(R.id.item_bg, roomHistory.istop > 0 ? R.drawable.shape_bg_item_room_top : R.drawable.shape_bg_item_room);
        oooO0o.OooO0oO(R.id.iv_honor, true);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) oooO0o.OooO0Oo(R.id.iv_honor);
        lottieAnimationView.OooO0Oo();
        String str = roomHistory.bartype;
        if (str != null) {
            switch (str) {
                case "2":
                    b = 0;
                    break;
                case "3":
                    b = 1;
                    break;
                case "4":
                    b = 2;
                    break;
                case "5":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                oooO0o.OooO0oo(R.id.iv_honor, R.drawable.room_princess_garden1);
            } else if (b == 1) {
                oooO0o.OooO0oo(R.id.iv_honor, R.drawable.room_dreamland1);
            } else if (b == 2) {
                oooO0o.OooO0oo(R.id.iv_honor, R.drawable.upgraderoom_crown_somall);
            } else if (b != 3) {
                oooO0o.OooO0oO(R.id.iv_honor, false);
            } else {
                lottieAnimationView.setAnimation("lottie/lottie_anim_upgraderoom_sky.json");
                lottieAnimationView.setRepeatCount(-1);
                lottieAnimationView.OooOO0();
            }
        }
        oooO0o.OooOO0(R.id.tv_room_name, roomHistory.barname);
        String str2 = roomHistory.countryid;
        if (str2 == null || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(str2)) {
            oooO0o.OooO0oO(R.id.sdv_country, false);
        } else {
            oooO0o.OooO0oO(R.id.sdv_country, true);
            oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this.mContext);
            oooO00o3.f48429OooO0OO = oo000o.OooO0OO(roomHistory.countryid);
            oooO00o3.f48427OooO00o = 0;
            oooO00o3.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.sdv_country));
        }
        if (com.yalla.support.common.util.OooO0OO.OooO00o(roomHistory.labelname)) {
            oooO0o.OooO0oO(R.id.tv_tag, false);
        } else {
            oooO0o.OooO0oO(R.id.tv_tag, true);
            oooO0o.OooOO0(R.id.tv_tag, o0O0O00.OooOO0(roomHistory.labelname.trim()));
        }
        oooO0o.OooOO0(R.id.tv_desc, com.yalla.support.common.util.OooO0OO.OooO00o(roomHistory.notice) ? "" : roomHistory.notice);
        oooO0o.OooO0oO(R.id.iv_official, roomHistory.isofficial == 1);
        oooO0o.OooO0Oo(R.id.item_bg).setOnClickListener(new OooO0o(this, roomHistory, oooO0o));
        oooO0o.OooO0oO(R.id.lav_live, false);
        oooO0o.OooO0oO(R.id.tv_online_num, false);
        ((UserMedalView) oooO0o.OooO0Oo(R.id.mv_medal)).OooO0O0(roomHistory.medal, (LifecycleOwner) getContext());
    }
}
