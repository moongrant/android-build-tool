package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.facebook.bolts.AppLinks;
import p238o00oOooo.o0O0o000;
import p238o00oOooo.o0OO00OO;
import p238o00oOooo.o0OOooO0;
import p246o00oo0Oo.o0000;
import p246o00oo0Oo.o000O000;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f13924OooO00o = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(AppLinks.KEY_NAME_EXTRAS);
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        o0OOooO0.OooO0O0(context);
        o0O0o000.OooO00o OooO00o2 = o0OO00OO.OooO00o();
        OooO00o2.OooO0O0(queryParameter);
        OooO00o2.OooO0OO(o0O0o.OooO00o.OooO0O0(iIntValue));
        if (queryParameter2 != null) {
            OooO00o2.f40009OooO0O0 = Base64.decode(queryParameter2, 0);
        }
        o000O000 o000o001 = o0OOooO0.OooO00o().f40039OooO0Oo;
        o0O0o000 o0o0o000OooO00o = OooO00o2.OooO00o();
        com.facebook.appevents.OooO00o oooO00o = new com.facebook.appevents.OooO00o(1);
        o000o001.getClass();
        o000o001.f40148OooO0o0.execute(new o0000(o000o001, o0o0o000OooO00o, i, oooO00o));
    }
}
