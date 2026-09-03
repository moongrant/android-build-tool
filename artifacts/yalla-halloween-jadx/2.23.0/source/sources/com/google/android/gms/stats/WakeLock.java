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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;
import kotlin.jvm.internal.LongCompanionObject;
import o0O00000.OooO00o;
import o0O00000.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@ThreadSafe
@KeepForSdk
public class WakeLock {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final long f16139OooOOO = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static volatile ScheduledExecutorService f16140OooOOOO = null;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Object f16141OooOOOo = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Clock f16142OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f16143OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final PowerManager.WakeLock f16144OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public int f16145OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public ScheduledFuture f16146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final HashSet f16147OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public long f16148OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public boolean f16149OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public zzb f16150OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f16151OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final HashMap f16152OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AtomicInteger f16153OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ScheduledExecutorService f16154OooOOO0;

    static {
        new OooO00o();
    }

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f16143OooO00o = new Object();
        this.f16145OooO0OO = 0;
        this.f16147OooO0o = new HashSet();
        this.f16149OooO0oO = true;
        this.f16142OooO = DefaultClock.getInstance();
        this.f16152OooOO0O = new HashMap();
        this.f16153OooOO0o = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f16150OooO0oo = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f16151OooOO0 = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f16151OooOO0 = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.f16144OooO0O0 = wakeLockNewWakeLock;
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
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f16140OooOOOO;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f16141OooOOOo) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = f16140OooOOOO;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f16140OooOOOO = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.f16154OooOOO0 = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void zza(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.f16143OooO00o) {
            if (wakeLock.isHeld()) {
                Log.e("WakeLock", String.valueOf(wakeLock.f16151OooOO0).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.OooO00o();
                if (wakeLock.isHeld()) {
                    wakeLock.f16145OooO0OO = 1;
                    wakeLock.OooO0O0();
                }
            }
        }
    }

    @GuardedBy("acquireReleaseLock")
    public final void OooO00o() {
        HashSet hashSet = this.f16147OooO0o;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final void OooO0O0() {
        synchronized (this.f16143OooO00o) {
            if (isHeld()) {
                if (this.f16149OooO0oO) {
                    int i = this.f16145OooO0OO - 1;
                    this.f16145OooO0OO = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.f16145OooO0OO = 0;
                }
                OooO00o();
                Iterator it = this.f16152OooOO0O.values().iterator();
                while (it.hasNext()) {
                    ((OooO0O0) it.next()).f41589OooO00o = 0;
                }
                this.f16152OooOO0O.clear();
                ScheduledFuture scheduledFuture = this.f16146OooO0Oo;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f16146OooO0Oo = null;
                    this.f16148OooO0o0 = 0L;
                }
                try {
                    if (this.f16144OooO0O0.isHeld()) {
                        try {
                            this.f16144OooO0O0.release();
                            if (this.f16150OooO0oo != null) {
                                this.f16150OooO0oo = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", String.valueOf(this.f16151OooOO0).concat(" failed to release!"), e);
                            if (this.f16150OooO0oo != null) {
                                this.f16150OooO0oo = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f16151OooOO0).concat(" should be held!"));
                    }
                } catch (Throwable th) {
                    if (this.f16150OooO0oo != null) {
                        this.f16150OooO0oo = null;
                    }
                    throw th;
                }
            }
        }
    }

    @KeepForSdk
    public void acquire(long j) {
        this.f16153OooOO0o.incrementAndGet();
        long j2 = f16139OooOOO;
        long j3 = LongCompanionObject.MAX_VALUE;
        long jMax = Math.max(Math.min(LongCompanionObject.MAX_VALUE, j2), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f16143OooO00o) {
            try {
                if (!isHeld()) {
                    this.f16150OooO0oo = zzb.zza(false, null);
                    this.f16144OooO0O0.acquire();
                    this.f16142OooO.elapsedRealtime();
                }
                this.f16145OooO0OO++;
                if (this.f16149OooO0oO) {
                    TextUtils.isEmpty(null);
                }
                OooO0O0 oooO0O0 = (OooO0O0) this.f16152OooOO0O.get(null);
                if (oooO0O0 == null) {
                    oooO0O0 = new OooO0O0(0);
                    this.f16152OooOO0O.put(null, oooO0O0);
                }
                oooO0O0.f41589OooO00o++;
                long jElapsedRealtime = this.f16142OooO.elapsedRealtime();
                if (LongCompanionObject.MAX_VALUE - jElapsedRealtime > jMax) {
                    j3 = jElapsedRealtime + jMax;
                }
                if (j3 > this.f16148OooO0o0) {
                    this.f16148OooO0o0 = j3;
                    ScheduledFuture scheduledFuture = this.f16146OooO0Oo;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f16146OooO0Oo = this.f16154OooOOO0.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
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
        synchronized (this.f16143OooO00o) {
            z = this.f16145OooO0OO > 0;
        }
        return z;
    }

    @KeepForSdk
    public void release() {
        if (this.f16153OooOO0o.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f16151OooOO0).concat(" release without a matched acquire!"));
        }
        synchronized (this.f16143OooO00o) {
            try {
                if (this.f16149OooO0oO) {
                    TextUtils.isEmpty(null);
                }
                if (this.f16152OooOO0O.containsKey(null)) {
                    OooO0O0 oooO0O0 = (OooO0O0) this.f16152OooOO0O.get(null);
                    if (oooO0O0 != null) {
                        int i = oooO0O0.f41589OooO00o - 1;
                        oooO0O0.f41589OooO00o = i;
                        if (i == 0) {
                            this.f16152OooOO0O.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f16151OooOO0).concat(" counter does not exist"));
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        synchronized (this.f16143OooO00o) {
            this.f16149OooO0oO = z;
        }
    }
}
