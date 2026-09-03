package p543o0o0Ooo0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f55373OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55374OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f55375OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f55376OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Modifier modifier, boolean z, int i, int i2) {
        super(2);
        this.f55373OooO0Oo = modifier;
        this.f55375OooO0o0 = z;
        this.f55374OooO0o = i;
        this.f55376OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55374OooO0o | 1);
        Modifier modifier = this.f55373OooO0Oo;
        boolean z = this.f55375OooO0o0;
        oo000000.OooO0Oo(iUpdateChangedFlags, this.f55376OooO0oO, composer, modifier, z);
        return Unit.INSTANCE;
    }
}
