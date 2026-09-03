package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.facebook.internal.NativeProtocol;
import o0OO0OoO.OooOOO;
import o0OO0OoO.Oooo0;
import o0OO0OoO.o0O0OOO0;
import o0OO0OoO.oo0OOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkl extends oo0OOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AlarmManager f16279OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Integer f16280OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0O0OOO0 f16281OooO0o0;

    public zzkl(zzkz zzkzVar) {
        super(zzkzVar);
        this.f16279OooO0Oo = (AlarmManager) this.f37615OooO00o.zzau().getSystemService("alarm");
    }

    @Override // o0OO0OoO.oo0OOoo
    public final void OooO0O0() {
        AlarmManager alarmManager = this.f16279OooO0Oo;
        if (alarmManager != null) {
            alarmManager.cancel(OooO0Oo());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    public final int OooO0OO() {
        if (this.f16280OooO0o == null) {
            this.f16280OooO0o = Integer.valueOf("measurement".concat(String.valueOf(this.f37615OooO00o.zzau().getPackageName())).hashCode());
        }
        return this.f16280OooO0o.intValue();
    }

    public final PendingIntent OooO0Oo() {
        Context contextZzau = this.f37615OooO00o.zzau();
        return PendingIntent.getBroadcast(contextZzau, 0, new Intent().setClassName(contextZzau, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    public final OooOOO OooO0o0() {
        if (this.f16281OooO0o0 == null) {
            this.f16281OooO0o0 = new o0O0OOO0(this, this.f37794OooO0O0.f16294OooOO0o);
        }
        return this.f16281OooO0o0;
    }

    public final void zza() {
        OooO00o();
        Oooo0.OooO00o(this.f37615OooO00o, "Unscheduling upload");
        AlarmManager alarmManager = this.f16279OooO0Oo;
        if (alarmManager != null) {
            alarmManager.cancel(OooO0Oo());
        }
        OooO0o0().OooO00o();
        if (Build.VERSION.SDK_INT >= 24) {
            zzj();
        }
    }

    public final void zzd(long j) {
        OooO00o();
        this.f37615OooO00o.zzaw();
        Context contextZzau = this.f37615OooO00o.zzau();
        if (!zzlh.OooOooO(contextZzau)) {
            this.f37615OooO00o.zzay().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlh.OooOooo(contextZzau)) {
            this.f37615OooO00o.zzay().zzc().zza("Service not registered/enabled");
        }
        zza();
        this.f37615OooO00o.zzay().zzj().zzb("Scheduling upload, millis", Long.valueOf(j));
        long jElapsedRealtime = this.f37615OooO00o.zzav().elapsedRealtime() + j;
        this.f37615OooO00o.zzf();
        if (j < Math.max(0L, ((Long) zzeb.zzw.zza(null)).longValue())) {
            if (!(OooO0o0().f37500OooO0OO != 0)) {
                OooO0o0().OooO0OO(j);
            }
        }
        this.f37615OooO00o.zzaw();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f16279OooO0Oo;
            if (alarmManager != null) {
                this.f37615OooO00o.zzf();
                alarmManager.setInexactRepeating(2, jElapsedRealtime, Math.max(((Long) zzeb.zzr.zza(null)).longValue(), j), OooO0Oo());
                return;
            }
            return;
        }
        Context contextZzau2 = this.f37615OooO00o.zzau();
        ComponentName componentName = new ComponentName(contextZzau2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iOooO0OO = OooO0OO();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(NativeProtocol.WEB_DIALOG_ACTION, "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(contextZzau2, new JobInfo.Builder(iOooO0OO, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    @TargetApi(24)
    public final void zzj() {
        JobScheduler jobScheduler = (JobScheduler) this.f37615OooO00o.zzau().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(OooO0OO());
        }
    }
}
