package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class ooOOO00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f40803OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzgv f40804OooO0o0;

    public ooOOO00O(zzgv zzgvVar, zzq zzqVar) {
        this.f40804OooO0o0 = zzgvVar;
        this.f40803OooO0Oo = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgv zzgvVar = this.f40804OooO0o0;
        zzgvVar.f15545OooO0Oo.OooO00o();
        zzlh zzlhVar = zzgvVar.f15545OooO0Oo;
        zzlhVar.zzaB().zzg();
        zzlhVar.OooO0O0();
        zzq zzqVar = this.f40803OooO0Oo;
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzhb zzhbVarZzc = zzhb.zzc(zzqVar.zzv, 100);
        zzhb zzhbVarOooOooo = zzlhVar.OooOooo(zzqVar.zza);
        zzlhVar.zzaA().zzj().zzc("Setting consent, package, consent", zzqVar.zza, zzhbVarZzc);
        zzlhVar.OooOOO0(zzqVar.zza, zzhbVarZzc);
        if (zzhbVarZzc.zzm(zzhbVarOooOooo)) {
            zzlhVar.OooOO0O(zzqVar);
        }
    }
}
