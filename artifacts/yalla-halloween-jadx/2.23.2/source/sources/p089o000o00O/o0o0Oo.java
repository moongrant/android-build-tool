package p089o000o00O;

import android.util.Pair;
import androidx.media3.extractor.mp3.OooO00o;
import o000OOoO.o000000;
import o000OOoO.o000000O;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0o0Oo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f35045OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f35046OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35047OooO0OO;

    public o0o0Oo(long j, long[] jArr, long[] jArr2) {
        this.f35045OooO00o = jArr;
        this.f35046OooO0O0 = jArr2;
        this.f35047OooO0OO = j == -9223372036854775807L ? o00.Oooo0OO(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair<Long, Long> OooO00o(long j, long[] jArr, long[] jArr2) {
        int iOooO0o = o00.OooO0o(jArr, j, true);
        long j2 = jArr[iOooO0o];
        long j3 = jArr2[iOooO0o];
        int i = iOooO0o + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f35047OooO0OO;
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        Pair<Long, Long> pairOooO00o = OooO00o(o00.o000oOoO(o00.OooOO0(j, 0L, this.f35047OooO0OO)), this.f35046OooO0O0, this.f35045OooO00o);
        o000000O o000000o2 = new o000000O(o00.Oooo0OO(((Long) pairOooO00o.first).longValue()), ((Long) pairOooO00o.second).longValue());
        return new o000000.OooO00o(o000000o2, o000000o2);
    }

    @Override // androidx.media3.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return -1L;
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.OooO00o
    public final long OooO0oo(long j) {
        return o00.Oooo0OO(((Long) OooO00o(j, this.f35045OooO00o, this.f35046OooO0O0).second).longValue());
    }
}
