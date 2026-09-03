package p150o00Oo0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f32185OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f32186OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f32187OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f32188OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o f32189OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f32190OooO0o0 = 0;

    public interface OooO00o {
        void OooO00o(int i, int i2, int i3, String str);
    }

    public o00Ooo(OooO00o oooO00o) {
        this.f32189OooO0o = oooO00o;
    }

    public final void OooO00o(long j) {
        OooO00o oooO00o;
        long j2 = this.f32190OooO0o0;
        if (j2 != 0 && j - j2 > 20 && (oooO00o = this.f32189OooO0o) != null) {
            oooO00o.OooO00o(this.f32185OooO00o, this.f32186OooO0O0, this.f32187OooO0OO, this.f32188OooO0Oo);
        }
        this.f32190OooO0o0 = 0L;
    }
}
