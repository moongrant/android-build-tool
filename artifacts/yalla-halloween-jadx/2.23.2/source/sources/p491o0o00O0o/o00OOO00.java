package p491o0o00O0o;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function1<ApiResult<Object>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f48991OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(PasswordActivity passwordActivity) {
        super(1);
        this.f48991OooO0Oo = passwordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Object> apiResult) {
        ApiResult<Object> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f48991OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
