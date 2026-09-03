package com.facebook.appevents;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13635OooO0Oo;

    public /* synthetic */ OooO00o(int i) {
        this.f13635OooO0Oo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13635OooO0Oo) {
            case 0:
                AnalyticsUserIDStore.m4056initStore$lambda0();
                break;
            default:
                int i = AlarmManagerSchedulerBroadcastReceiver.f13924OooO00o;
                break;
        }
    }
}
