package p302o0O0o00;

import java.io.IOException;
import java.util.Objects;
import kotlin.UByte;
import p296o0O0OoO0.OooOOOO;
import p296o0O0OoO0.o000oOoO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o000O0O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 extends OooOOOO {

    public static final class OooO00o implements OooOOOO.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O0O0 f36083OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000 f36084OooO0O0 = new o000();

        public OooO00o(o000O0O0 o000o0o1) {
            this.f36083OooO00o = o000o0o1;
        }

        @Override // o0O0OoO0.OooOOOO.OooOO0
        public final OooOOOO.OooO OooO00o(o000oOoO o000oooo2, long j) throws IOException {
            int i;
            int i2;
            int iOooO0oO;
            long position = o000oooo2.getPosition();
            int iMin = (int) Math.min(20000L, o000oooo2.OooO00o() - position);
            this.f36084OooO0O0.OooOo(iMin);
            o000oooo2.OooOOO0(this.f36084OooO0O0.f36661OooO00o, 0, iMin);
            o000 o000Var = this.f36084OooO0O0;
            int i3 = -1;
            long j2 = -9223372036854775807L;
            int i4 = -1;
            while (true) {
                int i5 = o000Var.f36663OooO0OO;
                int i6 = o000Var.f36662OooO0O0;
                if (i5 - i6 < 4) {
                    return j2 != -9223372036854775807L ? OooOOOO.OooO.OooO0OO(j2, position + ((long) i3)) : OooOOOO.OooO.f35858OooO0Oo;
                }
                if (o00O0000.OooO0oO(o000Var.f36661OooO00o, i6) != 442) {
                    o000Var.OooOoo0(1);
                } else {
                    o000Var.OooOoo0(4);
                    long jOooO0OO = o0O0ooO.OooO0OO(o000Var);
                    if (jOooO0OO != -9223372036854775807L) {
                        long jOooO0O0 = this.f36083OooO00o.OooO0O0(jOooO0OO);
                        if (jOooO0O0 > j) {
                            return j2 == -9223372036854775807L ? OooOOOO.OooO.OooO00o(jOooO0O0, position) : OooOOOO.OooO.OooO0O0(position + ((long) i4));
                        }
                        if (100000 + jOooO0O0 > j) {
                            return OooOOOO.OooO.OooO0O0(position + ((long) o000Var.f36662OooO0O0));
                        }
                        i4 = o000Var.f36662OooO0O0;
                        j2 = jOooO0O0;
                    }
                    int i7 = o000Var.f36663OooO0OO;
                    if (i7 - o000Var.f36662OooO0O0 < 10) {
                        o000Var.OooOoOO(i7);
                    } else {
                        o000Var.OooOoo0(9);
                        int iOooOOo0 = o000Var.OooOOo0() & 7;
                        if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < iOooOOo0) {
                            o000Var.OooOoOO(i7);
                        } else {
                            o000Var.OooOoo0(iOooOOo0);
                            int i8 = o000Var.f36663OooO0OO;
                            int i9 = o000Var.f36662OooO0O0;
                            if (i8 - i9 < 4) {
                                o000Var.OooOoOO(i7);
                            } else if (o00O0000.OooO0oO(o000Var.f36661OooO00o, i9) == 443) {
                                o000Var.OooOoo0(4);
                                int iOooOo0O = o000Var.OooOo0O();
                                if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < iOooOo0O) {
                                    o000Var.OooOoOO(i7);
                                } else {
                                    o000Var.OooOoo0(iOooOo0O);
                                    while (true) {
                                        i = o000Var.f36663OooO0OO;
                                        i2 = o000Var.f36662OooO0O0;
                                        if (i - i2 < 4 || (iOooO0oO = o00O0000.OooO0oO(o000Var.f36661OooO00o, i2)) == 442 || iOooO0oO == 441 || (iOooO0oO >>> 8) != 1) {
                                            break;
                                        }
                                        o000Var.OooOoo0(4);
                                        if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < 2) {
                                            o000Var.OooOoOO(i7);
                                            break;
                                        }
                                        o000Var.OooOoOO(Math.min(o000Var.f36663OooO0OO, o000Var.f36662OooO0O0 + o000Var.OooOo0O()));
                                    }
                                }
                            } else {
                                while (true) {
                                    i = o000Var.f36663OooO0OO;
                                    i2 = o000Var.f36662OooO0O0;
                                    if (i - i2 < 4) {
                                        break;
                                    }
                                    break;
                                    o000Var.OooOoOO(Math.min(o000Var.f36663OooO0OO, o000Var.f36662OooO0O0 + o000Var.OooOo0O()));
                                }
                            }
                        }
                    }
                    i3 = o000Var.f36662OooO0O0;
                }
            }
        }

        @Override // o0O0OoO0.OooOOOO.OooOO0
        public final void OooO0O0() {
            o000 o000Var = this.f36084OooO0O0;
            byte[] bArr = o000OOo0.f36744OooO0o;
            Objects.requireNonNull(o000Var);
            o000Var.OooOoO0(bArr, bArr.length);
        }
    }

    public o00O0000(o000O0O0 o000o0o1, long j, long j2) {
        super(new OooOOOO.OooO0O0(), new OooO00o(o000o0o1), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int OooO0oO(byte[] bArr, int i) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }
}
