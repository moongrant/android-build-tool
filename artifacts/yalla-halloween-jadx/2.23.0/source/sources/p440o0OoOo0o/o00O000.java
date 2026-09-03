package p440o0OoOo0o;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o000O000;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f46150OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f46151OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f46152OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(o0O0OOO0 o0o0ooo0, LinkedAccountsVM linkedAccountsVM, ScreenNavigationActivity screenNavigationActivity) {
        super(3);
        this.f46150OooO0Oo = o0o0ooo0;
        this.f46152OooO0o0 = linkedAccountsVM;
        this.f46151OooO0o = screenNavigationActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        o0O0OOO0 o0o0ooo0 = this.f46150OooO0Oo;
        o0O0OOO0.OooO0O0(o0o0ooo0);
        int value = type.getValue();
        LinkedAccountsVM linkedAccountsVM = this.f46152OooO0o0;
        o000O000.OooO0Oo(linkedAccountsVM.thirdAccountBind(accessToken, value, str2), this.f46151OooO0o, false, new o00O0000(o0o0ooo0), new o0O0ooO(type), new o00oOoo(linkedAccountsVM), 2);
        return Unit.INSTANCE;
    }
}
