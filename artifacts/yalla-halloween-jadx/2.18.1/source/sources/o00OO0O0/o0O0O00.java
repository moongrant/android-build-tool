package o00OO0O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f31579Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f31580Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(o0OO00O o0oo00o2, int i) {
        super(0);
        this.f31579Oooo0o = o0oo00o2;
        this.f31580Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<? super Integer, Unit> function1 = this.f31579Oooo0o.f31591OoooO0;
        if (function1 == null) {
            return null;
        }
        function1.invoke(Integer.valueOf(this.f31580Oooo0oO));
        return Unit.INSTANCE;
    }
}
