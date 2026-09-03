package o00OO0O;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends Lambda implements Function1<Long, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f37197OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f37198OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO0OO oooO0OO, int i) {
        super(1);
        this.f37197OooO0Oo = oooO0OO;
        this.f37198OooO0o0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Long l) {
        long jLongValue = l.longValue();
        OooO0OO oooO0OO = this.f37197OooO0Oo;
        com.airbnb.lottie.OooOO0 composition = oooO0OO.getComposition();
        boolean z = true;
        if (composition != null) {
            MutableState mutableState = oooO0OO.f37170OooOO0O;
            long jLongValue2 = ((Number) mutableState.getValue()).longValue() == Long.MIN_VALUE ? 0L : jLongValue - ((Number) mutableState.getValue()).longValue();
            mutableState.setValue(Long.valueOf(jLongValue));
            OooOO0O oooOO0OOooO0oO = oooO0OO.OooO0oO();
            float fOooO0O0 = oooOO0OOooO0oO == null ? 0.0f : oooOO0OOooO0oO.OooO0O0();
            OooOO0O oooOO0OOooO0oO2 = oooO0OO.OooO0oO();
            float fOooO00o = oooOO0OOooO0oO2 == null ? 1.0f : oooOO0OOooO0oO2.OooO00o();
            float fOooO0O1 = oooO0OO.OooO0O0() * ((jLongValue2 / ((long) DurationKt.NANOS_IN_MILLIS)) / composition.OooO0O0());
            float fOooO0Oo = oooO0OO.OooO0O0() < 0.0f ? fOooO0O0 - (oooO0OO.OooO0Oo() + fOooO0O1) : (oooO0OO.OooO0Oo() + fOooO0O1) - fOooO00o;
            MutableState mutableState2 = oooO0OO.f37166OooO0o0;
            if (fOooO0Oo < 0.0f) {
                mutableState2.setValue(Float.valueOf(RangesKt.coerceIn(oooO0OO.OooO0Oo(), fOooO0O0, fOooO00o) + fOooO0O1));
            } else {
                float f = fOooO00o - fOooO0O0;
                int i = ((int) (fOooO0Oo / f)) + 1;
                int iOooO0o0 = oooO0OO.OooO0o0() + i;
                MutableState mutableState3 = oooO0OO.f37165OooO0o;
                int i2 = this.f37198OooO0o0;
                if (iOooO0o0 > i2) {
                    mutableState2.setValue(Float.valueOf(((Number) oooO0OO.f37171OooOO0o.getValue()).floatValue()));
                    mutableState3.setValue(Integer.valueOf(i2));
                    z = false;
                } else {
                    mutableState3.setValue(Integer.valueOf(oooO0OO.OooO0o0() + i));
                    float f2 = fOooO0Oo - ((i - 1) * f);
                    mutableState2.setValue(Float.valueOf(oooO0OO.OooO0O0() < 0.0f ? fOooO00o - f2 : fOooO0O0 + f2));
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
