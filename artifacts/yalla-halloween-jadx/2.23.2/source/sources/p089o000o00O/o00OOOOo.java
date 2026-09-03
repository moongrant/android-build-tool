package p089o000o00O;

import androidx.media3.extractor.mp3.OooO00o;
import o000OOoO.o000000;
import o000OOoO.o000000O;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOOo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long[] f35035OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long[] f35036OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35037OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f35038OooO0Oo;

    public o00OOOOo(long[] jArr, long[] jArr2, long j, long j2) {
        this.f35035OooO00o = jArr;
        this.f35036OooO0O0 = jArr2;
        this.f35037OooO0OO = j;
        this.f35038OooO0Oo = j2;
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f35037OooO0OO;
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        long[] jArr = this.f35035OooO00o;
        int iOooO0o = o00.OooO0o(jArr, j, true);
        long j2 = jArr[iOooO0o];
        long[] jArr2 = this.f35036OooO0O0;
        o000000O o000000o2 = new o000000O(j2, jArr2[iOooO0o]);
        if (j2 >= j || iOooO0o == jArr.length - 1) {
            return new o000000.OooO00o(o000000o2, o000000o2);
        }
        int i = iOooO0o + 1;
        return new o000000.OooO00o(o000000o2, new o000000O(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return this.f35038OooO0Oo;
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.OooO00o
    public final long OooO0oo(long j) {
        return this.f35035OooO00o[o00.OooO0o(this.f35036OooO0O0, j, true)];
    }
}
