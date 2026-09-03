package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.OooOOOO;
import p085o000OooO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements OooOOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f8464OooO0o = o000oOoO.OooO0o0("SystemJobService");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0OOO0o f8465OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f8466OooO0o0 = new HashMap();

    @Override // p085o000OooO.OooOOOO
    public final void OooO0o0(@NonNull String str, boolean z) {
        JobParameters jobParameters;
        o000oOoO.OooO0OO().OooO00o(f8464OooO0o, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f8466OooO0o0) {
            jobParameters = (JobParameters) this.f8466OooO0o0.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o0OOO0o o0ooo0oOooO0OO = o0OOO0o.OooO0OO(getApplicationContext());
            this.f8465OooO0Oo = o0ooo0oOooO0OO;
            o0ooo0oOooO0OO.f35162OooO0o.OooO00o(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o000oOoO.OooO0OO().OooO0o(f8464OooO0o, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o0OOO0o o0ooo0o2 = this.f8465OooO0Oo;
        if (o0ooo0o2 != null) {
            o0ooo0o2.f35162OooO0o.OooO0o(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        String string;
        if (this.f8465OooO0Oo == null) {
            o000oOoO.OooO0OO().OooO00o(f8464OooO0o, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        WorkerParameters.OooO00o oooO00o = null;
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            o000oOoO.OooO0OO().OooO0O0(f8464OooO0o, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f8466OooO0o0) {
            if (this.f8466OooO0o0.containsKey(string)) {
                o000oOoO.OooO0OO().OooO00o(f8464OooO0o, String.format("Job is already being executed by SystemJobService: %s", string), new Throwable[0]);
                return false;
            }
            o000oOoO.OooO0OO().OooO00o(f8464OooO0o, String.format("onStartJob for %s", string), new Throwable[0]);
            this.f8466OooO0o0.put(string, jobParameters);
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                oooO00o = new WorkerParameters.OooO00o();
                if (jobParameters.getTriggeredContentUris() != null) {
                    oooO00o.f8400OooO0O0 = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    oooO00o.f8399OooO00o = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    jobParameters.getNetwork();
                }
            }
            this.f8465OooO0Oo.OooO0oO(string, oooO00o);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        String string;
        if (this.f8465OooO0Oo == null) {
            o000oOoO.OooO0OO().OooO00o(f8464OooO0o, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            o000oOoO.OooO0OO().OooO0O0(f8464OooO0o, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        o000oOoO.OooO0OO().OooO00o(f8464OooO0o, String.format("onStopJob for %s", string), new Throwable[0]);
        synchronized (this.f8466OooO0o0) {
            this.f8466OooO0o0.remove(string);
        }
        this.f8465OooO0Oo.OooO0oo(string);
        return !this.f8465OooO0Oo.f35162OooO0o.OooO0OO(string);
    }
}
