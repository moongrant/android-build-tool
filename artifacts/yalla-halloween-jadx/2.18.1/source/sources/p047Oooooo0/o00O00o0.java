package p047Oooooo0;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00o0 implements oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function2<Set<? extends Object>, oo00o, Unit> f4078OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o00O00o0(Function2<? super Set<? extends Object>, ? super oo00o, Unit> function2) {
        this.f4078OooO00o = function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function2<java.util.Set<? extends java.lang.Object>, Oooooo0.oo00o, kotlin.Unit>>] */
    @Override // p047Oooooo0.oOO00O
    public final void dispose() {
        Function2<Set<? extends Object>, oo00o, Unit> function2 = this.f4078OooO00o;
        synchronized (oo0o0O0.f4158OooO0OO) {
            oo0o0O0.f4162OooO0oO.remove(function2);
            Unit unit = Unit.INSTANCE;
        }
    }
}
