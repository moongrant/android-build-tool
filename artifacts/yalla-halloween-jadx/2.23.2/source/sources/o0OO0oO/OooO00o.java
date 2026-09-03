package o0OO0oO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f42496OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f42497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f42498OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO00o f42499OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f42500OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o[] f42501OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f42502OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f42503OooO0O0;

    static {
        OooO00o oooO00o = new OooO00o(0, false);
        f42496OooO0OO = oooO00o;
        OooO00o oooO00o2 = new OooO00o(1, true);
        OooO00o oooO00o3 = new OooO00o(2, false);
        f42497OooO0Oo = oooO00o3;
        OooO00o oooO00o4 = new OooO00o(3, true);
        OooO00o oooO00o5 = new OooO00o(4, false);
        f42499OooO0o0 = oooO00o5;
        OooO00o oooO00o6 = new OooO00o(5, true);
        OooO00o oooO00o7 = new OooO00o(6, false);
        f42498OooO0o = oooO00o7;
        OooO00o oooO00o8 = new OooO00o(7, true);
        OooO00o oooO00o9 = new OooO00o(8, false);
        OooO00o oooO00o10 = new OooO00o(9, true);
        f42500OooO0oO = oooO00o10;
        f42501OooO0oo = new OooO00o[]{oooO00o, oooO00o2, oooO00o3, oooO00o4, oooO00o5, oooO00o6, oooO00o7, oooO00o8, oooO00o9, oooO00o10, new OooO00o(10, false), new OooO00o(10, true)};
    }

    public OooO00o(int i, boolean z) {
        this.f42502OooO00o = i;
        this.f42503OooO0O0 = z;
    }

    public final boolean OooO00o(OooO00o oooO00o) {
        int i = oooO00o.f42502OooO00o;
        int i2 = this.f42502OooO00o;
        return i2 < i || ((!this.f42503OooO0O0 || f42500OooO0oO == this) && i2 == i);
    }

    public final OooO00o OooO0O0() {
        if (!this.f42503OooO0O0) {
            return this;
        }
        OooO00o oooO00o = f42501OooO0oo[this.f42502OooO00o - 1];
        return !oooO00o.f42503OooO0O0 ? oooO00o : f42496OooO0OO;
    }
}
