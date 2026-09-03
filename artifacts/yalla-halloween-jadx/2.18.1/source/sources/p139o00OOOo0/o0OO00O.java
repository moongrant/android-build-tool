package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p054o00000oo.oo0oOO0;
import p100o000oOoO.o0O00OO;
import p254o00ooO0O.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f31848Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<oo0oOO0> f31849Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OO00O(Function1<? super Integer, Unit> function1, o0O00OO<oo0oOO0> o0o00oo2) {
        super(0);
        this.f31848Oooo0o = function1;
        this.f31849Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f31848Oooo0o.invoke(Integer.valueOf(o000Oo0.OooO0OO(this.f31849Oooo0oO.getValue().f27236OooO00o.f26756Oooo0o, 0)));
        return Unit.INSTANCE;
    }
}
