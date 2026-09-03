package p198o00o0Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f39031OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Float> f39032OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f39033OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f39034OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f39035OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ float f39036OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0OO(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, MutableState<Float> mutableState, float f, int i) {
        super(2);
        this.f39032OooO0Oo = function1;
        this.f39034OooO0o0 = closedFloatingPointRange;
        this.f39033OooO0o = closedFloatingPointRange2;
        this.f39035OooO0oO = mutableState;
        this.f39036OooO0oo = f;
        this.f39031OooO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o00OO0O0.OooO0Oo(this.f39032OooO0Oo, this.f39034OooO0o0, this.f39033OooO0o, this.f39035OooO0oO, this.f39036OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f39031OooO | 1));
        return Unit.INSTANCE;
    }
}
