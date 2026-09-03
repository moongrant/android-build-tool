package p198o00o0Oo;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO extends Lambda implements Function1<Float, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ClosedFloatingPointRange<Float> f39040OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ float f39041OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f39042OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Float, Unit> f39043OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f39044OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OO(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, float f, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
        super(1);
        this.f39040OooO0Oo = closedFloatingPointRange;
        this.f39042OooO0o0 = i;
        this.f39041OooO0o = f;
        this.f39043OooO0oO = function1;
        this.f39044OooO0oo = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Float f) {
        int i;
        float fFloatValue = f.floatValue();
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f39040OooO0Oo;
        float fCoerceIn = RangesKt.coerceIn(fFloatValue, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
        boolean z = true;
        int i2 = this.f39042OooO0o0;
        if (i2 > 0 && (i = i2 + 1) >= 0) {
            float fAbs = fCoerceIn;
            float f2 = fAbs;
            int i3 = 0;
            while (true) {
                float fLerp = MathHelpersKt.lerp(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), i3 / i);
                float f3 = fLerp - fCoerceIn;
                if (Math.abs(f3) <= fAbs) {
                    fAbs = Math.abs(f3);
                    f2 = fLerp;
                }
                if (i3 == i) {
                    break;
                }
                i3++;
            }
            fCoerceIn = f2;
        }
        if (fCoerceIn == this.f39041OooO0o) {
            z = false;
        } else {
            this.f39043OooO0oO.invoke(Float.valueOf(fCoerceIn));
            Function0<Unit> function0 = this.f39044OooO0oo;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Boolean.valueOf(z);
    }
}
