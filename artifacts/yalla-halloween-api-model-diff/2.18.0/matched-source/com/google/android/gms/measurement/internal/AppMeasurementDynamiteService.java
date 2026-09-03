package com.google.android.gms.measurement.internal;

import Oooo000.o0000oo;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.umeng.analytics.pro.ao;
import java.util.Map;
import java.util.TreeSet;
import o0OO0OoO.OooO00o;
import o0OO0OoO.o000O00;
import o0OO0OoO.o000OO00;
import o0OO0OoO.o00O0OO0;
import o0OO0OoO.o00O0OOO;
import o0OO0OoO.o00Oo00;
import o0OO0OoO.o0O00OOO;
import o0OO0OoO.o0OO0;
import o0OO0OoO.o0OO000o;
import o0OO0OoO.o0OO00OO;
import o0OO0OoO.o0OO00o0;
import o0OO0OoO.oo0o0O0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcb {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public zzfy f16091OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("listenerMap")
    public final Oooo0 f16092OooO0O0 = new Oooo0();

    public final void OooOOo(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        OooOOo0();
        this.f16091OooO00o.zzv().zzV(zzcfVar, str);
    }

    @EnsuresNonNull({"scion"})
    public final void OooOOo0() {
        if (this.f16091OooO00o == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void beginAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzd().zzd(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzq().zzA(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void clearMeasurementEnabled(long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzq().zzU(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void endAdUnitExposure(@NonNull String str, long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzd().zze(str, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void generateEventId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        long jZzq = this.f16091OooO00o.zzv().zzq();
        OooOOo0();
        this.f16091OooO00o.zzv().zzU(zzcfVar, jZzq);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzaz().zzp(new oo0o0O0(this, zzcfVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        OooOOo(zzcfVar, this.f16091OooO00o.zzq().zzo());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzaz().zzp(new o0OO00OO(this, zzcfVar, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        OooOOo(zzcfVar, this.f16091OooO00o.zzq().zzp());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        OooOOo(zzcfVar, this.f16091OooO00o.zzq().zzq());
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        String strZzc;
        OooOOo0();
        zzid zzidVarZzq = this.f16091OooO00o.zzq();
        if (zzidVarZzq.f37591OooO00o.zzw() != null) {
            strZzc = zzidVarZzq.f37591OooO00o.zzw();
        } else {
            try {
                strZzc = zzij.zzc(zzidVarZzq.f37591OooO00o.zzau(), "google_app_id", zzidVarZzq.f37591OooO00o.zzz());
            } catch (IllegalStateException e) {
                zzidVarZzq.f37591OooO00o.zzay().zzd().zzb("getGoogleAppId failed with exception", e);
                strZzc = null;
            }
        }
        OooOOo(zzcfVar, strZzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzq().zzh(str);
        OooOOo0();
        this.f16091OooO00o.zzv().zzT(zzcfVar, 25);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i) throws RemoteException {
        OooOOo0();
        if (i == 0) {
            this.f16091OooO00o.zzv().zzV(zzcfVar, this.f16091OooO00o.zzq().zzr());
            return;
        }
        if (i == 1) {
            this.f16091OooO00o.zzv().zzU(zzcfVar, this.f16091OooO00o.zzq().zzm().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.f16091OooO00o.zzv().zzT(zzcfVar, this.f16091OooO00o.zzq().zzl().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.f16091OooO00o.zzv().zzP(zzcfVar, this.f16091OooO00o.zzq().zzi().booleanValue());
                return;
            }
        }
        zzlh zzlhVarZzv = this.f16091OooO00o.zzv();
        double dDoubleValue = this.f16091OooO00o.zzq().zzj().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            zzlhVarZzv.f37591OooO00o.zzay().zzk().zzb("Error returning double value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzaz().zzp(new o0O00OOO(this, zzcfVar, str, str2, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initForTests(@NonNull Map map) throws RemoteException {
        OooOOo0();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void initialize(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcl zzclVar, long j) throws RemoteException {
        zzfy zzfyVar = this.f16091OooO00o;
        if (zzfyVar == null) {
            this.f16091OooO00o = zzfy.zzp((Context) Preconditions.checkNotNull((Context) ObjectWrapper.unwrap(iObjectWrapper)), zzclVar, Long.valueOf(j));
        } else {
            OooO00o.OooO0O0(zzfyVar, "Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcf zzcfVar) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzaz().zzp(new o000O00(this, zzcfVar, 1));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzq().zzE(str, str2, bundle, z, z2, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOOo0();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f16091OooO00o.zzaz().zzp(new o00Oo00(this, zzcfVar, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void logHealthData(int i, @NonNull String str, @NonNull IObjectWrapper iObjectWrapper, @NonNull IObjectWrapper iObjectWrapper2, @NonNull IObjectWrapper iObjectWrapper3) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzay().OooO0oo(i, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityCreated(@NonNull IObjectWrapper iObjectWrapper, @NonNull Bundle bundle, long j) throws RemoteException {
        OooOOo0();
        o00O0OOO o00o0ooo2 = this.f16091OooO00o.zzq().f16257OooO0OO;
        if (o00o0ooo2 != null) {
            this.f16091OooO00o.zzq().zzB();
            o00o0ooo2.onActivityCreated((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityDestroyed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOo0();
        o00O0OOO o00o0ooo2 = this.f16091OooO00o.zzq().f16257OooO0OO;
        if (o00o0ooo2 != null) {
            this.f16091OooO00o.zzq().zzB();
            o00o0ooo2.onActivityDestroyed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityPaused(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOo0();
        o00O0OOO o00o0ooo2 = this.f16091OooO00o.zzq().f16257OooO0OO;
        if (o00o0ooo2 != null) {
            this.f16091OooO00o.zzq().zzB();
            o00o0ooo2.onActivityPaused((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityResumed(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOo0();
        o00O0OOO o00o0ooo2 = this.f16091OooO00o.zzq().f16257OooO0OO;
        if (o00o0ooo2 != null) {
            this.f16091OooO00o.zzq().zzB();
            o00o0ooo2.onActivityResumed((Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOOo0();
        o00O0OOO o00o0ooo2 = this.f16091OooO00o.zzq().f16257OooO0OO;
        Bundle bundle = new Bundle();
        if (o00o0ooo2 != null) {
            this.f16091OooO00o.zzq().zzB();
            o00o0ooo2.onActivitySaveInstanceState((Activity) ObjectWrapper.unwrap(iObjectWrapper), bundle);
        }
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e) {
            this.f16091OooO00o.zzay().zzk().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStarted(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOo0();
        if (this.f16091OooO00o.zzq().f16257OooO0OO != null) {
            this.f16091OooO00o.zzq().zzB();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void onActivityStopped(@NonNull IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        OooOOo0();
        if (this.f16091OooO00o.zzq().f16257OooO0OO != null) {
            this.f16091OooO00o.zzq().zzB();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcf zzcfVar, long j) throws RemoteException {
        OooOOo0();
        zzcfVar.zzd(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgz o0oo1;
        OooOOo0();
        synchronized (this.f16092OooO0O0) {
            o0oo1 = (zzgz) this.f16092OooO0O0.getOrDefault(Integer.valueOf(zzciVar.zzd()), null);
            if (o0oo1 == null) {
                o0oo1 = new o0OO0(this, zzciVar);
                this.f16092OooO0O0.put(Integer.valueOf(zzciVar.zzd()), o0oo1);
            }
        }
        this.f16091OooO00o.zzq().zzJ(o0oo1);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void resetAnalyticsData(long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzq().zzK(j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) throws RemoteException {
        OooOOo0();
        if (bundle == null) {
            o0000oo.OooO00o(this.f16091OooO00o, "Conditional user property must not be null");
        } else {
            this.f16091OooO00o.zzq().zzQ(bundle, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsent(@NonNull final Bundle bundle, final long j) throws RemoteException {
        OooOOo0();
        final zzid zzidVarZzq = this.f16091OooO00o.zzq();
        zzidVarZzq.f37591OooO00o.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhc
            @Override // java.lang.Runnable
            public final void run() {
                zzid zzidVar = zzidVarZzq;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(zzidVar.f37591OooO00o.zzh().zzm())) {
                    zzidVar.zzR(bundle2, 0, j2);
                } else {
                    zzidVar.f37591OooO00o.zzay().zzl().zza("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setConsentThirdParty(@NonNull Bundle bundle, long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzq().zzR(bundle, -20, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setCurrentScreen(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2, long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzs().zzw((Activity) ObjectWrapper.unwrap(iObjectWrapper), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        OooOOo0();
        zzid zzidVarZzq = this.f16091OooO00o.zzq();
        zzidVarZzq.zza();
        zzidVarZzq.f37591OooO00o.zzaz().zzp(new o00O0OO0(zzidVarZzq, z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        OooOOo0();
        final zzid zzidVarZzq = this.f16091OooO00o.zzq();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        zzidVarZzq.f37591OooO00o.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhd
            @Override // java.lang.Runnable
            public final void run() {
                zzid zzidVar = zzidVarZzq;
                Bundle bundle3 = bundle2;
                if (bundle3 == null) {
                    zzidVar.f37591OooO00o.zzm().f37922OooOo0O.zzb(new Bundle());
                    return;
                }
                Bundle bundleZza = zzidVar.f37591OooO00o.zzm().f37922OooOo0O.zza();
                for (String str : bundle3.keySet()) {
                    Object obj = bundle3.get(str);
                    if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                        if (zzidVar.f37591OooO00o.zzv().OooOoO(obj)) {
                            zzidVar.f37591OooO00o.zzv().OooOOO(zzidVar.f16269OooOOOo, null, 27, null, null, 0);
                        }
                        zzidVar.f37591OooO00o.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
                    } else if (zzlh.OooOoo0(str)) {
                        zzidVar.f37591OooO00o.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
                    } else if (obj == null) {
                        bundleZza.remove(str);
                    } else {
                        zzlh zzlhVarZzv = zzidVar.f37591OooO00o.zzv();
                        zzidVar.f37591OooO00o.zzf();
                        if (zzlhVarZzv.OooOo0("param", str, 100, obj)) {
                            zzidVar.f37591OooO00o.zzv().OooOOOO(bundleZza, str, obj);
                        }
                    }
                }
                zzidVar.f37591OooO00o.zzv();
                int iZzc = zzidVar.f37591OooO00o.zzf().zzc();
                if (bundleZza.size() > iZzc) {
                    int i = 0;
                    for (String str2 : new TreeSet(bundleZza.keySet())) {
                        i++;
                        if (i > iZzc) {
                            bundleZza.remove(str2);
                        }
                    }
                    zzidVar.f37591OooO00o.zzv().OooOOO(zzidVar.f16269OooOOOo, null, 26, null, null, 0);
                    zzidVar.f37591OooO00o.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
                }
                zzidVar.f37591OooO00o.zzm().f37922OooOo0O.zzb(bundleZza);
                zzidVar.f37591OooO00o.zzt().zzH(bundleZza);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        OooOOo0();
        o0OO00o0 o0oo00o1 = new o0OO00o0(this, zzciVar);
        if (this.f16091OooO00o.zzaz().zzs()) {
            this.f16091OooO00o.zzq().zzT(o0oo00o1);
        } else {
            this.f16091OooO00o.zzaz().zzp(new o0OO000o(this, o0oo00o1));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzck zzckVar) throws RemoteException {
        OooOOo0();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzq().zzU(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setMinimumSessionDuration(long j) throws RemoteException {
        OooOOo0();
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        OooOOo0();
        zzid zzidVarZzq = this.f16091OooO00o.zzq();
        zzidVarZzq.f37591OooO00o.zzaz().zzp(new o000OO00(zzidVarZzq, j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserId(@NonNull final String str, long j) throws RemoteException {
        OooOOo0();
        final zzid zzidVarZzq = this.f16091OooO00o.zzq();
        if (str != null && TextUtils.isEmpty(str)) {
            OooO00o.OooO0O0(zzidVarZzq.f37591OooO00o, "User ID must be non-empty or null");
        } else {
            zzidVarZzq.f37591OooO00o.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhe
                @Override // java.lang.Runnable
                public final void run() {
                    zzid zzidVar = zzidVarZzq;
                    String str2 = str;
                    zzef zzefVarZzh = zzidVar.f37591OooO00o.zzh();
                    String str3 = zzefVarZzh.f16139OooOOOo;
                    boolean z = false;
                    if (str3 != null && !str3.equals(str2)) {
                        z = true;
                    }
                    zzefVarZzh.f16139OooOOOo = str2;
                    if (z) {
                        zzidVar.f37591OooO00o.zzh().OooO0OO();
                    }
                }
            });
            zzidVarZzq.zzX(null, ao.d, str, true, j);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        OooOOo0();
        this.f16091OooO00o.zzq().zzX(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcc
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzci zzciVar) throws RemoteException {
        zzgz o0oo1;
        OooOOo0();
        synchronized (this.f16092OooO0O0) {
            o0oo1 = (zzgz) this.f16092OooO0O0.remove(Integer.valueOf(zzciVar.zzd()));
        }
        if (o0oo1 == null) {
            o0oo1 = new o0OO0(this, zzciVar);
        }
        this.f16091OooO00o.zzq().zzZ(o0oo1);
    }
}
