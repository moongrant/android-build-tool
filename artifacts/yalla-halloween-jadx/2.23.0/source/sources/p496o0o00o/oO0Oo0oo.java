package p496o0o00o;

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
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo extends Lambda implements Function1<ProfileLimitModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49172OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0oo(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49172OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProfileLimitModel profileLimitModel) {
        ProfileLimitModel profileLimitModel2 = profileLimitModel;
        int i = UserInfoEditActivity.f27283Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f49172OooO0Oo;
        userInfoEditActivity.OooOoO().f58077OooO0O0.setTextColor(o0000.OooO00o(oO00O0o.color_alpha_87));
        TextView textView = userInfoEditActivity.OooOoO().f58090OooOOOo;
        String str = userInfoEditActivity.f27302Oooo0OO;
        ViewLocation viewLocation = ViewLocation.end;
        oO000Oo.OooO0O0(textView, null, str, viewLocation, OooO.OooO0o0());
        if (profileLimitModel2 != null) {
            oO000Oo.OooO0O0(userInfoEditActivity.OooOoO().f58090OooOOOo, userInfoEditActivity.f27301Oooo0O0, userInfoEditActivity.f27302Oooo0OO, viewLocation, OooO.OooO0o0());
            if (profileLimitModel2.getExpireTime() <= 0 || profileLimitModel2.getExpireTime() >= System.currentTimeMillis()) {
                EditText editText = userInfoEditActivity.OooOoO().f58077OooO0O0;
                String string = userInfoEditActivity.getString(oO00OOo0.single_Yalla);
                UserInfoModel userInfoModel = userInfoEditActivity.f27295OooOooO;
                editText.setHint(string + (userInfoModel != null ? userInfoModel.getUserName() : null));
            } else {
                userInfoEditActivity.OooOoO().f58077OooO0O0.setTextColor(o0000.OooO00o(oO00O0o.color_CCCCCC));
            }
        }
        return Unit.INSTANCE;
    }
}
