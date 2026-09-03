package okio;

import OooO0OO.OooO00o;
import androidx.appcompat.widget.o0000O0;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0O0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO.o00oOoo;
import p662o0oooO0O.oO000;
import p662o0oooO0O.oO0Oo;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "okio"}, k = 1, mv = {1, 6, 0})
public final class SegmentedByteString extends ByteString {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final transient int[] f60197OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final transient byte[][] f60198OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(ByteString.f60193OooO0oO.data);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f60198OooO0oo = segments;
        this.f60197OooO = directory;
    }

    private final Object writeReplace() {
        return OooOo0O();
    }

    @Override // okio.ByteString
    @NotNull
    /* JADX INFO: renamed from: OooO */
    public final byte[] getData() {
        return OooOOoo();
    }

    @Override // okio.ByteString
    @NotNull
    public final String OooO00o() {
        return OooOo0O().OooO00o();
    }

    @Override // okio.ByteString
    public final void OooO0OO(int i, @NotNull byte[] target, int i2, int i3) {
        Intrinsics.checkNotNullParameter(target, "target");
        long j = i3;
        oO000.OooO0O0(OooO0o0(), i, j);
        oO000.OooO0O0(target.length, i2, j);
        int i4 = i3 + i;
        int iOooO00o = o00oOoo.OooO00o(this, i);
        while (i < i4) {
            int[] iArr = this.f60197OooO;
            int i5 = iOooO00o == 0 ? 0 : iArr[iOooO00o - 1];
            int i6 = iArr[iOooO00o] - i5;
            byte[][] bArr = this.f60198OooO0oo;
            int i7 = iArr[bArr.length + iOooO00o];
            int iMin = Math.min(i4, i6 + i5) - i;
            int i8 = (i - i5) + i7;
            ArraysKt.copyInto(bArr[iOooO00o], target, i2, i8, i8 + iMin);
            i2 += iMin;
            i += iMin;
            iOooO00o++;
        }
    }

    @Override // okio.ByteString
    @NotNull
    public final ByteString OooO0Oo(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        byte[][] bArr = this.f60198OooO0oo;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f60197OooO;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    @Override // okio.ByteString
    @NotNull
    public final String OooO0o() {
        return OooOo0O().OooO0o();
    }

    @Override // okio.ByteString
    public final int OooO0o0() {
        return this.f60197OooO[this.f60198OooO0oo.length - 1];
    }

    @Override // okio.ByteString
    public final int OooO0oO(int i, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return OooOo0O().OooO0oO(i, other);
    }

    @Override // okio.ByteString
    public final byte OooOO0(int i) {
        byte[][] bArr = this.f60198OooO0oo;
        int length = bArr.length - 1;
        int[] iArr = this.f60197OooO;
        oO000.OooO0O0(iArr[length], i, 1L);
        int iOooO00o = o00oOoo.OooO00o(this, i);
        return bArr[iOooO00o][(i - (iOooO00o == 0 ? 0 : iArr[iOooO00o - 1])) + iArr[bArr.length + iOooO00o]];
    }

    @Override // okio.ByteString
    public final int OooOO0O(int i, @NotNull byte[] other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return OooOo0O().OooOO0O(i, other);
    }

    @Override // okio.ByteString
    public final boolean OooOOO(int i, @NotNull ByteString other, int i2) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > OooO0o0() - i2) {
            return false;
        }
        int i3 = i2 + i;
        int iOooO00o = o00oOoo.OooO00o(this, i);
        int i4 = 0;
        while (i < i3) {
            int[] iArr = this.f60197OooO;
            int i5 = iOooO00o == 0 ? 0 : iArr[iOooO00o - 1];
            int i6 = iArr[iOooO00o] - i5;
            byte[][] bArr = this.f60198OooO0oo;
            int i7 = iArr[bArr.length + iOooO00o];
            int iMin = Math.min(i3, i6 + i5) - i;
            if (!other.OooOOOO(i4, bArr[iOooO00o], (i - i5) + i7, iMin)) {
                return false;
            }
            i4 += iMin;
            i += iMin;
            iOooO00o++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean OooOOOO(int i, @NotNull byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > OooO0o0() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iOooO00o = o00oOoo.OooO00o(this, i);
        while (i < i4) {
            int[] iArr = this.f60197OooO;
            int i5 = iOooO00o == 0 ? 0 : iArr[iOooO00o - 1];
            int i6 = iArr[iOooO00o] - i5;
            byte[][] bArr = this.f60198OooO0oo;
            int i7 = iArr[bArr.length + iOooO00o];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!oO000.OooO00o(bArr[iOooO00o], (i - i5) + i7, i2, other, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iOooO00o++;
        }
        return true;
    }

    @Override // okio.ByteString
    @NotNull
    public final ByteString OooOOOo(int i, int i2) {
        int iOooO0OO = oO000.OooO0OO(i2, this);
        if (!(i >= 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("beginIndex=", i, " < 0").toString());
        }
        if (!(iOooO0OO <= OooO0o0())) {
            StringBuilder sbOooO0O0 = o0000O0.OooO0O0("endIndex=", iOooO0OO, " > length(");
            sbOooO0O0.append(OooO0o0());
            sbOooO0O0.append(')');
            throw new IllegalArgumentException(sbOooO0O0.toString().toString());
        }
        int i3 = iOooO0OO - i;
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(OooO0O0.OooO0O0("endIndex=", iOooO0OO, " < beginIndex=", i).toString());
        }
        if (i == 0 && iOooO0OO == OooO0o0()) {
            return this;
        }
        if (i == iOooO0OO) {
            return ByteString.f60193OooO0oO;
        }
        int iOooO00o = o00oOoo.OooO00o(this, i);
        int iOooO00o2 = o00oOoo.OooO00o(this, iOooO0OO - 1);
        byte[][] bArr = this.f60198OooO0oo;
        byte[][] bArr2 = (byte[][]) ArraysKt.copyOfRange(bArr, iOooO00o, iOooO00o2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f60197OooO;
        if (iOooO00o <= iOooO00o2) {
            int i4 = 0;
            int i5 = iOooO00o;
            while (true) {
                iArr[i4] = Math.min(iArr2[i5] - i, i3);
                int i6 = i4 + 1;
                iArr[i4 + bArr2.length] = iArr2[bArr.length + i5];
                if (i5 == iOooO00o2) {
                    break;
                }
                i5++;
                i4 = i6;
            }
        }
        int i7 = iOooO00o != 0 ? iArr2[iOooO00o - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new SegmentedByteString(bArr2, iArr);
    }

    @Override // okio.ByteString
    @NotNull
    public final ByteString OooOOo() {
        return OooOo0O().OooOOo();
    }

    @Override // okio.ByteString
    @NotNull
    public final byte[] OooOOoo() {
        byte[] bArr = new byte[OooO0o0()];
        byte[][] bArr2 = this.f60198OooO0oo;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f60197OooO;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt.copyInto(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final void OooOo0(@NotNull oo0OOoo buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i2 = 0 + i;
        int iOooO00o = o00oOoo.OooO00o(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int[] iArr = this.f60197OooO;
            int i4 = iOooO00o == 0 ? 0 : iArr[iOooO00o - 1];
            int i5 = iArr[iOooO00o] - i4;
            byte[][] bArr = this.f60198OooO0oo;
            int i6 = iArr[bArr.length + iOooO00o];
            int iMin = Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            oO0Oo oo0oo = new oO0Oo(bArr[iOooO00o], i7, i7 + iMin, true, false);
            oO0Oo oo0oo2 = buffer.f59827OooO0Oo;
            if (oo0oo2 == null) {
                oo0oo.f59826OooO0oO = oo0oo;
                oo0oo.f59824OooO0o = oo0oo;
                buffer.f59827OooO0Oo = oo0oo;
            } else {
                Intrinsics.checkNotNull(oo0oo2);
                oO0Oo oo0oo3 = oo0oo2.f59826OooO0oO;
                Intrinsics.checkNotNull(oo0oo3);
                oo0oo3.OooO0O0(oo0oo);
            }
            i3 += iMin;
            iOooO00o++;
        }
        buffer.f59828OooO0o0 += (long) i;
    }

    public final ByteString OooOo0O() {
        return new ByteString(OooOOoo());
    }

    @Override // okio.ByteString
    public final boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (!(obj instanceof ByteString)) {
                return false;
            }
            ByteString byteString = (ByteString) obj;
            if (byteString.OooO0o0() != OooO0o0() || !OooOOO(0, byteString, OooO0o0())) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.f60196OooO0o0;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f60198OooO0oo;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f60197OooO;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f60196OooO0o0 = i3;
        return i3;
    }

    @Override // okio.ByteString
    @NotNull
    public final String toString() {
        return OooOo0O().toString();
    }
}
