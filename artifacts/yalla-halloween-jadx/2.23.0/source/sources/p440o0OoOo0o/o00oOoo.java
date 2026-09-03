package p440o0OoOo0o;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends Lambda implements Function1<AccountBindResult, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountsVM f46166OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(LinkedAccountsVM linkedAccountsVM) {
        super(1);
        this.f46166OooO0Oo = linkedAccountsVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AccountBindResult accountBindResult) {
        this.f46166OooO0Oo.syncLinkedAccount();
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Success);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        return Unit.INSTANCE;
    }
}
