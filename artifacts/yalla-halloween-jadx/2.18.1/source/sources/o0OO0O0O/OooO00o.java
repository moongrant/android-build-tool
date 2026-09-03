package o0OO0O0O;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.measurement.internal.zzlc;
import java.util.List;
import java.util.Map;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzfy f37470OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zzid f37471OooO0O0;

    public OooO00o(@NonNull zzfy zzfyVar) {
        Preconditions.checkNotNull(zzfyVar);
        this.f37470OooO00o = zzfyVar;
        this.f37471OooO0O0 = zzfyVar.zzq();
    }

    @Override // o0OO0O0O.OooO0OO
    public final Boolean OooO00o() {
        return this.f37471OooO0O0.zzi();
    }

    @Override // o0OO0O0O.OooO0OO
    public final Double OooO0O0() {
        return this.f37471OooO0O0.zzj();
    }

    @Override // o0OO0O0O.OooO0OO
    public final Integer OooO0OO() {
        return this.f37471OooO0O0.zzl();
    }

    @Override // o0OO0O0O.OooO0OO
    public final Long OooO0Oo() {
        return this.f37471OooO0O0.zzm();
    }

    @Override // o0OO0O0O.OooO0OO
    public final Map OooO0o(boolean z) {
        List<zzlc> listZzt = this.f37471OooO0O0.zzt(z);
        Oooo0 oooo0 = new Oooo0(listZzt.size());
        for (zzlc zzlcVar : listZzt) {
            Object objZza = zzlcVar.zza();
            if (objZza != null) {
                oooo0.put(zzlcVar.zzb, objZza);
            }
        }
        return oooo0;
    }

    @Override // o0OO0O0O.OooO0OO
    public final String OooO0o0() {
        return this.f37471OooO0O0.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final int zza(String str) {
        this.f37471OooO0O0.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final long zzb() {
        return this.f37470OooO00o.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Object zzg(int i) {
        if (i == 0) {
            return this.f37471OooO0O0.zzr();
        }
        if (i == 1) {
            return this.f37471OooO0O0.zzm();
        }
        if (i != 2) {
            return i != 3 ? this.f37471OooO0O0.zzi() : this.f37471OooO0O0.zzl();
        }
        return this.f37471OooO0O0.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzh() {
        return this.f37471OooO0O0.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzi() {
        return this.f37471OooO0O0.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzj() {
        return this.f37471OooO0O0.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final String zzk() {
        return this.f37471OooO0O0.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final List zzm(String str, String str2) {
        return this.f37471OooO0O0.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final Map zzo(String str, String str2, boolean z) {
        return this.f37471OooO0O0.zzu(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzp(String str) {
        this.f37470OooO00o.zzd().zzd(str, this.f37470OooO00o.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzq(String str, String str2, Bundle bundle) {
        this.f37470OooO00o.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzr(String str) {
        this.f37470OooO00o.zzd().zze(str, this.f37470OooO00o.zzav().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzs(String str, String str2, Bundle bundle) {
        this.f37471OooO0O0.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzt(String str, String str2, Bundle bundle, long j) {
        this.f37471OooO0O0.zzE(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzu(zzgz zzgzVar) {
        this.f37471OooO0O0.zzJ(zzgzVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzv(Bundle bundle) {
        this.f37471OooO0O0.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzw(zzgy zzgyVar) {
        this.f37471OooO0O0.zzT(zzgyVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzie
    public final void zzx(zzgz zzgzVar) {
        this.f37471OooO0O0.zzZ(zzgzVar);
    }
}
