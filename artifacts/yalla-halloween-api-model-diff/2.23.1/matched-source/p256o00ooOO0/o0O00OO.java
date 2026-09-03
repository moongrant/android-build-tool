package p256o00ooOO0;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzd;
import com.google.android.gms.internal.measurement.zzaa;
import com.google.android.gms.internal.measurement.zzc;
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
public final class o0O00OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f40326OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f40327OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f40328OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f40329OooO0oO;

    public /* synthetic */ o0O00OO(int i, Object obj, Object obj2, Object obj3) {
        this.f40326OooO0Oo = i;
        this.f40329OooO0oO = obj;
        this.f40328OooO0o0 = obj2;
        this.f40327OooO0o = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzas zzasVar;
        int i = this.f40326OooO0Oo;
        Object obj = this.f40327OooO0o;
        Object obj2 = this.f40328OooO0o0;
        Object obj3 = this.f40329OooO0oO;
        switch (i) {
            case 0:
                zzd zzdVar = (zzd) obj3;
                if (zzdVar.f14472OooO0o0 > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj2;
                    Bundle bundle = zzdVar.f14471OooO0o;
                    lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) obj) : null);
                }
                if (zzdVar.f14472OooO0o0 >= 2) {
                    ((LifecycleCallback) obj2).onStart();
                }
                if (zzdVar.f14472OooO0o0 >= 3) {
                    ((LifecycleCallback) obj2).onResume();
                }
                if (zzdVar.f14472OooO0o0 >= 4) {
                    ((LifecycleCallback) obj2).onStop();
                }
                if (zzdVar.f14472OooO0o0 >= 5) {
                    ((LifecycleCallback) obj2).onDestroy();
                }
                break;
            default:
                zzgv zzgvVar = (zzgv) obj3;
                zzau zzauVar = (zzau) obj2;
                zzgvVar.getClass();
                boolean zEquals = "_cmp".equals(zzauVar.zza);
                zzlh zzlhVar = zzgvVar.f15552OooO0Oo;
                if (zEquals && (zzasVar = zzauVar.zzb) != null && zzasVar.zza() != 0) {
                    String string = zzauVar.zzb.f15422OooO0Oo.getString("_cis");
                    if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                        zzlhVar.zzaA().zzi().zzb("Event has been filtered ", zzauVar.toString());
                        zzauVar = new zzau("_cmpx", zzauVar.zzb, zzauVar.zzc, zzauVar.zzd);
                    }
                }
                zzq zzqVar = (zzq) obj;
                if (zzlhVar.zzm().zzo(zzqVar.zza)) {
                    zzlhVar.zzaA().zzj().zzb("EES config found for", zzqVar.zza);
                    zzfu zzfuVarZzm = zzlhVar.zzm();
                    String str = zzqVar.zza;
                    zzc zzcVar = TextUtils.isEmpty(str) ? null : (zzc) zzfuVarZzm.f15504OooOO0.get(str);
                    if (zzcVar != null) {
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
                                    zzgvVar.OooOo00(zzlj.OooOOo0(zzaaVarZzb), zzqVar);
                                } else {
                                    zzgvVar.OooOo00(zzauVar, zzqVar);
                                }
                                if (zzcVar.zzf()) {
                                    for (zzaa zzaaVar : zzcVar.zza().zzc()) {
                                        zzlhVar.zzaA().zzj().zzb("EES logging created event", zzaaVar.zzd());
                                        zzlhVar.zzu().getClass();
                                        zzgvVar.OooOo00(zzlj.OooOOo0(zzaaVar), zzqVar);
                                    }
                                }
                            }
                        } catch (com.google.android.gms.internal.measurement.zzd unused) {
                            zzlhVar.zzaA().zzd().zzc("EES error. appId, eventName", zzqVar.zzb, zzauVar.zza);
                        }
                        zzlhVar.zzaA().zzj().zzb("EES was not applied to event", zzauVar.zza);
                        zzgvVar.OooOo00(zzauVar, zzqVar);
                    } else {
                        zzlhVar.zzaA().zzj().zzb("EES not loaded for", zzqVar.zza);
                        zzgvVar.OooOo00(zzauVar, zzqVar);
                    }
                } else {
                    zzgvVar.OooOo00(zzauVar, zzqVar);
                }
                break;
        }
    }
}
