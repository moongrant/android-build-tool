package com.google.common.hash;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class OooO0o extends OooO implements Serializable, OooO0O0 {
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f19713OooO0o = 0;
        this.f19712OooO0Oo = null;
        this.f19714OooO0o0 = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(OooO0o());
    }

    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    @Override // com.google.common.hash.OooO0O0
    public final void OooO00o(long j) {
        boolean zOooO00o;
        int iNextInt;
        OooO.OooO0O0[] oooO0O0Arr;
        boolean z;
        int length;
        boolean z2;
        int length2;
        int length3;
        OooO.OooO0O0 oooO0O0;
        OooO.OooO0O0[] oooO0O0Arr2 = this.f19712OooO0Oo;
        if (oooO0O0Arr2 == null) {
            long j2 = this.f19714OooO0o0;
            if (OooO0OO(j2, j2 + j)) {
                return;
            }
        }
        ThreadLocal<int[]> threadLocal = OooO.f19707OooO0oO;
        int[] iArr = threadLocal.get();
        if (iArr == null || oooO0O0Arr2 == null || (length3 = oooO0O0Arr2.length) < 1 || (oooO0O0 = oooO0O0Arr2[(length3 - 1) & iArr[0]]) == null) {
            zOooO00o = true;
        } else {
            long j3 = oooO0O0.f19717OooO00o;
            zOooO00o = oooO0O0.OooO00o(j3, j3 + j);
            if (zOooO00o) {
                return;
            }
        }
        if (iArr == null) {
            iArr = new int[1];
            threadLocal.set(iArr);
            iNextInt = OooO.f19708OooO0oo.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
        }
        while (true) {
            boolean z3 = false;
            while (true) {
                oooO0O0Arr = this.f19712OooO0Oo;
                if (oooO0O0Arr != null && (length = oooO0O0Arr.length) > 0) {
                    OooO.OooO0O0 oooO0O1 = oooO0O0Arr[(length - 1) & iNextInt];
                    if (oooO0O1 != null) {
                        if (zOooO00o) {
                            long j4 = oooO0O1.f19717OooO00o;
                            if (oooO0O1.OooO00o(j4, j4 + j)) {
                                return;
                            }
                            if (length < OooO.f19706OooO && this.f19712OooO0Oo == oooO0O0Arr) {
                                if (z3) {
                                    if (this.f19713OooO0o == 0 && OooO0Oo()) {
                                        break;
                                    }
                                } else {
                                    z3 = true;
                                }
                            }
                        } else {
                            zOooO00o = true;
                        }
                        int i = iNextInt ^ (iNextInt << 13);
                        int i2 = i ^ (i >>> 17);
                        iNextInt = i2 ^ (i2 << 5);
                        iArr[0] = iNextInt;
                    } else if (this.f19713OooO0o == 0) {
                        OooO.OooO0O0 oooO0O2 = new OooO.OooO0O0(j);
                        if (this.f19713OooO0o == 0 && OooO0Oo()) {
                            try {
                                OooO.OooO0O0[] oooO0O0Arr3 = this.f19712OooO0Oo;
                                if (oooO0O0Arr3 == null || (length2 = oooO0O0Arr3.length) <= 0) {
                                    z2 = false;
                                } else {
                                    int i3 = (length2 - 1) & iNextInt;
                                    if (oooO0O0Arr3[i3] == null) {
                                        oooO0O0Arr3[i3] = oooO0O2;
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                }
                                this.f19713OooO0o = 0;
                                if (z2) {
                                    return;
                                }
                            } catch (Throwable th) {
                                this.f19713OooO0o = 0;
                                throw th;
                            }
                        }
                    }
                    z3 = false;
                    int i4 = iNextInt ^ (iNextInt << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    iNextInt = i5 ^ (i5 << 5);
                    iArr[0] = iNextInt;
                } else if (this.f19713OooO0o == 0 && this.f19712OooO0Oo == oooO0O0Arr && OooO0Oo()) {
                    try {
                        if (this.f19712OooO0Oo == oooO0O0Arr) {
                            OooO.OooO0O0[] oooO0O0Arr4 = new OooO.OooO0O0[2];
                            oooO0O0Arr4[iNextInt & 1] = new OooO.OooO0O0(j);
                            this.f19712OooO0Oo = oooO0O0Arr4;
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f19713OooO0o = 0;
                        if (z) {
                            return;
                        }
                    } catch (Throwable th2) {
                        this.f19713OooO0o = 0;
                        throw th2;
                    }
                } else {
                    long j5 = this.f19714OooO0o0;
                    if (OooO0OO(j5, j5 + j)) {
                        return;
                    }
                }
            }
            try {
                if (this.f19712OooO0Oo == oooO0O0Arr) {
                    OooO.OooO0O0[] oooO0O0Arr5 = new OooO.OooO0O0[length << 1];
                    for (int i6 = 0; i6 < length; i6++) {
                        oooO0O0Arr5[i6] = oooO0O0Arr[i6];
                    }
                    this.f19712OooO0Oo = oooO0O0Arr5;
                }
                this.f19713OooO0o = 0;
            } catch (Throwable th3) {
                this.f19713OooO0o = 0;
                throw th3;
            }
        }
    }

    public final long OooO0o() {
        long j = this.f19714OooO0o0;
        OooO.OooO0O0[] oooO0O0Arr = this.f19712OooO0Oo;
        if (oooO0O0Arr != null) {
            for (OooO.OooO0O0 oooO0O0 : oooO0O0Arr) {
                if (oooO0O0 != null) {
                    j += oooO0O0.f19717OooO00o;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return OooO0o();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return OooO0o();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) OooO0o();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return OooO0o();
    }

    public final String toString() {
        return Long.toString(OooO0o());
    }
}
