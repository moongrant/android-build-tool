package p413o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double f45322OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f45323OooO0o0;

    public o00oO0o(String str) {
        this.f45281OooO00o = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f45322OooO0Oo = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.f45323OooO0o0 = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // p413o0Oo0oo.Oooo0
    public final double OooO00o(double d) {
        double d2 = this.f45323OooO0o0;
        double d3 = this.f45322OooO0Oo;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }

    @Override // p413o0Oo0oo.Oooo0
    public final double OooO0O0(double d) {
        double d2 = this.f45323OooO0o0;
        double d3 = this.f45322OooO0Oo;
        if (d < d2) {
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = d2 - 1.0d;
        double d7 = (((d2 - d) * (-d3)) - d) + 1.0d;
        return ((d6 * d3) * d6) / (d7 * d7);
    }
}
