package p445o0OoOoO0;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f47313OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f47314OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f47315OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f47316OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(OpenAuthManager openAuthManager, ScreenNavigationActivity screenNavigationActivity, o0oOo0O0 o0ooo0o1, LinkedAccountsVM linkedAccountsVM) {
        super(0);
        this.f47313OooO0Oo = linkedAccountsVM;
        this.f47315OooO0o0 = screenNavigationActivity;
        this.f47314OooO0o = o0ooo0o1;
        this.f47316OooO0oO = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkedAccountsVM linkedAccountsVM = this.f47313OooO0Oo;
        if (linkedAccountsVM.getAccountBindInfo() != null) {
            if (linkedAccountsVM.isBindTwitter()) {
                int i = UntieAccountBindActivity.f24887OooOo;
                UntieAccountBindActivity.OooO00o.OooO00o(this.f47315OooO0o0, linkedAccountsVM.getAccountBindInfo(), 9);
            } else {
                o0oOo0O0.OooO0O0(this.f47314OooO0o);
                this.f47316OooO0oO.OooO0OO();
            }
        }
        return Unit.INSTANCE;
    }
}
