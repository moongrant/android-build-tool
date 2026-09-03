package p491o0o00O0o;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000o extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f48973OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(LoginActivity loginActivity) {
        super(3);
        this.f48973OooO0Oo = loginActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        CoroutineScope coroutineScopeMainScope = CoroutineScopeKt.MainScope();
        MainCoroutineDispatcher main = Dispatchers.getMain();
        LoginActivity loginActivity = this.f48973OooO0Oo;
        BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, main, null, new o00O0000(loginActivity, null), 2, null);
        ((LoginVM) loginActivity.f24730OooOo00.getValue()).thirdLogin(accessToken, type, str2).observe(loginActivity, new o000oOoO(new o0O0ooO(loginActivity), new o00oOoo(loginActivity), new o00O000(loginActivity), true));
        return Unit.INSTANCE;
    }
}
