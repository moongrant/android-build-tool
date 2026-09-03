package o0O0OOO;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.facebook.bolts.AppLinks;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p286o0O0O0oO.o0OO00O;
import p290o0O0OOoo.o000OO;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 21)
public final class OooO0O0 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f35560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0OOOo.OooO0o f35561OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SchedulerConfig f35562OooO0OO;

    public OooO0O0(Context context, o0O0OOOo.OooO0o oooO0o, SchedulerConfig schedulerConfig) {
        this.f35560OooO00o = context;
        this.f35561OooO0O0 = oooO0o;
        this.f35562OooO0OO = schedulerConfig;
    }

    @Override // o0O0OOO.o00O0O
    public final void OooO00o(o0OO00O o0oo00o2, int i) {
        OooO0O0(o0oo00o2, i, false);
    }

    @Override // o0O0OOO.o00O0O
    public final void OooO0O0(o0OO00O o0oo00o2, int i, boolean z) {
        boolean z2;
        ComponentName componentName = new ComponentName(this.f35560OooO00o, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f35560OooO00o.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f35560OooO00o.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(o0oo00o2.OooO0O0().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(o000OO.OooO00o(o0oo00o2.OooO0Oo())).array());
        if (o0oo00o2.OooO0OO() != null) {
            adler32.update(o0oo00o2.OooO0OO());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (it.hasNext()) {
                    JobInfo next = it.next();
                    int i2 = next.getExtras().getInt("attemptNumber");
                    if (next.getId() == value) {
                        if (i2 >= i) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                break;
            }
            if (z2) {
                o0O0OO.OooO00o.OooO00o("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", o0oo00o2);
                return;
            }
        }
        long jO00o0O = this.f35561OooO0O0.o00o0O(o0oo00o2);
        SchedulerConfig schedulerConfig = this.f35562OooO0OO;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority priorityOooO0Oo = o0oo00o2.OooO0Oo();
        builder.setMinimumLatency(schedulerConfig.OooO0O0(priorityOooO0Oo, jO00o0O, i));
        Set<SchedulerConfig.Flag> setOooO0OO = schedulerConfig.OooO0OO().get(priorityOooO0Oo).OooO0OO();
        if (setOooO0OO.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setOooO0OO.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (setOooO0OO.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", o0oo00o2.OooO0O0());
        persistableBundle.putInt("priority", o000OO.OooO00o(o0oo00o2.OooO0Oo()));
        if (o0oo00o2.OooO0OO() != null) {
            persistableBundle.putString(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(o0oo00o2.OooO0OO(), 0));
        }
        builder.setExtras(persistableBundle);
        o0O0OO.OooO00o.OooO0O0("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", o0oo00o2, Integer.valueOf(value), Long.valueOf(this.f35562OooO0OO.OooO0O0(o0oo00o2.OooO0Oo(), jO00o0O, i)), Long.valueOf(jO00o0O), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }
}
