package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zznl {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final zznl f15285OooO0o = new zznl(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f15286OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int[] f15287OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Object[] f15288OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15289OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f15290OooO0o0;

    public zznl(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f15289OooO0Oo = -1;
        this.f15286OooO00o = i;
        this.f15287OooO0O0 = iArr;
        this.f15288OooO0OO = objArr;
        this.f15290OooO0o0 = z;
    }

    public static zznl OooO00o() {
        return new zznl(0, new int[8], new Object[8], true);
    }

    public static zznl zzc() {
        return f15285OooO0o;
    }

    public final void OooO0O0(int i, Object obj) {
        if (!this.f15290OooO0o0) {
            throw new UnsupportedOperationException();
        }
        OooO0OO(this.f15286OooO00o + 1);
        int[] iArr = this.f15287OooO0O0;
        int i2 = this.f15286OooO00o;
        iArr[i2] = i;
        this.f15288OooO0OO[i2] = obj;
        this.f15286OooO00o = i2 + 1;
    }

    public final void OooO0OO(int i) {
        int[] iArr = this.f15287OooO0O0;
        if (i > iArr.length) {
            int i2 = this.f15286OooO00o;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f15287OooO0O0 = Arrays.copyOf(iArr, i);
            this.f15288OooO0OO = Arrays.copyOf(this.f15288OooO0OO, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznl)) {
            return false;
        }
        zznl zznlVar = (zznl) obj;
        int i = this.f15286OooO00o;
        if (i == zznlVar.f15286OooO00o) {
            int[] iArr = this.f15287OooO0O0;
            int[] iArr2 = zznlVar.f15287OooO0O0;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f15288OooO0OO;
            Object[] objArr2 = zznlVar.f15288OooO0OO;
            int i3 = this.f15286OooO00o;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f15286OooO00o;
        int i2 = i + 527;
        int[] iArr = this.f15287OooO0O0;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 * 31) + i3;
        Object[] objArr = this.f15288OooO0OO;
        int i6 = this.f15286OooO00o;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return (i5 * 31) + iHashCode;
    }

    public final int zza() {
        int iZzy;
        int iZzx;
        int iZzx2;
        int i = this.f15289OooO0Oo;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f15286OooO00o; i3++) {
            int i4 = this.f15287OooO0O0[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f15288OooO0OO[i3]).longValue();
                    iZzx2 = zzki.zzx(i5 << 3) + 8;
                } else if (i6 == 2) {
                    zzka zzkaVar = (zzka) this.f15288OooO0OO[i3];
                    Logger logger = zzki.f15268OooO0O0;
                    int iZzd = zzkaVar.zzd();
                    iZzx2 = zzki.zzx(i5 << 3) + zzki.zzx(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int i7 = i5 << 3;
                    Logger logger2 = zzki.f15268OooO0O0;
                    iZzy = ((zznl) this.f15288OooO0OO[i3]).zza();
                    int iZzx3 = zzki.zzx(i7);
                    iZzx = iZzx3 + iZzx3;
                } else {
                    if (i6 != 5) {
                        int i8 = zzll.f15278OooO0Oo;
                        throw new IllegalStateException(new zzlk("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f15288OooO0OO[i3]).intValue();
                    iZzx2 = zzki.zzx(i5 << 3) + 4;
                }
                i2 += iZzx2;
            } else {
                int i9 = i5 << 3;
                iZzy = zzki.zzy(((Long) this.f15288OooO0OO[i3]).longValue());
                iZzx = zzki.zzx(i9);
            }
            iZzx2 = iZzx + iZzy;
            i2 += iZzx2;
        }
        this.f15289OooO0Oo = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.f15289OooO0Oo;
        if (i != -1) {
            return i;
        }
        int iZzx = 0;
        for (int i2 = 0; i2 < this.f15286OooO00o; i2++) {
            int i3 = this.f15287OooO0O0[i2] >>> 3;
            zzka zzkaVar = (zzka) this.f15288OooO0OO[i2];
            Logger logger = zzki.f15268OooO0O0;
            int iZzd = zzkaVar.zzd();
            int iZzx2 = zzki.zzx(iZzd) + iZzd;
            int iZzx3 = zzki.zzx(16);
            int iZzx4 = zzki.zzx(i3);
            int iZzx5 = zzki.zzx(8);
            iZzx += zzki.zzx(24) + iZzx2 + iZzx3 + iZzx4 + iZzx5 + iZzx5;
        }
        this.f15289OooO0Oo = iZzx;
        return iZzx;
    }

    public final void zzh() {
        if (this.f15290OooO0o0) {
            this.f15290OooO0o0 = false;
        }
    }

    public final void zzk(oO0000O oo0000o) throws IOException {
        if (this.f15286OooO00o != 0) {
            for (int i = 0; i < this.f15286OooO00o; i++) {
                int i2 = this.f15287OooO0O0[i];
                Object obj = this.f15288OooO0OO[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((o0O0000O) oo0000o).OooOOO(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((o0O0000O) oo0000o).OooOO0(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ((o0O0000O) oo0000o).OooO0o(i4, (zzka) obj);
                } else if (i3 == 3) {
                    o0O0000O o0o0000o2 = (o0O0000O) oo0000o;
                    o0o0000o2.f15052OooO00o.zzo(i4, 3);
                    ((zznl) obj).zzk(oo0000o);
                    o0o0000o2.f15052OooO00o.zzo(i4, 4);
                } else {
                    if (i3 != 5) {
                        int i5 = zzll.f15278OooO0Oo;
                        throw new RuntimeException(new zzlk("Protocol message tag had invalid wire type."));
                    }
                    ((o0O0000O) oo0000o).OooO(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public zznl() {
        this(0, new int[8], new Object[8], true);
    }
}
