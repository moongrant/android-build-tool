package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzkz;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public zzgc f37813OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList f37814OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ArrayList f37815OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f37816OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzkz f37817OooO0o0;

    public /* synthetic */ o0OO000(zzkz zzkzVar) {
        this.f37817OooO0o0 = zzkzVar;
    }

    public final boolean OooO00o(long j, zzfs zzfsVar) {
        Preconditions.checkNotNull(zzfsVar);
        if (this.f37815OooO0OO == null) {
            this.f37815OooO0OO = new ArrayList();
        }
        if (this.f37814OooO0O0 == null) {
            this.f37814OooO0O0 = new ArrayList();
        }
        if (!this.f37815OooO0OO.isEmpty() && ((((zzfs) this.f37815OooO0OO.get(0)).zzd() / 1000) / 60) / 60 != ((zzfsVar.zzd() / 1000) / 60) / 60) {
            return false;
        }
        long jZzbw = this.f37816OooO0Oo + ((long) zzfsVar.zzbw());
        this.f37817OooO0o0.zzg();
        if (jZzbw >= Math.max(0, ((Integer) zzeb.zzh.zza(null)).intValue())) {
            return false;
        }
        this.f37816OooO0Oo = jZzbw;
        this.f37815OooO0OO.add(zzfsVar);
        this.f37814OooO0O0.add(Long.valueOf(j));
        int size = this.f37815OooO0OO.size();
        this.f37817OooO0o0.zzg();
        return size < Math.max(1, ((Integer) zzeb.zzi.zza(null)).intValue());
    }
}
