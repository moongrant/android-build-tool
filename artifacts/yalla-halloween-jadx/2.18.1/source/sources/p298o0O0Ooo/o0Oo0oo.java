package p298o0O0Ooo;

import com.google.android.exoplayer2.extractor.mp3.OooO00o;
import p296o0O0OoO0.o0O0O00;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f35973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f35974OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35975OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f35976OooO0Oo;

    public o0Oo0oo(long[] jArr, long[] jArr2, long j, long j2) {
        this.f35973OooO00o = jArr;
        this.f35974OooO0O0 = jArr2;
        this.f35975OooO0OO = j;
        this.f35976OooO0Oo = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO00o() {
        return this.f35976OooO0Oo;
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final boolean OooO0O0() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.OooO00o
    public final long OooO0OO(long j) {
        return this.f35973OooO00o[o000OOo0.OooO0o0(this.f35974OooO0O0, j, true)];
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final oo0o0Oo.OooO00o OooO0oO(long j) {
        int iOooO0o0 = o000OOo0.OooO0o0(this.f35973OooO00o, j, true);
        long[] jArr = this.f35973OooO00o;
        long j2 = jArr[iOooO0o0];
        long[] jArr2 = this.f35974OooO0O0;
        o0O0O00 o0o0o00 = new o0O0O00(j2, jArr2[iOooO0o0]);
        if (j2 >= j || iOooO0o0 == jArr.length - 1) {
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }
        int i = iOooO0o0 + 1;
        return new oo0o0Oo.OooO00o(o0o0o00, new o0O0O00(jArr[i], jArr2[i]));
    }

    @Override // p296o0O0OoO0.oo0o0Oo
    public final long OooO0oo() {
        return this.f35975OooO0OO;
    }
}
