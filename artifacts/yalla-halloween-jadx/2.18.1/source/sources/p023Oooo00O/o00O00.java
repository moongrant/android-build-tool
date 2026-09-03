package p023Oooo00O;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends Lambda implements Function1<o00Ooo<Object, o0O0O00>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function2<Object, Object, Unit> f1115Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00OO0O0<Object, o0O0O00> f1116Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(Function2<Object, Object, Unit> function2, o00OO0O0<Object, o0O0O00> o00oo0o1) {
        super(1);
        this.f1115Oooo0o = function2;
        this.f1116Oooo0oO = o00oo0o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00Ooo<Object, o0O0O00> o00ooo2) {
        o00Ooo<Object, o0O0O00> animate = o00ooo2;
        Intrinsics.checkNotNullParameter(animate, "$this$animate");
        this.f1115Oooo0o.invoke(animate.OooO0O0(), this.f1116Oooo0oO.OooO0O0().invoke(animate.f1186OooO0o));
        return Unit.INSTANCE;
    }
}
