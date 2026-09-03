package p023Oooo00O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00 extends Lambda implements Function1<Double, Double> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ double f1030Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ double f1031Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ double f1032Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ double f1033Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(double d, double d2, double d3, double d4) {
        super(1);
        this.f1031Oooo0o = d;
        this.f1032Oooo0oO = d2;
        this.f1033Oooo0oo = d3;
        this.f1030Oooo = d4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        return Double.valueOf((Math.exp(this.f1033Oooo0oo * dDoubleValue) * ((this.f1032Oooo0oO * dDoubleValue) + this.f1031Oooo0o)) + this.f1030Oooo);
    }
}
