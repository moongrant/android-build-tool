package p474o0o00;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o000O000;
import p420o0OoO0OO.o0OO00O;
import p507o0o00ooo.v0;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00o0 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f47330OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00o0(UntieAccountBindActivity untieAccountBindActivity) {
        super(3);
        this.f47330OooO0Oo = untieAccountBindActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        UntieAccountBindActivity untieAccountBindActivity = this.f47330OooO0Oo;
        untieAccountBindActivity.OooOo0();
        o0OO00O<ApiResult<Boolean>> o0oo00oUnbindAccount = ((AccountVM) untieAccountBindActivity.f25345OooOo00.getValue()).unbindAccount(type, accessToken, str2);
        v0.OooO0O0(o0oo00oUnbindAccount, (o0O0OOO0) untieAccountBindActivity.f22756OooOO0O.getValue(), false, 6);
        o000O000.OooO0Oo(o0oo00oUnbindAccount, untieAccountBindActivity, false, null, null, new o0OOooO0(untieAccountBindActivity), 14);
        return Unit.INSTANCE;
    }
}
