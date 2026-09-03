package p541o0o0OoOO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOOOOo0O f55299OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f55300OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f55301OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f55302OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o00(oOOOOo0O oooooo0o, long j, int i, int i2) {
        super(2);
        this.f55299OooO0Oo = oooooo0o;
        this.f55301OooO0o0 = j;
        this.f55300OooO0o = i;
        this.f55302OooO0oO = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oOOOOo0O.OooO0O0(this.f55299OooO0Oo, this.f55301OooO0o0, this.f55300OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55302OooO0oO | 1));
        return Unit.INSTANCE;
    }
}
