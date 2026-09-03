package com.facebook.appevents;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12728Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12729OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12730OoooO00;

    public /* synthetic */ OooO0o(Object obj, Object obj2, int i) {
        this.f12728Oooo = i;
        this.f12730OoooO00 = obj;
        this.f12729OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12728Oooo) {
            case 0:
                AppEventQueue.m115handleResponse$lambda5((AccessTokenAppIdPair) this.f12730OoooO00, (SessionEventsState) this.f12729OoooO0);
                break;
            default:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f12730OoooO00;
                JobParameters jobParameters = (JobParameters) this.f12729OoooO0;
                int i = JobInfoSchedulerService.f13103Oooo;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                break;
        }
    }
}
