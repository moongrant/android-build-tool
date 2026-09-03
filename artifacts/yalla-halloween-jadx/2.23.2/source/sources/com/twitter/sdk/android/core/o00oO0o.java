package com.twitter.sdk.android.core;

import android.app.Application;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00oO0o implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Application application;
        o0ooOOo o0ooooo = o0ooOOo.f21752OooO0oo;
        o0ooooo.f21753OooO00o.OooO0OO();
        o0ooooo.f21754OooO0O0.OooO0OO();
        o0ooooo.OooO0O0();
        o0OOOOOO.OooO0O0 oooO0O0 = o00O0O.OooO0O0().f21741OooO0Oo;
        o0OOOOOO.OooOOO0<o0OOO0o> oooOOO0 = o0ooooo.f21755OooO0OO;
        oooOOO0.getClass();
        o0OOOOOO.OooOO0O oooOO0O = new o0OOOOOO.OooOO0O(oooOOO0);
        o0OOOOOO.OooO0O0.OooO00o oooO00o = oooO0O0.f42822OooO00o;
        if (oooO00o == null || (application = oooO00o.f42824OooO0O0) == null) {
            return;
        }
        o0OOOOOO.OooO00o oooO00o2 = new o0OOOOOO.OooO00o(oooOO0O);
        application.registerActivityLifecycleCallbacks(oooO00o2);
        oooO00o.f42823OooO00o.add(oooO00o2);
    }
}
