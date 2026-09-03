package p540o0o0OoO0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p581o0oOoo.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OOO f54752OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f54753OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f54754OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(o0O00OOO o0o00ooo2, o0000O0 o0000o1, int i) {
        super(2);
        this.f54752OooO0Oo = o0o00ooo2;
        this.f54754OooO0o0 = o0000o1;
        this.f54753OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54753OooO0o | 1);
        o0O00OOO.OooO0OO(this.f54752OooO0Oo, this.f54754OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
