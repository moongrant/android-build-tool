package p228o00oOo0o;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.exoplayer2.OooOo;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0OO00O f39955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39956OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39957OooO0OO;

    public static abstract class OooO00o extends o0O0O00 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @VisibleForTesting
        public final long f39960OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f39961OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final List<OooO0o> f39962OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f39963OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f39964OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final long f39965OooO0oo;

        public OooO00o(@Nullable o0OO00O o0oo00o2, long j, long j2, long j3, long j4, @Nullable List<OooO0o> list, long j5, long j6, long j7) {
            super(o0oo00o2, j, j2);
            this.f39961OooO0Oo = j3;
            this.f39963OooO0o0 = j4;
            this.f39962OooO0o = list;
            this.f39960OooO = j5;
            this.f39964OooO0oO = j6;
            this.f39965OooO0oo = j7;
        }

        public boolean OooO() {
            return this.f39962OooO0o != null;
        }

        public final long OooO0O0(long j, long j2) {
            long jOooO0Oo = OooO0Oo(j);
            return jOooO0Oo != -1 ? jOooO0Oo : (int) (OooO0o((j2 - this.f39965OooO0oo) + this.f39960OooO, j) - OooO0OO(j, j2));
        }

        public final long OooO0OO(long j, long j2) {
            long jOooO0Oo = OooO0Oo(j);
            long j3 = this.f39961OooO0Oo;
            if (jOooO0Oo == -1) {
                long j4 = this.f39964OooO0oO;
                if (j4 != -9223372036854775807L) {
                    return Math.max(j3, OooO0o((j2 - this.f39965OooO0oo) - j4, j));
                }
            }
            return j3;
        }

        public abstract long OooO0Oo(long j);

        public final long OooO0o(long j, long j2) {
            long jOooO0Oo = OooO0Oo(j2);
            long j3 = this.f39961OooO0Oo;
            if (jOooO0Oo == 0) {
                return j3;
            }
            if (this.f39962OooO0o == null) {
                long j4 = (j / ((this.f39963OooO0o0 * AnimationKt.MillisToNanos) / this.f39956OooO0O0)) + j3;
                if (j4 < j3) {
                    return j3;
                }
                return jOooO0Oo == -1 ? j4 : Math.min(j4, (j3 + jOooO0Oo) - 1);
            }
            long j5 = (jOooO0Oo + j3) - 1;
            long j6 = j3;
            while (j6 <= j5) {
                long j7 = ((j5 - j6) / 2) + j6;
                long jOooO0oO = OooO0oO(j7);
                if (jOooO0oO < j) {
                    j6 = j7 + 1;
                } else {
                    if (jOooO0oO <= j) {
                        return j7;
                    }
                    j5 = j7 - 1;
                }
            }
            return j6 == j3 ? j6 : j5;
        }

        public final long OooO0o0(long j, long j2) {
            long j3 = this.f39956OooO0O0;
            long j4 = this.f39961OooO0Oo;
            List<OooO0o> list = this.f39962OooO0o;
            if (list != null) {
                return (list.get((int) (j - j4)).f39971OooO0O0 * AnimationKt.MillisToNanos) / j3;
            }
            long jOooO0Oo = OooO0Oo(j2);
            return (jOooO0Oo == -1 || j != (j4 + jOooO0Oo) - 1) ? (this.f39963OooO0o0 * AnimationKt.MillisToNanos) / j3 : j2 - OooO0oO(j);
        }

        public final long OooO0oO(long j) {
            long j2 = this.f39961OooO0Oo;
            List<OooO0o> list = this.f39962OooO0o;
            return o0O00.Oooo0oo(list != null ? list.get((int) (j - j2)).f39970OooO00o - this.f39957OooO0OO : (j - j2) * this.f39963OooO0o0, AnimationKt.MillisToNanos, this.f39956OooO0O0);
        }

        public abstract o0OO00O OooO0oo(long j, oo0o0Oo oo0o0oo);
    }

    public static final class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final List<o0OO00O> f39966OooOO0;

        public OooO0O0(o0OO00O o0oo00o2, long j, long j2, long j3, long j4, @Nullable List<OooO0o> list, long j5, @Nullable List<o0OO00O> list2, long j6, long j7) {
            super(o0oo00o2, j, j2, j3, j4, list, j5, j6, j7);
            this.f39966OooOO0 = list2;
        }

        @Override // o00oOo0o.o0O0O00.OooO00o
        public final boolean OooO() {
            return true;
        }

        @Override // o00oOo0o.o0O0O00.OooO00o
        public final long OooO0Oo(long j) {
            return this.f39966OooOO0.size();
        }

        @Override // o00oOo0o.o0O0O00.OooO00o
        public final o0OO00O OooO0oo(long j, oo0o0Oo oo0o0oo) {
            return this.f39966OooOO0.get((int) (j - this.f39961OooO0Oo));
        }
    }

    public static final class OooO0OO extends OooO00o {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final o000000O f39967OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final o000000O f39968OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final long f39969OooOO0o;

        public OooO0OO(o0OO00O o0oo00o2, long j, long j2, long j3, long j4, long j5, @Nullable List<OooO0o> list, long j6, @Nullable o000000O o000000o2, @Nullable o000000O o000000o3, long j7, long j8) {
            super(o0oo00o2, j, j2, j3, j5, list, j6, j7, j8);
            this.f39967OooOO0 = o000000o2;
            this.f39968OooOO0O = o000000o3;
            this.f39969OooOO0o = j4;
        }

        @Override // p228o00oOo0o.o0O0O00
        @Nullable
        public final o0OO00O OooO00o(oo0o0Oo oo0o0oo) {
            o000000O o000000o2 = this.f39967OooOO0;
            if (o000000o2 == null) {
                return this.f39955OooO00o;
            }
            OooOo oooOo = oo0o0oo.f40003OooO00o;
            return new o0OO00O(0L, -1L, o000000o2.OooO00o(oooOo.f11201OooO0Oo, 0L, 0L, oooOo.f11207OooOO0O));
        }

        @Override // o00oOo0o.o0O0O00.OooO00o
        public final long OooO0Oo(long j) {
            List<OooO0o> list = this.f39962OooO0o;
            if (list != null) {
                return list.size();
            }
            long j2 = this.f39969OooOO0o;
            if (j2 != -1) {
                return (j2 - this.f39961OooO0Oo) + 1;
            }
            if (j == -9223372036854775807L) {
                return -1L;
            }
            BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f39956OooO0O0));
            BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f39963OooO0o0).multiply(BigInteger.valueOf(AnimationKt.MillisToNanos));
            RoundingMode roundingMode = RoundingMode.CEILING;
            int i = com.google.common.math.OooO00o.f19734OooO00o;
            return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
        }

        @Override // o00oOo0o.o0O0O00.OooO00o
        public final o0OO00O OooO0oo(long j, oo0o0Oo oo0o0oo) {
            long j2 = this.f39961OooO0Oo;
            List<OooO0o> list = this.f39962OooO0o;
            long j3 = list != null ? list.get((int) (j - j2)).f39970OooO00o : (j - j2) * this.f39963OooO0o0;
            o000000O o000000o2 = this.f39968OooOO0O;
            OooOo oooOo = oo0o0oo.f40003OooO00o;
            return new o0OO00O(0L, -1L, o000000o2.OooO00o(oooOo.f11201OooO0Oo, j, j3, oooOo.f11207OooOO0O));
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f39970OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f39971OooO0O0;

        public OooO0o(long j, long j2) {
            this.f39970OooO00o = j;
            this.f39971OooO0O0 = j2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0o.class != obj.getClass()) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f39970OooO00o == oooO0o.f39970OooO00o && this.f39971OooO0O0 == oooO0o.f39971OooO0O0;
        }

        public final int hashCode() {
            return (((int) this.f39970OooO00o) * 31) + ((int) this.f39971OooO0O0);
        }
    }

    public o0O0O00(@Nullable o0OO00O o0oo00o2, long j, long j2) {
        this.f39955OooO00o = o0oo00o2;
        this.f39956OooO0O0 = j;
        this.f39957OooO0OO = j2;
    }

    @Nullable
    public o0OO00O OooO00o(oo0o0Oo oo0o0oo) {
        return this.f39955OooO00o;
    }

    public static class OooO extends o0O0O00 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f39958OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f39959OooO0o0;

        public OooO(@Nullable o0OO00O o0oo00o2, long j, long j2, long j3, long j4) {
            super(o0oo00o2, j, j2);
            this.f39958OooO0Oo = j3;
            this.f39959OooO0o0 = j4;
        }

        public OooO() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
