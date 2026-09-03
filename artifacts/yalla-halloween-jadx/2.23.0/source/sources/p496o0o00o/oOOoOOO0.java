package p496o0o00o;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.ui.activity.user.UserInfoEditActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOoOOO0 extends Lambda implements Function1<ApiResult<UserEditResult>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f49181OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f49181OooO0Oo = userInfoEditActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<UserEditResult> apiResult) {
        ApiResult<UserEditResult> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f49181OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
