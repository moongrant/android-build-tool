package p599o0oo00O0;

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
import p391o0OOooOo.o0O00000;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p506o0o00oO0.o0O00o0;
import p559o0oOOoo0.o00OOO0;
import p559o0oOOoo0.oo0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f47933Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(Context context, LiveRoomVM liveRoomVM) {
        super(0);
        this.f47933Oooo0o = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0O oo0o;
        Context context = this.f47933Oooo0o;
        MixedRoomActivity mixedRoomActivity = context instanceof MixedRoomActivity ? (MixedRoomActivity) context : null;
        if (mixedRoomActivity != null && (oo0o = mixedRoomActivity.f11771Oooooo) != null) {
            if (OooO0OO.OooO00o().OooOo0O().OooO0O0(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue())).size() <= 0) {
                ApiUserFriendsUtils.getInstance().getUserFriends(1, 0L);
            }
            o0O00000.OooO0OO("InRoom_share");
            RoomConfiguration roomConfiguration = oo0o.f44850OooO0OO;
            if (roomConfiguration != null) {
                String notice = roomConfiguration.getNotice();
                if (TextUtils.isEmpty(notice)) {
                    String string = oo0o.f44849OooO0O0.getResources().getString(R.string.share_content_twitterOrWhatsApp);
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
                    sbOooO0o0.append(oo0o.f44850OooO0OO.getBaridx());
                    notice = OooOo.OooO00o(string, sbOooO0o0.toString());
                }
                String str = notice;
                ShareUrlModel shareUrlModelLoad = ApiRoomShareUtils.INSTANCE.getShareUrlModelLoad();
                String shareUrl = shareUrlModelLoad != null ? shareUrlModelLoad.getShareUrl() : "https://www.yalla.live/";
                if (oo0o.f44852OooO0o == null) {
                    oo0o.f44852OooO0o = new o0O00o0(oo0o.f44849OooO0O0, ShareType.Room);
                }
                ShareModel shareModel = new ShareModel(ShareType.Room);
                String barname = oo0o.f44850OooO0OO.getBarname();
                String barimage = oo0o.f44850OooO0OO.getBarimage();
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("");
                sbOooO0o1.append(oo0o.f44850OooO0OO.getBarid());
                shareModel.setRoom(new RoomShareModel(barname, str, shareUrl, barimage, sbOooO0o1.toString(), oo0o.f44850OooO0OO.getBaridx(), 1));
                o0O00o0 o0o00o1 = oo0o.f44852OooO0o;
                o0o00o1.f41672OoooOoo = shareModel;
                o0o00o1.f41671OoooOoO = true;
                o0o00o1.f41544Oooo0oO.setOnCancelListener(new o00OOO0());
                oo0o.f44852OooO0o.OooOO0();
            }
        }
        p606o0oo0O.OooOo.OooO0O0("102250");
        return Unit.INSTANCE;
    }
}
