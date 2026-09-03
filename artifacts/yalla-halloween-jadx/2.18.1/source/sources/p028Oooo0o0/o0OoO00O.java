package p028Oooo0o0;

import Oooo000.o000O00O;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO0OO;
import o0000O0O.OooOOO0;
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
public final class o0OoO00O extends o00O00 implements oo000o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float f2204Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f2205Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f2206Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final boolean f2207OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final float f2208OoooO00;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2210Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f2211Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001, o00000O0 o00000o1) {
            super(1);
            this.f2210Oooo0oO = o000o001;
            this.f2211Oooo0oo = o00000o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o0OoO00O o0ooo00o2 = o0OoO00O.this;
            if (o0ooo00o2.f2207OoooO0) {
                o000O000.OooO00o.OooO0oO(layout, this.f2210Oooo0oO, this.f2211Oooo0oo.OoooooO(o0ooo00o2.f2205Oooo0oO), this.f2211Oooo0oo.OoooooO(o0OoO00O.this.f2206Oooo0oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            } else {
                layout.OooO0OO(this.f2210Oooo0oO, this.f2211Oooo0oo.OoooooO(o0ooo00o2.f2205Oooo0oO), this.f2211Oooo0oo.OoooooO(o0OoO00O.this.f2206Oooo0oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            return Unit.INSTANCE;
        }
    }

    public o0OoO00O(float f, float f2, float f3, float f4) {
        super(o00oOoo.f6560OooO00o);
        this.f2205Oooo0oO = f;
        this.f2206Oooo0oo = f2;
        this.f2204Oooo = f3;
        this.f2208OoooO00 = f4;
        boolean z = true;
        this.f2207OoooO0 = true;
        if ((f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !OooOOO0.OooO00o(f, Float.NaN)) || ((f2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !OooOOO0.OooO00o(f2, Float.NaN)) || ((f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !OooOOO0.OooO00o(f3, Float.NaN)) || (f4 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && !OooOOO0.OooO00o(f4, Float.NaN))))) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
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
        int iOoooooO = measure.OoooooO(this.f2204Oooo) + measure.OoooooO(this.f2205Oooo0oO);
        int iOoooooO2 = measure.OoooooO(this.f2208OoooO00) + measure.OoooooO(this.f2206Oooo0oo);
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0OO.OooO0oO(j, -iOoooooO, -iOoooooO2));
        return measure.OooOooo(OooO0OO.OooO0o(j, o000o000Oooo000.f35265Oooo0o + iOoooooO), OooO0OO.OooO0o0(j, o000o000Oooo000.f35266Oooo0oO + iOoooooO2), MapsKt.emptyMap(), new OooO00o(o000o000Oooo000, measure));
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
        o0OoO00O o0ooo00o2 = obj instanceof o0OoO00O ? (o0OoO00O) obj : null;
        return o0ooo00o2 != null && OooOOO0.OooO00o(this.f2205Oooo0oO, o0ooo00o2.f2205Oooo0oO) && OooOOO0.OooO00o(this.f2206Oooo0oo, o0ooo00o2.f2206Oooo0oo) && OooOOO0.OooO00o(this.f2204Oooo, o0ooo00o2.f2204Oooo) && OooOOO0.OooO00o(this.f2208OoooO00, o0ooo00o2.f2208OoooO00) && this.f2207OoooO0 == o0ooo00o2.f2207OoooO0;
    }

    public final int hashCode() {
        return o000O00O.OooO00o(this.f2208OoooO00, o000O00O.OooO00o(this.f2204Oooo, o000O00O.OooO00o(this.f2206Oooo0oo, Float.floatToIntBits(this.f2205Oooo0oO) * 31, 31), 31), 31) + (this.f2207OoooO0 ? 1231 : 1237);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
