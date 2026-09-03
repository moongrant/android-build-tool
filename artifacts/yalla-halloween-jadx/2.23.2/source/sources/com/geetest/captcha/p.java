package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.facebook.internal.AnalyticsEvents;
import com.qiniu.android.collect.ReportItem;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/geetest/captcha/handlers/WebViewHandler;", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "Lcom/geetest/captcha/handlers/Request;", "request", "", "handler", "", "getHandlerLevel", "()I", "handlerLevel", "<init>", "()V", "Companion", "HandlerObserver", "captcha_release"}, k = 1, mv = {1, 4, 0})
public final class p extends s {
    public static final a a = new a(0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/geetest/captcha/handlers/WebViewHandler$Companion;", "", "()V", "TAG", "", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Override // com.geetest.captcha.q
    public final int a() {
        return 5;
    }

    @Override // com.geetest.captcha.q
    public final void a(@NotNull o oVar) throws JSONException, UnsupportedEncodingException {
        if (oVar.a()) {
            return;
        }
        ag.b("Step: WebViewHandler.handler");
        b bVar = new b(oVar, this);
        oVar.a(v.FLOWING);
        ag.a("Request", "currentStatus preLoadStatus: " + oVar.a.name() + ", status: " + oVar.b.name());
        v.a aVar = oVar.a;
        if (aVar == v.a.FLOWING) {
            oVar.b(oVar.h, oVar.i, bVar);
            return;
        }
        if (aVar == v.a.SUCCESS) {
            oVar.b();
            oVar.b(oVar.h, oVar.i, bVar);
            return;
        }
        if (aVar == v.a.FAIL) {
            oVar.a(oVar.h, oVar.i, bVar);
            if (oVar.b != v.FAIL) {
                oVar.b(oVar.h, oVar.i, bVar);
                return;
            }
            return;
        }
        if (aVar == v.a.NONE) {
            oVar.a(oVar.h, oVar.i, bVar);
            if (oVar.b != v.FAIL) {
                oVar.b(oVar.h, oVar.i, bVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/geetest/captcha/handlers/WebViewHandler$HandlerObserver;", "Lcom/geetest/captcha/observer/WebViewObserver;", "request", "Lcom/geetest/captcha/handlers/Request;", "handler", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "(Lcom/geetest/captcha/handlers/Request;Lcom/geetest/captcha/handlers/base/HandlerImpl;)V", "onCallReady", "", "onClose", "onError", "errorCode", "", "errorMsg", "errorDesc", "Lorg/json/JSONObject;", "onResult", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "", ReportItem.QualityKeyResult, "onWebError", "error", "onWebFailure", "fail", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class b implements x {
        final o a;
        private final s b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
        public static final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.a.b();
            }
        }

        public b(@NotNull o oVar, @NotNull s sVar) {
            this.a = oVar;
            this.b = sVar;
        }

        @Override // com.geetest.captcha.x
        public final void a() {
            if (this.a.a()) {
                return;
            }
            ag.a("WebViewHandler", "WebViewHandler.HandlerObserver.onCallReady");
            this.a.a(v.SUCCESS);
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                this.a.b();
                return;
            }
            Context context = this.a.h;
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            ((Activity) context).runOnUiThread(new a());
        }

        @Override // com.geetest.captcha.x
        public final void b() throws JSONException {
            if (this.a.a()) {
                return;
            }
            ag.a("WebViewHandler", "WebViewHandler.HandlerObserver.onClose");
            this.a.a(v.FAIL);
            ac acVar = ac.a;
            String strA = ac.a(v.CANCEL.getType(), ac.a.USER_ERROR.getType() + "60");
            u.a aVar = u.a;
            String strD = ad.d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("description", "User cancelled 'Captcha'");
            String strA2 = u.a.a(strA, strD, jSONObject).a();
            ag.b("WebViewHandler: ".concat(String.valueOf(strA2)));
            this.a.c();
            this.a.a(strA2);
        }

        @Override // com.geetest.captcha.x
        public final void a(@NotNull String str) {
            if (this.a.a()) {
                return;
            }
            ag agVar = ag.a;
            ag.b("WebViewHandler", "WebViewHandler.HandlerObserver.onWebError: ".concat(String.valueOf(str)));
            this.a.a(v.FAIL);
            s.a(this.a, str);
        }

        @Override // com.geetest.captcha.x
        public final void a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            if (this.a.a()) {
                return;
            }
            this.a.a(v.FAIL);
            ac acVar = ac.a;
            String strA = ac.a(this.a.b.getType(), str);
            u.a aVar = u.a;
            String strA2 = u.a.a(strA, str2, jSONObject).a();
            ag agVar = ag.a;
            ag.b("WebViewHandler", "WebViewHandler.HandlerObserver.onError: ".concat(String.valueOf(strA2)));
            s.a(this.a, strA2);
        }

        @Override // com.geetest.captcha.x
        public final void a(boolean z, @NotNull String str) {
            if (this.a.a()) {
                return;
            }
            ag agVar = ag.a;
            ag.b("WebViewHandler", "HandlerObserver.onResult: ".concat(String.valueOf(str)));
            if (z) {
                this.a.a(v.END);
                s.a(this.a, true, str);
            } else {
                this.a.a(v.FLOWING);
                s.a(this.a, false, str);
            }
        }
    }
}
