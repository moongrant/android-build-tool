package p213o00oO00O;

import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000oo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f39651OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f39652OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39653OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39654OooO0Oo;

    public o0000oo(long[] jArr, long[] jArr2, long j, long j2) {
        this.f39651OooO00o = jArr;
        this.f39652OooO0O0 = jArr2;
        this.f39653OooO0OO = j;
        this.f39654OooO0Oo = j2;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39653OooO0OO;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o(long j) {
        return this.f39651OooO00o[o0O00.OooO0o(this.f39652OooO0O0, j, true)];
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        long[] jArr = this.f39651OooO00o;
        int iOooO0o = o0O00.OooO0o(jArr, j, true);
        long j2 = jArr[iOooO0o];
        long[] jArr2 = this.f39652OooO0O0;
        oo0O oo0o = new oo0O(j2, jArr2[iOooO0o]);
        if (j2 >= j || iOooO0o == jArr.length - 1) {
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }
        int i = iOooO0o + 1;
        return new o00OO0OO.OooO00o(oo0o, new oo0O(jArr[i], jArr2[i]));
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return this.f39654OooO0Oo;
    }
}
