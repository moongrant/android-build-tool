package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.TwitterException;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BaseTweetView f22433OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000oo f22434OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> f22435OooO0OO;

    public o00000(BaseTweetView baseTweetView, o0000oo o0000ooVar, com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0) {
        this.f22433OooO00o = baseTweetView;
        this.f22434OooO0O0 = o0000ooVar;
        this.f22435OooO0OO = oooO0O0;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0 = this.f22435OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0OO(twitterException);
        }
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(com.twitter.sdk.android.core.o000oOoO<com.twitter.sdk.android.core.models.OooOo> o000oooo2) {
        com.twitter.sdk.android.core.models.OooOo oooOo = o000oooo2.f22205OooO00o;
        com.twitter.sdk.android.core.models.OooOo oooOo2 = oooOo;
        this.f22434OooO0O0.f22454OooO0Oo.put(Long.valueOf(oooOo2.f22064OooO), oooOo2);
        this.f22433OooO00o.setTweet(oooOo);
        com.twitter.sdk.android.core.OooO0O0<com.twitter.sdk.android.core.models.OooOo> oooO0O0 = this.f22435OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.OooO0Oo(o000oooo2);
        }
    }
}
