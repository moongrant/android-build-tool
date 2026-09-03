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
    public BaseGmsClient f14682OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f14683OooO0o0;

    public zzd(@NonNull BaseGmsClient baseGmsClient, int i) {
        this.f14682OooO0Oo = baseGmsClient;
        this.f14683OooO0o0 = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void onPostInitComplete(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        Preconditions.checkNotNull(this.f14682OooO0Oo, "onPostInitComplete can be called only once per call to getRemoteService");
        BaseGmsClient baseGmsClient = this.f14682OooO0Oo;
        baseGmsClient.getClass();
        zzf zzfVar = new zzf(baseGmsClient, i, iBinder, bundle);
        OooOO0O oooOO0O = baseGmsClient.f14544OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(1, this.f14683OooO0o0, -1, zzfVar));
        this.f14682OooO0Oo = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzb(int i, @Nullable Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzc(int i, @NonNull IBinder iBinder, @NonNull zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.f14682OooO0Oo;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzjVar);
        baseGmsClient.f14561OooOoo0 = zzjVar;
        if (baseGmsClient.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f14691OooO0oO;
            RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
        onPostInitComplete(i, iBinder, zzjVar.f14688OooO0Oo);
    }
}
