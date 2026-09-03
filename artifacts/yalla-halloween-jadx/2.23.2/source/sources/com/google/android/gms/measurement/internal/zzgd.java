package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.code.android.util.o0000O00;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzov;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import p271o00ooooo.oO;
import p271o00ooooo.oO0O00o0;
import p271o00ooooo.oOO000;
import p271o00ooooo.oOO00000;
import p271o00ooooo.oOOO0OO0;
import p271o00ooooo.oOOO0OOO;
import p271o00ooooo.oOo000Oo;
import p271o00ooooo.oOo00o0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgd implements oOO00000 {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static volatile zzgd f15511Oooo00o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final zzet f15512OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15513OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15514OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f15515OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f15516OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzab f15517OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f15518OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzag f15519OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oOo000Oo f15520OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final zzga f15521OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final zzkp f15522OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final zzlp f15523OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Clock f15524OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final zzeo f15525OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final zziz f15526OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final zzik f15527OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final zzio f15528OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final zzd f15529OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final String f15530OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public zzjz f15532OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public zzem f15533OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public zzao f15534OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public zzek f15535OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f15536OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Boolean f15537OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile Boolean f15538OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @VisibleForTesting
    public final Boolean f15539OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @VisibleForTesting
    public final Boolean f15540OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile boolean f15541OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f15542OooOooo;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @VisibleForTesting
    public final long f15544Oooo00O;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f15531OooOo = false;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final AtomicInteger f15543Oooo000 = new AtomicInteger(0);

    public zzgd(zzhi zzhiVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzhiVar);
        Context context = zzhiVar.f15551OooO00o;
        zzab zzabVar = new zzab();
        this.f15517OooO0o = zzabVar;
        o0000O00.f13415OooO00o = zzabVar;
        this.f15513OooO00o = context;
        this.f15514OooO0O0 = zzhiVar.f15552OooO0O0;
        this.f15515OooO0OO = zzhiVar.f15553OooO0OO;
        this.f15516OooO0Oo = zzhiVar.f15554OooO0Oo;
        this.f15518OooO0o0 = zzhiVar.f15558OooO0oo;
        this.f15538OooOoOO = zzhiVar.f15556OooO0o0;
        this.f15530OooOOoo = zzhiVar.f15559OooOO0;
        this.f15541OooOooO = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhiVar.f15557OooO0oO;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f15540OooOoo0 = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f15539OooOoo = (Boolean) obj2;
            }
        }
        zzib.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.f15524OooOOO = defaultClock;
        Long l = zzhiVar.f15550OooO;
        this.f15544Oooo00O = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        this.f15519OooO0oO = new zzag(this);
        oOo000Oo ooo000oo = new oOo000Oo(this);
        ooo000oo.zzw();
        this.f15520OooO0oo = ooo000oo;
        zzet zzetVar = new zzet(this);
        zzetVar.zzw();
        this.f15512OooO = zzetVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzw();
        this.f15523OooOO0o = zzlpVar;
        this.f15525OooOOO0 = new zzeo(new oOO000(this));
        this.f15529OooOOo0 = new zzd(this);
        zziz zzizVar = new zziz(this);
        zzizVar.zzb();
        this.f15526OooOOOO = zzizVar;
        zzik zzikVar = new zzik(this);
        zzikVar.zzb();
        this.f15527OooOOOo = zzikVar;
        zzkp zzkpVar = new zzkp(this);
        zzkpVar.zzb();
        this.f15522OooOO0O = zzkpVar;
        zzio zzioVar = new zzio(this);
        zzioVar.zzw();
        this.f15528OooOOo = zzioVar;
        zzga zzgaVar = new zzga(this);
        zzgaVar.zzw();
        this.f15521OooOO0 = zzgaVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhiVar.f15557OooO0oO;
        boolean z = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzik zzikVarZzq = zzq();
            if (zzikVarZzq.f40788OooO00o.f15513OooO00o.getApplicationContext() instanceof Application) {
                Application application = (Application) zzikVarZzq.f40788OooO00o.f15513OooO00o.getApplicationContext();
                if (zzikVarZzq.f15561OooO0OO == null) {
                    zzikVarZzq.f15561OooO0OO = new oOOO0OO0(zzikVarZzq);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzikVarZzq.f15561OooO0OO);
                    application.registerActivityLifecycleCallbacks(zzikVarZzq.f15561OooO0OO);
                    zzikVarZzq.f40788OooO00o.zzaA().zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzaA().zzk().zza("Application context is not an Application");
        }
        zzgaVar.zzp(new oO0O00o0(this, zzhiVar));
    }

    public static final void OooO0O0(oOo00o0o ooo00o0o) {
        if (ooo00o0o == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!ooo00o0o.f40789OooO0O0) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(ooo00o0o.getClass())));
        }
    }

    public static final void OooO0OO(oO oOVar) {
        if (oOVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!oOVar.f40534OooO0O0) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(oOVar.getClass())));
        }
    }

    public static zzgd zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f15511Oooo00o == null) {
            synchronized (zzgd.class) {
                if (f15511Oooo00o == null) {
                    f15511Oooo00o = new zzgd(new zzhi(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f15511Oooo00o);
            f15511Oooo00o.f15538OooOoOO = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f15511Oooo00o);
        return f15511Oooo00o;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    @WorkerThread
    public final boolean OooO00o() {
        boolean z;
        if (!this.f15531OooOo) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzaB().zzg();
        Boolean bool = this.f15537OooOoO0;
        Clock clock = this.f15524OooOOO;
        if (bool == null || this.f15536OooOoO == 0 || (!bool.booleanValue() && Math.abs(clock.elapsedRealtime() - this.f15536OooOoO) > 1000)) {
            this.f15536OooOoO = clock.elapsedRealtime();
            boolean z2 = true;
            if (zzv().OooOo("android.permission.INTERNET") && zzv().OooOo("android.permission.ACCESS_NETWORK_STATE")) {
                Context context = this.f15513OooO00o;
                if (Wrappers.packageManager(context).isCallerInstantApp() || this.f15519OooO0oO.OooO0Oo() || (zzlp.OooOoo(context) && zzlp.OooOooO(context))) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.f15537OooOoO0 = boolValueOf;
            if (boolValueOf.booleanValue()) {
                zzlp zzlpVarZzv = zzv();
                String strZzm = zzh().zzm();
                zzek zzekVarZzh = zzh();
                zzekVarZzh.zza();
                if (!zzlpVarZzv.OooOOo0(strZzm, zzekVarZzh.f15439OooOOO0)) {
                    zzek zzekVarZzh2 = zzh();
                    zzekVarZzh2.zza();
                    if (TextUtils.isEmpty(zzekVarZzh2.f15439OooOOO0)) {
                        z2 = false;
                    }
                }
                this.f15537OooOoO0 = Boolean.valueOf(z2);
            }
        }
        return this.f15537OooOoO0.booleanValue();
    }

    @WorkerThread
    public final void zzE() {
        Pair pair;
        Pair pair2;
        zzaB().zzg();
        OooO0OO(zzr());
        String strZzl = zzh().zzl();
        oOo000Oo ooo000ooZzm = zzm();
        ooo000ooZzm.zzg();
        zzov.zzc();
        zzgd zzgdVar = ooo000ooZzm.f40788OooO00o;
        NetworkInfo activeNetworkInfo = null;
        if (!zzgdVar.zzf().zzs(null, zzeg.zzaI) || ooo000ooZzm.OooO0o0().zzj(zzha.AD_STORAGE)) {
            long jElapsedRealtime = zzgdVar.zzax().elapsedRealtime();
            String str = ooo000ooZzm.f40769OooO0oO;
            if (str == null || jElapsedRealtime >= ooo000ooZzm.f40764OooO) {
                ooo000ooZzm.f40764OooO = zzgdVar.zzf().zzi(strZzl, zzeg.zza) + jElapsedRealtime;
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzgdVar.zzaw());
                    ooo000ooZzm.f40769OooO0oO = "";
                    String id = advertisingIdInfo.getId();
                    if (id != null) {
                        ooo000ooZzm.f40769OooO0oO = id;
                    }
                    ooo000ooZzm.f40770OooO0oo = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (Exception e) {
                    zzgdVar.zzaA().zzc().zzb("Unable to get advertising id", e);
                    ooo000ooZzm.f40769OooO0oO = "";
                }
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                pair = new Pair(ooo000ooZzm.f40769OooO0oO, Boolean.valueOf(ooo000ooZzm.f40770OooO0oo));
            } else {
                pair = new Pair(str, Boolean.valueOf(ooo000ooZzm.f40770OooO0oo));
            }
            pair2 = pair;
        } else {
            pair2 = new Pair("", Boolean.FALSE);
        }
        if (!this.f15519OooO0oO.zzr() || ((Boolean) pair2.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair2.first)) {
            zzaA().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzio zzioVarZzr = zzr();
        zzioVarZzr.OooO0OO();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzioVarZzr.f40788OooO00o.f15513OooO00o.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            zzaA().zzk().zza("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzlp zzlpVarZzv = zzv();
        zzh().f40788OooO00o.f15519OooO0oO.zzh();
        URL urlZzE = zzlpVarZzv.zzE(79000L, strZzl, (String) pair2.first, zzm().f40780OooOOoo.zza() - 1);
        if (urlZzE != null) {
            zzio zzioVarZzr2 = zzr();
            zzgb zzgbVar = new zzgb(this);
            zzioVarZzr2.zzg();
            zzioVarZzr2.OooO0OO();
            Preconditions.checkNotNull(urlZzE);
            Preconditions.checkNotNull(zzgbVar);
            zzioVarZzr2.f40788OooO00o.zzaB().zzo(new oOOO0OOO(zzioVarZzr2, strZzl, urlZzE, zzgbVar));
        }
    }

    @WorkerThread
    public final void zzG(boolean z) {
        zzaB().zzg();
        this.f15541OooOooO = z;
    }

    @WorkerThread
    public final boolean zzI() {
        return this.f15538OooOoOO != null && this.f15538OooOoOO.booleanValue();
    }

    @WorkerThread
    public final boolean zzJ() {
        return zza() == 0;
    }

    @WorkerThread
    public final boolean zzK() {
        zzaB().zzg();
        return this.f15541OooOooO;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.f15514OooO0O0);
    }

    @Pure
    public final boolean zzN() {
        return this.f15518OooO0o0;
    }

    @WorkerThread
    public final int zza() {
        zzaB().zzg();
        if (this.f15519OooO0oO.zzv()) {
            return 1;
        }
        Boolean bool = this.f15539OooOoo;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaB().zzg();
        if (!this.f15541OooOooO) {
            return 8;
        }
        Boolean boolOooO0o = zzm().OooO0o();
        if (boolOooO0o != null) {
            return boolOooO0o.booleanValue() ? 0 : 3;
        }
        zzag zzagVar = this.f15519OooO0oO;
        zzab zzabVar = zzagVar.f40788OooO00o.f15517OooO0o;
        Boolean boolOooO0OO = zzagVar.OooO0OO("firebase_analytics_collection_enabled");
        if (boolOooO0OO != null) {
            return boolOooO0OO.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f15540OooOoo0;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f15538OooOoOO == null || this.f15538OooOoOO.booleanValue()) ? 0 : 7;
    }

    @Override // p271o00ooooo.oOO00000
    @Pure
    public final zzet zzaA() {
        zzet zzetVar = this.f15512OooO;
        OooO0OO(zzetVar);
        return zzetVar;
    }

    @Override // p271o00ooooo.oOO00000
    @Pure
    public final zzga zzaB() {
        zzga zzgaVar = this.f15521OooOO0;
        OooO0OO(zzgaVar);
        return zzgaVar;
    }

    @Override // p271o00ooooo.oOO00000
    @Pure
    public final Context zzaw() {
        return this.f15513OooO00o;
    }

    @Override // p271o00ooooo.oOO00000
    @Pure
    public final Clock zzax() {
        return this.f15524OooOOO;
    }

    @Override // p271o00ooooo.oOO00000
    @Pure
    public final zzab zzay() {
        return this.f15517OooO0o;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.f15529OooOOo0;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.f15519OooO0oO;
    }

    @Pure
    public final zzao zzg() {
        OooO0OO(this.f15534OooOo0O);
        return this.f15534OooOo0O;
    }

    @Pure
    public final zzek zzh() {
        OooO0O0(this.f15535OooOo0o);
        return this.f15535OooOo0o;
    }

    @Pure
    public final zzem zzi() {
        OooO0O0(this.f15533OooOo00);
        return this.f15533OooOo00;
    }

    @Pure
    public final zzeo zzj() {
        return this.f15525OooOOO0;
    }

    public final zzet zzl() {
        zzet zzetVar = this.f15512OooO;
        if (zzetVar == null || !zzetVar.f40534OooO0O0) {
            return null;
        }
        return zzetVar;
    }

    @Pure
    public final oOo000Oo zzm() {
        oOo000Oo ooo000oo = this.f15520OooO0oo;
        if (ooo000oo != null) {
            return ooo000oo;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzik zzq() {
        zzik zzikVar = this.f15527OooOOOo;
        OooO0O0(zzikVar);
        return zzikVar;
    }

    @Pure
    public final zzio zzr() {
        zzio zzioVar = this.f15528OooOOo;
        OooO0OO(zzioVar);
        return zzioVar;
    }

    @Pure
    public final zziz zzs() {
        zziz zzizVar = this.f15526OooOOOO;
        OooO0O0(zzizVar);
        return zzizVar;
    }

    @Pure
    public final zzjz zzt() {
        OooO0O0(this.f15532OooOo0);
        return this.f15532OooOo0;
    }

    @Pure
    public final zzkp zzu() {
        zzkp zzkpVar = this.f15522OooOO0O;
        OooO0O0(zzkpVar);
        return zzkpVar;
    }

    @Pure
    public final zzlp zzv() {
        zzlp zzlpVar = this.f15523OooOO0o;
        if (zzlpVar != null) {
            return zzlpVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final String zzw() {
        return this.f15514OooO0O0;
    }

    @Pure
    public final String zzx() {
        return this.f15515OooO0OO;
    }

    @Pure
    public final String zzy() {
        return this.f15516OooO0Oo;
    }

    @Pure
    public final String zzz() {
        return this.f15530OooOOoo;
    }
}
