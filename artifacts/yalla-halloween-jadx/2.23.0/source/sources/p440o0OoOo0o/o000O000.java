package p440o0OoOo0o;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p571o0oOoOO.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f46133OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f46134OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f46135OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f46136OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(LinkedAccountsVM linkedAccountsVM, ScreenNavigationActivity screenNavigationActivity, o0O0OOO0 o0o0ooo0, OpenAuthManager openAuthManager) {
        super(0);
        this.f46133OooO0Oo = linkedAccountsVM;
        this.f46135OooO0o0 = screenNavigationActivity;
        this.f46134OooO0o = o0o0ooo0;
        this.f46136OooO0oO = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkedAccountsVM linkedAccountsVM = this.f46133OooO0Oo;
        if (linkedAccountsVM.getAccountBindInfo() != null) {
            if (linkedAccountsVM.isBindTwitter()) {
                int i = UntieAccountBindActivity.f25342OooOo;
                UntieAccountBindActivity.OooO00o.OooO00o(this.f46135OooO0o0, linkedAccountsVM.getAccountBindInfo(), 9);
            } else {
                o0O0OOO0.OooO0O0(this.f46134OooO0o);
                this.f46136OooO0oO.OooO0OO();
            }
        }
        return Unit.INSTANCE;
    }
}
