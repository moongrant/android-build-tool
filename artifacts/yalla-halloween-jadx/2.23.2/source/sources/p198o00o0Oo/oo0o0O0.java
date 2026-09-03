package p198o00o0Oo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f39198OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f39199OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Float> f39200OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f39201OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f39202OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo0o0O0(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super Float, Float> function1, float f, MutableState<Float> mutableState, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        super(0);
        this.f39198OooO0Oo = closedFloatingPointRange;
        this.f39200OooO0o0 = function1;
        this.f39199OooO0o = f;
        this.f39201OooO0oO = mutableState;
        this.f39202OooO0oo = closedFloatingPointRange2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f39198OooO0Oo;
        float fFloatValue = (closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) / 1000;
        float fFloatValue2 = this.f39200OooO0o0.invoke(Float.valueOf(this.f39199OooO0o)).floatValue();
        MutableState<Float> mutableState = this.f39201OooO0oO;
        if (Math.abs(fFloatValue2 - mutableState.getValue().floatValue()) > fFloatValue) {
            if (this.f39202OooO0oo.contains(mutableState.getValue())) {
                mutableState.setValue(Float.valueOf(fFloatValue2));
            }
        }
        return Unit.INSTANCE;
    }
}
