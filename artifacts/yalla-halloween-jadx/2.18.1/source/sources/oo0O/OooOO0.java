package oo0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f53340OooO00o;

    public final void OooO00o(long j) {
        if (j == 0) {
            return;
        }
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis) > 3000) {
            this.f53340OooO00o = jCurrentTimeMillis;
        } else {
            this.f53340OooO00o = 0L;
        }
    }
}
