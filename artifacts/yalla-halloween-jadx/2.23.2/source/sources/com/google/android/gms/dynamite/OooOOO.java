package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements DynamiteModule.VersionPolicy.IVersions {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f14853OooO00o;

    public OooOOO(int i) {
        this.f14853OooO00o = i;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(Context context, String str) {
        return this.f14853OooO00o;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(Context context, String str, boolean z) {
        return 0;
    }
}
