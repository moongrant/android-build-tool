package p271o00ooooo;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.media3.session.o00O00;
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
public final class oO0O00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzhi f40609OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzgd f40610OooO0o0;

    public oO0O00o0(zzgd zzgdVar, zzhi zzhiVar) {
        this.f40610OooO0o0 = zzgdVar;
        this.f40609OooO0Oo = zzhiVar;
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
        oOo000Oo ooo000ooZzm;
        Boolean boolOooO0o;
        boolean zZzJ;
        SharedPreferences sharedPreferences;
        zzcl zzclVar;
        boolean zEquals;
        zzgd zzgdVar = this.f40610OooO0o0;
        zzgdVar.zzaB().zzg();
        zzag zzagVar = zzgdVar.f15519OooO0oO;
        zzagVar.f40788OooO00o.zzay();
        zzao zzaoVar = new zzao(zzgdVar);
        zzaoVar.zzw();
        zzgdVar.f15534OooOo0O = zzaoVar;
        zzhi zzhiVar = this.f40609OooO0Oo;
        zzek zzekVar = new zzek(zzgdVar, zzhiVar.f15555OooO0o);
        zzekVar.zzb();
        zzgdVar.f15535OooOo0o = zzekVar;
        zzem zzemVar = new zzem(zzgdVar);
        zzemVar.zzb();
        zzgdVar.f15533OooOo00 = zzemVar;
        zzjz zzjzVar = new zzjz(zzgdVar);
        zzjzVar.zzb();
        zzgdVar.f15532OooOo0 = zzjzVar;
        zzgdVar.f15523OooOO0o.zzx();
        zzgdVar.f15520OooO0oo.zzx();
        zzgdVar.f15535OooOo0o.zzc();
        zzer zzerVarZzi = zzgdVar.zzaA().zzi();
        zzagVar.zzh();
        zzerVarZzi.zzb("App measurement initialized, version", 79000L);
        zzgdVar.zzaA().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzl = zzekVar.zzl();
        if (TextUtils.isEmpty(zzgdVar.f15514OooO0O0)) {
            zzlp zzlpVarZzv = zzgdVar.zzv();
            zzlpVarZzv.getClass();
            if (TextUtils.isEmpty(strZzl)) {
                zEquals = false;
            } else {
                zzgd zzgdVar2 = zzlpVarZzv.f40788OooO00o;
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
        int i = zzgdVar.f15542OooOooo;
        AtomicInteger atomicInteger = zzgdVar.f15543Oooo000;
        if (i != atomicInteger.get()) {
            zzgdVar.zzaA().zzd().zzc("Not all components initialized", Integer.valueOf(zzgdVar.f15542OooOooo), Integer.valueOf(atomicInteger.get()));
        }
        zzgdVar.f15531OooOo = true;
        zzgdVar.zzaB().zzg();
        zzhb zzhbVarOooO0o0 = zzgdVar.zzm().OooO0o0();
        int iZza = zzhbVarOooO0o0.zza();
        zzgd zzgdVar3 = zzagVar.f40788OooO00o;
        Boolean boolOooO0OO = zzagVar.OooO0OO("google_analytics_default_allow_ad_storage");
        Boolean boolOooO0OO2 = zzagVar.OooO0OO("google_analytics_default_allow_analytics_storage");
        long j = zzgdVar.f15544Oooo00O;
        if (!(boolOooO0OO == null && boolOooO0OO2 == null) && zzgdVar.zzm().OooOO0(-10)) {
            zzhbVar = new zzhb(boolOooO0OO, boolOooO0OO2, -10);
        } else {
            if (!TextUtils.isEmpty(zzgdVar.zzh().zzm()) && (iZza == 0 || iZza == 30 || iZza == 10 || iZza == 30 || iZza == 30 || iZza == 40)) {
                zzgdVar.zzq().zzR(new zzhb(null, null, -10), j);
            } else if (TextUtils.isEmpty(zzgdVar.zzh().zzm()) && (zzclVar = zzhiVar.f15557OooO0oO) != null && zzclVar.zzg != null && zzgdVar.zzm().OooOO0(30)) {
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
        if (zzgdVar.zzm().f40768OooO0o0.zza() == 0) {
            zzgdVar.zzaA().zzj().zzb("Persisting first open", Long.valueOf(j));
            zzgdVar.zzm().f40768OooO0o0.zzb(j);
        }
        zzs zzsVar = zzgdVar.zzq().f15569OooOO0o;
        if (zzsVar.OooO0O0() && zzsVar.OooO0OO()) {
            zzsVar.f15642OooO00o.zzm().f40781OooOo0.zzb(null);
        }
        if (zzgdVar.OooO00o()) {
            if (TextUtils.isEmpty(zzgdVar.zzh().zzm())) {
                zzek zzekVarZzh = zzgdVar.zzh();
                zzekVarZzh.zza();
                if (!TextUtils.isEmpty(zzekVarZzh.f15439OooOOO0)) {
                    zzlp zzlpVarZzv2 = zzgdVar.zzv();
                    strZzm = zzgdVar.zzh().zzm();
                    oOo000Oo ooo000ooZzm2 = zzgdVar.zzm();
                    ooo000ooZzm2.zzg();
                    string = ooo000ooZzm2.OooO0Oo().getString("gmp_app_id", null);
                    zzek zzekVarZzh2 = zzgdVar.zzh();
                    zzekVarZzh2.zza();
                    str = zzekVarZzh2.f15439OooOOO0;
                    oOo000Oo ooo000ooZzm3 = zzgdVar.zzm();
                    ooo000ooZzm3.zzg();
                    string2 = ooo000ooZzm3.OooO0Oo().getString("admob_app_id", null);
                    zzlpVarZzv2.getClass();
                    if (zzlp.OooOooo(strZzm, string, str, string2)) {
                        zzgdVar.zzaA().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                        ooo000ooZzm = zzgdVar.zzm();
                        ooo000ooZzm.zzg();
                        boolOooO0o = ooo000ooZzm.OooO0o();
                        SharedPreferences.Editor editorEdit = ooo000ooZzm.OooO0Oo().edit();
                        editorEdit.clear();
                        editorEdit.apply();
                        if (boolOooO0o != null) {
                            ooo000ooZzm.OooO0oO(boolOooO0o);
                        }
                        zzgdVar.zzi().zzj();
                        zzgdVar.f15532OooOo0.zzs();
                        zzgdVar.f15532OooOo0.OooOO0o();
                        zzgdVar.zzm().f40768OooO0o0.zzb(j);
                        zzgdVar.zzm().f40767OooO0o.zzb(null);
                    }
                    oOo000Oo ooo000ooZzm4 = zzgdVar.zzm();
                    String strZzm2 = zzgdVar.zzh().zzm();
                    ooo000ooZzm4.zzg();
                    SharedPreferences.Editor editorEdit2 = ooo000ooZzm4.OooO0Oo().edit();
                    editorEdit2.putString("gmp_app_id", strZzm2);
                    editorEdit2.apply();
                    oOo000Oo ooo000ooZzm5 = zzgdVar.zzm();
                    zzek zzekVarZzh3 = zzgdVar.zzh();
                    zzekVarZzh3.zza();
                    String str2 = zzekVarZzh3.f15439OooOOO0;
                    ooo000ooZzm5.zzg();
                    SharedPreferences.Editor editorEdit3 = ooo000ooZzm5.OooO0Oo().edit();
                    editorEdit3.putString("admob_app_id", str2);
                    editorEdit3.apply();
                }
            } else {
                zzlp zzlpVarZzv3 = zzgdVar.zzv();
                strZzm = zzgdVar.zzh().zzm();
                oOo000Oo ooo000ooZzm6 = zzgdVar.zzm();
                ooo000ooZzm6.zzg();
                string = ooo000ooZzm6.OooO0Oo().getString("gmp_app_id", null);
                zzek zzekVarZzh4 = zzgdVar.zzh();
                zzekVarZzh4.zza();
                str = zzekVarZzh4.f15439OooOOO0;
                oOo000Oo ooo000ooZzm7 = zzgdVar.zzm();
                ooo000ooZzm7.zzg();
                string2 = ooo000ooZzm7.OooO0Oo().getString("admob_app_id", null);
                zzlpVarZzv3.getClass();
                if (zzlp.OooOooo(strZzm, string, str, string2)) {
                    zzgdVar.zzaA().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    ooo000ooZzm = zzgdVar.zzm();
                    ooo000ooZzm.zzg();
                    boolOooO0o = ooo000ooZzm.OooO0o();
                    SharedPreferences.Editor editorEdit4 = ooo000ooZzm.OooO0Oo().edit();
                    editorEdit4.clear();
                    editorEdit4.apply();
                    if (boolOooO0o != null) {
                        ooo000ooZzm.OooO0oO(boolOooO0o);
                    }
                    zzgdVar.zzi().zzj();
                    zzgdVar.f15532OooOo0.zzs();
                    zzgdVar.f15532OooOo0.OooOO0o();
                    zzgdVar.zzm().f40768OooO0o0.zzb(j);
                    zzgdVar.zzm().f40767OooO0o.zzb(null);
                }
                oOo000Oo ooo000ooZzm8 = zzgdVar.zzm();
                String strZzm3 = zzgdVar.zzh().zzm();
                ooo000ooZzm8.zzg();
                SharedPreferences.Editor editorEdit5 = ooo000ooZzm8.OooO0Oo().edit();
                editorEdit5.putString("gmp_app_id", strZzm3);
                editorEdit5.apply();
                oOo000Oo ooo000ooZzm9 = zzgdVar.zzm();
                zzek zzekVarZzh5 = zzgdVar.zzh();
                zzekVarZzh5.zza();
                String str3 = zzekVarZzh5.f15439OooOOO0;
                ooo000ooZzm9.zzg();
                SharedPreferences.Editor editorEdit6 = ooo000ooZzm9.OooO0Oo().edit();
                editorEdit6.putString("admob_app_id", str3);
                editorEdit6.apply();
            }
            if (!zzgdVar.zzm().OooO0o0().zzj(zzha.ANALYTICS_STORAGE)) {
                zzgdVar.zzm().f40767OooO0o.zzb(null);
            }
            zzgdVar.zzq().f15565OooO0oO.set(zzgdVar.zzm().f40767OooO0o.zza());
            zzos.zzc();
            if (zzagVar.zzs(null, zzeg.zzae)) {
                try {
                    zzgdVar.zzv().f40788OooO00o.f15513OooO00o.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzgdVar.zzm().f40782OooOo00.zza())) {
                        zzgdVar.zzaA().zzk().zza("Remote config removed with active feature rollouts");
                        zzgdVar.zzm().f40782OooOo00.zzb(null);
                    }
                }
            }
            if (TextUtils.isEmpty(zzgdVar.zzh().zzm())) {
                zzek zzekVarZzh6 = zzgdVar.zzh();
                zzekVarZzh6.zza();
                if (!TextUtils.isEmpty(zzekVarZzh6.f15439OooOOO0)) {
                    zZzJ = zzgdVar.zzJ();
                    sharedPreferences = zzgdVar.zzm().f40765OooO0OO;
                    if (!(sharedPreferences != null ? sharedPreferences.contains("deferred_analytics_collection") : false) && !zzagVar.zzv()) {
                        zzgdVar.zzm().OooO0oo(!zZzJ);
                    }
                    if (zZzJ) {
                        zzgdVar.zzq().zzz();
                    }
                    zzgdVar.zzu().f15598OooO0o0.OooO00o();
                    zzgdVar.zzt().zzu(new AtomicReference());
                    zzgdVar.zzt().zzH(zzgdVar.zzm().f40784OooOo0o.zza());
                }
            } else {
                zZzJ = zzgdVar.zzJ();
                sharedPreferences = zzgdVar.zzm().f40765OooO0OO;
                if (!(sharedPreferences != null ? sharedPreferences.contains("deferred_analytics_collection") : false)) {
                    zzgdVar.zzm().OooO0oo(!zZzJ);
                }
                if (zZzJ) {
                    zzgdVar.zzq().zzz();
                }
                zzgdVar.zzu().f15598OooO0o0.OooO00o();
                zzgdVar.zzt().zzu(new AtomicReference());
                zzgdVar.zzt().zzH(zzgdVar.zzm().f40784OooOo0o.zza());
            }
        } else if (zzgdVar.zzJ()) {
            if (!zzgdVar.zzv().OooOo("android.permission.INTERNET")) {
                o00O00.OooO00o(zzgdVar, "App is missing INTERNET permission");
            }
            if (!zzgdVar.zzv().OooOo("android.permission.ACCESS_NETWORK_STATE")) {
                o00O00.OooO00o(zzgdVar, "App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context = zzgdVar.f15513OooO00o;
            if (!Wrappers.packageManager(context).isCallerInstantApp() && !zzagVar.OooO0Oo()) {
                if (!zzlp.OooOoo(context)) {
                    o00O00.OooO00o(zzgdVar, "AppMeasurementReceiver not registered/enabled");
                }
                if (!zzlp.OooOooO(context)) {
                    o00O00.OooO00o(zzgdVar, "AppMeasurementService not registered/enabled");
                }
            }
            o00O00.OooO00o(zzgdVar, "Uploading is not possible. App measurement disabled");
        }
        zzgdVar.zzm().f40775OooOOO0.zza(true);
    }
}
