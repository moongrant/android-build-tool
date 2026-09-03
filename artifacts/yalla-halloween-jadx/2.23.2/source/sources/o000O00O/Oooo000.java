package o000O00O;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Oooo000 implements o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f33985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f33986OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f33987OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f33988OooO0Oo = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f33990OooO0o0 = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f33991OooO0oO = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f33992OooO0oo = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33994OooOO0O = 0.97f;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33993OooOO0 = 1.03f;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33995OooOO0o = 1.0f;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f33997OooOOO0 = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f33989OooO0o = -9223372036854775807L;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f33984OooO = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f33996OooOOO = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f33998OooOOOO = -9223372036854775807L;

    public Oooo000(long j, long j2, float f) {
        this.f33985OooO00o = j;
        this.f33986OooO0O0 = j2;
        this.f33987OooO0OO = f;
    }

    public final void OooO00o() {
        long j = this.f33988OooO0Oo;
        if (j != -9223372036854775807L) {
            long j2 = this.f33990OooO0o0;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f33991OooO0oO;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f33992OooO0oo;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f33989OooO0o == j) {
            return;
        }
        this.f33989OooO0o = j;
        this.f33984OooO = j;
        this.f33996OooOOO = -9223372036854775807L;
        this.f33998OooOOOO = -9223372036854775807L;
        this.f33997OooOOO0 = -9223372036854775807L;
    }
}
