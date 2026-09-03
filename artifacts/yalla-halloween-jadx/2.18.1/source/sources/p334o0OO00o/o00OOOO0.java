package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzkm;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOO0 extends zzjl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte[] f37335OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f37336OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f37337OooO0o0;

    public o00OOOO0(byte[] bArr, int i) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        this.f37335OooO0Oo = bArr;
        this.f37336OooO0o = 0;
        this.f37337OooO0o0 = i;
    }

    public final void OooO0OO(byte[] bArr, int i) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f37335OooO0Oo, this.f37336OooO0o, i);
            this.f37336OooO0o += i;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37336OooO0o), Integer.valueOf(this.f37337OooO0o0), Integer.valueOf(i)), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final int zza() {
        return this.f37337OooO0o0 - this.f37336OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzb(byte b) throws IOException {
        try {
            byte[] bArr = this.f37335OooO0Oo;
            int i = this.f37336OooO0o;
            this.f37336OooO0o = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37336OooO0o), Integer.valueOf(this.f37337OooO0o0), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzd(int i, boolean z) throws IOException {
        zzq(i << 3);
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zze(int i, zzjd zzjdVar) throws IOException {
        zzq((i << 3) | 2);
        zzq(zzjdVar.zzd());
        zzjdVar.OooO0o0(this);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzf(int i, int i2) throws IOException {
        zzq((i << 3) | 5);
        zzg(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzg(int i) throws IOException {
        try {
            byte[] bArr = this.f37335OooO0Oo;
            int i2 = this.f37336OooO0o;
            int i3 = i2 + 1;
            this.f37336OooO0o = i3;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            this.f37336OooO0o = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            this.f37336OooO0o = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f37336OooO0o = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37336OooO0o), Integer.valueOf(this.f37337OooO0o0), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzh(int i, long j) throws IOException {
        zzq((i << 3) | 1);
        zzi(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzi(long j) throws IOException {
        try {
            byte[] bArr = this.f37335OooO0Oo;
            int i = this.f37336OooO0o;
            int i2 = i + 1;
            this.f37336OooO0o = i2;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i2 + 1;
            this.f37336OooO0o = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i3 + 1;
            this.f37336OooO0o = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i4 + 1;
            this.f37336OooO0o = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i5 + 1;
            this.f37336OooO0o = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i6 + 1;
            this.f37336OooO0o = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i7 + 1;
            this.f37336OooO0o = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f37336OooO0o = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37336OooO0o), Integer.valueOf(this.f37337OooO0o0), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzj(int i, int i2) throws IOException {
        zzq(i << 3);
        zzk(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzk(int i) throws IOException {
        if (i >= 0) {
            zzq(i);
        } else {
            zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzl(byte[] bArr, int i, int i2) throws IOException {
        OooO0OO(bArr, i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzm(int i, String str) throws IOException {
        zzq((i << 3) | 2);
        int i2 = this.f37336OooO0o;
        try {
            int iZzA = zzjl.zzA(str.length() * 3);
            int iZzA2 = zzjl.zzA(str.length());
            if (iZzA2 == iZzA) {
                int i3 = i2 + iZzA2;
                this.f37336OooO0o = i3;
                int iOooO0O0 = o0OOO0OO.OooO0O0(str, this.f37335OooO0Oo, i3, this.f37337OooO0o0 - i3);
                this.f37336OooO0o = i2;
                zzq((iOooO0O0 - i2) - iZzA2);
                this.f37336OooO0o = iOooO0O0;
            } else {
                zzq(o0OOO0OO.OooO0OO(str));
                byte[] bArr = this.f37335OooO0Oo;
                int i4 = this.f37336OooO0o;
                this.f37336OooO0o = o0OOO0OO.OooO0O0(str, bArr, i4, this.f37337OooO0o0 - i4);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zzjj(e);
        } catch (o0OOO0 e2) {
            this.f37336OooO0o = i2;
            zzjl.f15970OooO0O0.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(zzkm.f15980OooO00o);
            try {
                int length = bytes.length;
                zzq(length);
                zzl(bytes, 0, length);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzjj(e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzo(int i, int i2) throws IOException {
        zzq((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzp(int i, int i2) throws IOException {
        zzq(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzq(int i) throws IOException {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f37335OooO0Oo;
                int i2 = this.f37336OooO0o;
                this.f37336OooO0o = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37336OooO0o), Integer.valueOf(this.f37337OooO0o0), 1), e);
            }
        }
        byte[] bArr2 = this.f37335OooO0Oo;
        int i3 = this.f37336OooO0o;
        this.f37336OooO0o = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzr(int i, long j) throws IOException {
        zzq(i << 3);
        zzs(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl
    public final void zzs(long j) throws IOException {
        if (zzjl.f15971OooO0OO && this.f37337OooO0o0 - this.f37336OooO0o >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f37335OooO0Oo;
                int i = this.f37336OooO0o;
                this.f37336OooO0o = i + 1;
                o0OO0oO0.f37427OooO0OO.OooO0Oo(bArr, o0OO0oO0.f37429OooO0o + ((long) i), (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f37335OooO0Oo;
            int i2 = this.f37336OooO0o;
            this.f37336OooO0o = i2 + 1;
            o0OO0oO0.f37427OooO0OO.OooO0Oo(bArr2, o0OO0oO0.f37429OooO0o + ((long) i2), (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f37335OooO0Oo;
                int i3 = this.f37336OooO0o;
                this.f37336OooO0o = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzjj(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f37336OooO0o), Integer.valueOf(this.f37337OooO0o0), 1), e);
            }
        }
        byte[] bArr4 = this.f37335OooO0Oo;
        int i4 = this.f37336OooO0o;
        this.f37336OooO0o = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
