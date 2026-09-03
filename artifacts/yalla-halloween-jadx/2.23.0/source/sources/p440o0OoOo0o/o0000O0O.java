package p440o0OoOo0o;

import com.yalla.yalla.module.account.ui.screen.DeleteAccountFirstWanScreen;
import com.yalla.yalla.module.account.ui.screen.LinkedAccountsScreen;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p063o0000oO.o00Ooo;
import p526o0o0OOO0.oo0oOO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f46125OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0O(LinkedAccountsVM linkedAccountsVM) {
        super(1);
        this.f46125OooO0Oo = linkedAccountsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        o0OO000.OooO00o("105001");
        oo0oOO0.OooO0o0(DeleteAccountFirstWanScreen.INSTANCE, o00Ooo.OooO0O0(TuplesKt.to(LinkedAccountsScreen.ACCOUNT_INFO_PARAM, this.f46125OooO0Oo.getAccountBindInfo())), false, null, 12);
        return Unit.INSTANCE;
    }
}
