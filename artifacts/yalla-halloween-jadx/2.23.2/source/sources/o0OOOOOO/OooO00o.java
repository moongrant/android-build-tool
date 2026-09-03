package o0OOOOOO;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o0OOO0o;
import com.twitter.sdk.android.core.o0ooOOo;
import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p347o0OOOOOo.o0OoOo0;
import p641o0ooOO0o.o0OoO00O;
import p670o0oooo0.o00O000o;
import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0.AbstractC0449OooO0O0 f42821OooO0Oo;

    public OooO00o(OooOO0O oooOO0O) {
        this.f42821OooO0Oo = oooOO0O;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f42821OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f42821OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f42821OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f42821OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f42821OooO0Oo.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean z;
        final OooOOO0 oooOOO0 = ((OooOO0O) this.f42821OooO0Oo).f42832OooO00o;
        o000oOoO o000ooooOooO0OO = ((com.twitter.sdk.android.core.OooOO0O) oooOOO0.f42835OooO0OO).OooO0OO();
        oooOOO0.f42834OooO0O0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        if (o000ooooOooO0OO != null) {
            OooOOO0.OooO00o oooO00o = oooOOO0.f42833OooO00o;
            synchronized (oooO00o) {
                long j = oooO00o.f42839OooO0O0;
                boolean z3 = jCurrentTimeMillis - j > 21600000;
                Calendar calendar = oooO00o.f42840OooO0OO;
                calendar.setTimeInMillis(jCurrentTimeMillis);
                int i = calendar.get(6);
                int i2 = calendar.get(1);
                calendar.setTimeInMillis(j);
                boolean z4 = !(i == calendar.get(6) && i2 == calendar.get(1));
                if (oooO00o.f42838OooO00o || !(z3 || z4)) {
                    z = false;
                } else {
                    oooO00o.f42838OooO00o = true;
                    z = true;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            oooOOO0.f42836OooO0Oo.submit(new Runnable() { // from class: o0OOOOOO.OooOO0
                @Override // java.lang.Runnable
                public final void run() {
                    OooOOO0 oooOOO1 = oooOOO0;
                    com.twitter.sdk.android.core.OooOO0O oooOO0O = (com.twitter.sdk.android.core.OooOO0O) oooOOO1.f42835OooO0OO;
                    oooOO0O.OooO0o0();
                    for (o000oOoO o000oooo2 : Collections.unmodifiableMap(oooOO0O.f21496OooO0OO).values()) {
                        OooOo oooOo = (OooOo) oooOOO1.f42837OooO0o0;
                        oooOo.getClass();
                        o0OOO0o o0ooo0o2 = (o0OOO0o) o000oooo2;
                        oooOo.f42841OooO00o.getClass();
                        TwitterAuthConfig twitterAuthConfig = o0ooOOo.OooO0OO().f21756OooO0Oo;
                        if (o0ooo0o2 == null) {
                            throw new IllegalArgumentException("Session must not be null.");
                        }
                        o0OoO00O.OooO00o oooO00o2 = new o0OoO00O.OooO00o();
                        oooO00o2.OooO00o(new o0OoOo0(o0ooo0o2, twitterAuthConfig));
                        o0OoO00O o0ooo00o2 = new o0OoO00O(oooO00o2);
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        o0000O0O.OooO0O0 oooO0O0 = new o0000O0O.OooO0O0();
                        oooO0O0.f60575OooO0O0 = o0ooo00o2;
                        oooO0O0.OooO0O0("https://api.twitter.com");
                        com.google.gson.OooOOO oooOOO = new com.google.gson.OooOOO();
                        oooOOO.OooO0OO(new SafeListAdapter());
                        oooOOO.OooO0OO(new SafeMapAdapter());
                        oooOOO.OooO0O0(new BindingValuesAdapter(), com.twitter.sdk.android.core.models.OooO0OO.class);
                        oooO0O0.OooO00o(o00O000o.OooO0OO(oooOOO.OooO00o()));
                        o0000O0O o0000o0oOooO0OO = oooO0O0.OooO0OO();
                        if (!concurrentHashMap.contains(AccountService.class)) {
                            concurrentHashMap.putIfAbsent(AccountService.class, o0000o0oOooO0OO.OooO0O0(AccountService.class));
                        }
                        AccountService accountService = (AccountService) concurrentHashMap.get(AccountService.class);
                        try {
                            Boolean bool = Boolean.TRUE;
                            Boolean bool2 = Boolean.FALSE;
                            accountService.verifyCredentials(bool, bool2, bool2).OooO0OO();
                        } catch (IOException | RuntimeException unused) {
                        }
                    }
                    OooOOO0.OooO00o oooO00o3 = oooOOO1.f42833OooO00o;
                    oooOOO1.f42834OooO0O0.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    synchronized (oooO00o3) {
                        oooO00o3.f42838OooO00o = false;
                        oooO00o3.f42839OooO0O0 = jCurrentTimeMillis2;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f42821OooO0Oo.getClass();
    }
}
