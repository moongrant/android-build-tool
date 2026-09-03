package p078o000Oo0O;

import java.io.IOException;
import java.util.Objects;
import kotlin.UByte;
import o000OOoO.OooO0o;
import o000OOoO.OooOO0O;
import o000OOoO.o00O0O;
import o000OOoO.oo000o;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends OooO0o {

    public static final class OooO00o implements OooO0o.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo000o f34887OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f34888OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O0O.OooO00o f34889OooO0OO = new o00O0O.OooO00o();

        public OooO00o(oo000o oo000oVar, int i) {
            this.f34887OooO00o = oo000oVar;
            this.f34888OooO0O0 = i;
        }

        @Override // o000OOoO.OooO0o.OooOO0
        public final OooO0o.OooO OooO00o(OooOO0O oooOO0O, long j) throws IOException {
            long j2 = oooOO0O.f34678OooO0Oo;
            long jOooO0OO = OooO0OO(oooOO0O);
            long jOooO0oo = oooOO0O.OooO0oo();
            oooOO0O.OooOO0o(Math.max(6, this.f34887OooO00o.f34735OooO0OO), false);
            long jOooO0OO2 = OooO0OO(oooOO0O);
            long jOooO0oo2 = oooOO0O.OooO0oo();
            if (jOooO0OO > j || jOooO0OO2 <= j) {
                return jOooO0OO2 <= j ? new OooO0o.OooO(-2, jOooO0OO2, jOooO0oo2) : new OooO0o.OooO(-1, jOooO0OO, j2);
            }
            return OooO0o.OooO.OooO00o(jOooO0oo);
        }

        @Override // o000OOoO.OooO0o.OooOO0
        public final /* synthetic */ void OooO0O0() {
        }

        public final long OooO0OO(OooOO0O oooOO0O) throws IOException {
            long j;
            o00O0O.OooO00o oooO00o;
            oo000o oo000oVar;
            boolean zOooO00o;
            int iOooOOO;
            while (true) {
                long jOooO0oo = oooOO0O.OooO0oo();
                j = oooOO0O.f34677OooO0OO;
                long j2 = j - 6;
                oooO00o = this.f34889OooO0OO;
                oo000oVar = this.f34887OooO00o;
                if (jOooO0oo >= j2) {
                    break;
                }
                long jOooO0oo2 = oooOO0O.OooO0oo();
                byte[] bArr = new byte[2];
                oooOO0O.OooO0OO(bArr, 0, 2, false);
                int i = ((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
                int i2 = this.f34888OooO0O0;
                if (i != i2) {
                    oooOO0O.f34679OooO0o = 0;
                    oooOO0O.OooOO0o((int) (jOooO0oo2 - oooOO0O.f34678OooO0Oo), false);
                    zOooO00o = false;
                } else {
                    o000O000 o000o001 = new o000O000(16);
                    System.arraycopy(bArr, 0, o000o001.f34962OooO00o, 0, 2);
                    byte[] bArr2 = o000o001.f34962OooO00o;
                    int i3 = 0;
                    for (int i4 = 2; i3 < 14 && (iOooOOO = oooOO0O.OooOOO(i4 + i3, 14 - i3, bArr2)) != -1; i4 = 2) {
                        i3 += iOooOOO;
                    }
                    o000o001.Oooo000(i3);
                    oooOO0O.f34679OooO0o = 0;
                    oooOO0O.OooOO0o((int) (jOooO0oo2 - oooOO0O.f34678OooO0Oo), false);
                    zOooO00o = o00O0O.OooO00o(o000o001, oo000oVar, i2, oooO00o);
                }
                if (zOooO00o) {
                    break;
                }
                oooOO0O.OooOO0o(1, false);
            }
            if (oooOO0O.OooO0oo() < j - 6) {
                return oooO00o.f34714OooO00o;
            }
            oooOO0O.OooOO0o((int) (j - oooOO0O.OooO0oo()), false);
            return oo000oVar.f34741OooOO0;
        }
    }

    public o000OOo(oo000o oo000oVar, int i, long j, long j2) {
        long j3;
        long j4;
        Objects.requireNonNull(oo000oVar);
        o0000OO.OooO0o oooO0o = new o0000OO.OooO0o(oo000oVar);
        OooO00o oooO00o = new OooO00o(oo000oVar, i);
        long jOooO0O0 = oo000oVar.OooO0O0();
        long j5 = oo000oVar.f34741OooOO0;
        int i2 = oo000oVar.f34735OooO0OO;
        int i3 = oo000oVar.f34736OooO0Oo;
        if (i3 > 0) {
            j3 = (((long) i3) + ((long) i2)) / 2;
            j4 = 1;
        } else {
            int i4 = oo000oVar.f34734OooO0O0;
            int i5 = oo000oVar.f34733OooO00o;
            j3 = ((((i5 != i4 || i5 <= 0) ? 4096L : i5) * ((long) oo000oVar.f34739OooO0oO)) * ((long) oo000oVar.f34740OooO0oo)) / 8;
            j4 = 64;
        }
        super(oooO0o, oooO00o, jOooO0O0, j5, j, j2, j3 + j4, Math.max(6, i2));
    }
}
