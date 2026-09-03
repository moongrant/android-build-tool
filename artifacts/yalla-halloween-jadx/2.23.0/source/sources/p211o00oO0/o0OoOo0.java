package p211o00oO0;

import java.io.IOException;
import p209o00o0oo0.o00O00O;
import p209o00o0oo0.o00O00o0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0OoOo0 extends o00O00O {

    public static final class OooO00o implements o00O00O.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0000O f39619OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00Oo00 f39620OooO0O0 = new o00Oo00();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f39621OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f39622OooO0Oo;

        public OooO00o(int i, o0O0000O o0o0000o2, int i2) {
            this.f39621OooO0OO = i;
            this.f39619OooO00o = o0o0000o2;
            this.f39622OooO0Oo = i2;
        }

        @Override // o00o0oo0.o00O00O.OooOO0
        public final o00O00O.OooO OooO00o(o00O00o0 o00o00o1, long j) throws IOException {
            long j2 = o00o00o1.f39532OooO0Oo;
            int iMin = (int) Math.min(this.f39622OooO0Oo, o00o00o1.f39531OooO0OO - j2);
            o00Oo00 o00oo00 = this.f39620OooO0O0;
            o00oo00.OooOooO(iMin);
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, iMin, false);
            int i = o00oo00.f40593OooO0OO;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (true) {
                int i2 = o00oo00.f40593OooO0OO;
                int i3 = o00oo00.f40592OooO0O0;
                if (i2 - i3 < 188) {
                    break;
                }
                byte[] bArr = o00oo00.f40591OooO00o;
                while (i3 < i && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i) {
                    break;
                }
                long jOooO00o = o00Oo0.OooO00o(i3, this.f39621OooO0OO, o00oo00);
                if (jOooO00o != -9223372036854775807L) {
                    long jOooO0O0 = this.f39619OooO00o.OooO0O0(jOooO00o);
                    if (jOooO0O0 > j) {
                        return j5 == -9223372036854775807L ? new o00O00O.OooO(-1, jOooO0O0, j2) : o00O00O.OooO.OooO00o(j2 + j4);
                    }
                    if (100000 + jOooO0O0 > j) {
                        return o00O00O.OooO.OooO00o(j2 + ((long) i3));
                    }
                    j4 = i3;
                    j5 = jOooO0O0;
                }
                o00oo00.Oooo00O(i4);
                j3 = i4;
            }
            return j5 != -9223372036854775807L ? new o00O00O.OooO(-2, j5, j2 + j3) : o00O00O.OooO.f39503OooO0Oo;
        }

        @Override // o00o0oo0.o00O00O.OooOO0
        public final void OooO0O0() {
            byte[] bArr = o0O00.f40599OooO0o;
            o00Oo00 o00oo00 = this.f39620OooO0O0;
            o00oo00.getClass();
            o00oo00.OooOooo(bArr.length, bArr);
        }
    }

    public o0OoOo0(o0O0000O o0o0000o2, long j, long j2, int i, int i2) {
        super(new o00O00O.OooO0O0(), new OooO00o(i, o0o0000o2, i2), j, j + 1, 0L, j2, 188L, 940);
    }
}
