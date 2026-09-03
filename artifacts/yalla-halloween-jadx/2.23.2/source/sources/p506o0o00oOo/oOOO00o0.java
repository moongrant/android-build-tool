package p506o0o00oOo;

import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50538OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00o0(UserInfoActivity userInfoActivity) {
        super(0);
        this.f50538OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity userInfoActivity = this.f50538OooO0Oo;
        UserInfoModel userInfoModel = userInfoActivity.f26781OooOo0o;
        Intrinsics.checkNotNull(userInfoModel);
        UserInfoActivity.OooOo(userInfoActivity, !userInfoModel.getIsBlack());
        return Unit.INSTANCE;
    }
}
