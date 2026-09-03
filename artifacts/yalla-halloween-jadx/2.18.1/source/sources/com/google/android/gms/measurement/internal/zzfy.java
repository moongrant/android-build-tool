package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzia;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import o0OO0OoO.OooO00o;
import o0OO0OoO.Oooo0;
import o0OO0OoO.o0000Ooo;
import o0OO0OoO.o000O0O0;
import o0OO0OoO.o000OO00;
import o0OO0OoO.o000OO0O;
import o0OO0OoO.o00O;
import o0OO0OoO.o0O0O00;
import o0OO0OoO.o0OoOo0;
import o0OO0OoO.oo0o0Oo;
import o0OO0OoO.oo0oOO0;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy implements o000O0O0 {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static volatile zzfy f16191Oooo00o;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final zzeo f16192OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f16193OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f16194OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f16195OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f16196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final zzab f16197OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f16198OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzag f16199OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0O0O00 f16200OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final zzfv f16201OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final zzki f16202OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final zzlh f16203OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Clock f16204OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final zzej f16205OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final zzis f16206OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final zzid f16207OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final zzih f16208OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final zzd f16209OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final String f16210OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public zzjs f16212OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public zzeh f16213OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public zzaq f16214OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public zzef f16215OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f16216OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Boolean f16217OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile Boolean f16218OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @VisibleForTesting
    public Boolean f16219OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @VisibleForTesting
    public Boolean f16220OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public volatile boolean f16221OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f16222OooOooo;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @VisibleForTesting
    public final long f16224Oooo00O;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f16211OooOo = false;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final AtomicInteger f16223Oooo000 = new AtomicInteger(0);

    public zzfy(zzhb zzhbVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzhbVar);
        Context context = zzhbVar.f16229OooO00o;
        zzab zzabVar = new zzab();
        this.f16197OooO0o = zzabVar;
        o0OoOo0.f37858OooO00o = zzabVar;
        this.f16193OooO00o = context;
        this.f16194OooO0O0 = zzhbVar.f16230OooO0O0;
        this.f16195OooO0OO = zzhbVar.f16231OooO0OO;
        this.f16196OooO0Oo = zzhbVar.f16232OooO0Oo;
        this.f16198OooO0o0 = zzhbVar.f16236OooO0oo;
        this.f16218OooOoOO = zzhbVar.f16234OooO0o0;
        this.f16210OooOOoo = zzhbVar.f16237OooOO0;
        this.f16221OooOooO = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhbVar.f16235OooO0oO;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f16220OooOoo0 = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f16219OooOoo = (Boolean) obj2;
            }
        }
        zzia.zze(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.f16204OooOOO = defaultClock;
        Long l = zzhbVar.f16228OooO;
        this.f16224Oooo00O = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        this.f16199OooO0oO = new zzag(this);
        o0O0O00 o0o0o00 = new o0O0O00(this);
        o0o0o00.zzv();
        this.f16200OooO0oo = o0o0o00;
        zzeo zzeoVar = new zzeo(this);
        zzeoVar.zzv();
        this.f16192OooO = zzeoVar;
        zzlh zzlhVar = new zzlh(this);
        zzlhVar.zzv();
        this.f16203OooOO0o = zzlhVar;
        this.f16205OooOOO0 = new zzej(new o000OO00(this));
        this.f16209OooOOo0 = new zzd(this);
        zzis zzisVar = new zzis(this);
        zzisVar.zzb();
        this.f16206OooOOOO = zzisVar;
        zzid zzidVar = new zzid(this);
        zzidVar.zzb();
        this.f16207OooOOOo = zzidVar;
        zzki zzkiVar = new zzki(this);
        zzkiVar.zzb();
        this.f16202OooOO0O = zzkiVar;
        zzih zzihVar = new zzih(this);
        zzihVar.zzv();
        this.f16208OooOOo = zzihVar;
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzv();
        this.f16201OooOO0 = zzfvVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhbVar.f16235OooO0oO;
        boolean z = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzid zzidVarZzq = zzq();
            if (zzidVarZzq.f37615OooO00o.f16193OooO00o.getApplicationContext() instanceof Application) {
                Application application = (Application) zzidVarZzq.f37615OooO00o.f16193OooO00o.getApplicationContext();
                if (zzidVarZzq.f16239OooO0OO == null) {
                    zzidVarZzq.f16239OooO0OO = new oo0oOO0(zzidVarZzq);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzidVarZzq.f16239OooO0OO);
                    application.registerActivityLifecycleCallbacks(zzidVarZzq.f16239OooO0OO);
                    Oooo0.OooO00o(zzidVarZzq.f37615OooO00o, "Registered activity lifecycle callback");
                }
            }
        } else {
            OooO00o.OooO0O0(this, "Application context is not an Application");
        }
        zzfvVar.zzp(new o0000Ooo(this, zzhbVar));
    }

    public static final void OooO0OO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void OooO0Oo(oo0o0Oo oo0o0oo) {
        if (oo0o0oo == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!oo0o0oo.f37902OooO0O0) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(oo0o0oo.getClass())));
        }
    }

    public static final void OooO0o0(o000OO0O o000oo0o2) {
        if (o000oo0o2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!o000oo0o2.OooO0Oo()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(o000oo0o2.getClass())));
        }
    }

    public static zzfy zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f16191Oooo00o == null) {
            synchronized (zzfy.class) {
                if (f16191Oooo00o == null) {
                    f16191Oooo00o = new zzfy(new zzhb(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(f16191Oooo00o);
            f16191Oooo00o.f16218OooOoOO = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f16191Oooo00o);
        return f16191Oooo00o;
    }

    public final void OooO00o() {
        this.f16223Oooo000.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    @WorkerThread
    public final boolean OooO0O0() {
        boolean z;
        if (!this.f16211OooOo) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzaz().zzg();
        Boolean bool = this.f16217OooOoO0;
        if (bool == null || this.f16216OooOoO == 0 || (!bool.booleanValue() && Math.abs(this.f16204OooOOO.elapsedRealtime() - this.f16216OooOoO) > 1000)) {
            this.f16216OooOoO = this.f16204OooOOO.elapsedRealtime();
            Boolean boolValueOf = Boolean.valueOf(zzv().OooOo("android.permission.INTERNET") && zzv().OooOo("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.f16193OooO00o).isCallerInstantApp() || this.f16199OooO0oO.OooO0o0() || (zzlh.OooOooO(this.f16193OooO00o) && zzlh.OooOooo(this.f16193OooO00o))));
            this.f16217OooOoO0 = boolValueOf;
            if (boolValueOf.booleanValue()) {
                zzlh zzlhVarZzv = zzv();
                String strZzm = zzh().zzm();
                zzef zzefVarZzh = zzh();
                zzefVarZzh.zza();
                if (!zzlhVarZzv.OooOOo0(strZzm, zzefVarZzh.f16119OooOOO0)) {
                    zzef zzefVarZzh2 = zzh();
                    zzefVarZzh2.zza();
                    z = TextUtils.isEmpty(zzefVarZzh2.f16119OooOOO0) ? false : true;
                }
                this.f16217OooOoO0 = Boolean.valueOf(z);
            }
        }
        return this.f16217OooOoO0.booleanValue();
    }

    @WorkerThread
    public final void zzE() {
        Pair pair;
        zzaz().zzg();
        OooO0o0(zzr());
        String strZzl = zzh().zzl();
        o0O0O00 o0o0o00Zzm = zzm();
        o0o0o00Zzm.zzg();
        long jElapsedRealtime = o0o0o00Zzm.f37615OooO00o.zzav().elapsedRealtime();
        String str = o0o0o00Zzm.f37768OooO0oO;
        if (str == null || jElapsedRealtime >= o0o0o00Zzm.f37763OooO) {
            o0o0o00Zzm.f37763OooO = o0o0o00Zzm.f37615OooO00o.zzf().zzi(strZzl, zzeb.zza) + jElapsedRealtime;
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(o0o0o00Zzm.f37615OooO00o.zzau());
                o0o0o00Zzm.f37768OooO0oO = "";
                String id = advertisingIdInfo.getId();
                if (id != null) {
                    o0o0o00Zzm.f37768OooO0oO = id;
                }
                o0o0o00Zzm.f37769OooO0oo = advertisingIdInfo.isLimitAdTrackingEnabled();
            } catch (Exception e) {
                o0o0o00Zzm.f37615OooO00o.zzay().zzc().zzb("Unable to get advertising id", e);
                o0o0o00Zzm.f37768OooO0oO = "";
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            pair = new Pair(o0o0o00Zzm.f37768OooO0oO, Boolean.valueOf(o0o0o00Zzm.f37769OooO0oo));
        } else {
            pair = new Pair(str, Boolean.valueOf(o0o0o00Zzm.f37769OooO0oo));
        }
        if (!this.f16199OooO0oO.zzr() || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
            zzay().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzih zzihVarZzr = zzr();
        zzihVarZzr.OooO0OO();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzihVarZzr.f37615OooO00o.f16193OooO00o.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            OooO00o.OooO0O0(this, "Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzlh zzlhVarZzv = zzv();
        zzh().f37615OooO00o.f16199OooO0oO.zzh();
        URL urlZzE = zzlhVarZzv.zzE(73000L, strZzl, (String) pair.first, zzm().f37777OooOOo.zza() - 1);
        if (urlZzE != null) {
            zzih zzihVarZzr2 = zzr();
            zzfw zzfwVar = new zzfw(this);
            zzihVarZzr2.zzg();
            zzihVarZzr2.OooO0OO();
            Preconditions.checkNotNull(urlZzE);
            Preconditions.checkNotNull(zzfwVar);
            zzihVarZzr2.f37615OooO00o.zzaz().zzo(new o00O(zzihVarZzr2, strZzl, urlZzE, zzfwVar));
        }
    }

    @WorkerThread
    public final void zzG(boolean z) {
        zzaz().zzg();
        this.f16221OooOooO = z;
    }

    @WorkerThread
    public final boolean zzI() {
        return this.f16218OooOoOO != null && this.f16218OooOoOO.booleanValue();
    }

    @WorkerThread
    public final boolean zzJ() {
        return zza() == 0;
    }

    @WorkerThread
    public final boolean zzK() {
        zzaz().zzg();
        return this.f16221OooOooO;
    }

    @Pure
    public final boolean zzL() {
        return TextUtils.isEmpty(this.f16194OooO0O0);
    }

    @Pure
    public final boolean zzN() {
        return this.f16198OooO0o0;
    }

    @WorkerThread
    public final int zza() {
        zzaz().zzg();
        if (this.f16199OooO0oO.zzv()) {
            return 1;
        }
        Boolean bool = this.f16219OooOoo;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaz().zzg();
        if (!this.f16221OooOooO) {
            return 8;
        }
        Boolean boolOooO0oO = zzm().OooO0oO();
        if (boolOooO0oO != null) {
            return boolOooO0oO.booleanValue() ? 0 : 3;
        }
        zzag zzagVar = this.f16199OooO0oO;
        zzab zzabVar = zzagVar.f37615OooO00o.f16197OooO0o;
        Boolean boolOooO0Oo = zzagVar.OooO0Oo("firebase_analytics_collection_enabled");
        if (boolOooO0Oo != null) {
            return boolOooO0Oo.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f16220OooOoo0;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.f16218OooOoOO == null || this.f16218OooOoOO.booleanValue()) ? 0 : 7;
    }

    @Override // o0OO0OoO.o000O0O0
    @Pure
    public final Context zzau() {
        return this.f16193OooO00o;
    }

    @Override // o0OO0OoO.o000O0O0
    @Pure
    public final Clock zzav() {
        return this.f16204OooOOO;
    }

    @Override // o0OO0OoO.o000O0O0
    @Pure
    public final zzab zzaw() {
        return this.f16197OooO0o;
    }

    @Override // o0OO0OoO.o000O0O0
    @Pure
    public final zzeo zzay() {
        OooO0o0(this.f16192OooO);
        return this.f16192OooO;
    }

    @Override // o0OO0OoO.o000O0O0
    @Pure
    public final zzfv zzaz() {
        OooO0o0(this.f16201OooOO0);
        return this.f16201OooOO0;
    }

    @Pure
    public final zzd zzd() {
        zzd zzdVar = this.f16209OooOOo0;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzag zzf() {
        return this.f16199OooO0oO;
    }

    @Pure
    public final zzaq zzg() {
        OooO0o0(this.f16214OooOo0O);
        return this.f16214OooOo0O;
    }

    @Pure
    public final zzef zzh() {
        OooO0Oo(this.f16215OooOo0o);
        return this.f16215OooOo0o;
    }

    @Pure
    public final zzeh zzi() {
        OooO0Oo(this.f16213OooOo00);
        return this.f16213OooOo00;
    }

    @Pure
    public final zzej zzj() {
        return this.f16205OooOOO0;
    }

    public final zzeo zzl() {
        zzeo zzeoVar = this.f16192OooO;
        if (zzeoVar == null || !zzeoVar.OooO0Oo()) {
            return null;
        }
        return zzeoVar;
    }

    @Pure
    public final o0O0O00 zzm() {
        o0O0O00 o0o0o00 = this.f16200OooO0oo;
        if (o0o0o00 != null) {
            return o0o0o00;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final zzid zzq() {
        OooO0Oo(this.f16207OooOOOo);
        return this.f16207OooOOOo;
    }

    @Pure
    public final zzih zzr() {
        OooO0o0(this.f16208OooOOo);
        return this.f16208OooOOo;
    }

    @Pure
    public final zzis zzs() {
        OooO0Oo(this.f16206OooOOOO);
        return this.f16206OooOOOO;
    }

    @Pure
    public final zzjs zzt() {
        OooO0Oo(this.f16212OooOo0);
        return this.f16212OooOo0;
    }

    @Pure
    public final zzki zzu() {
        OooO0Oo(this.f16202OooOO0O);
        return this.f16202OooOO0O;
    }

    @Pure
    public final zzlh zzv() {
        zzlh zzlhVar = this.f16203OooOO0o;
        if (zzlhVar != null) {
            return zzlhVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final String zzw() {
        return this.f16194OooO0O0;
    }

    @Pure
    public final String zzx() {
        return this.f16195OooO0OO;
    }

    @Pure
    public final String zzy() {
        return this.f16196OooO0Oo;
    }

    @Pure
    public final String zzz() {
        return this.f16210OooOOoo;
    }
}
