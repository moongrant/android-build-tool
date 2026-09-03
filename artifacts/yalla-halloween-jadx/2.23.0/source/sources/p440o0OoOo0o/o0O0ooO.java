package p440o0OoOo0o;

import com.facebook.login.LoginManager;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager.AuthType f46167OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(OpenAuthManager.AuthType authType) {
        super(1);
        this.f46167OooO0Oo = authType;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.f46167OooO0Oo.getValue() == 4) {
            LoginManager.INSTANCE.getInstance().logOut();
        }
        return Unit.INSTANCE;
    }
}
