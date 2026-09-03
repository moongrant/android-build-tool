package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Oooo0<T> extends com.twitter.sdk.android.core.OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.twitter.sdk.android.core.OooO0O0 f21849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.twitter.sdk.android.core.OooOO0 f21850OooO0O0;

    public Oooo0(OooOo.OooO00o oooO00o, com.twitter.sdk.android.core.OooOO0 oooOO1) {
        this.f21849OooO00o = oooO00o;
        this.f21850OooO0O0 = oooOO1;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        this.f21850OooO0O0.OooO0Oo("TweetUi", twitterException.getMessage(), twitterException);
        com.twitter.sdk.android.core.OooO0O0 oooO0O0 = this.f21849OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(twitterException);
        }
    }
}
