package p023Oooo00O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0000 extends Lambda implements Function1<Double, Double> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ double f1124Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ double f1125Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ double f1126Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(double d, double d2, double d3) {
        super(1);
        this.f1124Oooo0o = d;
        this.f1125Oooo0oO = d2;
        this.f1126Oooo0oo = d3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        double d2 = this.f1124Oooo0o;
        double d3 = this.f1125Oooo0oO;
        double d4 = dDoubleValue * d3;
        return Double.valueOf(Math.exp(d4) * ((this.f1126Oooo0oo * d3) + ((((double) 1) + d4) * d2)));
    }
}
