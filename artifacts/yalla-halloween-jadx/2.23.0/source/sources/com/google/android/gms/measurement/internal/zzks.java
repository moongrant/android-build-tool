package com.google.android.gms.measurement.internal;

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
import p269o00ooooo.o0O0oo00;
import p269o00ooooo.oOOO00Oo;
import p269o00ooooo.oOOO0O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzks extends oOOO0O0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AlarmManager f16076OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Integer f16077OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public oOOO00Oo f16078OooO0o0;

    public zzks(zzlh zzlhVar) {
        super(zzlhVar);
        this.f16076OooO0Oo = (AlarmManager) this.f41276OooO00o.zzaw().getSystemService("alarm");
    }

    @Override // p269o00ooooo.oOOO0O0o
    public final void OooO0O0() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.f16076OooO0Oo;
        if (alarmManager != null) {
            alarmManager.cancel(OooO0Oo());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) this.f41276OooO00o.zzaw().getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(OooO0OO());
    }

    public final int OooO0OO() {
        if (this.f16077OooO0o == null) {
            this.f16077OooO0o = Integer.valueOf("measurement".concat(String.valueOf(this.f41276OooO00o.zzaw().getPackageName())).hashCode());
        }
        return this.f16077OooO0o.intValue();
    }

    public final PendingIntent OooO0Oo() {
        Context contextZzaw = this.f41276OooO00o.zzaw();
        return PendingIntent.getBroadcast(contextZzaw, 0, new Intent().setClassName(contextZzaw, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzbs.zza);
    }

    public final o0O0oo00 OooO0o0() {
        if (this.f16078OooO0o0 == null) {
            this.f16078OooO0o0 = new oOOO00Oo(this, this.f41477OooO0O0.f16091OooOO0o);
        }
        return this.f16078OooO0o0;
    }

    public final void zza() {
        JobScheduler jobScheduler;
        OooO00o();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzaA().zzj().zza("Unscheduling upload");
        AlarmManager alarmManager = this.f16076OooO0Oo;
        if (alarmManager != null) {
            alarmManager.cancel(OooO0Oo());
        }
        OooO0o0().OooO00o();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) zzgdVar.zzaw().getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(OooO0OO());
    }

    public final void zzd(long j) {
        OooO00o();
        zzgd zzgdVar = this.f41276OooO00o;
        zzgdVar.zzay();
        Context contextZzaw = zzgdVar.zzaw();
        if (!zzlp.OooOoo(contextZzaw)) {
            zzgdVar.zzaA().zzc().zza("Receiver not registered/enabled");
        }
        if (!zzlp.OooOooO(contextZzaw)) {
            zzgdVar.zzaA().zzc().zza("Service not registered/enabled");
        }
        zza();
        zzgdVar.zzaA().zzj().zzb("Scheduling upload, millis", Long.valueOf(j));
        long jElapsedRealtime = zzgdVar.zzax().elapsedRealtime() + j;
        zzgdVar.zzf();
        if (j < Math.max(0L, ((Long) zzeg.zzx.zza(null)).longValue())) {
            if (!(OooO0o0().f41180OooO0OO != 0)) {
                OooO0o0().OooO0OO(j);
            }
        }
        zzgdVar.zzay();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f16076OooO0Oo;
            if (alarmManager != null) {
                zzgdVar.zzf();
                alarmManager.setInexactRepeating(2, jElapsedRealtime, Math.max(((Long) zzeg.zzs.zza(null)).longValue(), j), OooO0Oo());
                return;
            }
            return;
        }
        Context contextZzaw2 = zzgdVar.zzaw();
        ComponentName componentName = new ComponentName(contextZzaw2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iOooO0OO = OooO0OO();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(NativeProtocol.WEB_DIALOG_ACTION, "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzbt.zza(contextZzaw2, new JobInfo.Builder(iOooO0OO, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
