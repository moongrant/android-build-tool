package com.google.android.exoplayer2.ui;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.services.AccountService;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p634o0ooO0oO.o00OOOO0;
import p665o0oooOo.oOo00OO0;
import retrofit2.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f14144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f14145OooO0o0;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f14144OooO0Oo = i;
        this.f14145OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14144OooO0Oo) {
            case 0:
                ((o0000) this.f14145OooO0o0).OooOO0O();
                return;
            default:
                o0OOOOO.OooOOO0 oooOOO0 = (o0OOOOO.OooOOO0) this.f14145OooO0o0;
                com.twitter.sdk.android.core.OooOOO0 oooOOO1 = (com.twitter.sdk.android.core.OooOOO0) oooOOO0.f43636OooO0OO;
                oooOOO1.OooO0o0();
                for (com.twitter.sdk.android.core.o0OoOo0 o0oooo0 : Collections.unmodifiableMap(oooOOO1.f21969OooO0OO).values()) {
                    o0OOOOO.OooOo oooOo = (o0OOOOO.OooOo) oooOOO0.f43638OooO0o0;
                    oooOo.getClass();
                    com.twitter.sdk.android.core.o0Oo0oo o0oo0oo2 = (com.twitter.sdk.android.core.o0Oo0oo) o0oooo0;
                    oooOo.f43642OooO00o.getClass();
                    TwitterAuthConfig twitterAuthConfig = com.twitter.sdk.android.core.o0OOO0o.OooO0OO().f22223OooO0Oo;
                    if (o0oo0oo2 == null) {
                        throw new IllegalArgumentException("Session must not be null.");
                    }
                    o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
                    oooO00o.OooO0O0(o0OOOOOO.OooO.OooO00o());
                    oooO00o.OooO00o(new o0OOOOOO.OooO0o(o0oo0oo2, twitterAuthConfig));
                    o00OOOO0 o00oooo1 = new o00OOOO0(oooO00o);
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    o000OO.OooO0O0 oooO0O0 = new o000OO.OooO0O0();
                    oooO0O0.f61144OooO0O0 = o00oooo1;
                    oooO0O0.OooO0O0("https://api.twitter.com");
                    com.google.gson.OooOOO oooOOO = new com.google.gson.OooOOO();
                    oooOOO.OooO0OO(new SafeListAdapter());
                    oooOOO.OooO0OO(new SafeMapAdapter());
                    oooOOO.OooO0O0(new BindingValuesAdapter(), com.twitter.sdk.android.core.models.OooO0OO.class);
                    oooO0O0.OooO00o(oOo00OO0.OooO0OO(oooOOO.OooO00o()));
                    o000OO o000ooOooO0OO = oooO0O0.OooO0OO();
                    if (!concurrentHashMap.contains(AccountService.class)) {
                        concurrentHashMap.putIfAbsent(AccountService.class, o000ooOooO0OO.OooO0O0(AccountService.class));
                    }
                    AccountService accountService = (AccountService) concurrentHashMap.get(AccountService.class);
                    try {
                        Boolean bool = Boolean.TRUE;
                        Boolean bool2 = Boolean.FALSE;
                        accountService.verifyCredentials(bool, bool2, bool2).OooO0OO();
                    } catch (IOException | RuntimeException unused) {
                    }
                }
                o0OOOOO.OooOOO0.OooO00o oooO00o2 = oooOOO0.f43634OooO00o;
                oooOOO0.f43635OooO0O0.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (oooO00o2) {
                    oooO00o2.f43639OooO00o = false;
                    oooO00o2.f43640OooO0O0 = jCurrentTimeMillis;
                }
                return;
        }
    }
}
