package p557o0oOOooO;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f56170OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f56171OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f56172OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f56173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f56174OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f56175OooO0o0 = 0;

    public interface OooO00o {
        void OooO00o(int i, int i2, int i3, String str);
    }

    public oO0O000o(OooO00o oooO00o) {
        this.f56174OooO0o = oooO00o;
    }

    public final void OooO00o(long j) {
        OooO00o oooO00o;
        long j2 = this.f56175OooO0o0;
        if (j2 != 0 && j - j2 > 20 && (oooO00o = this.f56174OooO0o) != null) {
            oooO00o.OooO00o(this.f56170OooO00o, this.f56171OooO0O0, this.f56172OooO0OO, this.f56173OooO0Oo);
        }
        this.f56175OooO0o0 = 0L;
    }
}
