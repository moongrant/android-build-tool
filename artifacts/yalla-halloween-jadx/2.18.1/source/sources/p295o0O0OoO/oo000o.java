package p295o0O0OoO;

import java.io.IOException;
import java.util.Objects;
import kotlin.UByte;
import p296o0O0OoO0.OooOOOO;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o00Oo0;
import p296o0O0OoO0.o00oO0o;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends OooOOOO {

    public static final class OooO00o implements OooOOOO.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00oO0o f35851OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35852OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00Oo0.OooO00o f35853OooO0OO = new o00Oo0.OooO00o();

        public OooO00o(o00oO0o o00oo0o2, int i) {
            this.f35851OooO00o = o00oo0o2;
            this.f35852OooO0O0 = i;
        }

        @Override // o0O0OoO0.OooOOOO.OooOO0
        public final OooOOOO.OooO OooO00o(o000oOoO o000oooo2, long j) throws IOException {
            long position = o000oooo2.getPosition();
            long jOooO0OO = OooO0OO(o000oooo2);
            long jOooO0Oo = o000oooo2.OooO0Oo();
            o000oooo2.OooO0o0(Math.max(6, this.f35851OooO00o.f35915OooO0OO));
            long jOooO0OO2 = OooO0OO(o000oooo2);
            long jOooO0Oo2 = o000oooo2.OooO0Oo();
            if (jOooO0OO > j || jOooO0OO2 <= j) {
                return jOooO0OO2 <= j ? OooOOOO.OooO.OooO0OO(jOooO0OO2, jOooO0Oo2) : OooOOOO.OooO.OooO00o(jOooO0OO, position);
            }
            return OooOOOO.OooO.OooO0O0(jOooO0Oo);
        }

        @Override // o0O0OoO0.OooOOOO.OooOO0
        public final /* synthetic */ void OooO0O0() {
        }

        public final long OooO0OO(o000oOoO o000oooo2) throws IOException {
            int iOooO0oO;
            while (o000oooo2.OooO0Oo() < o000oooo2.OooO00o() - 6) {
                o00oO0o o00oo0o2 = this.f35851OooO00o;
                int i = this.f35852OooO0O0;
                o00Oo0.OooO00o oooO00o = this.f35853OooO0OO;
                long jOooO0Oo = o000oooo2.OooO0Oo();
                byte[] bArr = new byte[2];
                int i2 = 0;
                boolean zOooO00o = false;
                o000oooo2.OooOOO0(bArr, 0, 2);
                if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i) {
                    o000oooo2.OooO();
                    o000oooo2.OooO0o0((int) (jOooO0Oo - o000oooo2.getPosition()));
                } else {
                    o000 o000Var = new o000(16);
                    System.arraycopy(bArr, 0, o000Var.f36661OooO00o, 0, 2);
                    byte[] bArr2 = o000Var.f36661OooO00o;
                    while (i2 < 14 && (iOooO0oO = o000oooo2.OooO0oO(bArr2, 2 + i2, 14 - i2)) != -1) {
                        i2 += iOooO0oO;
                    }
                    o000Var.OooOoO(i2);
                    o000oooo2.OooO();
                    o000oooo2.OooO0o0((int) (jOooO0Oo - o000oooo2.getPosition()));
                    zOooO00o = o00Oo0.OooO00o(o000Var, o00oo0o2, i, oooO00o);
                }
                if (zOooO00o) {
                    break;
                }
                o000oooo2.OooO0o0(1);
            }
            if (o000oooo2.OooO0Oo() < o000oooo2.OooO00o() - 6) {
                return this.f35853OooO0OO.f35911OooO00o;
            }
            o000oooo2.OooO0o0((int) (o000oooo2.OooO00o() - o000oooo2.OooO0Oo()));
            return this.f35851OooO00o.f35921OooOO0;
        }
    }

    public oo000o(o00oO0o o00oo0o2, int i, long j, long j2) {
        long j3;
        long j4;
        Objects.requireNonNull(o00oo0o2);
        o00Ooo o00ooo2 = new o00Ooo(o00oo0o2, 0);
        OooO00o oooO00o = new OooO00o(o00oo0o2, i);
        long jOooO0Oo = o00oo0o2.OooO0Oo();
        long j5 = o00oo0o2.f35921OooOO0;
        int i2 = o00oo0o2.f35916OooO0Oo;
        if (i2 > 0) {
            j3 = (((long) i2) + ((long) o00oo0o2.f35915OooO0OO)) / 2;
            j4 = 1;
        } else {
            int i3 = o00oo0o2.f35913OooO00o;
            j3 = ((((i3 != o00oo0o2.f35914OooO0O0 || i3 <= 0) ? 4096L : i3) * ((long) o00oo0o2.f35919OooO0oO)) * ((long) o00oo0o2.f35920OooO0oo)) / 8;
            j4 = 64;
        }
        super(o00ooo2, oooO00o, jOooO0Oo, j5, j, j2, j3 + j4, Math.max(6, o00oo0o2.f35915OooO0OO));
    }
}
