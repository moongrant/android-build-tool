package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhy {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f15721OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15722OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f15723OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f15724OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f15725OooO0o0;

    public zzhy(Uri uri, boolean z, boolean z2) {
        this.f15721OooO00o = uri;
        this.f15722OooO0O0 = "";
        this.f15723OooO0OO = "";
        this.f15724OooO0Oo = z;
        this.f15725OooO0o0 = z2;
    }

    public final zzhy zza() {
        return new zzhy(this.f15721OooO00o, this.f15724OooO0Oo, true);
    }

    public final zzhy zzb() {
        if (!this.f15722OooO0O0.isEmpty()) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzhy(this.f15721OooO00o, true, this.f15725OooO0o0);
    }

    public final zzib zzc(String str, double d) {
        return new o00O0O0O(this, Double.valueOf(-3.0d));
    }

    public final zzib zzd(String str, long j) {
        return new o00O0O00(this, str, Long.valueOf(j));
    }

    public final zzib zze(String str, String str2) {
        return new o00O0OO0(this, str, str2);
    }

    public final zzib zzf(String str, boolean z) {
        return new o00O0O0(this, str, Boolean.valueOf(z));
    }

    public zzhy(Uri uri) {
        this(uri, false, false);
    }
}
