package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zzjy {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public zzjz f16069Oooo0o;

    public final zzjz OooO00o() {
        if (this.f16069Oooo0o == null) {
            this.f16069Oooo0o = new zzjz(this);
        }
        return this.f16069Oooo0o;
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

    @Override // android.app.job.JobService
    public boolean onStartJob(@NonNull JobParameters jobParameters) {
        OooO00o().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        OooO00o().zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    public final void zza(@NonNull Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    @TargetApi(24)
    public final void zzb(@NonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzjy
    public final boolean zzc(int i) {
        throw new UnsupportedOperationException();
    }
}
