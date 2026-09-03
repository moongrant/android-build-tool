package p585o0oOooOO;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f56781OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f56782OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f56783OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f56784OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f56785OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f56786OooO0o0 = 0;

    public interface OooO00o {
        void OooO00o(int i, int i2, int i3, String str);
    }

    public p(OooO00o oooO00o) {
        this.f56785OooO0o = oooO00o;
    }

    public final void OooO00o(long j) {
        OooO00o oooO00o;
        long j2 = this.f56786OooO0o0;
        if (j2 != 0 && j - j2 > 20 && (oooO00o = this.f56785OooO0o) != null) {
            oooO00o.OooO00o(this.f56781OooO00o, this.f56782OooO0O0, this.f56783OooO0OO, this.f56784OooO0Oo);
        }
        this.f56786OooO0o0 = 0L;
    }
}
