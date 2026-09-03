package o000000;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo000o f26655Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p145o00Oo0.o0O0O00 f26656Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(oo000o oo000oVar, p145o00Oo0.o0O0O00 o0o0o00) {
        super(0);
        this.f26655Oooo0o = oo000oVar;
        this.f26656Oooo0oO = o0o0o00;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo000o oo000oVar = this.f26655Oooo0o;
        p145o00Oo0.o0O0O00 o0o0o00 = this.f26656Oooo0oO;
        OooOO0 oooOO1 = (OooOO0) oo000oVar.f26713OooooOO[0];
        if (oooOO1 == null) {
            oo000oVar.o000OO(o0o0o00);
        } else {
            oooOO1.OooO0OO(o0o0o00);
        }
        return Unit.INSTANCE;
    }
}
