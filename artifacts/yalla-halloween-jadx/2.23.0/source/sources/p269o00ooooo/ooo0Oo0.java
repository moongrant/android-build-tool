package p269o00ooooo;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzek;
import com.google.android.gms.measurement.internal.zzem;
import com.google.android.gms.measurement.internal.zzer;
import com.google.android.gms.measurement.internal.zzgd;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzhi;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzlp;
import com.google.android.gms.measurement.internal.zzs;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ooo0Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzhi f41540OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzgd f41541OooO0o0;

    public ooo0Oo0(zzgd zzgdVar, zzhi zzhiVar) {
        this.f41541OooO0o0 = zzgdVar;
        this.f41540OooO0Oo = zzhiVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x03be  */
    /* JADX WARN: Code duplicated, block: B:108:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x025c  */
    /* JADX WARN: Code duplicated, block: B:79:0x029c  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:99:0x03b1  */
    @Override // java.lang.Runnable
    public final void run() {
        zzhb zzhbVar;
        String strZzm;
        String string;
        String str;
        String string2;
        o0OOO0 o0ooo0Zzm;
        Boolean boolOooO0o;
        boolean zZzJ;
        SharedPreferences sharedPreferences;
        zzcl zzclVar;
        boolean zEquals;
        zzgd zzgdVar = this.f41541OooO0o0;
        zzgdVar.zzaB().zzg();
        zzag zzagVar = zzgdVar.f15995OooO0oO;
        zzagVar.f41276OooO00o.zzay();
        zzao zzaoVar = new zzao(zzgdVar);
        zzaoVar.zzw();
        zzgdVar.f16010OooOo0O = zzaoVar;
        zzhi zzhiVar = this.f41540OooO0Oo;
        zzek zzekVar = new zzek(zzgdVar, zzhiVar.f16031OooO0o);
        zzekVar.zzb();
        zzgdVar.f16011OooOo0o = zzekVar;
        zzem zzemVar = new zzem(zzgdVar);
        zzemVar.zzb();
        zzgdVar.f16009OooOo00 = zzemVar;
        zzjz zzjzVar = new zzjz(zzgdVar);
        zzjzVar.zzb();
        zzgdVar.f16008OooOo0 = zzjzVar;
        zzgdVar.f15999OooOO0o.zzx();
        zzgdVar.f15996OooO0oo.zzx();
        zzgdVar.f16011OooOo0o.zzc();
        zzer zzerVarZzi = zzgdVar.zzaA().zzi();
        zzagVar.zzh();
        zzerVarZzi.zzb("App measurement initialized, version", 79000L);
        zzgdVar.zzaA().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzl = zzekVar.zzl();
        if (TextUtils.isEmpty(zzgdVar.f15990OooO0O0)) {
            zzlp zzlpVarZzv = zzgdVar.zzv();
            zzlpVarZzv.getClass();
            if (TextUtils.isEmpty(strZzl)) {
                zEquals = false;
            } else {
                zzgd zzgdVar2 = zzlpVarZzv.f41276OooO00o;
                String strZzl2 = zzgdVar2.zzf().zzl();
                zzgdVar2.zzay();
                zEquals = strZzl2.equals(strZzl);
            }
            if (zEquals) {
                zzgdVar.zzaA().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgdVar.zzaA().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strZzl)));
            }
        }
        zzgdVar.zzaA().zzc().zza("Debug-level message logging enabled");
        int i = zzgdVar.f16018OooOooo;
        AtomicInteger atomicInteger = zzgdVar.f16019Oooo000;
        if (i != atomicInteger.get()) {
            zzgdVar.zzaA().zzd().zzc("Not all components initialized", Integer.valueOf(zzgdVar.f16018OooOooo), Integer.valueOf(atomicInteger.get()));
        }
        zzgdVar.f16007OooOo = true;
        zzgdVar.zzaB().zzg();
        zzhb zzhbVarOooO0o0 = zzgdVar.zzm().OooO0o0();
        int iZza = zzhbVarOooO0o0.zza();
        zzgd zzgdVar3 = zzagVar.f41276OooO00o;
        Boolean boolOooO0OO = zzagVar.OooO0OO("google_analytics_default_allow_ad_storage");
        Boolean boolOooO0OO2 = zzagVar.OooO0OO("google_analytics_default_allow_analytics_storage");
        long j = zzgdVar.f16020Oooo00O;
        if (!(boolOooO0OO == null && boolOooO0OO2 == null) && zzgdVar.zzm().OooOO0(-10)) {
            zzhbVar = new zzhb(boolOooO0OO, boolOooO0OO2, -10);
        } else {
            if (!TextUtils.isEmpty(zzgdVar.zzh().zzm()) && (iZza == 0 || iZza == 30 || iZza == 10 || iZza == 30 || iZza == 30 || iZza == 40)) {
                zzgdVar.zzq().zzR(new zzhb(null, null, -10), j);
            } else if (TextUtils.isEmpty(zzgdVar.zzh().zzm()) && (zzclVar = zzhiVar.f16033OooO0oO) != null && zzclVar.zzg != null && zzgdVar.zzm().OooOO0(30)) {
                zzhbVar = zzhb.zzb(zzclVar.zzg, 30);
                if (!zzhbVar.zzl()) {
                }
            }
            zzhbVar = null;
        }
        if (zzhbVar != null) {
            zzgdVar.zzq().zzR(zzhbVar, j);
            zzhbVarOooO0o0 = zzhbVar;
        }
        zzgdVar.zzq().OooO0oO(zzhbVarOooO0o0);
        if (zzgdVar.zzm().f41212OooO0o0.zza() == 0) {
            zzgdVar.zzaA().zzj().zzb("Persisting first open", Long.valueOf(j));
            zzgdVar.zzm().f41212OooO0o0.zzb(j);
        }
        zzs zzsVar = zzgdVar.zzq().f16045OooOO0o;
        if (zzsVar.OooO0O0() && zzsVar.OooO0OO()) {
            zzsVar.f16118OooO00o.zzm().f41225OooOo0.zzb(null);
        }
        if (zzgdVar.OooO00o()) {
            if (TextUtils.isEmpty(zzgdVar.zzh().zzm())) {
                zzek zzekVarZzh = zzgdVar.zzh();
                zzekVarZzh.zza();
                if (!TextUtils.isEmpty(zzekVarZzh.f15915OooOOO0)) {
                    zzlp zzlpVarZzv2 = zzgdVar.zzv();
                    strZzm = zzgdVar.zzh().zzm();
                    o0OOO0 o0ooo0Zzm2 = zzgdVar.zzm();
                    o0ooo0Zzm2.zzg();
                    string = o0ooo0Zzm2.OooO0Oo().getString("gmp_app_id", null);
                    zzek zzekVarZzh2 = zzgdVar.zzh();
                    zzekVarZzh2.zza();
                    str = zzekVarZzh2.f15915OooOOO0;
                    o0OOO0 o0ooo0Zzm3 = zzgdVar.zzm();
                    o0ooo0Zzm3.zzg();
                    string2 = o0ooo0Zzm3.OooO0Oo().getString("admob_app_id", null);
                    zzlpVarZzv2.getClass();
                    if (zzlp.OooOooo(strZzm, string, str, string2)) {
                        zzgdVar.zzaA().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                        o0ooo0Zzm = zzgdVar.zzm();
                        o0ooo0Zzm.zzg();
                        boolOooO0o = o0ooo0Zzm.OooO0o();
                        SharedPreferences.Editor editorEdit = o0ooo0Zzm.OooO0Oo().edit();
                        editorEdit.clear();
                        editorEdit.apply();
                        if (boolOooO0o != null) {
                            o0ooo0Zzm.OooO0oO(boolOooO0o);
                        }
                        zzgdVar.zzi().zzj();
                        zzgdVar.f16008OooOo0.zzs();
                        zzgdVar.f16008OooOo0.OooOO0o();
                        zzgdVar.zzm().f41212OooO0o0.zzb(j);
                        zzgdVar.zzm().f41211OooO0o.zzb(null);
                    }
                    o0OOO0 o0ooo0Zzm4 = zzgdVar.zzm();
                    String strZzm2 = zzgdVar.zzh().zzm();
                    o0ooo0Zzm4.zzg();
                    SharedPreferences.Editor editorEdit2 = o0ooo0Zzm4.OooO0Oo().edit();
                    editorEdit2.putString("gmp_app_id", strZzm2);
                    editorEdit2.apply();
                    o0OOO0 o0ooo0Zzm5 = zzgdVar.zzm();
                    zzek zzekVarZzh3 = zzgdVar.zzh();
                    zzekVarZzh3.zza();
                    String str2 = zzekVarZzh3.f15915OooOOO0;
                    o0ooo0Zzm5.zzg();
                    SharedPreferences.Editor editorEdit3 = o0ooo0Zzm5.OooO0Oo().edit();
                    editorEdit3.putString("admob_app_id", str2);
                    editorEdit3.apply();
                }
            } else {
                zzlp zzlpVarZzv3 = zzgdVar.zzv();
                strZzm = zzgdVar.zzh().zzm();
                o0OOO0 o0ooo0Zzm6 = zzgdVar.zzm();
                o0ooo0Zzm6.zzg();
                string = o0ooo0Zzm6.OooO0Oo().getString("gmp_app_id", null);
                zzek zzekVarZzh4 = zzgdVar.zzh();
                zzekVarZzh4.zza();
                str = zzekVarZzh4.f15915OooOOO0;
                o0OOO0 o0ooo0Zzm7 = zzgdVar.zzm();
                o0ooo0Zzm7.zzg();
                string2 = o0ooo0Zzm7.OooO0Oo().getString("admob_app_id", null);
                zzlpVarZzv3.getClass();
                if (zzlp.OooOooo(strZzm, string, str, string2)) {
                    zzgdVar.zzaA().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    o0ooo0Zzm = zzgdVar.zzm();
                    o0ooo0Zzm.zzg();
                    boolOooO0o = o0ooo0Zzm.OooO0o();
                    SharedPreferences.Editor editorEdit4 = o0ooo0Zzm.OooO0Oo().edit();
                    editorEdit4.clear();
                    editorEdit4.apply();
                    if (boolOooO0o != null) {
                        o0ooo0Zzm.OooO0oO(boolOooO0o);
                    }
                    zzgdVar.zzi().zzj();
                    zzgdVar.f16008OooOo0.zzs();
                    zzgdVar.f16008OooOo0.OooOO0o();
                    zzgdVar.zzm().f41212OooO0o0.zzb(j);
                    zzgdVar.zzm().f41211OooO0o.zzb(null);
                }
                o0OOO0 o0ooo0Zzm8 = zzgdVar.zzm();
                String strZzm3 = zzgdVar.zzh().zzm();
                o0ooo0Zzm8.zzg();
                SharedPreferences.Editor editorEdit5 = o0ooo0Zzm8.OooO0Oo().edit();
                editorEdit5.putString("gmp_app_id", strZzm3);
                editorEdit5.apply();
                o0OOO0 o0ooo0Zzm9 = zzgdVar.zzm();
                zzek zzekVarZzh5 = zzgdVar.zzh();
                zzekVarZzh5.zza();
                String str3 = zzekVarZzh5.f15915OooOOO0;
                o0ooo0Zzm9.zzg();
                SharedPreferences.Editor editorEdit6 = o0ooo0Zzm9.OooO0Oo().edit();
                editorEdit6.putString("admob_app_id", str3);
                editorEdit6.apply();
            }
            if (!zzgdVar.zzm().OooO0o0().zzj(zzha.ANALYTICS_STORAGE)) {
                zzgdVar.zzm().f41211OooO0o.zzb(null);
            }
            zzgdVar.zzq().f16041OooO0oO.set(zzgdVar.zzm().f41211OooO0o.zza());
            zzos.zzc();
            if (zzagVar.zzs(null, zzeg.zzae)) {
                try {
                    zzgdVar.zzv().f41276OooO00o.f15989OooO00o.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzgdVar.zzm().f41226OooOo00.zza())) {
                        zzgdVar.zzaA().zzk().zza("Remote config removed with active feature rollouts");
                        zzgdVar.zzm().f41226OooOo00.zzb(null);
                    }
                }
            }
            if (TextUtils.isEmpty(zzgdVar.zzh().zzm())) {
                zzek zzekVarZzh6 = zzgdVar.zzh();
                zzekVarZzh6.zza();
                if (!TextUtils.isEmpty(zzekVarZzh6.f15915OooOOO0)) {
                    zZzJ = zzgdVar.zzJ();
                    sharedPreferences = zzgdVar.zzm().f41209OooO0OO;
                    if (!(sharedPreferences != null ? sharedPreferences.contains("deferred_analytics_collection") : false) && !zzagVar.zzv()) {
                        zzgdVar.zzm().OooO0oo(!zZzJ);
                    }
                    if (zZzJ) {
                        zzgdVar.zzq().zzz();
                    }
                    zzgdVar.zzu().f16074OooO0o0.OooO00o();
                    zzgdVar.zzt().zzu(new AtomicReference());
                    zzgdVar.zzt().zzH(zzgdVar.zzm().f41228OooOo0o.zza());
                }
            } else {
                zZzJ = zzgdVar.zzJ();
                sharedPreferences = zzgdVar.zzm().f41209OooO0OO;
                if (!(sharedPreferences != null ? sharedPreferences.contains("deferred_analytics_collection") : false)) {
                    zzgdVar.zzm().OooO0oo(!zZzJ);
                }
                if (zZzJ) {
                    zzgdVar.zzq().zzz();
                }
                zzgdVar.zzu().f16074OooO0o0.OooO00o();
                zzgdVar.zzt().zzu(new AtomicReference());
                zzgdVar.zzt().zzH(zzgdVar.zzm().f41228OooOo0o.zza());
            }
        } else if (zzgdVar.zzJ()) {
            if (!zzgdVar.zzv().OooOo("android.permission.INTERNET")) {
                o0O0OO0.OooO00o(zzgdVar, "App is missing INTERNET permission");
            }
            if (!zzgdVar.zzv().OooOo("android.permission.ACCESS_NETWORK_STATE")) {
                o0O0OO0.OooO00o(zzgdVar, "App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context = zzgdVar.f15989OooO00o;
            if (!Wrappers.packageManager(context).isCallerInstantApp() && !zzagVar.OooO0Oo()) {
                if (!zzlp.OooOoo(context)) {
                    o0O0OO0.OooO00o(zzgdVar, "AppMeasurementReceiver not registered/enabled");
                }
                if (!zzlp.OooOooO(context)) {
                    o0O0OO0.OooO00o(zzgdVar, "AppMeasurementService not registered/enabled");
                }
            }
            o0O0OO0.OooO00o(zzgdVar, "Uploading is not possible. App measurement disabled");
        }
        zzgdVar.zzm().f41219OooOOO0.zza(true);
    }
}
