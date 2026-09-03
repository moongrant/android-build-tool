package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.facebook.bolts.AppLinks;
import p028Oooo0oO.o00Oo00;
import p191o00o0O0O.Oooo0;
import p191o00o0O0O.o000000;
import p191o00o0O0O.o0Oo0oo;
import p196o00o0Oo.o000Oo0;
import p196o00o0Oo.o00O0000;
import p202o00o0o0O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f10877OooO0Oo = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(AppLinks.KEY_NAME_EXTRAS);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        o000000.OooO0O0(getApplicationContext());
        Oooo0.OooO00o OooO00o2 = o0Oo0oo.OooO00o();
        OooO00o2.OooO0O0(string);
        OooO00o2.OooO0OO(o00000O0.OooO0O0(i));
        if (string2 != null) {
            OooO00o2.f38911OooO0O0 = Base64.decode(string2, 0);
        }
        o00O0000 o00o0001 = o000000.OooO00o().f38927OooO0Oo;
        Oooo0 oooo0OooO00o = OooO00o2.OooO00o();
        o00Oo00 o00oo00 = new o00Oo00(this, jobParameters, 1);
        o00o0001.getClass();
        o00o0001.f39026OooO0o0.execute(new o000Oo0(o00o0001, oooo0OooO00o, i2, o00oo00));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
