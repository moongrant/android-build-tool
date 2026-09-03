package p103o000oo00;

import java.io.IOException;
import kotlin.UByte;
import o000OOoO.OooO0o;
import o000OOoO.OooOO0O;
import p080o000OoO.o00;
import p080o000OoO.o000O000;
import p080o000OoO.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends OooO0o {

    public static final class OooO00o implements OooO0o.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000O0Oo f35690OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O000 f35691OooO0O0 = new o000O000();

        public OooO00o(o000O0Oo o000o0oo2) {
            this.f35690OooO00o = o000o0oo2;
        }

        @Override // o000OOoO.OooO0o.OooOO0
        public final OooO0o.OooO OooO00o(OooOO0O oooOO0O, long j) throws IOException {
            int i;
            int i2;
            int iOooO0Oo;
            long j2 = oooOO0O.f34678OooO0Oo;
            int iMin = (int) Math.min(20000L, oooOO0O.f34677OooO0OO - j2);
            o000O000 o000o001 = this.f35691OooO0O0;
            o000o001.OooOooO(iMin);
            oooOO0O.OooO0OO(o000o001.f34962OooO00o, 0, iMin, false);
            int i3 = -1;
            int i4 = -1;
            long j3 = -9223372036854775807L;
            while (true) {
                int i5 = o000o001.f34964OooO0OO;
                int i6 = o000o001.f34963OooO0O0;
                if (i5 - i6 < 4) {
                    return j3 != -9223372036854775807L ? new OooO0o.OooO(-2, j3, j2 + ((long) i3)) : OooO0o.OooO.f34649OooO0Oo;
                }
                if (o0OoOo0.OooO0Oo(i6, o000o001.f34962OooO00o) != 442) {
                    o000o001.Oooo00o(1);
                } else {
                    o000o001.Oooo00o(4);
                    long jOooO0OO = o00O0O.OooO0OO(o000o001);
                    if (jOooO0OO != -9223372036854775807L) {
                        long jOooO0O0 = this.f35690OooO00o.OooO0O0(jOooO0OO);
                        if (jOooO0O0 > j) {
                            return j3 == -9223372036854775807L ? new OooO0o.OooO(-1, jOooO0O0, j2) : OooO0o.OooO.OooO00o(j2 + ((long) i4));
                        }
                        if (100000 + jOooO0O0 > j) {
                            return OooO0o.OooO.OooO00o(j2 + ((long) o000o001.f34963OooO0O0));
                        }
                        i4 = o000o001.f34963OooO0O0;
                        j3 = jOooO0O0;
                    }
                    int i7 = o000o001.f34964OooO0OO;
                    if (i7 - o000o001.f34963OooO0O0 < 10) {
                        o000o001.Oooo00O(i7);
                    } else {
                        o000o001.Oooo00o(9);
                        int iOooOo0O = o000o001.OooOo0O() & 7;
                        if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < iOooOo0O) {
                            o000o001.Oooo00O(i7);
                        } else {
                            o000o001.Oooo00o(iOooOo0O);
                            int i8 = o000o001.f34964OooO0OO;
                            int i9 = o000o001.f34963OooO0O0;
                            if (i8 - i9 < 4) {
                                o000o001.Oooo00O(i7);
                            } else if (o0OoOo0.OooO0Oo(i9, o000o001.f34962OooO00o) == 443) {
                                o000o001.Oooo00o(4);
                                int iOooOoOO = o000o001.OooOoOO();
                                if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < iOooOoOO) {
                                    o000o001.Oooo00O(i7);
                                } else {
                                    o000o001.Oooo00o(iOooOoOO);
                                    while (true) {
                                        i = o000o001.f34964OooO0OO;
                                        i2 = o000o001.f34963OooO0O0;
                                        if (i - i2 < 4 || (iOooO0Oo = o0OoOo0.OooO0Oo(i2, o000o001.f34962OooO00o)) == 442 || iOooO0Oo == 441 || (iOooO0Oo >>> 8) != 1) {
                                            break;
                                        }
                                        o000o001.Oooo00o(4);
                                        if (o000o001.f34964OooO0OO - o000o001.f34963OooO0O0 < 2) {
                                            o000o001.Oooo00O(i7);
                                            break;
                                        }
                                        o000o001.Oooo00O(Math.min(o000o001.f34964OooO0OO, o000o001.f34963OooO0O0 + o000o001.OooOoOO()));
                                    }
                                }
                            } else {
                                while (true) {
                                    i = o000o001.f34964OooO0OO;
                                    i2 = o000o001.f34963OooO0O0;
                                    if (i - i2 < 4) {
                                        break;
                                    }
                                    break;
                                    o000o001.Oooo00O(Math.min(o000o001.f34964OooO0OO, o000o001.f34963OooO0O0 + o000o001.OooOoOO()));
                                }
                            }
                        }
                    }
                    i3 = o000o001.f34963OooO0O0;
                }
            }
        }

        @Override // o000OOoO.OooO0o.OooOO0
        public final void OooO0O0() {
            byte[] bArr = o00.f34914OooO0o;
            o000O000 o000o001 = this.f35691OooO0O0;
            o000o001.getClass();
            o000o001.OooOooo(bArr.length, bArr);
        }
    }

    public o0OoOo0(o000O0Oo o000o0oo2, long j, long j2) {
        super(new OooO0o.OooO0O0(), new OooO00o(o000o0oo2), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int OooO0Oo(int i, byte[] bArr) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }
}
