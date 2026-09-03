package okio;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p674o0oooo0.o00OOO0O;
import p674o0oooo0.o0O00OOO;
import p674o0oooo0.o0oOO;
import p676o0oooo0O.oO0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"Lokio/SegmentedByteString;", "Lokio/ByteString;", "Ljava/lang/Object;", "writeReplace", "okio"}, k = 1, mv = {1, 4, 1})
public final class SegmentedByteString extends ByteString {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final transient byte[][] f53051OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final transient int[] f53052OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(@NotNull byte[][] segments, @NotNull int[] directory) {
        super(ByteString.f53046Oooo.data);
        Intrinsics.checkNotNullParameter(segments, "segments");
        Intrinsics.checkNotNullParameter(directory, "directory");
        this.f53051OoooO0 = segments;
        this.f53052OoooO0O = directory;
    }

    private final Object writeReplace() {
        return OooOOOo();
    }

    @Override // okio.ByteString
    @NotNull
    public final String OooO00o() {
        return OooOOOo().OooO00o();
    }

    @Override // okio.ByteString
    @NotNull
    public final ByteString OooO0O0(@NotNull String algorithm) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = this.f53051OoooO0.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f53052OoooO0O;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(this.f53051OoooO0[i], i3, i4 - i2);
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
        return OooOOOo().OooO0o();
    }

    @Override // okio.ByteString
    public final int OooO0o0() {
        return this.f53052OoooO0O[this.f53051OoooO0.length - 1];
    }

    @Override // okio.ByteString
    @NotNull
    /* JADX INFO: renamed from: OooO0oO */
    public final byte[] getData() {
        return OooOOO0();
    }

    @Override // okio.ByteString
    public final byte OooO0oo(int i) {
        o00OOO0O.OooO0O0(this.f53052OoooO0O[this.f53051OoooO0.length - 1], i, 1L);
        int iOooO00o = oO0.OooO00o(this, i);
        int i2 = iOooO00o == 0 ? 0 : this.f53052OoooO0O[iOooO00o - 1];
        int[] iArr = this.f53052OoooO0O;
        byte[][] bArr = this.f53051OoooO0;
        return bArr[iOooO00o][(i - i2) + iArr[bArr.length + iOooO00o]];
    }

    @Override // okio.ByteString
    public final boolean OooOO0(int i, @NotNull byte[] other, int i2, int i3) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > OooO0o0() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iOooO00o = oO0.OooO00o(this, i);
        while (i < i4) {
            int i5 = iOooO00o == 0 ? 0 : this.f53052OoooO0O[iOooO00o - 1];
            int[] iArr = this.f53052OoooO0O;
            int i6 = iArr[iOooO00o] - i5;
            int i7 = iArr[this.f53051OoooO0.length + iOooO00o];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!o00OOO0O.OooO00o(this.f53051OoooO0[iOooO00o], (i - i5) + i7, other, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iOooO00o++;
        }
        return true;
    }

    @Override // okio.ByteString
    public final boolean OooOO0O(@NotNull ByteString other, int i) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (OooO0o0() - i < 0) {
            return false;
        }
        int i2 = i + 0;
        int iOooO00o = oO0.OooO00o(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = iOooO00o == 0 ? 0 : this.f53052OoooO0O[iOooO00o - 1];
            int[] iArr = this.f53052OoooO0O;
            int i6 = iArr[iOooO00o] - i5;
            int i7 = iArr[this.f53051OoooO0.length + iOooO00o];
            int iMin = Math.min(i2, i6 + i5) - i3;
            if (!other.OooOO0(i4, this.f53051OoooO0[iOooO00o], (i3 - i5) + i7, iMin)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iOooO00o++;
        }
        return true;
    }

    @Override // okio.ByteString
    @NotNull
    public final ByteString OooOO0o() {
        return OooOOOo().OooOO0o();
    }

    @Override // okio.ByteString
    @NotNull
    public final byte[] OooOOO0() {
        byte[] bArr = new byte[OooO0o0()];
        int length = this.f53051OoooO0.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f53052OoooO0O;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt.copyInto(this.f53051OoooO0[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    public final void OooOOOO(@NotNull o0oOO buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i2 = i + 0;
        int iOooO00o = oO0.OooO00o(this, 0);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iOooO00o == 0 ? 0 : this.f53052OoooO0O[iOooO00o - 1];
            int[] iArr = this.f53052OoooO0O;
            int i5 = iArr[iOooO00o] - i4;
            int i6 = iArr[this.f53051OoooO0.length + iOooO00o];
            int iMin = Math.min(i2, i5 + i4) - i3;
            int i7 = (i3 - i4) + i6;
            o0O00OOO o0o00ooo2 = new o0O00OOO(this.f53051OoooO0[iOooO00o], i7, i7 + iMin, true, false);
            o0O00OOO o0o00ooo3 = buffer.f52098Oooo0o;
            if (o0o00ooo3 == null) {
                o0o00ooo2.f52073OooO0oO = o0o00ooo2;
                o0o00ooo2.f52071OooO0o = o0o00ooo2;
                buffer.f52098Oooo0o = o0o00ooo2;
            } else {
                Intrinsics.checkNotNull(o0o00ooo3);
                o0O00OOO o0o00ooo4 = o0o00ooo3.f52073OooO0oO;
                Intrinsics.checkNotNull(o0o00ooo4);
                o0o00ooo4.OooO0O0(o0o00ooo2);
            }
            i3 += iMin;
            iOooO00o++;
        }
        buffer.f52099Oooo0oO += (long) i;
    }

    public final ByteString OooOOOo() {
        return new ByteString(OooOOO0());
    }

    @Override // okio.ByteString
    public final boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof ByteString) {
                ByteString byteString = (ByteString) obj;
                if (byteString.OooO0o0() != OooO0o0() || !OooOO0O(byteString, OooO0o0())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // okio.ByteString
    public final int hashCode() {
        int i = this.f53048Oooo0o;
        if (i != 0) {
            return i;
        }
        int length = this.f53051OoooO0.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f53052OoooO0O;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f53051OoooO0[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f53048Oooo0o = i3;
        return i3;
    }

    @Override // okio.ByteString
    @NotNull
    public final String toString() {
        return OooOOOo().toString();
    }
}
