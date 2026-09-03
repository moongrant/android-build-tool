package com.twitter.sdk.android.core.identity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.twitter.sdk.android.core.TwitterAuthException;
import java.net.URI;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import p431o0OoOO.o00Oo0;
import p433o0OoOO0o.o0oO0Ooo;
import p435o0OoOOO0.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends WebViewClient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f19953OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f19954OooO0O0;

    public interface OooO00o {
    }

    public OooO0o(String str, OooO00o oooO00o) {
        this.f19953OooO00o = str;
        this.f19954OooO0O0 = oooO00o;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ((OooO0OO) this.f19954OooO0O0).f19949OooO0OO.setVisibility(8);
        webView.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        ((OooO0OO) this.f19954OooO0O0).OooO0O0(new o00Oo0(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        OooO00o oooO00o = this.f19954OooO0O0;
        sslError.getPrimaryError();
        ((OooO0OO) oooO00o).OooO0O0(new o00Oo0(null));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith(this.f19953OooO00o)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        TreeMap treeMapOooO00o = o00000.OooO00o(URI.create(str).getRawQuery(), false);
        Bundle bundle = new Bundle(treeMapOooO00o.size());
        for (Map.Entry entry : treeMapOooO00o.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        OooO0OO oooO0OO = (OooO0OO) this.f19954OooO0O0;
        Objects.requireNonNull(oooO0OO);
        o0oO0Ooo.OooO0OO().OooO0OO("Twitter", "OAuth web view completed successfully");
        String string = bundle.getString("oauth_verifier");
        if (string != null) {
            o0oO0Ooo.OooO0OO().OooO0OO("Twitter", "Converting the request token to an access token.");
            oooO0OO.f19951OooO0o.OooO0OO(new OooO0O0(oooO0OO), oooO0OO.f19948OooO0O0, string);
        } else {
            o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Failed to get authorization, bundle incomplete " + bundle, null);
            oooO0OO.OooO00o(1, new TwitterAuthException("Failed to get authorization, bundle incomplete"));
        }
        oooO0OO.f19950OooO0Oo.stopLoading();
        oooO0OO.f19949OooO0OO.setVisibility(8);
        return true;
    }
}
