package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f34620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f34621OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long[] f34622OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long[] f34623OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f34624OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f34625OooO0o0;

    public OooO(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f34621OooO0O0 = iArr;
        this.f34622OooO0OO = jArr;
        this.f34623OooO0Oo = jArr2;
        this.f34625OooO0o0 = jArr3;
        int length = iArr.length;
        this.f34620OooO00o = length;
        if (length > 0) {
            this.f34624OooO0o = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f34624OooO0o = 0L;
        }
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f34624OooO0o;
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        long[] jArr = this.f34625OooO0o0;
        int iOooO0o = o00.OooO0o(jArr, j, true);
        long j2 = jArr[iOooO0o];
        long[] jArr2 = this.f34622OooO0OO;
        o000000O o000000o2 = new o000000O(j2, jArr2[iOooO0o]);
        if (j2 >= j || iOooO0o == this.f34620OooO00o - 1) {
            return new o000000.OooO00o(o000000o2, o000000o2);
        }
        int i = iOooO0o + 1;
        return new o000000.OooO00o(o000000o2, new o000000O(jArr[i], jArr2[i]));
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f34620OooO00o + ", sizes=" + Arrays.toString(this.f34621OooO0O0) + ", offsets=" + Arrays.toString(this.f34622OooO0OO) + ", timeUs=" + Arrays.toString(this.f34625OooO0o0) + ", durationsUs=" + Arrays.toString(this.f34623OooO0Oo) + ")";
    }
}
