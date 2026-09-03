package o0OOOOO;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.exoplayer2.ui.oo0o0Oo;
import com.twitter.sdk.android.core.o0OoOo0;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0.AbstractC0460OooO0O0 f43625OooO0Oo;

    public OooO00o(OooOO0O oooOO0O) {
        this.f43625OooO0Oo = oooOO0O;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f43625OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f43625OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f43625OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f43625OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f43625OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean z;
        OooOOO0 oooOOO0 = ((OooOO0O) this.f43625OooO0Oo).f43633OooO00o;
        o0OoOo0 o0oooo0OooO0OO = ((com.twitter.sdk.android.core.OooOOO0) oooOOO0.f43636OooO0OO).OooO0OO();
        oooOOO0.f43635OooO0O0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        if (o0oooo0OooO0OO != null) {
            OooOOO0.OooO00o oooO00o = oooOOO0.f43634OooO00o;
            synchronized (oooO00o) {
                long j = oooO00o.f43640OooO0O0;
                boolean z3 = jCurrentTimeMillis - j > 21600000;
                Calendar calendar = oooO00o.f43641OooO0OO;
                calendar.setTimeInMillis(jCurrentTimeMillis);
                int i = calendar.get(6);
                int i2 = calendar.get(1);
                calendar.setTimeInMillis(j);
                boolean z4 = !(i == calendar.get(6) && i2 == calendar.get(1));
                if (oooO00o.f43639OooO00o || !(z3 || z4)) {
                    z = false;
                } else {
                    oooO00o.f43639OooO00o = true;
                    z = true;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            oooOOO0.f43637OooO0Oo.submit(new oo0o0Oo(oooOOO0, 1));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f43625OooO0Oo.getClass();
    }
}
