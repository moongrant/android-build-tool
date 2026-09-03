package com.yallatech.support.platform.base.web;

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
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.common.support.apm.Constants;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o00O0O;
import p004OooO0oO.o00Oo0;
import p005OooO0oo.o00oO0o;
import p005OooO0oo.o0OOO0o;
import p005OooO0oo.o0ooOOo;
import p005OooO0oo.oo000o;
import p039OoooOoo.o0o0Oo;
import p608o0oo0OO0.o000O0o;
import p608o0oo0OO0.o000Oo0;
import p609o0oo0OOO.h5;
import p609o0oo0OOO.j5;
import p610o0oo0OOo.l5;
import p610o0oo0OOo.m5;
import p610o0oo0OOo.n5;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 t2\u00020\u00012\u00020\u0002:\u0003uvwB\u0011\b\u0016\u0012\u0006\u0010l\u001a\u00020k¢\u0006\u0004\bm\u0010nB\u0019\b\u0016\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010p\u001a\u00020o¢\u0006\u0004\bm\u0010qB!\b\u0016\u0012\u0006\u0010l\u001a\u00020k\u0012\u0006\u0010p\u001a\u00020o\u0012\u0006\u0010r\u001a\u00020\u001f¢\u0006\u0004\bm\u0010sJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\u00020\u00032\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u00032\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0015\u0010\u0013J&\u0010\u0017\u001a\u00020\u00032\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0017\u0010\u0013J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J-\u0010*\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0003¢\u0006\u0004\b,\u0010\u0005J\u0017\u0010-\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u0010\u0005J\u000f\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u0010\u0005J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0004\u0018\u00010\u00062\u0006\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u0010\u0005J\u000f\u00109\u001a\u000208H\u0003¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0003H\u0002¢\u0006\u0004\b;\u0010\u0005J\u000f\u0010<\u001a\u00020\u0003H\u0002¢\u0006\u0004\b<\u0010\u0005J!\u0010?\u001a\u00020\u00032\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0&\"\u00020=¢\u0006\u0004\b?\u0010@R)\u0010A\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR)\u0010C\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR$\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020D8\u0006@BX\u0086.¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R)\u0010]\u001a\u0015\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0002\b\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010BR\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020=0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0&\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR$\u0010e\u001a\u0004\u0018\u00010b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010j¨\u0006x"}, d2 = {"Lcom/yallatech/support/platform/base/web/WebBrowser;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View$OnClickListener;", "", "onFinishInflate", "()V", "", "url", "loadUrl", "(Ljava/lang/String;)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "setTitle", "Lkotlin/Function0;", NativeProtocol.WEB_DIALOG_ACTION, "setOnCloseClickAction", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setOnInitErrorAction", "(Lkotlin/jvm/functions/Function1;)V", "onError", "setErrorHandler", "onJumpOutside", "setJumpOutsideHandler", "", "onBackPressed", "()Z", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)Z", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "initWebView", "canDownloadFile", "(Ljava/lang/String;)Z", "canOpenIntent", "injectJsOnPageStart", "injectJsOnPageFinished", "createJsForInject", "()Ljava/lang/String;", "jsFileName", "readJsFromAssets", "(Ljava/lang/String;)Ljava/lang/String;", "openAlbum", "Ljava/io/File;", "createImageFile", "()Ljava/io/File;", "openCamera", "showMediaDlg", "LOooO0oO/o00Oo0;", "js", "addJavaBridge", "([Lcom/yallatech/support/platform/base/web/IJsBridge;)V", "errorHandler", "Lkotlin/jvm/functions/Function1;", "jumpOutsideHandler", "Lcom/yallatech/support/platform/base/web/BaseWebView;", "<set-?>", "webView", "Lcom/yallatech/support/platform/base/web/BaseWebView;", "getWebView", "()Lcom/yallatech/support/platform/base/web/BaseWebView;", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "Landroid/widget/ImageButton;", "ivCancel", "Landroid/widget/ImageButton;", "LOooO0oO/o00O0O;", "jsInterface", "LOooO0oO/o00O0O;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "loadError", "Z", "onCloseAction", "Lkotlin/jvm/functions/Function0;", "onInitErrorAction", "", "jsBridges", "Ljava/util/List;", "Landroid/webkit/ValueCallback;", "Landroid/net/Uri;", "uploadMessageAboveL", "Landroid/webkit/ValueCallback;", "currentPhotoUri", "Landroid/net/Uri;", "getCurrentPhotoUri", "()Landroid/net/Uri;", "setCurrentPhotoUri", "(Landroid/net/Uri;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "OooO00o", "OooO0O0", "OooO0OO", "lib_release"}, k = 1, mv = {1, 5, 1})
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
    private final List<o00Oo0> jsBridges;
    private o00O0O jsInterface;

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

    public static final class OooO extends Lambda implements Function2<Integer, o000Oo0, Unit> {
        public OooO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, o000Oo0 o000oo1) {
            num.intValue();
            o000Oo0 i = o000oo1;
            Intrinsics.checkNotNullParameter(i, "i");
            Object obj = i.f57414OooO0O0;
            boolean zAreEqual = Intrinsics.areEqual(obj, (Object) 1);
            WebBrowser webBrowser = WebBrowser.this;
            if (zAreEqual) {
                webBrowser.openAlbum();
            } else if (Intrinsics.areEqual(obj, (Object) 2)) {
                webBrowser.openCamera();
            }
            return Unit.INSTANCE;
        }
    }

    public final class OooO0O0 extends WebChromeClient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ WebBrowser f32401OooO00o;

        public OooO0O0(WebBrowser this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f32401OooO00o = this$0;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable JsPromptResult jsPromptResult) {
            String message = "WebOAuth: " + ((Object) str) + '}';
            Intrinsics.checkNotNullParameter(message, "message");
            if (h5.f57416OooO0O0) {
                Log.d(h5.f57415OooO00o, message);
            }
            return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@Nullable WebView webView, int i) {
            super.onProgressChanged(webView, i);
            ProgressBar progressBar = this.f32401OooO00o.progressBar;
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
            if (h5.f57416OooO0O0) {
                Log.d(h5.f57415OooO00o, message);
            }
            super.onReceivedTitle(webView, str);
            WebBrowser webBrowser = this.f32401OooO00o;
            if (webBrowser.loadError) {
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
                    TextView textView2 = webBrowser.tvTitle;
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
                    TextView textView3 = webBrowser.tvTitle;
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
            WebBrowser webBrowser = this.f32401OooO00o;
            webBrowser.uploadMessageAboveL = valueCallback;
            webBrowser.showMediaDlg();
            return true;
        }
    }

    public final class OooO0OO extends WebViewClient {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ WebBrowser f32402OooO00o;

        public OooO0OO(WebBrowser this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f32402OooO00o = this$0;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(@NotNull WebView view, @Nullable String str) {
            Intrinsics.checkNotNullParameter(view, "view");
            String message = Intrinsics.stringPlus("WebOAuth: onPageFinished ", str);
            Intrinsics.checkNotNullParameter(message, "message");
            if (h5.f57416OooO0O0) {
                Log.d(h5.f57415OooO00o, message);
            }
            WebBrowser webBrowser = this.f32402OooO00o;
            ProgressBar progressBar = webBrowser.progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                progressBar = null;
            }
            progressBar.setVisibility(8);
            webBrowser.injectJsOnPageStart();
            webBrowser.injectJsOnPageFinished();
            super.onPageFinished(view, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@NotNull WebView view, @Nullable String str, @Nullable Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(view, "view");
            String message = Intrinsics.stringPlus("WebOAuth: onPageStarted ", str);
            Intrinsics.checkNotNullParameter(message, "message");
            if (h5.f57416OooO0O0) {
                Log.d(h5.f57415OooO00o, message);
            }
            WebBrowser webBrowser = this.f32402OooO00o;
            ProgressBar progressBar = webBrowser.progressBar;
            if (progressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                progressBar = null;
            }
            progressBar.setVisibility(0);
            webBrowser.loadError = false;
            super.onPageStarted(view, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            String message = Intrinsics.stringPlus("WebOAuth: onPageFinished ", webResourceError);
            Intrinsics.checkNotNullParameter(message, "message");
            if (h5.f57416OooO0O0) {
                Log.d(h5.f57415OooO00o, message);
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f32402OooO00o.loadError = true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            Uri url;
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                String string = url.toString();
                Intrinsics.checkNotNullExpressionValue(string, "this.toString()");
                WebBrowser webBrowser = this.f32402OooO00o;
                webBrowser.getWebView().getSettings().setJavaScriptEnabled(!StringsKt__StringsJVMKt.startsWith(string, "file://", true));
                if (StringsKt__StringsJVMKt.startsWith$default(string, "intent://", false, 2, null) && webBrowser.canOpenIntent(string)) {
                    Function1 function1 = webBrowser.jumpOutsideHandler;
                    if (function1 != null) {
                        function1.invoke(string);
                    }
                    return true;
                }
                if (StringsKt__StringsJVMKt.startsWith$default(string, "https", false, 2, null) && webView != null) {
                    webView.loadUrl(string);
                }
            }
            String message = Intrinsics.stringPlus("WebOAuth: shouldOverrideUrlLoading ", webResourceRequest == null ? null : webResourceRequest.getUrl());
            Intrinsics.checkNotNullParameter(message, "message");
            if (h5.f57416OooO0O0) {
                Log.d(h5.f57415OooO00o, message);
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
        return StringsKt__StringsJVMKt.startsWith$default(url, "https://files.yalla.chat/download/apk", false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canOpenIntent(String url) {
        return StringsKt__StringsJVMKt.startsWith$default(url, "intent://play.app.goo.gl/?link=https://play.google.com/store/apps/details?id%3Dcom.yallatech.yallachat#Intent;", false, 2, null);
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
        if (jsFromAssets == null || StringsKt.isBlank(jsFromAssets)) {
            Function1<? super String, Unit> function1 = this.onInitErrorAction;
            if (function1 != null) {
                function1.invoke("Web Auth Bridge read error");
            }
            return "";
        }
        if (jsFromAssets2 == null || StringsKt.isBlank(jsFromAssets2)) {
            Function1<? super String, Unit> function2 = this.onInitErrorAction;
            if (function2 != null) {
                function2.invoke("Web Auth func pool read error");
            }
            return "";
        }
        StringBuilder sbOooO00o = o0o0Oo.OooO00o(jsFromAssets2);
        Iterator<T> it = this.jsBridges.iterator();
        while (it.hasNext()) {
            sbOooO00o.append(StringsKt__StringsJVMKt.replace$default(jsFromAssets, "$bridge", ((o00Oo0) it.next()).OooO00o(), false, 4, (Object) null));
        }
        String string = sbOooO00o.toString();
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
        IEnv.INSTANCE.impl().getClass();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        o00O0O o00o0o2 = new o00O0O(getWebView(), context);
        this.jsInterface = o00o0o2;
        OooO0o onError = new OooO0o();
        Intrinsics.checkNotNullParameter(onError, "onError");
        o00o0o2.f156OooO0OO = onError;
        addJavaBridge(new o0OOO0o(getWebView()), new oo000o(this), new OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo.OooO0oO.OooO(getWebView()), new o0ooOOo(getWebView()), new o00oO0o(getWebView()));
        BaseWebView webView = getWebView();
        o00O0O o00o0o3 = this.jsInterface;
        if (o00o0o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsInterface");
            o00o0o3 = null;
        }
        webView.addJavascriptInterface(o00o0o3, Constants.OS);
        getWebView().setDownloadListener(new DownloadListener() { // from class: o0oo0Oo.oO0O00
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                WebBrowser.m4208initWebView$lambda0(this.f57418OooO00o, str, str2, str3, str4, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initWebView$lambda-0, reason: not valid java name */
    public static final void m4208initWebView$lambda0(WebBrowser this$0, String url, String str, String str2, String str3, long j) {
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
                j5.OooO00o(context, new OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo.OooO0OO(context));
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
        if (ContextCompat.OooO00o(appCompatActivity, "android.permission.CAMERA") != 0) {
            AppCompatActivity appCompatActivity3 = this.activity;
            if (appCompatActivity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("activity");
            } else {
                appCompatActivity2 = appCompatActivity3;
            }
            o00000O.OooO0O0.OooO0o0(appCompatActivity2, new String[]{"android.permission.CAMERA"}, 3);
            return;
        }
        try {
            fileCreateImageFile = createImageFile();
        } catch (IOException t) {
            Intrinsics.checkNotNullParameter(t, "t");
            if (h5.f57416OooO0O0) {
                Log.e(h5.f57415OooO00o, "", t);
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
            if (h5.f57416OooO0O0) {
                Log.e(h5.f57415OooO00o, "", t);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMediaDlg() {
        ArrayList arrayList = new ArrayList();
        String string = getResources().getString(n5.base_platform_camera);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.base_platform_camera)");
        o000Oo0 o000oo1 = new o000Oo0(string, 2);
        String string2 = getResources().getString(n5.base_platform_album);
        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.base_platform_album)");
        o000Oo0 o000oo2 = new o000Oo0(string2, 1);
        arrayList.add(o000oo1);
        arrayList.add(o000oo2);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        o000O0o.OooO00o(context, arrayList, new OooO()).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o0oo0Oo.oO0O00O
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                WebBrowser.m4209showMediaDlg$lambda11(this.f57419OooO0Oo, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showMediaDlg$lambda-11, reason: not valid java name */
    public static final void m4209showMediaDlg$lambda11(WebBrowser this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ValueCallback<Uri[]> valueCallback = this$0.uploadMessageAboveL;
        if (valueCallback == null) {
            return;
        }
        valueCallback.onReceiveValue(null);
    }

    public final void addJavaBridge(@NotNull o00Oo0... js) {
        Intrinsics.checkNotNullParameter(js, "js");
        CollectionsKt__MutableCollectionsKt.addAll(this.jsBridges, js);
        o00O0O o00o0o2 = this.jsInterface;
        if (o00o0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("jsInterface");
            o00o0o2 = null;
        }
        o00Oo0[] bridges = (o00Oo0[]) Arrays.copyOf(js, js.length);
        o00o0o2.getClass();
        Intrinsics.checkNotNullParameter(bridges, "bridges");
        for (o00Oo0 o00oo1 : bridges) {
            o00o0o2.f155OooO0O0.put(o00oo1.OooO00o(), o00oo1);
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
        View viewInflate = LayoutInflater.from(getContext()).inflate(m5.base_platform_layout_browser, this);
        View viewFindViewById = viewInflate.findViewById(l5.webView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.webView)");
        this.webView = (BaseWebView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(l5.tvWebTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.tvWebTitle)");
        this.tvTitle = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(l5.progressBar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.progressBar)");
        this.progressBar = (ProgressBar) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(l5.ivWebClose);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.ivWebClose)");
        ImageButton imageButton = (ImageButton) viewFindViewById4;
        this.ivCancel = imageButton;
        if (imageButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivCancel");
            imageButton = null;
        }
        imageButton.setOnClickListener(this);
        Context context = getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        }
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
