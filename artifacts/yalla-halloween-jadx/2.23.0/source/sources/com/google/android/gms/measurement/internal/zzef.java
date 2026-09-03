package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import com.android.billingclient.api.o000;
import p269o00ooooo.o0OO00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class zzef {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f15895OooO0oO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15896OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OO00OO f15897OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f15898OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f15899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f15901OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("cachingLock")
    public volatile Object f15900OooO0o = null;

    public /* synthetic */ zzef(String str, Object obj, Object obj2, o0OO00OO o0oo00oo2) {
        this.f15896OooO00o = str;
        this.f15898OooO0OO = obj;
        this.f15899OooO0Oo = obj2;
        this.f15897OooO0O0 = o0oo00oo2;
    }

    public final Object zza(Object obj) {
        synchronized (this.f15901OooO0o0) {
        }
        if (obj != null) {
            return obj;
        }
        if (o000.f9684OooO00o == null) {
            return this.f15898OooO0OO;
        }
        synchronized (f15895OooO0oO) {
            if (zzab.zza()) {
                return this.f15900OooO0o == null ? this.f15898OooO0OO : this.f15900OooO0o;
            }
            try {
                for (zzef zzefVar : zzeg.f15902OooO00o) {
                    if (zzab.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object objZza = null;
                    try {
                        o0OO00OO o0oo00oo2 = zzefVar.f15897OooO0O0;
                        if (o0oo00oo2 != null) {
                            objZza = o0oo00oo2.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f15895OooO0oO) {
                        zzefVar.f15900OooO0o = objZza;
                    }
                }
            } catch (SecurityException unused2) {
            }
            o0OO00OO o0oo00oo3 = this.f15897OooO0O0;
            if (o0oo00oo3 == null) {
                return this.f15898OooO0OO;
            }
            try {
                return o0oo00oo3.zza();
            } catch (IllegalStateException unused3) {
                return this.f15898OooO0OO;
            } catch (SecurityException unused4) {
                return this.f15898OooO0OO;
            }
        }
    }

    public final String zzb() {
        return this.f15896OooO00o;
    }
}
