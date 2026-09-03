package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Long, Unit> f31682Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Long> f31683Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO(Function1<? super Long, Unit> function1, o0O00OO<Long> o0o00oo2) {
        super(0);
        this.f31682Oooo0o = function1;
        this.f31683Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f31682Oooo0o.invoke(this.f31683Oooo0oO.getValue());
        return Unit.INSTANCE;
    }
}
