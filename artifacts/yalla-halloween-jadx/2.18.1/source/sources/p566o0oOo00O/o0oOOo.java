package p566o0oOo00O;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.model.ShareToFriendModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOOo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f45345Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45346Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(ArrayList<String> arrayList, UserInfoActivity userInfoActivity) {
        super(1);
        this.f45345Oooo0o = arrayList;
        this.f45346Oooo0oO = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        String str = this.f45345Oooo0o.get(num.intValue());
        if (Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.User_Info_Menu_ramark))) {
            o0O00000.OooO0OO("Me_profile_note");
            UserInfoActivity userInfoActivity = this.f45346Oooo0oO;
            UserInfoModel userInfoModel = userInfoActivity.f23457OooooOO;
            if (userInfoModel != null) {
                UserInfoEditRemarkActivity.f23529OooooOO.OooO00o(userInfoActivity, userInfoModel);
            }
        } else if (Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.share))) {
            o0O00000.OooO0OO("Me_profile_Share");
            ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareType.User);
            shareToFriendModel.setUserInfoModel(this.f45346Oooo0oO.f23457OooooOO);
            ShareToFriendsActivity.f22209o00o0O.OooO00o(this.f45346Oooo0oO, shareToFriendModel);
        } else if (Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.report))) {
            OooOo.OooO0O0("105007");
            UserInfoActivity userInfoActivity2 = this.f45346Oooo0oO;
            String str2 = userInfoActivity2.f23456OooooO0;
            if (str2 != null) {
                o000O.OooO00o(u5.f47570OooO00o, u5.OooO0o(2, OooO.OooO0oO(str2), (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : Boolean.valueOf(userInfoActivity2.getIntent().getBooleanExtra("UserInfoActivityNew_From_Room_Page", false)), (52 & 32) != 0 ? null : null));
            }
        } else {
            if (Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.Unblock)) ? true : Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.Block))) {
                o0O00000.OooO0OO("Me_profile_block");
                UserInfoModel userInfoModel2 = this.f45346Oooo0oO.f23457OooooOO;
                Intrinsics.checkNotNull(userInfoModel2);
                if (userInfoModel2.getIsBlack()) {
                    UserInfoActivity userInfoActivity3 = this.f45346Oooo0oO;
                    UserInfoModel userInfoModel3 = userInfoActivity3.f23457OooooOO;
                    Intrinsics.checkNotNull(userInfoModel3);
                    UserInfoActivity.OooOoo(userInfoActivity3, !userInfoModel3.getIsBlack());
                } else {
                    OooOo.OooO0O0("105008");
                    UserInfoActivity userInfoActivity4 = this.f45346Oooo0oO;
                    String string = userInfoActivity4.getString(R.string.Add_Block_This_User_Title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Add_Block_This_User_Title)");
                    String string2 = userInfoActivity4.getString(R.string.Add_Block_This_User_Content);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Add_Block_This_User_Content)");
                    UserInfoModel userInfoModel4 = userInfoActivity4.f23457OooooOO;
                    Intrinsics.checkNotNull(userInfoModel4);
                    if (userInfoModel4.getIsBlack()) {
                        string2 = userInfoActivity4.getString(R.string.Unblock_this_user);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Unblock_this_user)");
                        string = "";
                    }
                    oo0oOO0 oo0ooo0 = new oo0oOO0(userInfoActivity4);
                    oo0ooo0.OooOooO(string);
                    oo0ooo0.OooOo0O(string2);
                    oo0ooo0.OooOOO().f34400OooO0o0.setMaxLines(12);
                    oo0ooo0.OooOoOO(true);
                    oo0ooo0.OooOo0o(new o0O00OO(userInfoActivity4));
                    oo0ooo0.OooOOO0();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
