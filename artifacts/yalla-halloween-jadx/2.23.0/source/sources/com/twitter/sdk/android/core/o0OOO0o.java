package com.twitter.sdk.android.core;

import android.annotation.SuppressLint;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o0OOO0o f22219OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0 f22220OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f22221OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOOOO.OooOOO0<o0Oo0oo> f22222OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TwitterAuthConfig f22223OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile o00Ooo f22224OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ConcurrentHashMap<o0OoOo0, o00Ooo> f22225OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile OooO f22226OooO0oO;

    public o0OOO0o() {
        throw null;
    }

    public o0OOO0o(TwitterAuthConfig twitterAuthConfig) {
        ConcurrentHashMap<o0OoOo0, o00Ooo> concurrentHashMap = new ConcurrentHashMap<>();
        this.f22223OooO0Oo = twitterAuthConfig;
        this.f22225OooO0o0 = concurrentHashMap;
        this.f22224OooO0o = null;
        o00oO0o o00oo0oOooO00o = o00Oo0.OooO0O0().OooO00o("com.twitter.sdk.android:twitter-core");
        OooOOO0 oooOOO0 = new OooOOO0(new p344o0OOOOOo.OooOOO0(o00oo0oOooO00o), new o0Oo0oo.OooO00o(), "active_twittersession", "twittersession");
        this.f22220OooO00o = oooOOO0;
        this.f22221OooO0O0 = new OooOOO0(new p344o0OOOOOo.OooOOO0(o00oo0oOooO00o), new OooO0o.OooO00o(), "active_guestsession", "guestsession");
        this.f22222OooO0OO = new o0OOOOO.OooOOO0<>(oooOOO0, o00Oo0.OooO0O0().f22210OooO0O0, new o0OOOOO.OooOo());
    }

    public static o0OOO0o OooO0OO() {
        if (f22219OooO0oo == null) {
            synchronized (o0OOO0o.class) {
                if (f22219OooO0oo == null) {
                    f22219OooO0oo = new o0OOO0o(o00Oo0.OooO0O0().f22211OooO0OO);
                    o00Oo0.OooO0O0().f22210OooO0O0.execute(new o0ooOOo());
                }
            }
        }
        return f22219OooO0oo;
    }

    public final o00Ooo OooO00o(o0Oo0oo o0oo0oo2) {
        ConcurrentHashMap<o0OoOo0, o00Ooo> concurrentHashMap = this.f22225OooO0o0;
        if (!concurrentHashMap.containsKey(o0oo0oo2)) {
            concurrentHashMap.putIfAbsent(o0oo0oo2, new o00Ooo(o0oo0oo2));
        }
        return concurrentHashMap.get(o0oo0oo2);
    }

    public final OooO OooO0O0() {
        if (this.f22226OooO0oO == null) {
            synchronized (this) {
                if (this.f22226OooO0oO == null) {
                    this.f22226OooO0oO = new OooO(new OAuth2Service(this, new o0OOOOO.OooOo00()), this.f22221OooO0O0);
                }
            }
        }
        return this.f22226OooO0oO;
    }
}
