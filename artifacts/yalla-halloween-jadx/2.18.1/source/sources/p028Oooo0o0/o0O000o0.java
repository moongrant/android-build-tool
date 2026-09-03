package p028Oooo0o0;

import Oooo000.Oooo0;
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
public final class o0O000o0 extends o00O00 implements oo000o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f2119Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f2120Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f2121Oooo0oo;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2123Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f2124Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001, o00000O0 o00000o1) {
            super(1);
            this.f2123Oooo0oO = o000o001;
            this.f2124Oooo0oo = o00000o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o0O000o0 o0o000o1 = o0O000o0.this;
            if (o0o000o1.f2119Oooo) {
                o000O000.OooO00o.OooO0oO(layout, this.f2123Oooo0oO, this.f2124Oooo0oo.OoooooO(o0o000o1.f2120Oooo0oO), this.f2124Oooo0oo.OoooooO(o0O000o0.this.f2121Oooo0oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            } else {
                layout.OooO0OO(this.f2123Oooo0oO, this.f2124Oooo0oo.OoooooO(o0o000o1.f2120Oooo0oO), this.f2124Oooo0oo.OoooooO(o0O000o0.this.f2121Oooo0oo), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            return Unit.INSTANCE;
        }
    }

    public o0O000o0(float f, float f2) {
        super(o00oOoo.f6560OooO00o);
        this.f2120Oooo0oO = f;
        this.f2121Oooo0oo = f2;
        this.f2119Oooo = true;
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
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO00o(o000o000Oooo000, measure));
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
        if (this == obj) {
            return true;
        }
        o0O000o0 o0o000o1 = obj instanceof o0O000o0 ? (o0O000o0) obj : null;
        return o0o000o1 != null && OooOOO0.OooO00o(this.f2120Oooo0oO, o0o000o1.f2120Oooo0oO) && OooOOO0.OooO00o(this.f2121Oooo0oo, o0o000o1.f2121Oooo0oo) && this.f2119Oooo == o0o000o1.f2119Oooo;
    }

    public final int hashCode() {
        return o000O00O.OooO00o(this.f2121Oooo0oo, Float.floatToIntBits(this.f2120Oooo0oO) * 31, 31) + (this.f2119Oooo ? 1231 : 1237);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("OffsetModifier(x=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f2120Oooo0oO));
        sbOooO0o0.append(", y=");
        sbOooO0o0.append((Object) OooOOO0.OooO0O0(this.f2121Oooo0oo));
        sbOooO0o0.append(", rtlAware=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f2119Oooo, ')');
    }
}
