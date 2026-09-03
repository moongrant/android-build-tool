package p048OoooooO;

import Oooo000.OooO0O0;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o extends o00O00 implements oo000o {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final float f4201Oooo0oO;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000O000 f4202Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0o f4203Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000O000 o000o001, o0O0o o0o0o) {
            super(1);
            this.f4202Oooo0o = o000o001;
            this.f4203Oooo0oO = o0o0o;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            layout.OooO0OO(this.f4202Oooo0o, 0, 0, this.f4203Oooo0oO.f4201Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0O0o() {
        Function1<o00O000o, Unit> inspectorInfo = o00oOoo.f6560OooO00o;
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        super(inspectorInfo);
        this.f4201Oooo0oO = 1.0f;
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
        return measure.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooO00o(o000o000Oooo000, this));
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
        o0O0o o0o0o = obj instanceof o0O0o ? (o0O0o) obj : null;
        return o0o0o != null && this.f4201Oooo0oO == o0o0o.f4201Oooo0oO;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4201Oooo0oO);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }

    @NotNull
    public final String toString() {
        return OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("ZIndexModifier(zIndex="), this.f4201Oooo0oO, ')');
    }
}
