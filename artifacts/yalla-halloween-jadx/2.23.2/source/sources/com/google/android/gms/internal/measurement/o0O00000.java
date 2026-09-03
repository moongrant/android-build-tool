package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00000 extends zzki {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f15049OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15050OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f15051OooO0o0;

    public o0O00000(byte[] bArr, int i) {
        super(0);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.f15049OooO0Oo = bArr;
        this.f15050OooO0o = 0;
        this.f15051OooO0o0 = i;
    }

    public final void OooO0O0(int i, byte[] bArr) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f15049OooO0Oo, this.f15050OooO0o, i);
            this.f15050OooO0o += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15050OooO0o), Integer.valueOf(this.f15051OooO0o0), Integer.valueOf(i)), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final int zza() {
        return this.f15051OooO0o0 - this.f15050OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzb(byte b) throws IOException {
        try {
            byte[] bArr = this.f15049OooO0Oo;
            int i = this.f15050OooO0o;
            this.f15050OooO0o = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15050OooO0o), Integer.valueOf(this.f15051OooO0o0), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzd(int i, boolean z) throws IOException {
        zzq(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zze(int i, zzka zzkaVar) throws IOException {
        zzq((i << 3) | 2);
        zzq(zzkaVar.zzd());
        zzkaVar.OooO0Oo(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzf(int i, int i2) throws IOException {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.f15049OooO0Oo;
            int i2 = this.f15050OooO0o;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f15050OooO0o = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15050OooO0o), Integer.valueOf(this.f15051OooO0o0), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzh(int i, long j) throws IOException {
        zzq((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzi(long j) throws IOException {
        try {
            byte[] bArr = this.f15049OooO0Oo;
            int i = this.f15050OooO0o;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f15050OooO0o = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15050OooO0o), Integer.valueOf(this.f15051OooO0o0), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzj(int i, int i2) throws IOException {
        zzq(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzl(byte[] bArr, int i, int i2) throws IOException {
        OooO0O0(i2, bArr);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzm(int i, String str) throws IOException {
        zzq((i << 3) | 2);
        int i2 = this.f15050OooO0o;
        try {
            int iZzx = zzki.zzx(str.length() * 3);
            int iZzx2 = zzki.zzx(str.length());
            int i3 = this.f15051OooO0o0;
            byte[] bArr = this.f15049OooO0Oo;
            if (iZzx2 == iZzx) {
                int i4 = i2 + iZzx2;
                this.f15050OooO0o = i4;
                int iOooO0O0 = oO00000o.OooO0O0(str, bArr, i4, i3 - i4);
                this.f15050OooO0o = i2;
                zzq((iOooO0O0 - i2) - iZzx2);
                this.f15050OooO0o = iOooO0O0;
            } else {
                zzq(oO00000o.OooO0OO(str));
                int i5 = this.f15050OooO0o;
                this.f15050OooO0o = oO00000o.OooO0O0(str, bArr, i5, i3 - i5);
            }
        } catch (oO00000 e) {
            this.f15050OooO0o = i2;
            zzki.f15268OooO0O0.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(zzlj.f15277OooO00o);
            try {
                int length = bytes.length;
                zzq(length);
                OooO0O0(length, bytes);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzkg(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new zzkg(e3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzo(int i, int i2) throws IOException {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzp(int i, int i2) throws IOException {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzq(int i) throws IOException {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.f15049OooO0Oo;
            if (i2 == 0) {
                int i3 = this.f15050OooO0o;
                this.f15050OooO0o = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f15050OooO0o;
                    this.f15050OooO0o = i4 + 1;
                    bArr[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15050OooO0o), Integer.valueOf(this.f15051OooO0o0), 1), e);
                }
            }
            throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15050OooO0o), Integer.valueOf(this.f15051OooO0o0), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzr(int i, long j) throws IOException {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzki
    public final void zzs(long j) throws IOException {
        boolean z = zzki.f15269OooO0OO;
        int i = this.f15051OooO0o0;
        byte[] bArr = this.f15049OooO0Oo;
        if (!z || i - this.f15050OooO0o < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i2 = this.f15050OooO0o;
                    this.f15050OooO0o = i2 + 1;
                    bArr[i2] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzkg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f15050OooO0o), Integer.valueOf(i), 1), e);
                }
            }
            int i3 = this.f15050OooO0o;
            this.f15050OooO0o = i3 + 1;
            bArr[i3] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            int i4 = this.f15050OooO0o;
            this.f15050OooO0o = i4 + 1;
            o0oo0000.f15144OooO0OO.OooO0Oo(bArr, o0oo0000.f15146OooO0o + ((long) i4), (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        int i5 = this.f15050OooO0o;
        this.f15050OooO0o = i5 + 1;
        o0oo0000.f15144OooO0OO.OooO0Oo(bArr, o0oo0000.f15146OooO0o + ((long) i5), (byte) j);
    }
}
