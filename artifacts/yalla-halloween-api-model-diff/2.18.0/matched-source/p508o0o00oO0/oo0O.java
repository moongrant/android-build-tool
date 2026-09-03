package p508o0o00oO0;

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
import p160o00OoOO.o000O00O;
import p393o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ShareModel f41707Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00OO f41708OoooO00;

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
    public oo0O(ShareModel shareModel, o00OO o00oo2) {
        super(0);
        this.f41707Oooo = shareModel;
        this.f41708OoooO00 = o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventModel event;
        int i = OooO00o.$EnumSwitchMapping$0[this.f41707Oooo.getType().ordinal()];
        boolean z = true;
        String string = null;
        if (i == 1) {
            RoomConfiguration roomConfiguration = o000O00O.OooO().f32453OoooO0O;
            string = roomConfiguration != null ? roomConfiguration.getBarid().toString() : null;
            o0O00000.OooO0OO("InRoom_share_friends");
            ShareToFriendsActivity.f22228o00oO0o.OooO00o(this.f41708OoooO00.f41640OooO00o, new ShareToFriendModel(ShareType.Room));
        } else if (i == 2) {
            ShareWebModel web = this.f41707Oooo.getWeb();
            if (web != null) {
                o00OO o00oo2 = this.f41708OoooO00;
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
                ShareToFriendsActivity.f22228o00oO0o.OooO00o(o00oo2.f41640OooO00o, shareToFriendModel);
            }
        } else if (i == 3 && (event = this.f41707Oooo.getEvent()) != null) {
            o00OO o00oo3 = this.f41708OoooO00;
            String strValueOf = String.valueOf(event.getId());
            ShareToFriendModel shareToFriendModel2 = new ShareToFriendModel(ShareType.Events);
            shareToFriendModel2.setEventModel(event);
            ShareToFriendsActivity.f22228o00oO0o.OooO00o(o00oo3.f41640OooO00o, shareToFriendModel2);
            string = strValueOf;
        }
        if (string != null && string.length() != 0) {
            z = false;
        }
        if (!z) {
            this.f41708OoooO00.f41641OooO0O0.shareLog(this.f41707Oooo.getType(), String.valueOf(string), ShareLogType.Friend);
        }
        return Unit.INSTANCE;
    }
}
