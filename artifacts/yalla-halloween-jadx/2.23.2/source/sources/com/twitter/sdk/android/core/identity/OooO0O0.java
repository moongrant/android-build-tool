package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import com.facebook.AccessToken;
import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends com.twitter.sdk.android.core.OooO0O0<OAuthResponse> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f21513OooO00o;

    public OooO0O0(OooO0OO oooO0OO) {
        this.f21513OooO00o = oooO0OO;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        o00O0O.OooO0OO().OooO0Oo("Twitter", "Failed to get access token", twitterException);
        this.f21513OooO00o.OooO00o(1, new TwitterAuthException("Failed to get access token"));
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(Oooo0<OAuthResponse> oooo0) {
        Intent intent = new Intent();
        OAuthResponse oAuthResponse = oooo0.f21502OooO00o;
        intent.putExtra("screen_name", oAuthResponse.f21535OooO0o0);
        intent.putExtra(AccessToken.USER_ID_KEY, oAuthResponse.f21534OooO0o);
        TwitterAuthToken twitterAuthToken = oAuthResponse.f21533OooO0Oo;
        intent.putExtra("tk", twitterAuthToken.f21508OooO0o0);
        intent.putExtra("ts", twitterAuthToken.f21507OooO0o);
        OAuthActivity oAuthActivity = (OAuthActivity) this.f21513OooO00o.f21514OooO00o;
        oAuthActivity.setResult(-1, intent);
        oAuthActivity.finish();
    }
}
