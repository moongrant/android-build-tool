package com.google.common.io;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Oooo0;
import com.google.common.base.o0O0O00;
import com.google.common.base.o0OoOo0;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO f19245OooO00o = new OooO0OO("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO f19246OooO0O0 = new OooO0OO("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    public static final class DecodingException extends IOException {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f19247OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final char[] f19248OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f19249OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f19250OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f19251OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f19252OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final byte[] f19253OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean[] f19254OooO0oo;

        public OooO00o(String str, char[] cArr) {
            this.f19247OooO00o = str;
            cArr.getClass();
            this.f19248OooO0O0 = cArr;
            try {
                int iOooO0OO = com.google.common.math.OooO00o.OooO0OO(cArr.length, RoundingMode.UNNECESSARY);
                this.f19250OooO0Oo = iOooO0OO;
                int iMin = Math.min(8, Integer.lowestOneBit(iOooO0OO));
                try {
                    this.f19252OooO0o0 = 8 / iMin;
                    this.f19251OooO0o = iOooO0OO / iMin;
                    this.f19249OooO0OO = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        if (!(c < 128)) {
                            throw new IllegalArgumentException(o0O0O00.OooO00o("Non-ASCII character: %s", Character.valueOf(c)));
                        }
                        if (!(bArr[c] == -1)) {
                            throw new IllegalArgumentException(o0O0O00.OooO00o("Duplicate character: %s", Character.valueOf(c)));
                        }
                        bArr[c] = (byte) i;
                    }
                    this.f19253OooO0oO = bArr;
                    boolean[] zArr = new boolean[this.f19252OooO0o0];
                    for (int i2 = 0; i2 < this.f19251OooO0o; i2++) {
                        zArr[com.google.common.math.OooO00o.OooO0O0(i2 * 8, this.f19250OooO0Oo, RoundingMode.CEILING)] = true;
                    }
                    this.f19254OooO0oo = zArr;
                } catch (ArithmeticException e) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                }
            } catch (ArithmeticException e2) {
                throw new IllegalArgumentException(android.support.v4.media.session.OooO0OO.OooO00o(35, "Illegal alphabet length ", cArr.length), e2);
            }
        }

        public final int OooO00o(char c) throws DecodingException {
            if (c > 127) {
                String strValueOf = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(strValueOf.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f19253OooO0oO[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                String strValueOf2 = String.valueOf(Integer.toHexString(c));
                throw new DecodingException(strValueOf2.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c);
            throw new DecodingException(sb.toString());
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (obj instanceof OooO00o) {
                return Arrays.equals(this.f19248OooO0O0, ((OooO00o) obj).f19248OooO0O0);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f19248OooO0O0);
        }

        public final String toString() {
            return this.f19247OooO00o;
        }
    }

    public static final class OooO0O0 extends OooO0o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final char[] f19255OooO0o0;

        public OooO0O0(OooO00o oooO00o) {
            super(oooO00o, null);
            this.f19255OooO0o0 = new char[ConstantsKt.MINIMUM_BLOCK_SIZE];
            char[] cArr = oooO00o.f19248OooO0O0;
            o0OoOo0.OooO0Oo(cArr.length == 16);
            for (int i = 0; i < 256; i++) {
                char[] cArr2 = this.f19255OooO0o0;
                cArr2[i] = cArr[i >>> 4];
                cArr2[i | PSKKeyManager.MAX_KEY_LENGTH_BYTES] = cArr[i & 15];
            }
        }

        @Override // com.google.common.io.BaseEncoding.OooO0o, com.google.common.io.BaseEncoding
        public final int OooO0O0(byte[] bArr, CharSequence charSequence) throws DecodingException {
            if (charSequence.length() % 2 == 1) {
                throw new DecodingException(android.support.v4.media.session.OooO0OO.OooO00o(32, "Invalid input length ", charSequence.length()));
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                char cCharAt = charSequence.charAt(i);
                OooO00o oooO00o = this.f19256OooO0OO;
                bArr[i2] = (byte) ((oooO00o.OooO00o(cCharAt) << 4) | oooO00o.OooO00o(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // com.google.common.io.BaseEncoding.OooO0o
        public final BaseEncoding OooO0o0(OooO00o oooO00o) {
            return new OooO0O0(oooO00o);
        }
    }

    public static final class OooO0OO extends OooO0o {
        public OooO0OO(String str, String str2, @CheckForNull Character ch) {
            this(new OooO00o(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding.OooO0o, com.google.common.io.BaseEncoding
        public final int OooO0O0(byte[] bArr, CharSequence charSequence) throws DecodingException {
            CharSequence charSequenceOooO0OO = OooO0OO(charSequence);
            int length = charSequenceOooO0OO.length();
            OooO00o oooO00o = this.f19256OooO0OO;
            if (!oooO00o.f19254OooO0oo[length % oooO00o.f19252OooO0o0]) {
                throw new DecodingException(android.support.v4.media.session.OooO0OO.OooO00o(32, "Invalid input length ", charSequenceOooO0OO.length()));
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceOooO0OO.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int iOooO00o = (oooO00o.OooO00o(charSequenceOooO0OO.charAt(i)) << 18) | (oooO00o.OooO00o(charSequenceOooO0OO.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (iOooO00o >>> 16);
                if (i4 < charSequenceOooO0OO.length()) {
                    int i6 = i4 + 1;
                    int iOooO00o2 = iOooO00o | (oooO00o.OooO00o(charSequenceOooO0OO.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((iOooO00o2 >>> 8) & 255);
                    if (i6 < charSequenceOooO0OO.length()) {
                        int i8 = i6 + 1;
                        int iOooO00o3 = iOooO00o2 | oooO00o.OooO00o(charSequenceOooO0OO.charAt(i6));
                        i2 = i7 + 1;
                        bArr[i7] = (byte) (iOooO00o3 & 255);
                        i = i8;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }

        public final void OooO0o(byte[] bArr, StringBuilder sb, int i) throws IOException {
            int i2 = 0;
            int i3 = 0 + i;
            o0OoOo0.OooOO0O(0, i3, bArr.length);
            while (i >= 3) {
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                int i6 = ((bArr[i2] & UByte.MAX_VALUE) << 16) | ((bArr[i4] & UByte.MAX_VALUE) << 8) | (bArr[i5] & UByte.MAX_VALUE);
                OooO00o oooO00o = this.f19256OooO0OO;
                sb.append(oooO00o.f19248OooO0O0[i6 >>> 18]);
                char[] cArr = oooO00o.f19248OooO0O0;
                sb.append(cArr[(i6 >>> 12) & 63]);
                sb.append(cArr[(i6 >>> 6) & 63]);
                sb.append(cArr[i6 & 63]);
                i -= 3;
                i2 = i5 + 1;
            }
            if (i2 < i3) {
                OooO0Oo(bArr, sb, i2, i3 - i2);
            }
        }

        @Override // com.google.common.io.BaseEncoding.OooO0o
        public final BaseEncoding OooO0o0(OooO00o oooO00o) {
            return new OooO0OO(oooO00o, null);
        }

        public OooO0OO(OooO00o oooO00o, @CheckForNull Character ch) {
            super(oooO00o, ch);
            o0OoOo0.OooO0Oo(oooO00o.f19248OooO0O0.length == 64);
        }
    }

    public static class OooO0o extends BaseEncoding {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO00o f19256OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @CheckForNull
        public final Character f19257OooO0Oo;

        public OooO0o(String str, String str2, @CheckForNull Character ch) {
            this(new OooO00o(str, str2.toCharArray()), ch);
        }

        @Override // com.google.common.io.BaseEncoding
        public int OooO0O0(byte[] bArr, CharSequence charSequence) throws DecodingException {
            int i;
            int i2;
            CharSequence charSequenceOooO0OO = OooO0OO(charSequence);
            int length = charSequenceOooO0OO.length();
            OooO00o oooO00o = this.f19256OooO0OO;
            if (!oooO00o.f19254OooO0oo[length % oooO00o.f19252OooO0o0]) {
                throw new DecodingException(android.support.v4.media.session.OooO0OO.OooO00o(32, "Invalid input length ", charSequenceOooO0OO.length()));
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < charSequenceOooO0OO.length()) {
                long jOooO00o = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    i = oooO00o.f19250OooO0Oo;
                    i2 = oooO00o.f19252OooO0o0;
                    if (i5 >= i2) {
                        break;
                    }
                    jOooO00o <<= i;
                    if (i3 + i5 < charSequenceOooO0OO.length()) {
                        jOooO00o |= (long) oooO00o.OooO00o(charSequenceOooO0OO.charAt(i6 + i3));
                        i6++;
                    }
                    i5++;
                }
                int i7 = oooO00o.f19251OooO0o;
                int i8 = (i7 * 8) - (i6 * i);
                int i9 = (i7 - 1) * 8;
                while (i9 >= i8) {
                    bArr[i4] = (byte) ((jOooO00o >>> i9) & 255);
                    i9 -= 8;
                    i4++;
                }
                i3 += i2;
            }
            return i4;
        }

        @Override // com.google.common.io.BaseEncoding
        public final CharSequence OooO0OO(CharSequence charSequence) {
            charSequence.getClass();
            Character ch = this.f19257OooO0Oo;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public final void OooO0Oo(byte[] bArr, StringBuilder sb, int i, int i2) throws IOException {
            o0OoOo0.OooOO0O(i, i + i2, bArr.length);
            OooO00o oooO00o = this.f19256OooO0OO;
            int i3 = 0;
            o0OoOo0.OooO0Oo(i2 <= oooO00o.f19251OooO0o);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & UByte.MAX_VALUE))) << 8;
            }
            int i5 = oooO00o.f19250OooO0Oo;
            int i6 = ((i2 + 1) * 8) - i5;
            while (i3 < i2 * 8) {
                sb.append(oooO00o.f19248OooO0O0[((int) (j >>> (i6 - i3))) & oooO00o.f19249OooO0OO]);
                i3 += i5;
            }
            Character ch = this.f19257OooO0Oo;
            if (ch != null) {
                while (i3 < oooO00o.f19251OooO0o * 8) {
                    sb.append(ch.charValue());
                    i3 += i5;
                }
            }
        }

        public BaseEncoding OooO0o0(OooO00o oooO00o) {
            return new OooO0o(oooO00o, null);
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f19256OooO0OO.equals(oooO0o.f19256OooO0OO) && Oooo0.OooO00o(this.f19257OooO0Oo, oooO0o.f19257OooO0Oo);
        }

        public final int hashCode() {
            return this.f19256OooO0OO.hashCode() ^ Arrays.hashCode(new Object[]{this.f19257OooO0Oo});
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            OooO00o oooO00o = this.f19256OooO0OO;
            sb.append(oooO00o.f19247OooO00o);
            if (8 % oooO00o.f19250OooO0Oo != 0) {
                Character ch = this.f19257OooO0Oo;
                if (ch == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(ch);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public OooO0o(OooO00o oooO00o, @CheckForNull Character ch) {
            oooO00o.getClass();
            this.f19256OooO0OO = oooO00o;
            boolean z = true;
            if (ch != null) {
                char cCharValue = ch.charValue();
                byte[] bArr = oooO00o.f19253OooO0oO;
                if (cCharValue < bArr.length && bArr[cCharValue] != -1) {
                    z = false;
                }
            }
            o0OoOo0.OooO0o(z, "Padding character %s was already in alphabet", ch);
            this.f19257OooO0Oo = ch;
        }
    }

    static {
        new OooO0o("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new OooO0o("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new OooO0O0(new OooO00o("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public final byte[] OooO00o(String str) {
        try {
            CharSequence charSequenceOooO0OO = OooO0OO(str);
            int length = (int) (((((long) ((OooO0o) this).f19256OooO0OO.f19250OooO0Oo) * ((long) charSequenceOooO0OO.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iOooO0O0 = OooO0O0(bArr, charSequenceOooO0OO);
            if (iOooO0O0 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iOooO0O0];
            System.arraycopy(bArr, 0, bArr2, 0, iOooO0O0);
            return bArr2;
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int OooO0O0(byte[] bArr, CharSequence charSequence) throws DecodingException;

    public abstract CharSequence OooO0OO(CharSequence charSequence);
}
