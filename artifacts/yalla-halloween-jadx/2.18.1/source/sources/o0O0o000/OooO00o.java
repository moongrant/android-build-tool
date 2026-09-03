package o0O0o000;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0O0O00;
import p296o0O0OoO0.oo0o0Oo;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f36105OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f36106OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f36107OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f36108OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO0 f36109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f36110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f36111OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f36112OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f36113OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f36114OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f36115OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f36116OooOO0o;

    /* JADX INFO: renamed from: o0O0o000.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C0367OooO00o implements oo0o0Oo {
        public C0367OooO00o() {
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final boolean OooO0O0() {
            return true;
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final oo0o0Oo.OooO00o OooO0oO(long j) {
            long jOooO00o = OooO00o.this.f36109OooO0Oo.OooO00o(j);
            OooO00o oooO00o = OooO00o.this;
            long j2 = oooO00o.f36107OooO0O0;
            long j3 = oooO00o.f36108OooO0OO;
            o0O0O00 o0o0o00 = new o0O0O00(j, o000OOo0.OooO(((((j3 - j2) * jOooO00o) / oooO00o.f36110OooO0o) + j2) - 30000, j2, j3 - 1));
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final long OooO0oo() {
            OooO00o oooO00o = OooO00o.this;
            return (oooO00o.f36110OooO0o * 1000000) / ((long) oooO00o.f36109OooO0Oo.f36143OooO);
        }
    }

    public OooO00o(OooOOO0 oooOOO0, long j, long j2, long j3, long j4, boolean z) {
        o00000O0.OooO00o(j >= 0 && j2 > j);
        this.f36109OooO0Oo = oooOOO0;
        this.f36107OooO0O0 = j;
        this.f36108OooO0OO = j2;
        if (j3 == j2 - j || z) {
            this.f36110OooO0o = j4;
            this.f36111OooO0o0 = 4;
        } else {
            this.f36111OooO0o0 = 0;
        }
        this.f36106OooO00o = new OooO();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // o0O0o000.OooOO0
    public final long OooO00o(o000oOoO o000oooo2) throws IOException {
        long jOooO;
        long j;
        int i = this.f36111OooO0o0;
        if (i == 0) {
            long position = o000oooo2.getPosition();
            this.f36112OooO0oO = position;
            this.f36111OooO0o0 = 1;
            long j2 = this.f36108OooO0OO - 65307;
            if (j2 > position) {
                return j2;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f36105OooO == this.f36114OooOO0) {
                    jOooO = -1;
                } else {
                    long position2 = o000oooo2.getPosition();
                    if (this.f36106OooO00o.OooO0OO(o000oooo2, this.f36114OooOO0)) {
                        this.f36106OooO00o.OooO00o(o000oooo2, false);
                        o000oooo2.OooO();
                        long j3 = this.f36113OooO0oo;
                        OooO oooO = this.f36106OooO00o;
                        long j4 = oooO.f36099OooO0O0;
                        long j5 = j3 - j4;
                        int i2 = oooO.f36101OooO0Oo + oooO.f36103OooO0o0;
                        if (0 > j5 || j5 >= 72000) {
                            if (j5 < 0) {
                                this.f36114OooOO0 = position2;
                                this.f36116OooOO0o = j4;
                            } else {
                                this.f36105OooO = o000oooo2.getPosition() + ((long) i2);
                                this.f36115OooOO0O = this.f36106OooO00o.f36099OooO0O0;
                            }
                            long j6 = this.f36114OooOO0;
                            long j7 = this.f36105OooO;
                            if (j6 - j7 < 100000) {
                                this.f36114OooOO0 = j7;
                                jOooO = j7;
                            } else {
                                long position3 = o000oooo2.getPosition() - (((long) i2) * (j5 <= 0 ? 2L : 1L));
                                long j8 = this.f36114OooOO0;
                                long j9 = this.f36105OooO;
                                jOooO = o000OOo0.OooO((((j8 - j9) * j5) / (this.f36116OooOO0o - this.f36115OooOO0O)) + position3, j9, j8 - 1);
                            }
                        } else {
                            jOooO = -1;
                        }
                    } else {
                        jOooO = this.f36105OooO;
                        if (jOooO == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j = -1;
                if (jOooO != -1) {
                    return jOooO;
                }
                this.f36111OooO0o0 = 3;
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
                this.f36106OooO00o.OooO0OO(o000oooo2, j);
                this.f36106OooO00o.OooO00o(o000oooo2, false);
                OooO oooO2 = this.f36106OooO00o;
                if (oooO2.f36099OooO0O0 > this.f36113OooO0oo) {
                    o000oooo2.OooO();
                    this.f36111OooO0o0 = 4;
                    return -(this.f36115OooOO0O + 2);
                }
                o000oooo2.OooOO0(oooO2.f36101OooO0Oo + oooO2.f36103OooO0o0);
                this.f36105OooO = o000oooo2.getPosition();
                this.f36115OooOO0O = this.f36106OooO00o.f36099OooO0O0;
                j = -1;
            }
        }
        this.f36106OooO00o.OooO0O0();
        if (!this.f36106OooO00o.OooO0OO(o000oooo2, -1L)) {
            throw new EOFException();
        }
        do {
            this.f36106OooO00o.OooO00o(o000oooo2, false);
            OooO oooO3 = this.f36106OooO00o;
            o000oooo2.OooOO0(oooO3.f36101OooO0Oo + oooO3.f36103OooO0o0);
            OooO oooO4 = this.f36106OooO00o;
            if ((oooO4.f36098OooO00o & 4) == 4 || !oooO4.OooO0OO(o000oooo2, -1L)) {
                break;
            }
        } while (o000oooo2.getPosition() < this.f36108OooO0OO);
        this.f36110OooO0o = this.f36106OooO00o.f36099OooO0O0;
        this.f36111OooO0o0 = 4;
        return this.f36112OooO0oO;
    }

    @Override // o0O0o000.OooOO0
    @Nullable
    public final oo0o0Oo OooO0O0() {
        if (this.f36110OooO0o != 0) {
            return new C0367OooO00o();
        }
        return null;
    }

    @Override // o0O0o000.OooOO0
    public final void OooO0OO(long j) {
        this.f36113OooO0oo = o000OOo0.OooO(j, 0L, this.f36110OooO0o - 1);
        this.f36111OooO0o0 = 2;
        this.f36105OooO = this.f36107OooO0O0;
        this.f36114OooOO0 = this.f36108OooO0OO;
        this.f36115OooOO0O = 0L;
        this.f36116OooOO0o = this.f36110OooO0o;
    }
}
