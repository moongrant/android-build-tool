package p296o0O0OoO0;

import androidx.annotation.Nullable;
import java.io.IOException;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f35854OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f35855OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0OO f35856OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f35857OooO0Oo;

    public static final class OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f35858OooO0Oo = new OooO(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35859OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f35860OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f35861OooO0OO;

        public OooO(int i, long j, long j2) {
            this.f35859OooO00o = i;
            this.f35860OooO0O0 = j;
            this.f35861OooO0OO = j2;
        }

        public static OooO OooO00o(long j, long j2) {
            return new OooO(-1, j, j2);
        }

        public static OooO OooO0O0(long j) {
            return new OooO(0, -9223372036854775807L, j);
        }

        public static OooO OooO0OO(long j, long j2) {
            return new OooO(-2, j, j2);
        }
    }

    public static class OooO00o implements oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f35862OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f35863OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f35864OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f35865OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f35866OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f35867OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f35868OooO0oO;

        public OooO00o(OooO0o oooO0o, long j, long j2, long j3, long j4, long j5) {
            this.f35862OooO00o = oooO0o;
            this.f35863OooO0O0 = j;
            this.f35865OooO0Oo = j2;
            this.f35867OooO0o0 = j3;
            this.f35866OooO0o = j4;
            this.f35868OooO0oO = j5;
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final boolean OooO0O0() {
            return true;
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final oo0o0Oo.OooO00o OooO0oO(long j) {
            o0O0O00 o0o0o00 = new o0O0O00(j, OooO0OO.OooO00o(this.f35862OooO00o.OooO00o(j), this.f35864OooO0OO, this.f35865OooO0Oo, this.f35867OooO0o0, this.f35866OooO0o, this.f35868OooO0oO));
            return new oo0o0Oo.OooO00o(o0o0o00, o0o0o00);
        }

        @Override // p296o0O0OoO0.oo0o0Oo
        public final long OooO0oo() {
            return this.f35863OooO0O0;
        }
    }

    public static final class OooO0O0 implements OooO0o {
        @Override // o0O0OoO0.OooOOOO.OooO0o
        public final long OooO00o(long j) {
            return j;
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f35869OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f35870OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f35871OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f35872OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f35873OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f35874OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f35875OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f35876OooO0oo;

        public OooO0OO(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f35869OooO00o = j;
            this.f35870OooO0O0 = j2;
            this.f35872OooO0Oo = j3;
            this.f35874OooO0o0 = j4;
            this.f35873OooO0o = j5;
            this.f35875OooO0oO = j6;
            this.f35871OooO0OO = j7;
            this.f35876OooO0oo = OooO00o(j2, j3, j4, j5, j6, j7);
        }

        public static long OooO00o(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return o000OOo0.OooO(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    public interface OooO0o {
        long OooO00o(long j);
    }

    public interface OooOO0 {
        OooO OooO00o(o000oOoO o000oooo2, long j) throws IOException;

        void OooO0O0();
    }

    public OooOOOO(OooO0o oooO0o, OooOO0 oooOO1, long j, long j2, long j3, long j4, long j5, int i) {
        this.f35855OooO0O0 = oooOO1;
        this.f35857OooO0Oo = i;
        this.f35854OooO00o = new OooO00o(oooO0o, j, j2, j3, j4, j5);
    }

    public final int OooO00o(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        while (true) {
            OooO0OO oooO0OO = this.f35856OooO0OO;
            o00000O0.OooO0o(oooO0OO);
            long j = oooO0OO.f35873OooO0o;
            long j2 = oooO0OO.f35875OooO0oO;
            long j3 = oooO0OO.f35876OooO0oo;
            if (j2 - j <= this.f35857OooO0Oo) {
                OooO0OO();
                return OooO0Oo(o000oooo2, j, o0oo00o2);
            }
            if (!OooO0o(o000oooo2, j3)) {
                return OooO0Oo(o000oooo2, j3, o0oo00o2);
            }
            o000oooo2.OooO();
            OooO oooOOooO00o = this.f35855OooO0O0.OooO00o(o000oooo2, oooO0OO.f35870OooO0O0);
            int i = oooOOooO00o.f35859OooO00o;
            if (i == -3) {
                OooO0OO();
                return OooO0Oo(o000oooo2, j3, o0oo00o2);
            }
            if (i == -2) {
                long j4 = oooOOooO00o.f35860OooO0O0;
                long j5 = oooOOooO00o.f35861OooO0OO;
                oooO0OO.f35872OooO0Oo = j4;
                oooO0OO.f35873OooO0o = j5;
                oooO0OO.f35876OooO0oo = OooO0OO.OooO00o(oooO0OO.f35870OooO0O0, j4, oooO0OO.f35874OooO0o0, j5, oooO0OO.f35875OooO0oO, oooO0OO.f35871OooO0OO);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    OooO0o(o000oooo2, oooOOooO00o.f35861OooO0OO);
                    OooO0OO();
                    return OooO0Oo(o000oooo2, oooOOooO00o.f35861OooO0OO, o0oo00o2);
                }
                long j6 = oooOOooO00o.f35860OooO0O0;
                long j7 = oooOOooO00o.f35861OooO0OO;
                oooO0OO.f35874OooO0o0 = j6;
                oooO0OO.f35875OooO0oO = j7;
                oooO0OO.f35876OooO0oo = OooO0OO.OooO00o(oooO0OO.f35870OooO0O0, oooO0OO.f35872OooO0Oo, j6, oooO0OO.f35873OooO0o, j7, oooO0OO.f35871OooO0OO);
            }
        }
    }

    public final boolean OooO0O0() {
        return this.f35856OooO0OO != null;
    }

    public final void OooO0OO() {
        this.f35856OooO0OO = null;
        this.f35855OooO0O0.OooO0O0();
    }

    public final int OooO0Oo(o000oOoO o000oooo2, long j, o0OO00O o0oo00o2) {
        if (j == o000oooo2.getPosition()) {
            return 0;
        }
        o0oo00o2.f35929OooO00o = j;
        return 1;
    }

    public final boolean OooO0o(o000oOoO o000oooo2, long j) throws IOException {
        long position = j - o000oooo2.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        o000oooo2.OooOO0((int) position);
        return true;
    }

    public final void OooO0o0(long j) {
        OooO0OO oooO0OO = this.f35856OooO0OO;
        if (oooO0OO == null || oooO0OO.f35869OooO00o != j) {
            long jOooO00o = this.f35854OooO00o.f35862OooO00o.OooO00o(j);
            OooO00o oooO00o = this.f35854OooO00o;
            this.f35856OooO0OO = new OooO0OO(j, jOooO00o, oooO00o.f35864OooO0OO, oooO00o.f35865OooO0Oo, oooO00o.f35867OooO0o0, oooO00o.f35866OooO0o, oooO00o.f35868OooO0oO);
        }
    }
}
