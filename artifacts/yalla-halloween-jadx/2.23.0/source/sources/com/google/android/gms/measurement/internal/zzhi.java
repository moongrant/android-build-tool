package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzhi {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final Long f16026OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f16027OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f16028OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f16029OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f16030OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f16031OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Boolean f16032OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final com.google.android.gms.internal.measurement.zzcl f16033OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f16034OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final String f16035OooOO0;

    @VisibleForTesting
    public zzhi(Context context, @Nullable com.google.android.gms.internal.measurement.zzcl zzclVar, @Nullable Long l) {
        this.f16034OooO0oo = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f16027OooO00o = applicationContext;
        this.f16026OooO = l;
        if (zzclVar != null) {
            this.f16033OooO0oO = zzclVar;
            this.f16028OooO0O0 = zzclVar.zzf;
            this.f16029OooO0OO = zzclVar.zze;
            this.f16030OooO0Oo = zzclVar.zzd;
            this.f16034OooO0oo = zzclVar.zzc;
            this.f16031OooO0o = zzclVar.zzb;
            this.f16035OooOO0 = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.f16032OooO0o0 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
