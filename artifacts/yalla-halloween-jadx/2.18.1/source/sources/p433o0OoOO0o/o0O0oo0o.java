package p433o0OoOO0o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p434o0OoOOO.o0000;
import p440o0OoOOoO.o0O0o0;
import p440o0OoOOoO.o0OO0;
import p440o0OoOOoO.o0OO00o0;
import p440o0OoOOoO.o0oOo0O0;
import p440o0OoOOoO.oo0oO0;
import p440o0OoOOoO.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0oo0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o0O0oo0o f39948OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0O00OOO<o0O0O0Oo> f39949OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0O00OOO<o0O00000> f39950OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oo0ooO<o0O0O0Oo> f39951OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TwitterAuthConfig f39952OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O0O f39953OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ConcurrentHashMap<o0O00OO, o0O00o00> f39954OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile o0O00o00 f39955OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile o0O0000O f39956OooO0oo;

    public o0O0oo0o(TwitterAuthConfig twitterAuthConfig) {
        ConcurrentHashMap<o0O00OO, o0O00o00> concurrentHashMap = new ConcurrentHashMap<>();
        this.f39952OooO0Oo = twitterAuthConfig;
        this.f39954OooO0o0 = concurrentHashMap;
        this.f39955OooO0oO = null;
        Context contextOooO00o = o0oO0Ooo.OooO0O0().OooO00o("com.twitter.sdk.android:twitter-core");
        this.f39953OooO0o = (o0O0O0O) contextOooO00o;
        this.f39949OooO00o = new o0O000O(new o0000(contextOooO00o), new o0O0O0Oo.OooO00o(), "active_twittersession", "twittersession");
        this.f39950OooO0O0 = new o0O000O(new o0000(contextOooO00o), new o0O00000.OooO00o(), "active_guestsession", "guestsession");
        this.f39951OooO0OO = new oo0ooO<>(this.f39949OooO00o, o0oO0Ooo.OooO0O0().f39961OooO0O0, new o0OO0());
    }

    public static o0O0oo0o OooO0OO() {
        if (f39948OooO == null) {
            synchronized (o0O0oo0o.class) {
                if (f39948OooO == null) {
                    f39948OooO = new o0O0oo0o(o0oO0Ooo.OooO0O0().f39962OooO0OO);
                    o0oO0Ooo.OooO0O0().f39961OooO0O0.execute(new Runnable() { // from class: o0OoOO0o.o0oO0O0o
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Application application;
                            o0O0oo0o o0o0oo0o = o0O0oo0o.f39948OooO;
                            o0o0oo0o.f39949OooO00o.OooO0OO();
                            o0o0oo0o.f39950OooO0O0.OooO0OO();
                            o0o0oo0o.OooO0O0();
                            oo0ooO<o0O0O0Oo> oo0ooo = o0o0oo0o.f39951OooO0OO;
                            o0oOo0O0 o0ooo0o1 = o0oO0Ooo.OooO0O0().f39963OooO0Oo;
                            Objects.requireNonNull(oo0ooo);
                            oo0oO0 oo0oo0 = new oo0oO0(oo0ooo);
                            o0oOo0O0.OooO00o oooO00o = o0ooo0o1.f40190OooO00o;
                            if (oooO00o == null || (application = oooO00o.f40192OooO0O0) == null) {
                                return;
                            }
                            o0O0o0 o0o0o0 = new o0O0o0(oo0oo0);
                            application.registerActivityLifecycleCallbacks(o0o0o0);
                            oooO00o.f40191OooO00o.add(o0o0o0);
                        }
                    });
                }
            }
        }
        return f39948OooO;
    }

    public final o0O00o00 OooO00o(o0O0O0Oo o0o0o0oo) {
        if (!this.f39954OooO0o0.containsKey(o0o0o0oo)) {
            this.f39954OooO0o0.putIfAbsent(o0o0o0oo, new o0O00o00(o0o0o0oo));
        }
        return this.f39954OooO0o0.get(o0o0o0oo);
    }

    public final o0O0000O OooO0O0() {
        if (this.f39956OooO0oo == null) {
            synchronized (this) {
                if (this.f39956OooO0oo == null) {
                    this.f39956OooO0oo = new o0O0000O(new OAuth2Service(this, new o0OO00o0()), this.f39950OooO0O0);
                }
            }
        }
        return this.f39956OooO0oo;
    }
}
