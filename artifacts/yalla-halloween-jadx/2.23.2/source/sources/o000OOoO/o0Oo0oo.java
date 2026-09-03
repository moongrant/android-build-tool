package o000OOoO;

import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o0Oo0oo implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f34721OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f34722OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f34723OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f34724OooO0Oo;

    public o0Oo0oo(long j, long[] jArr, long[] jArr2) {
        p080o000OoO.o00Oo0.OooO00o(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f34724OooO0Oo = z;
        if (!z || jArr2[0] <= 0) {
            this.f34721OooO00o = jArr;
            this.f34722OooO0O0 = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f34721OooO00o = jArr3;
            long[] jArr4 = new long[i];
            this.f34722OooO0O0 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f34723OooO0OO = j;
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f34723OooO0OO;
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        if (!this.f34724OooO0Oo) {
            o000000O o000000o2 = o000000O.f34701OooO0OO;
            return new o000000.OooO00o(o000000o2, o000000o2);
        }
        long[] jArr = this.f34722OooO0O0;
        int iOooO0o = o00.OooO0o(jArr, j, true);
        long j2 = jArr[iOooO0o];
        long[] jArr2 = this.f34721OooO00o;
        o000000O o000000o3 = new o000000O(j2, jArr2[iOooO0o]);
        if (j2 == j || iOooO0o == jArr.length - 1) {
            return new o000000.OooO00o(o000000o3, o000000o3);
        }
        int i = iOooO0o + 1;
        return new o000000.OooO00o(o000000o3, new o000000O(jArr[i], jArr2[i]));
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return this.f34724OooO0Oo;
    }
}
