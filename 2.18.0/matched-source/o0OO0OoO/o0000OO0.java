package o0OO0OoO;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzfp;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzq;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzaw f37581Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ zzgq f37582OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ zzq f37583OoooO00;

    public o0000OO0(zzgq zzgqVar, zzaw zzawVar, zzq zzqVar) {
        this.f37582OoooO0 = zzgqVar;
        this.f37581Oooo = zzawVar;
        this.f37583OoooO00 = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzau zzauVar;
        zzgq zzgqVar = this.f37582OoooO0;
        zzaw zzawVar = this.f37581Oooo;
        Objects.requireNonNull(zzgqVar);
        if ("_cmp".equals(zzawVar.zza) && (zzauVar = zzawVar.zzb) != null && zzauVar.zza() != 0) {
            String strOoooO0O = zzawVar.zzb.OoooO0O("_cis");
            if ("referrer broadcast".equals(strOoooO0O) || "referrer API".equals(strOoooO0O)) {
                zzgqVar.f16243OooO00o.zzay().zzi().zzb("Event has been filtered ", zzawVar.toString());
                zzawVar = new zzaw("_cmpx", zzawVar.zzb, zzawVar.zzc, zzawVar.zzd);
            }
        }
        zzgq zzgqVar2 = this.f37582OoooO0;
        zzq zzqVar = this.f37583OoooO00;
        if (!zzgqVar2.f16243OooO00o.zzo().zzo(zzqVar.zza)) {
            zzgqVar2.OooOOo0(zzawVar, zzqVar);
            return;
        }
        zzgqVar2.f16243OooO00o.zzay().zzj().zzb("EES config found for", zzqVar.zza);
        zzfp zzfpVarZzo = zzgqVar2.f16243OooO00o.zzo();
        String str = zzqVar.zza;
        zzc zzcVar = TextUtils.isEmpty(str) ? null : (zzc) zzfpVarZzo.f16195OooOO0.get(str);
        if (zzcVar == null) {
            zzgqVar2.f16243OooO00o.zzay().zzj().zzb("EES not loaded for", zzqVar.zza);
            zzgqVar2.OooOOo0(zzawVar, zzqVar);
            return;
        }
        try {
            Map mapOooOo = zzgqVar2.f16243OooO00o.zzu().OooOo(zzawVar.zzb.zzc(), true);
            String strZza = zzgv.zza(zzawVar.zza);
            if (strZza == null) {
                strZza = zzawVar.zza;
            }
            if (zzcVar.zze(new zzaa(strZza, zzawVar.zzd, mapOooOo))) {
                if (zzcVar.zzg()) {
                    zzgqVar2.f16243OooO00o.zzay().zzj().zzb("EES edited event", zzawVar.zza);
                    zzgqVar2.OooOOo0(zzgqVar2.f16243OooO00o.zzu().OooOOo0(zzcVar.zza().zzb()), zzqVar);
                } else {
                    zzgqVar2.OooOOo0(zzawVar, zzqVar);
                }
                if (zzcVar.zzf()) {
                    for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                        zzgqVar2.f16243OooO00o.zzay().zzj().zzb("EES logging created event", zzaaVar.zzd());
                        zzgqVar2.OooOOo0(zzgqVar2.f16243OooO00o.zzu().OooOOo0(zzaaVar), zzqVar);
                    }
                    return;
                }
                return;
            }
        } catch (zzd unused) {
            zzgqVar2.f16243OooO00o.zzay().zzd().zzc("EES error. appId, eventName", zzqVar.zzb, zzawVar.zza);
        }
        zzgqVar2.f16243OooO00o.zzay().zzj().zzb("EES was not applied to event", zzawVar.zza);
        zzgqVar2.OooOOo0(zzawVar, zzqVar);
    }
}
