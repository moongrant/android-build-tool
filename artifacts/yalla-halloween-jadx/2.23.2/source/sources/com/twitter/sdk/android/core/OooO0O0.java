package com.twitter.sdk.android.core;

import retrofit2.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0O0<T> implements retrofit2.OooO0o<T> {
    @Override // retrofit2.OooO0o
    public final void OooO00o(Throwable th) {
        OooO0OO(new TwitterException("Request Failure", th));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(retrofit2.OooO0O0<T> oooO0O0, o0000O0<T> o0000o1) {
        if (o0000o1.f60546OooO00o.OooO0oO()) {
            OooO0Oo(new Oooo0<>(o0000o1.f60547OooO0O0, o0000o1));
        } else {
            OooO0OO(new TwitterApiException(o0000o1));
        }
    }

    public abstract void OooO0OO(TwitterException twitterException);

    public abstract void OooO0Oo(Oooo0<T> oooo0);
}
