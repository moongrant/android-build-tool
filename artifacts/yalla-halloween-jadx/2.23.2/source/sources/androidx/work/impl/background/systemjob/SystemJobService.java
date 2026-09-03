package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import o00O0OO.OooOo;
import oo00o.OooO;
import oo00o.o00000O0;
import oo00o.o0OOO0o;
import oo00o.o0ooOOo;
import p115o00O00oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobService extends JobService implements OooO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f11549OooO0oO = o0Oo0oo.OooO0o("SystemJobService");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00000O0 f11550OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashMap f11552OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOO0o f11551OooO0o = new o0OOO0o();

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static String[] OooO00o(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        @DoNotInline
        public static Uri[] OooO0O0(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    @RequiresApi(28)
    public static class OooO0O0 {
        @DoNotInline
        public static Network OooO00o(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    @Nullable
    public static OooOo OooO00o(@NonNull JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new OooOo(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // oo00o.OooO
    public final void OooO0Oo(@NonNull OooOo oooOo, boolean z) {
        JobParameters jobParameters;
        o0Oo0oo.OooO0Oo().OooO00o(f11549OooO0oO, oooOo.f36202OooO00o + " executed on JobScheduler");
        synchronized (this.f11552OooO0o0) {
            jobParameters = (JobParameters) this.f11552OooO0o0.remove(oooOo);
        }
        this.f11551OooO0o.OooO0OO(oooOo);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            o00000O0 o00000o0OooO0Oo = o00000O0.OooO0Oo(getApplicationContext());
            this.f11550OooO0Oo = o00000o0OooO0Oo;
            o00000o0OooO0Oo.f60223OooO0o.OooO00o(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o0Oo0oo.OooO0Oo().OooO0oO(f11549OooO0oO, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        o00000O0 o00000o1 = this.f11550OooO0Oo;
        if (o00000o1 != null) {
            o00000o1.f60223OooO0o.OooO0oO(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters) {
        WorkerParameters.OooO00o oooO00o;
        if (this.f11550OooO0Oo == null) {
            o0Oo0oo.OooO0Oo().OooO00o(f11549OooO0oO, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        OooOo oooOoOooO00o = OooO00o(jobParameters);
        if (oooOoOooO00o == null) {
            o0Oo0oo.OooO0Oo().OooO0O0(f11549OooO0oO, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f11552OooO0o0) {
            if (this.f11552OooO0o0.containsKey(oooOoOooO00o)) {
                o0Oo0oo.OooO0Oo().OooO00o(f11549OooO0oO, "Job is already being executed by SystemJobService: " + oooOoOooO00o);
                return false;
            }
            o0Oo0oo.OooO0Oo().OooO00o(f11549OooO0oO, "onStartJob for " + oooOoOooO00o);
            this.f11552OooO0o0.put(oooOoOooO00o, jobParameters);
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                oooO00o = new WorkerParameters.OooO00o();
                if (OooO00o.OooO0O0(jobParameters) != null) {
                    oooO00o.f11494OooO0O0 = Arrays.asList(OooO00o.OooO0O0(jobParameters));
                }
                if (OooO00o.OooO00o(jobParameters) != null) {
                    oooO00o.f11493OooO00o = Arrays.asList(OooO00o.OooO00o(jobParameters));
                }
                if (i >= 28) {
                    OooO0O0.OooO00o(jobParameters);
                }
            } else {
                oooO00o = null;
            }
            this.f11550OooO0Oo.OooO0oo(this.f11551OooO0o.OooO0Oo(oooOoOooO00o), oooO00o);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters) {
        if (this.f11550OooO0Oo == null) {
            o0Oo0oo.OooO0Oo().OooO00o(f11549OooO0oO, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        OooOo oooOoOooO00o = OooO00o(jobParameters);
        if (oooOoOooO00o == null) {
            o0Oo0oo.OooO0Oo().OooO0O0(f11549OooO0oO, "WorkSpec id not found!");
            return false;
        }
        o0Oo0oo.OooO0Oo().OooO00o(f11549OooO0oO, "onStopJob for " + oooOoOooO00o);
        synchronized (this.f11552OooO0o0) {
            this.f11552OooO0o0.remove(oooOoOooO00o);
        }
        o0ooOOo o0oooooOooO0OO = this.f11551OooO0o.OooO0OO(oooOoOooO00o);
        if (o0oooooOooO0OO != null) {
            this.f11550OooO0Oo.OooO(o0oooooOooO0OO);
        }
        return !this.f11550OooO0Oo.f60223OooO0o.OooO0o0(oooOoOooO00o.f36202OooO00o);
    }
}
