package com.geetest.captcha;

import android.content.Context;
import android.util.Pair;
import com.geetest.captcha.views.GTC4WebView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.geetest.captcha.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0004J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0006\u0010\u0016\u001a\u00020\u0004R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006\""}, d2 = {"Lcom/geetest/captcha/GTCaptcha4Holder;", "", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addOnFailureListener", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "response", "addOnSuccessListener", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "webViewShowListener", "addOnWebViewShowListener", "Landroid/content/res/Configuration;", "newConfig", "configurationChanged", "destroy", "", RemoteConfigConstants$RequestFieldKey.APP_ID, "Lcom/geetest/captcha/GTCaptcha4Config;", "config", "init", "preLoadWithCaptcha", "verifyWithCaptcha", "Lcom/geetest/captcha/controller/Controller;", "controller", "Lcom/geetest/captcha/controller/Controller;", "Lcom/geetest/captcha/GTCaptcha4Client$OnFailureListener;", "Lcom/geetest/captcha/GTCaptcha4Client$OnSuccessListener;", "Lcom/geetest/captcha/GTCaptcha4Client$OnWebViewShowListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "captcha_release"}, k = 1, mv = {1, 4, 0})
public final class GTCaptcha4Holder {
    static long e;
    public static final a f = new a(0);
    final b a;
    GTCaptcha4Client.OnSuccessListener b;
    GTCaptcha4Client.OnFailureListener c;
    GTCaptcha4Client.OnWebViewShowListener d;

    /* JADX INFO: renamed from: com.geetest.captcha.a$a */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/geetest/captcha/GTCaptcha4Holder$Companion;", "", "()V", "lastClickTime", "", "supportWebView", "Landroid/util/Pair;", "", "", "context", "Landroid/content/Context;", "captcha_release"}, k = 1, mv = {1, 1, 16})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        @NotNull
        public static Pair<Boolean, String> a(@NotNull Context context) {
            try {
                new GTC4WebView(context).destroy();
                return new Pair<>(Boolean.TRUE, null);
            } catch (Exception e) {
                e.printStackTrace();
                ag agVar = ag.a;
                ag.b("The device does not support WebViews, error message: " + e.getMessage());
                return new Pair<>(Boolean.FALSE, e.getMessage());
            }
        }
    }

    public GTCaptcha4Holder(@NotNull Context context) {
        this.a = new b(context);
        try {
            ah ahVar = ah.a;
            File externalFilesDir = context.getApplicationContext().getExternalFilesDir(null);
            ah.a(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        ad.a(context);
    }

    private final void b(String str, GTCaptcha4Config gTCaptcha4Config) {
        this.a.a(str);
        b bVar = this.a;
        bVar.e = gTCaptcha4Config;
        bVar.a();
    }

    public final void a(@NotNull String str, @Nullable GTCaptcha4Config gTCaptcha4Config) {
        b(str, gTCaptcha4Config);
    }

    public static void a() {
        ag.a();
    }
}
