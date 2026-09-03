package p532o0o0OOo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOo.o0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O f53492OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f53493OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(o0O o0o, int i) {
        super(2);
        this.f53492OooO0Oo = o0o;
        this.f53493OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53493OooO0o0 | 1);
        o0000O.OooO0oO(this.f53492OooO0Oo, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
