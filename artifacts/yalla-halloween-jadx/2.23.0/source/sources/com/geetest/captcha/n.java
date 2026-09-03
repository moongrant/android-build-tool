package com.geetest.captcha;

import com.facebook.internal.AnalyticsEvents;
import com.qiniu.android.collect.ReportItem;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\f\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/geetest/captcha/handlers/PreLoadHandler;", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "Lcom/geetest/captcha/handlers/Request;", "request", "", "handler", "", "getHandlerLevel", "()I", "handlerLevel", "<init>", "()V", "Companion", "HandlerObserver", "captcha_release"}, k = 1, mv = {1, 4, 0})
public final class n extends s {
    public static final a a = new a(0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/geetest/captcha/handlers/PreLoadHandler$Companion;", "", "()V", "TAG", "", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Override // com.geetest.captcha.q
    public final int a() {
        return 1;
    }

    @Override // com.geetest.captcha.q
    public final void a(@NotNull o oVar) throws JSONException, UnsupportedEncodingException {
        if (oVar.a()) {
            return;
        }
        ag.b("Step: PreLoadHandler.handler");
        oVar.a(v.a.FLOWING);
        oVar.a(oVar.h, oVar.i, new b(oVar, this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/geetest/captcha/handlers/PreLoadHandler$HandlerObserver;", "Lcom/geetest/captcha/observer/WebViewObserver;", "request", "Lcom/geetest/captcha/handlers/Request;", "handler", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "(Lcom/geetest/captcha/handlers/Request;Lcom/geetest/captcha/handlers/base/HandlerImpl;)V", "onCallReady", "", "onClose", "onError", "errorCode", "", "errorMsg", "errorDesc", "Lorg/json/JSONObject;", "onResult", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "", ReportItem.QualityKeyResult, "onWebError", "error", "onWebFailure", "fail", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class b implements x {
        private final o a;
        private final s b;

        public b(@NotNull o oVar, @NotNull s sVar) {
            this.a = oVar;
            this.b = sVar;
        }

        @Override // com.geetest.captcha.x
        public final void a() {
            s sVar;
            if (this.a.a()) {
                return;
            }
            ag.b("PreLoadHandler", "HandlerObserver.onCallReady");
            this.a.a(v.a.SUCCESS);
            o oVar = this.a;
            v vVar = oVar.b;
            if (vVar == v.NONE || vVar != v.FLOWING || (sVar = this.b.b) == null) {
                return;
            }
            sVar.b(oVar);
        }

        @Override // com.geetest.captcha.x
        public final void b() {
            if (this.a.a()) {
                return;
            }
            ag.b("PreLoadHandler", "PreLoadHandler.HandlerObserver.onClose");
        }

        @Override // com.geetest.captcha.x
        public final void a(@NotNull String str) {
            s sVar;
            if (this.a.a()) {
                return;
            }
            ag agVar = ag.a;
            ag.b("PreLoadHandler", "PreLoadHandler.HandlerObserver.onWebError: ".concat(String.valueOf(str)));
            this.a.a(v.a.FAIL);
            ag.b(str);
            o oVar = this.a;
            v vVar = oVar.b;
            if (vVar == v.NONE || vVar != v.FLOWING || (sVar = this.b.b) == null) {
                return;
            }
            sVar.b(oVar);
        }

        @Override // com.geetest.captcha.x
        public final void a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject) {
            s sVar;
            if (this.a.a()) {
                return;
            }
            this.a.a(v.a.FAIL);
            ac acVar = ac.a;
            String strA = ac.a(this.a.a.getType(), str);
            u.a aVar = u.a;
            String strA2 = u.a.a(strA, str2, jSONObject).a();
            ag agVar = ag.a;
            ag.b("PreLoadHandler", "PreLoadHandler.HandlerObserver.onError: ".concat(String.valueOf(strA2)));
            o oVar = this.a;
            v vVar = oVar.b;
            if (vVar == v.NONE || vVar != v.FLOWING || (sVar = this.b.b) == null) {
                return;
            }
            sVar.b(oVar);
        }

        @Override // com.geetest.captcha.x
        public final void a(boolean z, @NotNull String str) {
            if (this.a.a()) {
                return;
            }
            ag agVar = ag.a;
            ag.b("PreLoadHandler", "PreLoadHandler.HandlerObserver.onResult: ".concat(String.valueOf(str)));
            this.a.a(v.a.FAIL);
        }
    }
}
