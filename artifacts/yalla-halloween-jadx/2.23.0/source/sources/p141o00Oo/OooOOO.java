package p141o00Oo;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f37462OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f37463OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Float> f37464OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f37465OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f37466OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super Float, Float> function1, float f, MutableState<Float> mutableState, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        super(0);
        this.f37462OooO0Oo = closedFloatingPointRange;
        this.f37464OooO0o0 = function1;
        this.f37463OooO0o = f;
        this.f37465OooO0oO = mutableState;
        this.f37466OooO0oo = closedFloatingPointRange2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f37462OooO0Oo;
        float fFloatValue = (closedFloatingPointRange.getEndInclusive().floatValue() - closedFloatingPointRange.getStart().floatValue()) / 1000;
        float fFloatValue2 = this.f37464OooO0o0.invoke(Float.valueOf(this.f37463OooO0o)).floatValue();
        MutableState<Float> mutableState = this.f37465OooO0oO;
        if (Math.abs(fFloatValue2 - mutableState.getValue().floatValue()) > fFloatValue) {
            if (this.f37466OooO0oo.contains(mutableState.getValue())) {
                mutableState.setValue(Float.valueOf(fFloatValue2));
            }
        }
        return Unit.INSTANCE;
    }
}
