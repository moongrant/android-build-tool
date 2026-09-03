package com.google.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final OooO0o f19322Oooo0oO = new OooO0o(o000oOoO.f19396OooO0O0);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final OooO0O0 f19323Oooo0oo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f19324Oooo0o = 0;

    public static final class OooO implements OooO0O0 {
        @Override // com.google.protobuf.ByteString.OooO0O0
        public final byte[] OooO00o(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    public static final class OooO00o implements OooO0O0 {
        @Override // com.google.protobuf.ByteString.OooO0O0
        public final byte[] OooO00o(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    public interface OooO0O0 {
        byte[] OooO00o(byte[] bArr, int i, int i2);
    }

    public static abstract class OooO0OO extends ByteString {
        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new OooOO0(this);
        }
    }

    public static class OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final byte[] f19325Oooo;

        public OooO0o(byte[] bArr) {
            this.f19325Oooo = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public byte OooO00o(int i) {
            return this.f19325Oooo[i];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean OooO0OO() {
            int iOooOO0O = OooOO0O();
            return o000000O.f19389OooO00o.OooO0O0(this.f19325Oooo, iOooOO0O, size() + iOooOO0O) == 0;
        }

        @Override // com.google.protobuf.ByteString
        public final OooOO0O OooO0o0() {
            byte[] bArr = this.f19325Oooo;
            int iOooOO0O = OooOO0O();
            int size = size();
            OooOO0O oooOO0O = new OooOO0O(bArr, iOooOO0O, size, true);
            try {
                oooOO0O.OooO0o(size);
                return oooOO0O;
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalArgumentException(e);
            }
        }

        @Override // com.google.protobuf.ByteString
        public final int OooO0oO(int i, int i2) {
            byte[] bArr = this.f19325Oooo;
            int iOooOO0O = OooOO0O() + 0;
            Charset charset = o000oOoO.f19395OooO00o;
            for (int i3 = iOooOO0O; i3 < iOooOO0O + i2; i3++) {
                i = (i * 31) + bArr[i3];
            }
            return i;
        }

        @Override // com.google.protobuf.ByteString
        public final String OooO0oo(Charset charset) {
            return new String(this.f19325Oooo, OooOO0O(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void OooOO0(com.google.protobuf.OooO oooO) throws IOException {
            oooO.OooO00o(this.f19325Oooo, OooOO0O(), size());
        }

        public int OooOO0O() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return obj.equals(this);
            }
            OooO0o oooO0o = (OooO0o) obj;
            int i = this.f19324Oooo0o;
            int i2 = oooO0o.f19324Oooo0o;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size > oooO0o.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            }
            if (0 + size > oooO0o.size()) {
                StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Ran off end of other: ", 0, ", ", size, ", ");
                sbOooO0O0.append(oooO0o.size());
                throw new IllegalArgumentException(sbOooO0O0.toString());
            }
            byte[] bArr = this.f19325Oooo;
            byte[] bArr2 = oooO0o.f19325Oooo;
            int iOooOO0O = OooOO0O() + size;
            int iOooOO0O2 = OooOO0O();
            int iOooOO0O3 = oooO0o.OooOO0O() + 0;
            while (iOooOO0O2 < iOooOO0O) {
                if (bArr[iOooOO0O2] != bArr2[iOooOO0O3]) {
                    return false;
                }
                iOooOO0O2++;
                iOooOO0O3++;
            }
            return true;
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.f19325Oooo.length;
        }
    }

    static {
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f19323Oooo0oo = z ? new OooO() : new OooO00o();
    }

    public static ByteString OooO0O0(String str) {
        return new OooO0o(str.getBytes(o000oOoO.f19395OooO00o));
    }

    public final String OooO() {
        return size() == 0 ? "" : OooO0oo(o000oOoO.f19395OooO00o);
    }

    public abstract byte OooO00o(int i);

    public abstract boolean OooO0OO();

    public abstract OooOO0O OooO0o0();

    public abstract int OooO0oO(int i, int i2);

    public abstract String OooO0oo(Charset charset);

    public abstract void OooOO0(com.google.protobuf.OooO oooO) throws IOException;

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iOooO0oO = this.f19324Oooo0o;
        if (iOooO0oO == 0) {
            int size = size();
            iOooO0oO = OooO0oO(size, size);
            if (iOooO0oO == 0) {
                iOooO0oO = 1;
            }
            this.f19324Oooo0o = iOooO0oO;
        }
        return iOooO0oO;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new OooOO0(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
