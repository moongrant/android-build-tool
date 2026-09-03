package com.twitter.sdk.android.core;

import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import p634o0ooO0oO.o00OOOO0;
import p665o0oooOo.oOo00OO0;
import retrofit2.o000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap<Class, Object> f22215OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OO f22216OooO0O0;

    public o00Ooo() {
        OooO oooOOooO0O0 = o0OOO0o.OooO0OO().OooO0O0();
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        oooO00o.OooO0O0(o0OOOOOO.OooO.OooO00o());
        o0OOOOOO.OooO0OO authenticator = new o0OOOOOO.OooO0OO(oooOOooO0O0);
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        Intrinsics.checkNotNullParameter(authenticator, "<set-?>");
        oooO00o.f57291OooO0oO = authenticator;
        oooO00o.OooO00o(new o0OOOOOO.OooO00o(oooOOooO0O0));
        o0OOOOOO.OooO0O0 interceptor = new o0OOOOOO.OooO0O0();
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        oooO00o.f57288OooO0Oo.add(interceptor);
        this(new o00OOOO0(oooO00o), new o0OOOOO.OooOo00());
    }

    public final <T> T OooO00o(Class<T> cls) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = this.f22215OooO00o;
        if (!concurrentHashMap.contains(cls)) {
            concurrentHashMap.putIfAbsent(cls, this.f22216OooO0O0.OooO0O0(cls));
        }
        return (T) concurrentHashMap.get(cls);
    }

    public o00Ooo(o0Oo0oo o0oo0oo2) {
        TwitterAuthConfig twitterAuthConfig = o0OOO0o.OooO0OO().f22223OooO0Oo;
        if (o0oo0oo2 != null) {
            o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
            oooO00o.OooO0O0(o0OOOOOO.OooO.OooO00o());
            oooO00o.OooO00o(new o0OOOOOO.OooO0o(o0oo0oo2, twitterAuthConfig));
            this(new o00OOOO0(oooO00o), new o0OOOOO.OooOo00());
            return;
        }
        throw new IllegalArgumentException("Session must not be null.");
    }

    public o00Ooo(o00OOOO0 o00oooo1, o0OOOOO.OooOo00 oooOo00) {
        this.f22215OooO00o = new ConcurrentHashMap<>();
        o000OO.OooO0O0 oooO0O0 = new o000OO.OooO0O0();
        oooO0O0.f61144OooO0O0 = o00oooo1;
        oooO0O0.OooO0O0("https://api.twitter.com");
        com.google.gson.OooOOO oooOOO = new com.google.gson.OooOOO();
        oooOOO.OooO0OO(new SafeListAdapter());
        oooOOO.OooO0OO(new SafeMapAdapter());
        oooOOO.OooO0O0(new BindingValuesAdapter(), com.twitter.sdk.android.core.models.OooO0OO.class);
        oooO0O0.OooO00o(oOo00OO0.OooO0OO(oooOOO.OooO00o()));
        this.f22216OooO0O0 = oooO0O0.OooO0OO();
    }
}
