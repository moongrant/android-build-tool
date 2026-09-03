package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.OooO0o;
import com.facebook.bolts.AppLinks;
import o0O0OOO.OooO0OO;
import o0O0OOO.OooOo;
import p286o0O0O0oO.o000000;
import p286o0O0O0oO.o0OO00O;
import p286o0O0O0oO.o0OoOo0;
import p290o0O0OOoo.o000OO;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final /* synthetic */ int f13086Oooo0o = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(AppLinks.KEY_NAME_EXTRAS);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        o000000.OooO0O0(getApplicationContext());
        o0OO00O.OooO00o OooO00o2 = o0OO00O.OooO00o();
        OooO00o2.OooO00o(string);
        o0OoOo0.OooO00o oooO00o = (o0OoOo0.OooO00o) OooO00o2;
        oooO00o.f35510OooO0OO = o000OO.OooO0O0(i);
        if (string2 != null) {
            oooO00o.f35509OooO0O0 = Base64.decode(string2, 0);
        }
        OooOo oooOo = o000000.OooO00o().f35469OooO0Oo;
        oooOo.f35587OooO0o0.execute(new OooO0OO(oooOo, oooO00o.OooO0O0(), i2, new OooO0o(this, jobParameters, 1)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
