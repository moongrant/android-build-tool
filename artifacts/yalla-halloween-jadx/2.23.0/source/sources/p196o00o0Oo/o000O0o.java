package p196o00o0Oo;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
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
import p191o00o0O0O.o0Oo0oo;
import p195o00o0OOo.o000O0O0;
import p198o00o0OoO.o00;
import p202o00o0o0O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public final class o000O0o implements o00O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f39004OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00 f39005OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SchedulerConfig f39006OooO0OO;

    public o000O0o(Context context, o00 o00Var, SchedulerConfig schedulerConfig) {
        this.f39004OooO00o = context;
        this.f39005OooO0O0 = o00Var;
        this.f39006OooO0OO = schedulerConfig;
    }

    @Override // p196o00o0Oo.o00O00
    public final void OooO00o(o0Oo0oo o0oo0oo2, int i, boolean z) {
        boolean z2;
        Context context = this.f39004OooO00o;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(o0oo0oo2.OooO0O0().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(o00000O0.OooO00o(o0oo0oo2.OooO0Oo())).array());
        if (o0oo0oo2.OooO0OO() != null) {
            adler32.update(o0oo0oo2.OooO0OO());
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
                o000O0O0.OooO00o(o0oo0oo2, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        long jO00000oO = this.f39005OooO0O0.o00000oO(o0oo0oo2);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority priorityOooO0Oo = o0oo0oo2.OooO0Oo();
        SchedulerConfig schedulerConfig = this.f39006OooO0OO;
        builder.setMinimumLatency(schedulerConfig.OooO0O0(priorityOooO0Oo, jO00000oO, i));
        Set<SchedulerConfig.Flag> setOooO0O0 = schedulerConfig.OooO0OO().get(priorityOooO0Oo).OooO0O0();
        if (setOooO0O0.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setOooO0O0.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (setOooO0O0.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", o0oo0oo2.OooO0O0());
        persistableBundle.putInt("priority", o00000O0.OooO00o(o0oo0oo2.OooO0Oo()));
        if (o0oo0oo2.OooO0OO() != null) {
            persistableBundle.putString(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(o0oo0oo2.OooO0OO(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {o0oo0oo2, Integer.valueOf(value), Long.valueOf(schedulerConfig.OooO0O0(o0oo0oo2.OooO0Oo(), jO00000oO, i)), Long.valueOf(jO00000oO), Integer.valueOf(i)};
        String strOooO0OO = o000O0O0.OooO0OO("JobInfoScheduler");
        if (Log.isLoggable(strOooO0OO, 3)) {
            Log.d(strOooO0OO, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }

    @Override // p196o00o0Oo.o00O00
    public final void OooO0O0(o0Oo0oo o0oo0oo2, int i) {
        OooO00o(o0oo0oo2, i, false);
    }
}
