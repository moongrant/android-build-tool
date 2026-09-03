package p543o0o0Ooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f55433OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55434OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f55435OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Modifier modifier, int i, int i2) {
        super(2);
        this.f55433OooO0Oo = modifier;
        this.f55435OooO0o0 = i;
        this.f55434OooO0o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oo000000.OooO0o0(RecomposeScopeImplKt.updateChangedFlags(this.f55435OooO0o0 | 1), this.f55434OooO0o, composer, this.f55433OooO0Oo);
        return Unit.INSTANCE;
    }
}
