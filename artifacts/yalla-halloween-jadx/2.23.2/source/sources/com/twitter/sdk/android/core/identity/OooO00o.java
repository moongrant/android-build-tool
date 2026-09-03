package com.twitter.sdk.android.core.identity;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends com.twitter.sdk.android.core.OooO0O0<OAuthResponse> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f21512OooO00o;

    public OooO00o(OooO0OO oooO0OO) {
        this.f21512OooO00o = oooO0OO;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        o00O0O.OooO0OO().OooO0Oo("Twitter", "Failed to get request token", twitterException);
        this.f21512OooO00o.OooO00o(1, new TwitterAuthException("Failed to get request token"));
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(Oooo0<OAuthResponse> oooo0) {
        TwitterAuthToken twitterAuthToken = oooo0.f21502OooO00o.f21533OooO0Oo;
        OooO0OO oooO0OO = this.f21512OooO00o;
        oooO0OO.f21515OooO0O0 = twitterAuthToken;
        String[] strArr = {CustomTabLoginMethodHandler.OAUTH_DIALOG, "authorize"};
        OAuth1aService oAuth1aService = oooO0OO.f21518OooO0o;
        oAuth1aService.f21548OooO0O0.getClass();
        Uri.Builder builderBuildUpon = Uri.parse("https://api.twitter.com").buildUpon();
        for (int i = 0; i < 2; i++) {
            builderBuildUpon.appendPath(strArr[i]);
        }
        String string = builderBuildUpon.appendQueryParameter("oauth_token", twitterAuthToken.f21508OooO0o0).build().toString();
        o00O0O.OooO0OO().OooO0O0("Twitter", "Redirecting user to web view to complete authorization flow");
        OooO0o oooO0o = new OooO0o(oAuth1aService.OooO00o(oooO0OO.f21519OooO0o0), oooO0OO);
        o0OOOOO.OooO0o oooO0o2 = new o0OOOOO.OooO0o();
        WebView webView = oooO0OO.f21517OooO0Oo;
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(oooO0o);
        webView.loadUrl(string);
        webView.setVisibility(4);
        webView.setWebChromeClient(oooO0o2);
    }
}
