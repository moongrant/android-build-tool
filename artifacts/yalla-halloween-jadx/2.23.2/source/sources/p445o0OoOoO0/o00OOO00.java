package p445o0OoOoO0;

import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;
import p577o0oOoOo.o0oOo0O0;
import p650o0ooo.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ScreenNavigationActivity f47331OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0 f47332OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f47333OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OpenAuthManager f47334OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(OpenAuthManager openAuthManager, ScreenNavigationActivity screenNavigationActivity, o0oOo0O0 o0ooo0o1, LinkedAccountsVM linkedAccountsVM) {
        super(1);
        this.f47331OooO0Oo = screenNavigationActivity;
        this.f47333OooO0o0 = linkedAccountsVM;
        this.f47332OooO0o = o0ooo0o1;
        this.f47334OooO0oO = openAuthManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        ScreenNavigationActivity fragmentActivity = this.f47331OooO0Oo;
        if (zBooleanValue) {
            int i = o000000.facebook_update_dialog_unbind_Content;
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            o000O o000o = new o000O(fragmentActivity);
            o000o.OooOoO0(o000000.facebook_update_dialog_Title);
            o000o.OooOOoo(i);
            o000o.OooOo(true);
            o000o.OooOOOO(o000000.facebook_update_dialog_Update);
            o000o.OooOo0(o0O00o0.f58639OooO0Oo);
            o000o.OooOO0o();
        } else {
            LinkedAccountsVM linkedAccountsVM = this.f47333OooO0o0;
            if (linkedAccountsVM.getAccountBindInfo() != null) {
                if (linkedAccountsVM.isBindFacebook()) {
                    int i2 = UntieAccountBindActivity.f24887OooOo;
                    UntieAccountBindActivity.OooO00o.OooO00o(fragmentActivity, linkedAccountsVM.getAccountBindInfo(), 4);
                } else {
                    o0oOo0O0.OooO0O0(this.f47332OooO0o);
                    this.f47334OooO0oO.OooO00o();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
