package p057o0000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 extends o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f27611OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f27612OooO0o0;

    public o0000O00(String str) {
        this.f27561OooO00o = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f27611OooO0Oo = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.f27612OooO0o0 = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // p057o0000Oo0.o000000O
    public final double OooO00o(double d) {
        double d2 = this.f27612OooO0o0;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * this.f27611OooO0Oo) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * this.f27611OooO0Oo));
    }

    @Override // p057o0000Oo0.o000000O
    public final double OooO0O0(double d) {
        double d2 = this.f27612OooO0o0;
        if (d < d2) {
            double d3 = this.f27611OooO0Oo;
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = this.f27611OooO0Oo;
        double d7 = d2 - 1.0d;
        double d8 = (((d2 - d) * (-d6)) - d) + 1.0d;
        return ((d7 * d6) * d7) / (d8 * d8);
    }
}
