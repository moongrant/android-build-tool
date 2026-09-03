package com.facebook.appevents;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12712Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12713Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12714Oooo0oo;

    public /* synthetic */ OooO0o(Object obj, Object obj2, int i) {
        this.f12712Oooo0o = i;
        this.f12713Oooo0oO = obj;
        this.f12714Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12712Oooo0o) {
            case 0:
                AppEventQueue.m115handleResponse$lambda5((AccessTokenAppIdPair) this.f12713Oooo0oO, (SessionEventsState) this.f12714Oooo0oo);
                break;
            default:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f12713Oooo0oO;
                JobParameters jobParameters = (JobParameters) this.f12714Oooo0oo;
                int i = JobInfoSchedulerService.f13086Oooo0o;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                break;
        }
    }
}
