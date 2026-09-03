package p257o00ooOO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f34425Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f34426Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(o0O00OO<Boolean> o0o00oo2, Function0<Unit> function0) {
        super(0);
        this.f34425Oooo0o = o0o00oo2;
        this.f34426Oooo0oO = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f34425Oooo0o.setValue(Boolean.FALSE);
        Function0<Unit> function0 = this.f34426Oooo0oO;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
