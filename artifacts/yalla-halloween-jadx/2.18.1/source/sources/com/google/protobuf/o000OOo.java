package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o000OOo f19390OooO0o0 = new o000OOo(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f19391OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f19392OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Object[] f19393OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f19394OooO0Oo;

    public o000OOo() {
        this(0, new int[8], new Object[8], true);
    }

    public static o000OOo OooO0OO(o000OOo o000ooo2, o000OOo o000ooo3) {
        int i = o000ooo2.f19391OooO00o + o000ooo3.f19391OooO00o;
        int[] iArrCopyOf = Arrays.copyOf(o000ooo2.f19392OooO0O0, i);
        System.arraycopy(o000ooo3.f19392OooO0O0, 0, iArrCopyOf, o000ooo2.f19391OooO00o, o000ooo3.f19391OooO00o);
        Object[] objArrCopyOf = Arrays.copyOf(o000ooo2.f19393OooO0OO, i);
        System.arraycopy(o000ooo3.f19393OooO0OO, 0, objArrCopyOf, o000ooo2.f19391OooO00o, o000ooo3.f19391OooO00o);
        return new o000OOo(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final void OooO00o() {
        if (!this.f19394OooO0Oo) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean OooO0O0(int i, OooOO0O oooOO0O) throws IOException {
        int iOooOOoo;
        OooO00o();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            OooO0Oo(i, Long.valueOf(oooOO0O.OooOOOo()));
            return true;
        }
        if (i3 == 1) {
            int i4 = oooOO0O.f19364OooO0o0;
            if (oooOO0O.f19361OooO0OO - i4 < 8) {
                oooOO0O.OooOo0(8);
                i4 = oooOO0O.f19364OooO0o0;
            }
            byte[] bArr = oooOO0O.f19359OooO00o;
            oooOO0O.f19364OooO0o0 = i4 + 8;
            OooO0Oo(i, Long.valueOf(((((long) bArr[i4 + 7]) & 255) << 56) | (((long) bArr[i4]) & 255) | ((((long) bArr[i4 + 1]) & 255) << 8) | ((((long) bArr[i4 + 2]) & 255) << 16) | ((((long) bArr[i4 + 3]) & 255) << 24) | ((((long) bArr[i4 + 4]) & 255) << 32) | ((((long) bArr[i4 + 5]) & 255) << 40) | ((((long) bArr[i4 + 6]) & 255) << 48)));
            return true;
        }
        if (i3 == 2) {
            OooO0Oo(i, oooOO0O.OooO0oo());
            return true;
        }
        if (i3 == 3) {
            o000OOo o000ooo2 = new o000OOo();
            do {
                iOooOOoo = oooOO0O.OooOOoo();
                if (iOooOOoo == 0) {
                    break;
                }
            } while (o000ooo2.OooO0O0(iOooOOoo, oooOO0O));
            oooOO0O.OooO00o((i2 << 3) | 4);
            OooO0Oo(i, o000ooo2);
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        if (i3 != 5) {
            throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
        }
        int i5 = oooOO0O.f19364OooO0o0;
        if (oooOO0O.f19361OooO0OO - i5 < 4) {
            oooOO0O.OooOo0(4);
            i5 = oooOO0O.f19364OooO0o0;
        }
        byte[] bArr2 = oooOO0O.f19359OooO00o;
        oooOO0O.f19364OooO0o0 = i5 + 4;
        OooO0Oo(i, Integer.valueOf((bArr2[i5] & UByte.MAX_VALUE) | ((bArr2[i5 + 1] & UByte.MAX_VALUE) << 8) | ((bArr2[i5 + 2] & UByte.MAX_VALUE) << 16) | ((bArr2[i5 + 3] & UByte.MAX_VALUE) << 24)));
        return true;
    }

    public final void OooO0Oo(int i, Object obj) {
        int i2 = this.f19391OooO00o;
        int[] iArr = this.f19392OooO0O0;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f19392OooO0O0 = Arrays.copyOf(iArr, i3);
            this.f19393OooO0OO = Arrays.copyOf(this.f19393OooO0OO, i3);
        }
        int[] iArr2 = this.f19392OooO0O0;
        int i4 = this.f19391OooO00o;
        iArr2[i4] = i;
        this.f19393OooO0OO[i4] = obj;
        this.f19391OooO00o = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o000OOo)) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) obj;
        return this.f19391OooO00o == o000ooo2.f19391OooO00o && Arrays.equals(this.f19392OooO0O0, o000ooo2.f19392OooO0O0) && Arrays.deepEquals(this.f19393OooO0OO, o000ooo2.f19393OooO0OO);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.f19393OooO0OO) + ((Arrays.hashCode(this.f19392OooO0O0) + ((527 + this.f19391OooO00o) * 31)) * 31);
    }

    public o000OOo(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f19391OooO00o = i;
        this.f19392OooO0O0 = iArr;
        this.f19393OooO0OO = objArr;
        this.f19394OooO0Oo = z;
    }
}
