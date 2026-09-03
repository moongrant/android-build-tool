package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.AccountPrivacy;
import com.yalla.yalla.ui.activity.account.AccountActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 extends Lambda implements Function1<ApiResult<AccountPrivacy>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AccountActivity f43517Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(AccountActivity accountActivity) {
        super(1);
        this.f43517Oooo0o = accountActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<AccountPrivacy> apiResult) {
        ApiResult<AccountPrivacy> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43517Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
