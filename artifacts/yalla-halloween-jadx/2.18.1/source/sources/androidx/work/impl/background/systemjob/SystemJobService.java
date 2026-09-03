package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o00O000.OooO0O0;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.OooOo;
import p107o000ooO0.o00oO0o;
import p326o0O0ooO.o00O00o0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements OooOOOO {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final String f9820Oooo0oo = o0OoOo0.OooO0o0("SystemJobService");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o00oO0o f9821Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Map<String, JobParameters> f9822Oooo0oO = new HashMap();

    @Nullable
    public static String OooO00o(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, android.app.job.JobParameters>] */
    @Override // p107o000ooO0.OooOOOO
    public final void OooO0Oo(@NonNull String str, boolean z) {
        JobParameters jobParameters;
        o0OoOo0.OooO0OO().OooO00o(f9820Oooo0oo, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f9822Oooo0oO) {
            jobParameters = (JobParameters) this.f9822Oooo0oO.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o00oO0o o00oo0oOooO0O0 = o00oO0o.OooO0O0(getApplicationContext());
            this.f9821Oooo0o = o00oo0oOooO0O0;
            o00oo0oOooO0O0.f29978OooO0o.OooO00o(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o0OoOo0.OooO0OO().OooO0o(f9820Oooo0oo, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o00oO0o o00oo0o2 = this.f9821Oooo0o;
        if (o00oo0o2 != null) {
            o00oo0o2.f29978OooO0o.OooO0o0(this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, android.app.job.JobParameters>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap, java.util.Map<java.lang.String, android.app.job.JobParameters>] */
    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        if (this.f9821Oooo0o == null) {
            o0OoOo0.OooO0OO().OooO00o(f9820Oooo0oo, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strOooO00o = OooO00o(jobParameters);
        if (TextUtils.isEmpty(strOooO00o)) {
            o0OoOo0.OooO0OO().OooO0O0(f9820Oooo0oo, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f9822Oooo0oO) {
            if (this.f9822Oooo0oO.containsKey(strOooO00o)) {
                o0OoOo0.OooO0OO().OooO00o(f9820Oooo0oo, String.format("Job is already being executed by SystemJobService: %s", strOooO00o), new Throwable[0]);
                return false;
            }
            o0OoOo0.OooO0OO().OooO00o(f9820Oooo0oo, String.format("onStartJob for %s", strOooO00o), new Throwable[0]);
            this.f9822Oooo0oO.put(strOooO00o, jobParameters);
            WorkerParameters.OooO00o oooO00o = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                oooO00o = new WorkerParameters.OooO00o();
                if (jobParameters.getTriggeredContentUris() != null) {
                    oooO00o.f9755OooO0O0 = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    oooO00o.f9754OooO00o = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    jobParameters.getNetwork();
                }
            }
            o00oO0o o00oo0o2 = this.f9821Oooo0o;
            ((OooO0O0) o00oo0o2.f29977OooO0Oo).OooO00o(new o00O00o0(o00oo0o2, strOooO00o, oooO00o));
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.HashMap, java.util.Map<java.lang.String, android.app.job.JobParameters>] */
    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        boolean zContains;
        if (this.f9821Oooo0o == null) {
            o0OoOo0.OooO0OO().OooO00o(f9820Oooo0oo, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strOooO00o = OooO00o(jobParameters);
        if (TextUtils.isEmpty(strOooO00o)) {
            o0OoOo0.OooO0OO().OooO0O0(f9820Oooo0oo, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        o0OoOo0.OooO0OO().OooO00o(f9820Oooo0oo, String.format("onStopJob for %s", strOooO00o), new Throwable[0]);
        synchronized (this.f9822Oooo0oO) {
            this.f9822Oooo0oO.remove(strOooO00o);
        }
        this.f9821Oooo0o.OooO0o(strOooO00o);
        OooOo oooOo = this.f9821Oooo0o.f29978OooO0o;
        synchronized (oooOo.f29950OoooOOO) {
            zContains = oooOo.f29949OoooOO0.contains(strOooO00o);
        }
        return !zContains;
    }
}
