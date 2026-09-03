package oO000Oo;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: oO000Oo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0433OooO00o<T> implements Iterator<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final T[] f52663Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f52664Oooo0oO = 0;

        public C0433OooO00o(T[] tArr) {
            this.f52663Oooo0o = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f52664Oooo0oO < this.f52663Oooo0o.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            int i = this.f52664Oooo0oO;
            T[] tArr = this.f52663Oooo0o;
            if (i != tArr.length) {
                this.f52664Oooo0oO = i + 1;
                return tArr[i];
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Out of elements: ");
            sbOooO0o0.append(this.f52664Oooo0oO);
            throw new NoSuchElementException(sbOooO0o0.toString());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static int OooO(int[] iArr, int i) {
        if (iArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            i2 = (i2 * 257) ^ iArr[0 + i];
        }
    }

    public static boolean OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO0O0(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i != iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] OooO0OO(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] OooO0Oo(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr2 != null ? OooO0OO(bArr2) : OooO0OO(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] OooO0o(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr2 == null || bArr4 == null) {
            if (bArr4 == null) {
                return OooO0o0(bArr, bArr2, bArr3);
            }
            return bArr2 == null ? OooO0o0(bArr, bArr3, bArr4) : OooO0o0(bArr2, bArr3, bArr4);
        }
        byte[] bArr5 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static byte[] OooO0o0(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            if (bArr == null) {
                return OooO0Oo(bArr2, bArr3);
            }
            return bArr2 == null ? OooO0Oo(bArr, bArr3) : OooO0Oo(bArr, bArr2);
        }
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static int OooO0oO(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int OooO0oo(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public static int OooOO0(long[] jArr, int i) {
        if (jArr == null) {
            return 0;
        }
        int i2 = i + 1;
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            long j = jArr[0 + i];
            i2 = (((i2 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }
}
