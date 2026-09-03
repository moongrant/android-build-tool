package com.yallatech.support.platform.base.web;

import OooO00o.OooO00o;
import OooO0o.OooOO0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.d;
import com.yallatech.support.platform.base.IEnv;
import com.yallatech.support.platform.base.web.WebBrowser;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p005OooO0oO.o0O0O00;
import p005OooO0oO.o0OO00O;
import p005OooO0oO.o0Oo0oo;
import p005OooO0oO.oo0o0Oo;
import p070o0000ooO.o00Oo0;
import p624o0oo0oOo.oO0O00oO;
import p624o0oo0oOo.oO0O0O00;
import p625o0oo0oo.o000O;
import p625o0oo0oo.o000OO0O;
import p627o0oo0ooO.oO0O0O0o;
import p627o0oo0ooO.oO0O0Oo0;
import p627o0oo0ooO.oOo0oooO;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0003rstB\u0011\b\u0016\u0012\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kB\u0019\b\u0016\u0012\u0006\u0010i\u001a\u00020h\u0012\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bj\u0010nB!\b\u0016\u0012\u0006\u0010i\u001a\u00020h\u0012\u0006\u0010m\u001a\u00020l\u0012\u0006\u0010o\u001a\u000200¢\u0006\u0004\bj\u0010pJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0019\u0010\u0005J\u0015\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001bJ\u001b\u0010 \u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001e¢\u0006\u0004\b \u0010!J&\u0010$\u001a\u00020\u00032\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0002\b#¢\u0006\u0004\b$\u0010%J&\u0010'\u001a\u00020\u00032\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0002\b#¢\u0006\u0004\b'\u0010%J&\u0010)\u001a\u00020\u00032\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\"¢\u0006\u0002\b#¢\u0006\u0004\b)\u0010%J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J'\u00105\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J-\u0010;\u001a\u00020\u00032\u0006\u00101\u001a\u0002002\u000e\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0006072\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u00020\u00032\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020=07\"\u00020=¢\u0006\u0004\b?\u0010@R)\u0010A\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"¢\u0006\u0002\b#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR)\u0010C\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"¢\u0006\u0002\b#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR$\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020D8\u0006@BX\u0086.¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR)\u0010Z\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"¢\u0006\u0002\b#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010BR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020=0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R$\u0010`\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020_07\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR$\u0010b\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g¨\u0006u"}, d2 = {"Lcom/yallatech/support/platform/base/web/WebBrowser;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "", "initWebView", "()V", "", "url", "", "canDownloadFile", "(Ljava/lang/String;)Z", "canOpenIntent", "injectJsOnPageStart", "injectJsOnPageFinished", "createJsForInject", "()Ljava/lang/String;", "jsFileName", "readJsFromAssets", "(Ljava/lang/String;)Ljava/lang/String;", "openAlbum", "Ljava/io/File;", "createImageFile", "()Ljava/io/File;", "openCamera", "showMediaDlg", "onFinishInflate", "loadUrl", "(Ljava/lang/String;)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "setTitle", "Lkotlin/Function0;", NativeProtocol.WEB_DIALOG_ACTION, "setOnCloseClickAction", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setOnInitErrorAction", "(Lkotlin/jvm/functions/Function1;)V", "onError", "setErrorHandler", "onJumpOutside", "setJumpOutsideHandler", "onBackPressed", "()Z", "Landroid/view/View;", ak.aE, "onClick", "(Landroid/view/View;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)Z", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "LOooO0o/OooOO0;", "js", "addJavaBridge", "([Lcom/yallatech/support/platform/base/web/IJsBridge;)V", "errorHandler", "Lkotlin/jvm/functions/Function1;", "jumpOutsideHandler", "Lcom/yallatech/support/platform/base/web/BaseWebView;", "<set-?>", "webView", "Lcom/yallatech/support/platform/base/web/BaseWebView;", "getWebView", "()Lcom/yallatech/support/platform/base/web/BaseWebView;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "Landroid/widget/ImageButton;", "ivCancel", "Landroid/widget/ImageButton;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "loadError", "Z", "onCloseAction", "Lkotlin/jvm/functions/Function0;", "onInitErrorAction", "", "jsBridges", "Ljava/util/List;", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "uploadMessageAboveL", "Landroid/webkit/ValueCallback;", "currentPhotoUri", "Landroid/net/Uri;", "getCurrentPhotoUri", "()Landroid/net/Uri;", "setCurrentPhotoUri", "(Landroid/net/Uri;)V", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OooO00o", "OooO0O0", "OooO0OO", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WebBrowser extends ConstraintLayout implements View.OnClickListener {
    private static final int REQUEST_CODE_ALBUM = 1;
    private static final int REQUEST_CODE_CAMERA = 2;
    private static final int REQUEST_CODE_CAMERA_PERMISSION = 3;
    private AppCompatActivity activity;

    @Nullable
    private Uri currentPhotoUri;

    @Nullable
    private Function1<? super String, Unit> errorHandler;
    private ImageButton ivCancel;

    @NotNull
    private final List<OooOO0> jsBridges;
    private OooO0o.OooO jsInterface;

    @Nullable
    private Function1<? super String, Unit> jumpOutsideHandler;
    private boolean loadError;

    @Nullable
    private Function0<Unit> onCloseAction;

    @Nullable
    private Function1<? super String, Unit> onInitErrorAction;
    private ProgressBar progressBar;
    private TextView tvTitle;

    @Nullable
    private ValueCallback<Uri[]> uploadMessageAboveL;
    private BaseWebView webView;

    public static final class OooO extends Lambda implements Function2<Integer, oO0O0O00, Unit> {
        public OooO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, oO0O0O00 oo0o0o00) {
            num.intValue();
            oO0O0O00 i = oo0o0o00;
            Intrinsics.checkNotNullParameter(i, "i");
            Object obj = i.f48667OooO0O0;
            if (Intrinsics.areEqual(obj, (Object) 1)) {
                WebBrowser.this.openAlbum();
            } else if (Intrinsics.areEqual(obj, (Object) 2)) {
                WebBrowser.this.openCamera();
            }
            return Unit.INSTANCE;
        }
    }

    public final class OooO0O0 extends WebChromeClient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ WebBrowser f26321OooO00o;

        public OooO0O0(WebBrowser this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f26321OooO00o = this$0;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable JsPromptResult jsPromptResult) {
            String message = "WebOAuth: " + ((Object) str) + '}';
            Intrinsics.checkNotNullParameter(message, "message");
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, message);
            }
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@Nullable WebView webView, int i) {
            super.onProgressChanged(webView, i);
            ProgressBar progressBar = this.f26321OooO00o.progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                progressBar = null;
            }
            progressBar.setProgress(i);
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
            String message = Intrinsics.stringPlus("WebOAuth: onReceivedTitle ", str);
            Intrinsics.checkNotNullParameter(message, "message");
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, message);
            }
            super.onReceivedTitle(webView, str);
            if (this.f26321OooO00o.loadError) {
                return;
            }
            boolean z = false;
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                }
            }
            if (z) {
                TextView textView = null;
                try {
                    Uri uri = Uri.parse(str);
                    TextView textView2 = this.f26321OooO00o.tvTitle;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                        textView2 = null;
                    }
                    String host = uri.getHost();
                    if (host == null) {
                        host = str;
                    }
                    textView2.setText(host);
                } catch (Throwable unused) {
                    TextView textView3 = this.f26321OooO00o.tvTitle;
                    if (textView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
                    } else {
                        textView = textView3;
                    }
                    textView.setText(str);
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> valueCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
            this.f26321OooO00o.uploadMessageAboveL = valueCallback;
            this.f26321OooO00o.showMediaDlg();
            return true;
        }
    }

    public final class OooO0OO extends WebViewClient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ WebBrowser f26322OooO00o;

        public OooO0OO(WebBrowser this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f26322OooO00o = this$0;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@NotNull WebView view, @Nullable String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            String message = Intrinsics.stringPlus("WebOAuth: onPageFinished ", str);
            Intrinsics.checkNotNullParameter(message, "message");
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, message);
            }
            ProgressBar progressBar = this.f26322OooO00o.progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                progressBar = null;
            }
            progressBar.setVisibility(8);
            this.f26322OooO00o.injectJsOnPageStart();
            this.f26322OooO00o.injectJsOnPageFinished();
            super.onPageFinished(view, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@NotNull WebView view, @Nullable String str, @Nullable Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(view, "view");
            String message = Intrinsics.stringPlus("WebOAuth: onPageStarted ", str);
            Intrinsics.checkNotNullParameter(message, "message");
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, message);
            }
            ProgressBar progressBar = this.f26322OooO00o.progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                progressBar = null;
            }
            progressBar.setVisibility(0);
            this.f26322OooO00o.loadError = false;
            super.onPageStarted(view, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            String message = Intrinsics.stringPlus("WebOAuth: onPageFinished ", webResourceError);
            Intrinsics.checkNotNullParameter(message, "message");
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, message);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f26322OooO00o.loadError = true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            Uri url;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                WebBrowser webBrowser = this.f26322OooO00o;
                String string = url.toString();
                Intrinsics.checkNotNullExpressionValue(string, "this.toString()");
                webBrowser.getWebView().getSettings().setJavaScriptEnabled(!StringsKt__StringsJVMKt.startsWith(string, "file://", true));
                if (StringsKt.OooOoOO(string, "intent://") && webBrowser.canOpenIntent(string)) {
                    Function1 function1 = webBrowser.jumpOutsideHandler;
                    if (function1 != null) {
                        function1.invoke(string);
                    }
                    return true;
                }
                if (StringsKt.OooOoOO(string, "https") && webView != null) {
                    webView.loadUrl(string);
                }
            }
            String message = Intrinsics.stringPlus("WebOAuth: shouldOverrideUrlLoading ", webResourceRequest == null ? null : webResourceRequest.getUrl());
            Intrinsics.checkNotNullParameter(message, "message");
            if (o000OO0O.f48670OooO0O0) {
                Log.d(o000OO0O.f48669OooO00o, message);
            }
            return true;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String addErrorHandler = str;
            Intrinsics.checkNotNullParameter(addErrorHandler, "$this$addErrorHandler");
            Function1 function1 = WebBrowser.this.errorHandler;
            if (function1 != null) {
                function1.invoke(addErrorHandler);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebBrowser(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.jsBridges = new ArrayList();
    }

    private final boolean canDownloadFile(String url) {
        return StringsKt.OooOoOO(url, "https://files.yalla.chat/download/apk");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canOpenIntent(String url) {
        return StringsKt.OooOoOO(url, "intent://play.app.goo.gl/?link=https://play.google.com/store/apps/details?id%3Dcom.yallatech.yallachat#Intent;");
    }

    @SuppressLint({"SimpleDateFormat"})
    private final File createImageFile() throws IOException {
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "SimpleDateFormat(\"yyyyMMdd_HHmmss\").format(Date())");
        AppCompatActivity appCompatActivity = this.activity;
        if (appCompatActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            appCompatActivity = null;
        }
        File fileCreateTempFile = File.createTempFile("JPEG_" + str + '_', ".jpg", appCompatActivity.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
        fileCreateTempFile.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(\n      \"J…\n      absolutePath\n    }");
        return fileCreateTempFile;
    }

    private final String createJsForInject() {
        String jsFromAssets = readJsFromAssets("Bridge.js");
        String jsFromAssets2 = readJsFromAssets("FuncPool.js");
        boolean z = true;
        if (jsFromAssets == null || StringsKt.isBlank(jsFromAssets)) {
            Function1<? super String, Unit> function1 = this.onInitErrorAction;
            if (function1 != null) {
                function1.invoke("Web Auth Bridge read error");
            }
            return "";
        }
        if (jsFromAssets2 != null && !StringsKt.isBlank(jsFromAssets2)) {
            z = false;
        }
        if (z) {
            Function1<? super String, Unit> function2 = this.onInitErrorAction;
            if (function2 != null) {
                function2.invoke("Web Auth func pool read error");
            }
            return "";
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(jsFromAssets2);
        Iterator<T> it = this.jsBridges.iterator();
        while (it.hasNext()) {
            sbOooO0o0.append(StringsKt.OooOo00(jsFromAssets, "$bridge", ((OooOO0) it.next()).OooO00o()));
        }
        String string = sbOooO0o0.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void initWebView() {
        getWebView().setVerticalScrollBarEnabled(false);
        getWebView().setHorizontalScrollBarEnabled(false);
        getWebView().setWebViewClient(new OooO0OO(this));
        getWebView().setWebChromeClient(new OooO0O0(this));
        WebSettings settings = getWebView().getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(2);
        Objects.requireNonNull(IEnv.INSTANCE.impl());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        OooO0o.OooO oooO = new OooO0o.OooO(context, getWebView());
        this.jsInterface = oooO;
        OooO0o onError = new OooO0o();
        Intrinsics.checkNotNullParameter(onError, "onError");
        oooO.f127OooO0OO = onError;
        addJavaBridge(new o0O0O00(getWebView()), new o0Oo0oo(this), new OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo.OooO0oO.OooO(getWebView()), new oo0o0Oo(getWebView()), new o0OO00O(getWebView()));
        BaseWebView webView = getWebView();
        OooO0o.OooO oooO2 = this.jsInterface;
        if (oooO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsInterface");
            oooO2 = null;
        }
        webView.addJavascriptInterface(oooO2, "Android");
        getWebView().setDownloadListener(new DownloadListener() { // from class: o0oo0ooo.ooOOO0Oo
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebBrowser.m495initWebView$lambda0(this.f48678OooO00o, str, str2, str3, str4, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initWebView$lambda-0, reason: not valid java name */
    public static final void m495initWebView$lambda0(WebBrowser this$0, String url, String str, String str2, String str3, long j) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(url, "url");
        if (this$0.canDownloadFile(url)) {
            Context context = this$0.getWebView().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "webView.context");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(url));
                intent.addCategory("android.intent.category.BROWSABLE");
                context.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                o000O.OooO00o(context, new OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo.OooO0OO(context));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectJsOnPageFinished() {
        getWebView().evaluateJavascript("window.AndroidBridgeDone();", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void injectJsOnPageStart() {
        String strCreateJsForInject = createJsForInject();
        BaseWebView webView = getWebView();
        String str = String.format(strCreateJsForInject, Arrays.copyOf(new Object[0], 0));
        Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(this, *args)");
        webView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAlbum() {
        Context context = getContext();
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).startActivityForResult(Intent.createChooser(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), "Image Chooser"), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCamera() {
        File fileCreateImageFile;
        AppCompatActivity appCompatActivity = this.activity;
        AppCompatActivity appCompatActivity2 = null;
        if (appCompatActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            appCompatActivity = null;
        }
        if (o000O000.OooO00o.OooO00o(appCompatActivity, "android.permission.CAMERA") != 0) {
            AppCompatActivity appCompatActivity3 = this.activity;
            if (appCompatActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
            } else {
                appCompatActivity2 = appCompatActivity3;
            }
            o00Oo0.OooO0Oo(appCompatActivity2, new String[]{"android.permission.CAMERA"}, 3);
            return;
        }
        try {
            fileCreateImageFile = createImageFile();
        } catch (IOException t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (o000OO0O.f48670OooO0O0) {
                Log.e(o000OO0O.f48669OooO00o, "", t);
            }
            fileCreateImageFile = null;
        }
        if (fileCreateImageFile == null) {
            return;
        }
        AppCompatActivity appCompatActivity4 = this.activity;
        if (appCompatActivity4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
            appCompatActivity4 = null;
        }
        setCurrentPhotoUri(FileProvider.getUriForFile(appCompatActivity4, Intrinsics.stringPlus("com.yallatech.support.platform.fileprovider", getContext().getApplicationInfo().packageName), fileCreateImageFile));
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", getCurrentPhotoUri());
        AppCompatActivity appCompatActivity5 = this.activity;
        if (appCompatActivity5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activity");
        } else {
            appCompatActivity2 = appCompatActivity5;
        }
        appCompatActivity2.startActivityForResult(intent, 2);
    }

    private final String readJsFromAssets(String jsFileName) {
        try {
            InputStream inputStreamOpen = getContext().getAssets().open(jsFileName);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(jsFileName)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            StringBuilder sb = new StringBuilder();
            String line = "";
            while (line != null) {
                line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        } catch (Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (o000OO0O.f48670OooO0O0) {
                Log.e(o000OO0O.f48669OooO00o, "", t);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMediaDlg() {
        ArrayList arrayList = new ArrayList();
        String string = getResources().getString(oO0O0Oo0.base_platform_camera);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.base_platform_camera)");
        oO0O0O00 oo0o0o00 = new oO0O0O00(string, 2);
        String string2 = getResources().getString(oO0O0Oo0.base_platform_album);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.base_platform_album)");
        oO0O0O00 oo0o0o01 = new oO0O0O00(string2, 1);
        arrayList.add(oo0o0o00);
        arrayList.add(oo0o0o01);
        oO0O00oO oo0o00oo = oO0O00oO.f48663OooO00o;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        oo0o00oo.OooO00o(context, arrayList, new OooO()).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o0oo0ooo.oOo0o0oO
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                WebBrowser.m496showMediaDlg$lambda11(this.f48677Oooo0o, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showMediaDlg$lambda-11, reason: not valid java name */
    public static final void m496showMediaDlg$lambda11(WebBrowser this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ValueCallback<Uri[]> valueCallback = this$0.uploadMessageAboveL;
        if (valueCallback == null) {
            return;
        }
        valueCallback.onReceiveValue(null);
    }

    public final void addJavaBridge(@NotNull OooOO0... js) {
        Intrinsics.checkNotNullParameter(js, "js");
        CollectionsKt.addAll(this.jsBridges, js);
        OooO0o.OooO oooO = this.jsInterface;
        if (oooO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsInterface");
            oooO = null;
        }
        OooOO0[] bridges = (OooOO0[]) Arrays.copyOf(js, js.length);
        Objects.requireNonNull(oooO);
        Intrinsics.checkNotNullParameter(bridges, "bridges");
        for (OooOO0 oooOO1 : bridges) {
            oooO.f126OooO0O0.put(oooOO1.OooO00o(), oooOO1);
        }
    }

    @Nullable
    public final Uri getCurrentPhotoUri() {
        return this.currentPhotoUri;
    }

    @NotNull
    public final BaseWebView getWebView() {
        BaseWebView baseWebView = this.webView;
        if (baseWebView != null) {
            return baseWebView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        return null;
    }

    public final void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        getWebView().loadUrl(url);
    }

    public final boolean onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Unit unit;
        ValueCallback<Uri[]> valueCallback;
        ValueCallback<Uri[]> valueCallback2;
        Unit unit2;
        ValueCallback<Uri[]> valueCallback3;
        ValueCallback<Uri[]> valueCallback4;
        if (requestCode == 1) {
            if (resultCode == -1) {
                Uri data2 = data == null ? null : data.getData();
                if (data2 == null || (valueCallback2 = this.uploadMessageAboveL) == null) {
                    unit = null;
                } else {
                    valueCallback2.onReceiveValue(new Uri[]{data2});
                    unit = Unit.INSTANCE;
                }
                if (unit == null && (valueCallback = this.uploadMessageAboveL) != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                ValueCallback<Uri[]> valueCallback5 = this.uploadMessageAboveL;
                if (valueCallback5 != null) {
                    valueCallback5.onReceiveValue(null);
                }
            }
            return true;
        }
        if (requestCode == 2) {
            if (resultCode == -1) {
                Uri uri = this.currentPhotoUri;
                if (uri == null || (valueCallback4 = this.uploadMessageAboveL) == null) {
                    unit2 = null;
                } else {
                    valueCallback4.onReceiveValue(new Uri[]{uri});
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null && (valueCallback3 = this.uploadMessageAboveL) != null) {
                    valueCallback3.onReceiveValue(null);
                }
            } else {
                ValueCallback<Uri[]> valueCallback6 = this.uploadMessageAboveL;
                if (valueCallback6 != null) {
                    valueCallback6.onReceiveValue(null);
                }
            }
        }
        return false;
    }

    public final boolean onBackPressed() {
        if (!getWebView().canGoBack()) {
            return false;
        }
        getWebView().goBack();
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(v, "v");
        ImageButton imageButton = this.ivCancel;
        if (imageButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivCancel");
            imageButton = null;
        }
        if (!Intrinsics.areEqual(v, imageButton) || (function0 = this.onCloseAction) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(oOo0oooO.base_platform_layout_browser, this);
        View viewFindViewById = viewInflate.findViewById(oO0O0O0o.webView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.webView)");
        this.webView = (BaseWebView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(oO0O0O0o.tvWebTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tvWebTitle)");
        this.tvTitle = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(oO0O0O0o.progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.progressBar)");
        this.progressBar = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(oO0O0O0o.ivWebClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.ivWebClose)");
        ImageButton imageButton = (ImageButton) viewFindViewById4;
        this.ivCancel = imageButton;
        if (imageButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivCancel");
            imageButton = null;
        }
        imageButton.setOnClickListener(this);
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        this.activity = (AppCompatActivity) context;
        initWebView();
    }

    public final void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode == 3) {
            int length = grantResults.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                } else {
                    if (!(grantResults[i] == 0)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z) {
                openCamera();
                return;
            }
            ValueCallback<Uri[]> valueCallback = this.uploadMessageAboveL;
            if (valueCallback == null) {
                return;
            }
            valueCallback.onReceiveValue(null);
        }
    }

    public final void setCurrentPhotoUri(@Nullable Uri uri) {
        this.currentPhotoUri = uri;
    }

    public final void setErrorHandler(@NotNull Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.errorHandler = onError;
    }

    public final void setJumpOutsideHandler(@NotNull Function1<? super String, Unit> onJumpOutside) {
        Intrinsics.checkNotNullParameter(onJumpOutside, "onJumpOutside");
        this.jumpOutsideHandler = onJumpOutside;
    }

    public final void setOnCloseClickAction(@NotNull Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.onCloseAction = action;
    }

    public final void setOnInitErrorAction(@NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.onInitErrorAction = action;
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        TextView textView = this.tvTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvTitle");
            textView = null;
        }
        textView.setText(title);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebBrowser(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.jsBridges = new ArrayList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebBrowser(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.jsBridges = new ArrayList();
    }
}
