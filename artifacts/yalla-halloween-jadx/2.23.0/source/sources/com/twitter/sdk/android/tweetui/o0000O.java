package com.twitter.sdk.android.tweetui;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o0000O f22441OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f22442OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Picasso f22443OooO0O0;

    public o0000O() {
        com.twitter.sdk.android.core.o0OOO0o o0ooo0oOooO0OO = com.twitter.sdk.android.core.o0OOO0o.OooO0OO();
        com.twitter.sdk.android.core.o00Oo0.OooO0O0().OooO00o("com.twitter.sdk.android:tweet-ui");
        o0ooo0oOooO0OO.getClass();
        o0ooo0oOooO0OO.OooO0O0();
        this.f22442OooO00o = new o0000oo(new Handler(Looper.getMainLooper()), o0ooo0oOooO0OO.f22220OooO00o);
        this.f22443OooO0O0 = Picasso.OooO0o(com.twitter.sdk.android.core.o00Oo0.OooO0O0().OooO00o("com.twitter.sdk.android:tweet-ui"));
    }

    public static o0000O OooO00o() {
        if (f22441OooO0OO == null) {
            synchronized (o0000O.class) {
                if (f22441OooO0OO == null) {
                    f22441OooO0OO = new o0000O();
                }
            }
        }
        return f22441OooO0OO;
    }
}
