package p708oo000o;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends Lambda implements Function4<Float, Float, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f53253Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(OooOOO0 oooOOO0) {
        super(4);
        this.f53253Oooo0o = oooOOO0;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(Float f, Float f2, oOO00O ooo00o, Integer num) {
        f.floatValue();
        f2.floatValue();
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            o0OOO0o.OooO00o(this.f53253Oooo0o.f53100OooO0o, null, ooo00o2, 0, 2);
        }
        return Unit.INSTANCE;
    }
}
