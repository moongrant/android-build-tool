package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzij;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p334o0OO00o.o00;
import p334o0OO00o.o000;
import p334o0OO00o.o0000;
import p334o0OO00o.o00000;
import p334o0OO00o.o000000;
import p334o0OO00o.o000000O;
import p334o0OO00o.o00000O;
import p334o0OO00o.o00000O0;
import p334o0OO00o.o00000OO;
import p334o0OO00o.o0000O;
import p334o0OO00o.o0000O0;
import p334o0OO00o.o0000O00;
import p334o0OO00o.o0000O0O;
import p334o0OO00o.o0000OO0;
import p334o0OO00o.o0000Ooo;
import p334o0OO00o.o0000oo;
import p334o0OO00o.o000O00;
import p334o0OO00o.o000O000;
import p334o0OO00o.o000O00O;
import p334o0OO00o.o000O0o;
import p334o0OO00o.o000OO;
import p334o0OO00o.o000OOo;
import p334o0OO00o.o000Oo0;
import p334o0OO00o.o000oOoO;
import p334o0OO00o.o00O0O;
import p334o0OO00o.o00Oo0;
import p334o0OO00o.o00Ooo;
import p334o0OO00o.o00oO0o;
import p334o0OO00o.o0O0O00;
import p334o0OO00o.o0OO00O;
import p334o0OO00o.o0OOO0o;
import p334o0OO00o.o0Oo0oo;
import p334o0OO00o.o0OoOo0;
import p334o0OO00o.o0ooOOo;
import p334o0OO00o.oo000o;
import p334o0OO00o.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzee {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static volatile zzee f15915OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Clock f15916OooO00o = DefaultClock.getInstance();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ExecutorService f15917OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AppMeasurementSdk f15918OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("listenerList")
    public final ArrayList f15919OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f15920OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f15921OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f15922OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile zzcc f15923OooO0oo;

    public zzee(Context context, String str, String str2, String str3, Bundle bundle) {
        zzbx.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o0000());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15917OooO0O0 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f15918OooO0OO = new AppMeasurementSdk(this);
        this.f15919OooO0Oo = new ArrayList();
        try {
            zzij.zzc(context, "google_app_id", com.google.android.gms.measurement.internal.zzfq.zza(context));
        } catch (IllegalStateException unused) {
        }
        this.f15922OooO0oO = "fa";
        if (str2 == null || str3 == null) {
            if ((str3 == null) ^ (str2 == null)) {
                Log.w("FA", "Specified origin or custom app id is null. Both parameters will be ignored.");
            }
        } else {
            Log.v("FA", "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
        }
        OooO0OO(new o0OO00O(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new o00(this));
        }
    }

    public static zzee zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f15915OooO == null) {
            synchronized (zzee.class) {
                if (f15915OooO == null) {
                    f15915OooO = new zzee(context, str, str2, str3, bundle);
                }
            }
        }
        return f15915OooO;
    }

    public final void OooO00o(Exception exc, boolean z, boolean z2) {
        this.f15920OooO0o |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzA(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final void OooO0O0(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        OooO0OO(new o000O000(this, l, str, str2, bundle, z, z2));
    }

    public final void OooO0OO(o000Oo0 o000oo1) {
        this.f15917OooO0O0.execute(o000oo1);
    }

    public final void zzA(int i, String str, Object obj, Object obj2, Object obj3) {
        OooO0OO(new o00000OO(this, str, obj));
    }

    public final void zzB(com.google.android.gms.measurement.internal.zzgz zzgzVar) {
        Preconditions.checkNotNull(zzgzVar);
        synchronized (this.f15919OooO0Oo) {
            for (int i = 0; i < this.f15919OooO0Oo.size(); i++) {
                if (zzgzVar.equals(((Pair) this.f15919OooO0Oo.get(i)).first)) {
                    Log.w("FA", "OnEventListener already registered.");
                    return;
                }
            }
            o000O00O o000o00o2 = new o000O00O(zzgzVar);
            this.f15919OooO0Oo.add(new Pair(zzgzVar, o000o00o2));
            if (this.f15923OooO0oo != null) {
                try {
                    this.f15923OooO0oo.registerOnMeasurementEventListener(o000o00o2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            OooO0OO(new o0000OO0(this, o000o00o2));
        }
    }

    public final void zzC() {
        OooO0OO(new o0OOO0o(this));
    }

    public final void zzD(Bundle bundle) {
        OooO0OO(new o000oOoO(this, bundle));
    }

    public final void zzE(Bundle bundle) {
        OooO0OO(new o00oO0o(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        OooO0OO(new o0ooOOo(this, bundle));
    }

    public final void zzG(Activity activity, String str, String str2) {
        OooO0OO(new o00Ooo(this, activity, str, str2));
    }

    public final void zzH(boolean z) {
        OooO0OO(new o0000O0O(this, z));
    }

    public final void zzI(Bundle bundle) {
        OooO0OO(new o000OO(this, bundle));
    }

    public final void zzJ(zzgy zzgyVar) {
        o000O00 o000o01 = new o000O00(zzgyVar);
        if (this.f15923OooO0oo != null) {
            try {
                this.f15923OooO0oo.setEventInterceptor(o000o01);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        OooO0OO(new o0000O(this, o000o01));
    }

    public final void zzK(Boolean bool) {
        OooO0OO(new oo000o(this, bool));
    }

    public final void zzL(long j) {
        OooO0OO(new o0Oo0oo(this, j));
    }

    public final void zzM(String str) {
        OooO0OO(new o00Oo0(this, str));
    }

    public final void zzN(String str, String str2, Object obj, boolean z) {
        OooO0OO(new o000O0o(this, str, str2, obj, z));
    }

    public final void zzO(com.google.android.gms.measurement.internal.zzgz zzgzVar) {
        Pair pair;
        Preconditions.checkNotNull(zzgzVar);
        synchronized (this.f15919OooO0Oo) {
            int i = 0;
            while (true) {
                if (i >= this.f15919OooO0Oo.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzgzVar.equals(((Pair) this.f15919OooO0Oo.get(i)).first)) {
                        pair = (Pair) this.f15919OooO0Oo.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                Log.w("FA", "OnEventListener had not been registered.");
                return;
            }
            this.f15919OooO0Oo.remove(pair);
            o000O00O o000o00o2 = (o000O00O) pair.second;
            if (this.f15923OooO0oo != null) {
                try {
                    this.f15923OooO0oo.unregisterOnMeasurementEventListener(o000o00o2);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            OooO0OO(new o000(this, o000o00o2));
        }
    }

    public final int zza(String str) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0000O00(this, str, zzbzVar));
        Integer num = (Integer) zzbz.zze(zzbzVar.zzb(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o000000O(this, zzbzVar));
        Long l = (Long) zzbz.zze(zzbzVar.zzb(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f15916OooO00o.currentTimeMillis()).nextLong();
        int i = this.f15921OooO0o0 + 1;
        this.f15921OooO0o0 = i;
        return jNextLong + ((long) i);
    }

    public final Bundle zzc(Bundle bundle, boolean z) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0000Ooo(this, bundle, zzbzVar));
        if (z) {
            return zzbzVar.zzb(5000L);
        }
        return null;
    }

    public final AppMeasurementSdk zzd() {
        return this.f15918OooO0OO;
    }

    public final Object zzh(int i) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0000O0(this, zzbzVar, i));
        return zzbz.zze(zzbzVar.zzb(15000L), Object.class);
    }

    public final String zzj() {
        return this.f15922OooO0oO;
    }

    @WorkerThread
    public final String zzk() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0000oo(this, zzbzVar));
        return zzbzVar.zzc(120000L);
    }

    public final String zzl() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o000000(this, zzbzVar));
        return zzbzVar.zzc(50L);
    }

    public final String zzm() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o00000O0(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzn() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o00000(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzo() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o000OOo(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final List zzp(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o00O0O(this, str, str2, zzbzVar));
        List list = (List) zzbz.zze(zzbzVar.zzb(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map zzq(String str, String str2, boolean z) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o00000O(this, str, str2, z, zzbzVar));
        Bundle bundleZzb = zzbzVar.zzb(5000L);
        if (bundleZzb == null || bundleZzb.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleZzb.size());
        for (String str3 : bundleZzb.keySet()) {
            Object obj = bundleZzb.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzu(String str) {
        OooO0OO(new oo0o0Oo(this, str));
    }

    public final void zzv(String str, String str2, Bundle bundle) {
        OooO0OO(new o0OoOo0(this, str, str2, bundle));
    }

    public final void zzw(String str) {
        OooO0OO(new o0O0O00(this, str));
    }

    public final void zzx(@NonNull String str, Bundle bundle) {
        OooO0O0(null, str, bundle, false, true, null);
    }

    public final void zzy(String str, String str2, Bundle bundle) {
        OooO0O0(str, str2, bundle, true, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle, long j) {
        OooO0O0(str, str2, bundle, true, false, Long.valueOf(j));
    }
}
