package com.twitter.sdk.android.core.identity;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends com.twitter.sdk.android.core.OooO0O0<OAuthResponse> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f21983OooO00o;

    public OooO00o(OooO0OO oooO0OO) {
        this.f21983OooO00o = oooO0OO;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        o00Oo0.OooO0OO().OooO0Oo("Twitter", "Failed to get request token", twitterException);
        this.f21983OooO00o.OooO00o(1, new TwitterAuthException("Failed to get request token"));
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(o000oOoO<OAuthResponse> o000oooo2) {
        TwitterAuthToken twitterAuthToken = o000oooo2.f22205OooO00o.f22004OooO0Oo;
        OooO0OO oooO0OO = this.f21983OooO00o;
        oooO0OO.f21986OooO0O0 = twitterAuthToken;
        String[] strArr = {CustomTabLoginMethodHandler.OAUTH_DIALOG, "authorize"};
        OAuth1aService oAuth1aService = oooO0OO.f21989OooO0o;
        oAuth1aService.f22019OooO0O0.getClass();
        Uri.Builder builderBuildUpon = Uri.parse("https://api.twitter.com").buildUpon();
        for (int i = 0; i < 2; i++) {
            builderBuildUpon.appendPath(strArr[i]);
        }
        String string = builderBuildUpon.appendQueryParameter("oauth_token", twitterAuthToken.f21979OooO0o0).build().toString();
        o00Oo0.OooO0OO().OooO0O0("Twitter", "Redirecting user to web view to complete authorization flow");
        OooO0o oooO0o = new OooO0o(oAuth1aService.OooO00o(oooO0OO.f21990OooO0o0), oooO0OO);
        o0OOOOO0.OooO0o oooO0o2 = new o0OOOOO0.OooO0o();
        WebView webView = oooO0OO.f21988OooO0Oo;
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        settings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(oooO0o);
        webView.loadUrl(string);
        webView.setVisibility(4);
        webView.setWebChromeClient(oooO0o2);
    }
}
