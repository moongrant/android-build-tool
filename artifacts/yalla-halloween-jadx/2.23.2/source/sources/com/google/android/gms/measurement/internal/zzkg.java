package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.internal.Preconditions;
import p271o00ooooo.y;

/* JADX INFO: loaded from: classes3.dex */
public final class zzkg {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15594OooO00o;

    public zzkg(Context context) {
        Preconditions.checkNotNull(context);
        this.f15594OooO00o = context;
    }

    public final zzet OooO00o() {
        return zzgd.zzp(this.f15594OooO00o, null, null).zzaA();
    }

    @MainThread
    public final int zza(final Intent intent, int i, final int i2) {
        zzgd zzgdVarZzp = zzgd.zzp(this.f15594OooO00o, null, null);
        final zzet zzetVarZzaA = zzgdVarZzp.zzaA();
        if (intent == null) {
            zzetVarZzaA.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzgdVarZzp.zzay();
        zzetVarZzaA.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkd
                @Override // java.lang.Runnable
                public final void run() {
                    zzkg zzkgVar = this.zza;
                    int i3 = i2;
                    zzet zzetVar = zzetVarZzaA;
                    Intent intent2 = intent;
                    zzkf zzkfVar = (zzkf) zzkgVar.f15594OooO00o;
                    if (zzkfVar.zzc(i3)) {
                        zzetVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i3));
                        zzkgVar.OooO00o().zzj().zza("Completed wakeful intent.");
                        zzkfVar.zza(intent2);
                    }
                }
            });
        }
        return 2;
    }

    @MainThread
    public final IBinder zzb(Intent intent) {
        if (intent == null) {
            OooO00o().zzd().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgv(zzlh.zzt(this.f15594OooO00o), null);
        }
        OooO00o().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public final void zze() {
        zzgd zzgdVarZzp = zzgd.zzp(this.f15594OooO00o, null, null);
        zzet zzetVarZzaA = zzgdVarZzp.zzaA();
        zzgdVarZzp.zzay();
        zzetVarZzaA.zzj().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzf() {
        zzgd zzgdVarZzp = zzgd.zzp(this.f15594OooO00o, null, null);
        zzet zzetVarZzaA = zzgdVarZzp.zzaA();
        zzgdVarZzp.zzay();
        zzetVarZzaA.zzj().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzg(Intent intent) {
        if (intent == null) {
            OooO00o().zzd().zza("onRebind called with null intent");
        } else {
            OooO00o().zzj().zzb("onRebind called. action", intent.getAction());
        }
    }

    public final void zzh(Runnable runnable) {
        zzlh zzlhVarZzt = zzlh.zzt(this.f15594OooO00o);
        zzlhVarZzt.zzaB().zzp(new y(zzlhVarZzt, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzi(final JobParameters jobParameters) {
        zzgd zzgdVarZzp = zzgd.zzp(this.f15594OooO00o, null, null);
        final zzet zzetVarZzaA = zzgdVarZzp.zzaA();
        String string = jobParameters.getExtras().getString(NativeProtocol.WEB_DIALOG_ACTION);
        zzgdVarZzp.zzay();
        zzetVarZzaA.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
            @Override // java.lang.Runnable
            public final void run() {
                zzkg zzkgVar = this.zza;
                zzet zzetVar = zzetVarZzaA;
                JobParameters jobParameters2 = jobParameters;
                zzkgVar.getClass();
                zzetVar.zzj().zza("AppMeasurementJobService processed last upload request.");
                ((zzkf) zzkgVar.f15594OooO00o).zzb(jobParameters2, false);
            }
        });
        return true;
    }

    @MainThread
    public final boolean zzj(Intent intent) {
        if (intent == null) {
            OooO00o().zzd().zza("onUnbind called with null intent");
            return true;
        }
        OooO00o().zzj().zzb("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
