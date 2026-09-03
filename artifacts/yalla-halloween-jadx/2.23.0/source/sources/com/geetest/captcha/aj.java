package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.geetest.captcha.views.GTC4WebView;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p004OooO0oO.o0OoOo0;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0000H\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/geetest/captcha/views/WebViewBuilder;", "", "builder", "Lcom/geetest/captcha/views/WebViewBuilder$Builder;", "(Lcom/geetest/captcha/views/WebViewBuilder$Builder;)V", "jsInterface", "Lcom/geetest/captcha/views/WebViewBuilder$JSInterface;", "observable", "Lcom/geetest/captcha/observer/WebViewObservable;", "url", "", "webView", "Lcom/geetest/captcha/views/GTC4WebView;", "getWebView", "()Lcom/geetest/captcha/views/GTC4WebView;", "loadUrl", "setObservable", "", "Builder", "JSInterface", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class aj {
    public final String a;
    public w b;

    @NotNull
    public final GTC4WebView c;
    public b d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/geetest/captcha/views/WebViewBuilder$Builder;", "", "()V", "observable", "Lcom/geetest/captcha/observer/WebViewObservable;", "getObservable", "()Lcom/geetest/captcha/observer/WebViewObservable;", "setObservable", "(Lcom/geetest/captcha/observer/WebViewObservable;)V", "url", "", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "webView", "Lcom/geetest/captcha/views/GTC4WebView;", "getWebView", "()Lcom/geetest/captcha/views/GTC4WebView;", "setWebView", "(Lcom/geetest/captcha/views/GTC4WebView;)V", "build", "Lcom/geetest/captcha/views/WebViewBuilder;", "newWebView", "context", "Landroid/content/Context;", "dataBean", "Lcom/geetest/captcha/model/DataBean;", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {

        @NotNull
        public String a;

        @NotNull
        public w b;

        @NotNull
        public GTC4WebView c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0007J\u001e\u0010\f\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/geetest/captcha/views/WebViewBuilder$JSInterface;", "", "url", "", "webView", "Lcom/geetest/captcha/views/GTC4WebView;", "observable", "Lcom/geetest/captcha/observer/WebViewObservable;", "(Ljava/lang/String;Lcom/geetest/captcha/views/GTC4WebView;Lcom/geetest/captcha/observer/WebViewObservable;)V", "gt4Notify", "", "response", "setObservable", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class b {
        public String a;
        public GTC4WebView b;
        public w c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
        public static final class a implements Runnable {
            final /* synthetic */ String b;

            public a(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.b.evaluateJavascript(o0O00o0.OooO0O0(new StringBuilder("javascript:jsBridge.callback('postNativeMessage', '"), this.b, "')"), new ValueCallback<String>() { // from class: com.geetest.captcha.aj.b.a.1
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(String str) {
                        ag agVar = ag.a;
                        ag.a("WebViewBuilder javascript:jsBridge.callback('postNativeMessage') return: ".concat(String.valueOf(str)));
                    }
                });
            }
        }

        public b(@NotNull String str, @NotNull GTC4WebView gTC4WebView, @NotNull w wVar) {
            this.a = str;
            this.b = gTC4WebView;
            this.c = wVar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JavascriptInterface
        public final void gt4Notify(@Nullable String response) throws JSONException {
            ag agVar = ag.a;
            StringBuilder sbOooO00o = o0OoOo0.OooO00o("JSInterface.gt4Notify: ", response, ", main: ");
            sbOooO00o.append(Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()));
            ag.b(sbOooO00o.toString());
            if (response == null || StringsKt.isBlank(response)) {
                w wVar = this.c;
                String str = ac.a.WEB_CALLBACK_ERROR.getType() + "80";
                String strA = ad.a();
                u.a aVar = u.a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", "The Web callback data is empty");
                wVar.a(str, strA, jSONObject);
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(response);
                String string = jSONObject2.getString("type");
                if (string != null) {
                    switch (string.hashCode()) {
                        case -934426595:
                            if (string.equals(ReportItem.QualityKeyResult)) {
                                String string2 = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkExpressionValueIsNotNull(string2, "jsonObject.getJSONObject(\"data\").toString()");
                                this.c.a(true, string2);
                                return;
                            }
                            break;
                        case 102230:
                            if (string.equals("get")) {
                                try {
                                    if ((!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) && (this.b.getContext() instanceof Activity)) {
                                        y yVar = y.a;
                                        String strA2 = y.a(this.b.getContext(), this.a);
                                        if (strA2 == null || StringsKt.isBlank(strA2)) {
                                            return;
                                        }
                                        Context context = this.b.getContext();
                                        if (context == null) {
                                            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                                        }
                                        ((Activity) context).runOnUiThread(new a(strA2));
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                            }
                            break;
                        case 3135262:
                            if (string.equals("fail")) {
                                String string3 = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkExpressionValueIsNotNull(string3, "jsonObject.getJSONObject(\"data\").toString()");
                                this.c.a(false, string3);
                                return;
                            }
                            break;
                        case 94756344:
                            if (string.equals("close")) {
                                this.c.b();
                                return;
                            }
                            break;
                        case 96784904:
                            if (string.equals("error")) {
                                String string4 = jSONObject2.getJSONObject("data").toString();
                                Intrinsics.checkExpressionValueIsNotNull(string4, "jsonObject.getJSONObject(\"data\").toString()");
                                this.c.a(string4);
                                return;
                            }
                            break;
                        case 108386723:
                            if (string.equals("ready")) {
                                this.c.a();
                                return;
                            }
                            break;
                    }
                }
                w wVar2 = this.c;
                String str2 = ac.a.WEB_CALLBACK_ERROR.getType() + "82";
                String strA3 = ad.a();
                u.a aVar2 = u.a;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("description", jSONObject2);
                wVar2.a(str2, strA3, jSONObject3);
            } catch (Exception e2) {
                e2.printStackTrace();
                w wVar3 = this.c;
                String str3 = ac.a.WEB_CALLBACK_ERROR.getType() + "81";
                String strA4 = ad.a();
                u.a aVar3 = u.a;
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("exception", e2.getMessage());
                jSONObject4.put("description", response);
                wVar3.a(str3, strA4, jSONObject4);
            }
        }
    }

    private aj(a aVar) {
        String str = aVar.a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        this.a = str;
        w wVar = aVar.b;
        if (wVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("observable");
        }
        this.b = wVar;
        GTC4WebView gTC4WebView = aVar.c;
        if (gTC4WebView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
        }
        this.c = gTC4WebView;
    }

    public /* synthetic */ aj(a aVar, byte b2) {
        this(aVar);
    }
}
