package p209o00o0oo0;

import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OO00O implements o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f39544OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f39545OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39546OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f39547OooO0Oo;

    public o00OO00O(long j, long[] jArr, long[] jArr2) {
        o00O000o.OooO00o(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f39547OooO0Oo = z;
        if (!z || jArr2[0] <= 0) {
            this.f39544OooO00o = jArr;
            this.f39545OooO0O0 = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f39544OooO00o = jArr3;
            long[] jArr4 = new long[i];
            this.f39545OooO0O0 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f39546OooO0OO = j;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final long OooO() {
        return this.f39546OooO0OO;
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final o00OO0OO.OooO00o OooO0OO(long j) {
        if (!this.f39547OooO0Oo) {
            oo0O oo0o = oo0O.f39574OooO0OO;
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }
        long[] jArr = this.f39545OooO0O0;
        int iOooO0o = o0O00.OooO0o(jArr, j, true);
        long j2 = jArr[iOooO0o];
        long[] jArr2 = this.f39544OooO00o;
        oo0O oo0o2 = new oo0O(j2, jArr2[iOooO0o]);
        if (j2 == j || iOooO0o == jArr.length - 1) {
            return new o00OO0OO.OooO00o(oo0o2, oo0o2);
        }
        int i = iOooO0o + 1;
        return new o00OO0OO.OooO00o(oo0o2, new oo0O(jArr[i], jArr2[i]));
    }

    @Override // p209o00o0oo0.o00OO0OO
    public final boolean OooO0o() {
        return this.f39547OooO0Oo;
    }
}
