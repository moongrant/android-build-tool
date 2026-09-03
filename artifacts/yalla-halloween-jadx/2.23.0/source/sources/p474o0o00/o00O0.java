package p474o0o00;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.account.PasswordActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PasswordActivity f47258OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(PasswordActivity passwordActivity) {
        super(1);
        this.f47258OooO0Oo = passwordActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47258OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
