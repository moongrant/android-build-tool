package p496o0o00o;

import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p466o0Oooo0o.oOO00O;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends Lambda implements Function1<Friend, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49071OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(UserInfoActivity userInfoActivity) {
        super(1);
        this.f49071OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Friend friend) {
        Friend friend2 = friend;
        UserInfoActivity userInfoActivity = this.f49071OooO0Oo;
        if (friend2 != null) {
            UserInfoModel userInfoModel = userInfoActivity.f27246OooOo0o;
            if (userInfoModel != null) {
                userInfoModel.setFriend(true);
            }
            oO000Oo.OooO00o(userInfoActivity.OooOooO().f58001OooOOO0, o0000.OooO0O0(oOo00OO0.icon_profile_delfriend), ViewLocation.top, OooO.OooO0o0());
            userInfoActivity.OooOooO().f58001OooOOO0.setText(o0000.OooO0OO(oO00OOo0.Friend));
            oOO00O ooo00o = userInfoActivity.f27260Oooo0o0;
            if (ooo00o != null) {
                Intrinsics.checkNotNull(ooo00o);
                ooo00o.OooO00o();
                userInfoActivity.f27260Oooo0o0 = null;
            }
        } else {
            UserInfoModel userInfoModel2 = userInfoActivity.f27246OooOo0o;
            if (userInfoModel2 != null) {
                userInfoModel2.setFriend(false);
            }
            oO000Oo.OooO00o(userInfoActivity.OooOooO().f58001OooOOO0, o0000.OooO0O0(oOo00OO0.icon_profile_addfriend), ViewLocation.top, OooO.OooO0o0());
            userInfoActivity.OooOooO().f58001OooOOO0.setText(o0000.OooO0OO(oO00OOo0.addfriend));
        }
        return Unit.INSTANCE;
    }
}
