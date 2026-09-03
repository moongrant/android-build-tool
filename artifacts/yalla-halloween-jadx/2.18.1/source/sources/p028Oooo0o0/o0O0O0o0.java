package p028Oooo0o0;

import Oooo000.o000O00O;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o0000O0O.OooO;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;
import o0000O0O.OooOOO0;
import o0O0O00.OooOOOO;
import o0O0O00.OooOo00;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import o0O0O00.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O0o0 extends o00O00 implements oo000o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float f2154Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f2155Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f2156Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final boolean f2157OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final float f2158OoooO00;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2159Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001) {
            super(1);
            this.f2159Oooo0o = o000o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000O000.OooO00o.OooO0oO(layout, this.f2159Oooo0o, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0O0O0o0(float f, float f2, float f3, float f4, boolean z, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, z);
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
    }

    public final long OooO0O0(OooO oooO) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        int i = 0;
        int iOoooooO = !OooOOO0.OooO00o(this.f2154Oooo, Float.NaN) ? oooO.OoooooO(((OooOOO0) RangesKt.coerceAtLeast(new OooOOO0(this.f2154Oooo), new OooOOO0(0))).f27306Oooo0o) : Integer.MAX_VALUE;
        int iOoooooO2 = !OooOOO0.OooO00o(this.f2158OoooO00, Float.NaN) ? oooO.OoooooO(((OooOOO0) RangesKt.coerceAtLeast(new OooOOO0(this.f2158OoooO00), new OooOOO0(0))).f27306Oooo0o) : Integer.MAX_VALUE;
        if (OooOOO0.OooO00o(this.f2155Oooo0oO, Float.NaN) || (iCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(oooO.OoooooO(this.f2155Oooo0oO), iOoooooO), 0)) == Integer.MAX_VALUE) {
            iCoerceAtLeast = 0;
        }
        if (!OooOOO0.OooO00o(this.f2156Oooo0oo, Float.NaN) && (iCoerceAtLeast2 = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(oooO.OoooooO(this.f2156Oooo0oo), iOoooooO2), 0)) != Integer.MAX_VALUE) {
            i = iCoerceAtLeast2;
        }
        return OooO0OO.OooO00o(iCoerceAtLeast, iOoooooO, i, iOoooooO2);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.oo000o
    public final int Oooo000(@NotNull OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jOooO0O0 = OooO0O0(oooOo00);
        return OooO0O0.OooO0o0(jOooO0O0) ? OooO0O0.OooO0oO(jOooO0O0) : OooO0OO.OooO0o0(jOooO0O0, measurable.OooOOO(i));
    }

    @Override // o0O0O00.oo000o
    public final int OoooO(@NotNull OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jOooO0O0 = OooO0O0(oooOo00);
        return OooO0O0.OooO0o0(jOooO0O0) ? OooO0O0.OooO0oO(jOooO0O0) : OooO0OO.OooO0o0(jOooO0O0, measurable.OoooO(i));
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o000000O OoooO0(@NotNull o00000O0 measure, @NotNull o0O0O00 measurable, long j) {
        long jOooO00o;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jOooO0O0 = OooO0O0(measure);
        if (this.f2157OoooO0) {
            jOooO00o = OooO0OO.OooO0Oo(j, jOooO0O0);
        } else {
            jOooO00o = OooO0OO.OooO00o(!OooOOO0.OooO00o(this.f2155Oooo0oO, Float.NaN) ? OooO0O0.OooOO0(jOooO0O0) : RangesKt.coerceAtMost(OooO0O0.OooOO0(j), OooO0O0.OooO0oo(jOooO0O0)), !OooOOO0.OooO00o(this.f2154Oooo, Float.NaN) ? OooO0O0.OooO0oo(jOooO0O0) : RangesKt.coerceAtLeast(OooO0O0.OooO0oo(j), OooO0O0.OooOO0(jOooO0O0)), !OooOOO0.OooO00o(this.f2156Oooo0oo, Float.NaN) ? OooO0O0.OooO(jOooO0O0) : RangesKt.coerceAtMost(OooO0O0.OooO(j), OooO0O0.OooO0oO(jOooO0O0)), !OooOOO0.OooO00o(this.f2158OoooO00, Float.NaN) ? OooO0O0.OooO0oO(jOooO0O0) : RangesKt.coerceAtLeast(OooO0O0.OooO0oO(j), OooO0O0.OooO(jOooO0O0)));
        }
        o000O000 o000o000Oooo000 = measurable.Oooo000(jOooO00o);
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO00o(o000o000Oooo000));
    }

    @Override // o0O0O00.oo000o
    public final int OoooOOO(@NotNull OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jOooO0O0 = OooO0O0(oooOo00);
        return OooO0O0.OooO0o(jOooO0O0) ? OooO0O0.OooO0oo(jOooO0O0) : OooO0OO.OooO0o(jOooO0O0, measurable.OooOoo(i));
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0O0O00.oo000o
    public final int Oooooo(@NotNull OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jOooO0O0 = OooO0O0(oooOo00);
        return OooO0O0.OooO0o(jOooO0O0) ? OooO0O0.OooO0oo(jOooO0O0) : OooO0OO.OooO0o(jOooO0O0, measurable.OooOooO(i));
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o0O0O0o0)) {
            return false;
        }
        o0O0O0o0 o0o0o0o0 = (o0O0O0o0) obj;
        return OooOOO0.OooO00o(this.f2155Oooo0oO, o0o0o0o0.f2155Oooo0oO) && OooOOO0.OooO00o(this.f2156Oooo0oo, o0o0o0o0.f2156Oooo0oo) && OooOOO0.OooO00o(this.f2154Oooo, o0o0o0o0.f2154Oooo) && OooOOO0.OooO00o(this.f2158OoooO00, o0o0o0o0.f2158OoooO00) && this.f2157OoooO0 == o0o0o0o0.f2157OoooO0;
    }

    public final int hashCode() {
        return o000O00O.OooO00o(this.f2158OoooO00, o000O00O.OooO00o(this.f2154Oooo, o000O00O.OooO00o(this.f2156Oooo0oo, Float.floatToIntBits(this.f2155Oooo0oO) * 31, 31), 31), 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    public o0O0O0o0(float f, float f2, float f3, float f4, boolean z) {
        super(o00oOoo.f6560OooO00o);
        this.f2155Oooo0oO = f;
        this.f2156Oooo0oo = f2;
        this.f2154Oooo = f3;
        this.f2158OoooO00 = f4;
        this.f2157OoooO0 = z;
    }
}
