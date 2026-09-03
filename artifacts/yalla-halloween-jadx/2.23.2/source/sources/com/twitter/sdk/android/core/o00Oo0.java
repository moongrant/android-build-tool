package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import p641o0ooOO0o.o0OoO00O;
import p670o0oooo0.o00O000o;
import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap<Class, Object> f21744OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O0O f21745OooO0O0;

    public o00Oo0() {
        OooO oooOOooO0O0 = o0ooOOo.OooO0OO().OooO0O0();
        o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
        p347o0OOOOOo.o000oOoO authenticator = new p347o0OOOOOo.o000oOoO(oooOOooO0O0);
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(authenticator, "<set-?>");
        oooO00o.f57920OooO0oO = authenticator;
        oooO00o.OooO00o(new p347o0OOOOOo.Oooo000(oooOOooO0O0));
        p347o0OOOOOo.Oooo0 interceptor = new p347o0OOOOOo.Oooo0();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        oooO00o.f57917OooO0Oo.add(interceptor);
        this(new o0OoO00O(oooO00o), new o0OOOOOO.OooOo00());
    }

    public final <T> T OooO00o(Class<T> cls) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = this.f21744OooO00o;
        if (!concurrentHashMap.contains(cls)) {
            concurrentHashMap.putIfAbsent(cls, this.f21745OooO0O0.OooO0O0(cls));
        }
        return (T) concurrentHashMap.get(cls);
    }

    public o00Oo0(o0OOO0o o0ooo0o2) {
        TwitterAuthConfig twitterAuthConfig = o0ooOOo.OooO0OO().f21756OooO0Oo;
        if (o0ooo0o2 != null) {
            o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
            oooO00o.OooO00o(new p347o0OOOOOo.o0OoOo0(o0ooo0o2, twitterAuthConfig));
            this(new o0OoO00O(oooO00o), new o0OOOOOO.OooOo00());
            return;
        }
        throw new IllegalArgumentException("Session must not be null.");
    }

    public o00Oo0(o0OoO00O o0ooo00o2, o0OOOOOO.OooOo00 oooOo00) {
        this.f21744OooO00o = new ConcurrentHashMap<>();
        o0000O0O.OooO0O0 oooO0O0 = new o0000O0O.OooO0O0();
        oooO0O0.f60575OooO0O0 = o0ooo00o2;
        oooO0O0.OooO0O0("https://api.twitter.com");
        com.google.gson.OooOOO oooOOO = new com.google.gson.OooOOO();
        oooOOO.OooO0OO(new SafeListAdapter());
        oooOOO.OooO0OO(new SafeMapAdapter());
        oooOOO.OooO0O0(new BindingValuesAdapter(), com.twitter.sdk.android.core.models.OooO0OO.class);
        oooO0O0.OooO00o(o00O000o.OooO0OO(oooOOO.OooO00o()));
        this.f21745OooO0O0 = oooO0O0.OooO0OO();
    }
}
