package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import java.util.Objects;
import o00O00O.OooO0OO;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iOooO00o = new Requirements(extras.getInt("requirements")).OooO00o(this);
        if (iOooO00o != 0) {
            OooO0OO.OooO0O0(33, "Requirements not met: ", iOooO00o, "PlatformScheduler");
            jobFinished(jobParameters, true);
            return false;
        }
        String string = extras.getString("service_action");
        Objects.requireNonNull(string);
        String string2 = extras.getString("service_package");
        Objects.requireNonNull(string2);
        o000OOo0.Oooo00O(this, new Intent(string).setPackage(string2));
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
