package com.twitter.sdk.android.core;

import android.app.Application;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Application application;
        o0OOO0o o0ooo0o2 = o0OOO0o.f22219OooO0oo;
        o0ooo0o2.f22220OooO00o.OooO0OO();
        o0ooo0o2.f22221OooO0O0.OooO0OO();
        o0ooo0o2.OooO0O0();
        o0OOOOO.OooO0O0 oooO0O0 = o00Oo0.OooO0O0().f22212OooO0Oo;
        o0OOOOO.OooOOO0<o0Oo0oo> oooOOO0 = o0ooo0o2.f22222OooO0OO;
        oooOOO0.getClass();
        o0OOOOO.OooOO0O oooOO0O = new o0OOOOO.OooOO0O(oooOOO0);
        o0OOOOO.OooO0O0.OooO00o oooO00o = oooO0O0.f43626OooO00o;
        if (oooO00o == null || (application = oooO00o.f43628OooO0O0) == null) {
            return;
        }
        o0OOOOO.OooO00o oooO00o2 = new o0OOOOO.OooO00o(oooOO0O);
        application.registerActivityLifecycleCallbacks(oooO00o2);
        oooO00o.f43627OooO00o.add(oooO00o2);
    }
}
