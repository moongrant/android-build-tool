package p298o0O0Ooo;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p296o0O0OoO0.o0O0O00;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f35970OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f35971OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35972OooO0OO;

    public o0OOO0o(long[] jArr, long[] jArr2, long j) {
        this.f35970OooO00o = jArr;
        this.f35971OooO0O0 = jArr2;
        this.f35972OooO0OO = j == -9223372036854775807L ? C.OooO00o(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair<Long, Long> OooO0Oo(long j, long[] jArr, long[] jArr2) {
        int iOooO0o0 = o000OOo0.OooO0o0(jArr, j, true);
        long j2 = jArr[iOooO0o0];
        long j3 = jArr2[iOooO0o0];
        int i = iOooO0o0 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o() {
        return -1L;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0OO(long j) {
        return C.OooO00o(((Long) OooO0Oo(j, this.f35970OooO00o, this.f35971OooO0O0).second).longValue());
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        Pair<Long, Long> pairOooO0Oo = OooO0Oo(C.OooO0O0(o000OOo0.OooO(j, 0L, this.f35972OooO0OO)), this.f35971OooO0O0, this.f35970OooO00o);
        o0O0O00 o0o0o00 = new o0O0O00(C.OooO00o(((Long) pairOooO0Oo.first).longValue()), ((Long) pairOooO0Oo.second).longValue());
        return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f35972OooO0OO;
    }
}
