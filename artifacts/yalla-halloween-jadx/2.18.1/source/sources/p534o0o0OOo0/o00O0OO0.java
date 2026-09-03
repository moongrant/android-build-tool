package p534o0o0OOo0;

import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.activity.account.AccountBindActivity;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p251o00ooO.o000O00;
import p391o0OOooOo.o0O00000;
import p584o0oOoo.o000O;
import p588o0oOooO.oOOOOo0O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO0 extends Lambda implements Function2<Integer, o000O00, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AccountBindActivity f43521Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(AccountBindActivity accountBindActivity) {
        super(2);
        this.f43521Oooo0o = accountBindActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, o000O00 o000o01) {
        num.intValue();
        o000O00 item = o000o01;
        Intrinsics.checkNotNullParameter(item, "item");
        o0O00000.OooO0OO("Me_account_delete-Continue");
        OooOo.OooO0O0("105001");
        AccountBindInfo accountBindInfo = this.f43521Oooo0o.f21705Ooooo0o;
        if (accountBindInfo == null) {
            return null;
        }
        o000O.OooO00o(oOOOOo0O.f47137OooO00o, OooO0OO.OooO0O0(TuplesKt.to("accountInfo", accountBindInfo)));
        return Unit.INSTANCE;
    }
}
