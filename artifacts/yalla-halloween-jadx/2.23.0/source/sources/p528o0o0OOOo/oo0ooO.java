package p528o0o0OOOo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0ooO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0o00O f54404OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f54405OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54406OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54407OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54408OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo0ooO(o0O0o00O o0o0o00o, int i, Function1<? super Integer, Unit> function1, int i2, int i3) {
        super(2);
        this.f54404OooO0Oo = o0o0o00o;
        this.f54406OooO0o0 = i;
        this.f54405OooO0o = function1;
        this.f54407OooO0oO = i2;
        this.f54408OooO0oo = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0O0o00O.OooO0OO(this.f54404OooO0Oo, this.f54406OooO0o0, this.f54405OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f54407OooO0oO | 1), this.f54408OooO0oo);
        return Unit.INSTANCE;
    }
}
