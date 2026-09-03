package p588o0oOooO;

import com.yalla.yalla.model.AccountBindInfo;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p584o0oOoo.o000O;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOo0000 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AccountBindInfo f47152Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0000(AccountBindInfo accountBindInfo) {
        super(1);
        this.f47152Oooo0o = accountBindInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        o000O.OooO00o(oOo0o00.f47154OooO00o, OooO0OO.OooO0O0(TuplesKt.to("accountInfo", this.f47152Oooo0o)));
        return Unit.INSTANCE;
    }
}
