package p566o0oOo00O;

import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o00000O0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45294Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(UserInfoActivity userInfoActivity) {
        super(0);
        this.f45294Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Me_profile_delete");
        UserInfoActivity userInfoActivity = this.f45294Oooo0o;
        UserInfoModel userInfoModel = userInfoActivity.f23457OooooOO;
        Intrinsics.checkNotNull(userInfoModel);
        userInfoActivity.Oooo0().deleteFriend(userInfoModel.getUserId()).observe(userInfoActivity, new o00000O0(userInfoActivity, 3));
        return Unit.INSTANCE;
    }
}
