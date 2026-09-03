package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzac f37533Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzgq f37534Oooo0oO;

    public o0000(zzgq zzgqVar, zzac zzacVar) {
        this.f37534Oooo0oO = zzgqVar;
        this.f37533Oooo0o = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37534Oooo0oO.f16225OooO00o.OooO00o();
        if (this.f37533Oooo0o.zzc.zza() == null) {
            zzkz zzkzVar = this.f37534Oooo0oO.f16225OooO00o;
            zzac zzacVar = this.f37533Oooo0o;
            Objects.requireNonNull(zzkzVar);
            zzq zzqVarOooOo0 = zzkzVar.OooOo0((String) Preconditions.checkNotNull(zzacVar.zza));
            if (zzqVarOooOo0 != null) {
                zzkzVar.OooOO0(zzacVar, zzqVarOooOo0);
                return;
            }
            return;
        }
        zzkz zzkzVar2 = this.f37534Oooo0oO.f16225OooO00o;
        zzac zzacVar2 = this.f37533Oooo0o;
        Objects.requireNonNull(zzkzVar2);
        zzq zzqVarOooOo1 = zzkzVar2.OooOo0((String) Preconditions.checkNotNull(zzacVar2.zza));
        if (zzqVarOooOo1 != null) {
            zzkzVar2.OooOOO0(zzacVar2, zzqVarOooOo1);
        }
    }
}
