package p566o0oOo00O;

import android.content.Intent;
import com.app.base.model.ProfileLimitModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOOO0o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f45333Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f45333Oooo0o = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            UserInfoEditActivity userInfoEditActivity = this.f45333Oooo0o;
            ProfileLimitModel value = userInfoEditActivity.f23504o00O0O.getValue();
            if (value != null) {
                boolean z = false;
                String strOooO00o = OooOo.OooO00o(userInfoEditActivity.getString(R.string.UserInfoEdit_ChangeLimit_HintContent_Header), String.valueOf(value.getBlockReason()));
                if (value.getExpireTime() > 0 && (System.currentTimeMillis() / ((long) 1000)) - value.getExpireTime() <= 0) {
                    strOooO00o = OooOo.OooO00o(OooOo.OooO00o(userInfoEditActivity.getString(R.string.UserInfoEdit_ChangeLimit_HintContent_Header_Time), String.valueOf(value.getBlockReason())), o00O0.f48624OooO00o.OooO0Oo(value.getExpireTime(), System.currentTimeMillis()));
                    z = true;
                }
                oo0oOO0 oo0ooo0 = new oo0oOO0(userInfoEditActivity);
                oo0ooo0.OooOo0O(strOooO00o);
                if (z) {
                    oo0ooo0.OooOOo(true);
                } else {
                    oo0ooo0.OooOoOO(true);
                    String string = userInfoEditActivity.getString(R.string.Continue_);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Continue_)");
                    oo0ooo0.OooOOo0(string);
                    oo0ooo0.OooOo0o(new o0OO0o(userInfoEditActivity));
                }
                oo0ooo0.OooOOO0();
            } else {
                userInfoEditActivity.Oooo0OO();
            }
        } else if (iIntValue == 1) {
            o0O00000.OooO0OO("Me_profile_ChooseDefaultAvatar");
            UserDefaultHeadActivity.OooO00o oooO00o = UserDefaultHeadActivity.f23427Oooooo0;
            UserInfoEditActivity activity = this.f45333Oooo0o;
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivity(new Intent(activity, (Class<?>) UserDefaultHeadActivity.class));
        }
        return Unit.INSTANCE;
    }
}
