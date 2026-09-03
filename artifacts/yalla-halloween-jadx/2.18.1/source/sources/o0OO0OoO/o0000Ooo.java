package o0OO0OoO;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzef;
import com.google.android.gms.measurement.internal.zzeh;
import com.google.android.gms.measurement.internal.zzem;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzhb f37565Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzfy f37566Oooo0oO;

    public o0000Ooo(zzfy zzfyVar, zzhb zzhbVar) {
        this.f37566Oooo0oO = zzfyVar;
        this.f37565Oooo0o = zzhbVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0273  */
    /* JADX WARN: Code duplicated, block: B:76:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:96:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:99:0x03d5  */
    @Override // java.lang.Runnable
    public final void run() {
        zzai zzaiVar;
        zzlh zzlhVarZzv;
        String strZzm;
        String string;
        String str;
        o0O0O00 o0o0o00Zzm;
        o0O0O00 o0o0o00Zzm2;
        Boolean boolOooO0oO;
        boolean zZzJ;
        SharedPreferences sharedPreferences;
        zzfy zzfyVar = this.f37566Oooo0oO;
        zzhb zzhbVar = this.f37565Oooo0o;
        zzfyVar.zzaz().zzg();
        zzfyVar.f16199OooO0oO.f37615OooO00o.zzaw();
        zzaq zzaqVar = new zzaq(zzfyVar);
        zzaqVar.zzv();
        zzfyVar.f16214OooOo0O = zzaqVar;
        zzef zzefVar = new zzef(zzfyVar, zzhbVar.f16233OooO0o);
        zzefVar.zzb();
        zzfyVar.f16215OooOo0o = zzefVar;
        zzeh zzehVar = new zzeh(zzfyVar);
        zzehVar.zzb();
        zzfyVar.f16213OooOo00 = zzehVar;
        zzjs zzjsVar = new zzjs(zzfyVar);
        zzjsVar.zzb();
        zzfyVar.f16212OooOo0 = zzjsVar;
        zzfyVar.f16203OooOO0o.zzw();
        zzfyVar.f16200OooO0oo.zzw();
        zzfyVar.f16215OooOo0o.zzc();
        zzem zzemVarZzi = zzfyVar.zzay().zzi();
        zzfyVar.f16199OooO0oO.zzh();
        zzemVarZzi.zzb("App measurement initialized, version", 73000L);
        zzfyVar.zzay().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzl = zzefVar.zzl();
        if (TextUtils.isEmpty(zzfyVar.f16194OooO0O0)) {
            if (zzfyVar.zzv().OooOoO0(strZzl)) {
                zzfyVar.zzay().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzfyVar.zzay().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strZzl)));
            }
        }
        zzfyVar.zzay().zzc().zza("Debug-level message logging enabled");
        if (zzfyVar.f16222OooOooo != zzfyVar.f16223Oooo000.get()) {
            zzfyVar.zzay().zzd().zzc("Not all components initialized", Integer.valueOf(zzfyVar.f16222OooOooo), Integer.valueOf(zzfyVar.f16223Oooo000.get()));
        }
        zzfyVar.f16211OooOo = true;
        zzfy zzfyVar2 = this.f37566Oooo0oO;
        zzcl zzclVar = this.f37565Oooo0o.f16235OooO0oO;
        zzfyVar2.zzaz().zzg();
        zzai zzaiVarOooO0o = zzfyVar2.zzm().OooO0o();
        o0O0O00 o0o0o00Zzm3 = zzfyVar2.zzm();
        zzfy zzfyVar3 = o0o0o00Zzm3.f37615OooO00o;
        o0o0o00Zzm3.zzg();
        int i = 100;
        int i2 = o0o0o00Zzm3.OooO0o0().getInt("consent_source", 100);
        zzag zzagVar = zzfyVar2.f16199OooO0oO;
        zzfy zzfyVar4 = zzagVar.f37615OooO00o;
        Boolean boolOooO0Oo = zzagVar.OooO0Oo("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = zzfyVar2.f16199OooO0oO;
        zzfy zzfyVar5 = zzagVar2.f37615OooO00o;
        Boolean boolOooO0Oo2 = zzagVar2.OooO0Oo("google_analytics_default_allow_analytics_storage");
        if (!(boolOooO0Oo == null && boolOooO0Oo2 == null) && zzfyVar2.zzm().OooOO0O(-10)) {
            zzaiVar = new zzai(boolOooO0Oo, boolOooO0Oo2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(zzfyVar2.zzh().zzm()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                zzfyVar2.zzq().zzS(zzai.zza, -10, zzfyVar2.f16224Oooo00O);
            } else if (TextUtils.isEmpty(zzfyVar2.zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzfyVar2.zzm().OooOO0O(30)) {
                zzaiVar = zzai.zza(zzclVar.zzg);
                if (!zzaiVar.equals(zzai.zza)) {
                    i = 30;
                }
            }
            zzaiVar = null;
        }
        if (zzaiVar != null) {
            zzfyVar2.zzq().zzS(zzaiVar, i, zzfyVar2.f16224Oooo00O);
            zzaiVarOooO0o = zzaiVar;
        }
        zzfyVar2.zzq().OooOO0(zzaiVarOooO0o);
        if (zzfyVar2.zzm().f37767OooO0o0.zza() == 0) {
            zzfyVar2.zzay().zzj().zzb("Persisting first open", Long.valueOf(zzfyVar2.f16224Oooo00O));
            zzfyVar2.zzm().f37767OooO0o0.zzb(zzfyVar2.f16224Oooo00O);
        }
        zzs zzsVar = zzfyVar2.zzq().f16248OooOOO;
        if (zzsVar.OooO0O0() && zzsVar.OooO0OO()) {
            zzsVar.f16321OooO00o.zzm().f37781OooOo00.zzb(null);
        }
        if (zzfyVar2.OooO0O0()) {
            if (TextUtils.isEmpty(zzfyVar2.zzh().zzm())) {
                zzef zzefVarZzh = zzfyVar2.zzh();
                zzefVarZzh.zza();
                if (!TextUtils.isEmpty(zzefVarZzh.f16119OooOOO0)) {
                    zzlhVarZzv = zzfyVar2.zzv();
                    strZzm = zzfyVar2.zzh().zzm();
                    o0O0O00 o0o0o00Zzm4 = zzfyVar2.zzm();
                    o0o0o00Zzm4.zzg();
                    string = o0o0o00Zzm4.OooO0o0().getString("gmp_app_id", null);
                    zzef zzefVarZzh2 = zzfyVar2.zzh();
                    zzefVarZzh2.zza();
                    str = zzefVarZzh2.f16119OooOOO0;
                    o0o0o00Zzm = zzfyVar2.zzm();
                    o0o0o00Zzm.zzg();
                    if (zzlhVarZzv.Oooo000(strZzm, string, str, o0o0o00Zzm.OooO0o0().getString("admob_app_id", null))) {
                        zzfyVar2.zzay().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                        o0o0o00Zzm2 = zzfyVar2.zzm();
                        o0o0o00Zzm2.zzg();
                        boolOooO0oO = o0o0o00Zzm2.OooO0oO();
                        SharedPreferences.Editor editorEdit = o0o0o00Zzm2.OooO0o0().edit();
                        editorEdit.clear();
                        editorEdit.apply();
                        if (boolOooO0oO != null) {
                            o0o0o00Zzm2.OooO0oo(boolOooO0oO);
                        }
                        zzfyVar2.zzi().zzj();
                        zzfyVar2.f16212OooOo0.zzs();
                        zzfyVar2.f16212OooOo0.OooOOO();
                        zzfyVar2.zzm().f37767OooO0o0.zzb(zzfyVar2.f16224Oooo00O);
                        zzfyVar2.zzm().f37766OooO0o.zzb(null);
                    }
                    o0O0O00 o0o0o00Zzm5 = zzfyVar2.zzm();
                    String strZzm2 = zzfyVar2.zzh().zzm();
                    o0o0o00Zzm5.zzg();
                    SharedPreferences.Editor editorEdit2 = o0o0o00Zzm5.OooO0o0().edit();
                    editorEdit2.putString("gmp_app_id", strZzm2);
                    editorEdit2.apply();
                    o0O0O00 o0o0o00Zzm6 = zzfyVar2.zzm();
                    zzef zzefVarZzh3 = zzfyVar2.zzh();
                    zzefVarZzh3.zza();
                    String str2 = zzefVarZzh3.f16119OooOOO0;
                    o0o0o00Zzm6.zzg();
                    SharedPreferences.Editor editorEdit3 = o0o0o00Zzm6.OooO0o0().edit();
                    editorEdit3.putString("admob_app_id", str2);
                    editorEdit3.apply();
                }
            } else {
                zzlhVarZzv = zzfyVar2.zzv();
                strZzm = zzfyVar2.zzh().zzm();
                o0O0O00 o0o0o00Zzm7 = zzfyVar2.zzm();
                o0o0o00Zzm7.zzg();
                string = o0o0o00Zzm7.OooO0o0().getString("gmp_app_id", null);
                zzef zzefVarZzh4 = zzfyVar2.zzh();
                zzefVarZzh4.zza();
                str = zzefVarZzh4.f16119OooOOO0;
                o0o0o00Zzm = zzfyVar2.zzm();
                o0o0o00Zzm.zzg();
                if (zzlhVarZzv.Oooo000(strZzm, string, str, o0o0o00Zzm.OooO0o0().getString("admob_app_id", null))) {
                    zzfyVar2.zzay().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    o0o0o00Zzm2 = zzfyVar2.zzm();
                    o0o0o00Zzm2.zzg();
                    boolOooO0oO = o0o0o00Zzm2.OooO0oO();
                    SharedPreferences.Editor editorEdit4 = o0o0o00Zzm2.OooO0o0().edit();
                    editorEdit4.clear();
                    editorEdit4.apply();
                    if (boolOooO0oO != null) {
                        o0o0o00Zzm2.OooO0oo(boolOooO0oO);
                    }
                    zzfyVar2.zzi().zzj();
                    zzfyVar2.f16212OooOo0.zzs();
                    zzfyVar2.f16212OooOo0.OooOOO();
                    zzfyVar2.zzm().f37767OooO0o0.zzb(zzfyVar2.f16224Oooo00O);
                    zzfyVar2.zzm().f37766OooO0o.zzb(null);
                }
                o0O0O00 o0o0o00Zzm8 = zzfyVar2.zzm();
                String strZzm3 = zzfyVar2.zzh().zzm();
                o0o0o00Zzm8.zzg();
                SharedPreferences.Editor editorEdit5 = o0o0o00Zzm8.OooO0o0().edit();
                editorEdit5.putString("gmp_app_id", strZzm3);
                editorEdit5.apply();
                o0O0O00 o0o0o00Zzm9 = zzfyVar2.zzm();
                zzef zzefVarZzh5 = zzfyVar2.zzh();
                zzefVarZzh5.zza();
                String str3 = zzefVarZzh5.f16119OooOOO0;
                o0o0o00Zzm9.zzg();
                SharedPreferences.Editor editorEdit6 = o0o0o00Zzm9.OooO0o0().edit();
                editorEdit6.putString("admob_app_id", str3);
                editorEdit6.apply();
            }
            if (!zzfyVar2.zzm().OooO0o().zzi(zzah.ANALYTICS_STORAGE)) {
                zzfyVar2.zzm().f37766OooO0o.zzb(null);
            }
            zzfyVar2.zzq().OooO(zzfyVar2.zzm().f37766OooO0o.zza());
            zznv.zzc();
            if (zzfyVar2.f16199OooO0oO.zzs(null, zzeb.zzac)) {
                try {
                    zzfyVar2.zzv().f37615OooO00o.f16193OooO00o.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzfyVar2.zzm().f37779OooOOoo.zza())) {
                        zzfyVar2.zzay().zzk().zza("Remote config removed with active feature rollouts");
                        zzfyVar2.zzm().f37779OooOOoo.zzb(null);
                    }
                }
            }
            if (TextUtils.isEmpty(zzfyVar2.zzh().zzm())) {
                zzef zzefVarZzh6 = zzfyVar2.zzh();
                zzefVarZzh6.zza();
                if (!TextUtils.isEmpty(zzefVarZzh6.f16119OooOOO0)) {
                    zZzJ = zzfyVar2.zzJ();
                    sharedPreferences = zzfyVar2.zzm().f37764OooO0OO;
                    if (!(sharedPreferences != null ? sharedPreferences.contains("deferred_analytics_collection") : false) && !zzfyVar2.f16199OooO0oO.zzv()) {
                        zzfyVar2.zzm().OooO(!zZzJ);
                    }
                    if (zZzJ) {
                        zzfyVar2.zzq().zzz();
                    }
                    zzfyVar2.zzu().f16276OooO0Oo.OooO00o();
                    zzfyVar2.zzt().zzu(new AtomicReference());
                    zzfyVar2.zzt().zzH(zzfyVar2.zzm().f37782OooOo0O.zza());
                }
            } else {
                zZzJ = zzfyVar2.zzJ();
                sharedPreferences = zzfyVar2.zzm().f37764OooO0OO;
                if (!(sharedPreferences != null ? sharedPreferences.contains("deferred_analytics_collection") : false)) {
                    zzfyVar2.zzm().OooO(!zZzJ);
                }
                if (zZzJ) {
                    zzfyVar2.zzq().zzz();
                }
                zzfyVar2.zzu().f16276OooO0Oo.OooO00o();
                zzfyVar2.zzt().zzu(new AtomicReference());
                zzfyVar2.zzt().zzH(zzfyVar2.zzm().f37782OooOo0O.zza());
            }
        } else if (zzfyVar2.zzJ()) {
            if (!zzfyVar2.zzv().OooOo("android.permission.INTERNET")) {
                p167o00Ooo.OooOO0.OooO0O0(zzfyVar2, "App is missing INTERNET permission");
            }
            if (!zzfyVar2.zzv().OooOo("android.permission.ACCESS_NETWORK_STATE")) {
                p167o00Ooo.OooOO0.OooO0O0(zzfyVar2, "App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(zzfyVar2.f16193OooO00o).isCallerInstantApp() && !zzfyVar2.f16199OooO0oO.OooO0o0()) {
                if (!zzlh.OooOooO(zzfyVar2.f16193OooO00o)) {
                    p167o00Ooo.OooOO0.OooO0O0(zzfyVar2, "AppMeasurementReceiver not registered/enabled");
                }
                if (!zzlh.OooOooo(zzfyVar2.f16193OooO00o)) {
                    p167o00Ooo.OooOO0.OooO0O0(zzfyVar2, "AppMeasurementService not registered/enabled");
                }
            }
            p167o00Ooo.OooOO0.OooO0O0(zzfyVar2, "Uploading is not possible. App measurement disabled");
        }
        zzfyVar2.zzm().f37774OooOOO0.zza(true);
    }
}
