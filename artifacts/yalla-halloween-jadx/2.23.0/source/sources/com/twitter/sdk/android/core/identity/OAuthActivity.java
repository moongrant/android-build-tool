package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.OooOo;
import com.twitter.sdk.android.core.Oooo000;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.twitter.sdk.android.core.o00Oo0;
import com.twitter.sdk.android.core.o0OOO0o;
import o0OOOOO.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public class OAuthActivity extends Activity implements OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f21980OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public WebView f21981OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ProgressBar f21982OooO0o0;

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.f21980OooO0Oo.OooO00o(0, new TwitterAuthException("Authorization failed, request was canceled."));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Oooo000.tw__activity_oauth);
        this.f21982OooO0o0 = (ProgressBar) findViewById(OooOo.tw__spinner);
        this.f21981OooO0o = (WebView) findViewById(OooOo.tw__web_view);
        this.f21982OooO0o0.setVisibility(bundle != null ? bundle.getBoolean("progress", false) : true ? 0 : 8);
        o0OOO0o o0ooo0oOooO0OO = o0OOO0o.OooO0OO();
        ProgressBar progressBar = this.f21982OooO0o0;
        WebView webView = this.f21981OooO0o;
        TwitterAuthConfig twitterAuthConfig = (TwitterAuthConfig) getIntent().getParcelableExtra("auth_config");
        OAuth1aService oAuth1aService = new OAuth1aService(o0ooo0oOooO0OO, new OooOo00());
        OooO0OO oooO0OO = new OooO0OO(progressBar, webView, twitterAuthConfig, oAuth1aService, this);
        this.f21980OooO0Oo = oooO0OO;
        o00Oo0.OooO0OO().OooO0O0("Twitter", "Obtaining request token to start the sign in flow");
        oAuth1aService.OooO0Oo(new OooO00o(oooO0OO));
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.f21982OooO0o0.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }
}
