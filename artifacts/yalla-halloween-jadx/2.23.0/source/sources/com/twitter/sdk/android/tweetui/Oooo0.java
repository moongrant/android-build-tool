package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Oooo0<T> extends com.twitter.sdk.android.core.OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.twitter.sdk.android.core.OooO0O0 f22323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final com.twitter.sdk.android.core.OooOO0O f22324OooO0O0;

    public Oooo0(OooOo.OooO00o oooO00o, com.twitter.sdk.android.core.OooOO0O oooOO0O) {
        this.f22323OooO00o = oooO00o;
        this.f22324OooO0O0 = oooOO0O;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        this.f22324OooO0O0.OooO0Oo("TweetUi", twitterException.getMessage(), twitterException);
        com.twitter.sdk.android.core.OooO0O0 oooO0O0 = this.f22323OooO00o;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(twitterException);
        }
    }
}
