package com.geetest.captcha;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.geetest.captcha.views.GTC4WebView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.common.Constants;
import com.umeng.analytics.pro.ak;
import com.umeng.umcrash.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010J\u001e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ)\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f\"\u00020 H\u0002¢\u0006\u0002\u0010!J\u001a\u0010\"\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/geetest/captcha/controller/DialogController;", "", "()V", "build", "Lcom/geetest/captcha/views/WebViewBuilder;", "dialog", "Lcom/geetest/captcha/dialog/GTC4Dialog;", "getDialog$captcha_release", "()Lcom/geetest/captcha/dialog/GTC4Dialog;", "setDialog$captcha_release", "(Lcom/geetest/captcha/dialog/GTC4Dialog;)V", "frameLayout", "Landroid/widget/FrameLayout;", "webView", "Lcom/geetest/captcha/views/GTC4WebView;", "addLoadingView", "", com.umeng.analytics.pro.d.R, "Landroid/content/Context;", "dismiss", "hideLoading", "notifyWebViewShowed", "preLoadWebView", "dataBean", "Lcom/geetest/captcha/model/DataBean;", "webViewObserver", "Lcom/geetest/captcha/observer/WebViewObserver;", "removeObjectsForKeys", "json", "Lorg/json/JSONObject;", "keys", "", "", "(Lorg/json/JSONObject;[Ljava/lang/String;)V", "setOnKeyListener", "showGTC4Dialog", "showLoadSuccessDialog", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class c {

    @Nullable
    public com.geetest.captcha.d a;
    public GTC4WebView b;
    public aj c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "run", "com/geetest/captcha/controller/DialogController$dismiss$1$1$1", "com/geetest/captcha/controller/DialogController$$special$$inlined$let$lambda$1"}, k = 3, mv = {1, 1, 16})
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.geetest.captcha.d dVar = c.this.a;
            if (dVar != null) {
                dVar.dismiss();
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "onReceiveValue", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b<T> implements ValueCallback<String> {
        public static final b a = new b();

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(String str) {
            ag agVar = ag.a;
            ag.b("DialogController javascript:jsBridge.callback('showBox') return: ".concat(String.valueOf(str)));
        }
    }

    /* JADX INFO: renamed from: com.geetest.captcha.c$c, reason: collision with other inner class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/geetest/captcha/controller/DialogController$setOnKeyListener$1", "Landroid/content/DialogInterface$OnKeyListener;", "onKey", "", "dialogInterface", "Landroid/content/DialogInterface;", "keyCode", "", "event", "Landroid/view/KeyEvent;", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class DialogInterfaceOnKeyListenerC0091c implements DialogInterface.OnKeyListener {
        public final /* synthetic */ x a;

        public DialogInterfaceOnKeyListenerC0091c(x xVar) {
            this.a = xVar;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(@Nullable DialogInterface dialogInterface, int keyCode, @Nullable KeyEvent event) {
            if (keyCode != 4 || event == null || event.getRepeatCount() != 0 || event.getAction() != 1) {
                return false;
            }
            this.a.b();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
    public static final class d implements Runnable {
        public final /* synthetic */ Context b;
        public final /* synthetic */ t c;
        public final /* synthetic */ x d;

        public d(Context context, t tVar, x xVar) {
            this.b = context;
            this.c = tVar;
            this.d = xVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                c.this.b(this.b, this.c, this.d);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void a(@NotNull Context context, @NotNull t tVar, @NotNull x xVar) throws JSONException, UnsupportedEncodingException {
        String str;
        Locale locale;
        w wVar = new w();
        wVar.a(xVar);
        ae.b bVar = ae.a;
        ae aeVarA = ae.b.a(tVar.b);
        if (aeVarA == null) {
            String str2 = ac.a.PARAM.getType() + "75";
            ad adVar = ad.a;
            String strC = ad.c();
            u.a aVar = u.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", "Address configuration error");
            xVar.a(str2, strC, jSONObject);
            return;
        }
        ae.a aVarA = aeVarA.a();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("displayArea", z.CENTER.getValue());
        jSONObject2.put("protocol", "https://");
        jSONObject2.put("loading", "./gt4-loading.gif");
        JSONObject jSONObject3 = null;
        Map<String, ? extends Object> map = tVar.e;
        ag agVar = ag.a;
        ag.a("Config Params: " + String.valueOf(map));
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (Intrinsics.areEqual("xid", key)) {
                    y yVar = y.a;
                    HashMap map2 = new HashMap();
                    if (value != null && (value instanceof JSONObject)) {
                        map2.put("xid", value);
                    }
                    y.a(map2);
                } else if (!Intrinsics.areEqual("_gee_info", key)) {
                    jSONObject2.put(key, value);
                } else if (value != null && (value instanceof JSONObject)) {
                    jSONObject3 = (JSONObject) value;
                    a(jSONObject3, "geeid", "packageName", "displayName", "appVer", "build", "clientVersion");
                }
            }
        }
        Map<String, String> map3 = aVarA.b;
        if (map3 != null) {
            for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                jSONObject2.put(entry2.getKey(), entry2.getValue());
            }
            map3.clear();
        }
        String str3 = tVar.a;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("captchaId");
        }
        jSONObject2.put("captchaId", str3);
        jSONObject2.put("challenge", UUID.randomUUID().toString());
        jSONObject2.put(BuildConfig.BUILD_TYPE, tVar.c);
        String str4 = tVar.d;
        if (str4 == null || StringsKt.isBlank(str4)) {
            if (Build.VERSION.SDK_INT >= 24) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext, "context.applicationContext");
                Resources resources = applicationContext.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources, "context.applicationContext.resources");
                Configuration configuration = resources.getConfiguration();
                Intrinsics.checkExpressionValueIsNotNull(configuration, "context.applicationContext.resources.configuration");
                locale = configuration.getLocales().get(0);
                Intrinsics.checkExpressionValueIsNotNull(locale, "context.applicationConte….configuration.locales[0]");
            } else {
                Context applicationContext2 = context.getApplicationContext();
                Intrinsics.checkExpressionValueIsNotNull(applicationContext2, "context.applicationContext");
                Resources resources2 = applicationContext2.getResources();
                Intrinsics.checkExpressionValueIsNotNull(resources2, "context.applicationContext.resources");
                locale = resources2.getConfiguration().locale;
                Intrinsics.checkExpressionValueIsNotNull(locale, "context.applicationConte…rces.configuration.locale");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage());
            sb.append('-');
            String country = locale.getCountry();
            Intrinsics.checkExpressionValueIsNotNull(country, "locale.country");
            Locale locale2 = Locale.ROOT;
            Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.ROOT");
            if (country == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = country.toLowerCase(locale2);
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            jSONObject2.put(ak.N, sb.toString());
        } else {
            jSONObject2.put(ak.N, tVar.d);
        }
        jSONObject2.put("timeout", tVar.g);
        jSONObject2.put("clientVersion", "1.7.6");
        jSONObject2.put("clientType", "android");
        jSONObject2.put("outside", tVar.f);
        try {
            JSONObject jSONObject4 = new JSONObject();
            g unused = g.a.a;
            h unused2 = h.a.a;
            jSONObject4.put("geeid", new JSONObject(h.a(context)));
            jSONObject4.put("packageName", context.getPackageName());
            CharSequence charSequenceLoadLabel = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).loadLabel(context.getPackageManager());
            Intrinsics.checkExpressionValueIsNotNull(charSequenceLoadLabel, "context.packageManager.g…l(context.packageManager)");
            str = "description";
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                jSONObject4.put("displayName", URLEncoder.encode(charSequenceLoadLabel.toString(), Constants.UTF_8));
                jSONObject4.put("appVer", packageInfo.versionName);
                jSONObject4.put("build", String.valueOf(packageInfo.versionCode));
                jSONObject4.put("clientVersion", "1.7.6");
                if (jSONObject3 != null && jSONObject3.length() > 0) {
                    Iterator<String> keys = jSONObject3.keys();
                    Intrinsics.checkExpressionValueIsNotNull(keys, "keys");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject4.put(next, jSONObject3.opt(next));
                    }
                }
                ai aiVar = ai.a;
                jSONObject4.put(ak.al, ai.a(context));
                jSONObject2.put("mi", jSONObject4);
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e = e2;
            str = "description";
        }
        try {
            if (!jSONObject2.has("displayMode") || ((jSONObject2.get("displayMode") instanceof Integer) && Intrinsics.areEqual(jSONObject2.get("displayMode"), Integer.valueOf(aa.AUTO.getValue())))) {
                ab abVar = ab.a;
                jSONObject2.put("displayMode", (ab.c(context) ? aa.DARK : aa.NORMAL).getValue());
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        ag agVar2 = ag.a;
        ag.a("BaseURL: " + tVar.b + ", Parameter: " + jSONObject2);
        JSONObject jSONObject5 = new JSONObject(jSONObject2.toString());
        if (jSONObject5.has("mi")) {
            jSONObject5.remove("mi");
        }
        ag.b("BaseURL: " + tVar.b + ", Parameter: " + jSONObject5);
        String strEncode = URLEncoder.encode(jSONObject2.toString(), Constants.UTF_8);
        Map<String, String> map4 = aVarA.b;
        if (map4 != null) {
            map4.put("data", strEncode);
        }
        try {
            aj.a aVar2 = new aj.a();
            aVar2.a = new ae(aVarA.a, aVarA.b, (byte) 0).toString();
            GTC4WebView gTC4WebView = new GTC4WebView(context);
            aVar2.c = gTC4WebView;
            String str5 = aVar2.a;
            if (str5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("url");
            }
            WebSettings settings = gTC4WebView.getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings, "settings");
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptEnabled(true);
            settings.setBlockNetworkImage(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setAppCacheEnabled(true);
            settings.setCacheMode(2);
            settings.setSupportZoom(true);
            settings.setTextZoom(100);
            settings.setAllowFileAccess(false);
            settings.setSavePassword(false);
            settings.setGeolocationEnabled(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            gTC4WebView.removeJavascriptInterface("searchBoxJavaBridge_");
            gTC4WebView.removeJavascriptInterface("accessibility");
            gTC4WebView.removeJavascriptInterface("accessibilityTraversal");
            gTC4WebView.setOverScrollMode(2);
            gTC4WebView.setScrollContainer(false);
            gTC4WebView.setHorizontalScrollBarEnabled(false);
            gTC4WebView.setVerticalScrollBarEnabled(false);
            gTC4WebView.setWebChromeClient(new GTC4WebView.b());
            GTC4WebView.c cVar = new GTC4WebView.c(str5, wVar);
            gTC4WebView.a = cVar;
            gTC4WebView.setWebViewClient(cVar);
            gTC4WebView.setBackgroundColor(tVar.h);
            if (tVar.c) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            gTC4WebView.onResume();
            aVar2.b = wVar;
            aj ajVar = new aj(aVar2, (byte) 0);
            aj.b bVar2 = new aj.b(ajVar.a, ajVar.c, ajVar.b);
            ajVar.d = bVar2;
            ajVar.c.addJavascriptInterface(bVar2, "JSInterface");
            ajVar.c.buildLayer();
            ajVar.c.loadUrl(ajVar.a);
            ajVar.c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.c = ajVar;
            this.b = ajVar.c;
        } catch (Exception e4) {
            e4.printStackTrace();
            if (e4.getMessage() != null) {
                String str6 = ac.a.WEB_VIEW_NEW.getType() + "99";
                ad adVar2 = ad.a;
                String strE = ad.e();
                u.a aVar3 = u.a;
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(str, "Device not supported");
                jSONObject6.put("exception", e4.getMessage());
                xVar.a(str6, strE, jSONObject6);
            }
        }
    }

    public final void b(Context context, t tVar, x xVar) {
        com.geetest.captcha.d dVar;
        if (TextUtils.isEmpty(tVar.i)) {
            dVar = new com.geetest.captcha.d(context);
        } else {
            String str = tVar.i;
            dVar = str != null ? new com.geetest.captcha.d(context, str) : null;
        }
        this.a = dVar;
        if (dVar != null) {
            dVar.a = this.b;
        }
        if (dVar != null) {
            dVar.setOnKeyListener(new DialogInterfaceOnKeyListenerC0091c(xVar));
        }
        com.geetest.captcha.d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.show();
        }
    }

    private static void a(JSONObject jSONObject, String... strArr) {
        for (int i = 0; i < 6; i++) {
            String str = strArr[i];
            if (jSONObject.has(str)) {
                jSONObject.remove(str);
            }
        }
    }
}
