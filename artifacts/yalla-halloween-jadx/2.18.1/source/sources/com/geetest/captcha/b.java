package com.geetest.captcha;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0018\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\u001f\u001a\u00020 2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002J\u0006\u0010!\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/geetest/captcha/controller/Controller;", "", com.umeng.analytics.pro.d.R, "Landroid/content/Context;", "(Landroid/content/Context;)V", "appId", "", "config", "Lcom/geetest/captcha/GTCaptcha4Config;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "preLoadHandler", "Lcom/geetest/captcha/handlers/PreLoadHandler;", "request", "Lcom/geetest/captcha/handlers/Request;", "response", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "webViewHandler", "Lcom/geetest/captcha/handlers/WebViewHandler;", "webViewShowListener", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "addOnFailureListener", "", "addOnSuccessListener", "addOnWebViewShowListener", "configurationChanged", "newConfig", "Landroid/content/res/Configuration;", "preLoadWithCaptcha", "setAppId", "setConfig", "validityCheck", "", "verifyWithCaptcha", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class b {
    public String a;
    public GTCaptcha4Client.OnSuccessListener b;
    public GTCaptcha4Client.OnFailureListener c;
    public GTCaptcha4Client.OnWebViewShowListener d;
    public GTCaptcha4Config e;
    public o f;
    public p g;
    public final Context h;
    private n i;

    public b(@NotNull Context context) {
        this.h = context;
    }

    public final void a(@NotNull String str) {
        this.a = str;
    }

    public final void a() {
        this.i = new n();
        this.g = new p();
        n nVar = this.i;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preLoadHandler");
        }
        p pVar = this.g;
        if (pVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewHandler");
        }
        nVar.b = pVar;
        Context context = this.h;
        t.a aVar = t.j;
        String str = this.a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appId");
        }
        o oVar = new o(context, t.a.a(str, this.e));
        this.f = oVar;
        oVar.a(v.a.FLOWING);
        o oVar2 = this.f;
        if (oVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
        }
        oVar2.a(v.NONE);
        o oVar3 = this.f;
        if (oVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
        }
        oVar3.d = new c();
        n nVar2 = this.i;
        if (nVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("preLoadHandler");
        }
        o oVar4 = this.f;
        if (oVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
        }
        nVar2.b(oVar4);
    }
}
