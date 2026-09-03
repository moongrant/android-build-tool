package p028Oooo0o0;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.ui.platform.o00O00;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.unit.LayoutDirection;
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
import o0000O0O.OooOo;
import o0000O0O.o000oOoO;
import o0000O0O.o0OoOo0;
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
public final class o0OO00OO extends o00O00 implements oo000o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Function2<o000oOoO, LayoutDirection, OooOo> f2195Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Direction f2196Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f2197Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final Object f2198OoooO00;

    public static final class OooO00o extends Lambda implements Function1<o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f2199Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f2201Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000O000 f2202Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f2203OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, o000O000 o000o001, int i2, o00000O0 o00000o1) {
            super(1);
            this.f2201Oooo0oO = i;
            this.f2202Oooo0oo = o000o001;
            this.f2199Oooo = i2;
            this.f2203OoooO00 = o00000o1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o000O000.OooO00o oooO00o) {
            o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Function2<o000oOoO, LayoutDirection, OooOo> function2 = o0OO00OO.this.f2195Oooo;
            int i = this.f2201Oooo0oO;
            o000O000 o000o001 = this.f2202Oooo0oo;
            layout.OooO0o0(this.f2202Oooo0oo, function2.invoke(new o000oOoO(o0OoOo0.OooO00o(i - o000o001.f35265Oooo0o, this.f2199Oooo - o000o001.f35266Oooo0oO)), this.f2203OoooO00.getLayoutDirection()).f27312OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OO00OO(@NotNull Direction direction, boolean z, @NotNull Function2<? super o000oOoO, ? super LayoutDirection, OooOo> alignmentCallback, @NotNull Object align, @NotNull Function1<? super o00O000o, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(alignmentCallback, "alignmentCallback");
        Intrinsics.checkNotNullParameter(align, "align");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f2196Oooo0oO = direction;
        this.f2197Oooo0oo = z;
        this.f2195Oooo = alignmentCallback;
        this.f2198OoooO00 = align;
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
        Direction direction = this.f2196Oooo0oO;
        Direction direction2 = Direction.Vertical;
        int iOooOO0 = direction != direction2 ? 0 : OooO0O0.OooOO0(j);
        Direction direction3 = this.f2196Oooo0oO;
        Direction direction4 = Direction.Horizontal;
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0OO.OooO00o(iOooOO0, (this.f2196Oooo0oO == direction2 || !this.f2197Oooo0oo) ? OooO0O0.OooO0oo(j) : Integer.MAX_VALUE, direction3 == direction4 ? OooO0O0.OooO(j) : 0, (this.f2196Oooo0oO == direction4 || !this.f2197Oooo0oo) ? OooO0O0.OooO0oO(j) : Integer.MAX_VALUE));
        int iCoerceIn = RangesKt.coerceIn(o000o000Oooo000.f35265Oooo0o, OooO0O0.OooOO0(j), OooO0O0.OooO0oo(j));
        int iCoerceIn2 = RangesKt.coerceIn(o000o000Oooo000.f35266Oooo0oO, OooO0O0.OooO(j), OooO0O0.OooO0oO(j));
        return measure.OooOooo(iCoerceIn, iCoerceIn2, MapsKt.emptyMap(), new OooO00o(iCoerceIn, o000o000Oooo000, iCoerceIn2, measure));
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
        if (!(obj instanceof o0OO00OO)) {
            return false;
        }
        o0OO00OO o0oo00oo2 = (o0OO00OO) obj;
        return this.f2196Oooo0oO == o0oo00oo2.f2196Oooo0oO && this.f2197Oooo0oo == o0oo00oo2.f2197Oooo0oo && Intrinsics.areEqual(this.f2198OoooO00, o0oo00oo2.f2198OoooO00);
    }

    public final int hashCode() {
        return this.f2198OoooO00.hashCode() + (((this.f2196Oooo0oO.hashCode() * 31) + (this.f2197Oooo0oo ? 1231 : 1237)) * 31);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
