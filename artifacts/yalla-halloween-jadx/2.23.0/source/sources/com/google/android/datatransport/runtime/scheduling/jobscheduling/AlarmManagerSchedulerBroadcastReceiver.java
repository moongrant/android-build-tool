package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.facebook.bolts.AppLinks;
import p191o00o0O0O.Oooo0;
import p191o00o0O0O.o000000;
import p191o00o0O0O.o0Oo0oo;
import p196o00o0Oo.o000O000;
import p196o00o0Oo.o000Oo0;
import p196o00o0Oo.o00O0000;
import p202o00o0o0O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f10876OooO00o = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(AppLinks.KEY_NAME_EXTRAS);
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o000000.OooO0O0(context);
        Oooo0.OooO00o OooO00o2 = o0Oo0oo.OooO00o();
        OooO00o2.OooO0O0(queryParameter);
        OooO00o2.OooO0OO(o00000O0.OooO0O0(iIntValue));
        if (queryParameter2 != null) {
            OooO00o2.f38911OooO0O0 = Base64.decode(queryParameter2, 0);
        }
        o00O0000 o00o0001 = o000000.OooO00o().f38927OooO0Oo;
        Oooo0 oooo0OooO00o = OooO00o2.OooO00o();
        o000O000 o000o001 = new o000O000();
        o00o0001.getClass();
        o00o0001.f39026OooO0o0.execute(new o000Oo0(o00o0001, oooo0OooO00o, i, o000o001));
    }
}
