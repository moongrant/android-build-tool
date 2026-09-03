package p496o0o00o;

import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p464o0Oooo.o000000O;
import p543o0oO0O00.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OoOO0 extends Lambda implements Function1<ProfileLimitModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49173OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49173OooO0Oo = userInfoEditActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProfileLimitModel profileLimitModel) {
        ProfileLimitModel profileLimitModel2 = profileLimitModel;
        int i = UserInfoEditActivity.f27283Oooo0oO;
        UserInfoEditActivity userInfoEditActivity = this.f49173OooO0Oo;
        userInfoEditActivity.OooOoO().f58080OooO0o.setImageDrawable(userInfoEditActivity.f27300Oooo00o);
        userInfoEditActivity.OooOoO().f58081OooO0o0.setVisibility(8);
        if (profileLimitModel2 != null) {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(userInfoEditActivity);
            oooO00o.OooO00o(OooO.OooO0OO());
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String str = (String) o000000O.OooO().getValue();
            oooO00o.f43911OooO0OO = str != null ? OooO0o.OooO0Oo(str) : null;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(userInfoEditActivity.OooOoO().f58083OooO0oo);
            userInfoEditActivity.OooOoO().f58081OooO0o0.setVisibility(0);
            if (profileLimitModel2.getExpireTime() > 0 && profileLimitModel2.getExpireTime() < System.currentTimeMillis()) {
                userInfoEditActivity.OooOoO().f58080OooO0o.setImageDrawable(userInfoEditActivity.f27297Oooo0);
            }
        }
        return Unit.INSTANCE;
    }
}
