package p566o0oOo00O;

import android.content.Intent;
import com.app.base.model.ProfileLimitModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p251o00ooO.o000O00;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p584o0oOoo.o000O;
import p600o0oo00OO.o0000O;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00OOO extends Lambda implements Function2<Integer, o000O00, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45298Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(UserInfoActivity userInfoActivity) {
        super(2);
        this.f45298Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, o000O00 o000o01) {
        ProfileLimitModel next;
        List<ProfileLimitModel> profileLimit;
        num.intValue();
        o000O00 item = o000o01;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f34212Oooo0o;
        if (Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.user_info_header_show_header))) {
            o0O00000.OooO0OO("Me_profile_photo");
            UserInfoActivity userInfoActivity = this.f45298Oooo0o;
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
            userInfoActivity.Oooo0oo();
        } else if (Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.user_info_header_change_header))) {
            o0O00000.OooO0OO("Me_profile_photo_change");
            UserInfoActivity userInfoActivity2 = this.f45298Oooo0o;
            UserInfoModel userInfoModel = userInfoActivity2.f23457OooooOO;
            if (userInfoModel != null && (profileLimit = userInfoModel.getProfileLimit()) != null) {
                Iterator<ProfileLimitModel> it = profileLimit.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (next.getOperationType() != 1);
            } else {
                next = null;
                break;
            }
            boolean z = false;
            if (next != null) {
                String strOooO00o = OooOo.OooO00o(userInfoActivity2.getString(R.string.UserInfoEdit_ChangeLimit_HintContent_Header), String.valueOf(next.getBlockReason()));
                if (next.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - next.getExpireTime() <= 0) {
                    strOooO00o = OooOo.OooO00o(OooOo.OooO00o(userInfoActivity2.getString(R.string.UserInfoEdit_ChangeLimit_HintContent_Header_Time), String.valueOf(next.getBlockReason())), o00O0.f48624OooO00o.OooO0Oo(next.getExpireTime(), System.currentTimeMillis()));
                    z = true;
                }
                oo0oOO0 oo0ooo0 = new oo0oOO0(userInfoActivity2);
                oo0ooo0.OooOo0O(strOooO00o);
                if (z) {
                    oo0ooo0.OooOOo(true);
                } else {
                    oo0ooo0.OooOoOO(true);
                    String string = userInfoActivity2.getString(R.string.CONTINUE_);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.CONTINUE_)");
                    oo0ooo0.OooOOo0(string);
                    oo0ooo0.OooOo0o(new o0O000Oo(userInfoActivity2));
                }
                oo0ooo0.OooOOO0();
            } else {
                userInfoActivity2.f23471oo000o = 0;
                o0O0O00.OooO0OO(userInfoActivity2, oo0o0Oo.f48607OooO0O0, null, new o0oOO(userInfoActivity2));
            }
        } else if (Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.user_info_header_url_change_type_default_url))) {
            o0O00000.OooO0OO("Me_profile_ChooseDefaultAvatar");
            UserDefaultHeadActivity.OooO00o oooO00o2 = UserDefaultHeadActivity.f23427Oooooo0;
            UserInfoActivity activity = this.f45298Oooo0o;
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) UserDefaultHeadActivity.class));
        } else if (Intrinsics.areEqual(str, OooOOO.OooO0OO(R.string.user_info_header_select_header_frame))) {
            o0O00000.OooO0OO("Me_profile_frame");
            o000O.OooO00o(o0000O.f48009OooO00o, null);
        }
        return Unit.INSTANCE;
    }
}
