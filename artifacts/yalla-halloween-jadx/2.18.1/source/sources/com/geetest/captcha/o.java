package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.facebook.internal.AnalyticsEvents;
import com.geetest.captcha.c.a;
import com.geetest.captcha.c.d;
import com.geetest.captcha.views.GTC4WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.qiniu.android.collect.ReportItem;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020,J\u0006\u0010.\u001a\u00020,J\u0006\u0010/\u001a\u00020,J\u000e\u00100\u001a\u00020,2\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020,2\u0006\u0010!\u001a\u00020*2\u0006\u00104\u001a\u000202J\b\u00105\u001a\u00020,H\u0002J\u001e\u00106\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020,2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010:\u001a\u00020,2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010;\u001a\u00020,2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0010\u0010<\u001a\u00020,2\b\u0010\u0011\u001a\u0004\u0018\u00010(J\u001e\u0010=\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u00107\u001a\u000208R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/geetest/captcha/handlers/Request;", "", com.umeng.analytics.pro.d.R, "Landroid/content/Context;", "dataBean", "Lcom/geetest/captcha/model/DataBean;", "(Landroid/content/Context;Lcom/geetest/captcha/model/DataBean;)V", "getContext", "()Landroid/content/Context;", "getDataBean", "()Lcom/geetest/captcha/model/DataBean;", "dialogController", "Lcom/geetest/captcha/controller/DialogController;", "getDialogController$captcha_release", "()Lcom/geetest/captcha/controller/DialogController;", "setDialogController$captcha_release", "(Lcom/geetest/captcha/controller/DialogController;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "preLoadStatus", "Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;", "getPreLoadStatus", "()Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;", "setPreLoadStatus", "(Lcom/geetest/captcha/model/StatusEnum$PreLoadStatusEnum;)V", "requestLevel", "", "getRequestLevel", "()I", "setRequestLevel", "(I)V", "response", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "Lcom/geetest/captcha/model/StatusEnum;", "getStatus", "()Lcom/geetest/captcha/model/StatusEnum;", "setStatus", "(Lcom/geetest/captcha/model/StatusEnum;)V", "webViewShowListener", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "cancel", "", "currentStatus", "", "dismiss", "hideLoading", "notifyWebViewShowed", "onFailure", "error", "", "onSuccess", ReportItem.QualityKeyResult, "onWebViewShow", "preLoadWebView", "webViewObserver", "Lcom/geetest/captcha/observer/WebViewObserver;", "setDialogController", "setListener", "setResponse", "setWebViewShowListener", "showWebViewDialog", "Companion", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class o {
    public static final a j = new a(0);

    @NotNull
    public v.a a = v.a.NONE;

    @NotNull
    public v b = v.FLOWING;
    public int c;

    @Nullable
    public com.geetest.captcha.c d;
    public GTCaptcha4Client.OnSuccessListener e;
    public GTCaptcha4Client.OnFailureListener f;
    public GTCaptcha4Client.OnWebViewShowListener g;

    @NotNull
    public final Context h;

    @NotNull
    public final t i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/geetest/captcha/handlers/Request$Companion;", "", "()V", "TAG", "", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
    public static final class b implements Runnable {
        public final /* synthetic */ String b;

        public b(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GTCaptcha4Client.OnFailureListener onFailureListener = o.this.f;
            if (onFailureListener != null) {
                onFailureListener.onFailure(this.b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
    public static final class c implements Runnable {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        public c(boolean z, String str) {
            this.b = z;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GTCaptcha4Client.OnSuccessListener onSuccessListener = o.this.e;
            if (onSuccessListener != null) {
                onSuccessListener.onSuccess(this.b, this.c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = o.this.g;
            if (onWebViewShowListener != null) {
                onWebViewShowListener.onWebViewShow();
            }
        }
    }

    public o(@NotNull Context context, @NotNull t tVar) {
        this.h = context;
        this.i = tVar;
    }

    public final void a(@NotNull v.a aVar) {
        this.a = aVar;
    }

    public final void b(@NotNull Context context, @NotNull t tVar, @NotNull x xVar) {
        com.geetest.captcha.c cVar = this.d;
        if (cVar != null) {
            try {
                w wVar = new w();
                wVar.a(xVar);
                GTC4WebView gTC4WebView = cVar.b;
                if (gTC4WebView != null) {
                    gTC4WebView.setWebViewObservable(wVar);
                }
                aj ajVar = cVar.c;
                if (ajVar != null) {
                    ajVar.b = wVar;
                    aj.b bVar = ajVar.d;
                    if (bVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("jsInterface");
                    }
                    String str = ajVar.a;
                    GTC4WebView gTC4WebView2 = ajVar.c;
                    bVar.c = wVar;
                    bVar.b = gTC4WebView2;
                    bVar.a = str;
                }
                if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                    ((Activity) context).runOnUiThread(cVar.new d(context, tVar, xVar));
                } else {
                    cVar.b(context, tVar, xVar);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void c() {
        com.geetest.captcha.d dVar;
        com.geetest.captcha.c cVar = this.d;
        if (cVar == null || (dVar = cVar.a) == null || dVar == null || !dVar.isShowing()) {
            return;
        }
        if (!(!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()))) {
            com.geetest.captcha.d dVar2 = cVar.a;
            if (dVar2 != null) {
                dVar2.dismiss();
                return;
            }
            return;
        }
        GTC4WebView gTC4WebView = cVar.b;
        Context context = gTC4WebView != null ? gTC4WebView.getContext() : null;
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        ((Activity) context).runOnUiThread(cVar.new a());
    }

    public final void a(@NotNull v vVar) {
        this.b = vVar;
    }

    public final boolean a() {
        return this.b == v.CANCEL;
    }

    public final void a(@NotNull Context context, @NotNull t tVar, @NotNull x xVar) throws JSONException, UnsupportedEncodingException {
        com.geetest.captcha.c cVar = this.d;
        if (cVar != null) {
            cVar.a(context, tVar, xVar);
        }
    }

    public final void a(@NotNull String str) {
        try {
            ag agVar = ag.a;
            ag.a("Request.onFailure: ".concat(String.valueOf(str)));
            if (a()) {
                return;
            }
            if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                Context context = this.h;
                if (context == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) context).runOnUiThread(new b(str));
            } else {
                GTCaptcha4Client.OnFailureListener onFailureListener = this.f;
                if (onFailureListener != null) {
                    onFailureListener.onFailure(str);
                }
            }
            this.b = v.CANCEL;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b() {
        GTC4WebView gTC4WebView;
        com.geetest.captcha.c cVar = this.d;
        if (cVar != null && (gTC4WebView = cVar.b) != null && gTC4WebView != null) {
            gTC4WebView.evaluateJavascript("javascript:jsBridge.callback('showBox')", com.geetest.captcha.c.b.a);
        }
        try {
            ag agVar = ag.a;
            ag.a("Request.onWebViewShow");
            if (a()) {
                return;
            }
            if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                Context context = this.h;
                if (context == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) context).runOnUiThread(new d());
                return;
            }
            GTCaptcha4Client.OnWebViewShowListener onWebViewShowListener = this.g;
            if (onWebViewShowListener != null) {
                onWebViewShowListener.onWebViewShow();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
