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
    public final Long f15550OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15551OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f15552OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f15553OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String f15554OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f15555OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Boolean f15556OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final com.google.android.gms.internal.measurement.zzcl f15557OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f15558OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final String f15559OooOO0;

    @VisibleForTesting
    public zzhi(Context context, @Nullable com.google.android.gms.internal.measurement.zzcl zzclVar, @Nullable Long l) {
        this.f15558OooO0oo = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f15551OooO00o = applicationContext;
        this.f15550OooO = l;
        if (zzclVar != null) {
            this.f15557OooO0oO = zzclVar;
            this.f15552OooO0O0 = zzclVar.zzf;
            this.f15553OooO0OO = zzclVar.zze;
            this.f15554OooO0Oo = zzclVar.zzd;
            this.f15558OooO0oo = zzclVar.zzc;
            this.f15555OooO0o = zzclVar.zzb;
            this.f15559OooOO0 = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.f15556OooO0o0 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
