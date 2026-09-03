package p028Oooo0o0;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o0000O0O.OooO0O0;
import o0000O0O.OooO0OO;
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
public final class oo0o0O0 extends o00O00 implements oo000o {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Direction f2233Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f2234Oooo0oo;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2235Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001) {
            super(1);
            this.f2235Oooo0o = o000o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o000O000.OooO00o.OooO0oO(layout, this.f2235Oooo0o, 0, 0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 4, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(@NotNull Direction direction, float f, @NotNull Function1<? super o00O000o, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f2233Oooo0oO = direction;
        this.f2234Oooo0oo = f;
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
        int iOooOO0;
        int iOooO0oo;
        int iOooO0oO;
        int iCoerceIn;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (!OooO0O0.OooO0Oo(j) || this.f2233Oooo0oO == Direction.Vertical) {
            iOooOO0 = OooO0O0.OooOO0(j);
            iOooO0oo = OooO0O0.OooO0oo(j);
        } else {
            iOooOO0 = RangesKt.coerceIn(MathKt.roundToInt(OooO0O0.OooO0oo(j) * this.f2234Oooo0oo), OooO0O0.OooOO0(j), OooO0O0.OooO0oo(j));
            iOooO0oo = iOooOO0;
        }
        if (!OooO0O0.OooO0OO(j) || this.f2233Oooo0oO == Direction.Horizontal) {
            int iOooO = OooO0O0.OooO(j);
            iOooO0oO = OooO0O0.OooO0oO(j);
            iCoerceIn = iOooO;
        } else {
            iCoerceIn = RangesKt.coerceIn(MathKt.roundToInt(OooO0O0.OooO0oO(j) * this.f2234Oooo0oo), OooO0O0.OooO(j), OooO0O0.OooO0oO(j));
            iOooO0oO = iCoerceIn;
        }
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0OO.OooO00o(iOooOO0, iOooO0oo, iCoerceIn, iOooO0oO));
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO00o(o000o000Oooo000));
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
        if (obj instanceof oo0o0O0) {
            oo0o0O0 oo0o0o0 = (oo0o0O0) obj;
            if (this.f2233Oooo0oO == oo0o0o0.f2233Oooo0oO) {
                if (this.f2234Oooo0oo == oo0o0o0.f2234Oooo0oo) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2234Oooo0oo) + (this.f2233Oooo0oO.hashCode() * 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
