package com.twitter.sdk.android.tweetui;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o0000OO0 f21972OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f21973OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Picasso f21974OooO0O0;

    public o0000OO0() {
        com.twitter.sdk.android.core.o0ooOOo o0oooooOooO0OO = com.twitter.sdk.android.core.o0ooOOo.OooO0OO();
        com.twitter.sdk.android.core.o00O0O.OooO0O0().OooO00o("com.twitter.sdk.android:tweet-ui");
        o0oooooOooO0OO.getClass();
        o0oooooOooO0OO.OooO0O0();
        this.f21973OooO00o = new o0000oo(new Handler(Looper.getMainLooper()), o0oooooOooO0OO.f21753OooO00o);
        this.f21974OooO0O0 = Picasso.OooO0o(com.twitter.sdk.android.core.o00O0O.OooO0O0().OooO00o("com.twitter.sdk.android:tweet-ui"));
    }

    public static o0000OO0 OooO00o() {
        if (f21972OooO0OO == null) {
            synchronized (o0000OO0.class) {
                if (f21972OooO0OO == null) {
                    f21972OooO0OO = new o0000OO0();
                }
            }
        }
        return f21972OooO0OO;
    }
}
