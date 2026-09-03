package p213o00oO00O;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000O00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f39648OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f39649OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39650OooO0OO;

    public o0000O00(long j, long[] jArr, long[] jArr2) {
        this.f39648OooO00o = jArr;
        this.f39649OooO0O0 = jArr2;
        this.f39650OooO0OO = j == -9223372036854775807L ? o0O00.Oooo0O0(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair<Long, Long> OooO0O0(long j, long[] jArr, long[] jArr2) {
        int iOooO0o = o0O00.OooO0o(jArr, j, true);
        long j2 = jArr[iOooO0o];
        long j3 = jArr2[iOooO0o];
        int i = iOooO0o + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39650OooO0OO;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o(long j) {
        return o0O00.Oooo0O0(((Long) OooO0O0(j, this.f39648OooO00o, this.f39649OooO0O0).second).longValue());
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        Pair<Long, Long> pairOooO0O0 = OooO0O0(o0O00.OoooOO0(o0O00.OooOO0(j, 0L, this.f39650OooO0OO)), this.f39649OooO0O0, this.f39648OooO00o);
        oo0O oo0o = new oo0O(o0O00.Oooo0O0(((Long) pairOooO0O0.first).longValue()), ((Long) pairOooO0O0.second).longValue());
        return new o00OO0OO.OooO00o(oo0o, oo0o);
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return -1L;
    }
}
