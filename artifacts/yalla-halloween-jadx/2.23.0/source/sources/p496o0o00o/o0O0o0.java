package p496o0o00o;

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
import p157o00OoOO0.o0OO00O;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f49080OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49081OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(ArrayList<String> arrayList, UserInfoActivity userInfoActivity) {
        super(1);
        this.f49080OooO0Oo = arrayList;
        this.f49081OooO0o0 = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        String str = this.f49080OooO0Oo.get(num.intValue());
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.User_Info_Menu_ramark));
        UserInfoActivity context = this.f49081OooO0o0;
        if (zAreEqual) {
            o0OO000.OooO00o("105089");
            UserInfoModel userInfo = context.f27246OooOo0o;
            if (userInfo != null) {
                int i = UserInfoEditRemarkActivity.f27323OooOo0o;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(userInfo, "userInfo");
                Intent intent = new Intent(context, (Class<?>) UserInfoEditRemarkActivity.class);
                intent.putExtra("user", userInfo);
                context.startActivity(intent);
            }
        } else if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.share))) {
            o0OO000.OooO00o("105090");
            ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.User);
            shareToFriendModel.setUserInfoModel(context.f27246OooOo0o);
            int i2 = ShareToFriendsActivity.f25730Oooo00o;
            ShareToFriendsActivity.OooO00o.OooO00o(context, shareToFriendModel);
        } else if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Report))) {
            o0OO000.OooO00o("105007");
            String str2 = context.f27245OooOo0O;
            if (str2 != null) {
                oo0oOO0.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(2, o0OoOo0.OooO(0L, str2), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : Boolean.valueOf(context.getIntent().getBooleanExtra("UserInfoActivityNew_From_Room_Page", false)), (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            }
        } else {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Unblock)) ? true : Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Block))) {
                o0OO000.OooO00o("105088");
                UserInfoModel userInfoModel = context.f27246OooOo0o;
                Intrinsics.checkNotNull(userInfoModel);
                if (userInfoModel.getIsBlack()) {
                    UserInfoModel userInfoModel2 = context.f27246OooOo0o;
                    Intrinsics.checkNotNull(userInfoModel2);
                    UserInfoActivity.OooOo(context, !userInfoModel2.getIsBlack());
                } else {
                    o0OO000.OooO00o("105008");
                    String string = context.getString(oO00OOo0.Add_Block_This_User_Title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Add_Block_This_User_Title)");
                    String string2 = context.getString(oO00OOo0.Add_Block_This_User_Content);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Add_Block_This_User_Content)");
                    UserInfoModel userInfoModel3 = context.f27246OooOo0o;
                    Intrinsics.checkNotNull(userInfoModel3);
                    if (userInfoModel3.getIsBlack()) {
                        string2 = context.getString(oO00OOo0.Unblock_this_user);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Unblock_this_user)");
                        string = "";
                    }
                    o0OO00O o0oo00o2 = new o0OO00O(context);
                    o0oo00o2.OooOoO(string);
                    o0oo00o2.OooOo00(string2);
                    o0oo00o2.OooOOO0().f38476OooO0o0.setMaxLines(12);
                    o0oo00o2.OooOo(true);
                    o0oo00o2.OooOo0(new o0OO0o(context));
                    o0oo00o2.OooOO0o();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
