package p442o0OoOo0;

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
import kotlin.math.MathKt;
import o000000.o00O0O;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;
import o0000O0O.o0OoOo0;
import o00O0O.OooOo;
import o00O0O.OooOo00;
import o0O0O00.OooOO0;
import o0O0O00.OooOOOO;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o000O0Oo;
import o0O0O00.o0O0O00;
import o0O0O00.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p145o00Oo0.o00000O;
import p191o00o0O.o00oO0o;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends o00O00 implements oo000o, o00O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o00OO0O0 f40218Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o000OO0O f40219Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f40220Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final float f40221OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final OooOO0 f40222OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public final o00000O f40223OoooO0O;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f40224Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001) {
            super(1);
            this.f40224Oooo0o = o000o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000O000.OooO00o.OooO0oO(layout, this.f40224Oooo0o, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0ooOOo(@NotNull o000OO0O painter, boolean z, @NotNull o00OO0O0 alignment, @NotNull OooOO0 contentScale, float f, @Nullable o00000O o00000o) {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f40219Oooo0oO = painter;
        this.f40220Oooo0oo = z;
        this.f40218Oooo = alignment;
        this.f40222OoooO00 = contentScale;
        this.f40221OoooO0 = f;
        this.f40223OoooO0O = o00000o;
    }

    public final boolean OooO0O0() {
        if (this.f40220Oooo0oo) {
            long jOooO0oo = this.f40219Oooo0oO.OooO0oo();
            OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
            if (jOooO0oo != OooOo00.f30418OooO0Oo) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0OO(long j) {
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        if (!OooOo00.OooO00o(j, OooOo00.f30418OooO0Oo)) {
            float fOooO0O0 = OooOo00.OooO0O0(j);
            if ((Float.isInfinite(fOooO0O0) || Float.isNaN(fOooO0O0)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0Oo(long j) {
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        if (!OooOo00.OooO00o(j, OooOo00.f30418OooO0Oo)) {
            float fOooO0Oo = OooOo00.OooO0Oo(j);
            if ((Float.isInfinite(fOooO0Oo) || Float.isNaN(fOooO0Oo)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    public final long OooO0o0(long j) {
        boolean z = OooO0O0.OooO0Oo(j) && OooO0O0.OooO0OO(j);
        boolean z2 = OooO0O0.OooO0o(j) && OooO0O0.OooO0o0(j);
        if ((!OooO0O0() && z) || z2) {
            return OooO0O0.OooO00o(j, OooO0O0.OooO0oo(j), 0, OooO0O0.OooO0oO(j), 0, 10);
        }
        long jOooO0oo = this.f40219Oooo0oO.OooO0oo();
        long jOooO00o = OooOo.OooO00o(OooO0OO.OooO0o(j, OooO0Oo(jOooO0oo) ? MathKt.roundToInt(OooOo00.OooO0Oo(jOooO0oo)) : OooO0O0.OooOO0(j)), OooO0OO.OooO0o0(j, OooO0OO(jOooO0oo) ? MathKt.roundToInt(OooOo00.OooO0O0(jOooO0oo)) : OooO0O0.OooO(j)));
        if (OooO0O0()) {
            long jOooO00o2 = OooOo.OooO00o(!OooO0Oo(this.f40219Oooo0oO.OooO0oo()) ? OooOo00.OooO0Oo(jOooO00o) : OooOo00.OooO0Oo(this.f40219Oooo0oO.OooO0oo()), !OooO0OO(this.f40219Oooo0oO.OooO0oo()) ? OooOo00.OooO0O0(jOooO00o) : OooOo00.OooO0O0(this.f40219Oooo0oO.OooO0oo()));
            if (OooOo00.OooO0Oo(jOooO00o) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
                jOooO00o = OooOo00.f30417OooO0OO;
            } else {
                if (OooOo00.OooO0O0(jOooO00o) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    OooOo00.OooO00o oooO00o2 = OooOo00.f30416OooO0O0;
                    jOooO00o = OooOo00.f30417OooO0OO;
                } else {
                    jOooO00o = o000O0Oo.OooO0O0(jOooO00o2, this.f40222OoooO00.OooO00o(jOooO00o2, jOooO00o));
                }
            }
        }
        return OooO0O0.OooO00o(j, OooO0OO.OooO0o(j, MathKt.roundToInt(OooOo00.OooO0Oo(jOooO00o))), 0, OooO0OO.OooO0o0(j, MathKt.roundToInt(OooOo00.OooO0O0(jOooO00o))), 0, 10);
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
    public final int Oooo000(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!OooO0O0()) {
            return measurable.OooOOO(i);
        }
        long jOooO0o0 = OooO0o0(OooO0OO.OooO0O0(i, 0, 13));
        return Math.max(OooO0O0.OooO(jOooO0o0), measurable.OooOOO(i));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070  */
    @Override // p442o0OoOo0.o00O0O
    public final void Oooo0o(@NotNull o00oO0o o00oo0o2) {
        long jOooO0O0;
        Intrinsics.checkNotNullParameter(o00oo0o2, "<this>");
        long jOooO0oo = this.f40219Oooo0oO.OooO0oo();
        long jOooO00o = OooOo.OooO00o(OooO0Oo(jOooO0oo) ? OooOo00.OooO0Oo(jOooO0oo) : OooOo00.OooO0Oo(((o00O0O) o00oo0o2).OooO0OO()), OooO0OO(jOooO0oo) ? OooOo00.OooO0O0(jOooO0oo) : OooOo00.OooO0O0(((o00O0O) o00oo0o2).OooO0OO()));
        o00O0O o00o0o2 = (o00O0O) o00oo0o2;
        if (OooOo00.OooO0Oo(o00o0o2.OooO0OO()) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
            jOooO0O0 = OooOo00.f30417OooO0OO;
        } else {
            if (OooOo00.OooO0O0(o00o0o2.OooO0OO()) == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                OooOo00.OooO00o oooO00o2 = OooOo00.f30416OooO0O0;
                jOooO0O0 = OooOo00.f30417OooO0OO;
            } else {
                jOooO0O0 = o000O0Oo.OooO0O0(jOooO00o, this.f40222OoooO00.OooO00o(jOooO00o, o00o0o2.OooO0OO()));
            }
        }
        long j = jOooO0O0;
        long jOooO00o2 = this.f40218Oooo.OooO00o(o0OoOo0.OooO00o(MathKt.roundToInt(OooOo00.OooO0Oo(j)), MathKt.roundToInt(OooOo00.OooO0O0(j))), o0OoOo0.OooO00o(MathKt.roundToInt(OooOo00.OooO0Oo(o00o0o2.OooO0OO())), MathKt.roundToInt(OooOo00.OooO0O0(o00o0o2.OooO0OO()))), o00o0o2.getLayoutDirection());
        o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27310OooO0O0;
        float f = (int) (jOooO00o2 >> 32);
        float fOooO0OO = o0000O0O.OooOo.OooO0OO(jOooO00o2);
        o00o0o2.f26649Oooo0o.f33068Oooo0oO.f33074OooO00o.OooO0O0(f, fOooO0OO);
        this.f40219Oooo0oO.OooO0oO(o00oo0o2, j, this.f40221OoooO0, this.f40223OoooO0O);
        o00o0o2.f26649Oooo0o.f33068Oooo0oO.f33074OooO00o.OooO0O0(-f, -fOooO0OO);
        o00o0o2.o0ooOOo();
    }

    @Override // o0O0O00.oo000o
    public final int OoooO(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!OooO0O0()) {
            return measurable.OoooO(i);
        }
        long jOooO0o0 = OooO0o0(OooO0OO.OooO0O0(i, 0, 13));
        return Math.max(OooO0O0.OooO(jOooO0o0), measurable.OoooO(i));
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o000000O OoooO0(@NotNull o00000O0 measure, @NotNull o0O0O00 measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0o0(j));
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO00o(o000o000Oooo000));
    }

    @Override // o0O0O00.oo000o
    public final int OoooOOO(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!OooO0O0()) {
            return measurable.OooOoo(i);
        }
        long jOooO0o0 = OooO0o0(OooO0OO.OooO0O0(0, i, 7));
        return Math.max(OooO0O0.OooOO0(jOooO0o0), measurable.OooOoo(i));
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // o0O0O00.oo000o
    public final int Oooooo(@NotNull o0O0O00.OooOo00 oooOo00, @NotNull OooOOOO measurable, int i) {
        Intrinsics.checkNotNullParameter(oooOo00, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!OooO0O0()) {
            return measurable.OooOooO(i);
        }
        long jOooO0o0 = OooO0o0(OooO0OO.OooO0O0(0, i, 7));
        return Math.max(OooO0O0.OooOO0(jOooO0o0), measurable.OooOooO(i));
    }

    public final boolean equals(@Nullable Object obj) {
        o0ooOOo o0ooooo2 = obj instanceof o0ooOOo ? (o0ooOOo) obj : null;
        if (o0ooooo2 != null && Intrinsics.areEqual(this.f40219Oooo0oO, o0ooooo2.f40219Oooo0oO) && this.f40220Oooo0oo == o0ooooo2.f40220Oooo0oo && Intrinsics.areEqual(this.f40218Oooo, o0ooooo2.f40218Oooo) && Intrinsics.areEqual(this.f40222OoooO00, o0ooooo2.f40222OoooO00)) {
            return ((this.f40221OoooO0 > o0ooooo2.f40221OoooO0 ? 1 : (this.f40221OoooO0 == o0ooooo2.f40221OoooO0 ? 0 : -1)) == 0) && Intrinsics.areEqual(this.f40223OoooO0O, o0ooooo2.f40223OoooO0O);
        }
        return false;
    }

    public final int hashCode() {
        int iOooO00o = o000O00O.OooO00o(this.f40221OoooO0, (this.f40222OoooO00.hashCode() + ((this.f40218Oooo.hashCode() + (((this.f40219Oooo0oO.hashCode() * 31) + (this.f40220Oooo0oo ? 1231 : 1237)) * 31)) * 31)) * 31, 31);
        o00000O o00000o = this.f40223OoooO0O;
        return iOooO00o + (o00000o != null ? o00000o.hashCode() : 0);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PainterModifier(painter=");
        sbOooO0o0.append(this.f40219Oooo0oO);
        sbOooO0o0.append(", sizeToIntrinsics=");
        sbOooO0o0.append(this.f40220Oooo0oo);
        sbOooO0o0.append(", alignment=");
        sbOooO0o0.append(this.f40218Oooo);
        sbOooO0o0.append(", alpha=");
        sbOooO0o0.append(this.f40221OoooO0);
        sbOooO0o0.append(", colorFilter=");
        sbOooO0o0.append(this.f40223OoooO0O);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
