package p506o0o00oO0;

import com.app.base.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.common.model.ShareLogType;
import com.yalla.yalla.common.model.ShareModel;
import com.yalla.yalla.common.model.ShareToFriendModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.model.ShareWebModel;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.ShareActivityModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o000O00O;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShareModel f41644Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0O f41645Oooo0oO;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareType.values().length];
            iArr[ShareType.Room.ordinal()] = 1;
            iArr[ShareType.Web.ordinal()] = 2;
            iArr[ShareType.Events.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(ShareModel shareModel, oo0O oo0o) {
        super(0);
        this.f41644Oooo0o = shareModel;
        this.f41645Oooo0oO = oo0o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel event;
        int i = OooO00o.$EnumSwitchMapping$0[this.f41644Oooo0o.getType().ordinal()];
        boolean z = true;
        String string = null;
        if (i == 1) {
            RoomConfiguration roomConfiguration = o000O00O.OooO().f32427Oooo;
            string = roomConfiguration != null ? roomConfiguration.getBarid().toString() : null;
            o0O00000.OooO0OO("InRoom_share_friends");
            ShareToFriendsActivity.f22209o00o0O.OooO00o(this.f41645Oooo0oO.f41688OooO00o, new ShareToFriendModel(ShareType.Room));
        } else if (i == 2) {
            ShareWebModel web = this.f41644Oooo0o.getWeb();
            if (web != null) {
                oo0O oo0o = this.f41645Oooo0oO;
                ShareActivityModel shareActivityModel = new ShareActivityModel();
                String imagesUrl = web.getImagesUrl();
                if (imagesUrl == null) {
                    imagesUrl = "";
                }
                shareActivityModel.setImage1(imagesUrl);
                String imagesUrl2 = web.getImagesUrl();
                if (imagesUrl2 == null) {
                    imagesUrl2 = "";
                }
                shareActivityModel.setImage2(imagesUrl2);
                String title = web.getTitle();
                if (title == null) {
                    title = "";
                }
                shareActivityModel.setText1(title);
                String content = web.getContent();
                if (content == null) {
                    content = "";
                }
                shareActivityModel.setText2(content);
                String title2 = web.getTitle();
                if (title2 == null) {
                    title2 = "";
                }
                shareActivityModel.setText3(title2);
                String content2 = web.getContent();
                if (content2 == null) {
                    content2 = "";
                }
                shareActivityModel.setText4(content2);
                String url = web.getUrl();
                shareActivityModel.setUrl(url != null ? url : "");
                ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareType.Web);
                shareToFriendModel.setShareActivityModel(shareActivityModel);
                ShareToFriendsActivity.f22209o00o0O.OooO00o(oo0o.f41688OooO00o, shareToFriendModel);
            }
        } else if (i == 3 && (event = this.f41644Oooo0o.getEvent()) != null) {
            oo0O oo0o2 = this.f41645Oooo0oO;
            String strValueOf = String.valueOf(event.getId());
            ShareToFriendModel shareToFriendModel2 = new ShareToFriendModel(ShareType.Events);
            shareToFriendModel2.setEventModel(event);
            ShareToFriendsActivity.f22209o00o0O.OooO00o(oo0o2.f41688OooO00o, shareToFriendModel2);
            string = strValueOf;
        }
        if (string != null && string.length() != 0) {
            z = false;
        }
        if (!z) {
            this.f41645Oooo0oO.f41689OooO0O0.shareLog(this.f41644Oooo0o.getType(), String.valueOf(string), ShareLogType.Friend);
        }
        return Unit.INSTANCE;
    }
}
