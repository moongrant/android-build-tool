package p023Oooo00O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo extends Lambda implements Function1<Double, Double> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ double f1190Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ double f1191Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ double f1192Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ double f1193Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(double d, double d2, double d3, double d4) {
        super(1);
        this.f1191Oooo0o = d;
        this.f1192Oooo0oO = d2;
        this.f1193Oooo0oo = d3;
        this.f1190Oooo = d4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        double d2 = this.f1191Oooo0o;
        double d3 = this.f1192Oooo0oO;
        double dExp = Math.exp(d3 * dDoubleValue) * d2 * d3;
        double d4 = this.f1193Oooo0oo;
        double d5 = this.f1190Oooo;
        return Double.valueOf((Math.exp(d5 * dDoubleValue) * d4 * d5) + dExp);
    }
}
