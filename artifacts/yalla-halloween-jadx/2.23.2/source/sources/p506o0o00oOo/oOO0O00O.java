package p506o0o00oOo;

import android.content.Intent;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareToFriendModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditRemarkActivity;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p205o00o0o0o.o000O;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O00O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f50525OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50526OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O00O(ArrayList<String> arrayList, UserInfoActivity userInfoActivity) {
        super(1);
        this.f50525OooO0Oo = arrayList;
        this.f50526OooO0o0 = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        String str = this.f50525OooO0Oo.get(num.intValue());
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(o000000.User_Info_Menu_ramark));
        UserInfoActivity context = this.f50526OooO0o0;
        if (zAreEqual) {
            OooO00o.OooO0O0("105089");
            UserInfoModel userInfo = context.f26781OooOo0o;
            if (userInfo != null) {
                int i = UserInfoEditRemarkActivity.f26858OooOo0o;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                Intent intent = new Intent(context, (Class<?>) UserInfoEditRemarkActivity.class);
                intent.putExtra("user", userInfo);
                context.startActivity(intent);
            }
        } else if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.share))) {
            OooO00o.OooO0O0("105090");
            ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.User);
            shareToFriendModel.setUserInfoModel(context.f26781OooOo0o);
            int i2 = ShareToFriendsActivity.f25275Oooo00o;
            ShareToFriendsActivity.OooO00o.OooO00o(context, shareToFriendModel);
        } else if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Report))) {
            OooO00o.OooO0O0("105007");
            String str2 = context.f26780OooOo0O;
            if (str2 != null) {
                o00O00.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(2, o0OoOo0.OooO(0L, str2), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : Boolean.valueOf(context.getIntent().getBooleanExtra("UserInfoActivityNew_From_Room_Page", false)), (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            }
        } else {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Unblock)) ? true : Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Block))) {
                OooO00o.OooO0O0("105088");
                UserInfoModel userInfoModel = context.f26781OooOo0o;
                Intrinsics.checkNotNull(userInfoModel);
                if (userInfoModel.getIsBlack()) {
                    UserInfoModel userInfoModel2 = context.f26781OooOo0o;
                    Intrinsics.checkNotNull(userInfoModel2);
                    UserInfoActivity.OooOo(context, !userInfoModel2.getIsBlack());
                } else {
                    OooO00o.OooO0O0("105008");
                    String string = context.getString(o000000.Add_Block_This_User_Title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = context.getString(o000000.Add_Block_This_User_Content);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    UserInfoModel userInfoModel3 = context.f26781OooOo0o;
                    Intrinsics.checkNotNull(userInfoModel3);
                    if (userInfoModel3.getIsBlack()) {
                        string2 = context.getString(o000000.Unblock_this_user);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        string = "";
                    }
                    o000O o000o = new o000O(context);
                    o000o.OooOoO(string);
                    o000o.OooOo00(string2);
                    o000o.OooOOO0().f39392OooO0o0.setMaxLines(12);
                    o000o.OooOo(true);
                    o000o.OooOo0(new oOOO00o0(context));
                    o000o.OooOO0o();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
