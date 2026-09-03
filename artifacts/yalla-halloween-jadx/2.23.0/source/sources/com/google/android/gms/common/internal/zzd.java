package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzd extends zzab {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public BaseGmsClient f15158OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f15159OooO0o0;

    public zzd(@NonNull BaseGmsClient baseGmsClient, int i) {
        this.f15158OooO0Oo = baseGmsClient;
        this.f15159OooO0o0 = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void onPostInitComplete(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        Preconditions.checkNotNull(this.f15158OooO0Oo, "onPostInitComplete can be called only once per call to getRemoteService");
        BaseGmsClient baseGmsClient = this.f15158OooO0Oo;
        baseGmsClient.getClass();
        zzf zzfVar = new zzf(baseGmsClient, i, iBinder, bundle);
        OooOO0O oooOO0O = baseGmsClient.f15020OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(1, this.f15159OooO0o0, -1, zzfVar));
        this.f15158OooO0Oo = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzb(int i, @Nullable Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzc(int i, @NonNull IBinder iBinder, @NonNull zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.f15158OooO0Oo;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzjVar);
        baseGmsClient.f15037OooOoo0 = zzjVar;
        if (baseGmsClient.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f15167OooO0oO;
            RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
        onPostInitComplete(i, iBinder, zzjVar.f15164OooO0Oo);
    }
}
