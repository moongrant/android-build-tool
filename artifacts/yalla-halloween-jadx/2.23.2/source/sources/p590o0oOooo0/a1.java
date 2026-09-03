package p590o0oOooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ z0 f57105OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f57106OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Modifier f57107OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f57108OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(z0 z0Var, Modifier modifier, int i, int i2) {
        super(2);
        this.f57105OooO0Oo = z0Var;
        this.f57107OooO0o0 = modifier;
        this.f57106OooO0o = i;
        this.f57108OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f57106OooO0o | 1);
        z0 z0Var = this.f57105OooO0Oo;
        Modifier modifier = this.f57107OooO0o0;
        z0Var.OooO00o(iUpdateChangedFlags, this.f57108OooO0oO, composer, modifier);
        return Unit.INSTANCE;
    }
}
