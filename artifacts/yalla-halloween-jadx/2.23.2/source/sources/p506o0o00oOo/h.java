package p506o0o00oOo;

import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p475o0Ooooo0.o0O00oO0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Lambda implements Function1<ProfileLimitModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f50411OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f50411OooO0Oo = userInfoEditActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProfileLimitModel profileLimitModel) {
        ProfileLimitModel profileLimitModel2 = profileLimitModel;
        int i = UserInfoEditActivity.f26818Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f50411OooO0Oo;
        userInfoEditActivity.OooOoO().f45660OooO0o.setImageDrawable(userInfoEditActivity.f26835Oooo00o);
        userInfoEditActivity.OooOoO().f45661OooO0o0.setVisibility(8);
        if (profileLimitModel2 != null) {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(userInfoEditActivity);
            oooO00o.OooO00o(d1.OooO0OO());
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String str = (String) o0O00oO0.OooO().getValue();
            oooO00o.f43126OooO0OO = str != null ? OooO0OO.OooO0Oo(str) : null;
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(userInfoEditActivity.OooOoO().f45663OooO0oo);
            userInfoEditActivity.OooOoO().f45661OooO0o0.setVisibility(0);
            if (profileLimitModel2.getExpireTime() > 0 && profileLimitModel2.getExpireTime() < System.currentTimeMillis()) {
                userInfoEditActivity.OooOoO().f45660OooO0o.setImageDrawable(userInfoEditActivity.f26832Oooo0);
            }
        }
        return Unit.INSTANCE;
    }
}
