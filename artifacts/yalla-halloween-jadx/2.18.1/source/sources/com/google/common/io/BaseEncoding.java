package com.google.common.io;

import com.google.common.annotations.GwtCompatible;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import o0OOOO0o.OooOOO;
import o0OOOO0o.OooOOOO;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO f18708OooO00o = new OooO0OO("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    public static final class DecodingException extends IOException {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f18709OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final char[] f18710OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f18711OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f18712OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f18713OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f18714OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final byte[] f18715OooO0oO;

        public OooO00o(String str, char[] cArr) {
            this.f18709OooO00o = str;
            Objects.requireNonNull(cArr);
            this.f18710OooO0O0 = cArr;
            try {
                int iOooO0O0 = o0OOOOO0.OooO00o.OooO0O0(cArr.length, RoundingMode.UNNECESSARY);
                this.f18712OooO0Oo = iOooO0O0;
                int iMin = Math.min(8, Integer.lowestOneBit(iOooO0O0));
                try {
                    this.f18714OooO0o0 = 8 / iMin;
                    this.f18713OooO0o = iOooO0O0 / iMin;
                    this.f18711OooO0OO = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        OooOOOO.OooO0o0(c < 128, "Non-ASCII character: %s", c);
                        OooOOOO.OooO0o0(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.f18715OooO0oO = bArr;
                    boolean[] zArr = new boolean[this.f18714OooO0o0];
                    for (int i2 = 0; i2 < this.f18713OooO0o; i2++) {
                        zArr[o0OOOOO0.OooO00o.OooO00o(i2 * 8, this.f18712OooO0Oo, RoundingMode.CEILING)] = true;
                    }
                } catch (ArithmeticException e) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Illegal alphabet ");
                    sbOooO0o0.append(new String(cArr));
                    throw new IllegalArgumentException(sbOooO0o0.toString(), e);
                }
            } catch (ArithmeticException e2) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Illegal alphabet length ");
                sbOooO0o1.append(cArr.length);
                throw new IllegalArgumentException(sbOooO0o1.toString(), e2);
            }
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (obj instanceof OooO00o) {
                return Arrays.equals(this.f18710OooO0O0, ((OooO00o) obj).f18710OooO0O0);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f18710OooO0O0);
        }

        public final String toString() {
            return this.f18709OooO00o;
        }
    }

    public static final class OooO0O0 extends OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final char[] f18716OooO0Oo;

        public OooO0O0(OooO00o oooO00o) {
            super(oooO00o, null);
            this.f18716OooO0Oo = new char[512];
            OooOOOO.OooO0O0(oooO00o.f18710OooO0O0.length == 16);
            for (int i = 0; i < 256; i++) {
                char[] cArr = this.f18716OooO0Oo;
                char[] cArr2 = oooO00o.f18710OooO0O0;
                cArr[i] = cArr2[i >>> 4];
                cArr[i | 256] = cArr2[i & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.OooO0o
        public final BaseEncoding OooO00o(OooO00o oooO00o) {
            return new OooO0O0(oooO00o);
        }
    }

    public static class OooO0o extends BaseEncoding {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO00o f18717OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NullableDecl
        public final Character f18718OooO0OO;

        /* JADX WARN: Code duplicated, block: B:11:0x001f  */
        public OooO0o(OooO00o oooO00o, @NullableDecl Character ch) {
            boolean z;
            Objects.requireNonNull(oooO00o);
            this.f18717OooO0O0 = oooO00o;
            if (ch != null) {
                char cCharValue = ch.charValue();
                byte[] bArr = oooO00o.f18715OooO0oO;
                z = cCharValue < bArr.length && bArr[cCharValue] != -1 ? false : true;
            }
            OooOOOO.OooO0oO(z, "Padding character %s was already in alphabet", ch);
            this.f18718OooO0OO = ch;
        }

        public BaseEncoding OooO00o(OooO00o oooO00o) {
            return new OooO0o(oooO00o, null);
        }

        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f18717OooO0O0.equals(oooO0o.f18717OooO0O0) && OooOOO.OooO00o(this.f18718OooO0OO, oooO0o.f18718OooO0OO);
        }

        public final int hashCode() {
            return this.f18717OooO0O0.hashCode() ^ Arrays.hashCode(new Object[]{this.f18718OooO0OO});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f18717OooO0O0.f18709OooO00o);
            if (8 % this.f18717OooO0O0.f18712OooO0Oo != 0) {
                if (this.f18718OooO0OO == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f18718OooO0OO);
                    sb.append("')");
                }
            }
            return sb.toString();
        }
    }

    static {
        new OooO0OO("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
        new OooO0o(new OooO00o("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        new OooO0o(new OooO00o("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
        new OooO0O0(new OooO00o("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public static final class OooO0OO extends OooO0o {
        public OooO0OO(String str, String str2, @NullableDecl Character ch) {
            OooO00o oooO00o = new OooO00o(str, str2.toCharArray());
            super(oooO00o, ch);
            OooOOOO.OooO0O0(oooO00o.f18710OooO0O0.length == 64);
        }

        @Override // com.google.common.io.BaseEncoding.OooO0o
        public final BaseEncoding OooO00o(OooO00o oooO00o) {
            return new OooO0OO(oooO00o);
        }

        public OooO0OO(OooO00o oooO00o) {
            super(oooO00o, null);
            OooOOOO.OooO0O0(oooO00o.f18710OooO0O0.length == 64);
        }
    }
}
