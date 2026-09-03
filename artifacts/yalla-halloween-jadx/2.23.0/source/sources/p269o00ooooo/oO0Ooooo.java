package p269o00ooooo;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzfu;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0Ooooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzau f41406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzgv f41407OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzq f41408OooO0o0;

    public oO0Ooooo(zzgv zzgvVar, zzau zzauVar, zzq zzqVar) {
        this.f41407OooO0o = zzgvVar;
        this.f41406OooO0Oo = zzauVar;
        this.f41408OooO0o0 = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzas zzasVar;
        zzgv zzgvVar = this.f41407OooO0o;
        zzgvVar.getClass();
        zzau zzauVar = this.f41406OooO0Oo;
        boolean zEquals = "_cmp".equals(zzauVar.zza);
        zzlh zzlhVar = zzgvVar.f16021OooO0Oo;
        if (zEquals && (zzasVar = zzauVar.zzb) != null && zzasVar.zza() != 0) {
            String string = zzauVar.zzb.f15891OooO0Oo.getString("_cis");
            if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                zzlhVar.zzaA().zzi().zzb("Event has been filtered ", zzauVar.toString());
                zzauVar = new zzau("_cmpx", zzauVar.zzb, zzauVar.zzc, zzauVar.zzd);
            }
        }
        zzfu zzfuVarZzm = zzlhVar.zzm();
        zzq zzqVar = this.f41408OooO0o0;
        if (!zzfuVarZzm.zzo(zzqVar.zza)) {
            zzgvVar.OooOOoo(zzauVar, zzqVar);
            return;
        }
        zzlhVar.zzaA().zzj().zzb("EES config found for", zzqVar.zza);
        zzfu zzfuVarZzm2 = zzlhVar.zzm();
        String str = zzqVar.zza;
        zzc zzcVar = TextUtils.isEmpty(str) ? null : (zzc) zzfuVarZzm2.f15973OooOO0.get(str);
        if (zzcVar == null) {
            zzlhVar.zzaA().zzj().zzb("EES not loaded for", zzqVar.zza);
            zzgvVar.OooOOoo(zzauVar, zzqVar);
            return;
        }
        try {
            zzlj zzljVarZzu = zzlhVar.zzu();
            Bundle bundleZzc = zzauVar.zzb.zzc();
            zzljVarZzu.getClass();
            HashMap mapOooOo = zzlj.OooOo(bundleZzc, true);
            String strZza = zzhc.zza(zzauVar.zza);
            if (strZza == null) {
                strZza = zzauVar.zza;
            }
            if (zzcVar.zze(new zzaa(strZza, zzauVar.zzd, mapOooOo))) {
                if (zzcVar.zzg()) {
                    zzlhVar.zzaA().zzj().zzb("EES edited event", zzauVar.zza);
                    zzlj zzljVarZzu2 = zzlhVar.zzu();
                    zzaa zzaaVarZzb = zzcVar.zza().zzb();
                    zzljVarZzu2.getClass();
                    zzgvVar.OooOOoo(zzlj.OooOOo0(zzaaVarZzb), zzqVar);
                } else {
                    zzgvVar.OooOOoo(zzauVar, zzqVar);
                }
                if (zzcVar.zzf()) {
                    for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                        zzlhVar.zzaA().zzj().zzb("EES logging created event", zzaaVar.zzd());
                        zzlhVar.zzu().getClass();
                        zzgvVar.OooOOoo(zzlj.OooOOo0(zzaaVar), zzqVar);
                    }
                    return;
                }
                return;
            }
        } catch (zzd unused) {
            zzlhVar.zzaA().zzd().zzc("EES error. appId, eventName", zzqVar.zzb, zzauVar.zza);
        }
        zzlhVar.zzaA().zzj().zzb("EES was not applied to event", zzauVar.zza);
        zzgvVar.OooOOoo(zzauVar, zzqVar);
    }
}
