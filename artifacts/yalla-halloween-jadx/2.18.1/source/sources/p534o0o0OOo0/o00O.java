package p534o0o0OOo0;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.ui.activity.account.AccountBindActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p251o00ooO.o000O00;
import p255o00ooO0o.o00O0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AccountBindActivity f43514Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(AccountBindActivity accountBindActivity) {
        super(0);
        this.f43514Oooo0o = accountBindActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AccountBindActivity accountBindActivity = this.f43514Oooo0o;
        AccountBindActivity.OooO00o oooO00o = AccountBindActivity.f21702OooooOO;
        Objects.requireNonNull(accountBindActivity);
        o0O00000.OooO0OO("Me_account_delete");
        o00O0 o00o1 = new o00O0(accountBindActivity);
        String text = OooOOO.OooO0OO(R.string.delete_account);
        Intrinsics.checkNotNullParameter(text, "text");
        o00o1.OooOOOo(new o000O00(text));
        o00o1.OooOOoo(new o00O0OO0(accountBindActivity));
        o00o1.OooOO0(oo0o0O0.f43624Oooo0o);
        o00o1.OooOOO0();
        return Unit.INSTANCE;
    }
}
