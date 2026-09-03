package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BaseTweetView f21959OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000oo f21960OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> f21961OooO0OO;

    public o00000(BaseTweetView baseTweetView, o0000oo o0000ooVar, com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0) {
        this.f21959OooO00o = baseTweetView;
        this.f21960OooO0O0 = o0000ooVar;
        this.f21961OooO0OO = oooO0O0;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0 = this.f21961OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(twitterException);
        }
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(com.twitter.sdk.android.core.Oooo0<com.twitter.sdk.android.core.models.OooOo> oooo0) {
        com.twitter.sdk.android.core.models.OooOo oooOo = oooo0.f21502OooO00o;
        com.twitter.sdk.android.core.models.OooOo oooOo2 = oooOo;
        this.f21960OooO0O0.f21978OooO0Oo.put(Long.valueOf(oooOo2.f21593OooO), oooOo2);
        this.f21959OooO00o.setTweet(oooOo);
        com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0 = this.f21961OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0Oo(oooo0);
        }
    }
}
