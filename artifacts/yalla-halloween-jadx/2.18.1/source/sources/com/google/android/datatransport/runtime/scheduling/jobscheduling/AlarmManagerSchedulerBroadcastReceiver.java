package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.facebook.bolts.AppLinks;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import o0O0OOO.OooO0OO;
import o0O0OOO.OooOo;
import p286o0O0O0oO.o000000;
import p286o0O0O0oO.o0OO00O;
import p286o0O0O0oO.o0OoOo0;
import p290o0O0OOoo.o000OO;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f13085OooO00o = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(AppLinks.KEY_NAME_EXTRAS);
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o000000.OooO0O0(context);
        o0OO00O.OooO00o OooO00o2 = o0OO00O.OooO00o();
        OooO00o2.OooO00o(queryParameter);
        o0OoOo0.OooO00o oooO00o = (o0OoOo0.OooO00o) OooO00o2;
        oooO00o.f35510OooO0OO = o000OO.OooO0O0(iIntValue);
        if (queryParameter2 != null) {
            oooO00o.f35509OooO0O0 = Base64.decode(queryParameter2, 0);
        }
        OooOo oooOo = o000000.OooO00o().f35469OooO0Oo;
        oooOo.f35587OooO0o0.execute(new OooO0OO(oooOo, oooO00o.OooO0O0(), i, new Runnable() { // from class: o0O0OOO.OooO00o
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = AlarmManagerSchedulerBroadcastReceiver.f13085OooO00o;
            }
        }));
    }
}
