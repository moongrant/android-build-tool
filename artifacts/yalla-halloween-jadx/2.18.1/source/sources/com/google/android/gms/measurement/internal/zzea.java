package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.util.VisibleForTesting;
import o0OO0OoO.o000oOoO;
import o0OO0OoO.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzea {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f16099OooO0oO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f16100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000oOoO f16101OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f16102OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f16103OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f16105OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("cachingLock")
    public volatile Object f16104OooO0o = null;

    public /* synthetic */ zzea(String str, Object obj, Object obj2, o000oOoO o000oooo2) {
        this.f16100OooO00o = str;
        this.f16102OooO0OO = obj;
        this.f16103OooO0Oo = obj2;
        this.f16101OooO0O0 = o000oooo2;
    }

    public final Object zza(Object obj) {
        synchronized (this.f16105OooO0o0) {
        }
        if (obj != null) {
            return obj;
        }
        if (o0OoOo0.f37858OooO00o == null) {
            return this.f16102OooO0OO;
        }
        synchronized (f16099OooO0oO) {
            if (zzab.zza()) {
                return this.f16104OooO0o == null ? this.f16102OooO0OO : this.f16104OooO0o;
            }
            try {
                for (zzea zzeaVar : zzeb.f16106OooO00o) {
                    if (zzab.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object objZza = null;
                    try {
                        o000oOoO o000oooo2 = zzeaVar.f16101OooO0O0;
                        if (o000oooo2 != null) {
                            objZza = o000oooo2.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f16099OooO0oO) {
                        zzeaVar.f16104OooO0o = objZza;
                    }
                }
            } catch (SecurityException unused2) {
            }
            o000oOoO o000oooo3 = this.f16101OooO0O0;
            if (o000oooo3 == null) {
                return this.f16102OooO0OO;
            }
            try {
                return o000oooo3.zza();
            } catch (IllegalStateException unused3) {
                return this.f16102OooO0OO;
            } catch (SecurityException unused4) {
                return this.f16102OooO0OO;
            }
        }
    }

    public final String zzb() {
        return this.f16100OooO00o;
    }
}
