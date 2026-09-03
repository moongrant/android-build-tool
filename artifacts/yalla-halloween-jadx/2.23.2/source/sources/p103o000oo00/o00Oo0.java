package p103o000oo00;

import java.io.IOException;
import o000OOoO.OooO0o;
import o000OOoO.OooOO0O;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends OooO0o {

    public static final class OooO00o implements OooO0o.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O0Oo f35677OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O000 f35678OooO0O0 = new o000O000();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f35679OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f35680OooO0Oo;

        public OooO00o(int i, o000O0Oo o000o0oo2, int i2) {
            this.f35679OooO0OO = i;
            this.f35677OooO00o = o000o0oo2;
            this.f35680OooO0Oo = i2;
        }

        @Override // o000OOoO.OooO0o.OooOO0
        public final OooO0o.OooO OooO00o(OooOO0O oooOO0O, long j) throws IOException {
            long j2 = oooOO0O.f34678OooO0Oo;
            int iMin = (int) Math.min(this.f35680OooO0Oo, oooOO0O.f34677OooO0OO - j2);
            o000O000 o000o001 = this.f35678OooO0O0;
            o000o001.OooOooO(iMin);
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, iMin, false);
            int i = o000o001.f34964OooO0OO;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (true) {
                int i2 = o000o001.f34964OooO0OO;
                int i3 = o000o001.f34963OooO0O0;
                if (i2 - i3 < 188) {
                    break;
                }
                byte[] bArr = o000o001.f34962OooO00o;
                while (i3 < i && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i) {
                    break;
                }
                long jOooO00o = o00oO0o.OooO00o(i3, this.f35679OooO0OO, o000o001);
                if (jOooO00o != -9223372036854775807L) {
                    long jOooO0O0 = this.f35677OooO00o.OooO0O0(jOooO00o);
                    if (jOooO0O0 > j) {
                        return j5 == -9223372036854775807L ? new OooO0o.OooO(-1, jOooO0O0, j2) : OooO0o.OooO.OooO00o(j2 + j4);
                    }
                    if (100000 + jOooO0O0 > j) {
                        return OooO0o.OooO.OooO00o(j2 + ((long) i3));
                    }
                    j4 = i3;
                    j5 = jOooO0O0;
                }
                o000o001.Oooo00O(i4);
                j3 = i4;
            }
            return j5 != -9223372036854775807L ? new OooO0o.OooO(-2, j5, j2 + j3) : OooO0o.OooO.f34649OooO0Oo;
        }

        @Override // o000OOoO.OooO0o.OooOO0
        public final void OooO0O0() {
            byte[] bArr = o00.f34914OooO0o;
            o000O000 o000o001 = this.f35678OooO0O0;
            o000o001.getClass();
            o000o001.OooOooo(bArr.length, bArr);
        }
    }

    public o00Oo0(o000O0Oo o000o0oo2, long j, long j2, int i, int i2) {
        super(new OooO0o.OooO0O0(), new OooO00o(i, o000o0oo2, i2), j, j + 1, 0L, j2, 188L, 940);
    }
}
