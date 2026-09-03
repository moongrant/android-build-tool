package p562o0oOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<String> f44952Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f44953Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOo00(o0O00OO<String> o0o00oo2, Function1<? super String, Unit> function1) {
        super(0);
        this.f44952Oooo0o = o0o00oo2;
        this.f44953Oooo0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f44952Oooo0o.setValue("");
        this.f44953Oooo0oO.invoke("");
        return Unit.INSTANCE;
    }
}
