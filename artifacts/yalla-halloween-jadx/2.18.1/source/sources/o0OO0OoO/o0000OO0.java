package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37563Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzgq f37564Oooo0oO;

    public o0000OO0(zzgq zzgqVar, zzq zzqVar) {
        this.f37564Oooo0oO = zzgqVar;
        this.f37563Oooo0o = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37564Oooo0oO.f16225OooO00o.OooO00o();
        zzkz zzkzVar = this.f37564Oooo0oO.f16225OooO00o;
        zzq zzqVar = this.f37563Oooo0o;
        zzkzVar.zzaz().zzg();
        zzkzVar.OooO0O0();
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzai zzaiVarZzb = zzai.zzb(zzqVar.zzv);
        zzai zzaiVarOooo000 = zzkzVar.Oooo000(zzqVar.zza);
        zzkzVar.zzay().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzaiVarZzb);
        zzkzVar.OooOOO(zzqVar.zza, zzaiVarZzb);
        if (zzaiVarZzb.zzk(zzaiVarOooo000)) {
            zzkzVar.OooOO0o(zzqVar);
        }
    }
}
