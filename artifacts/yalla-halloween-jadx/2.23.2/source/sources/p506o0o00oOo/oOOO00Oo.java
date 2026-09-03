package p506o0o00oOo;

import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50537OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00Oo(UserInfoActivity userInfoActivity) {
        super(0);
        this.f50537OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity userInfoActivity = this.f50537OooO0Oo;
        UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        userInfoActivity.OooOooo().deleteFriend(userInfoModel.getUserId()).observe(userInfoActivity, new UserInfoActivity.OooOOO0(new oO(userInfoActivity)));
        return Unit.INSTANCE;
    }
}
