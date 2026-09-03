package p141o00Oo;

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
public final class Oooo000 extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f37484OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f37485OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f37486OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f37487OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f37488OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ State<Function1<Float, Unit>> f37489OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Oooo000(MutableState<Float> mutableState, MutableState<Float> mutableState2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State<? extends Function1<? super Float, Unit>> state, ClosedFloatingPointRange<Float> closedFloatingPointRange) {
        super(1);
        this.f37485OooO0Oo = mutableState;
        this.f37487OooO0o0 = mutableState2;
        this.f37486OooO0o = floatRef;
        this.f37488OooO0oO = floatRef2;
        this.f37489OooO0oo = state;
        this.f37484OooO = closedFloatingPointRange;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Float f) {
        float fFloatValue = f.floatValue();
        MutableState<Float> mutableState = this.f37485OooO0Oo;
        float fFloatValue2 = mutableState.getValue().floatValue() + fFloatValue;
        MutableState<Float> mutableState2 = this.f37487OooO0o0;
        mutableState.setValue(Float.valueOf(mutableState2.getValue().floatValue() + fFloatValue2));
        mutableState2.setValue(Float.valueOf(0.0f));
        float fFloatValue3 = mutableState.getValue().floatValue();
        Ref.FloatRef floatRef = this.f37486OooO0o;
        float f2 = floatRef.element;
        Ref.FloatRef floatRef2 = this.f37488OooO0oO;
        float fCoerceIn = RangesKt.coerceIn(fFloatValue3, f2, floatRef2.element);
        Function1<Float, Unit> value = this.f37489OooO0oo.getValue();
        float f3 = floatRef.element;
        float f4 = floatRef2.element;
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f37484OooO;
        float fFloatValue4 = closedFloatingPointRange.getStart().floatValue();
        float fFloatValue5 = closedFloatingPointRange.getEndInclusive().floatValue();
        float f5 = o0OoOo0.f37572OooO00o;
        float f6 = f4 - f3;
        value.invoke(Float.valueOf(MathHelpersKt.lerp(fFloatValue4, fFloatValue5, RangesKt.coerceIn((f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)) == 0 ? 0.0f : (fCoerceIn - f3) / f6, 0.0f, 1.0f))));
        return Unit.INSTANCE;
    }
}
