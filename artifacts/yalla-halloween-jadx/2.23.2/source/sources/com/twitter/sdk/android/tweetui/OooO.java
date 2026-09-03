package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f21802OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseTweetView f21803OooO0O0;

    public OooO(BaseTweetView baseTweetView, long j) {
        this.f21803OooO0O0 = baseTweetView;
        this.f21802OooO00o = j;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        com.twitter.sdk.android.core.o00O0O.OooO0OO().OooO0O0("TweetUi", String.format(Locale.ENGLISH, "loadTweet failure for Tweet Id %d.", Long.valueOf(this.f21802OooO00o)));
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(com.twitter.sdk.android.core.Oooo0<com.twitter.sdk.android.core.models.OooOo> oooo0) {
        this.f21803OooO0O0.setTweet(oooo0.f21502OooO00o);
    }
}
