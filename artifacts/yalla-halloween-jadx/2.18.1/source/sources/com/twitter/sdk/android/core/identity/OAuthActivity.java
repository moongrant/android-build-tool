package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import java.util.Objects;
import p433o0OoOO0o.o0O00;
import p433o0OoOO0o.o0O0oo0o;
import p433o0OoOO0o.o0OoO00O;
import p433o0OoOO0o.o0oO0Ooo;
import p440o0OoOOoO.o0OO00o0;

/* JADX INFO: loaded from: classes2.dex */
public class OAuthActivity extends Activity implements OooO0OO.OooO00o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0OO f19942Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ProgressBar f19943Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public WebView f19944Oooo0oo;

    @Override // android.app.Activity
    public final void onBackPressed() {
        this.f19942Oooo0o.OooO00o(0, new TwitterAuthException("Authorization failed, request was canceled."));
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(o0OoO00O.tw__activity_oauth);
        this.f19943Oooo0oO = (ProgressBar) findViewById(o0O00.tw__spinner);
        this.f19944Oooo0oo = (WebView) findViewById(o0O00.tw__web_view);
        this.f19943Oooo0oO.setVisibility(bundle != null ? bundle.getBoolean("progress", false) : true ? 0 : 8);
        o0O0oo0o o0o0oo0oOooO0OO = o0O0oo0o.OooO0OO();
        ProgressBar progressBar = this.f19943Oooo0oO;
        WebView webView = this.f19944Oooo0oo;
        TwitterAuthConfig twitterAuthConfig = (TwitterAuthConfig) getIntent().getParcelableExtra("auth_config");
        OAuth1aService oAuth1aService = new OAuth1aService(o0o0oo0oOooO0OO, new o0OO00o0());
        OooO0OO oooO0OO = new OooO0OO(progressBar, webView, twitterAuthConfig, oAuth1aService, this);
        this.f19942Oooo0o = oooO0OO;
        Objects.requireNonNull(oooO0OO);
        o0oO0Ooo.OooO0OO().OooO0OO("Twitter", "Obtaining request token to start the sign in flow");
        oAuth1aService.OooO0Oo(new OooO00o(oooO0OO));
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.f19943Oooo0oO.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }
}
