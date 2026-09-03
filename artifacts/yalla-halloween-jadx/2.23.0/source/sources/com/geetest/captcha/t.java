package com.geetest.captcha;

import com.facebook.internal.NativeProtocol;
import com.qiniu.android.http.ResponseInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR$\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\fRD\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00182\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\u0005\u001a\u0004\b\u001e\u0010\u0007¨\u0006\""}, d2 = {"Lcom/geetest/captcha/model/DataBean;", "", "", "<set-?>", "backgroundColor", "I", "getBackgroundColor", "()I", "", "captchaId", "Ljava/lang/String;", "getCaptchaId", "()Ljava/lang/String;", "dialogStyle", "getDialogStyle", "html", "getHtml", "", "isCanceledOnTouchOutside", "Z", "()Z", "isDebug", "language", "getLanguage", "", NativeProtocol.WEB_DIALOG_PARAMS, "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "timeOut", "getTimeOut", "<init>", "()V", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 0})
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
