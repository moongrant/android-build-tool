package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import com.facebook.AccessToken;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends o0O0o<OAuthResponse> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f19946OooO00o;

    public OooO0O0(OooO0OO oooO0OO) {
        this.f19946OooO00o = oooO0OO;
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0OO(TwitterException twitterException) {
        o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Failed to get access token", twitterException);
        this.f19946OooO00o.OooO00o(1, new TwitterAuthException("Failed to get access token"));
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0Oo(o0O00O<OAuthResponse> o0o00o2) {
        Intent intent = new Intent();
        OAuthResponse oAuthResponse = o0o00o2.f39934OooO00o;
        intent.putExtra("screen_name", oAuthResponse.f19971Oooo0oO);
        intent.putExtra(AccessToken.USER_ID_KEY, oAuthResponse.f19972Oooo0oo);
        intent.putExtra("tk", oAuthResponse.f19970Oooo0o.f19940Oooo0oO);
        intent.putExtra("ts", oAuthResponse.f19970Oooo0o.f19941Oooo0oo);
        OAuthActivity oAuthActivity = (OAuthActivity) this.f19946OooO00o.f19947OooO00o;
        oAuthActivity.setResult(-1, intent);
        oAuthActivity.finish();
    }
}
