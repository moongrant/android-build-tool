package p023Oooo00O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0ooO extends Lambda implements Function1<Double, Double> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ double f1202Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ double f1203Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ double f1204Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ double f1205Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ double f1206OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(double d, double d2, double d3, double d4, double d5) {
        super(1);
        this.f1203Oooo0o = d;
        this.f1204Oooo0oO = d2;
        this.f1205Oooo0oo = d3;
        this.f1202Oooo = d4;
        this.f1206OoooO00 = d5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        return Double.valueOf((Math.exp(this.f1202Oooo * dDoubleValue) * this.f1205Oooo0oo) + (Math.exp(this.f1204Oooo0oO * dDoubleValue) * this.f1203Oooo0o) + this.f1206OoooO00);
    }
}
