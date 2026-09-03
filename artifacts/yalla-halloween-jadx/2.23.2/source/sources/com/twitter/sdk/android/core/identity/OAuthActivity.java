package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.OooOo;
import com.twitter.sdk.android.core.OooOo00;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.o00O0O;
import com.twitter.sdk.android.core.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class OAuthActivity extends Activity implements OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f21509OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public WebView f21510OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ProgressBar f21511OooO0o0;

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.f21509OooO0Oo.OooO00o(0, new TwitterAuthException("Authorization failed, request was canceled."));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo.tw__activity_oauth);
        this.f21511OooO0o0 = (ProgressBar) findViewById(OooOo00.tw__spinner);
        this.f21510OooO0o = (WebView) findViewById(OooOo00.tw__web_view);
        this.f21511OooO0o0.setVisibility(bundle != null ? bundle.getBoolean("progress", false) : true ? 0 : 8);
        o0ooOOo o0oooooOooO0OO = o0ooOOo.OooO0OO();
        ProgressBar progressBar = this.f21511OooO0o0;
        WebView webView = this.f21510OooO0o;
        TwitterAuthConfig twitterAuthConfig = (TwitterAuthConfig) getIntent().getParcelableExtra("auth_config");
        OAuth1aService oAuth1aService = new OAuth1aService(o0oooooOooO0OO, new o0OOOOOO.OooOo00());
        OooO0OO oooO0OO = new OooO0OO(progressBar, webView, twitterAuthConfig, oAuth1aService, this);
        this.f21509OooO0Oo = oooO0OO;
        o00O0O.OooO0OO().OooO0O0("Twitter", "Obtaining request token to start the sign in flow");
        oAuth1aService.OooO0Oo(new OooO00o(oooO0OO));
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.f21511OooO0o0.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }
}
