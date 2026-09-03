package o00OO0O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f31500Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f31501Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o0OO00O o0oo00o2, int i) {
        super(0);
        this.f31500Oooo0o = o0oo00o2;
        this.f31501Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<? super Integer, Unit> function1 = this.f31500Oooo0o.f31590OoooO;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(this.f31501Oooo0oO));
        }
        return Unit.INSTANCE;
    }
}
