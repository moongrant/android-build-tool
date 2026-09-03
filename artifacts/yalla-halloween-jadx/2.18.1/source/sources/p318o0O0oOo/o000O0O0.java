package p318o0O0oOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f36725OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f36726OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile long f36727OooO0OO = -9223372036854775807L;

    public o000O0O0(long j) {
        OooO0Oo(j);
    }

    public final long OooO00o(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f36727OooO0OO != -9223372036854775807L) {
            this.f36727OooO0OO = j;
        } else {
            long j2 = this.f36725OooO00o;
            if (j2 != Long.MAX_VALUE) {
                this.f36726OooO0O0 = j2 - j;
            }
            synchronized (this) {
                this.f36727OooO0OO = j;
                notifyAll();
            }
        }
        return j + this.f36726OooO0O0;
    }

    public final long OooO0O0(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f36727OooO0OO != -9223372036854775807L) {
            long j2 = (this.f36727OooO0OO * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return OooO00o((j * 1000000) / 90000);
    }

    public final long OooO0OO() {
        if (this.f36725OooO00o == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f36727OooO0OO == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f36726OooO0O0;
    }

    public final synchronized void OooO0Oo(long j) {
        o00000O0.OooO0Oo(this.f36727OooO0OO == -9223372036854775807L);
        this.f36725OooO00o = j;
    }
}
