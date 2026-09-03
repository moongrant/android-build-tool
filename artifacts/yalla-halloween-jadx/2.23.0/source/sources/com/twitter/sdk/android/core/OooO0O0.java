package com.twitter.sdk.android.core;

import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO0O0<T> implements retrofit2.OooO0o<T> {
    @Override // retrofit2.OooO0o
    public final void OooO00o(Throwable th) {
        OooO0OO(new TwitterException("Request Failure", th));
    }

    @Override // retrofit2.OooO0o
    public final void OooO0O0(retrofit2.OooO0O0<T> oooO0O0, o0000O0O<T> o0000o0o2) {
        if (o0000o0o2.f61108OooO00o.OooO0oO()) {
            OooO0Oo(new o000oOoO<>(o0000o0o2.f61109OooO0O0, o0000o0o2));
        } else {
            OooO0OO(new TwitterApiException(o0000o0o2));
        }
    }

    public abstract void OooO0OO(TwitterException twitterException);

    public abstract void OooO0Oo(o000oOoO<T> o000oooo2);
}
