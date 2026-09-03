package p141o00Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f37467OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Float> f37468OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f37469OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f37470OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f37471OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ float f37472OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOOO(Function1<? super Float, Float> function1, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, MutableState<Float> mutableState, float f, int i) {
        super(2);
        this.f37468OooO0Oo = function1;
        this.f37470OooO0o0 = closedFloatingPointRange;
        this.f37469OooO0o = closedFloatingPointRange2;
        this.f37471OooO0oO = mutableState;
        this.f37472OooO0oo = f;
        this.f37467OooO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o0OoOo0.OooO0Oo(this.f37468OooO0Oo, this.f37470OooO0o0, this.f37469OooO0o, this.f37471OooO0oO, this.f37472OooO0oo, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37467OooO | 1));
        return Unit.INSTANCE;
    }
}
