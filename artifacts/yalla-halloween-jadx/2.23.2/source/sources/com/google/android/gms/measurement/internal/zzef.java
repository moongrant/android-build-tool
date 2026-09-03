package com.google.android.gms.measurement.internal;

import androidx.annotation.GuardedBy;
import com.code.android.util.o0000O00;
import p271o00ooooo.oO00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzef {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Object f15419OooO0oO = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15420OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00Oo0 f15421OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f15422OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f15423OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f15425OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("cachingLock")
    public volatile Object f15424OooO0o = null;

    public /* synthetic */ zzef(String str, Object obj, Object obj2, oO00Oo0 oo00oo0) {
        this.f15420OooO00o = str;
        this.f15422OooO0OO = obj;
        this.f15423OooO0Oo = obj2;
        this.f15421OooO0O0 = oo00oo0;
    }

    public final Object zza(Object obj) {
        synchronized (this.f15425OooO0o0) {
        }
        if (obj != null) {
            return obj;
        }
        if (o0000O00.f13415OooO00o == null) {
            return this.f15422OooO0OO;
        }
        synchronized (f15419OooO0oO) {
            if (zzab.zza()) {
                return this.f15424OooO0o == null ? this.f15422OooO0OO : this.f15424OooO0o;
            }
            try {
                for (zzef zzefVar : zzeg.f15426OooO00o) {
                    if (zzab.zza()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object objZza = null;
                    try {
                        oO00Oo0 oo00oo0 = zzefVar.f15421OooO0O0;
                        if (oo00oo0 != null) {
                            objZza = oo00oo0.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f15419OooO0oO) {
                        zzefVar.f15424OooO0o = objZza;
                    }
                }
            } catch (SecurityException unused2) {
            }
            oO00Oo0 oo00oo1 = this.f15421OooO0O0;
            if (oo00oo1 == null) {
                return this.f15422OooO0OO;
            }
            try {
                return oo00oo1.zza();
            } catch (IllegalStateException unused3) {
                return this.f15422OooO0OO;
            } catch (SecurityException unused4) {
                return this.f15422OooO0OO;
            }
        }
    }

    public final String zzb() {
        return this.f15420OooO00o;
    }
}
