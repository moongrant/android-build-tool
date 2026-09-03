package p474o0o00;

import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000o extends Lambda implements Function1<ApiResult<LoginListModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f47262OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(PasswordActivity passwordActivity) {
        super(1);
        this.f47262OooO0Oo = passwordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<LoginListModel> apiResult) {
        ApiResult<LoginListModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47262OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
