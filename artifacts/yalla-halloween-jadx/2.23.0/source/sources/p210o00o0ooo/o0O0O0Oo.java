package p210o00o0ooo;

import java.io.IOException;
import java.util.Objects;
import kotlin.UByte;
import p026Oooo0o.OooO0o;
import p209o00o0oo0.o00O00O;
import p209o00o0oo0.o00O00o0;
import p209o00o0oo0.oo0o0O0;
import p209o00o0oo0.oo0oOO0;
import p245o00oo0o.o00Oo00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O0O0Oo extends o00O00O {

    public static final class OooO00o implements o00O00O.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo0oOO0 f39592OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f39593OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final oo0o0O0.OooO00o f39594OooO0OO = new oo0o0O0.OooO00o();

        public OooO00o(oo0oOO0 oo0ooo0, int i) {
            this.f39592OooO00o = oo0ooo0;
            this.f39593OooO0O0 = i;
        }

        @Override // o00o0oo0.o00O00O.OooOO0
        public final o00O00O.OooO OooO00o(o00O00o0 o00o00o1, long j) throws IOException {
            long j2 = o00o00o1.f39532OooO0Oo;
            long jOooO0OO = OooO0OO(o00o00o1);
            long jOooO0oo = o00o00o1.OooO0oo();
            o00o00o1.OooOO0o(Math.max(6, this.f39592OooO00o.f39581OooO0OO), false);
            long jOooO0OO2 = OooO0OO(o00o00o1);
            long jOooO0oo2 = o00o00o1.OooO0oo();
            if (jOooO0OO > j || jOooO0OO2 <= j) {
                return jOooO0OO2 <= j ? new o00O00O.OooO(-2, jOooO0OO2, jOooO0oo2) : new o00O00O.OooO(-1, jOooO0OO, j2);
            }
            return o00O00O.OooO.OooO00o(jOooO0oo);
        }

        @Override // o00o0oo0.o00O00O.OooOO0
        public final /* synthetic */ void OooO0O0() {
        }

        public final long OooO0OO(o00O00o0 o00o00o1) throws IOException {
            long j;
            oo0o0O0.OooO00o oooO00o;
            oo0oOO0 oo0ooo0;
            boolean zOooO00o;
            int iOooOOO;
            while (true) {
                long jOooO0oo = o00o00o1.OooO0oo();
                j = o00o00o1.f39531OooO0OO;
                long j2 = j - 6;
                oooO00o = this.f39594OooO0OO;
                oo0ooo0 = this.f39592OooO00o;
                if (jOooO0oo >= j2) {
                    break;
                }
                long jOooO0oo2 = o00o00o1.OooO0oo();
                byte[] bArr = new byte[2];
                o00o00o1.OooO0Oo(bArr, 0, 2, false);
                int i = ((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE);
                int i2 = this.f39593OooO0O0;
                if (i != i2) {
                    o00o00o1.f39533OooO0o = 0;
                    o00o00o1.OooOO0o((int) (jOooO0oo2 - o00o00o1.f39532OooO0Oo), false);
                    zOooO00o = false;
                } else {
                    o00Oo00 o00oo00 = new o00Oo00(16);
                    System.arraycopy(bArr, 0, o00oo00.f40591OooO00o, 0, 2);
                    byte[] bArr2 = o00oo00.f40591OooO00o;
                    int i3 = 0;
                    for (int i4 = 2; i3 < 14 && (iOooOOO = o00o00o1.OooOOO(i4 + i3, 14 - i3, bArr2)) != -1; i4 = 2) {
                        i3 += iOooOOO;
                    }
                    o00oo00.Oooo000(i3);
                    o00o00o1.f39533OooO0o = 0;
                    o00o00o1.OooOO0o((int) (jOooO0oo2 - o00o00o1.f39532OooO0Oo), false);
                    zOooO00o = oo0o0O0.OooO00o(o00oo00, oo0ooo0, i2, oooO00o);
                }
                if (zOooO00o) {
                    break;
                }
                o00o00o1.OooOO0o(1, false);
            }
            if (o00o00o1.OooO0oo() < j - 6) {
                return oooO00o.f39577OooO00o;
            }
            o00o00o1.OooOO0o((int) (j - o00o00o1.OooO0oo()), false);
            return oo0ooo0.f39587OooOO0;
        }
    }

    public o0O0O0Oo(oo0oOO0 oo0ooo0, int i, long j, long j2) {
        long j3;
        long j4;
        Objects.requireNonNull(oo0ooo0);
        OooO0o oooO0o = new OooO0o(oo0ooo0);
        OooO00o oooO00o = new OooO00o(oo0ooo0, i);
        long jOooO0O0 = oo0ooo0.OooO0O0();
        long j5 = oo0ooo0.f39587OooOO0;
        int i2 = oo0ooo0.f39581OooO0OO;
        int i3 = oo0ooo0.f39582OooO0Oo;
        if (i3 > 0) {
            j3 = (((long) i3) + ((long) i2)) / 2;
            j4 = 1;
        } else {
            int i4 = oo0ooo0.f39580OooO0O0;
            int i5 = oo0ooo0.f39579OooO00o;
            j3 = ((((i5 != i4 || i5 <= 0) ? 4096L : i5) * ((long) oo0ooo0.f39585OooO0oO)) * ((long) oo0ooo0.f39586OooO0oo)) / 8;
            j4 = 64;
        }
        super(oooO0o, oooO00o, jOooO0O0, j5, j, j2, j3 + j4, Math.max(6, i2));
    }
}
