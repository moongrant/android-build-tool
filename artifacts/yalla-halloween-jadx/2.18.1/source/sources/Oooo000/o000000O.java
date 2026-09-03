package Oooo000;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends Lambda implements Function1<p145o00Oo0.o0000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Float> f842Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Float> f843Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<p145o00Oo0.o00O00> f844Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(oO0Oo<Float> oo0oo, oO0Oo<Float> oo0oo2, oO0Oo<p145o00Oo0.o00O00> oo0oo3) {
        super(1);
        this.f842Oooo0o = oo0oo;
        this.f843Oooo0oO = oo0oo2;
        this.f844Oooo0oo = oo0oo3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p145o00Oo0.o0000 o0000Var) {
        p145o00Oo0.o0000 graphicsLayer = o0000Var;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.OooO0O0(this.f842Oooo0o.getValue().floatValue());
        graphicsLayer.OooOO0o(this.f843Oooo0oO.getValue().floatValue());
        graphicsLayer.OooOO0(this.f843Oooo0oO.getValue().floatValue());
        graphicsLayer.Ooooooo(this.f844Oooo0oo.getValue().f32114OooO00o);
        return Unit.INSTANCE;
    }
}
