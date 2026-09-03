package p445o0OoOoO0;

import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function1<ApiResult<AccountBindResult>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f47335OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(o0oOo0O0 o0ooo0o1) {
        super(1);
        this.f47335OooO0Oo = o0ooo0o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<AccountBindResult> apiResult) {
        ApiResult<AccountBindResult> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47335OooO0Oo.f56520OooO00o.f51734OooO00o.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
