package p590o0oOooo0;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f57307OooO00o;

    public final void OooO00o(long j) {
        if (j == 0) {
            return;
        }
        long jCurrentTimeMillis = j - System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis) > 3000) {
            this.f57307OooO00o = jCurrentTimeMillis;
        } else {
            this.f57307OooO00o = 0L;
        }
    }
}
