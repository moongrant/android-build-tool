package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.android.gms.measurement.internal.zzkg;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements zzkf {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public zzkg f15392OooO0Oo;

    public final zzkg OooO00o() {
        if (this.f15392OooO0Oo == null) {
            this.f15392OooO0Oo = new zzkg(this);
        }
        return this.f15392OooO0Oo;
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public IBinder onBind(@NonNull Intent intent) {
        return OooO00o().zzb(intent);
    }

    @Override // android.app.Service
    @MainThread
    public void onCreate() {
        super.onCreate();
        OooO00o().zze();
    }

    @Override // android.app.Service
    @MainThread
    public void onDestroy() {
        OooO00o().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public void onRebind(@NonNull Intent intent) {
        OooO00o().zzg(intent);
    }

    @Override // android.app.Service
    @MainThread
    public int onStartCommand(@NonNull Intent intent, int i, int i2) {
        OooO00o().zza(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        OooO00o().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final void zza(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final void zzb(@NonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzc(int i) {
        return stopSelfResult(i);
    }
}
