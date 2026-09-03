package p032OoooO0;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import o0000O0O.OooO0O0;
import o0000O0O.o000oOoO;
import o0O0O00.o000000O;
import o0O0O00.o00000O0;
import o0O0O00.o000O000;
import o0O0O00.o0O0O00;
import p028Oooo0o0.o0O0o000;
import p028Oooo0o0.oo0o0O0;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends Lambda implements Function3<o00000O0, o0O0O00, OooO0O0, o000000O> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f2992Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(o0oOOo o0oooo2) {
        super(3);
        this.f2992Oooo0o = o0oooo2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o000000O invoke(o00000O0 o00000o1, o0O0O00 o0o0o00, OooO0O0 oooO0O0) {
        o00000O0 layout = o00000o1;
        o0O0O00 measurable = o0o0o00;
        long j = oooO0O0.f27302OooO00o;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o00OOOO0.OooO00o defaultMinSize = o00OOOO0.OooO00o.f4198Oooo0o;
        oo0o0O0 oo0o0o0 = SizeKt.f5763OooO00o;
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o0O0o000 other = new o0O0o000(Float.NaN, Float.NaN);
        Intrinsics.checkNotNullParameter(other, "other");
        long j2 = this.f2992Oooo0o.f3386OooO0o;
        o000O000 o000o000Oooo000 = measurable.Oooo000(OooO0O0.OooO00o(j, RangesKt.coerceIn((int) (j2 >> 32), OooO0O0.OooOO0(j), OooO0O0.OooO0oo(j)), 0, RangesKt.coerceIn(o000oOoO.OooO0O0(j2), OooO0O0.OooO(j), OooO0O0.OooO0oO(j)), 0, 10));
        return layout.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new o0O0o(o000o000Oooo000));
    }
}
