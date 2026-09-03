package com.twitter.sdk.android.core;

import android.annotation.SuppressLint;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o0ooOOo f21752OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f21753OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f21754OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOOOOO.OooOOO0<o0OOO0o> f21755OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final TwitterAuthConfig f21756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile o00Oo0 f21757OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ConcurrentHashMap<o000oOoO, o00Oo0> f21758OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile OooO f21759OooO0oO;

    public o0ooOOo() {
        throw null;
    }

    public o0ooOOo(TwitterAuthConfig twitterAuthConfig) {
        ConcurrentHashMap<o000oOoO, o00Oo0> concurrentHashMap = new ConcurrentHashMap<>();
        this.f21756OooO0Oo = twitterAuthConfig;
        this.f21758OooO0o0 = concurrentHashMap;
        this.f21757OooO0o = null;
        oo000o oo000oVarOooO00o = o00O0O.OooO0O0().OooO00o("com.twitter.sdk.android:twitter-core");
        OooOO0O oooOO0O = new OooOO0O(new p348o0OOOOo.OooOOO(oo000oVarOooO00o), new o0OOO0o.OooO00o(), "active_twittersession", "twittersession");
        this.f21753OooO00o = oooOO0O;
        this.f21754OooO0O0 = new OooOO0O(new p348o0OOOOo.OooOOO(oo000oVarOooO00o), new OooO0o.OooO00o(), "active_guestsession", "guestsession");
        this.f21755OooO0OO = new o0OOOOOO.OooOOO0<>(oooOO0O, o00O0O.OooO0O0().f21739OooO0O0, new o0OOOOOO.OooOo());
    }

    public static o0ooOOo OooO0OO() {
        if (f21752OooO0oo == null) {
            synchronized (o0ooOOo.class) {
                if (f21752OooO0oo == null) {
                    f21752OooO0oo = new o0ooOOo(o00O0O.OooO0O0().f21740OooO0OO);
                    o00O0O.OooO0O0().f21739OooO0O0.execute(new o00oO0o());
                }
            }
        }
        return f21752OooO0oo;
    }

    public final o00Oo0 OooO00o(o0OOO0o o0ooo0o2) {
        ConcurrentHashMap<o000oOoO, o00Oo0> concurrentHashMap = this.f21758OooO0o0;
        if (!concurrentHashMap.containsKey(o0ooo0o2)) {
            concurrentHashMap.putIfAbsent(o0ooo0o2, new o00Oo0(o0ooo0o2));
        }
        return concurrentHashMap.get(o0ooo0o2);
    }

    public final OooO OooO0O0() {
        if (this.f21759OooO0oO == null) {
            synchronized (this) {
                if (this.f21759OooO0oO == null) {
                    this.f21759OooO0oO = new OooO(new OAuth2Service(this, new o0OOOOOO.OooOo00()), this.f21754OooO0O0);
                }
            }
        }
        return this.f21759OooO0oO;
    }
}
