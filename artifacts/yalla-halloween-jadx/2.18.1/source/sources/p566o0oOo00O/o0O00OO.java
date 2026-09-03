package p566o0oOo00O;

import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f45297Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(UserInfoActivity userInfoActivity) {
        super(0);
        this.f45297Oooo0o = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity userInfoActivity = this.f45297Oooo0o;
        UserInfoModel userInfoModel = userInfoActivity.f23457OooooOO;
        Intrinsics.checkNotNull(userInfoModel);
        UserInfoActivity.OooOoo(userInfoActivity, !userInfoModel.getIsBlack());
        return Unit.INSTANCE;
    }
}
