package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f5313OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f5314OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f5315OooO0OO = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f5316OooO0Oo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f5318OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f5317OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f5319OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f5320OooO0oo = false;

    public final void OooO00o(int i, int i2) {
        this.f5315OooO0OO = i;
        this.f5316OooO0Oo = i2;
        this.f5320OooO0oo = true;
        if (this.f5319OooO0oO) {
            if (i2 != Integer.MIN_VALUE) {
                this.f5313OooO00o = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f5314OooO0O0 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f5313OooO00o = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5314OooO0O0 = i2;
        }
    }
}
