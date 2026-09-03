package p509o0o0O0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f50954OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f50955OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f50956OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(Modifier modifier, int i, int i2) {
        super(2);
        this.f50954OooO0Oo = modifier;
        this.f50956OooO0o0 = i;
        this.f50955OooO0o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o00O0O.OooO0O0(RecomposeScopeImplKt.updateChangedFlags(this.f50956OooO0o0 | 1), this.f50955OooO0o, composer, this.f50954OooO0Oo);
        return Unit.INSTANCE;
    }
}
