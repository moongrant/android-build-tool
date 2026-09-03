package p032OoooO0;

import androidx.compose.foundation.gestures.Orientation;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import o0000O0O.OooO0O0;
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
import p054o00000oo.o00OOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000o0 implements oo000o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Function0<o0O000> f3347Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final oo00oO f3348Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f3349Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o00OOO0 f3350Oooo0oo;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f3351Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f3352Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O000o0 f3353Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000O000 f3354Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00000O0 o00000o1, o0O000o0 o0o000o1, o000O000 o000o001, int i) {
            super(1);
            this.f3352Oooo0o = o00000o1;
            this.f3353Oooo0oO = o0o000o1;
            this.f3354Oooo0oo = o000o001;
            this.f3351Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o00000O0 o00000o1 = this.f3352Oooo0o;
            o0O000o0 o0o000o1 = this.f3353Oooo0oO;
            int i = o0o000o1.f3349Oooo0oO;
            o00OOO0 o00ooo1 = o0o000o1.f3350Oooo0oo;
            o0O000 o0o000Invoke = o0o000o1.f3347Oooo.invoke();
            this.f3353Oooo0oO.f3348Oooo0o.OooO0o0(Orientation.Vertical, o00Oo00.OooO00o(o00000o1, i, o00ooo1, o0o000Invoke != null ? o0o000Invoke.f3314OooO00o : null, false, this.f3354Oooo0oo.f35265Oooo0o), this.f3351Oooo, this.f3354Oooo0oo.f35266Oooo0oO);
            o000O000.OooO00o.OooO0oO(layout, this.f3354Oooo0oo, 0, MathKt.roundToInt(-this.f3353Oooo0oO.f3348Oooo0o.OooO0O0()), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public o0O000o0(@NotNull oo00oO scrollerPosition, int i, @NotNull o00OOO0 transformedText, @NotNull Function0<o0O000> textLayoutResultProvider) {
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(transformedText, "transformedText");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        this.f3348Oooo0o = scrollerPosition;
        this.f3349Oooo0oO = i;
        this.f3350Oooo0oo = transformedText;
        this.f3347Oooo = textLayoutResultProvider;
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
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0O0.OooO00o(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(o000o000Oooo000.f35266Oooo0oO, OooO0O0.OooO0oO(j));
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, iMin, MapsKt.emptyMap(), new OooO00o(measure, this, o000o000Oooo000, iMin));
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
        if (!(obj instanceof o0O000o0)) {
            return false;
        }
        o0O000o0 o0o000o1 = (o0O000o0) obj;
        return Intrinsics.areEqual(this.f3348Oooo0o, o0o000o1.f3348Oooo0o) && this.f3349Oooo0oO == o0o000o1.f3349Oooo0oO && Intrinsics.areEqual(this.f3350Oooo0oo, o0o000o1.f3350Oooo0oo) && Intrinsics.areEqual(this.f3347Oooo, o0o000o1.f3347Oooo);
    }

    public final int hashCode() {
        return this.f3347Oooo.hashCode() + ((this.f3350Oooo0oo.hashCode() + (((this.f3348Oooo0o.hashCode() * 31) + this.f3349Oooo0oO) * 31)) * 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("VerticalScrollLayoutModifier(scrollerPosition=");
        sbOooO0o0.append(this.f3348Oooo0o);
        sbOooO0o0.append(", cursorOffset=");
        sbOooO0o0.append(this.f3349Oooo0oO);
        sbOooO0o0.append(", transformedText=");
        sbOooO0o0.append(this.f3350Oooo0oo);
        sbOooO0o0.append(", textLayoutResultProvider=");
        sbOooO0o0.append(this.f3347Oooo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
