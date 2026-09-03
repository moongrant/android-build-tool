package com.twitter.sdk.android.core.identity;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterException;
import com.twitter.sdk.android.core.internal.oauth.OAuthResponse;
import java.util.Objects;
import p431o0OoOO.o000oOoO;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0oO0Ooo;
import p440o0OoOOoO.o0OO00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends o0O0o<OAuthResponse> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f19945OooO00o;

    public OooO00o(OooO0OO oooO0OO) {
        this.f19945OooO00o = oooO0OO;
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0OO(TwitterException twitterException) {
        o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Failed to get request token", twitterException);
        this.f19945OooO00o.OooO00o(1, new TwitterAuthException("Failed to get request token"));
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0Oo(o0O00O<OAuthResponse> o0o00o2) {
        OooO0OO oooO0OO = this.f19945OooO00o;
        TwitterAuthToken twitterAuthToken = o0o00o2.f39934OooO00o.f19970Oooo0o;
        oooO0OO.f19948OooO0O0 = twitterAuthToken;
        o0OO00o0 o0oo00o1 = oooO0OO.f19951OooO0o.f19974OooO0O0;
        String[] strArr = {CustomTabLoginMethodHandler.OAUTH_DIALOG, "authorize"};
        Objects.requireNonNull(o0oo00o1);
        Uri.Builder builderBuildUpon = Uri.parse("https://api.twitter.com").buildUpon();
        for (int i = 0; i < 2; i++) {
            builderBuildUpon.appendPath(strArr[i]);
        }
        String string = builderBuildUpon.appendQueryParameter("oauth_token", twitterAuthToken.f19940Oooo0oO).build().toString();
        o0oO0Ooo.OooO0OO().OooO0OO("Twitter", "Redirecting user to web view to complete authorization flow");
        WebView webView = this.f19945OooO00o.f19950OooO0Oo;
        OooO0OO oooO0OO2 = this.f19945OooO00o;
        OooO0o oooO0o = new OooO0o(oooO0OO2.f19951OooO0o.OooO00o(oooO0OO2.f19952OooO0o0), this.f19945OooO00o);
        o000oOoO o000oooo2 = new o000oOoO();
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(false);
        settings.setSaveFormData(false);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(oooO0o);
        webView.loadUrl(string);
        webView.setVisibility(4);
        webView.setWebChromeClient(o000oooo2);
    }
}
