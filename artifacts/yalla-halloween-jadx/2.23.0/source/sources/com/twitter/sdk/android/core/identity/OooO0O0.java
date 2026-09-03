package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import com.facebook.AccessToken;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends com.twitter.sdk.android.core.OooO0O0<OAuthResponse> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f21984OooO00o;

    public OooO0O0(OooO0OO oooO0OO) {
        this.f21984OooO00o = oooO0OO;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        o00Oo0.OooO0OO().OooO0Oo("Twitter", "Failed to get access token", twitterException);
        this.f21984OooO00o.OooO00o(1, new TwitterAuthException("Failed to get access token"));
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(o000oOoO<OAuthResponse> o000oooo2) {
        Intent intent = new Intent();
        OAuthResponse oAuthResponse = o000oooo2.f22205OooO00o;
        intent.putExtra("screen_name", oAuthResponse.f22006OooO0o0);
        intent.putExtra(AccessToken.USER_ID_KEY, oAuthResponse.f22005OooO0o);
        TwitterAuthToken twitterAuthToken = oAuthResponse.f22004OooO0Oo;
        intent.putExtra("tk", twitterAuthToken.f21979OooO0o0);
        intent.putExtra("ts", twitterAuthToken.f21978OooO0o);
        OAuthActivity oAuthActivity = (OAuthActivity) this.f21984OooO00o.f21985OooO00o;
        oAuthActivity.setResult(-1, intent);
        oAuthActivity.finish();
    }
}
