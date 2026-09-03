package p089o000o00O;

import androidx.annotation.Nullable;
import androidx.media3.extractor.mp3.OooO00o;
import o000OOoO.o000000;
import o000OOoO.o000000O;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f35039OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35040OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35041OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f35042OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final long[] f35043OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f35044OooO0o0;

    public o00Oo00(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f35039OooO00o = j;
        this.f35040OooO0O0 = i;
        this.f35041OooO0OO = j2;
        this.f35043OooO0o = jArr;
        this.f35042OooO0Oo = j3;
        this.f35044OooO0o0 = j3 != -1 ? j + j3 : -1L;
    }

    @Override // o000OOoO.o000000
    public final long OooO() {
        return this.f35041OooO0OO;
    }

    @Override // o000OOoO.o000000
    public final o000000.OooO00o OooO0Oo(long j) {
        double d;
        boolean zOooO0oO = OooO0oO();
        int i = this.f35040OooO0O0;
        long j2 = this.f35039OooO00o;
        if (!zOooO0oO) {
            o000000O o000000o2 = new o000000O(0L, j2 + ((long) i));
            return new o000000.OooO00o(o000000o2, o000000o2);
        }
        long jOooOO0 = o00.OooOO0(j, 0L, this.f35041OooO0OO);
        double d2 = (jOooOO0 * 100.0d) / this.f35041OooO0OO;
        double d3 = 0.0d;
        if (d2 <= 0.0d) {
            d = 256.0d;
        } else if (d2 >= 100.0d) {
            d = 256.0d;
            d3 = 256.0d;
        } else {
            int i2 = (int) d2;
            long[] jArr = this.f35043OooO0o;
            o00Oo0.OooO0o(jArr);
            double d4 = jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d4) * (d2 - ((double) i2))) + d4;
            d = 256.0d;
        }
        double d5 = d3 / d;
        long j3 = this.f35042OooO0Oo;
        o000000O o000000o3 = new o000000O(jOooOO0, j2 + o00.OooOO0(Math.round(d5 * j3), i, j3 - 1));
        return new o000000.OooO00o(o000000o3, o000000o3);
    }

    @Override // androidx.media3.extractor.mp3.OooO00o
    public final long OooO0o0() {
        return this.f35044OooO0o0;
    }

    @Override // o000OOoO.o000000
    public final boolean OooO0oO() {
        return this.f35043OooO0o != null;
    }

    @Override // androidx.media3.extractor.mp3.OooO00o
    public final long OooO0oo(long j) {
        long j2 = j - this.f35039OooO00o;
        if (!OooO0oO() || j2 <= this.f35040OooO0O0) {
            return 0L;
        }
        long[] jArr = this.f35043OooO0o;
        o00Oo0.OooO0o(jArr);
        double d = (j2 * 256.0d) / this.f35042OooO0Oo;
        int iOooO0o = o00.OooO0o(jArr, (long) d, true);
        long j3 = this.f35041OooO0OO;
        long j4 = (((long) iOooO0o) * j3) / 100;
        long j5 = jArr[iOooO0o];
        int i = iOooO0o + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iOooO0o == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }
}
