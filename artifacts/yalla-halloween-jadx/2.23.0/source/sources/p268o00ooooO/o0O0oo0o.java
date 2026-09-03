package p268o00ooooO;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzhf;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.List;
import java.util.Map;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo0o extends o0O0O0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zzgd f41100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zzik f41101OooO0O0;

    public o0O0oo0o(@NonNull zzgd zzgdVar) {
        Preconditions.checkNotNull(zzgdVar);
        this.f41100OooO00o = zzgdVar;
        this.f41101OooO0O0 = zzgdVar.zzq();
    }

    @Override // p268o00ooooO.o0O0O0o0
    public final Boolean OooO00o() {
        return this.f41101OooO0O0.zzi();
    }

    @Override // p268o00ooooO.o0O0O0o0
    public final Double OooO0O0() {
        return this.f41101OooO0O0.zzj();
    }

    @Override // p268o00ooooO.o0O0O0o0
    public final Integer OooO0OO() {
        return this.f41101OooO0O0.zzl();
    }

    @Override // p268o00ooooO.o0O0O0o0
    public final Long OooO0Oo() {
        return this.f41101OooO0O0.zzm();
    }

    @Override // p268o00ooooO.o0O0O0o0
    public final Map OooO0o(boolean z) {
        List<zzlk> listZzt = this.f41101OooO0O0.zzt(z);
        OooOO0 oooOO1 = new OooOO0(listZzt.size());
        for (zzlk zzlkVar : listZzt) {
            Object objZza = zzlkVar.zza();
            if (objZza != null) {
                oooOO1.put(zzlkVar.zzb, objZza);
            }
        }
        return oooOO1;
    }

    @Override // p268o00ooooO.o0O0O0o0
    public final String OooO0o0() {
        return this.f41101OooO0O0.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final int zza(String str) {
        this.f41101OooO0O0.zzh(str);
        return 25;
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final long zzb() {
        return this.f41100OooO00o.zzv().zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final Object zzg(int i) {
        zzik zzikVar = this.f41101OooO0O0;
        if (i == 0) {
            return zzikVar.zzr();
        }
        if (i == 1) {
            return zzikVar.zzm();
        }
        if (i != 2) {
            return i != 3 ? zzikVar.zzi() : zzikVar.zzl();
        }
        return zzikVar.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final String zzh() {
        return this.f41101OooO0O0.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final String zzi() {
        return this.f41101OooO0O0.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final String zzj() {
        return this.f41101OooO0O0.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final String zzk() {
        return this.f41101OooO0O0.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final List zzm(String str, String str2) {
        return this.f41101OooO0O0.zzs(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final Map zzo(String str, String str2, boolean z) {
        return this.f41101OooO0O0.zzu(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzp(String str) {
        zzgd zzgdVar = this.f41100OooO00o;
        zzgdVar.zzd().zzd(str, zzgdVar.zzax().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzq(String str, String str2, Bundle bundle) {
        this.f41100OooO00o.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzr(String str) {
        zzgd zzgdVar = this.f41100OooO00o;
        zzgdVar.zzd().zze(str, zzgdVar.zzax().elapsedRealtime());
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzs(String str, String str2, Bundle bundle) {
        this.f41101OooO0O0.zzD(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzt(String str, String str2, Bundle bundle, long j) {
        this.f41101OooO0O0.zzE(str, str2, bundle, true, false, j);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzu(zzhg zzhgVar) {
        this.f41101OooO0O0.zzJ(zzhgVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzv(Bundle bundle) {
        this.f41101OooO0O0.zzP(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzw(zzhf zzhfVar) {
        this.f41101OooO0O0.zzT(zzhfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzil
    public final void zzx(zzhg zzhgVar) {
        this.f41101OooO0O0.zzZ(zzhgVar);
    }
}
