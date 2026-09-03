package p601o0oo00O0;

import OooO00o.OooO00o;
import android.content.Context;
import android.text.TextUtils;
import com.app.base.app.appConfig.apiDataModela.ApiRoomShareUtils;
import com.app.base.app.appConfig.apiDataModela.ApiUserFriendsUtils;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.ShareUrlModel;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p393o0OOooOo.o0O00000;
import p493o0o00O00.OooO0OO;
import p500o0o00Oo0.OooOOO;
import p508o0o00oO0.oo00oO;
import p561o0oOOoo0.o00OOO0;
import p561o0oOOoo0.oo0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Context f47941Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(Context context, LiveRoomVM liveRoomVM) {
        super(0);
        this.f47941Oooo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o;
        Context context = this.f47941Oooo;
        MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
        if (mixedRoomActivity != null && (oo0o = mixedRoomActivity.f11812o0OoOo0) != null) {
            if (OooO0OO.OooO00o().OooOo0O().OooO0O0(String.valueOf(OooOOO.f41235OooO00o.OooOo().getValue())).size() <= 0) {
                ApiUserFriendsUtils.getInstance().getUserFriends(1, 0L);
            }
            o0O00000.OooO0OO("InRoom_share");
            RoomConfiguration roomConfiguration = oo0o.f44866OooO0OO;
            if (roomConfiguration != null) {
                String notice = roomConfiguration.getNotice();
                if (TextUtils.isEmpty(notice)) {
                    String string = oo0o.f44865OooO0O0.getResources().getString(R.string.share_content_twitterOrWhatsApp);
                    StringBuilder sbOooO0O0 = OooO00o.OooO0O0("");
                    sbOooO0O0.append(oo0o.f44866OooO0OO.getBaridx());
                    notice = OooOo.OooO00o(string, sbOooO0O0.toString());
                }
                String str = notice;
                ShareUrlModel shareUrlModelLoad = ApiRoomShareUtils.INSTANCE.getShareUrlModelLoad();
                String shareUrl = shareUrlModelLoad != null ? shareUrlModelLoad.getShareUrl() : "https://www.yalla.live/";
                if (oo0o.f44868OooO0o == null) {
                    oo0o.f44868OooO0o = new oo00oO(oo0o.f44865OooO0O0, ShareType.Room);
                }
                ShareModel shareModel = new ShareModel(ShareType.Room);
                String barname = oo0o.f44866OooO0OO.getBarname();
                String barimage = oo0o.f44866OooO0OO.getBarimage();
                StringBuilder sbOooO0O1 = OooO00o.OooO0O0("");
                sbOooO0O1.append(oo0o.f44866OooO0OO.getBarid());
                shareModel.setRoom(new RoomShareModel(barname, str, shareUrl, barimage, sbOooO0O1.toString(), oo0o.f44866OooO0OO.getBaridx(), 1));
                oo00oO oo00oo = oo0o.f44868OooO0o;
                oo00oo.f41705OooooO0 = shareModel;
                oo00oo.f41704Ooooo0o = true;
                oo00oo.f41564OoooO00.setOnCancelListener(new o00OOO0());
                oo0o.f44868OooO0o.OooOO0();
            }
        }
        p608o0oo0O.OooOo.OooO0O0("102250");
        return Unit.INSTANCE;
    }
}
