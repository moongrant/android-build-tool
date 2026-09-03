package p445o0OoOoO0;

import com.yalla.yalla.module.account.ui.screen.DeleteAccountFirstWanScreen;
import com.yalla.yalla.module.account.ui.screen.LinkedAccountsScreen;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p063o0000oO.o000oOoO;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f47356OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(LinkedAccountsVM linkedAccountsVM) {
        super(1);
        this.f47356OooO0Oo = linkedAccountsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        OooO00o.OooO0O0("105001");
        o00O00.OooO0o0(DeleteAccountFirstWanScreen.INSTANCE, o000oOoO.OooO0O0(TuplesKt.to(LinkedAccountsScreen.ACCOUNT_INFO_PARAM, this.f47356OooO0Oo.getAccountBindInfo())), false, null, 12);
        return Unit.INSTANCE;
    }
}
