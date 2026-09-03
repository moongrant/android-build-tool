package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f22275OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseTweetView f22276OooO0O0;

    public OooO(BaseTweetView baseTweetView, long j) {
        this.f22276OooO0O0 = baseTweetView;
        this.f22275OooO00o = j;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        com.twitter.sdk.android.core.o00Oo0.OooO0OO().OooO0O0("TweetUi", String.format(Locale.ENGLISH, "loadTweet failure for Tweet Id %d.", Long.valueOf(this.f22275OooO00o)));
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(com.twitter.sdk.android.core.o000oOoO<com.twitter.sdk.android.core.models.OooOo> o000oooo2) {
        this.f22276OooO0O0.setTweet(o000oooo2.f22205OooO00o);
    }
}
