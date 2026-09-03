package p679oooo00o;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import o000OOoO.OooOO0O;
import o000OOoO.o000000;
import o000OOoO.o000000O;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOo000Oo implements oO0O000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f60440OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO0O000 f60441OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f60442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f60443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oO0O00O f60444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f60445OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f60446OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f60447OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f60448OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f60449OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f60450OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f60451OooOO0o;

    public final class OooO00o implements o000000 {
        public OooO00o() {
        }

        @Override // o000OOoO.o000000
        public final long OooO() {
            oOo000Oo ooo000oo = oOo000Oo.this;
            return (ooo000oo.f60445OooO0o * AnimationKt.MillisToNanos) / ((long) ooo000oo.f60444OooO0Oo.f60409OooO);
        }

        @Override // o000OOoO.o000000
        public final o000000.OooO00o OooO0Oo(long j) {
            oOo000Oo ooo000oo = oOo000Oo.this;
            BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) ooo000oo.f60444OooO0Oo.f60409OooO) * j) / AnimationKt.MillisToNanos);
            long j2 = ooo000oo.f60443OooO0OO;
            long j3 = ooo000oo.f60442OooO0O0;
            o000000O o000000o2 = new o000000O(j, o00.OooOO0((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(ooo000oo.f60445OooO0o)).longValue() + j3) - 30000, ooo000oo.f60442OooO0O0, j2 - 1));
            return new o000000.OooO00o(o000000o2, o000000o2);
        }

        @Override // o000OOoO.o000000
        public final boolean OooO0oO() {
            return true;
        }
    }

    public oOo000Oo(oO0O00O oo0o00o, long j, long j2, long j3, long j4, boolean z) {
        o00Oo0.OooO00o(j >= 0 && j2 > j);
        this.f60444OooO0Oo = oo0o00o;
        this.f60442OooO0O0 = j;
        this.f60443OooO0OO = j2;
        if (j3 == j2 - j || z) {
            this.f60445OooO0o = j4;
            this.f60446OooO0o0 = 4;
        } else {
            this.f60446OooO0o0 = 0;
        }
        this.f60441OooO00o = new oO0O000();
    }

    @Override // p679oooo00o.oO0O000o
    @Nullable
    public final o000000 OooO00o() {
        if (this.f60445OooO0o != 0) {
            return new OooO00o();
        }
        return null;
    }

    @Override // p679oooo00o.oO0O000o
    public final void OooO0O0(long j) {
        this.f60448OooO0oo = o00.OooOO0(j, 0L, this.f60445OooO0o - 1);
        this.f60446OooO0o0 = 2;
        this.f60440OooO = this.f60442OooO0O0;
        this.f60449OooOO0 = this.f60443OooO0OO;
        this.f60450OooOO0O = 0L;
        this.f60451OooOO0o = this.f60445OooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // p679oooo00o.oO0O000o
    public final long OooO0OO(OooOO0O oooOO0O) throws IOException {
        boolean z;
        long j;
        long jOooOO0;
        int i = this.f60446OooO0o0;
        long j2 = this.f60443OooO0OO;
        oO0O000 oo0o000 = this.f60441OooO00o;
        if (i == 0) {
            long j3 = oooOO0O.f34678OooO0Oo;
            this.f60447OooO0oO = j3;
            this.f60446OooO0o0 = 1;
            long j4 = j2 - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j5 = this.f60440OooO;
                long j6 = this.f60449OooOO0;
                if (j5 == j6) {
                    j = -1;
                    jOooOO0 = -1;
                } else {
                    long j7 = oooOO0O.f34678OooO0Oo;
                    if (oo0o000.OooO0O0(oooOO0O, j6)) {
                        oo0o000.OooO00o(oooOO0O, false);
                        oooOO0O.f34679OooO0o = 0;
                        long j8 = this.f60448OooO0oo;
                        long j9 = oo0o000.f60403OooO0O0;
                        long j10 = j8 - j9;
                        int i2 = oo0o000.f60405OooO0Oo + oo0o000.f60407OooO0o0;
                        if (0 > j10 || j10 >= 72000) {
                            if (j10 < 0) {
                                this.f60449OooOO0 = j7;
                                this.f60451OooOO0o = j9;
                            } else {
                                this.f60440OooO = oooOO0O.f34678OooO0Oo + ((long) i2);
                                this.f60450OooOO0O = j9;
                            }
                            long j11 = this.f60449OooOO0;
                            long j12 = this.f60440OooO;
                            if (j11 - j12 < 100000) {
                                this.f60449OooOO0 = j12;
                                jOooOO0 = j12;
                            } else {
                                jOooOO0 = o00.OooOO0((((j11 - j12) * j10) / (this.f60451OooOO0o - this.f60450OooOO0O)) + (oooOO0O.f34678OooO0Oo - (((long) i2) * (j10 <= 0 ? 2L : 1L))), j12, j11 - 1);
                            }
                        } else {
                            j = -1;
                            jOooOO0 = -1;
                        }
                    } else {
                        long j13 = this.f60440OooO;
                        if (j13 == j7) {
                            throw new IOException("No ogg page can be found.");
                        }
                        jOooOO0 = j13;
                    }
                    j = -1;
                }
                if (jOooOO0 != j) {
                    return jOooOO0;
                }
                this.f60446OooO0o0 = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j = -1;
            }
            while (true) {
                oo0o000.OooO0O0(oooOO0O, j);
                oo0o000.OooO00o(oooOO0O, false);
                if (oo0o000.f60403OooO0O0 > this.f60448OooO0oo) {
                    oooOO0O.f34679OooO0o = 0;
                    this.f60446OooO0o0 = 4;
                    return -(this.f60450OooOO0O + 2);
                }
                oooOO0O.OooOO0(oo0o000.f60405OooO0Oo + oo0o000.f60407OooO0o0);
                this.f60440OooO = oooOO0O.f34678OooO0Oo;
                this.f60450OooOO0O = oo0o000.f60403OooO0O0;
                j = -1;
            }
        }
        oo0o000.f60402OooO00o = 0;
        oo0o000.f60403OooO0O0 = 0L;
        oo0o000.f60404OooO0OO = 0;
        oo0o000.f60405OooO0Oo = 0;
        oo0o000.f60407OooO0o0 = 0;
        if (!oo0o000.OooO0O0(oooOO0O, -1L)) {
            throw new EOFException();
        }
        oo0o000.OooO00o(oooOO0O, false);
        oooOO0O.OooOO0(oo0o000.f60405OooO0Oo + oo0o000.f60407OooO0o0);
        long j14 = oo0o000.f60403OooO0O0;
        while ((oo0o000.f60402OooO00o & 4) != 4 && oo0o000.OooO0O0(oooOO0O, -1L) && oooOO0O.f34678OooO0Oo < j2 && oo0o000.OooO00o(oooOO0O, true)) {
            try {
                oooOO0O.OooOO0(oo0o000.f60405OooO0Oo + oo0o000.f60407OooO0o0);
                z = true;
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            j14 = oo0o000.f60403OooO0O0;
        }
        this.f60445OooO0o = j14;
        this.f60446OooO0o0 = 4;
        return this.f60447OooO0oO;
    }
}
