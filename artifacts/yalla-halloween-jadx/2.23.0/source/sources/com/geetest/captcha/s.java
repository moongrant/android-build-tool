package com.geetest.captcha;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.facebook.internal.AnalyticsEvents;
import com.geetest.captcha.o.c;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/geetest/captcha/handlers/base/HandlerImpl;", "Lcom/geetest/captcha/handlers/base/Handler;", "Lcom/geetest/captcha/handlers/Request;", "request", "", "handlerRequest", "", "error", "onFailure", "", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, ReportItem.QualityKeyResult, "onSuccess", "onWebFailure", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "next", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "getNext", "()Lcom/geetest/captcha/handlers/base/HandlerImpl;", "setNext", "(Lcom/geetest/captcha/handlers/base/HandlerImpl;)V", "<init>", "()V", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 0})
public abstract class s implements q {
    public static final a c = new a(0);

    @Nullable
    public s b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/geetest/captcha/handlers/base/HandlerImpl$Companion;", "", "()V", "TAG", "", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static void a(@NotNull o oVar, boolean z, @NotNull String str) {
        if (oVar.a()) {
            return;
        }
        if (z) {
            oVar.c();
        }
        try {
            if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
                Context context = oVar.h;
                if (context == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
                ((Activity) context).runOnUiThread(oVar.new c(z, str));
                return;
            }
            GTCaptcha4Client.OnSuccessListener onSuccessListener = oVar.e;
            if (onSuccessListener != null) {
                onSuccessListener.onSuccess(z, str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(@NotNull o oVar) {
        s sVar = this;
        while (!oVar.a()) {
            if (sVar.a() >= oVar.c) {
                sVar.a(oVar);
                return;
            } else {
                sVar = sVar.b;
                if (sVar == null) {
                    return;
                }
            }
        }
    }

    public static void a(@NotNull o oVar, @NotNull String str) {
        if (oVar.a()) {
            return;
        }
        ag agVar = ag.a;
        ag.b("HandlerImpl.onFailure: ".concat(String.valueOf(str)));
        if (oVar.b == v.FAIL) {
            oVar.c();
            oVar.a(str);
        }
    }
}
