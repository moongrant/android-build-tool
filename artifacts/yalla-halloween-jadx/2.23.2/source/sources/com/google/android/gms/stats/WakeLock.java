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
    public static final long f15667OooOOO = TimeUnit.DAYS.toMillis(366);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static volatile ScheduledExecutorService f15668OooOOOO = null;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Object f15669OooOOOo = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Clock f15670OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f15671OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final PowerManager.WakeLock f15672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public int f15673OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public ScheduledFuture f15674OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final HashSet f15675OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public long f15676OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public boolean f15677OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public zzb f15678OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final String f15679OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("acquireReleaseLock")
    public final HashMap f15680OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AtomicInteger f15681OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ScheduledExecutorService f15682OooOOO0;

    static {
        new OooO00o();
    }

    @KeepForSdk
    public WakeLock(@NonNull Context context, int i, @NonNull String str) {
        String packageName = context.getPackageName();
        this.f15671OooO00o = new Object();
        this.f15673OooO0OO = 0;
        this.f15675OooO0o = new HashSet();
        this.f15677OooO0oO = true;
        this.f15670OooO = DefaultClock.getInstance();
        this.f15680OooOO0O = new HashMap();
        this.f15681OooOO0o = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.f15678OooO0oo = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f15679OooOO0 = str;
        } else {
            String strValueOf = String.valueOf(str);
            this.f15679OooOO0 = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb.toString());
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i, str);
        this.f15672OooO0O0 = wakeLockNewWakeLock;
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
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f15668OooOOOO;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f15669OooOOOo) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = f15668OooOOOO;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    zzh.zza();
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    f15668OooOOOO = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.f15682OooOOO0 = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public static /* synthetic */ void zza(@NonNull WakeLock wakeLock) {
        synchronized (wakeLock.f15671OooO00o) {
            if (wakeLock.isHeld()) {
                Log.e("WakeLock", String.valueOf(wakeLock.f15679OooOO0).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.OooO00o();
                if (wakeLock.isHeld()) {
                    wakeLock.f15673OooO0OO = 1;
                    wakeLock.OooO0O0();
                }
            }
        }
    }

    @GuardedBy("acquireReleaseLock")
    public final void OooO00o() {
        HashSet hashSet = this.f15675OooO0o;
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
        synchronized (this.f15671OooO00o) {
            if (isHeld()) {
                if (this.f15677OooO0oO) {
                    int i = this.f15673OooO0OO - 1;
                    this.f15673OooO0OO = i;
                    if (i > 0) {
                        return;
                    }
                } else {
                    this.f15673OooO0OO = 0;
                }
                OooO00o();
                Iterator it = this.f15680OooOO0O.values().iterator();
                while (it.hasNext()) {
                    ((OooO0O0) it.next()).f40898OooO00o = 0;
                }
                this.f15680OooOO0O.clear();
                ScheduledFuture scheduledFuture = this.f15674OooO0Oo;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f15674OooO0Oo = null;
                    this.f15676OooO0o0 = 0L;
                }
                try {
                    if (this.f15672OooO0O0.isHeld()) {
                        try {
                            this.f15672OooO0O0.release();
                            if (this.f15678OooO0oo != null) {
                                this.f15678OooO0oo = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", String.valueOf(this.f15679OooOO0).concat(" failed to release!"), e);
                            if (this.f15678OooO0oo != null) {
                                this.f15678OooO0oo = null;
                            }
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f15679OooOO0).concat(" should be held!"));
                    }
                } catch (Throwable th) {
                    if (this.f15678OooO0oo != null) {
                        this.f15678OooO0oo = null;
                    }
                    throw th;
                }
            }
        }
    }

    @KeepForSdk
    public void acquire(long j) {
        this.f15681OooOO0o.incrementAndGet();
        long j2 = f15667OooOOO;
        long j3 = LongCompanionObject.MAX_VALUE;
        long jMax = Math.max(Math.min(LongCompanionObject.MAX_VALUE, j2), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.f15671OooO00o) {
            try {
                if (!isHeld()) {
                    this.f15678OooO0oo = zzb.zza(false, null);
                    this.f15672OooO0O0.acquire();
                    this.f15670OooO.elapsedRealtime();
                }
                this.f15673OooO0OO++;
                if (this.f15677OooO0oO) {
                    TextUtils.isEmpty(null);
                }
                OooO0O0 oooO0O0 = (OooO0O0) this.f15680OooOO0O.get(null);
                if (oooO0O0 == null) {
                    oooO0O0 = new OooO0O0(0);
                    this.f15680OooOO0O.put(null, oooO0O0);
                }
                oooO0O0.f40898OooO00o++;
                long jElapsedRealtime = this.f15670OooO.elapsedRealtime();
                if (LongCompanionObject.MAX_VALUE - jElapsedRealtime > jMax) {
                    j3 = jElapsedRealtime + jMax;
                }
                if (j3 > this.f15676OooO0o0) {
                    this.f15676OooO0o0 = j3;
                    ScheduledFuture scheduledFuture = this.f15674OooO0Oo;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f15674OooO0Oo = this.f15682OooOOO0.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
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
        synchronized (this.f15671OooO00o) {
            z = this.f15673OooO0OO > 0;
        }
        return z;
    }

    @KeepForSdk
    public void release() {
        if (this.f15681OooOO0o.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f15679OooOO0).concat(" release without a matched acquire!"));
        }
        synchronized (this.f15671OooO00o) {
            try {
                if (this.f15677OooO0oO) {
                    TextUtils.isEmpty(null);
                }
                if (this.f15680OooOO0O.containsKey(null)) {
                    OooO0O0 oooO0O0 = (OooO0O0) this.f15680OooOO0O.get(null);
                    if (oooO0O0 != null) {
                        int i = oooO0O0.f40898OooO00o - 1;
                        oooO0O0.f40898OooO00o = i;
                        if (i == 0) {
                            this.f15680OooOO0O.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f15679OooOO0).concat(" counter does not exist"));
                }
                OooO0O0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public void setReferenceCounted(boolean z) {
        synchronized (this.f15671OooO00o) {
            this.f15677OooO0oO = z;
        }
    }
}
