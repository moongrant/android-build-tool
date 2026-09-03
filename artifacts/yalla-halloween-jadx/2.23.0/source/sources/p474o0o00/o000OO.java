package p474o0o00;

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
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47250OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(LoginActivity loginActivity) {
        super(3);
        this.f47250OooO0Oo = loginActivity;
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
        LoginActivity loginActivity = this.f47250OooO0Oo;
        BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, main, null, new o0000O00(loginActivity, null), 2, null);
        ((LoginVM) loginActivity.f25189OooOo00.getValue()).thirdLogin(accessToken, type, str2).observe(loginActivity, new o0000OO0(new o0000oo(loginActivity), new o0000O0(loginActivity), new o0000O0O(loginActivity), true));
        return Unit.INSTANCE;
    }
}
