package p209o00o0oo0;

import java.util.Arrays;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oOO00O implements o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39562OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f39563OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long[] f39564OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long[] f39565OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f39566OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f39567OooO0o0;

    public oOO00O(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f39563OooO0O0 = iArr;
        this.f39564OooO0OO = jArr;
        this.f39565OooO0Oo = jArr2;
        this.f39567OooO0o0 = jArr3;
        int length = iArr.length;
        this.f39562OooO00o = length;
        if (length > 0) {
            this.f39566OooO0o = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f39566OooO0o = 0L;
        }
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39566OooO0o;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        long[] jArr = this.f39567OooO0o0;
        int iOooO0o = o0O00.OooO0o(jArr, j, true);
        long j2 = jArr[iOooO0o];
        long[] jArr2 = this.f39564OooO0OO;
        oo0O oo0o = new oo0O(j2, jArr2[iOooO0o]);
        if (j2 >= j || iOooO0o == this.f39562OooO00o - 1) {
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }
        int i = iOooO0o + 1;
        return new o00OO0OO.OooO00o(oo0o, new oo0O(jArr[i], jArr2[i]));
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return true;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f39562OooO00o + ", sizes=" + Arrays.toString(this.f39563OooO0O0) + ", offsets=" + Arrays.toString(this.f39564OooO0OO) + ", timeUs=" + Arrays.toString(this.f39567OooO0o0) + ", durationsUs=" + Arrays.toString(this.f39565OooO0Oo) + ")";
    }
}
