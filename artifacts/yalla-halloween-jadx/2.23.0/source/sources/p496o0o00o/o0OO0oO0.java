package p496o0o00o;

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
import p156o00OoOO.OooOo;
import p157o00OoOO0.o0OO00O;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends Lambda implements Function2<Integer, OooOo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49098OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(UserInfoActivity userInfoActivity) {
        super(2);
        this.f49098OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, OooOo oooOo) {
        List<ProfileLimitModel> profileLimit;
        num.intValue();
        OooOo item = oooOo;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f38216OooO0Oo;
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.user_info_header_show_header));
        UserInfoActivity activity = this.f49098OooO0Oo;
        if (zAreEqual) {
            o0OO000.OooO00o("105065");
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            activity.Oooo0O0();
        } else {
            boolean z = false;
            ProfileLimitModel profileLimitModel = null;
            if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.user_info_header_change_header))) {
                o0OO000.OooO00o("105066");
                UserInfoModel userInfoModel = activity.f27246OooOo0o;
                if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
                    for (ProfileLimitModel profileLimitModel2 : profileLimit) {
                        if (profileLimitModel2.getOperationType() == 1) {
                            profileLimitModel = profileLimitModel2;
                            break;
                        }
                    }
                }
                if (profileLimitModel != null) {
                    String strOooO00o = o0000O.OooO00o(activity.getString(oO00OOo0.UserInfoEdit_ChangeLimit_HintContent_Header), String.valueOf(profileLimitModel.getBlockReason()));
                    if (profileLimitModel.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - profileLimitModel.getExpireTime() <= 0) {
                        strOooO00o = o0000O.OooO00o(o0000O.OooO00o(activity.getString(oO00OOo0.UserInfoEdit_ChangeLimit_HintContent_Header_Time), String.valueOf(profileLimitModel.getBlockReason())), o0000oo.OooO0Oo(profileLimitModel.getExpireTime(), System.currentTimeMillis()));
                        z = true;
                    }
                    o0OO00O o0oo00o2 = new o0OO00O(activity);
                    o0oo00o2.OooOo00(strOooO00o);
                    if (z) {
                        o0oo00o2.OooOOo0(true);
                    } else {
                        o0oo00o2.OooOo(true);
                        String string = activity.getString(oO00OOo0.CONTINUE_);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.CONTINUE_)");
                        o0oo00o2.OooOOOo(string);
                        o0oo00o2.OooOo0(new o0OO00OO(activity));
                    }
                    o0oo00o2.OooOO0o();
                } else {
                    activity.OooOoo0(0);
                }
            } else if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.user_info_header_url_change_type_default_url))) {
                o0OO000.OooO00o("105067");
                int i = UserDefaultHeadActivity.f27215OooOoO0;
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.startActivity(new Intent(activity, (Class<?>) UserDefaultHeadActivity.class));
            } else if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.user_info_header_select_header_frame))) {
                o0OO000.OooO00o("205011");
                oo0oOO0.OooO0o0(HeaderFrameScreen.INSTANCE, null, false, null, 14);
            }
        }
        return Unit.INSTANCE;
    }
}
