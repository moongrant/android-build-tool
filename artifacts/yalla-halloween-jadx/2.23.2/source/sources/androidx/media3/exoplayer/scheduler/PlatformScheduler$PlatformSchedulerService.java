package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import androidx.media3.common.util.Log;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int iOooO00o = new Requirements(extras.getInt("requirements")).OooO00o(this);
        if (iOooO00o != 0) {
            Log.OooO0o("PlatformScheduler", "Requirements not met: " + iOooO00o);
            jobFinished(jobParameters, true);
            return false;
        }
        String string = extras.getString("service_action");
        string.getClass();
        String string2 = extras.getString("service_package");
        string2.getClass();
        Intent intent = new Intent(string).setPackage(string2);
        if (o00.f34910OooO00o >= 26) {
            startForegroundService(intent);
            return false;
        }
        startService(intent);
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
