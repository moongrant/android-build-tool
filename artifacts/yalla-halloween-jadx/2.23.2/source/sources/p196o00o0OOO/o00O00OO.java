package p196o00o0OOO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f38864OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f38865OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f38866OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(Modifier modifier, int i, int i2) {
        super(2);
        this.f38864OooO0Oo = modifier;
        this.f38866OooO0o0 = i;
        this.f38865OooO0o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oOO00O.OooO0OO(RecomposeScopeImplKt.updateChangedFlags(this.f38866OooO0o0 | 1), this.f38865OooO0o, composer, this.f38864OooO0Oo);
        return Unit.INSTANCE;
    }
}
