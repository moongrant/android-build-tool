package p296o0O0OoO0;

import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f35931OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f35932OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35933OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f35934OooO0Oo;

    public o0Oo0oo(long[] jArr, long[] jArr2, long j) {
        o00000O0.OooO00o(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f35934OooO0Oo = z;
        if (!z || jArr2[0] <= 0) {
            this.f35931OooO00o = jArr;
            this.f35932OooO0O0 = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f35931OooO00o = jArr3;
            long[] jArr4 = new long[i];
            this.f35932OooO0O0 = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f35933OooO0OO = j;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return this.f35934OooO0Oo;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        if (!this.f35934OooO0Oo) {
            o0O0O00 o0o0o00 = o0O0O00.f35926OooO0OO;
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }
        int iOooO0o0 = o000OOo0.OooO0o0(this.f35932OooO0O0, j, true);
        long[] jArr = this.f35932OooO0O0;
        long j2 = jArr[iOooO0o0];
        long[] jArr2 = this.f35931OooO00o;
        o0O0O00 o0o0o01 = new o0O0O00(j2, jArr2[iOooO0o0]);
        if (j2 == j || iOooO0o0 == jArr.length - 1) {
            return new oo0o0Oo.OooO00o(o0o0o01, o0o0o01);
        }
        int i = iOooO0o0 + 1;
        return new oo0o0Oo.OooO00o(o0o0o01, new o0O0O00(jArr[i], jArr2[i]));
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f35933OooO0OO;
    }
}
