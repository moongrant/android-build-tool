package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import o000O0.o0000OO0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p190o00o0O.OooO;
import p272o00ooooo.O0O0;
import p272o00ooooo.a1;
import p272o00ooooo.oOO00O0;
import p272o00ooooo.oOO0OO;
import p272o00ooooo.oOO0OOO;
import p272o00ooooo.oOO0Oo00;
import p272o00ooooo.oOOO0O0o;
import p272o00ooooo.oOOO0OOO;
import p272o00ooooo.p0;
import p272o00ooooo.x;
import p272o00ooooo.x0;
import p272o00ooooo.y0;
import p272o00ooooo.z0;

/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @VisibleForTesting
    public zzgd f15401OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("listenerMap")
    public final OooO f15402OooO0o0 = new OooO();

    public final void OooOo0(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        OooOo00();
        this.f15401OooO0Oo.zzv().zzW(zzcfVar, str);
    }

    @EnsuresNonNull({"scion"})
    public final void OooOo00() {
        if (this.f15401OooO0Oo == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzd().zzd(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzq().zzU(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzd().zze(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        long jZzq = this.f15401OooO0Oo.zzv().zzq();
        OooOo00();
        this.f15401OooO0Oo.zzv().zzV(zzcfVar, jZzq);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzaB().zzp(new oOO0Oo00(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        OooOo0(zzcfVar, this.f15401OooO0Oo.zzq().zzo());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzaB().zzp(new x0(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        OooOo0(zzcfVar, this.f15401OooO0Oo.zzq().zzp());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        OooOo0(zzcfVar, this.f15401OooO0Oo.zzq().zzq());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        String strZzc;
        OooOo00();
        zzik zzikVarZzq = this.f15401OooO0Oo.zzq();
        String strZzw = zzikVarZzq.f40527OooO00o.zzw();
        zzgd zzgdVar = zzikVarZzq.f40527OooO00o;
        if (strZzw != null) {
            strZzc = zzgdVar.zzw();
        } else {
            try {
                strZzc = zziq.zzc(zzgdVar.zzaw(), "google_app_id", zzgdVar.zzz());
            } catch (IllegalStateException e) {
                zzgdVar.zzaA().zzd().zzb("getGoogleAppId failed with exception", e);
                strZzc = null;
            }
        }
        OooOo0(zzcfVar, strZzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzq().zzh(str);
        OooOo00();
        this.f15401OooO0Oo.zzv().zzU(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        zzik zzikVarZzq = this.f15401OooO0Oo.zzq();
        zzikVarZzq.f40527OooO00o.zzaB().zzp(new oOO0OO(zzikVarZzq, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) throws RemoteException {
        OooOo00();
        if (i == 0) {
            this.f15401OooO0Oo.zzv().zzW(zzcfVar, this.f15401OooO0Oo.zzq().zzr());
            return;
        }
        if (i == 1) {
            this.f15401OooO0Oo.zzv().zzV(zzcfVar, this.f15401OooO0Oo.zzq().zzm().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f15401OooO0Oo.zzv().zzU(zzcfVar, this.f15401OooO0Oo.zzq().zzl().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.f15401OooO0Oo.zzv().zzQ(zzcfVar, this.f15401OooO0Oo.zzq().zzi().booleanValue());
                return;
            }
        }
        zzlp zzlpVarZzv = this.f15401OooO0Oo.zzv();
        double dDoubleValue = this.f15401OooO0Oo.zzq().zzj().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            zzlpVarZzv.f40527OooO00o.zzaA().zzk().zzb("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzaB().zzp(new x(this, zzcfVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(@NonNull Map map) throws RemoteException {
        OooOo00();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j) throws RemoteException {
        zzgd zzgdVar = this.f15401OooO0Oo;
        if (zzgdVar == null) {
            this.f15401OooO0Oo = zzgd.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzclVar, Long.valueOf(j));
        } else {
            zzgdVar.zzaA().zzk().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzaB().zzp(new y0(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzq().zzE(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOo00();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f15401OooO0Oo.zzaB().zzp(new O0O0(this, zzcfVar, new zzau(str2, new zzas(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzaA().OooO0oo(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j) throws RemoteException {
        OooOo00();
        oOOO0OOO oooo0ooo = this.f15401OooO0Oo.zzq().f15568OooO0OO;
        if (oooo0ooo != null) {
            this.f15401OooO0Oo.zzq().zzB();
            oooo0ooo.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOo00();
        oOOO0OOO oooo0ooo = this.f15401OooO0Oo.zzq().f15568OooO0OO;
        if (oooo0ooo != null) {
            this.f15401OooO0Oo.zzq().zzB();
            oooo0ooo.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOo00();
        oOOO0OOO oooo0ooo = this.f15401OooO0Oo.zzq().f15568OooO0OO;
        if (oooo0ooo != null) {
            this.f15401OooO0Oo.zzq().zzB();
            oooo0ooo.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOo00();
        oOOO0OOO oooo0ooo = this.f15401OooO0Oo.zzq().f15568OooO0OO;
        if (oooo0ooo != null) {
            this.f15401OooO0Oo.zzq().zzB();
            oooo0ooo.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOo00();
        oOOO0OOO oooo0ooo = this.f15401OooO0Oo.zzq().f15568OooO0OO;
        Bundle bundle = new Bundle();
        if (oooo0ooo != null) {
            this.f15401OooO0Oo.zzq().zzB();
            oooo0ooo.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f15401OooO0Oo.zzaA().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOo00();
        if (this.f15401OooO0Oo.zzq().f15568OooO0OO != null) {
            this.f15401OooO0Oo.zzq().zzB();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOo00();
        if (this.f15401OooO0Oo.zzq().f15568OooO0OO != null) {
            this.f15401OooO0Oo.zzq().zzB();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOo00();
        zzcfVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzhg a1Var;
        OooOo00();
        synchronized (this.f15402OooO0o0) {
            a1Var = (zzhg) this.f15402OooO0o0.getOrDefault(Integer.valueOf(zzciVar.zzd()), null);
            if (a1Var == null) {
                a1Var = new a1(this, zzciVar);
                this.f15402OooO0o0.put(Integer.valueOf(zzciVar.zzd()), a1Var);
            }
        }
        this.f15401OooO0Oo.zzq().zzJ(a1Var);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzq().zzK(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        OooOo00();
        if (bundle == null) {
            o0000OO0.OooO0O0(this.f15401OooO0Oo, "Conditional user property must not be null");
        } else {
            this.f15401OooO0Oo.zzq().zzQ(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(@NonNull final Bundle bundle, final long j) throws RemoteException {
        OooOo00();
        final zzik zzikVarZzq = this.f15401OooO0Oo.zzq();
        zzikVarZzq.f40527OooO00o.zzaB().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhj
            @Override // java.lang.Runnable
            public final void run() {
                zzik zzikVar = zzikVarZzq;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(zzikVar.f40527OooO00o.zzh().zzm())) {
                    zzikVar.zzS(bundle2, 0, j2);
                } else {
                    zzikVar.f40527OooO00o.zzaA().zzl().zza("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzq().zzS(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        OooOo00();
        zzik zzikVarZzq = this.f15401OooO0Oo.zzq();
        zzikVarZzq.zza();
        zzikVarZzq.f40527OooO00o.zzaB().zzp(new oOOO0O0o(zzikVarZzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        OooOo00();
        final zzik zzikVarZzq = this.f15401OooO0Oo.zzq();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzikVarZzq.f40527OooO00o.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhk
            @Override // java.lang.Runnable
            public final void run() {
                oOO0OOO ooo0ooo;
                zzik zzikVar = zzikVarZzq;
                Bundle bundle3 = bundle2;
                zzgd zzgdVar = zzikVar.f40527OooO00o;
                if (bundle3 == null) {
                    zzgdVar.zzm().f40752OooOo0o.zzb(new Bundle());
                    return;
                }
                Bundle bundleZza = zzgdVar.zzm().f40752OooOo0o.zza();
                Iterator<String> it = bundle3.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ooo0ooo = zzikVar.f15577OooOOO;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    Object obj = bundle3.get(next);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        zzgdVar.zzv().getClass();
                        if (zzlp.OooOoO0(obj)) {
                            zzgdVar.zzv().getClass();
                            zzlp.OooOOO(ooo0ooo, null, 27, null, null, 0);
                        }
                        zzgdVar.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", next, obj);
                    } else if (zzlp.OooOoOO(next)) {
                        zzgdVar.zzaA().zzl().zzb("Invalid default event parameter name. Name", next);
                    } else if (obj == null) {
                        bundleZza.remove(next);
                    } else {
                        zzlp zzlpVarZzv = zzgdVar.zzv();
                        zzgdVar.zzf();
                        if (zzlpVarZzv.OooOo0("param", next, 100, obj)) {
                            zzgdVar.zzv().OooOOOO(bundleZza, next, obj);
                        }
                    }
                }
                zzgdVar.zzv();
                int iZzc = zzgdVar.zzf().zzc();
                if (bundleZza.size() > iZzc) {
                    int i = 0;
                    for (String str : new TreeSet(bundleZza.keySet())) {
                        i++;
                        if (i > iZzc) {
                            bundleZza.remove(str);
                        }
                    }
                    zzgdVar.zzv().getClass();
                    zzlp.OooOOO(ooo0ooo, null, 26, null, null, 0);
                    zzgdVar.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                zzgdVar.zzm().f40752OooOo0o.zzb(bundleZza);
                zzgdVar.zzt().zzH(bundleZza);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        OooOo00();
        z0 z0Var = new z0(this, zzciVar);
        if (this.f15401OooO0Oo.zzaB().zzs()) {
            this.f15401OooO0Oo.zzq().zzT(z0Var);
        } else {
            this.f15401OooO0Oo.zzaB().zzp(new p0(this, z0Var));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) throws RemoteException {
        OooOo00();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzq().zzU(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j) throws RemoteException {
        OooOo00();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        OooOo00();
        zzik zzikVarZzq = this.f15401OooO0Oo.zzq();
        zzikVarZzq.f40527OooO00o.zzaB().zzp(new oOO00O0(zzikVarZzq, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(@NonNull final String str, long j) throws RemoteException {
        OooOo00();
        final zzik zzikVarZzq = this.f15401OooO0Oo.zzq();
        if (str != null && TextUtils.isEmpty(str)) {
            zzikVarZzq.f40527OooO00o.zzaA().zzk().zza("User ID must be non-empty or null");
        } else {
            zzikVarZzq.f40527OooO00o.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhl
                @Override // java.lang.Runnable
                public final void run() {
                    zzik zzikVar = zzikVarZzq;
                    String str2 = str;
                    zzek zzekVarZzh = zzikVar.f40527OooO00o.zzh();
                    String str3 = zzekVarZzh.f15448OooOOOo;
                    boolean z = (str3 == null || str3.equals(str2)) ? false : true;
                    zzekVarZzh.f15448OooOOOo = str2;
                    if (z) {
                        zzikVar.f40527OooO00o.zzh().OooO0OO();
                    }
                }
            });
            zzikVarZzq.zzX(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        OooOo00();
        this.f15401OooO0Oo.zzq().zzX(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzhg a1Var;
        OooOo00();
        synchronized (this.f15402OooO0o0) {
            a1Var = (zzhg) this.f15402OooO0o0.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (a1Var == null) {
            a1Var = new a1(this, zzciVar);
        }
        this.f15401OooO0Oo.zzq().zzZ(a1Var);
    }
}
