package p246o00oo0Oo;

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
import o0O0o.OooO00o;
import p238o00oOooo.o0OO00OO;
import p244o00oo0O0.o00000OO;
import p248o00oo0o0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public final class o0000Ooo implements o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f40132OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000oo f40133OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SchedulerConfig f40134OooO0OO;

    public o0000Ooo(Context context, o0000oo o0000ooVar, SchedulerConfig schedulerConfig) {
        this.f40132OooO00o = context;
        this.f40133OooO0O0 = o0000ooVar;
        this.f40134OooO0OO = schedulerConfig;
    }

    @Override // p246o00oo0Oo.o000O0
    public final void OooO00o(o0OO00OO o0oo00oo2, int i) {
        OooO0O0(o0oo00oo2, i, false);
    }

    @Override // p246o00oo0Oo.o000O0
    public final void OooO0O0(o0OO00OO o0oo00oo2, int i, boolean z) {
        boolean z2;
        Context context = this.f40132OooO00o;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(o0oo00oo2.OooO0O0().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(OooO00o.OooO00o(o0oo00oo2.OooO0Oo())).array());
        if (o0oo00oo2.OooO0OO() != null) {
            adler32.update(o0oo00oo2.OooO0OO());
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
                o00000OO.OooO00o(o0oo00oo2, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        long jOooOoOO = this.f40133OooO0O0.OooOoOO(o0oo00oo2);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority priorityOooO0Oo = o0oo00oo2.OooO0Oo();
        SchedulerConfig schedulerConfig = this.f40134OooO0OO;
        builder.setMinimumLatency(schedulerConfig.OooO0O0(priorityOooO0Oo, jOooOoOO, i));
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
        persistableBundle.putString("backendName", o0oo00oo2.OooO0O0());
        persistableBundle.putInt("priority", OooO00o.OooO00o(o0oo00oo2.OooO0Oo()));
        if (o0oo00oo2.OooO0OO() != null) {
            persistableBundle.putString(AppLinks.KEY_NAME_EXTRAS, Base64.encodeToString(o0oo00oo2.OooO0OO(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {o0oo00oo2, Integer.valueOf(value), Long.valueOf(schedulerConfig.OooO0O0(o0oo00oo2.OooO0Oo(), jOooOoOO, i)), Long.valueOf(jOooOoOO), Integer.valueOf(i)};
        String strOooO0OO = o00000OO.OooO0OO("JobInfoScheduler");
        if (Log.isLoggable(strOooO0OO, 3)) {
            Log.d(strOooO0OO, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
