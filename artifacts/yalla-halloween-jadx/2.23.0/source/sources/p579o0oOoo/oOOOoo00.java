package p579o0oOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class oOOOoo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f56690OooO00o;

    public final void OooO00o(long j) {
        if (j == 0) {
            return;
        }
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis) > 3000) {
            this.f56690OooO00o = jCurrentTimeMillis;
        } else {
            this.f56690OooO00o = 0L;
        }
    }
}
