package p519o0o0O0OO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Modifier f51991OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51992OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f51993OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(Modifier modifier, int i, int i2) {
        super(2);
        this.f51991OooO0Oo = modifier;
        this.f51993OooO0o0 = i;
        this.f51992OooO0o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o000OO00.OooO0O0(RecomposeScopeImplKt.updateChangedFlags(this.f51993OooO0o0 | 1), this.f51992OooO0o, composer, this.f51991OooO0Oo);
        return Unit.INSTANCE;
    }
}
