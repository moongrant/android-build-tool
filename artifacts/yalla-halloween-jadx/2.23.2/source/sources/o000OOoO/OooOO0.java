package o000OOoO;

import androidx.compose.animation.core.AnimationKt;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class OooOO0 implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f34668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f34669OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f34670OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f34671OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f34672OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f34673OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f34674OooO0oO;

    public OooOO0(int i, int i2, long j, long j2, boolean z) {
        this.f34668OooO00o = j;
        this.f34669OooO0O0 = j2;
        this.f34670OooO0OO = i2 == -1 ? 1 : i2;
        this.f34673OooO0o0 = i;
        this.f34674OooO0oO = z;
        if (j == -1) {
            this.f34671OooO0Oo = -1L;
            this.f34672OooO0o = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f34671OooO0Oo = j3;
            this.f34672OooO0o = ((Math.max(0L, j3) * 8) * AnimationKt.MillisToNanos) / ((long) i);
        }
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f34672OooO0o;
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        long j2 = this.f34671OooO0Oo;
        long j3 = this.f34669OooO0O0;
        if (j2 == -1 && !this.f34674OooO0oO) {
            o000000O o000000o2 = new o000000O(0L, j3);
            return new o000000.OooO00o(o000000o2, o000000o2);
        }
        int i = this.f34673OooO0o0;
        long j4 = this.f34670OooO0OO;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = ((Math.max(0L, jMax - j3) * 8) * AnimationKt.MillisToNanos) / ((long) i);
        o000000O o000000o3 = new o000000O(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = j4 + jMax;
            if (j5 < this.f34668OooO00o) {
                return new o000000.OooO00o(o000000o3, new o000000O(((Math.max(0L, j5 - j3) * 8) * AnimationKt.MillisToNanos) / ((long) i), j5));
            }
        }
        return new o000000.OooO00o(o000000o3, o000000o3);
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return this.f34671OooO0Oo != -1 || this.f34674OooO0oO;
    }
}
