package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzac f40595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzgv f40596OooO0o0;

    public oO0O0(zzgv zzgvVar, zzac zzacVar) {
        this.f40596OooO0o0 = zzgvVar;
        this.f40595OooO0Oo = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgv zzgvVar = this.f40596OooO0o0;
        zzgvVar.f15545OooO0Oo.OooO00o();
        zzac zzacVar = this.f40595OooO0Oo;
        Object objZza = zzacVar.zzc.zza();
        zzlh zzlhVar = zzgvVar.f15545OooO0Oo;
        if (objZza == null) {
            zzlhVar.getClass();
            zzq zzqVarOooOo00 = zzlhVar.OooOo00((String) Preconditions.checkNotNull(zzacVar.zza));
            if (zzqVarOooOo00 != null) {
                zzlhVar.OooO(zzacVar, zzqVarOooOo00);
                return;
            }
            return;
        }
        zzlhVar.getClass();
        zzq zzqVarOooOo01 = zzlhVar.OooOo00((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzqVarOooOo01 != null) {
            zzlhVar.OooOO0o(zzacVar, zzqVarOooOo01);
        }
    }
}
