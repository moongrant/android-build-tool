package okio;

import com.umeng.analytics.pro.bz;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p028Oooo0o0.o0O0ooO;
import p674o0oooo0.o00OOO0;
import p674o0oooo0.o00OOO0O;
import p674o0oooo0.o0oOO;
import p676o0oooo0O.oOo000o0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "Oooo0oo", "[B", "getData$okio", "()[B", "data", "OooO00o", "okio"}, k = 1, mv = {1, 4, 1})
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public transient int f53048Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public transient String f53049Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] data;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final OooO00o f53047OoooO00 = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f53046Oooo = new ByteString(new byte[0]);

    public static final class OooO00o {
        /* JADX WARN: Code duplicated, block: B:66:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
        @JvmStatic
        @Nullable
        public final ByteString OooO00o(@NotNull String decodeBase64ToArray) {
            int i;
            int i2;
            char cCharAt;
            Intrinsics.checkNotNullParameter(decodeBase64ToArray, "$this$decodeBase64");
            byte[] bArr = o00OOO0.f52034OooO00o;
            Intrinsics.checkNotNullParameter(decodeBase64ToArray, "$this$decodeBase64ToArray");
            int length = decodeBase64ToArray.length();
            while (length > 0 && ((cCharAt = decodeBase64ToArray.charAt((i2 = length - 1))) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length = i2;
            }
            int i3 = (int) ((((long) length) * 6) / 8);
            byte[] bArrCopyOf = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i4 >= length) {
                    int i8 = i5 % 4;
                    if (i8 != 1) {
                        if (i8 == 2) {
                            bArrCopyOf[i7] = (byte) ((i6 << 12) >> 16);
                            i7++;
                        } else if (i8 == 3) {
                            int i9 = i6 << 6;
                            int i10 = i7 + 1;
                            bArrCopyOf[i7] = (byte) (i9 >> 16);
                            i7 = i10 + 1;
                            bArrCopyOf[i10] = (byte) (i9 >> 8);
                        }
                        if (i7 != i3) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new ByteString(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = decodeBase64ToArray.charAt(i4);
                if ('A' <= cCharAt2 && 'Z' >= cCharAt2) {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && 'z' >= cCharAt2) {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && '9' >= cCharAt2) {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                    i = 62;
                } else {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                    } else {
                        i = 63;
                    }
                    i4++;
                }
                i6 = (i6 << 6) | i;
                i5++;
                if (i5 % 4 == 0) {
                    int i11 = i7 + 1;
                    bArrCopyOf[i7] = (byte) (i6 >> 16);
                    int i12 = i11 + 1;
                    bArrCopyOf[i11] = (byte) (i6 >> 8);
                    bArrCopyOf[i12] = (byte) i6;
                    i7 = i12 + 1;
                }
                i4++;
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new ByteString(bArrCopyOf);
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final ByteString OooO0O0(@NotNull String decodeHex) {
            Intrinsics.checkNotNullParameter(decodeHex, "$this$decodeHex");
            if (!(decodeHex.length() % 2 == 0)) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo("Unexpected hex string: ", decodeHex).toString());
            }
            int length = decodeHex.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (oOo000o0.OooO00o(decodeHex.charAt(i2 + 1)) + (oOo000o0.OooO00o(decodeHex.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }

        @JvmStatic
        @NotNull
        public final ByteString OooO0OO(@NotNull String asUtf8ToByteArray) {
            Intrinsics.checkNotNullParameter(asUtf8ToByteArray, "$this$encodeUtf8");
            Intrinsics.checkNotNullParameter(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
            byte[] bytes = asUtf8ToByteArray.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.f53049Oooo0oO = asUtf8ToByteArray;
            return byteString;
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public final ByteString OooO0Oo(@NotNull byte[] toByteString, int i, int i2) {
            Intrinsics.checkNotNullParameter(toByteString, "$this$toByteString");
            o00OOO0O.OooO0O0(toByteString.length, i, i2);
            return new ByteString(ArraysKt.copyOfRange(toByteString, i, i2 + i));
        }
    }

    public ByteString(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @JvmStatic
    @NotNull
    public static final ByteString OooO(@NotNull byte... data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(bArrCopyOf);
    }

    @JvmStatic
    @NotNull
    public static final ByteString OooO0Oo(@NotNull String str) {
        return f53047OoooO00.OooO0OO(str);
    }

    private final void readObject(ObjectInputStream in) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = in.readInt();
        Intrinsics.checkNotNullParameter(in, "$this$readByteString");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("byteCount < 0: ", i).toString());
        }
        byte[] bArr = new byte[i];
        while (i2 < i) {
            int i3 = in.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        ByteString byteString = new ByteString(bArr);
        Field field = ByteString.class.getDeclaredField("Oooo0oo");
        Intrinsics.checkNotNullExpressionValue(field, "field");
        field.setAccessible(true);
        field.set(this, byteString.data);
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    @NotNull
    public String OooO00o() {
        byte[] encodeBase64 = this.data;
        byte[] bArr = o00OOO0.f52034OooO00o;
        byte[] map = o00OOO0.f52034OooO00o;
        Intrinsics.checkNotNullParameter(encodeBase64, "$this$encodeBase64");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] toUtf8String = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = encodeBase64[i];
            int i4 = i3 + 1;
            byte b2 = encodeBase64[i3];
            int i5 = i4 + 1;
            byte b3 = encodeBase64[i4];
            int i6 = i2 + 1;
            toUtf8String[i2] = map[(b & UByte.MAX_VALUE) >> 2];
            int i7 = i6 + 1;
            toUtf8String[i6] = map[((b & 3) << 4) | ((b2 & UByte.MAX_VALUE) >> 4)];
            int i8 = i7 + 1;
            toUtf8String[i7] = map[((b2 & bz.m) << 2) | ((b3 & UByte.MAX_VALUE) >> 6)];
            i2 = i8 + 1;
            toUtf8String[i8] = map[b3 & 63];
            i = i5;
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b4 = encodeBase64[i];
            int i9 = i2 + 1;
            toUtf8String[i2] = map[(b4 & UByte.MAX_VALUE) >> 2];
            int i10 = i9 + 1;
            toUtf8String[i9] = map[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            toUtf8String[i10] = b5;
            toUtf8String[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = encodeBase64[i];
            byte b7 = encodeBase64[i11];
            int i12 = i2 + 1;
            toUtf8String[i2] = map[(b6 & UByte.MAX_VALUE) >> 2];
            int i13 = i12 + 1;
            toUtf8String[i12] = map[((b6 & 3) << 4) | ((b7 & UByte.MAX_VALUE) >> 4)];
            toUtf8String[i13] = map[(b7 & bz.m) << 2];
            toUtf8String[i13 + 1] = (byte) 61;
        }
        Intrinsics.checkNotNullParameter(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, Charsets.UTF_8);
    }

    @NotNull
    public ByteString OooO0O0(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, OooO0o0());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    @NotNull
    public String OooO0o() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = oOo000o0.f52109OooO00o;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & bz.m];
        }
        return new String(cArr);
    }

    public int OooO0o0() {
        return this.data.length;
    }

    @NotNull
    /* JADX INFO: renamed from: OooO0oO, reason: from getter */
    public byte[] getData() {
        return this.data;
    }

    public byte OooO0oo(int i) {
        return this.data[i];
    }

    public boolean OooOO0(int i, @NotNull byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i >= 0) {
            byte[] bArr = this.data;
            if (i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && o00OOO0O.OooO00o(bArr, i, other, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public boolean OooOO0O(@NotNull ByteString other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.OooOO0(0, this.data, 0, i);
    }

    @NotNull
    public ByteString OooOO0o() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 >= b3 && b2 <= (b = (byte) 90)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b4 = bArrCopyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        bArrCopyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
            i++;
        }
    }

    @NotNull
    public final String OooOOO() {
        String str = this.f53049Oooo0oO;
        if (str != null) {
            return str;
        }
        byte[] toUtf8String = getData();
        Intrinsics.checkNotNullParameter(toUtf8String, "$this$toUtf8String");
        String str2 = new String(toUtf8String, Charsets.UTF_8);
        this.f53049Oooo0oO = str2;
        return str2;
    }

    @NotNull
    public byte[] OooOOO0() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return bArrCopyOf;
    }

    public void OooOOOO(@NotNull o0oOO buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.OoooOoO(this.data, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(ByteString byteString) {
        ByteString other = byteString;
        Intrinsics.checkNotNullParameter(other, "other");
        int iOooO0o0 = OooO0o0();
        int iOooO0o1 = other.OooO0o0();
        int iMin = Math.min(iOooO0o0, iOooO0o1);
        for (int i = 0; i < iMin; i++) {
            int iOooO0oo = OooO0oo(i) & UByte.MAX_VALUE;
            int iOooO0oo2 = other.OooO0oo(i) & UByte.MAX_VALUE;
            if (iOooO0oo != iOooO0oo2) {
                if (iOooO0oo < iOooO0oo2) {
                    return -1;
                }
                return 1;
            }
        }
        if (iOooO0o0 == iOooO0o1) {
            return 0;
        }
        if (iOooO0o0 < iOooO0o1) {
            return -1;
        }
        return 1;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iOooO0o0 = byteString.OooO0o0();
            byte[] bArr = this.data;
            if (iOooO0o0 == bArr.length && byteString.OooOO0(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f53048Oooo0o;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.f53048Oooo0o = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0144  */
    /* JADX WARN: Code duplicated, block: B:141:0x014b  */
    /* JADX WARN: Code duplicated, block: B:143:0x014f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0151  */
    /* JADX WARN: Code duplicated, block: B:203:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:206:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:208:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:209:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:213:0x01f4 A[EDGE_INSN: B:213:0x01f4->B:214:0x01f5 BREAK  A[LOOP:0: B:9:0x0014->B:274:0x0014]] */
    /* JADX WARN: Code duplicated, block: B:240:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:272:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0078  */
    /* JADX WARN: Code duplicated, block: B:53:0x007a  */
    /* JADX WARN: Code duplicated, block: B:85:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:91:0x00ce  */
    @NotNull
    public String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        loop0: while (i7 < length) {
            byte b = bArr[i7];
            if (b < 0) {
                if ((b >> 5) != -2) {
                    if ((b >> 4) != -2) {
                        if ((b >> 3) != -2) {
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        int i10 = i7 + 3;
                        if (length > i10) {
                            byte b2 = bArr[i7];
                            byte b3 = bArr[i7 + 1];
                            if (!((b3 & 192) == 128)) {
                                if (i8 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            byte b4 = bArr[i7 + 2];
                            if (!((b4 & 192) == 128)) {
                                if (i8 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            byte b5 = bArr[i10];
                            if (!((b5 & 192) == 128)) {
                                if (i8 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            int i11 = (((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i11 <= 1114111) {
                                if (55296 > i11 || 57343 < i11) {
                                    if (i11 >= 65536) {
                                        int i12 = i8 + 1;
                                        if (i8 == 64) {
                                            break;
                                        }
                                        if (i11 != 10 && i11 != 13) {
                                            if (!((i11 >= 0 && 31 >= i11) || (127 <= i11 && 159 >= i11))) {
                                                if (i11 == 65533) {
                                                    if (i11 < 65536) {
                                                        i6 = 1;
                                                    } else {
                                                        i6 = 2;
                                                    }
                                                    i9 += i6;
                                                    Unit unit = Unit.INSTANCE;
                                                    i7 += 4;
                                                    i8 = i12;
                                                }
                                            }
                                        } else if (i11 == 65533) {
                                            if (i11 < 65536) {
                                                i6 = 1;
                                            } else {
                                                i6 = 2;
                                            }
                                            i9 += i6;
                                            Unit unit2 = Unit.INSTANCE;
                                            i7 += 4;
                                            i8 = i12;
                                        }
                                        i9 = -1;
                                        break;
                                    }
                                    if (i8 == 64) {
                                        break;
                                    }
                                    i9 = -1;
                                    break;
                                }
                                if (i8 == 64) {
                                    break;
                                }
                                i9 = -1;
                                break;
                            }
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        if (i8 == 64) {
                            break;
                        }
                        i9 = -1;
                        break;
                    }
                    int i13 = i7 + 2;
                    if (length > i13) {
                        byte b6 = bArr[i7];
                        byte b7 = bArr[i7 + 1];
                        if (!((b7 & 192) == 128)) {
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        byte b8 = bArr[i13];
                        if (!((b8 & 192) == 128)) {
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        int i14 = ((b8 ^ ByteCompanionObject.MIN_VALUE) ^ (b7 << 6)) ^ (b6 << 12);
                        if (i14 >= 2048) {
                            if (55296 > i14 || 57343 < i14) {
                                int i15 = i8 + 1;
                                if (i8 == 64) {
                                    break;
                                }
                                if (i14 != 10 && i14 != 13) {
                                    if (!((i14 >= 0 && 31 >= i14) || (127 <= i14 && 159 >= i14))) {
                                        if (i14 == 65533) {
                                            if (i14 < 65536) {
                                                i5 = 1;
                                            } else {
                                                i5 = 2;
                                            }
                                            i9 += i5;
                                            Unit unit3 = Unit.INSTANCE;
                                            i7 += 3;
                                            i8 = i15;
                                        }
                                    }
                                } else if (i14 == 65533) {
                                    if (i14 < 65536) {
                                        i5 = 1;
                                    } else {
                                        i5 = 2;
                                    }
                                    i9 += i5;
                                    Unit unit4 = Unit.INSTANCE;
                                    i7 += 3;
                                    i8 = i15;
                                }
                                i9 = -1;
                                break;
                            }
                            if (i8 == 64) {
                                break;
                            }
                            i9 = -1;
                            break;
                        }
                        if (i8 == 64) {
                            break;
                        }
                        i9 = -1;
                        break;
                    }
                    if (i8 == 64) {
                        break;
                    }
                    i9 = -1;
                    break;
                }
                int i16 = i7 + 1;
                if (length > i16) {
                    byte b9 = bArr[i7];
                    byte b10 = bArr[i16];
                    if (!((b10 & 192) == 128)) {
                        if (i8 == 64) {
                            break;
                        }
                        i9 = -1;
                        break;
                    }
                    int i17 = (b10 ^ ByteCompanionObject.MIN_VALUE) ^ (b9 << 6);
                    if (i17 >= 128) {
                        int i18 = i8 + 1;
                        if (i8 == 64) {
                            break;
                        }
                        if (i17 != 10 && i17 != 13) {
                            if (!((i17 >= 0 && 31 >= i17) || (127 <= i17 && 159 >= i17))) {
                                if (i17 == 65533) {
                                    if (i17 < 65536) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    i9 += i4;
                                    Unit unit5 = Unit.INSTANCE;
                                    i7 += 2;
                                    i8 = i18;
                                }
                            }
                        } else if (i17 == 65533) {
                            if (i17 < 65536) {
                                i4 = 1;
                            } else {
                                i4 = 2;
                            }
                            i9 += i4;
                            Unit unit6 = Unit.INSTANCE;
                            i7 += 2;
                            i8 = i18;
                        }
                        i9 = -1;
                        break;
                    }
                    if (i8 == 64) {
                        break;
                    }
                    i9 = -1;
                    break;
                }
                if (i8 == 64) {
                    break;
                }
                i9 = -1;
                break;
            }
            int i19 = i8 + 1;
            if (i8 == 64) {
                break;
            }
            if (b != 10 && b != 13) {
                if (!((b >= 0 && 31 >= b) || (127 <= b && 159 >= b))) {
                    if (b != 65533) {
                        if (b < 65536) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        i9 += i;
                        i7++;
                        while (true) {
                            i8 = i19;
                            if (i7 < length) {
                                continue;
                            }
                            i9 += i3;
                            i7 = i2;
                        }
                    }
                }
                i9 = -1;
                break;
            }
            if (b != 65533) {
                if (b < 65536) {
                    i = 1;
                } else {
                    i = 2;
                }
                i9 += i;
                i7++;
                while (true) {
                    i8 = i19;
                    if (i7 < length && bArr[i7] >= 0) {
                        i2 = i7 + 1;
                        byte b11 = bArr[i7];
                        i19 = i8 + 1;
                        if (i8 == 64) {
                            break loop0;
                        }
                        if (b11 != 10 && b11 != 13) {
                            if (!((b11 >= 0 && 31 >= b11) || (127 <= b11 && 159 >= b11))) {
                                if (b11 == 65533) {
                                    if (b11 < 65536) {
                                        i3 = 1;
                                    } else {
                                        i3 = 2;
                                    }
                                    i9 += i3;
                                    i7 = i2;
                                }
                            }
                        } else if (b11 == 65533) {
                            if (b11 < 65536) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                            i9 += i3;
                            i7 = i2;
                        }
                    }
                }
            }
            i9 = -1;
            break;
        }
        if (i9 == -1) {
            if (this.data.length <= 64) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("[hex=");
                sbOooO0o0.append(OooO0o());
                sbOooO0o0.append(']');
                return sbOooO0o0.toString();
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("[size=");
            sbOooO0o1.append(this.data.length);
            sbOooO0o1.append(" hex=");
            byte[] bArr2 = this.data;
            if (!(64 <= bArr2.length)) {
                throw new IllegalArgumentException(o0O0ooO.OooO00o(OooO00o.OooO00o.OooO0o0("endIndex > length("), this.data.length, ')').toString());
            }
            sbOooO0o1.append((64 == bArr2.length ? this : new ByteString(ArraysKt.copyOfRange(bArr2, 0, 64))).OooO0o());
            sbOooO0o1.append("…]");
            return sbOooO0o1.toString();
        }
        String strOooOOO = OooOOO();
        String strSubstring = strOooOOO.substring(0, i9);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String strOooOo00 = StringsKt.OooOo00(StringsKt.OooOo00(StringsKt.OooOo00(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i9 >= strOooOOO.length()) {
            return "[text=" + strOooOo00 + ']';
        }
        StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("[size=");
        sbOooO0o2.append(this.data.length);
        sbOooO0o2.append(" text=");
        sbOooO0o2.append(strOooOo00);
        sbOooO0o2.append("…]");
        return sbOooO0o2.toString();
    }
}
