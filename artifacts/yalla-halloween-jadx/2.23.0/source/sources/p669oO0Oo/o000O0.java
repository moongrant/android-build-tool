package p669oO0Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOoO.oOO000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f60454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f60455OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO000o f60456OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o000O0Oo o000o0oo2, oOO000o ooo000o, int i) {
        super(2);
        this.f60454OooO0Oo = o000o0oo2;
        this.f60456OooO0o0 = ooo000o;
        this.f60455OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f60455OooO0o | 1);
        o000O0Oo.OooO0OO(this.f60454OooO0Oo, this.f60456OooO0o0, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
