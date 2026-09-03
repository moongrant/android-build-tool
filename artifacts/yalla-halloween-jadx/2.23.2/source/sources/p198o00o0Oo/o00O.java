package p198o00o0Oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f39025OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f39026OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f39027OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f39028OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f39029OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f39030OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O(MutableState<Float> mutableState, MutableState<Float> mutableState2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State<? extends Function1<? super Float, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.f39026OooO0Oo = mutableState;
        this.f39028OooO0o0 = mutableState2;
        this.f39027OooO0o = floatRef;
        this.f39029OooO0oO = floatRef2;
        this.f39030OooO0oo = state;
        this.f39025OooO = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        MutableState<Float> mutableState = this.f39026OooO0Oo;
        float fFloatValue2 = mutableState.getValue().floatValue() + fFloatValue;
        MutableState<Float> mutableState2 = this.f39028OooO0o0;
        mutableState.setValue(Float.valueOf(mutableState2.getValue().floatValue() + fFloatValue2));
        mutableState2.setValue(Float.valueOf(0.0f));
        float fFloatValue3 = mutableState.getValue().floatValue();
        Ref.FloatRef floatRef = this.f39027OooO0o;
        float f2 = floatRef.element;
        Ref.FloatRef floatRef2 = this.f39029OooO0oO;
        float fCoerceIn = RangesKt.coerceIn(fFloatValue3, f2, floatRef2.element);
        Function1<Float, Unit> value = this.f39030OooO0oo.getValue();
        float f3 = floatRef.element;
        float f4 = floatRef2.element;
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f39025OooO;
        float fFloatValue4 = closedFloatingPointRange.getStart().floatValue();
        float fFloatValue5 = closedFloatingPointRange.getEndInclusive().floatValue();
        float f5 = o00OO0O0.f39058OooO00o;
        float f6 = f4 - f3;
        value.invoke(Float.valueOf(MathHelpersKt.lerp(fFloatValue4, fFloatValue5, RangesKt.coerceIn((f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (fCoerceIn - f3) / f6, 0.0f, 1.0f))));
        return Unit.INSTANCE;
    }
}
