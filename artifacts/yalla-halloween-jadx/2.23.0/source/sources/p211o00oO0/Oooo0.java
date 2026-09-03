package p211o00oO0;

import java.io.IOException;
import kotlin.UByte;
import p209o00o0oo0.o00O00O;
import p209o00o0oo0.o00O00o0;
import p245o00oo0o.o00Oo00;
import p245o00oo0o.o0O00;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Oooo0 extends o00O00O {

    public static final class OooO00o implements o00O00O.OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0000O f39595OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00Oo00 f39596OooO0O0 = new o00Oo00();

        public OooO00o(o0O0000O o0o0000o2) {
            this.f39595OooO00o = o0o0000o2;
        }

        @Override // o00o0oo0.o00O00O.OooOO0
        public final o00O00O.OooO OooO00o(o00O00o0 o00o00o1, long j) throws IOException {
            int i;
            int i2;
            int iOooO0Oo;
            long j2 = o00o00o1.f39532OooO0Oo;
            int iMin = (int) Math.min(20000L, o00o00o1.f39531OooO0OO - j2);
            o00Oo00 o00oo00 = this.f39596OooO0O0;
            o00oo00.OooOooO(iMin);
            o00o00o1.OooO0Oo(o00oo00.f40591OooO00o, 0, iMin, false);
            int i3 = -1;
            int i4 = -1;
            long j3 = -9223372036854775807L;
            while (true) {
                int i5 = o00oo00.f40593OooO0OO;
                int i6 = o00oo00.f40592OooO0O0;
                if (i5 - i6 < 4) {
                    return j3 != -9223372036854775807L ? new o00O00O.OooO(-2, j3, j2 + ((long) i3)) : o00O00O.OooO.f39503OooO0Oo;
                }
                if (Oooo0.OooO0Oo(i6, o00oo00.f40591OooO00o) != 442) {
                    o00oo00.Oooo00o(1);
                } else {
                    o00oo00.Oooo00o(4);
                    long jOooO0OO = o000oOoO.OooO0OO(o00oo00);
                    if (jOooO0OO != -9223372036854775807L) {
                        long jOooO0O0 = this.f39595OooO00o.OooO0O0(jOooO0OO);
                        if (jOooO0O0 > j) {
                            return j3 == -9223372036854775807L ? new o00O00O.OooO(-1, jOooO0O0, j2) : o00O00O.OooO.OooO00o(j2 + ((long) i4));
                        }
                        if (100000 + jOooO0O0 > j) {
                            return o00O00O.OooO.OooO00o(j2 + ((long) o00oo00.f40592OooO0O0));
                        }
                        i4 = o00oo00.f40592OooO0O0;
                        j3 = jOooO0O0;
                    }
                    int i7 = o00oo00.f40593OooO0OO;
                    if (i7 - o00oo00.f40592OooO0O0 < 10) {
                        o00oo00.Oooo00O(i7);
                    } else {
                        o00oo00.Oooo00o(9);
                        int iOooOo0O = o00oo00.OooOo0O() & 7;
                        if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < iOooOo0O) {
                            o00oo00.Oooo00O(i7);
                        } else {
                            o00oo00.Oooo00o(iOooOo0O);
                            int i8 = o00oo00.f40593OooO0OO;
                            int i9 = o00oo00.f40592OooO0O0;
                            if (i8 - i9 < 4) {
                                o00oo00.Oooo00O(i7);
                            } else if (Oooo0.OooO0Oo(i9, o00oo00.f40591OooO00o) == 443) {
                                o00oo00.Oooo00o(4);
                                int iOooOoOO = o00oo00.OooOoOO();
                                if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < iOooOoOO) {
                                    o00oo00.Oooo00O(i7);
                                } else {
                                    o00oo00.Oooo00o(iOooOoOO);
                                    while (true) {
                                        i = o00oo00.f40593OooO0OO;
                                        i2 = o00oo00.f40592OooO0O0;
                                        if (i - i2 < 4 || (iOooO0Oo = Oooo0.OooO0Oo(i2, o00oo00.f40591OooO00o)) == 442 || iOooO0Oo == 441 || (iOooO0Oo >>> 8) != 1) {
                                            break;
                                        }
                                        o00oo00.Oooo00o(4);
                                        if (o00oo00.f40593OooO0OO - o00oo00.f40592OooO0O0 < 2) {
                                            o00oo00.Oooo00O(i7);
                                            break;
                                        }
                                        o00oo00.Oooo00O(Math.min(o00oo00.f40593OooO0OO, o00oo00.f40592OooO0O0 + o00oo00.OooOoOO()));
                                    }
                                }
                            } else {
                                while (true) {
                                    i = o00oo00.f40593OooO0OO;
                                    i2 = o00oo00.f40592OooO0O0;
                                    if (i - i2 < 4) {
                                        break;
                                    }
                                    break;
                                    o00oo00.Oooo00O(Math.min(o00oo00.f40593OooO0OO, o00oo00.f40592OooO0O0 + o00oo00.OooOoOO()));
                                }
                            }
                        }
                    }
                    i3 = o00oo00.f40592OooO0O0;
                }
            }
        }

        @Override // o00o0oo0.o00O00O.OooOO0
        public final void OooO0O0() {
            byte[] bArr = o0O00.f40599OooO0o;
            o00Oo00 o00oo00 = this.f39596OooO0O0;
            o00oo00.getClass();
            o00oo00.OooOooo(bArr.length, bArr);
        }
    }

    public Oooo0(o0O0000O o0o0000o2, long j, long j2) {
        super(new o00O00O.OooO0O0(), new OooO00o(o0o0000o2), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int OooO0Oo(int i, byte[] bArr) {
        return (bArr[i + 3] & UByte.MAX_VALUE) | ((bArr[i] & UByte.MAX_VALUE) << 24) | ((bArr[i + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i + 2] & UByte.MAX_VALUE) << 8);
    }
}
