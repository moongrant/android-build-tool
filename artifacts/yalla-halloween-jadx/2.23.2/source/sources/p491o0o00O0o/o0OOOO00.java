package p491o0o00O0o;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.vm.account.AccountVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o00O0O;
import p424o0OoO0Oo.o00OO0O0;
import p516o0o0O00o.o0oOO;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UntieAccountBindActivity f49053OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(UntieAccountBindActivity untieAccountBindActivity) {
        super(3);
        this.f49053OooO0Oo = untieAccountBindActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        UntieAccountBindActivity untieAccountBindActivity = this.f49053OooO0Oo;
        untieAccountBindActivity.OooOo0();
        o00OO0O0<ApiResult<Boolean>> o00oo0o0UnbindAccount = ((AccountVM) untieAccountBindActivity.f24890OooOo00.getValue()).unbindAccount(type, accessToken, str2);
        o0oOO.OooO0O0(o00oo0o0UnbindAccount, (o0oOo0O0) untieAccountBindActivity.f22283OooOO0O.getValue(), false, 6);
        o00O0O.OooO0Oo(o00oo0o0UnbindAccount, untieAccountBindActivity, false, null, null, new o0o0000(untieAccountBindActivity), 14);
        return Unit.INSTANCE;
    }
}
