package Oooo000;

import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lambda implements Function3<o0O0O00.o00000O0, o0O0O00.o0O0O00, o0000O0O.OooO0O0, o0O0O00.o000000O> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000OOo f803Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(o000OOo o000ooo2) {
        super(3);
        this.f803Oooo0o = o000ooo2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o0O0O00.o000000O invoke(o0O0O00.o00000O0 o00000o1, o0O0O00.o0O0O00 o0o0o00, o0000O0O.OooO0O0 oooO0O0) {
        o0O0O00.o00000O0 layout = o00000o1;
        o0O0O00.o0O0O00 measurable = o0o0o00;
        long j = oooO0O0.f27302OooO00o;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
        return layout.OooOooo(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO, MapsKt.emptyMap(), new OooOO0(o000o000Oooo000, this.f803Oooo0o));
    }
}
