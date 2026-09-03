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
import com.android.billingclient.api.o000;
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
import p269o00ooooo.o0OO0oO0;
import p269o00ooooo.o0OOO0;
import p269o00ooooo.oO000Oo;
import p269o00ooooo.oO000o00;
import p269o00ooooo.oO00O0o0;
import p269o00ooooo.oO0O00;
import p269o00ooooo.oO0O000o;
import p269o00ooooo.ooo0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgd implements oO000o00 {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static volatile zzgd f15987Oooo00o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final zzet f15988OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15989OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15990OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f15991OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f15992OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzab f15993OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f15994OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzag f15995OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0OOO0 f15996OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final zzga f15997OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final zzkp f15998OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final zzlp f15999OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Clock f16000OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final zzeo f16001OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final zziz f16002OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final zzik f16003OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final zzio f16004OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final zzd f16005OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final String f16006OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public zzjz f16008OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public zzem f16009OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public zzao f16010OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public zzek f16011OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f16012OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Boolean f16013OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile Boolean f16014OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @VisibleForTesting
    public final Boolean f16015OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @VisibleForTesting
    public final Boolean f16016OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile boolean f16017OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f16018OooOooo;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @VisibleForTesting
    public final long f16020Oooo00O;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f16007OooOo = false;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final AtomicInteger f16019Oooo000 = new AtomicInteger(0);

    public zzgd(zzhi zzhiVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzhiVar);
        Context context = zzhiVar.f16027OooO00o;
        zzab zzabVar = new zzab();
        this.f15993OooO0o = zzabVar;
        o000.f9684OooO00o = zzabVar;
        this.f15989OooO00o = context;
        this.f15990OooO0O0 = zzhiVar.f16028OooO0O0;
        this.f15991OooO0OO = zzhiVar.f16029OooO0OO;
        this.f15992OooO0Oo = zzhiVar.f16030OooO0Oo;
        this.f15994OooO0o0 = zzhiVar.f16034OooO0oo;
        this.f16014OooOoOO = zzhiVar.f16032OooO0o0;
        this.f16006OooOOoo = zzhiVar.f16035OooOO0;
        this.f16017OooOooO = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhiVar.f16033OooO0oO;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f16016OooOoo0 = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f16015OooOoo = (Boolean) obj2;
            }
        }
        zzib.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.f16000OooOOO = defaultClock;
        Long l = zzhiVar.f16026OooO;
        this.f16020Oooo00O = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        this.f15995OooO0oO = new zzag(this);
        o0OOO0 o0ooo1 = new o0OOO0(this);
        o0ooo1.zzw();
        this.f15996OooO0oo = o0ooo1;
        zzet zzetVar = new zzet(this);
        zzetVar.zzw();
        this.f15988OooO = zzetVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzw();
        this.f15999OooOO0o = zzlpVar;
        this.f16001OooOOO0 = new zzeo(new oO00O0o0(this));
        this.f16005OooOOo0 = new zzd(this);
        zziz zzizVar = new zziz(this);
        zzizVar.zzb();
        this.f16002OooOOOO = zzizVar;
        zzik zzikVar = new zzik(this);
        zzikVar.zzb();
        this.f16003OooOOOo = zzikVar;
        zzkp zzkpVar = new zzkp(this);
        zzkpVar.zzb();
        this.f15998OooOO0O = zzkpVar;
        zzio zzioVar = new zzio(this);
        zzioVar.zzw();
        this.f16004OooOOo = zzioVar;
        zzga zzgaVar = new zzga(this);
        zzgaVar.zzw();
        this.f15997OooOO0 = zzgaVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhiVar.f16033OooO0oO;
        boolean z = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzik zzikVarZzq = zzq();
            if (zzikVarZzq.f41276OooO00o.f15989OooO00o.getApplicationContext() instanceof Application) {
                Application application = (Application) zzikVarZzq.f41276OooO00o.f15989OooO00o.getApplicationContext();
                if (zzikVarZzq.f16037OooO0OO == null) {
                    zzikVarZzq.f16037OooO0OO = new oO0O000o(zzikVarZzq);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzikVarZzq.f16037OooO0OO);
                    application.registerActivityLifecycleCallbacks(zzikVarZzq.f16037OooO0OO);
                    zzikVarZzq.f41276OooO00o.zzaA().zzj().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzaA().zzk().zza("Application context is not an Application");
        }
        zzgaVar.zzp(new ooo0Oo0(this, zzhiVar));
    }

    public static final void OooO0O0(o0OO0oO0 o0oo0oo1) {
        if (o0oo0oo1 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!o0oo0oo1.f41206OooO0O0) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(o0oo0oo1.getClass())));
        }
    }

    public static final void OooO0OO(oO000Oo oo000oo) {
        if (oo000oo == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!oo000oo.f41275OooO0O0) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(oo000oo.getClass())));
        }
    }

    public static zzgd zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f15987Oooo00o == null) {
            synchronized (zzgd.class) {
                if (f15987Oooo00o == null) {
                    f15987Oooo00o = new zzgd(new zzhi(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f15987Oooo00o);
            f15987Oooo00o.f16014OooOoOO = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f15987Oooo00o);
        return f15987Oooo00o;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    @WorkerThread
    public final boolean OooO00o() {
        boolean z;
        if (!this.f16007OooOo) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzaB().zzg();
        Boolean bool = this.f16013OooOoO0;
        Clock clock = this.f16000OooOOO;
        if (bool == null || this.f16012OooOoO == 0 || (!bool.booleanValue() && Math.abs(clock.elapsedRealtime() - this.f16012OooOoO) > 1000)) {
            this.f16012OooOoO = clock.elapsedRealtime();
            boolean z2 = true;
            if (zzv().OooOo("android.permission.INTERNET") && zzv().OooOo("android.permission.ACCESS_NETWORK_STATE")) {
                Context context = this.f15989OooO00o;
                if (Wrappers.packageManager(context).isCallerInstantApp() || this.f15995OooO0oO.OooO0Oo() || (zzlp.OooOoo(context) && zzlp.OooOooO(context))) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            this.f16013OooOoO0 = boolValueOf;
            if (boolValueOf.booleanValue()) {
                zzlp zzlpVarZzv = zzv();
                String strZzm = zzh().zzm();
                zzek zzekVarZzh = zzh();
                zzekVarZzh.zza();
                if (!zzlpVarZzv.OooOOo0(strZzm, zzekVarZzh.f15915OooOOO0)) {
                    zzek zzekVarZzh2 = zzh();
                    zzekVarZzh2.zza();
                    if (TextUtils.isEmpty(zzekVarZzh2.f15915OooOOO0)) {
                        z2 = false;
                    }
                }
                this.f16013OooOoO0 = Boolean.valueOf(z2);
            }
        }
        return this.f16013OooOoO0.booleanValue();
    }

    @WorkerThread
    public final void zzE() {
        Pair pair;
        Pair pair2;
        zzaB().zzg();
        OooO0OO(zzr());
        String strZzl = zzh().zzl();
        o0OOO0 o0ooo0Zzm = zzm();
        o0ooo0Zzm.zzg();
        zzov.zzc();
        zzgd zzgdVar = o0ooo0Zzm.f41276OooO00o;
        NetworkInfo activeNetworkInfo = null;
        if (!zzgdVar.zzf().zzs(null, zzeg.zzaI) || o0ooo0Zzm.OooO0o0().zzj(zzha.AD_STORAGE)) {
            long jElapsedRealtime = zzgdVar.zzax().elapsedRealtime();
            String str = o0ooo0Zzm.f41213OooO0oO;
            if (str == null || jElapsedRealtime >= o0ooo0Zzm.f41208OooO) {
                o0ooo0Zzm.f41208OooO = zzgdVar.zzf().zzi(strZzl, zzeg.zza) + jElapsedRealtime;
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzgdVar.zzaw());
                    o0ooo0Zzm.f41213OooO0oO = "";
                    String id = advertisingIdInfo.getId();
                    if (id != null) {
                        o0ooo0Zzm.f41213OooO0oO = id;
                    }
                    o0ooo0Zzm.f41214OooO0oo = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (Exception e) {
                    zzgdVar.zzaA().zzc().zzb("Unable to get advertising id", e);
                    o0ooo0Zzm.f41213OooO0oO = "";
                }
                AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
                pair = new Pair(o0ooo0Zzm.f41213OooO0oO, Boolean.valueOf(o0ooo0Zzm.f41214OooO0oo));
            } else {
                pair = new Pair(str, Boolean.valueOf(o0ooo0Zzm.f41214OooO0oo));
            }
            pair2 = pair;
        } else {
            pair2 = new Pair("", Boolean.FALSE);
        }
        if (!this.f15995OooO0oO.zzr() || ((Boolean) pair2.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair2.first)) {
            zzaA().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzio zzioVarZzr = zzr();
        zzioVarZzr.OooO0OO();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzioVarZzr.f41276OooO00o.f15989OooO00o.getSystemService("connectivity");
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
        zzh().f41276OooO00o.f15995OooO0oO.zzh();
        URL urlZzE = zzlpVarZzv.zzE(79000L, strZzl, (String) pair2.first, zzm().f41224OooOOoo.zza() - 1);
        if (urlZzE != null) {
            zzio zzioVarZzr2 = zzr();
            zzgb zzgbVar = new zzgb(this);
            zzioVarZzr2.zzg();
            zzioVarZzr2.OooO0OO();
            Preconditions.checkNotNull(urlZzE);
            Preconditions.checkNotNull(zzgbVar);
            zzioVarZzr2.f41276OooO00o.zzaB().zzo(new oO0O00(zzioVarZzr2, strZzl, urlZzE, zzgbVar));
        }
    }

    @WorkerThread
    public final void zzG(boolean z) {
        zzaB().zzg();
        this.f16017OooOooO = z;
    }

    @WorkerThread
    public final boolean zzI() {
        return this.f16014OooOoOO != null && this.f16014OooOoOO.booleanValue();
    }

    @WorkerThread
    public final boolean zzJ() {
        return zza() == 0;
    }

    @WorkerThread
    public final boolean zzK() {
        zzaB().zzg();
        return this.f16017OooOooO;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.f15990OooO0O0);
    }

    @Pure
    public final boolean zzN() {
        return this.f15994OooO0o0;
    }

    @WorkerThread
    public final int zza() {
        zzaB().zzg();
        if (this.f15995OooO0oO.zzv()) {
            return 1;
        }
        Boolean bool = this.f16015OooOoo;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaB().zzg();
        if (!this.f16017OooOooO) {
            return 8;
        }
        Boolean boolOooO0o = zzm().OooO0o();
        if (boolOooO0o != null) {
            return boolOooO0o.booleanValue() ? 0 : 3;
        }
        zzag zzagVar = this.f15995OooO0oO;
        zzab zzabVar = zzagVar.f41276OooO00o.f15993OooO0o;
        Boolean boolOooO0OO = zzagVar.OooO0OO("firebase_analytics_collection_enabled");
        if (boolOooO0OO != null) {
            return boolOooO0OO.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f16016OooOoo0;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f16014OooOoOO == null || this.f16014OooOoOO.booleanValue()) ? 0 : 7;
    }

    @Override // p269o00ooooo.oO000o00
    @Pure
    public final zzet zzaA() {
        zzet zzetVar = this.f15988OooO;
        OooO0OO(zzetVar);
        return zzetVar;
    }

    @Override // p269o00ooooo.oO000o00
    @Pure
    public final zzga zzaB() {
        zzga zzgaVar = this.f15997OooOO0;
        OooO0OO(zzgaVar);
        return zzgaVar;
    }

    @Override // p269o00ooooo.oO000o00
    @Pure
    public final Context zzaw() {
        return this.f15989OooO00o;
    }

    @Override // p269o00ooooo.oO000o00
    @Pure
    public final Clock zzax() {
        return this.f16000OooOOO;
    }

    @Override // p269o00ooooo.oO000o00
    @Pure
    public final zzab zzay() {
        return this.f15993OooO0o;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.f16005OooOOo0;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.f15995OooO0oO;
    }

    @Pure
    public final zzao zzg() {
        OooO0OO(this.f16010OooOo0O);
        return this.f16010OooOo0O;
    }

    @Pure
    public final zzek zzh() {
        OooO0O0(this.f16011OooOo0o);
        return this.f16011OooOo0o;
    }

    @Pure
    public final zzem zzi() {
        OooO0O0(this.f16009OooOo00);
        return this.f16009OooOo00;
    }

    @Pure
    public final zzeo zzj() {
        return this.f16001OooOOO0;
    }

    public final zzet zzl() {
        zzet zzetVar = this.f15988OooO;
        if (zzetVar == null || !zzetVar.f41275OooO0O0) {
            return null;
        }
        return zzetVar;
    }

    @Pure
    public final o0OOO0 zzm() {
        o0OOO0 o0ooo1 = this.f15996OooO0oo;
        if (o0ooo1 != null) {
            return o0ooo1;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzik zzq() {
        zzik zzikVar = this.f16003OooOOOo;
        OooO0O0(zzikVar);
        return zzikVar;
    }

    @Pure
    public final zzio zzr() {
        zzio zzioVar = this.f16004OooOOo;
        OooO0OO(zzioVar);
        return zzioVar;
    }

    @Pure
    public final zziz zzs() {
        zziz zzizVar = this.f16002OooOOOO;
        OooO0O0(zzizVar);
        return zzizVar;
    }

    @Pure
    public final zzjz zzt() {
        OooO0O0(this.f16008OooOo0);
        return this.f16008OooOo0;
    }

    @Pure
    public final zzkp zzu() {
        zzkp zzkpVar = this.f15998OooOO0O;
        OooO0O0(zzkpVar);
        return zzkpVar;
    }

    @Pure
    public final zzlp zzv() {
        zzlp zzlpVar = this.f15999OooOO0o;
        if (zzlpVar != null) {
            return zzlpVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final String zzw() {
        return this.f15990OooO0O0;
    }

    @Pure
    public final String zzx() {
        return this.f15991OooO0OO;
    }

    @Pure
    public final String zzy() {
        return this.f15992OooO0Oo;
    }

    @Pure
    public final String zzz() {
        return this.f16006OooOOoo;
    }
}
