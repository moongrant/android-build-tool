package p534o0o0OOo0;

import androidx.lifecycle.LiveData;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.account.LoginVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o0o0000.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00O extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f43546Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O(LoginActivity loginActivity) {
        super(3);
        this.f43546Oooo0o = loginActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0O000o0(this.f43546Oooo0o, null), 2, null);
        LiveData<ApiResult<LoginListModel>> liveDataThirdLogin = ((LoginVM) this.f43546Oooo0o.f21754Ooooo00.getValue()).thirdLogin(accessToken, type, str2);
        LoginActivity loginActivity = this.f43546Oooo0o;
        liveDataThirdLogin.observe(loginActivity, new OooOo(new o0O00(loginActivity), new o0OoO00O(this.f43546Oooo0o), new o0O00O0o(this.f43546Oooo0o), true));
        return Unit.INSTANCE;
    }
}
