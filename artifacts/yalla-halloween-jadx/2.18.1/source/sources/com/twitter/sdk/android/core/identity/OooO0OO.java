package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import p431o0OoOO.o00Oo0;
import p433o0OoOO0o.o0oO0Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f19947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TwitterAuthToken f19948OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ProgressBar f19949OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WebView f19950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OAuth1aService f19951OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TwitterAuthConfig f19952OooO0o0;

    public interface OooO00o {
    }

    public OooO0OO(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, OooO00o oooO00o) {
        this.f19949OooO0OO = progressBar;
        this.f19950OooO0Oo = webView;
        this.f19952OooO0o0 = twitterAuthConfig;
        this.f19951OooO0o = oAuth1aService;
        this.f19947OooO00o = oooO00o;
    }

    public final void OooO00o(int i, TwitterAuthException twitterAuthException) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", twitterAuthException);
        OAuthActivity oAuthActivity = (OAuthActivity) this.f19947OooO00o;
        oAuthActivity.setResult(i, intent);
        oAuthActivity.finish();
    }

    public final void OooO0O0(o00Oo0 o00oo1) {
        o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "OAuth web view completed with an error", o00oo1);
        OooO00o(1, new TwitterAuthException("OAuth web view completed with an error"));
        this.f19950OooO0Oo.stopLoading();
        this.f19949OooO0OO.setVisibility(8);
    }
}
