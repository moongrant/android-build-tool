package p225o00oOo;

import androidx.annotation.Nullable;
import androidx.compose.animation.core.AnimationKt;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.o00OO0OO;
import p209o00o0oo0.oo0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo0 implements o00Ooo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f39758OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f39759OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39760OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39761OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00oO0o f39762OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f39763OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f39764OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f39765OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f39766OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f39767OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f39768OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f39769OooOO0o;

    public final class OooO00o implements o00OO0OO {
        public OooO00o() {
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final long OooO() {
            Oooo0 oooo0 = Oooo0.this;
            return (oooo0.f39763OooO0o * AnimationKt.MillisToNanos) / ((long) oooo0.f39762OooO0Oo.f39789OooO);
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final o00OO0OO.OooO00o OooO0OO(long j) {
            Oooo0 oooo0 = Oooo0.this;
            BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) oooo0.f39762OooO0Oo.f39789OooO) * j) / AnimationKt.MillisToNanos);
            long j2 = oooo0.f39761OooO0OO;
            long j3 = oooo0.f39760OooO0O0;
            oo0O oo0o = new oo0O(j, o0O00.OooOO0((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(oooo0.f39763OooO0o)).longValue() + j3) - 30000, oooo0.f39760OooO0O0, j2 - 1));
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final boolean OooO0o() {
            return true;
        }
    }

    public Oooo0(o00oO0o o00oo0o2, long j, long j2, long j3, long j4, boolean z) {
        o00O000o.OooO00o(j >= 0 && j2 > j);
        this.f39762OooO0Oo = o00oo0o2;
        this.f39760OooO0O0 = j;
        this.f39761OooO0OO = j2;
        if (j3 == j2 - j || z) {
            this.f39763OooO0o = j4;
            this.f39764OooO0o0 = 4;
        } else {
            this.f39764OooO0o0 = 0;
        }
        this.f39759OooO00o = new o00Oo0();
    }

    @Override // p225o00oOo.o00Ooo
    @Nullable
    public final o00OO0OO OooO00o() {
        if (this.f39763OooO0o != 0) {
            return new OooO00o();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    @Override // p225o00oOo.o00Ooo
    public final long OooO0O0(o00O00o0 o00o00o1) throws IOException {
        boolean z;
        long j;
        long jOooOO0;
        int i = this.f39764OooO0o0;
        long j2 = this.f39761OooO0OO;
        o00Oo0 o00oo1 = this.f39759OooO00o;
        if (i == 0) {
            long j3 = o00o00o1.f39532OooO0Oo;
            this.f39765OooO0oO = j3;
            this.f39764OooO0o0 = 1;
            long j4 = j2 - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j5 = this.f39758OooO;
                long j6 = this.f39767OooOO0;
                if (j5 == j6) {
                    j = -1;
                    jOooOO0 = -1;
                } else {
                    long j7 = o00o00o1.f39532OooO0Oo;
                    if (o00oo1.OooO0O0(o00o00o1, j6)) {
                        o00oo1.OooO00o(o00o00o1, false);
                        o00o00o1.f39533OooO0o = 0;
                        long j8 = this.f39766OooO0oo;
                        long j9 = o00oo1.f39783OooO0O0;
                        long j10 = j8 - j9;
                        int i2 = o00oo1.f39785OooO0Oo + o00oo1.f39787OooO0o0;
                        if (0 > j10 || j10 >= 72000) {
                            if (j10 < 0) {
                                this.f39767OooOO0 = j7;
                                this.f39769OooOO0o = j9;
                            } else {
                                this.f39758OooO = o00o00o1.f39532OooO0Oo + ((long) i2);
                                this.f39768OooOO0O = j9;
                            }
                            long j11 = this.f39767OooOO0;
                            long j12 = this.f39758OooO;
                            if (j11 - j12 < 100000) {
                                this.f39767OooOO0 = j12;
                                jOooOO0 = j12;
                            } else {
                                jOooOO0 = o0O00.OooOO0((((j11 - j12) * j10) / (this.f39769OooOO0o - this.f39768OooOO0O)) + (o00o00o1.f39532OooO0Oo - (((long) i2) * (j10 <= 0 ? 2L : 1L))), j12, j11 - 1);
                            }
                        } else {
                            j = -1;
                            jOooOO0 = -1;
                        }
                    } else {
                        long j13 = this.f39758OooO;
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
                this.f39764OooO0o0 = 3;
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
                o00oo1.OooO0O0(o00o00o1, j);
                o00oo1.OooO00o(o00o00o1, false);
                if (o00oo1.f39783OooO0O0 > this.f39766OooO0oo) {
                    o00o00o1.f39533OooO0o = 0;
                    this.f39764OooO0o0 = 4;
                    return -(this.f39768OooOO0O + 2);
                }
                o00o00o1.OooOO0(o00oo1.f39785OooO0Oo + o00oo1.f39787OooO0o0);
                this.f39758OooO = o00o00o1.f39532OooO0Oo;
                this.f39768OooOO0O = o00oo1.f39783OooO0O0;
                j = -1;
            }
        }
        o00oo1.f39782OooO00o = 0;
        o00oo1.f39783OooO0O0 = 0L;
        o00oo1.f39784OooO0OO = 0;
        o00oo1.f39785OooO0Oo = 0;
        o00oo1.f39787OooO0o0 = 0;
        if (!o00oo1.OooO0O0(o00o00o1, -1L)) {
            throw new EOFException();
        }
        o00oo1.OooO00o(o00o00o1, false);
        o00o00o1.OooOO0(o00oo1.f39785OooO0Oo + o00oo1.f39787OooO0o0);
        long j14 = o00oo1.f39783OooO0O0;
        while ((o00oo1.f39782OooO00o & 4) != 4 && o00oo1.OooO0O0(o00o00o1, -1L) && o00o00o1.f39532OooO0Oo < j2 && o00oo1.OooO00o(o00o00o1, true)) {
            try {
                o00o00o1.OooOO0(o00oo1.f39785OooO0Oo + o00oo1.f39787OooO0o0);
                z = true;
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            j14 = o00oo1.f39783OooO0O0;
        }
        this.f39763OooO0o = j14;
        this.f39764OooO0o0 = 4;
        return this.f39765OooO0oO;
    }

    @Override // p225o00oOo.o00Ooo
    public final void OooO0OO(long j) {
        this.f39766OooO0oo = o0O00.OooOO0(j, 0L, this.f39763OooO0o - 1);
        this.f39764OooO0o0 = 2;
        this.f39758OooO = this.f39760OooO0O0;
        this.f39767OooOO0 = this.f39761OooO0OO;
        this.f39768OooOO0O = 0L;
        this.f39769OooOO0o = this.f39763OooO0o;
    }
}
