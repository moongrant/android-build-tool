package com.twitter.sdk.android.core.identity;

import android.content.Intent;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f21514OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public TwitterAuthToken f21515OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ProgressBar f21516OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WebView f21517OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OAuth1aService f21518OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TwitterAuthConfig f21519OooO0o0;

    public interface OooO00o {
    }

    public OooO0OO(ProgressBar progressBar, WebView webView, TwitterAuthConfig twitterAuthConfig, OAuth1aService oAuth1aService, OooO00o oooO00o) {
        this.f21516OooO0OO = progressBar;
        this.f21517OooO0Oo = webView;
        this.f21519OooO0o0 = twitterAuthConfig;
        this.f21518OooO0o = oAuth1aService;
        this.f21514OooO00o = oooO00o;
    }

    public final void OooO00o(int i, TwitterAuthException twitterAuthException) {
        Intent intent = new Intent();
        intent.putExtra("auth_error", twitterAuthException);
        OAuthActivity oAuthActivity = (OAuthActivity) this.f21514OooO00o;
        oAuthActivity.setResult(i, intent);
        oAuthActivity.finish();
    }
}
