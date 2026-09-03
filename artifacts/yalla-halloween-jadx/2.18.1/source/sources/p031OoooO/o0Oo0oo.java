package p031OoooO;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import o0O0O00.OooOOOO;
import o0O0O00.OooOo00;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o00Ooo;
import o0O0O00.o0O0O00;
import o0O0O00.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo implements oo000o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f2898Oooo0o;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f2899Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2900Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f2901Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, o000O000 o000o001, int i2) {
            super(1);
            this.f2899Oooo0o = i;
            this.f2900Oooo0oO = o000o001;
            this.f2901Oooo0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            layout.OooO0OO(this.f2900Oooo0oO, MathKt.roundToInt((this.f2899Oooo0o - this.f2900Oooo0oO.f35265Oooo0o) / 2.0f), MathKt.roundToInt((this.f2901Oooo0oo - this.f2900Oooo0oO.f35266Oooo0oO) / 2.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return Unit.INSTANCE;
        }
    }

    public o0Oo0oo(long j) {
        this.f2898Oooo0o = j;
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
    public final /* synthetic */ int Oooo000(OooOo00 oooOo00, OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO00o(this, oooOo00, oooOOOO, i);
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int OoooO(OooOo00 oooOo00, OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0OO(this, oooOo00, oooOOOO, i);
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o000000O OoooO0(@NotNull o00000O0 measure, @NotNull o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o000O000 o000o000Oooo000 = measurable.Oooo000(j);
        int iMax = Math.max(o000o000Oooo000.f35265Oooo0o, measure.OoooooO(o0000O0O.OooOo00.OooO0O0(this.f2898Oooo0o)));
        int iMax2 = Math.max(o000o000Oooo000.f35266Oooo0oO, measure.OoooooO(o0000O0O.OooOo00.OooO00o(this.f2898Oooo0o)));
        return measure.OooOooo(iMax, iMax2, MapsKt.emptyMap(), new OooO00o(iMax, o000o000Oooo000, iMax2));
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int OoooOOO(OooOo00 oooOo00, OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0Oo(this, oooOo00, oooOOOO, i);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0O0O00.oo000o
    public final /* synthetic */ int Oooooo(OooOo00 oooOo00, OooOOOO oooOOOO, int i) {
        return o00Ooo.OooO0O0(this, oooOo00, oooOOOO, i);
    }

    public final boolean equals(@Nullable Object obj) {
        o0Oo0oo o0oo0oo2 = obj instanceof o0Oo0oo ? (o0Oo0oo) obj : null;
        if (o0oo0oo2 == null) {
            return false;
        }
        long j = this.f2898Oooo0o;
        long j2 = o0oo0oo2.f2898Oooo0o;
        o0000O0O.OooOo00.OooO00o oooO00o = o0000O0O.OooOo00.f27313OooO0O0;
        return j == j2;
    }

    public final int hashCode() {
        return o0000O0O.OooOo00.OooO0OO(this.f2898Oooo0o);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
