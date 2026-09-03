package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import o0OO0OoO.o0O00OOO;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjz {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f16274OooO00o;

    public zzjz(Context context) {
        Preconditions.checkNotNull(context);
        this.f16274OooO00o = context;
    }

    public final zzeo OooO00o() {
        return zzfy.zzp(this.f16274OooO00o, null, null).zzay();
    }

    @MainThread
    public final int zza(final Intent intent, int i, final int i2) {
        zzfy zzfyVarZzp = zzfy.zzp(this.f16274OooO00o, null, null);
        final zzeo zzeoVarZzay = zzfyVarZzp.zzay();
        if (intent == null) {
            zzeoVarZzay.zzk().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzfyVarZzp.zzaw();
        zzeoVarZzay.zzj().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjw
                @Override // java.lang.Runnable
                public final void run() {
                    zzjz zzjzVar = this.zza;
                    int i3 = i2;
                    zzeo zzeoVar = zzeoVarZzay;
                    Intent intent2 = intent;
                    if (((zzjy) zzjzVar.f16274OooO00o).zzc(i3)) {
                        zzeoVar.zzj().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i3));
                        zzjzVar.OooO00o().zzj().zza("Completed wakeful intent.");
                        ((zzjy) zzjzVar.f16274OooO00o).zza(intent2);
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
            return new zzgq(zzkz.zzt(this.f16274OooO00o), null);
        }
        OooO00o().zzk().zzb("onBind received unknown action", action);
        return null;
    }

    @MainThread
    public final void zze() {
        zzfy zzfyVarZzp = zzfy.zzp(this.f16274OooO00o, null, null);
        zzeo zzeoVarZzay = zzfyVarZzp.zzay();
        zzfyVarZzp.zzaw();
        zzeoVarZzay.zzj().zza("Local AppMeasurementService is starting up");
    }

    @MainThread
    public final void zzf() {
        zzfy zzfyVarZzp = zzfy.zzp(this.f16274OooO00o, null, null);
        zzeo zzeoVarZzay = zzfyVarZzp.zzay();
        zzfyVarZzp.zzaw();
        zzeoVarZzay.zzj().zza("Local AppMeasurementService is shutting down");
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
        zzkz zzkzVarZzt = zzkz.zzt(this.f16274OooO00o);
        zzkzVarZzt.zzaz().zzp(new o0O00OOO(zzkzVarZzt, runnable));
    }

    @TargetApi(24)
    @MainThread
    public final boolean zzi(final JobParameters jobParameters) {
        zzfy zzfyVarZzp = zzfy.zzp(this.f16274OooO00o, null, null);
        final zzeo zzeoVarZzay = zzfyVarZzp.zzay();
        String string = jobParameters.getExtras().getString(NativeProtocol.WEB_DIALOG_ACTION);
        zzfyVarZzp.zzaw();
        zzeoVarZzay.zzj().zzb("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        zzh(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjv
            @Override // java.lang.Runnable
            public final void run() {
                zzjz zzjzVar = this.zza;
                zzeo zzeoVar = zzeoVarZzay;
                JobParameters jobParameters2 = jobParameters;
                Objects.requireNonNull(zzjzVar);
                zzeoVar.zzj().zza("AppMeasurementJobService processed last upload request.");
                ((zzjy) zzjzVar.f16274OooO00o).zzb(jobParameters2, false);
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
