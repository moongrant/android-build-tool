package p445o0OoOoO0;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o00O0O;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f47337OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f47338OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f47339OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(o0oOo0O0 o0ooo0o1, LinkedAccountsVM linkedAccountsVM, ScreenNavigationActivity screenNavigationActivity) {
        super(3);
        this.f47337OooO0Oo = o0ooo0o1;
        this.f47339OooO0o0 = linkedAccountsVM;
        this.f47338OooO0o = screenNavigationActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String accessToken = str;
        OpenAuthManager.AuthType type = authType;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        o0oOo0O0 o0ooo0o1 = this.f47337OooO0Oo;
        o0oOo0O0.OooO0O0(o0ooo0o1);
        int value = type.getValue();
        LinkedAccountsVM linkedAccountsVM = this.f47339OooO0o0;
        o00O0O.OooO0Oo(linkedAccountsVM.thirdAccountBind(accessToken, value, str2), this.f47338OooO0o, false, new o00OOO0O(o0ooo0o1), new o0o0Oo(type), new o00OOOO0(linkedAccountsVM), 2);
        return Unit.INSTANCE;
    }
}
