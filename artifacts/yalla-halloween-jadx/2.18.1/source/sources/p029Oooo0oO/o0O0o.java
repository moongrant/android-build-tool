package p029Oooo0oO;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO0O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f2445OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2446OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f2447OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oo00oO f2448OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o0O00O f2449OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f2450OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Function2<Integer, Integer, OooO0O0> f2451OooO0oO;

    public static final class OooO00o extends Lambda implements Function2<Integer, Integer, OooO0O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<Integer> f2452Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f2453Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o f2454Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(List<Integer> list, int i, o0O0o o0o0o) {
            super(2);
            this.f2452Oooo0o = list;
            this.f2453Oooo0oO = i;
            this.f2454Oooo0oo = o0o0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final OooO0O0 invoke(Integer num, Integer num2) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            int iIntValue3 = ((iIntValue2 - 1) * this.f2453Oooo0oO) + (this.f2452Oooo0o.get((iIntValue + iIntValue2) - 1).intValue() - (iIntValue == 0 ? 0 : this.f2452Oooo0o.get(iIntValue - 1).intValue()));
            return new OooO0O0(this.f2454Oooo0oo.f2445OooO00o ? OooO0O0.f27298OooO0O0.OooO0o0(iIntValue3) : OooO0O0.f27298OooO0O0.OooO0Oo(iIntValue3));
        }
    }

    public o0O0o(boolean z, @NotNull List<Integer> slotSizesSums, int i, int i2, int i3, @NotNull oo00oO measuredItemProvider, @NotNull o00OOOO0 spanLayoutProvider, @NotNull o0O00O measuredLineFactory) {
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(measuredLineFactory, "measuredLineFactory");
        this.f2445OooO00o = z;
        this.f2446OooO0O0 = i2;
        this.f2447OooO0OO = i3;
        this.f2448OooO0Oo = measuredItemProvider;
        this.f2450OooO0o0 = spanLayoutProvider;
        this.f2449OooO0o = measuredLineFactory;
        this.f2451OooO0oO = new OooO00o(slotSizesSums, i, this);
    }

    @NotNull
    public final o0oOOo OooO00o(int i) {
        o00OOOO0.OooO0OO oooO0OOOooO0O0 = this.f2450OooO0o0.OooO0O0(i);
        int size = oooO0OOOooO0O0.f2375OooO0O0.size();
        int i2 = (size == 0 || oooO0OOOooO0O0.f2374OooO00o + size == this.f2446OooO0O0) ? 0 : this.f2447OooO0OO;
        o0O00o0[] o0o00o0Arr = new o0O00o0[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (int) oooO0OOOooO0O0.f2375OooO0O0.get(i4).f2271OooO00o;
            o0O00o0 o0o00o0OooO00o = this.f2448OooO0Oo.OooO00o(oooO0OOOooO0O0.f2374OooO00o + i4, i2, ((OooO0O0) this.f2451OooO0oO.invoke(Integer.valueOf(i3), Integer.valueOf(i5))).f27302OooO00o);
            i3 += i5;
            Unit unit = Unit.INSTANCE;
            o0o00o0Arr[i4] = o0o00o0OooO00o;
        }
        return this.f2449OooO0o.OooO00o(i, o0o00o0Arr, oooO0OOOooO0O0.f2375OooO0O0, i2);
    }
}
