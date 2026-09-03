package p025Oooo0O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o0OO00O.OooO0O0;
import o0OO00O.OooO0OO;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends Lambda implements Function2<o0Oo0oo, Float, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f1709Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f1710Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(OooO0O0 oooO0O0, Ref.FloatRef floatRef) {
        super(2);
        this.f1709Oooo0o = oooO0O0;
        this.f1710Oooo0oO = floatRef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(o0Oo0oo o0oo0oo2, Float f) {
        o0Oo0oo event = o0oo0oo2;
        float fFloatValue = f.floatValue();
        Intrinsics.checkNotNullParameter(event, "event");
        OooO0OO.OooO0O0(this.f1709Oooo0o, event);
        event.OooO00o();
        this.f1710Oooo0oO.element = fFloatValue;
        return Unit.INSTANCE;
    }
}
