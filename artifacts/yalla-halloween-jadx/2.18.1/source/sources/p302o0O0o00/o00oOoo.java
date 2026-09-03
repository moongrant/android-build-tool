package p302o0O0o00;

import com.android.billingclient.api.o0000;
import java.io.IOException;
import java.util.Objects;
import p296o0O0OoO0.OooOOOO;
import p296o0O0OoO0.o000oOoO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000O0O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo extends OooOOOO {

    public static final class OooO00o implements OooOOOO.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O0O0 f36086OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000 f36087OooO0O0 = new o000();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f36088OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f36089OooO0Oo;

        public OooO00o(int i, o000O0O0 o000o0o1, int i2) {
            this.f36088OooO0OO = i;
            this.f36086OooO00o = o000o0o1;
            this.f36089OooO0Oo = i2;
        }

        @Override // o0O0OoO0.OooOOOO.OooOO0
        public final OooOOOO.OooO OooO00o(o000oOoO o000oooo2, long j) throws IOException {
            long position = o000oooo2.getPosition();
            int iMin = (int) Math.min(this.f36089OooO0Oo, o000oooo2.OooO00o() - position);
            this.f36087OooO0O0.OooOo(iMin);
            o000oooo2.OooOOO0(this.f36087OooO0O0.f36661OooO00o, 0, iMin);
            o000 o000Var = this.f36087OooO0O0;
            int i = o000Var.f36663OooO0OO;
            long j2 = -1;
            long j3 = -1;
            long j4 = -9223372036854775807L;
            while (true) {
                int i2 = o000Var.f36663OooO0OO;
                int i3 = o000Var.f36662OooO0O0;
                if (i2 - i3 < 188) {
                    break;
                }
                byte[] bArr = o000Var.f36661OooO00o;
                while (i3 < i && bArr[i3] != 71) {
                    i3++;
                }
                int i4 = i3 + 188;
                if (i4 > i) {
                    break;
                }
                long jOooO0oO = o0000.OooO0oO(o000Var, i3, this.f36088OooO0OO);
                if (jOooO0oO != -9223372036854775807L) {
                    long jOooO0O0 = this.f36086OooO00o.OooO0O0(jOooO0oO);
                    if (jOooO0O0 > j) {
                        return j4 == -9223372036854775807L ? OooOOOO.OooO.OooO00o(jOooO0O0, position) : OooOOOO.OooO.OooO0O0(position + j3);
                    }
                    if (100000 + jOooO0O0 > j) {
                        return OooOOOO.OooO.OooO0O0(position + ((long) i3));
                    }
                    j4 = jOooO0O0;
                    j3 = i3;
                }
                o000Var.OooOoOO(i4);
                j2 = i4;
            }
            return j4 != -9223372036854775807L ? OooOOOO.OooO.OooO0OO(j4, position + j2) : OooOOOO.OooO.f35858OooO0Oo;
        }

        @Override // o0O0OoO0.OooOOOO.OooOO0
        public final void OooO0O0() {
            o000 o000Var = this.f36087OooO0O0;
            byte[] bArr = o000OOo0.f36744OooO0o;
            Objects.requireNonNull(o000Var);
            o000Var.OooOoO0(bArr, bArr.length);
        }
    }

    public o00oOoo(o000O0O0 o000o0o1, long j, long j2, int i, int i2) {
        super(new OooOOOO.OooO0O0(), new OooO00o(i, o000o0o1, i2), j, j + 1, 0L, j2, 188L, 940);
    }
}
