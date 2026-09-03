package p209o00o0oo0;

import androidx.annotation.Nullable;
import java.io.IOException;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f39499OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f39500OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0OO f39501OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f39502OooO0Oo;

    public static final class OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f39503OooO0Oo = new OooO(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f39504OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f39505OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f39506OooO0OO;

        public OooO(int i, long j, long j2) {
            this.f39504OooO00o = i;
            this.f39505OooO0O0 = j;
            this.f39506OooO0OO = j2;
        }

        public static OooO OooO00o(long j) {
            return new OooO(0, -9223372036854775807L, j);
        }
    }

    public static class OooO00o implements o00OO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f39507OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f39508OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f39509OooO0OO = 0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f39510OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f39511OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f39512OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final long f39513OooO0oO;

        public OooO00o(OooO0o oooO0o, long j, long j2, long j3, long j4, long j5) {
            this.f39507OooO00o = oooO0o;
            this.f39508OooO0O0 = j;
            this.f39510OooO0Oo = j2;
            this.f39512OooO0o0 = j3;
            this.f39511OooO0o = j4;
            this.f39513OooO0oO = j5;
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final long OooO() {
            return this.f39508OooO0O0;
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final o00OO0OO.OooO00o OooO0OO(long j) {
            oo0O oo0o = new oo0O(j, OooO0OO.OooO00o(this.f39507OooO00o.OooO00o(j), this.f39509OooO0OO, this.f39510OooO0Oo, this.f39512OooO0o0, this.f39511OooO0o, this.f39513OooO0oO));
            return new o00OO0OO.OooO00o(oo0o, oo0o);
        }

        @Override // p209o00o0oo0.o00OO0OO
        public final boolean OooO0o() {
            return true;
        }
    }

    public static final class OooO0O0 implements OooO0o {
        @Override // o00o0oo0.o00O00O.OooO0o
        public final long OooO00o(long j) {
            return j;
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f39514OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f39515OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f39516OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f39517OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public long f39518OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f39519OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public long f39520OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f39521OooO0oo;

        public OooO0OO(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f39514OooO00o = j;
            this.f39515OooO0O0 = j2;
            this.f39517OooO0Oo = j3;
            this.f39519OooO0o0 = j4;
            this.f39518OooO0o = j5;
            this.f39520OooO0oO = j6;
            this.f39516OooO0OO = j7;
            this.f39521OooO0oo = OooO00o(j2, j3, j4, j5, j6, j7);
        }

        public static long OooO00o(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return o0O00.OooOO0(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    public interface OooO0o {
        long OooO00o(long j);
    }

    public interface OooOO0 {
        OooO OooO00o(o00O00o0 o00o00o1, long j) throws IOException;

        void OooO0O0();
    }

    public o00O00O(OooO0o oooO0o, OooOO0 oooOO1, long j, long j2, long j3, long j4, long j5, int i) {
        this.f39500OooO0O0 = oooOO1;
        this.f39502OooO0Oo = i;
        this.f39499OooO00o = new OooO00o(oooO0o, j, j2, j3, j4, j5);
    }

    public static int OooO0O0(o00O00o0 o00o00o1, long j, o00OO0O0 o00oo0o1) {
        if (j == o00o00o1.f39532OooO0Oo) {
            return 0;
        }
        o00oo0o1.f39548OooO00o = j;
        return 1;
    }

    public final int OooO00o(o00O00o0 o00o00o1, o00OO0O0 o00oo0o1) throws IOException {
        boolean z;
        while (true) {
            OooO0OO oooO0OO = this.f39501OooO0OO;
            o00O000o.OooO0o0(oooO0OO);
            long j = oooO0OO.f39518OooO0o;
            long j2 = oooO0OO.f39520OooO0oO;
            long j3 = oooO0OO.f39521OooO0oo;
            long j4 = j2 - j;
            long j5 = this.f39502OooO0Oo;
            OooOO0 oooOO1 = this.f39500OooO0O0;
            if (j4 <= j5) {
                this.f39501OooO0OO = null;
                oooOO1.OooO0O0();
                return OooO0O0(o00o00o1, j, o00oo0o1);
            }
            long j6 = j3 - o00o00o1.f39532OooO0Oo;
            if (j6 < 0 || j6 > 262144) {
                z = false;
            } else {
                o00o00o1.OooOO0((int) j6);
                z = true;
            }
            if (!z) {
                return OooO0O0(o00o00o1, j3, o00oo0o1);
            }
            o00o00o1.f39533OooO0o = 0;
            OooO oooOOooO00o = oooOO1.OooO00o(o00o00o1, oooO0OO.f39515OooO0O0);
            int i = oooOOooO00o.f39504OooO00o;
            if (i == -3) {
                this.f39501OooO0OO = null;
                oooOO1.OooO0O0();
                return OooO0O0(o00o00o1, j3, o00oo0o1);
            }
            long j7 = oooOOooO00o.f39505OooO0O0;
            long j8 = oooOOooO00o.f39506OooO0OO;
            if (i == -2) {
                oooO0OO.f39517OooO0Oo = j7;
                oooO0OO.f39518OooO0o = j8;
                oooO0OO.f39521OooO0oo = OooO0OO.OooO00o(oooO0OO.f39515OooO0O0, j7, oooO0OO.f39519OooO0o0, j8, oooO0OO.f39520OooO0oO, oooO0OO.f39516OooO0OO);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j9 = j8 - o00o00o1.f39532OooO0Oo;
                    if (j9 >= 0 && j9 <= 262144) {
                        o00o00o1.OooOO0((int) j9);
                    }
                    this.f39501OooO0OO = null;
                    oooOO1.OooO0O0();
                    return OooO0O0(o00o00o1, j8, o00oo0o1);
                }
                oooO0OO.f39519OooO0o0 = j7;
                oooO0OO.f39520OooO0oO = j8;
                oooO0OO.f39521OooO0oo = OooO0OO.OooO00o(oooO0OO.f39515OooO0O0, oooO0OO.f39517OooO0Oo, j7, oooO0OO.f39518OooO0o, j8, oooO0OO.f39516OooO0OO);
            }
        }
    }

    public final void OooO0OO(long j) {
        OooO0OO oooO0OO = this.f39501OooO0OO;
        if (oooO0OO == null || oooO0OO.f39514OooO00o != j) {
            OooO00o oooO00o = this.f39499OooO00o;
            this.f39501OooO0OO = new OooO0OO(j, oooO00o.f39507OooO00o.OooO00o(j), oooO00o.f39509OooO0OO, oooO00o.f39510OooO0Oo, oooO00o.f39512OooO0o0, oooO00o.f39511OooO0o, oooO00o.f39513OooO0oO);
        }
    }
}
