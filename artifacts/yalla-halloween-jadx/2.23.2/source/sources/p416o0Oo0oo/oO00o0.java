package p416o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oO00o0 extends oO00Oo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double f46479OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f46480OooO0o0;

    public oO00o0(String str) {
        this.f46474OooO00o = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f46479OooO0Oo = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.f46480OooO0o0 = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // p416o0Oo0oo.oO00Oo00
    public final double OooO00o(double d) {
        double d2 = this.f46480OooO0o0;
        double d3 = this.f46479OooO0Oo;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }

    @Override // p416o0Oo0oo.oO00Oo00
    public final double OooO0O0(double d) {
        double d2 = this.f46480OooO0o0;
        double d3 = this.f46479OooO0Oo;
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
