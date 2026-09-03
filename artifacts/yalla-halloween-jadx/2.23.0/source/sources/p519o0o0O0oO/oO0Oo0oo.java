package p519o0o0O0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo0oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f52879OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<String, oO000O0O, Unit> f52880OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO0Oo0oo(oO000O0O oo000o0o, Function2<? super String, ? super oO000O0O, Unit> function2) {
        super(0);
        this.f52879OooO0Oo = oo000o0o;
        this.f52880OooO0o0 = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oO000O0O oo000o0o = this.f52879OooO0Oo;
        oo000o0o.f52801OooO00o.setValue(Boolean.TRUE);
        this.f52880OooO0o0.invoke(oo000o0o.f52804OooO0Oo.getValue(), oo000o0o);
        return Unit.INSTANCE;
    }
}
