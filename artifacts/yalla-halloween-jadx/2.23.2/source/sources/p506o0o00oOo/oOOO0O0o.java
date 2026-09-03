package p506o0o00oOo;

import android.content.Intent;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.screen.user.HeaderFrameScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p202o00o0o.o00O0O;
import p205o00o0o0o.o000O;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0O0o extends Lambda implements Function2<Integer, o00O0O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50539OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0O0o(UserInfoActivity userInfoActivity) {
        super(2);
        this.f50539OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, o00O0O o00o0o2) {
        List<ProfileLimitModel> profileLimit;
        num.intValue();
        o00O0O item = o00o0o2;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f39340OooO0Oo;
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(o000000.user_info_header_show_header));
        UserInfoActivity activity = this.f50539OooO0Oo;
        if (zAreEqual) {
            OooO00o.OooO0O0("105065");
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            activity.Oooo0O0();
        } else {
            boolean z = false;
            ProfileLimitModel profileLimitModel = null;
            if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.user_info_header_change_header))) {
                OooO00o.OooO0O0("105066");
                UserInfoModel userInfoModel = activity.f26781OooOo0o;
                if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
                    for (ProfileLimitModel profileLimitModel2 : profileLimit) {
                        if (profileLimitModel2.getOperationType() == 1) {
                            profileLimitModel = profileLimitModel2;
                            break;
                        }
                    }
                }
                if (profileLimitModel != null) {
                    String strOooO00o = o0000O.OooO00o(activity.getString(o000000.UserInfoEdit_ChangeLimit_HintContent_Header), String.valueOf(profileLimitModel.getBlockReason()));
                    if (profileLimitModel.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - profileLimitModel.getExpireTime() <= 0) {
                        strOooO00o = o0000O.OooO00o(o0000O.OooO00o(activity.getString(o000000.UserInfoEdit_ChangeLimit_HintContent_Header_Time), String.valueOf(profileLimitModel.getBlockReason())), o0O0O0o0.OooO0Oo(profileLimitModel.getExpireTime(), System.currentTimeMillis()));
                        z = true;
                    }
                    o000O o000o = new o000O(activity);
                    o000o.OooOo00(strOooO00o);
                    if (z) {
                        o000o.OooOOo0(true);
                    } else {
                        o000o.OooOo(true);
                        String string = activity.getString(o000000.CONTINUE_);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        o000o.OooOOOo(string);
                        o000o.OooOo0(new oOO0OoO0(activity));
                    }
                    o000o.OooOO0o();
                } else {
                    activity.OooOoo0(0);
                }
            } else if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.user_info_header_url_change_type_default_url))) {
                OooO00o.OooO0O0("105067");
                int i = UserDefaultHeadActivity.f26750OooOoO0;
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.startActivity(new Intent(activity, (Class<?>) UserDefaultHeadActivity.class));
            } else if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.user_info_header_select_header_frame))) {
                OooO00o.OooO0O0("205011");
                o00O00.OooO0o0(HeaderFrameScreen.INSTANCE, null, false, null, 14);
            }
        }
        return Unit.INSTANCE;
    }
}
