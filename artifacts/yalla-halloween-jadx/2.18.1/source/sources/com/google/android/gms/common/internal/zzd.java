package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzd extends zzab {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public BaseGmsClient f15665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f15666OooO0O0;

    public zzd(@NonNull BaseGmsClient baseGmsClient, int i) {
        this.f15665OooO00o = baseGmsClient;
        this.f15666OooO0O0 = i;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void onPostInitComplete(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
        Preconditions.checkNotNull(this.f15665OooO00o, "onPostInitComplete can be called only once per call to getRemoteService");
        BaseGmsClient baseGmsClient = this.f15665OooO00o;
        int i2 = this.f15666OooO0O0;
        OooOO0O oooOO0O = baseGmsClient.f15524OooOO0o;
        oooOO0O.sendMessage(oooOO0O.obtainMessage(1, i2, -1, new zzf(baseGmsClient, i, iBinder, bundle)));
        this.f15665OooO00o = null;
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzb(int i, @Nullable Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    @BinderThread
    public final void zzc(int i, @NonNull IBinder iBinder, @NonNull zzj zzjVar) {
        BaseGmsClient baseGmsClient = this.f15665OooO00o;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzjVar);
        baseGmsClient.f15541OooOoo0 = zzjVar;
        if (baseGmsClient.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f15671Oooo;
            RootTelemetryConfigManager.getInstance().zza(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza());
        }
        onPostInitComplete(i, iBinder, zzjVar.f15672Oooo0o);
    }
}
