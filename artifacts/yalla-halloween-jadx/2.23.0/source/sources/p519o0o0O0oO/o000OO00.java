package p519o0o0O0oO;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Long> f52506OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f52507OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f52508OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f52509OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f52510OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(MutableState<Long> mutableState, Function0<Unit> function0, Function0<Unit> function1, boolean z, int i) {
        super(2);
        this.f52506OooO0Oo = mutableState;
        this.f52508OooO0o0 = function0;
        this.f52507OooO0o = function1;
        this.f52509OooO0oO = z;
        this.f52510OooO0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o000OOo0.OooO00o(this.f52506OooO0Oo, this.f52508OooO0o0, this.f52507OooO0o, this.f52509OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f52510OooO0oo | 1));
        return Unit.INSTANCE;
    }
}
