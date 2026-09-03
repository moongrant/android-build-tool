package p032OoooO0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
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
public final class o000OO implements oo000o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Function0<o0O000> f3064Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final oo00oO f3065Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f3066Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o00OOO0 f3067Oooo0oo;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f3068Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f3069Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000OO f3070Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000O000 f3071Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00000O0 o00000o1, o000OO o000oo2, o000O000 o000o001, int i) {
            super(1);
            this.f3069Oooo0o = o00000o1;
            this.f3070Oooo0oO = o000oo2;
            this.f3071Oooo0oo = o000o001;
            this.f3068Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o00000O0 o00000o1 = this.f3069Oooo0o;
            o000OO o000oo2 = this.f3070Oooo0oO;
            int i = o000oo2.f3066Oooo0oO;
            o00OOO0 o00ooo1 = o000oo2.f3067Oooo0oo;
            o0O000 o0o000Invoke = o000oo2.f3064Oooo.invoke();
            this.f3070Oooo0oO.f3065Oooo0o.OooO0o0(Orientation.Horizontal, o00Oo00.OooO00o(o00000o1, i, o00ooo1, o0o000Invoke != null ? o0o000Invoke.f3314OooO00o : null, this.f3069Oooo0o.getLayoutDirection() == LayoutDirection.Rtl, this.f3071Oooo0oo.f35265Oooo0o), this.f3068Oooo, this.f3071Oooo0oo.f35265Oooo0o);
            o000O000.OooO00o.OooO0oO(layout, this.f3071Oooo0oo, MathKt.roundToInt(-this.f3070Oooo0oO.f3065Oooo0o.OooO0O0()), 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    public o000OO(@NotNull oo00oO scrollerPosition, int i, @NotNull o00OOO0 transformedText, @NotNull Function0<o0O000> textLayoutResultProvider) {
        Intrinsics.checkNotNullParameter(scrollerPosition, "scrollerPosition");
        Intrinsics.checkNotNullParameter(transformedText, "transformedText");
        Intrinsics.checkNotNullParameter(textLayoutResultProvider, "textLayoutResultProvider");
        this.f3065Oooo0o = scrollerPosition;
        this.f3066Oooo0oO = i;
        this.f3067Oooo0oo = transformedText;
        this.f3064Oooo = textLayoutResultProvider;
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
        o000O000 o000o000Oooo000 = measurable.Oooo000(measurable.OooOooO(OooO0O0.OooO0oO(j)) < OooO0O0.OooO0oo(j) ? j : OooO0O0.OooO00o(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        int iMin = Math.min(o000o000Oooo000.f35265Oooo0o, OooO0O0.OooO0oo(j));
        return measure.OooOooo(iMin, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO00o(measure, this, o000o000Oooo000, iMin));
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
        if (!(obj instanceof o000OO)) {
            return false;
        }
        o000OO o000oo2 = (o000OO) obj;
        return Intrinsics.areEqual(this.f3065Oooo0o, o000oo2.f3065Oooo0o) && this.f3066Oooo0oO == o000oo2.f3066Oooo0oO && Intrinsics.areEqual(this.f3067Oooo0oo, o000oo2.f3067Oooo0oo) && Intrinsics.areEqual(this.f3064Oooo, o000oo2.f3064Oooo);
    }

    public final int hashCode() {
        return this.f3064Oooo.hashCode() + ((this.f3067Oooo0oo.hashCode() + (((this.f3065Oooo0o.hashCode() * 31) + this.f3066Oooo0oO) * 31)) * 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("HorizontalScrollLayoutModifier(scrollerPosition=");
        sbOooO0o0.append(this.f3065Oooo0o);
        sbOooO0o0.append(", cursorOffset=");
        sbOooO0o0.append(this.f3066Oooo0oO);
        sbOooO0o0.append(", transformedText=");
        sbOooO0o0.append(this.f3067Oooo0oo);
        sbOooO0o0.append(", textLayoutResultProvider=");
        sbOooO0o0.append(this.f3064Oooo);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
