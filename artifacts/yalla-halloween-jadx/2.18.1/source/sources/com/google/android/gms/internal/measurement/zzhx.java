package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p334o0OO00o.o00O0;
import p334o0OO00o.o00O0O0;
import p334o0OO00o.o00O0O00;
import p334o0OO00o.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhx {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f15954OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15955OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f15956OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f15957OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f15958OooO0o0;

    public zzhx(Uri uri) {
        this(uri, false, false);
    }

    public zzhx(Uri uri, boolean z, boolean z2) {
        this.f15954OooO00o = uri;
        this.f15955OooO0O0 = "";
        this.f15956OooO0OO = "";
        this.f15957OooO0Oo = z;
        this.f15958OooO0o0 = z2;
    }

    public final zzhx zza() {
        return new zzhx(this.f15954OooO00o, this.f15957OooO0Oo, true);
    }

    public final zzhx zzb() {
        if (this.f15955OooO0O0.isEmpty()) {
            return new zzhx(this.f15954OooO00o, true, this.f15958OooO0o0);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzia zzc(String str, double d) {
        return new o00O0O0(this, Double.valueOf(-3.0d));
    }

    public final zzia zzd(String str, long j) {
        return new o00O0(this, str, Long.valueOf(j));
    }

    public final zzia zze(String str, String str2) {
        return new o00O0O0O(this, str, str2);
    }

    public final zzia zzf(String str, boolean z) {
        return new o00O0O00(this, str, Boolean.valueOf(z));
    }
}
