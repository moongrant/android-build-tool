package p506o0o00oOo;

import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p473o0OoooOo.o0OOO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p573o0oOoOO.o0O0o0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO000o extends Lambda implements Function1<Friend, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50520OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000o(UserInfoActivity userInfoActivity) {
        super(1);
        this.f50520OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Friend friend) {
        Friend friend2 = friend;
        UserInfoActivity userInfoActivity = this.f50520OooO0Oo;
        if (friend2 != null) {
            UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
            if (userInfoModel != null) {
                userInfoModel.setFriend(true);
            }
            o0O0o0.OooO00o(userInfoActivity.OooOooO().f45630OooOOO0, o0000.OooO0O0(o0Oo0oo.icon_profile_delfriend), ViewLocation.top, OooOo00.OooO0o0());
            userInfoActivity.OooOooO().f45630OooOOO0.setText(o0000.OooO0OO(o000000.Friend));
            o0OOO0 o0ooo1 = userInfoActivity.f26795Oooo0o0;
            if (o0ooo1 != null) {
                Intrinsics.checkNotNull(o0ooo1);
                o0ooo1.OooO0O0();
                userInfoActivity.f26795Oooo0o0 = null;
            }
        } else {
            UserInfoModel userInfoModel2 = userInfoActivity.f26781OooOo0o;
            if (userInfoModel2 != null) {
                userInfoModel2.setFriend(false);
            }
            o0O0o0.OooO00o(userInfoActivity.OooOooO().f45630OooOOO0, o0000.OooO0O0(o0Oo0oo.icon_profile_addfriend), ViewLocation.top, OooOo00.OooO0o0());
            userInfoActivity.OooOooO().f45630OooOOO0.setText(o0000.OooO0OO(o000000.addfriend));
        }
        return Unit.INSTANCE;
    }
}
