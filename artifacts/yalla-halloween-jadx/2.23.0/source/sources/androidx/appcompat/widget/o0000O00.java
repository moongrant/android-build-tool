package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f3241OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f3242OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f3243OooO0OO = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f3244OooO0Oo = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f3246OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f3245OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f3247OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f3248OooO0oo = false;

    public final void OooO00o(int i, int i2) {
        this.f3243OooO0OO = i;
        this.f3244OooO0Oo = i2;
        this.f3248OooO0oo = true;
        if (this.f3247OooO0oO) {
            if (i2 != Integer.MIN_VALUE) {
                this.f3241OooO00o = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f3242OooO0O0 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f3241OooO00o = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f3242OooO0O0 = i2;
        }
    }
}
