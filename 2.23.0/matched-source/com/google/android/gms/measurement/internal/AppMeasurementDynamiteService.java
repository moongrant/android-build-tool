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
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p188o00o0O.OooOO0;
import p269o00ooooo.Oo0000;
import p269o00ooooo.a;
import p269o00ooooo.b;
import p269o00ooooo.c;
import p269o00ooooo.o0O0OO0;
import p269o00ooooo.oO0;
import p269o00ooooo.oO00o00;
import p269o00ooooo.oO00o00O;
import p269o00ooooo.oO0O000o;
import p269o00ooooo.oO0OOO00;
import p269o00ooooo.oOO0O0O0;
import p269o00ooooo.oOOo0000;
import p269o00ooooo.oOo00OO0;
import p269o00ooooo.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @VisibleForTesting
    public zzgd f15870OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("listenerMap")
    public final OooOO0 f15871OooO0o0 = new OooOO0();

    @EnsuresNonNull({"scion"})
    public final void OooOOoo() {
        if (this.f15870OooO0Oo == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void OooOo00(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        OooOOoo();
        this.f15870OooO0Oo.zzv().zzW(zzcfVar, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzd().zzd(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzq().zzU(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzd().zze(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        long jZzq = this.f15870OooO0Oo.zzv().zzq();
        OooOOoo();
        this.f15870OooO0Oo.zzv().zzV(zzcfVar, jZzq);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzaB().zzp(new oO00o00O(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        OooOo00(zzcfVar, this.f15870OooO0Oo.zzq().zzo());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzaB().zzp(new Oo0000(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        OooOo00(zzcfVar, this.f15870OooO0Oo.zzq().zzp());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        OooOo00(zzcfVar, this.f15870OooO0Oo.zzq().zzq());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        String strZzc;
        OooOOoo();
        zzik zzikVarZzq = this.f15870OooO0Oo.zzq();
        String strZzw = zzikVarZzq.f41276OooO00o.zzw();
        zzgd zzgdVar = zzikVarZzq.f41276OooO00o;
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
        OooOo00(zzcfVar, strZzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzq().zzh(str);
        OooOOoo();
        this.f15870OooO0Oo.zzv().zzU(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getSessionId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        zzik zzikVarZzq = this.f15870OooO0Oo.zzq();
        zzikVarZzq.f41276OooO00o.zzaB().zzp(new oO00o00(zzikVarZzq, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) throws RemoteException {
        OooOOoo();
        if (i == 0) {
            this.f15870OooO0Oo.zzv().zzW(zzcfVar, this.f15870OooO0Oo.zzq().zzr());
            return;
        }
        if (i == 1) {
            this.f15870OooO0Oo.zzv().zzV(zzcfVar, this.f15870OooO0Oo.zzq().zzm().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f15870OooO0Oo.zzv().zzU(zzcfVar, this.f15870OooO0Oo.zzq().zzl().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.f15870OooO0Oo.zzv().zzQ(zzcfVar, this.f15870OooO0Oo.zzq().zzi().booleanValue());
                return;
            }
        }
        zzlp zzlpVarZzv = this.f15870OooO0Oo.zzv();
        double dDoubleValue = this.f15870OooO0Oo.zzq().zzj().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            zzlpVarZzv.f41276OooO00o.zzaA().zzk().zzb("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzaB().zzp(new oOO0O0O0(this, zzcfVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(@NonNull Map map) throws RemoteException {
        OooOOoo();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j) throws RemoteException {
        zzgd zzgdVar = this.f15870OooO0Oo;
        if (zzgdVar == null) {
            this.f15870OooO0Oo = zzgd.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzclVar, Long.valueOf(j));
        } else {
            zzgdVar.zzaA().zzk().zza("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzaB().zzp(new a(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzq().zzE(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOOoo();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f15870OooO0Oo.zzaB().zzp(new oOo0oooO(this, zzcfVar, new zzau(str2, new zzas(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzaA().OooO0oo(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j) throws RemoteException {
        OooOOoo();
        oO0O000o oo0o000o = this.f15870OooO0Oo.zzq().f16037OooO0OO;
        if (oo0o000o != null) {
            this.f15870OooO0Oo.zzq().zzB();
            oo0o000o.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOoo();
        oO0O000o oo0o000o = this.f15870OooO0Oo.zzq().f16037OooO0OO;
        if (oo0o000o != null) {
            this.f15870OooO0Oo.zzq().zzB();
            oo0o000o.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOoo();
        oO0O000o oo0o000o = this.f15870OooO0Oo.zzq().f16037OooO0OO;
        if (oo0o000o != null) {
            this.f15870OooO0Oo.zzq().zzB();
            oo0o000o.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOoo();
        oO0O000o oo0o000o = this.f15870OooO0Oo.zzq().f16037OooO0OO;
        if (oo0o000o != null) {
            this.f15870OooO0Oo.zzq().zzB();
            oo0o000o.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOOoo();
        oO0O000o oo0o000o = this.f15870OooO0Oo.zzq().f16037OooO0OO;
        Bundle bundle = new Bundle();
        if (oo0o000o != null) {
            this.f15870OooO0Oo.zzq().zzB();
            oo0o000o.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zze(bundle);
        } catch (RemoteException e) {
            this.f15870OooO0Oo.zzaA().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOoo();
        if (this.f15870OooO0Oo.zzq().f16037OooO0OO != null) {
            this.f15870OooO0Oo.zzq().zzB();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOoo();
        if (this.f15870OooO0Oo.zzq().f16037OooO0OO != null) {
            this.f15870OooO0Oo.zzq().zzB();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOOoo();
        zzcfVar.zze(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzhg cVar;
        OooOOoo();
        synchronized (this.f15871OooO0o0) {
            cVar = (zzhg) this.f15871OooO0o0.getOrDefault(Integer.valueOf(zzciVar.zzd()), null);
            if (cVar == null) {
                cVar = new c(this, zzciVar);
                this.f15871OooO0o0.put(Integer.valueOf(zzciVar.zzd()), cVar);
            }
        }
        this.f15870OooO0Oo.zzq().zzJ(cVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzq().zzK(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        OooOOoo();
        if (bundle == null) {
            o0O0OO0.OooO00o(this.f15870OooO0Oo, "Conditional user property must not be null");
        } else {
            this.f15870OooO0Oo.zzq().zzQ(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(@NonNull final Bundle bundle, final long j) throws RemoteException {
        OooOOoo();
        final zzik zzikVarZzq = this.f15870OooO0Oo.zzq();
        zzikVarZzq.f41276OooO00o.zzaB().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhj
            @Override // java.lang.Runnable
            public final void run() {
                zzik zzikVar = zzikVarZzq;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(zzikVar.f41276OooO00o.zzh().zzm())) {
                    zzikVar.zzS(bundle2, 0, j2);
                } else {
                    zzikVar.f41276OooO00o.zzaA().zzl().zza("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzq().zzS(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        OooOOoo();
        zzik zzikVarZzq = this.f15870OooO0Oo.zzq();
        zzikVarZzq.zza();
        zzikVarZzq.f41276OooO00o.zzaB().zzp(new oO0(zzikVarZzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        OooOOoo();
        final zzik zzikVarZzq = this.f15870OooO0Oo.zzq();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzikVarZzq.f41276OooO00o.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhk
            @Override // java.lang.Runnable
            public final void run() {
                oO0OOO00 oo0ooo00;
                zzik zzikVar = zzikVarZzq;
                Bundle bundle3 = bundle2;
                zzgd zzgdVar = zzikVar.f41276OooO00o;
                if (bundle3 == null) {
                    zzgdVar.zzm().f41228OooOo0o.zzb(new Bundle());
                    return;
                }
                Bundle bundleZza = zzgdVar.zzm().f41228OooOo0o.zza();
                Iterator<String> it = bundle3.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    oo0ooo00 = zzikVar.f16046OooOOO;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    Object obj = bundle3.get(next);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        zzgdVar.zzv().getClass();
                        if (zzlp.OooOoO0(obj)) {
                            zzgdVar.zzv().getClass();
                            zzlp.OooOOO(oo0ooo00, null, 27, null, null, 0);
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
                    zzlp.OooOOO(oo0ooo00, null, 26, null, null, 0);
                    zzgdVar.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                zzgdVar.zzm().f41228OooOo0o.zzb(bundleZza);
                zzgdVar.zzt().zzH(bundleZza);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        OooOOoo();
        b bVar = new b(this, zzciVar);
        if (this.f15870OooO0Oo.zzaB().zzs()) {
            this.f15870OooO0Oo.zzq().zzT(bVar);
        } else {
            this.f15870OooO0Oo.zzaB().zzp(new oOOo0000(this, bVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) throws RemoteException {
        OooOOoo();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzq().zzU(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j) throws RemoteException {
        OooOOoo();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        OooOOoo();
        zzik zzikVarZzq = this.f15870OooO0Oo.zzq();
        zzikVarZzq.f41276OooO00o.zzaB().zzp(new oOo00OO0(zzikVarZzq, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(@NonNull final String str, long j) throws RemoteException {
        OooOOoo();
        final zzik zzikVarZzq = this.f15870OooO0Oo.zzq();
        if (str != null && TextUtils.isEmpty(str)) {
            zzikVarZzq.f41276OooO00o.zzaA().zzk().zza("User ID must be non-empty or null");
        } else {
            zzikVarZzq.f41276OooO00o.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhl
                @Override // java.lang.Runnable
                public final void run() {
                    zzik zzikVar = zzikVarZzq;
                    String str2 = str;
                    zzek zzekVarZzh = zzikVar.f41276OooO00o.zzh();
                    String str3 = zzekVarZzh.f15917OooOOOo;
                    boolean z = (str3 == null || str3.equals(str2)) ? false : true;
                    zzekVarZzh.f15917OooOOOo = str2;
                    if (z) {
                        zzikVar.f41276OooO00o.zzh().OooO0OO();
                    }
                }
            });
            zzikVarZzq.zzX(null, "_id", str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        OooOOoo();
        this.f15870OooO0Oo.zzq().zzX(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzhg cVar;
        OooOOoo();
        synchronized (this.f15871OooO0o0) {
            cVar = (zzhg) this.f15871OooO0o0.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (cVar == null) {
            cVar = new c(this, zzciVar);
        }
        this.f15870OooO0Oo.zzq().zzZ(cVar);
    }
}
