package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.gson.internal.OooO;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.o00O0O;
import java.net.URI;
import java.util.Map;
import java.util.TreeMap;
import o0OOOOO.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends WebViewClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f21520OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f21521OooO0O0;

    public interface OooO00o {
    }

    public OooO0o(String str, OooO0OO oooO0OO) {
        this.f21520OooO00o = str;
        this.f21521OooO0O0 = oooO0OO;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ((OooO0OO) this.f21521OooO0O0).f21516OooO0OO.setVisibility(8);
        webView.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        OooOO0O oooOO0O = new OooOO0O(str);
        OooO0OO oooO0OO = (OooO0OO) this.f21521OooO0O0;
        oooO0OO.getClass();
        o00O0O.OooO0OO().OooO0Oo("Twitter", "OAuth web view completed with an error", oooOO0O);
        oooO0OO.OooO00o(1, new TwitterAuthException("OAuth web view completed with an error"));
        oooO0OO.f21517OooO0Oo.stopLoading();
        oooO0OO.f21516OooO0OO.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        sslError.getPrimaryError();
        OooOO0O oooOO0O = new OooOO0O(null);
        OooO0OO oooO0OO = (OooO0OO) this.f21521OooO0O0;
        oooO0OO.getClass();
        o00O0O.OooO0OO().OooO0Oo("Twitter", "OAuth web view completed with an error", oooOO0O);
        oooO0OO.OooO00o(1, new TwitterAuthException("OAuth web view completed with an error"));
        oooO0OO.f21517OooO0Oo.stopLoading();
        oooO0OO.f21516OooO0OO.setVisibility(8);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.f21520OooO00o)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        TreeMap treeMapOooO0OO = OooO.OooO0OO(URI.create(str).getRawQuery(), false);
        Bundle bundle = new Bundle(treeMapOooO0OO.size());
        for (Map.Entry entry : treeMapOooO0OO.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        OooO0OO oooO0OO = (OooO0OO) this.f21521OooO0O0;
        oooO0OO.getClass();
        o00O0O.OooO0OO().OooO0O0("Twitter", "OAuth web view completed successfully");
        String string = bundle.getString("oauth_verifier");
        if (string != null) {
            o00O0O.OooO0OO().OooO0O0("Twitter", "Converting the request token to an access token.");
            oooO0OO.f21518OooO0o.OooO0OO(new OooO0O0(oooO0OO), oooO0OO.f21515OooO0O0, string);
        } else {
            o00O0O.OooO0OO().OooO0Oo("Twitter", "Failed to get authorization, bundle incomplete " + bundle, null);
            oooO0OO.OooO00o(1, new TwitterAuthException("Failed to get authorization, bundle incomplete"));
        }
        oooO0OO.f21517OooO0Oo.stopLoading();
        oooO0OO.f21516OooO0OO.setVisibility(8);
        return true;
    }
}
