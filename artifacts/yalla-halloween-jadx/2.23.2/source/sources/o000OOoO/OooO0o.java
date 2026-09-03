package o000OOoO;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f34645OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f34646OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0OO f34647OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f34648OooO0Oo;

    public static final class OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f34649OooO0Oo = new OooO(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f34650OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f34651OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f34652OooO0OO;

        public OooO(int i, long j, long j2) {
            this.f34650OooO00o = i;
            this.f34651OooO0O0 = j;
            this.f34652OooO0OO = j2;
        }

        public static OooO OooO00o(long j) {
            return new OooO(0, -9223372036854775807L, j);
        }
    }

    public static class OooO00o implements o000000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC0401OooO0o f34653OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f34654OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f34655OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f34656OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f34657OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f34658OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f34659OooO0oO;

        public OooO00o(InterfaceC0401OooO0o interfaceC0401OooO0o, long j, long j2, long j3, long j4, long j5) {
            this.f34653OooO00o = interfaceC0401OooO0o;
            this.f34654OooO0O0 = j;
            this.f34656OooO0Oo = j2;
            this.f34658OooO0o0 = j3;
            this.f34657OooO0o = j4;
            this.f34659OooO0oO = j5;
        }

        @Override // o000OOoO.o000000
        public final long OooO() {
            return this.f34654OooO0O0;
        }

        @Override // o000OOoO.o000000
        public final o000000.OooO00o OooO0Oo(long j) {
            o000000O o000000o2 = new o000000O(j, OooO0OO.OooO00o(this.f34653OooO00o.OooO00o(j), this.f34655OooO0OO, this.f34656OooO0Oo, this.f34658OooO0o0, this.f34657OooO0o, this.f34659OooO0oO));
            return new o000000.OooO00o(o000000o2, o000000o2);
        }

        @Override // o000OOoO.o000000
        public final boolean OooO0oO() {
            return true;
        }
    }

    public static final class OooO0O0 implements InterfaceC0401OooO0o {
        @Override // o000OOoO.OooO0o.InterfaceC0401OooO0o
        public final long OooO00o(long j) {
            return j;
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f34660OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f34661OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f34662OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f34663OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f34664OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f34665OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f34666OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f34667OooO0oo;

        public OooO0OO(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f34660OooO00o = j;
            this.f34661OooO0O0 = j2;
            this.f34663OooO0Oo = j3;
            this.f34665OooO0o0 = j4;
            this.f34664OooO0o = j5;
            this.f34666OooO0oO = j6;
            this.f34662OooO0OO = j7;
            this.f34667OooO0oo = OooO00o(j2, j3, j4, j5, j6, j7);
        }

        public static long OooO00o(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return o00.OooOO0(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    /* JADX INFO: renamed from: o000OOoO.OooO0o$OooO0o, reason: collision with other inner class name */
    public interface InterfaceC0401OooO0o {
        long OooO00o(long j);
    }

    public interface OooOO0 {
        OooO OooO00o(OooOO0O oooOO0O, long j) throws IOException;

        void OooO0O0();
    }

    public OooO0o(InterfaceC0401OooO0o interfaceC0401OooO0o, OooOO0 oooOO1, long j, long j2, long j3, long j4, long j5, int i) {
        this.f34646OooO0O0 = oooOO1;
        this.f34648OooO0Oo = i;
        this.f34645OooO00o = new OooO00o(interfaceC0401OooO0o, j, j2, j3, j4, j5);
    }

    public static int OooO0O0(OooOO0O oooOO0O, long j, o000OOo o000ooo2) {
        if (j == oooOO0O.f34678OooO0Oo) {
            return 0;
        }
        o000ooo2.f34713OooO00o = j;
        return 1;
    }

    public final int OooO00o(OooOO0O oooOO0O, o000OOo o000ooo2) throws IOException {
        boolean z;
        while (true) {
            OooO0OO oooO0OO = this.f34647OooO0OO;
            p080o000OoO.o00Oo0.OooO0o(oooO0OO);
            long j = oooO0OO.f34664OooO0o;
            long j2 = oooO0OO.f34666OooO0oO;
            long j3 = oooO0OO.f34667OooO0oo;
            long j4 = j2 - j;
            long j5 = this.f34648OooO0Oo;
            OooOO0 oooOO1 = this.f34646OooO0O0;
            if (j4 <= j5) {
                this.f34647OooO0OO = null;
                oooOO1.OooO0O0();
                return OooO0O0(oooOO0O, j, o000ooo2);
            }
            long j6 = j3 - oooOO0O.f34678OooO0Oo;
            if (j6 < 0 || j6 > 262144) {
                z = false;
            } else {
                oooOO0O.OooOO0((int) j6);
                z = true;
            }
            if (!z) {
                return OooO0O0(oooOO0O, j3, o000ooo2);
            }
            oooOO0O.f34679OooO0o = 0;
            OooO oooOOooO00o = oooOO1.OooO00o(oooOO0O, oooO0OO.f34661OooO0O0);
            int i = oooOOooO00o.f34650OooO00o;
            if (i == -3) {
                this.f34647OooO0OO = null;
                oooOO1.OooO0O0();
                return OooO0O0(oooOO0O, j3, o000ooo2);
            }
            long j7 = oooOOooO00o.f34651OooO0O0;
            long j8 = oooOOooO00o.f34652OooO0OO;
            if (i == -2) {
                oooO0OO.f34663OooO0Oo = j7;
                oooO0OO.f34664OooO0o = j8;
                oooO0OO.f34667OooO0oo = OooO0OO.OooO00o(oooO0OO.f34661OooO0O0, j7, oooO0OO.f34665OooO0o0, j8, oooO0OO.f34666OooO0oO, oooO0OO.f34662OooO0OO);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j9 = j8 - oooOO0O.f34678OooO0Oo;
                    if (j9 >= 0 && j9 <= 262144) {
                        oooOO0O.OooOO0((int) j9);
                    }
                    this.f34647OooO0OO = null;
                    oooOO1.OooO0O0();
                    return OooO0O0(oooOO0O, j8, o000ooo2);
                }
                oooO0OO.f34665OooO0o0 = j7;
                oooO0OO.f34666OooO0oO = j8;
                oooO0OO.f34667OooO0oo = OooO0OO.OooO00o(oooO0OO.f34661OooO0O0, oooO0OO.f34663OooO0Oo, j7, oooO0OO.f34664OooO0o, j8, oooO0OO.f34662OooO0OO);
            }
        }
    }

    public final void OooO0OO(long j) {
        OooO0OO oooO0OO = this.f34647OooO0OO;
        if (oooO0OO == null || oooO0OO.f34660OooO00o != j) {
            OooO00o oooO00o = this.f34645OooO00o;
            this.f34647OooO0OO = new OooO0OO(j, oooO00o.f34653OooO00o.OooO00o(j), oooO00o.f34655OooO0OO, oooO00o.f34656OooO0Oo, oooO00o.f34658OooO0o0, oooO00o.f34657OooO0o, oooO00o.f34659OooO0oO);
        }
    }
}
