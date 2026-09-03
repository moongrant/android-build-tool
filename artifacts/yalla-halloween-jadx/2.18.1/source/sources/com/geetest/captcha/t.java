package com.geetest.captcha;

import com.facebook.internal.NativeProtocol;
import com.qiniu.android.http.ResponseInfo;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\"\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR>\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00162\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0016@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/geetest/captcha/model/DataBean;", "", "()V", "<set-?>", "", "backgroundColor", "getBackgroundColor", "()I", "", "captchaId", "getCaptchaId", "()Ljava/lang/String;", "dialogStyle", "getDialogStyle", "html", "getHtml", "", "isCanceledOnTouchOutside", "()Z", "isDebug", ak.N, "getLanguage", "", NativeProtocol.WEB_DIALOG_PARAMS, "getParams", "()Ljava/util/Map;", "timeOut", "getTimeOut", "Companion", "captcha_release"}, k = 1, mv = {1, 1, 16})
public final class t {
    public static final a j = new a(0);

    @NotNull
    public String a;

    @NotNull
    public String b;
    public boolean c;

    @Nullable
    public String d;

    @Nullable
    public Map<String, ? extends Object> e;
    public boolean f;
    public int g;
    public int h;

    @Nullable
    public String i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/geetest/captcha/model/DataBean$Companion;", "", "()V", "build", "Lcom/geetest/captcha/model/DataBean;", "captchaId", "", "config", "Lcom/geetest/captcha/GTCaptcha4Config;", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        @NotNull
        public static t a(@NotNull String str, @Nullable GTCaptcha4Config gTCaptcha4Config) {
            t tVar = new t((byte) 0);
            tVar.a = str;
            if (gTCaptcha4Config != null) {
                tVar.c = gTCaptcha4Config.isDebug();
                String html = gTCaptcha4Config.getHtml();
                Intrinsics.checkExpressionValueIsNotNull(html, "it.html");
                tVar.b = html;
                tVar.d = gTCaptcha4Config.getLanguage();
                tVar.f = gTCaptcha4Config.isCanceledOnTouchOutside();
                tVar.e = gTCaptcha4Config.getParams();
                tVar.g = gTCaptcha4Config.getTimeOut();
                tVar.h = gTCaptcha4Config.getBackgroundColor();
                tVar.i = gTCaptcha4Config.getDialogStyle();
            }
            if (StringsKt.isBlank(tVar.b)) {
                tVar.b = "file:///android_asset/gt4-index.html";
            }
            return tVar;
        }
    }

    private t() {
        this.b = "file:///android_asset/gt4-index.html";
        this.f = true;
        this.g = ResponseInfo.UnknownError;
    }

    public /* synthetic */ t(byte b) {
        this();
    }
}
