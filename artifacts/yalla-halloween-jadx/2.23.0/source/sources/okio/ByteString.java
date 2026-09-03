package okio;

import androidx.compose.foundation.layout.OooO0O0;
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
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658o0oooO0.oo0oOO0;
import p659o0oooO00.o00000O;
import p659o0oooO00.o00O00o0;
import p659o0oooO00.oo00o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "", "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "", "OooO0Oo", "[B", "getData$okio", "()[B", "data", "OooO00o", "okio"}, k = 1, mv = {1, 6, 0})
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final ByteString f60866OooO0oO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] data;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public transient String f60868OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public transient int f60869OooO0o0;

    public static final class OooO00o {
        /* JADX WARN: Code duplicated, block: B:75:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
        @JvmStatic
        @Nullable
        public static ByteString OooO00o(@NotNull String str) {
            int i;
            int i2;
            char cCharAt;
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bArr = o00O00o0.f60245OooO00o;
            Intrinsics.checkNotNullParameter(str, "<this>");
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt((i2 = length - 1))) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
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
                            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                        }
                    }
                    if (bArrCopyOf != null) {
                        return new ByteString(bArrCopyOf);
                    }
                    return null;
                }
                char cCharAt2 = str.charAt(i4);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else {
                    if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i = cCharAt2 - 'G';
                    } else {
                        if ('0' <= cCharAt2 && cCharAt2 < ':') {
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
                    }
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
        public static ByteString OooO0O0(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            if (!(str.length() % 2 == 0)) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (oo0oOO0.OooO00o(str.charAt(i2 + 1)) + (oo0oOO0.OooO00o(str.charAt(i2)) << 4));
            }
            return new ByteString(bArr);
        }

        @JvmStatic
        @NotNull
        public static ByteString OooO0OO(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(str, "<this>");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.f60868OooO0o = str;
            return byteString;
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public static ByteString OooO0Oo(int i, int i2, @NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            o00000O.OooO00o oooO00o = oo00o.f60256OooO00o;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            if (i2 == oo00o.f60257OooO0O0) {
                i2 = bArr.length;
            }
            oo00o.OooO0O0(bArr.length, i, i2);
            return new ByteString(ArraysKt.copyOfRange(bArr, i, i2 + i));
        }

        public static ByteString OooO0o0(byte[] bArr) {
            return OooO0Oo(0, oo00o.f60257OooO0O0, bArr);
        }
    }

    static {
        new OooO00o();
        f60866OooO0oO = new ByteString(new byte[0]);
    }

    public ByteString(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static int OooO0oo(ByteString byteString, ByteString other) {
        byteString.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return byteString.OooO0oO(0, other.data);
    }

    public static int OooOO0o(ByteString byteString, ByteString other) {
        int i = oo00o.f60257OooO0O0;
        byteString.getClass();
        Intrinsics.checkNotNullParameter(other, "other");
        return byteString.OooOO0O(i, other.data);
    }

    @JvmStatic
    @NotNull
    public static final ByteString OooOOO0(@NotNull byte... data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return new ByteString(bArrCopyOf);
    }

    public static ByteString OooOOo0(ByteString byteString, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = oo00o.f60257OooO0O0;
        }
        return byteString.OooOOOo(i, i2);
    }

    private final void readObject(ObjectInputStream in) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = in.readInt();
        Intrinsics.checkNotNullParameter(in, "<this>");
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
        Field declaredField = ByteString.class.getDeclaredField("OooO0Oo");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    @NotNull
    /* JADX INFO: renamed from: OooO, reason: from getter */
    public byte[] getData() {
        return this.data;
    }

    @NotNull
    public String OooO00o() {
        byte[] bArr = this.data;
        byte[] map = o00O00o0.f60245OooO00o;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr2[i2] = map[(b & UByte.MAX_VALUE) >> 2];
            int i7 = i6 + 1;
            bArr2[i6] = map[((b & 3) << 4) | ((b2 & UByte.MAX_VALUE) >> 4)];
            int i8 = i7 + 1;
            bArr2[i7] = map[((b2 & 15) << 2) | ((b3 & UByte.MAX_VALUE) >> 6)];
            i2 = i8 + 1;
            bArr2[i8] = map[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr2[i2] = map[(b4 & UByte.MAX_VALUE) >> 2];
            int i10 = i9 + 1;
            bArr2[i9] = map[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr2[i10] = b5;
            bArr2[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr2[i2] = map[(b6 & UByte.MAX_VALUE) >> 2];
            int i13 = i12 + 1;
            bArr2[i12] = map[((b6 & 3) << 4) | ((b7 & UByte.MAX_VALUE) >> 4)];
            bArr2[i13] = map[(b7 & 15) << 2];
            bArr2[i13 + 1] = (byte) 61;
        }
        Intrinsics.checkNotNullParameter(bArr2, "<this>");
        return new String(bArr2, Charsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0 < r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L13;
     */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(@NotNull ByteString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iOooO0o0 = OooO0o0();
        int iOooO0o1 = other.OooO0o0();
        int iMin = Math.min(iOooO0o0, iOooO0o1);
        for (int i = 0; i < iMin; i++) {
            int iOooOO0 = OooOO0(i) & UByte.MAX_VALUE;
            int iOooOO1 = other.OooOO0(i) & UByte.MAX_VALUE;
            if (iOooOO0 == iOooOO1) {
            }
        }
        if (iOooO0o0 == iOooO0o1) {
            return 0;
        }
    }

    public void OooO0OO(int i, @NotNull byte[] target, int i2, int i3) {
        Intrinsics.checkNotNullParameter(target, "target");
        ArraysKt.copyInto(this.data, target, i2, i, i3 + i);
    }

    @NotNull
    public ByteString OooO0Oo(@NotNull String algorithm) throws NoSuchAlgorithmException {
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
            char[] cArr2 = oo0oOO0.f60161OooO00o;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return StringsKt.concatToString(cArr);
    }

    public int OooO0o0() {
        return this.data.length;
    }

    @JvmOverloads
    public int OooO0oO(int i, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.data.length - other.length;
        int iMax = Math.max(i, 0);
        if (iMax <= length) {
            while (!oo00o.OooO00o(this.data, iMax, 0, other, other.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public byte OooOO0(int i) {
        return this.data[i];
    }

    @JvmOverloads
    public int OooOO0O(int i, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int iMin = Math.min(oo00o.OooO0OO(i, this), this.data.length - other.length); -1 < iMin; iMin--) {
            if (oo00o.OooO00o(this.data, iMin, 0, other, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean OooOOO(int i, @NotNull ByteString other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.OooOOOO(0, this.data, i, i2);
    }

    public boolean OooOOOO(int i, @NotNull byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i >= 0) {
            byte[] bArr = this.data;
            if (i <= bArr.length - i3 && i2 >= 0 && i2 <= other.length - i3 && oo00o.OooO00o(bArr, i, i2, other, i3)) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    @NotNull
    public ByteString OooOOOo(int i, int i2) {
        int iOooO0OO = oo00o.OooO0OO(i2, this);
        if (!(i >= 0)) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        byte[] bArr = this.data;
        if (!(iOooO0OO <= bArr.length)) {
            throw new IllegalArgumentException(OooO0O0.OooO00o(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (iOooO0OO - i >= 0) {
            return (i == 0 && iOooO0OO == bArr.length) ? this : new ByteString(ArraysKt.copyOfRange(bArr, i, iOooO0OO));
        }
        throw new IllegalArgumentException("endIndex < beginIndex".toString());
    }

    @NotNull
    public ByteString OooOOo() {
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
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
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
    public byte[] OooOOoo() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public void OooOo0(@NotNull o00000O buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.Oooooo(0, i, this.data);
    }

    @NotNull
    public final String OooOo00() {
        String str = this.f60868OooO0o;
        if (str != null) {
            return str;
        }
        byte[] data = getData();
        Intrinsics.checkNotNullParameter(data, "<this>");
        String str2 = new String(data, Charsets.UTF_8);
        this.f60868OooO0o = str2;
        return str2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int iOooO0o0 = byteString.OooO0o0();
            byte[] bArr = this.data;
            if (iOooO0o0 == bArr.length && byteString.OooOOOO(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f60869OooO0o0;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.f60869OooO0o0 = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:103:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:106:0x00df  */
    /* JADX WARN: Code duplicated, block: B:108:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:109:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:162:0x0162  */
    /* JADX WARN: Code duplicated, block: B:164:0x0165  */
    /* JADX WARN: Code duplicated, block: B:167:0x016c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0170  */
    /* JADX WARN: Code duplicated, block: B:170:0x0172  */
    /* JADX WARN: Code duplicated, block: B:235:0x0205  */
    /* JADX WARN: Code duplicated, block: B:237:0x0208  */
    /* JADX WARN: Code duplicated, block: B:240:0x020e  */
    /* JADX WARN: Code duplicated, block: B:242:0x0212  */
    /* JADX WARN: Code duplicated, block: B:243:0x0214  */
    /* JADX WARN: Code duplicated, block: B:247:0x021e A[EDGE_INSN: B:247:0x021e->B:248:0x021f BREAK  A[LOOP:0: B:9:0x0012->B:315:0x0012]] */
    /* JADX WARN: Code duplicated, block: B:281:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    /* JADX WARN: Code duplicated, block: B:313:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x004b  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0051  */
    /* JADX WARN: Code duplicated, block: B:36:0x0053  */
    /* JADX WARN: Code duplicated, block: B:59:0x007f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0088  */
    /* JADX WARN: Code duplicated, block: B:65:0x008a  */
    @NotNull
    public String toString() {
        int i;
        byte b;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        loop0: while (i6 < length) {
            byte b2 = bArr[i6];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i7 == 64) {
                                break;
                            }
                            i8 = -1;
                            break;
                        }
                        int i9 = i6 + 3;
                        if (length > i9) {
                            byte b3 = bArr[i6 + 1];
                            if (!((b3 & 192) == 128)) {
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            byte b4 = bArr[i6 + 2];
                            if (!((b4 & 192) == 128)) {
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            byte b5 = bArr[i9];
                            if (!((b5 & 192) == 128)) {
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            int i10 = (b2 << 18) ^ (((b5 ^ ByteCompanionObject.MIN_VALUE) ^ (b4 << 6)) ^ (b3 << 12));
                            if (i10 <= 1114111) {
                                if (!(55296 <= i10 && i10 < 57344)) {
                                    if (i10 >= 65536) {
                                        int i11 = i7 + 1;
                                        if (i7 == 64) {
                                            break;
                                        }
                                        if (i10 != 10 && i10 != 13) {
                                            if (i10 >= 0 && i10 < 32) {
                                                z5 = true;
                                            } else {
                                                if (127 <= i10 && i10 < 160) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                            }
                                            if (!z5) {
                                                if (i10 == 65533) {
                                                    if (i10 < 65536) {
                                                        i5 = 1;
                                                    } else {
                                                        i5 = 2;
                                                    }
                                                    i8 += i5;
                                                    i6 += 4;
                                                    i7 = i11;
                                                }
                                            }
                                        } else if (i10 == 65533) {
                                            if (i10 < 65536) {
                                                i5 = 1;
                                            } else {
                                                i5 = 2;
                                            }
                                            i8 += i5;
                                            i6 += 4;
                                            i7 = i11;
                                        }
                                        i8 = -1;
                                        break;
                                    }
                                    if (i7 == 64) {
                                        break;
                                    }
                                    i8 = -1;
                                    break;
                                }
                                if (i7 == 64) {
                                    break;
                                }
                                i8 = -1;
                                break;
                            }
                            if (i7 == 64) {
                                break;
                            }
                            i8 = -1;
                            break;
                        }
                        if (i7 == 64) {
                            break;
                        }
                        i8 = -1;
                        break;
                    }
                    int i12 = i6 + 2;
                    if (length > i12) {
                        byte b6 = bArr[i6 + 1];
                        if (!((b6 & 192) == 128)) {
                            if (i7 == 64) {
                                break;
                            }
                            i8 = -1;
                            break;
                        }
                        byte b7 = bArr[i12];
                        if (!((b7 & 192) == 128)) {
                            if (i7 == 64) {
                                break;
                            }
                            i8 = -1;
                            break;
                        }
                        int i13 = (b2 << 12) ^ ((b7 ^ ByteCompanionObject.MIN_VALUE) ^ (b6 << 6));
                        if (i13 >= 2048) {
                            if (!(55296 <= i13 && i13 < 57344)) {
                                int i14 = i7 + 1;
                                if (i7 == 64) {
                                    break;
                                }
                                if (i13 != 10 && i13 != 13) {
                                    if (i13 >= 0 && i13 < 32) {
                                        z4 = true;
                                    } else {
                                        if (127 <= i13 && i13 < 160) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (!z4) {
                                        if (i13 == 65533) {
                                            if (i13 < 65536) {
                                                i4 = 1;
                                            } else {
                                                i4 = 2;
                                            }
                                            i8 += i4;
                                            i6 += 3;
                                            i7 = i14;
                                        }
                                    }
                                } else if (i13 == 65533) {
                                    if (i13 < 65536) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    i8 += i4;
                                    i6 += 3;
                                    i7 = i14;
                                }
                                i8 = -1;
                                break;
                            }
                            if (i7 == 64) {
                                break;
                            }
                            i8 = -1;
                            break;
                        }
                        if (i7 == 64) {
                            break;
                        }
                        i8 = -1;
                        break;
                    }
                    if (i7 == 64) {
                        break;
                    }
                    i8 = -1;
                    break;
                }
                int i15 = i6 + 1;
                if (length > i15) {
                    byte b8 = bArr[i15];
                    if (!((b8 & 192) == 128)) {
                        if (i7 == 64) {
                            break;
                        }
                        i8 = -1;
                        break;
                    }
                    int i16 = (b2 << 6) ^ (b8 ^ ByteCompanionObject.MIN_VALUE);
                    if (i16 >= 128) {
                        int i17 = i7 + 1;
                        if (i7 == 64) {
                            break;
                        }
                        if (i16 != 10 && i16 != 13) {
                            if (i16 >= 0 && i16 < 32) {
                                z3 = true;
                            } else {
                                if (127 <= i16 && i16 < 160) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            }
                            if (!z3) {
                                if (i16 == 65533) {
                                    if (i16 < 65536) {
                                        i3 = 1;
                                    } else {
                                        i3 = 2;
                                    }
                                    i8 += i3;
                                    i6 += 2;
                                    i7 = i17;
                                }
                            }
                        } else if (i16 == 65533) {
                            if (i16 < 65536) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                            i8 += i3;
                            i6 += 2;
                            i7 = i17;
                        }
                        i8 = -1;
                        break;
                    }
                    if (i7 == 64) {
                        break;
                    }
                    i8 = -1;
                    break;
                }
                if (i7 == 64) {
                    break;
                }
                i8 = -1;
                break;
            }
            int i18 = i7 + 1;
            if (i7 == 64) {
                break;
            }
            if (b2 != 10 && b2 != 13) {
                if (b2 >= 0 && b2 < 32) {
                    z2 = true;
                } else {
                    if (127 <= b2 && b2 < 160) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!z2) {
                    if (b2 != 65533) {
                        if (b2 < 65536) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        i8 += i;
                        i6++;
                        while (true) {
                            i7 = i18;
                            if (i6 < length) {
                                continue;
                            }
                            i8 += i2;
                        }
                    }
                }
                i8 = -1;
                break;
            }
            if (b2 != 65533) {
                if (b2 < 65536) {
                    i = 1;
                } else {
                    i = 2;
                }
                i8 += i;
                i6++;
                while (true) {
                    i7 = i18;
                    if (i6 < length && (b = bArr[i6]) >= 0) {
                        i6++;
                        i18 = i7 + 1;
                        if (i7 == 64) {
                            break loop0;
                        }
                        if (b != 10 && b != 13) {
                            if (b >= 0 && b < 32) {
                                z = true;
                            } else {
                                if (127 <= b && b < 160) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (!z) {
                                if (b == 65533) {
                                    if (b < 65536) {
                                        i2 = 1;
                                    } else {
                                        i2 = 2;
                                    }
                                    i8 += i2;
                                }
                            }
                        } else if (b == 65533) {
                            if (b < 65536) {
                                i2 = 1;
                            } else {
                                i2 = 2;
                            }
                            i8 += i2;
                        }
                    }
                }
            }
            i8 = -1;
            break;
        }
        if (i8 != -1) {
            String strOooOo00 = OooOo00();
            String strSubstring = strOooOo00.substring(0, i8);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strOooOoO = StringsKt.OooOoO(StringsKt.OooOoO(StringsKt.OooOoO(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i8 >= strOooOo00.length()) {
                return "[text=" + strOooOoO + ']';
            }
            return "[size=" + this.data.length + " text=" + strOooOoO + "…]";
        }
        if (this.data.length <= 64) {
            return "[hex=" + OooO0o() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.data.length);
        sb.append(" hex=");
        int iOooO0OO = oo00o.OooO0OO(64, this);
        byte[] bArr2 = this.data;
        if (!(iOooO0OO <= bArr2.length)) {
            throw new IllegalArgumentException(OooO0O0.OooO00o(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (!(iOooO0OO + 0 >= 0)) {
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        sb.append((iOooO0OO == bArr2.length ? this : new ByteString(ArraysKt.copyOfRange(bArr2, 0, iOooO0OO))).OooO0o());
        sb.append("…]");
        return sb.toString();
    }
}
