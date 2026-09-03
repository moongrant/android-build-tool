package com.geetest.captcha.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.geetest.captcha.ac;
import com.geetest.captcha.ad;
import com.geetest.captcha.ag;
import com.geetest.captcha.u;
import com.geetest.captcha.w;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0003&'(B\u001d\b\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 B%\b\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\"B-\b\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010$B\u0013\b\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0016J(\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0014J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/geetest/captcha/views/GTC4WebView;", "Landroid/webkit/WebView;", "", "onDetachedFromWindow", "onResume", "", "newWidth", "newHeight", "oldWidth", "oldHeight", "onSizeChanged", "Lcom/geetest/captcha/observer/WebViewObservable;", "observable", "Lcom/geetest/captcha/model/DataBean;", "dataBean", "", "loadUrl", "init", "url", "parseUrl", "setWebViewObservable", "Lcom/geetest/captcha/views/GTC4WebView$MyWebViewClient;", "myWebViewClient", "Lcom/geetest/captcha/views/GTC4WebView$MyWebViewClient;", "", "resumeTimers", "Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;)V", "Companion", "MyWebChromeClient", "MyWebViewClient", "captcha_release"}, k = 1, mv = {1, 4, 0})
public final class GTC4WebView extends WebView {
    public static final a b = new a(0);
    public c a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/geetest/captcha/views/GTC4WebView$Companion;", "", "()V", "TAG", "", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/geetest/captcha/views/GTC4WebView$MyWebChromeClient;", "Landroid/webkit/WebChromeClient;", "()V", "onProgressChanged", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "newProgress", "", "onReceivedTitle", ShareConstants.WEB_DIALOG_PARAM_TITLE, "", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class b extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@NotNull WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
            ag agVar = ag.a;
            ag.a("GTC4WebView", "onProgressChanged: ".concat(String.valueOf(newProgress)));
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(@NotNull WebView view, @NotNull String title) {
            super.onReceivedTitle(view, title);
            ag agVar = ag.a;
            ag.a("onReceivedTitle: ".concat(String.valueOf(title)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J&\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J \u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005J\u001c\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010!\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/geetest/captcha/views/GTC4WebView$MyWebViewClient;", "Landroid/webkit/WebViewClient;", "loadUrl", "", "observable", "Lcom/geetest/captcha/observer/WebViewObservable;", "(Ljava/lang/String;Lcom/geetest/captcha/observer/WebViewObservable;)V", "onLoadResource", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "setObservable", "shouldOverrideUrlLoading", "", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class c extends WebViewClient {
        w a;
        private String b;

        public c(@NotNull String str, @NotNull w wVar) {
            this.b = str;
            this.a = wVar;
        }

        @Override // android.webkit.WebViewClient
        public final void onLoadResource(@NotNull WebView view, @NotNull String url) {
            super.onLoadResource(view, url);
            ag agVar = ag.a;
            ag.b("onLoadResource: ".concat(String.valueOf(url)));
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@NotNull WebView view, @NotNull String url) {
            super.onPageFinished(view, url);
            ag agVar = ag.a;
            ag.b("onPageFinished: ".concat(String.valueOf(url)));
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            ag agVar = ag.a;
            ag.b("onPageStarted: ".concat(String.valueOf(url)));
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceError error) {
            super.onReceivedError(view, request, error);
            ag agVar = ag.a;
            ag.b("WebViewClient.onReceivedError: URL: " + request.getUrl() + ", Method: " + request.getMethod() + ", ErrorCode: " + error.getErrorCode() + ", Description: " + error.getDescription());
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(@NotNull WebView view, @NotNull WebResourceRequest request, @NotNull WebResourceResponse errorResponse) {
            super.onReceivedHttpError(view, request, errorResponse);
            ag agVar = ag.a;
            ag.b("WebViewClient.onReceivedHttpError: URL: " + request.getUrl() + ", Code: " + errorResponse.getStatusCode() + ", Message: " + errorResponse.getReasonPhrase());
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(@NotNull WebView view, @NotNull SslErrorHandler handler, @NotNull SslError error) throws JSONException {
            super.onReceivedSslError(view, handler, error);
            ag agVar = ag.a;
            ag.b("WebViewClient.onReceivedSslError: URL: " + error.getUrl() + ", ErrorCode: " + error.getPrimaryError() + ", Description: " + error);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(Math.abs(error.getPrimaryError()))}, 1));
            Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(format, *args)");
            w wVar = this.a;
            String str2 = ac.a.WEB_VIEW_SSL.getType() + str;
            String strB = ad.b();
            u.a aVar = u.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", error.getUrl());
            jSONObject.put("description", error.toString());
            wVar.a(str2, strB, jSONObject);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
            Context context;
            ag agVar = ag.a;
            StringBuilder sb = new StringBuilder("shouldOverrideUrlLoading(high): ");
            sb.append(request != null ? request.getUrl() : null);
            ag.b(sb.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(String.valueOf(request != null ? request.getUrl() : null)));
                if (view == null || (context = view.getContext()) == null) {
                    return true;
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView view, int errorCode, @NotNull String description, @NotNull String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GTC4WebView(@Nullable Context context) {
        super(context);
        if (context == null) {
            Intrinsics.throwNpe();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ag.b("GTC4WebView.onDetachedFromWindow");
        super.onDetachedFromWindow();
        removeJavascriptInterface("JSInterface");
        removeAllViews();
        removeAllViewsInLayout();
        loadUrl("");
    }

    @Override // android.webkit.WebView
    public final void onResume() {
        super.onResume();
        resumeTimers();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int newWidth, int newHeight, int oldWidth, int oldHeight) {
        super.onSizeChanged(newWidth, newHeight, oldWidth, oldHeight);
        ag agVar = ag.a;
        StringBuilder sbOooO00o = o00000.OooO00o("newWidth: ", newWidth, ", newHeight: ", newHeight, ", oldWidth: ");
        sbOooO00o.append(oldWidth);
        sbOooO00o.append(", oldHeight: ");
        sbOooO00o.append(oldHeight);
        ag.a("GTC4WebView", sbOooO00o.toString());
    }

    public final void setWebViewObservable(@NotNull w wVar) {
        c cVar = this.a;
        if (cVar != null) {
            cVar.a = wVar;
        }
    }
}
