package Oooo0;

import androidx.compose.foundation.gestures.Orientation;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o implements o0O0O00.oo000o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final oo0oOO0 f708Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0oOOo f709Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final boolean f710Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f711Oooo0oo;

    public static final class OooO00o extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f713Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00.o000O000 f714Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, o0O0O00.o000O000 o000o001) {
            super(1);
            this.f713Oooo0oO = i;
            this.f714Oooo0oo = o000o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
            o0O0O00.o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o0oOOo o0oooo2 = o0O0o.this.f709Oooo0o;
            int i = this.f713Oooo0oO;
            o0oooo2.f762OooO0OO.setValue(Integer.valueOf(i));
            if (o0oooo2.OooO0o0() > i) {
                o0oooo2.f760OooO00o.setValue(Integer.valueOf(i));
            }
            int iCoerceIn = RangesKt.coerceIn(o0O0o.this.f709Oooo0o.OooO0o0(), 0, this.f713Oooo0oO);
            o0O0o o0o0o = o0O0o.this;
            int i2 = o0o0o.f710Oooo0oO ? iCoerceIn - this.f713Oooo0oO : -iCoerceIn;
            boolean z = o0o0o.f711Oooo0oo;
            int i3 = z ? 0 : i2;
            if (!z) {
                i2 = 0;
            }
            o0O0O00.o000O000.OooO00o.OooO0oo(layout, this.f714Oooo0oo, i3, i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 12, null);
            return Unit.INSTANCE;
        }
    }

    public o0O0o(@NotNull o0oOOo scrollerState, boolean z, boolean z2, @NotNull oo0oOO0 overscrollEffect) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        Intrinsics.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        this.f709Oooo0o = scrollerState;
        this.f710Oooo0oO = z;
        this.f711Oooo0oo = z2;
        this.f708Oooo = overscrollEffect;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ p048OoooooO.o00OOOO0 OooOOoo(p048OoooooO.o00OOOO0 o00oooo1) {
        return p048OoooooO.o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.oo000o
    public final int Oooo000(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull o0O0O00.OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.OooOOO(i);
    }

    @Override // o0O0O00.oo000o
    public final int OoooO(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull o0O0O00.OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.OoooO(i);
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o0O0O00.o000000O OoooO0(@NotNull o0O0O00.o00000O0 measure, @NotNull o0O0O00.o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o0OoOo0.OooO00o(j, this.f711Oooo0oo ? Orientation.Vertical : Orientation.Horizontal);
        o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(o0000O0O.OooO0O0.OooO00o(j, 0, this.f711Oooo0oo ? o0000O0O.OooO0O0.OooO0oo(j) : Integer.MAX_VALUE, 0, this.f711Oooo0oo ? Integer.MAX_VALUE : o0000O0O.OooO0O0.OooO0oO(j), 5));
        int iCoerceAtMost = RangesKt.coerceAtMost(o000o000Oooo000.f35265Oooo0o, o0000O0O.OooO0O0.OooO0oo(j));
        int iCoerceAtMost2 = RangesKt.coerceAtMost(o000o000Oooo000.f35266Oooo0oO, o0000O0O.OooO0O0.OooO0oO(j));
        int i = o000o000Oooo000.f35266Oooo0oO - iCoerceAtMost2;
        int i2 = o000o000Oooo000.f35265Oooo0o - iCoerceAtMost;
        if (!this.f711Oooo0oo) {
            i = i2;
        }
        this.f708Oooo.setEnabled(i != 0);
        return measure.OooOooo(iCoerceAtMost, iCoerceAtMost2, MapsKt.emptyMap(), new OooO00o(i, o000o000Oooo000));
    }

    @Override // o0O0O00.oo000o
    public final int OoooOOO(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull o0O0O00.OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.OooOoo(i);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return p048OoooooO.o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0O0O00.oo000o
    public final int Oooooo(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull o0O0O00.OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.OooOooO(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O0o)) {
            return false;
        }
        o0O0o o0o0o = (o0O0o) obj;
        return Intrinsics.areEqual(this.f709Oooo0o, o0o0o.f709Oooo0o) && this.f710Oooo0oO == o0o0o.f710Oooo0oO && this.f711Oooo0oo == o0o0o.f711Oooo0oo && Intrinsics.areEqual(this.f708Oooo, o0o0o.f708Oooo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final int hashCode() {
        int iHashCode = this.f709Oooo0o.hashCode() * 31;
        boolean z = this.f710Oooo0oO;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.f711Oooo0oo;
        return this.f708Oooo.hashCode() + ((i + (z2 ? 1 : z2)) * 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ScrollingLayoutModifier(scrollerState=");
        sbOooO0o0.append(this.f709Oooo0o);
        sbOooO0o0.append(", isReversed=");
        sbOooO0o0.append(this.f710Oooo0oO);
        sbOooO0o0.append(", isVertical=");
        sbOooO0o0.append(this.f711Oooo0oo);
        sbOooO0o0.append(", overscrollEffect=");
        sbOooO0o0.append(this.f708Oooo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
