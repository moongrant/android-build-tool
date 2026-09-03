package p296o0O0OoO0;

import com.google.android.exoplayer2.ParserException;
import p265o00ooo00.Oooo0;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f35898OooO00o;

        public OooO00o(String[] strArr) {
            this.f35898OooO00o = strArr;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f35899OooO00o;

        public OooO0O0(boolean z) {
            this.f35899OooO00o = z;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f35900OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f35901OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f35902OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f35903OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f35904OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f35905OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final byte[] f35906OooO0oO;

        public OooO0OO(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f35900OooO00o = i;
            this.f35901OooO0O0 = i2;
            this.f35902OooO0OO = i3;
            this.f35903OooO0Oo = i4;
            this.f35905OooO0o0 = i5;
            this.f35904OooO0o = i6;
            this.f35906OooO0oO = bArr;
        }
    }

    public static int OooO00o(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static OooO00o OooO0O0(o000 o000Var, boolean z, boolean z2) throws ParserException {
        if (z) {
            OooO0OO(3, o000Var, false);
        }
        o000Var.OooOOO((int) o000Var.OooO0oo());
        long jOooO0oo = o000Var.OooO0oo();
        String[] strArr = new String[(int) jOooO0oo];
        for (int i = 0; i < jOooO0oo; i++) {
            strArr[i] = o000Var.OooOOO((int) o000Var.OooO0oo());
            strArr[i].length();
        }
        if (z2 && (o000Var.OooOOo0() & 1) == 0) {
            throw new ParserException("framing bit expected to be set");
        }
        return new OooO00o(strArr);
    }

    public static boolean OooO0OO(int i, o000 o000Var, boolean z) throws ParserException {
        if (o000Var.f36663OooO0OO - o000Var.f36662OooO0O0 < 7) {
            if (z) {
                return false;
            }
            throw new ParserException(Oooo0.OooO00o(29, "too short header: ", o000Var.f36663OooO0OO - o000Var.f36662OooO0O0));
        }
        if (o000Var.OooOOo0() != i) {
            if (z) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i));
            throw new ParserException(strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "));
        }
        if (o000Var.OooOOo0() == 118 && o000Var.OooOOo0() == 111 && o000Var.OooOOo0() == 114 && o000Var.OooOOo0() == 98 && o000Var.OooOOo0() == 105 && o000Var.OooOOo0() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new ParserException("expected characters 'vorbis'");
    }
}
