package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import p336o0OO0Ooo.o0OOO0;
import p336o0OO0Ooo.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@ThreadSafe
@KeepForSdk
public class WakeLock {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final long f16343OooOOO = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static volatile ScheduledExecutorService f16344OooOOOO = null;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Object f16345OooOOOo = new Object();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static volatile o0OOO00 f16346OooOOo0 = new o0OOO00();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Clock f16347OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f16348OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final PowerManager.WakeLock f16349OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public int f16350OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public Future<?> f16351OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final Set<zze> f16352OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public long f16353OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public boolean f16354OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public zzb f16355OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f16356OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final Map<String, o0OOO0> f16357OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public AtomicInteger f16358OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ScheduledExecutorService f16359OooOOO0;

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f16348OooO00o = new Object();
        this.f16350OooO0OO = 0;
        this.f16352OooO0o = new HashSet();
        this.f16354OooO0oO = true;
        this.f16347OooO = DefaultClock.getInstance();
        this.f16357OooOO0O = new HashMap();
        this.f16358OooOO0o = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f16355OooO0oo = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f16356OooOO0 = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f16356OooOO0 = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.f16349OooO0O0 = wakeLockNewWakeLock;
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            WorkSource workSourceFromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
            if (workSourceFromPackage != null) {
                try {
                    wakeLockNewWakeLock.setWorkSource(workSourceFromPackage);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f16344OooOOOO;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f16345OooOOOo) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = f16344OooOOOO;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f16344OooOOOO = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.f16359OooOOO0 = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void zza(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.f16348OooO00o) {
            if (wakeLock.isHeld()) {
                Log.e("WakeLock", String.valueOf(wakeLock.f16356OooOO0).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.OooO00o();
                if (wakeLock.isHeld()) {
                    wakeLock.f16350OooO0OO = 1;
                    wakeLock.OooO0O0();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<com.google.android.gms.stats.zze>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashSet, java.util.Set<com.google.android.gms.stats.zze>] */
    @GuardedBy("acquireReleaseLock")
    public final void OooO00o() {
        if (this.f16352OooO0o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f16352OooO0o);
        this.f16352OooO0o.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<java.lang.String, o0OO0Ooo.o0OOO0>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, o0OO0Ooo.o0OOO0>] */
    public final void OooO0O0() {
        synchronized (this.f16348OooO00o) {
            if (isHeld()) {
                if (this.f16354OooO0oO) {
                    int i = this.f16350OooO0OO - 1;
                    this.f16350OooO0OO = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.f16350OooO0OO = 0;
                }
                OooO00o();
                Iterator it = this.f16357OooOO0O.values().iterator();
                while (it.hasNext()) {
                    ((o0OOO0) it.next()).f37911OooO00o = 0;
                }
                this.f16357OooOO0O.clear();
                Future<?> future = this.f16351OooO0Oo;
                if (future != null) {
                    future.cancel(false);
                    this.f16351OooO0Oo = null;
                    this.f16353OooO0o0 = 0L;
                }
                try {
                    if (this.f16349OooO0O0.isHeld()) {
                        try {
                            this.f16349OooO0O0.release();
                            if (this.f16355OooO0oo != null) {
                                this.f16355OooO0oo = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", String.valueOf(this.f16356OooOO0).concat(" failed to release!"), e);
                            if (this.f16355OooO0oo != null) {
                                this.f16355OooO0oo = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f16356OooOO0).concat(" should be held!"));
                    }
                } catch (Throwable th) {
                    if (this.f16355OooO0oo != null) {
                        this.f16355OooO0oo = null;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.HashMap, java.util.Map<java.lang.String, o0OO0Ooo.o0OOO0>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<java.lang.String, o0OO0Ooo.o0OOO0>] */
    @KeepForSdk
    public void acquire(long j) {
        this.f16358OooOO0o.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f16343OooOOO), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f16348OooO00o) {
            try {
                if (!isHeld()) {
                    this.f16355OooO0oo = zzb.zza(false, null);
                    this.f16349OooO0O0.acquire();
                    this.f16347OooO.elapsedRealtime();
                }
                this.f16350OooO0OO++;
                if (this.f16354OooO0oO) {
                    TextUtils.isEmpty(null);
                }
                o0OOO0 o0ooo1 = (o0OOO0) this.f16357OooOO0O.get(null);
                if (o0ooo1 == null) {
                    o0ooo1 = new o0OOO0(null);
                    this.f16357OooOO0O.put(null, o0ooo1);
                }
                o0ooo1.f37911OooO00o++;
                long jElapsedRealtime = this.f16347OooO.elapsedRealtime();
                long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j2 > this.f16353OooO0o0) {
                    this.f16353OooO0o0 = j2;
                    Future<?> future = this.f16351OooO0Oo;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.f16351OooO0Oo = this.f16359OooOOO0.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock.zza(this.zza);
                        }
                    }, jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public boolean isHeld() {
        boolean z;
        synchronized (this.f16348OooO00o) {
            z = this.f16350OooO0OO > 0;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, o0OO0Ooo.o0OOO0>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashMap, java.util.Map<java.lang.String, o0OO0Ooo.o0OOO0>] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, o0OO0Ooo.o0OOO0>] */
    @KeepForSdk
    public void release() {
        if (this.f16358OooOO0o.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f16356OooOO0).concat(" release without a matched acquire!"));
        }
        synchronized (this.f16348OooO00o) {
            if (this.f16354OooO0oO) {
                TextUtils.isEmpty(null);
            }
            if (this.f16357OooOO0O.containsKey(null)) {
                o0OOO0 o0ooo1 = (o0OOO0) this.f16357OooOO0O.get(null);
                if (o0ooo1 != null) {
                    int i = o0ooo1.f37911OooO00o - 1;
                    o0ooo1.f37911OooO00o = i;
                    if (i == 0) {
                        this.f16357OooOO0O.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f16356OooOO0).concat(" counter does not exist"));
            }
            OooO0O0();
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        synchronized (this.f16348OooO00o) {
            this.f16354OooO0oO = z;
        }
    }
}
