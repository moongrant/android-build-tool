package p028Oooo0o0;

import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
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
public final class o0O0o000 extends o00O00 implements oo000o {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f2164Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f2165Oooo0oo;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2166Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001) {
            super(1);
            this.f2166Oooo0o = o000o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000O000.OooO00o.OooO0oO(layout, this.f2166Oooo0o, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public o0O0o000(float f, float f2) {
        super(o00oOoo.f6560OooO00o);
        this.f2164Oooo0oO = f;
        this.f2165Oooo0oo = f2;
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
        return RangesKt.coerceAtLeast(measurable.OooOOO(i), !OooOOO0.OooO00o(this.f2165Oooo0oo, Float.NaN) ? oooOo00.OoooooO(this.f2165Oooo0oo) : 0);
    }

    @Override // o0O0O00.oo000o
    public final int OoooO(@NotNull OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return RangesKt.coerceAtLeast(measurable.OoooO(i), !OooOOO0.OooO00o(this.f2165Oooo0oo, Float.NaN) ? oooOo00.OoooooO(this.f2165Oooo0oo) : 0);
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o000000O OoooO0(@NotNull o00000O0 measure, @NotNull o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0OO.OooO00o((OooOOO0.OooO00o(this.f2164Oooo0oO, Float.NaN) || OooO0O0.OooOO0(j) != 0) ? OooO0O0.OooOO0(j) : RangesKt.coerceAtLeast(RangesKt.coerceAtMost(measure.OoooooO(this.f2164Oooo0oO), OooO0O0.OooO0oo(j)), 0), OooO0O0.OooO0oo(j), (OooOOO0.OooO00o(this.f2165Oooo0oo, Float.NaN) || OooO0O0.OooO(j) != 0) ? OooO0O0.OooO(j) : RangesKt.coerceAtLeast(RangesKt.coerceAtMost(measure.OoooooO(this.f2165Oooo0oo), OooO0O0.OooO0oO(j)), 0), OooO0O0.OooO0oO(j)));
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO00o(o000o000Oooo000));
    }

    @Override // o0O0O00.oo000o
    public final int OoooOOO(@NotNull OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return RangesKt.coerceAtLeast(measurable.OooOoo(i), !OooOOO0.OooO00o(this.f2164Oooo0oO, Float.NaN) ? oooOo00.OoooooO(this.f2164Oooo0oO) : 0);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0O0O00.oo000o
    public final int Oooooo(@NotNull OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return RangesKt.coerceAtLeast(measurable.OooOooO(i), !OooOOO0.OooO00o(this.f2164Oooo0oO, Float.NaN) ? oooOo00.OoooooO(this.f2164Oooo0oO) : 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o0O0o000)) {
            return false;
        }
        o0O0o000 o0o0o000 = (o0O0o000) obj;
        return OooOOO0.OooO00o(this.f2164Oooo0oO, o0o0o000.f2164Oooo0oO) && OooOOO0.OooO00o(this.f2165Oooo0oo, o0o0o000.f2165Oooo0oo);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2165Oooo0oo) + (Float.floatToIntBits(this.f2164Oooo0oO) * 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
