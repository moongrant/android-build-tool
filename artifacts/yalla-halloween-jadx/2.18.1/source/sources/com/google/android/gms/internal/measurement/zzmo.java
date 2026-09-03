package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
import p334o0OO00o.o00OOOOo;
import p334o0OO00o.o0OOOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final zzmo f15988OooO0o = new zzmo(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f15989OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f15990OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Object[] f15991OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15992OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f15993OooO0o0;

    public zzmo() {
        this(0, new int[8], new Object[8], true);
    }

    public zzmo(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f15992OooO0Oo = -1;
        this.f15989OooO00o = i;
        this.f15990OooO0O0 = iArr;
        this.f15991OooO0OO = objArr;
        this.f15993OooO0o0 = z;
    }

    public static zzmo OooO00o() {
        return new zzmo(0, new int[8], new Object[8], true);
    }

    public static zzmo zzc() {
        return f15988OooO0o;
    }

    public final void OooO0O0(int i, Object obj) {
        if (!this.f15993OooO0o0) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f15989OooO00o;
        int[] iArr = this.f15990OooO0O0;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f15990OooO0O0 = Arrays.copyOf(iArr, i3);
            this.f15991OooO0OO = Arrays.copyOf(this.f15991OooO0OO, i3);
        }
        int[] iArr2 = this.f15990OooO0O0;
        int i4 = this.f15989OooO00o;
        iArr2[i4] = i;
        this.f15991OooO0OO[i4] = obj;
        this.f15989OooO00o = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmo)) {
            return false;
        }
        zzmo zzmoVar = (zzmo) obj;
        int i = this.f15989OooO00o;
        if (i == zzmoVar.f15989OooO00o) {
            int[] iArr = this.f15990OooO0O0;
            int[] iArr2 = zzmoVar.f15990OooO0O0;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f15991OooO0OO;
            Object[] objArr2 = zzmoVar.f15991OooO0OO;
            int i3 = this.f15989OooO00o;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f15989OooO00o;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f15990OooO0O0;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f15991OooO0OO;
        int i6 = this.f15989OooO00o;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.f15992OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iZzA3 = 0;
        for (int i2 = 0; i2 < this.f15989OooO00o; i2++) {
            int i3 = this.f15990OooO0O0[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        zzjd zzjdVar = (zzjd) this.f15991OooO0OO[i2];
                        int iZzA4 = zzjl.zzA(i4 << 3);
                        int iZzd = zzjdVar.zzd();
                        iZzA3 = zzjl.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                    } else if (i5 == 3) {
                        int iZzz = zzjl.zzz(i4);
                        iZzA = iZzz + iZzz;
                        iZzB = ((zzmo) this.f15991OooO0OO[i2]).zza();
                    } else {
                        if (i5 != 5) {
                            int i6 = zzko.f15981Oooo0o;
                            throw new IllegalStateException(new zzkn("Protocol message tag had invalid wire type."));
                        }
                        ((Integer) this.f15991OooO0OO[i2]).intValue();
                        iZzA2 = zzjl.zzA(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f15991OooO0OO[i2]).longValue();
                    iZzA2 = zzjl.zzA(i4 << 3) + 8;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                long jLongValue = ((Long) this.f15991OooO0OO[i2]).longValue();
                iZzA = zzjl.zzA(i4 << 3);
                iZzB = zzjl.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.f15992OooO0Oo = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i = this.f15992OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iZzA = 0;
        for (int i2 = 0; i2 < this.f15989OooO00o; i2++) {
            int i3 = this.f15990OooO0O0[i2];
            zzjd zzjdVar = (zzjd) this.f15991OooO0OO[i2];
            int iZzA2 = zzjl.zzA(8);
            int iZzd = zzjdVar.zzd();
            iZzA += zzjl.zzA(iZzd) + iZzd + zzjl.zzA(24) + zzjl.zzA(i3 >>> 3) + zzjl.zzA(16) + iZzA2 + iZzA2;
        }
        this.f15992OooO0Oo = iZzA;
        return iZzA;
    }

    public final void zzf() {
        this.f15993OooO0o0 = false;
    }

    public final void zzi(o0OOOO00 o0oooo01) throws IOException {
        if (this.f15989OooO00o != 0) {
            for (int i = 0; i < this.f15989OooO00o; i++) {
                int i2 = this.f15990OooO0O0[i];
                Object obj = this.f15991OooO0OO[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ((o00OOOOo) o0oooo01).OooOOO(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ((o00OOOOo) o0oooo01).OooOO0(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ((o00OOOOo) o0oooo01).OooO0o(i3, (zzjd) obj);
                } else if (i4 == 3) {
                    ((o00OOOOo) o0oooo01).f37338OooO00o.zzo(i3, 3);
                    ((zzmo) obj).zzi(o0oooo01);
                    ((o00OOOOo) o0oooo01).f37338OooO00o.zzo(i3, 4);
                } else {
                    if (i4 != 5) {
                        int i5 = zzko.f15981Oooo0o;
                        throw new RuntimeException(new zzkn("Protocol message tag had invalid wire type."));
                    }
                    ((o00OOOOo) o0oooo01).OooO(i3, ((Integer) obj).intValue());
                }
            }
        }
    }
}
