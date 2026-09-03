package p519o0o0O0OO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0o000 f52391OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f52392OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f52393OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f52394OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O0oo00(o0O0o000 o0o0o000, Function1<? super Integer, Unit> function1, int i, int i2) {
        super(2);
        this.f52391OooO0Oo = o0o0o000;
        this.f52393OooO0o0 = function1;
        this.f52392OooO0o = i;
        this.f52394OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f52392OooO0o | 1);
        int i = this.f52394OooO0oO;
        Function1<Integer, Unit> function1 = this.f52393OooO0o0;
        this.f52391OooO0Oo.OooO0O0(iUpdateChangedFlags, i, composer, function1);
        return Unit.INSTANCE;
    }
}
