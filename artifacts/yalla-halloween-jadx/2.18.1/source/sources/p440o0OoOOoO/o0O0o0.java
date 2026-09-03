package p440o0OoOOoO;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p386o0OOoo0O.o00;
import p433o0OoOO0o.o0O000O;
import p433o0OoOO0o.o0O00OO;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0oo0o;
import p435o0OoOOO0.o000000;
import p435o0OoOOO0.o000000O;
import p436o0OoOOOO.o0OoOoOo;
import p660o0ooo0o0.o00OO;
import p693oO000oO.OooO;
import retrofit2.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0oOo0O0.OooO0O0 f40181Oooo0o;

    public o0O0o0(o0oOo0O0.OooO0O0 oooO0O0) {
        this.f40181Oooo0o = oooO0O0;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Objects.requireNonNull(this.f40181Oooo0o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Objects.requireNonNull(this.f40181Oooo0o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Objects.requireNonNull(this.f40181Oooo0o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Objects.requireNonNull(this.f40181Oooo0o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Objects.requireNonNull(this.f40181Oooo0o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean z;
        final oo0ooO oo0ooo = ((oo0oO0) this.f40181Oooo0o).f40193OooO00o;
        o0O00OO o0o00ooOooO0OO = ((o0O000O) oo0ooo.f40196OooO0OO).OooO0OO();
        Objects.requireNonNull(oo0ooo.f40195OooO0O0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        if (o0o00ooOooO0OO != null) {
            oo0ooO.OooO00o oooO00o = oo0ooo.f40194OooO00o;
            synchronized (oooO00o) {
                long j = oooO00o.f40200OooO0O0;
                boolean z3 = jCurrentTimeMillis - j > 21600000;
                oooO00o.f40201OooO0OO.setTimeInMillis(jCurrentTimeMillis);
                int i = oooO00o.f40201OooO0OO.get(6);
                int i2 = oooO00o.f40201OooO0OO.get(1);
                oooO00o.f40201OooO0OO.setTimeInMillis(j);
                boolean z4 = !(i == oooO00o.f40201OooO0OO.get(6) && i2 == oooO00o.f40201OooO0OO.get(1));
                if (oooO00o.f40199OooO00o || !(z3 || z4)) {
                    z = false;
                } else {
                    oooO00o.f40199OooO00o = true;
                    z = true;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            oo0ooo.f40197OooO0Oo.submit(new Runnable() { // from class: o0OoOOoO.o0OO000o
                @Override // java.lang.Runnable
                public final void run() {
                    oo0ooO oo0ooo2 = oo0ooo;
                    o0O000O o0o000o = (o0O000O) oo0ooo2.f40196OooO0OO;
                    o0o000o.OooO0o0();
                    for (o0O00OO o0o00oo2 : Collections.unmodifiableMap(o0o000o.f39928OooO0OO).values()) {
                        o0OO0 o0oo1 = (o0OO0) oo0ooo2.f40198OooO0o0;
                        Objects.requireNonNull(o0oo1);
                        o0O0O0Oo o0o0o0oo = (o0O0O0Oo) o0o00oo2;
                        Objects.requireNonNull(o0oo1.f40186OooO00o);
                        TwitterAuthConfig twitterAuthConfig = o0O0oo0o.OooO0OO().f39952OooO0Oo;
                        if (o0o0o0oo == null) {
                            throw new IllegalArgumentException("Session must not be null.");
                        }
                        o00OO.OooO00o oooO00o2 = new o00OO.OooO00o();
                        oooO00o2.OooO0O0(o000000O.OooO00o());
                        oooO00o2.OooO00o(new o000000(o0o0o0oo, twitterAuthConfig));
                        o00OO o00oo2 = new o00OO(oooO00o2);
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        o0O0O00.OooO0O0 oooO0O0 = new o0O0O00.OooO0O0();
                        oooO0O0.f53806OooO0O0 = o00oo2;
                        oooO0O0.OooO0O0("https://api.twitter.com");
                        o00 o00Var = new o00();
                        o00Var.OooO0OO(new SafeListAdapter());
                        o00Var.OooO0OO(new SafeMapAdapter());
                        o00Var.OooO0O0(o0OoOoOo.class, new BindingValuesAdapter());
                        oooO0O0.OooO00o(OooO.OooO0Oo(o00Var.OooO00o()));
                        o0O0O00 o0o0o00OooO0OO = oooO0O0.OooO0OO();
                        if (!concurrentHashMap.contains(AccountService.class)) {
                            concurrentHashMap.putIfAbsent(AccountService.class, o0o0o00OooO0OO.OooO0O0(AccountService.class));
                        }
                        AccountService accountService = (AccountService) concurrentHashMap.get(AccountService.class);
                        try {
                            Boolean bool = Boolean.TRUE;
                            Boolean bool2 = Boolean.FALSE;
                            accountService.verifyCredentials(bool, bool2, bool2).OooO0O0();
                        } catch (IOException | RuntimeException unused) {
                        }
                    }
                    oo0ooO.OooO00o oooO00o3 = oo0ooo2.f40194OooO00o;
                    Objects.requireNonNull(oo0ooo2.f40195OooO0O0);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    synchronized (oooO00o3) {
                        oooO00o3.f40199OooO00o = false;
                        oooO00o3.f40200OooO0O0 = jCurrentTimeMillis2;
                    }
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Objects.requireNonNull(this.f40181Oooo0o);
    }
}
