package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.facebook.bolts.AppLinks;
import p037OoooOo0.o0000Ooo;
import p238o00oOooo.o0O0o000;
import p238o00oOooo.o0OO00OO;
import p238o00oOooo.o0OOooO0;
import p246o00oo0Oo.o0000;
import p246o00oo0Oo.o000O000;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f13925OooO0Oo = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(AppLinks.KEY_NAME_EXTRAS);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        o0OOooO0.OooO0O0(getApplicationContext());
        o0O0o000.OooO00o OooO00o2 = o0OO00OO.OooO00o();
        OooO00o2.OooO0O0(string);
        OooO00o2.OooO0OO(o0O0o.OooO00o.OooO0O0(i));
        if (string2 != null) {
            OooO00o2.f40009OooO0O0 = Base64.decode(string2, 0);
        }
        o000O000 o000o001 = o0OOooO0.OooO00o().f40039OooO0Oo;
        o0O0o000 o0o0o000OooO00o = OooO00o2.OooO00o();
        o0000Ooo o0000ooo = new o0000Ooo(1, this, jobParameters);
        o000o001.getClass();
        o000o001.f40148OooO0o0.execute(new o0000(o000o001, o0o0o000OooO00o, i2, o0000ooo));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
