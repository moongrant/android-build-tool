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
import com.google.android.gms.measurement.internal.zziq;
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

/* JADX INFO: loaded from: classes3.dex */
public final class zzef {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static volatile zzef f15205OooOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile zzcc f15206OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15207OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Clock f15208OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ExecutorService f15209OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AppMeasurementSdk f15210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15211OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("listenerList")
    public final ArrayList f15212OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f15213OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f15214OooO0oo;

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    public zzef(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (str == null) {
            this.f15207OooO00o = "FA";
        } else {
            if (str3 == null || str2 == null) {
                z4 = false;
            } else {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzef.class.getClassLoader());
                    z5 = true;
                } catch (ClassNotFoundException unused) {
                    z5 = false;
                }
                if (z5) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            }
            if (z4) {
                this.f15207OooO00o = str;
            } else {
                this.f15207OooO00o = "FA";
            }
        }
        this.f15208OooO0O0 = DefaultClock.getInstance();
        zzbx.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o00000OO());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f15209OooO0OO = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f15210OooO0Oo = new AppMeasurementSdk(this);
        this.f15212OooO0o0 = new ArrayList();
        try {
            try {
                if (zziq.zzc(context, "google_app_id", com.google.android.gms.measurement.internal.zzfv.zza(context)) != null) {
                    try {
                        Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzef.class.getClassLoader());
                        z3 = true;
                    } catch (ClassNotFoundException unused2) {
                        z3 = false;
                    }
                    if (!z3) {
                        this.f15214OooO0oo = null;
                        this.f15213OooO0oO = true;
                        Log.w(this.f15207OooO00o, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                        return;
                    }
                }
            } catch (IllegalStateException unused3) {
            }
        } catch (IllegalStateException unused4) {
        }
        if (str3 == null || str2 == null) {
            z = false;
        } else {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzef.class.getClassLoader());
                z2 = true;
            } catch (ClassNotFoundException unused5) {
                z2 = false;
            }
            if (z2) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            this.f15214OooO0oo = str2;
        } else {
            this.f15214OooO0oo = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f15207OooO00o, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f15207OooO00o, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        OooO0OO(new o0OOO0o(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f15207OooO00o, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new o000OOo0(this));
        }
    }

    public static zzef zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f15205OooOO0 == null) {
            synchronized (zzef.class) {
                if (f15205OooOO0 == null) {
                    f15205OooOO0 = new zzef(context, str, str2, str3, bundle);
                }
            }
        }
        return f15205OooOO0;
    }

    public final void OooO00o(Exception exc, boolean z, boolean z2) {
        this.f15213OooO0oO |= z;
        String str = this.f15207OooO00o;
        if (z) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzB(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    public final void OooO0O0(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        OooO0OO(new o000(this, l, str, str2, bundle, z, z2));
    }

    public final void OooO0OO(o000O0o o000o0o2) {
        this.f15209OooO0OO.execute(o000o0o2);
    }

    public final void zzA(String str, String str2, Bundle bundle, long j) {
        OooO0O0(str, str2, bundle, true, false, Long.valueOf(j));
    }

    public final void zzB(int i, String str, Object obj, Object obj2, Object obj3) {
        OooO0OO(new o00000O0(this, str, obj));
    }

    public final void zzC(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        Preconditions.checkNotNull(zzhgVar);
        synchronized (this.f15212OooO0o0) {
            for (int i = 0; i < this.f15212OooO0o0.size(); i++) {
                if (zzhgVar.equals(((Pair) this.f15212OooO0o0.get(i)).first)) {
                    Log.w(this.f15207OooO00o, "OnEventListener already registered.");
                    return;
                }
            }
            o000O00 o000o01 = new o000O00(zzhgVar);
            this.f15212OooO0o0.add(new Pair(zzhgVar, o000o01));
            if (this.f15206OooO != null) {
                try {
                    this.f15206OooO.registerOnMeasurementEventListener(o000o01);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f15207OooO00o, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            OooO0OO(new o0000O(this, o000o01));
        }
    }

    public final void zzD() {
        OooO0OO(new o00oO0o(this));
    }

    public final void zzE(Bundle bundle) {
        OooO0OO(new Oooo000(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        OooO0OO(new o00Ooo(this, bundle));
    }

    public final void zzG(Bundle bundle) {
        OooO0OO(new oo000o(this, bundle));
    }

    public final void zzH(Activity activity, String str, String str2) {
        OooO0OO(new o00O0O(this, activity, str, str2));
    }

    public final void zzI(boolean z) {
        OooO0OO(new o0000O0(this, z));
    }

    public final void zzJ(Bundle bundle) {
        OooO0OO(new o0000O0O(this, bundle));
    }

    public final void zzK(com.google.android.gms.measurement.internal.zzhf zzhfVar) {
        o000Oo0 o000oo1 = new o000Oo0(zzhfVar);
        if (this.f15206OooO != null) {
            try {
                this.f15206OooO.setEventInterceptor(o000oo1);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f15207OooO00o, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        OooO0OO(new o000OO(this, o000oo1));
    }

    public final void zzL(Boolean bool) {
        OooO0OO(new o00Oo0(this, bool));
    }

    public final void zzM(long j) {
        OooO0OO(new o0ooOOo(this, j));
    }

    public final void zzN(String str) {
        OooO0OO(new o0OoOo0(this, str));
    }

    public final void zzO(String str, String str2, Object obj, boolean z) {
        OooO0OO(new o000O000(this, str, str2, obj, z));
    }

    public final void zzP(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        Pair pair;
        Preconditions.checkNotNull(zzhgVar);
        synchronized (this.f15212OooO0o0) {
            int i = 0;
            while (true) {
                if (i >= this.f15212OooO0o0.size()) {
                    pair = null;
                    break;
                } else {
                    if (zzhgVar.equals(((Pair) this.f15212OooO0o0.get(i)).first)) {
                        pair = (Pair) this.f15212OooO0o0.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                Log.w(this.f15207OooO00o, "OnEventListener had not been registered.");
                return;
            }
            this.f15212OooO0o0.remove(pair);
            o000O00 o000o01 = (o000O00) pair.second;
            if (this.f15206OooO != null) {
                try {
                    this.f15206OooO.unregisterOnMeasurementEventListener(o000o01);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f15207OooO00o, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            OooO0OO(new o0000OO0(this, o000o01));
        }
    }

    public final int zza(String str) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0000Ooo(this, str, zzbzVar));
        Integer num = (Integer) zzbz.zzf(zzbzVar.zzb(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o000OOo(this, zzbzVar));
        Long lZzc = zzbzVar.zzc(500L);
        if (lZzc != null) {
            return lZzc.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f15208OooO0O0.currentTimeMillis()).nextLong();
        int i = this.f15211OooO0o + 1;
        this.f15211OooO0o = i;
        return jNextLong + ((long) i);
    }

    public final Bundle zzc(Bundle bundle, boolean z) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o00000O(this, bundle, zzbzVar));
        if (z) {
            return zzbzVar.zzb(5000L);
        }
        return null;
    }

    public final AppMeasurementSdk zzd() {
        return this.f15210OooO0Oo;
    }

    @WorkerThread
    public final Long zzh() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0000O00(this, zzbzVar));
        return zzbzVar.zzc(120000L);
    }

    public final Object zzi(int i) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0000oo(this, zzbzVar, i));
        return zzbz.zzf(zzbzVar.zzb(15000L), Object.class);
    }

    public final String zzk() {
        return this.f15214OooO0oo;
    }

    @WorkerThread
    public final String zzl() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0000(this, zzbzVar));
        return zzbzVar.zzd(120000L);
    }

    public final String zzm() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o0O0O00(this, zzbzVar));
        return zzbzVar.zzd(50L);
    }

    public final String zzn() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o000000O(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final String zzo() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o000000(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final String zzp() {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new oo0o0Oo(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final List zzq(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o000oOoO(this, str, str2, zzbzVar));
        List list = (List) zzbz.zzf(zzbzVar.zzb(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map zzr(String str, String str2, boolean z) {
        zzbz zzbzVar = new zzbz();
        OooO0OO(new o00000(this, str, str2, z, zzbzVar));
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

    public final void zzv(String str) {
        OooO0OO(new o0Oo0oo(this, str));
    }

    public final void zzw(String str, String str2, Bundle bundle) {
        OooO0OO(new Oooo0(this, str, str2, bundle));
    }

    public final void zzx(String str) {
        OooO0OO(new o0OO00O(this, str));
    }

    public final void zzy(@NonNull String str, Bundle bundle) {
        OooO0O0(null, str, bundle, false, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        OooO0O0(str, str2, bundle, true, true, null);
    }
}
