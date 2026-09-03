package Oooo000;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 extends Lambda implements Function1<p145o00Oo0.o0000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Float> f832Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(oO0Oo<Float> oo0oo) {
        super(1);
        this.f832Oooo0o = oo0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p145o00Oo0.o0000 o0000Var) {
        p145o00Oo0.o0000 graphicsLayer = o0000Var;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.OooO0O0(this.f832Oooo0o.getValue().floatValue());
        return Unit.INSTANCE;
    }
}
