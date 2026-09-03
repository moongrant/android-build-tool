package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzhb {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final Long f16228OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f16229OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public String f16230OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public String f16231OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public String f16232OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f16233OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Boolean f16234OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public com.google.android.gms.internal.measurement.zzcl f16235OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f16236OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public String f16237OooOO0;

    @VisibleForTesting
    public zzhb(Context context, @Nullable com.google.android.gms.internal.measurement.zzcl zzclVar, @Nullable Long l) {
        this.f16236OooO0oo = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f16229OooO00o = applicationContext;
        this.f16228OooO = l;
        if (zzclVar != null) {
            this.f16235OooO0oO = zzclVar;
            this.f16230OooO0O0 = zzclVar.zzf;
            this.f16231OooO0OO = zzclVar.zze;
            this.f16232OooO0Oo = zzclVar.zzd;
            this.f16236OooO0oo = zzclVar.zzc;
            this.f16233OooO0o = zzclVar.zzb;
            this.f16237OooOO0 = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.f16234OooO0o0 = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
