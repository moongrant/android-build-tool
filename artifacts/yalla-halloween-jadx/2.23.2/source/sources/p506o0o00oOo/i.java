package p506o0o00oOo;

import android.widget.EditText;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p573o0oOoOO.o0O0o0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends Lambda implements Function1<ProfileLimitModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50414OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f50414OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProfileLimitModel profileLimitModel) {
        ProfileLimitModel profileLimitModel2 = profileLimitModel;
        int i = UserInfoEditActivity.f26818Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f50414OooO0Oo;
        userInfoEditActivity.OooOoO().f45657OooO0O0.setTextColor(o0000.OooO00o(o0OOO0o.color_alpha_87));
        TextView textView = userInfoEditActivity.OooOoO().f45670OooOOOo;
        String str = userInfoEditActivity.f26837Oooo0OO;
        ViewLocation viewLocation = ViewLocation.end;
        o0O0o0.OooO0O0(textView, null, str, viewLocation, OooOo00.OooO0o0());
        if (profileLimitModel2 != null) {
            o0O0o0.OooO0O0(userInfoEditActivity.OooOoO().f45670OooOOOo, userInfoEditActivity.f26836Oooo0O0, userInfoEditActivity.f26837Oooo0OO, viewLocation, OooOo00.OooO0o0());
            if (profileLimitModel2.getExpireTime() <= 0 || profileLimitModel2.getExpireTime() >= System.currentTimeMillis()) {
                EditText editText = userInfoEditActivity.OooOoO().f45657OooO0O0;
                String string = userInfoEditActivity.getString(o000000.single_Yalla);
                UserInfoModel userInfoModel = userInfoEditActivity.f26830OooOooO;
                editText.setHint(string + (userInfoModel != null ? userInfoModel.getUserName() : null));
            } else {
                userInfoEditActivity.OooOoO().f45657OooO0O0.setTextColor(o0000.OooO00o(o0OOO0o.color_CCCCCC));
            }
        }
        return Unit.INSTANCE;
    }
}
