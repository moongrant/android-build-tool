package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOOOoo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f53033OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f53034OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function2<String, oO000O0O, Unit> f53035OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ooOOOOoo(oO000O0O oo000o0o, Function2<? super String, ? super oO000O0O, Unit> function2, int i) {
        super(2);
        this.f53033OooO0Oo = oo000o0o;
        this.f53035OooO0o0 = function2;
        this.f53034OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53034OooO0o | 1);
        oO0OOo0o.OooO00o(this.f53033OooO0Oo, this.f53035OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
