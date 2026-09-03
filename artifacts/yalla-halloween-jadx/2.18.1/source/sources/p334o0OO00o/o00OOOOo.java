package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzll;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOOo implements o0OOOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzjl f37338OooO00o;

    public o00OOOOo(zzjl zzjlVar) {
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(zzjlVar, "output");
        this.f37338OooO00o = zzjlVar;
        zzjlVar.f15972OooO00o = this;
    }

    public final void OooO(int i, int i2) throws IOException {
        this.f37338OooO00o.zzf(i, i2);
    }

    public final void OooO00o(int i, int i2) throws IOException {
        this.f37338OooO00o.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void OooO0O0(int i, long j) throws IOException {
        this.f37338OooO00o.zzr(i, (j >> 63) ^ (j + j));
    }

    public final void OooO0OO(int i, int i2) throws IOException {
        this.f37338OooO00o.zzp(i, i2);
    }

    public final void OooO0Oo(int i, long j) throws IOException {
        this.f37338OooO00o.zzr(i, j);
    }

    public final void OooO0o(int i, zzjd zzjdVar) throws IOException {
        this.f37338OooO00o.zze(i, zzjdVar);
    }

    public final void OooO0o0(int i, boolean z) throws IOException {
        this.f37338OooO00o.zzd(i, z);
    }

    public final void OooO0oO(int i, double d) throws IOException {
        this.f37338OooO00o.zzh(i, Double.doubleToRawLongBits(d));
    }

    public final void OooO0oo(int i, int i2) throws IOException {
        this.f37338OooO00o.zzj(i, i2);
    }

    public final void OooOO0(int i, long j) throws IOException {
        this.f37338OooO00o.zzh(i, j);
    }

    public final void OooOO0O(int i, float f) throws IOException {
        this.f37338OooO00o.zzf(i, Float.floatToRawIntBits(f));
    }

    public final void OooOO0o(int i, Object obj, o0O0OOOo o0o0oooo) throws IOException {
        zzjl zzjlVar = this.f37338OooO00o;
        zzjlVar.zzo(i, 3);
        o0o0oooo.OooO0OO((zzll) obj, zzjlVar.f15972OooO00o);
        zzjlVar.zzo(i, 4);
    }

    public final void OooOOO(int i, long j) throws IOException {
        this.f37338OooO00o.zzr(i, j);
    }

    public final void OooOOO0(int i, int i2) throws IOException {
        this.f37338OooO00o.zzj(i, i2);
    }

    public final void OooOOOO(int i, Object obj, o0O0OOOo o0o0oooo) throws IOException {
        Object obj2 = (zzll) obj;
        o00OOOO0 o00oooo1 = (o00OOOO0) this.f37338OooO00o;
        o00oooo1.zzq((i << 3) | 2);
        zzin zzinVar = (zzin) obj2;
        int iOooO00o = zzinVar.OooO00o();
        if (iOooO00o == -1) {
            iOooO00o = o0o0oooo.OooO0o(zzinVar);
            zzinVar.OooO0OO(iOooO00o);
        }
        o00oooo1.zzq(iOooO00o);
        o0o0oooo.OooO0OO(obj2, o00oooo1.f15972OooO00o);
    }

    public final void OooOOOo(int i, int i2) throws IOException {
        this.f37338OooO00o.zzf(i, i2);
    }

    public final void OooOOo0(int i, long j) throws IOException {
        this.f37338OooO00o.zzh(i, j);
    }
}
