package com.yalla.yalla.common.ui.view;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.util.AttributeSet;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.common.Constants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p143o00OOooo.o00O0OO;
import p143o00OOooo.o00OO000;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p255o00ooO0o.oo0oOO0;
import p498o0o00Oo0.OooOOO;
import p508o0o00oOo.o0000O0O;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0004*+,-B\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b \u0010$B#\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b \u0010'B+\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b \u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lcom/yalla/yalla/common/ui/view/BaseWebView;", "Landroid/webkit/WebView;", "Lcom/yalla/yalla/common/ui/view/BaseWebView$OooO0o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setLoadStateListener", "", "Oooo0oO", "J", "getTimeOut", "()J", "setTimeOut", "(J)V", "timeOut", "Lcom/yalla/yalla/common/ui/view/BaseWebView$LoadState;", "OoooO00", "Lcom/yalla/yalla/common/ui/view/BaseWebView$LoadState;", "getLoadState", "()Lcom/yalla/yalla/common/ui/view/BaseWebView$LoadState;", "setLoadState", "(Lcom/yalla/yalla/common/ui/view/BaseWebView$LoadState;)V", "loadState", "Lcom/yalla/yalla/common/ui/view/BaseWebView$OooO;", "OoooO0", "Lcom/yalla/yalla/common/ui/view/BaseWebView$OooO;", "getWebClientBridge", "()Lcom/yalla/yalla/common/ui/view/BaseWebView$OooO;", "setWebClientBridge", "(Lcom/yalla/yalla/common/ui/view/BaseWebView$OooO;)V", "webClientBridge", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "OooO0OO", "LoadState", "OooO0o", "OooO", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BaseWebView extends WebView {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f20915OoooO0O = new OooO0OO();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooO0o f20916Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f20917Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public long timeOut;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Job f20919Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public OooO webClientBridge;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LoadState loadState;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/common/ui/view/BaseWebView$LoadState;", "", "Default", "Loading", "Success", "Error", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum LoadState {
        Default,
        Loading,
        Success,
        Error
    }

    @StabilityInferred(parameters = 0)
    public static class OooO {
        public void OooO00o(@Nullable String str) {
            throw null;
        }

        /* JADX WARN: Incorrect return type in method signature: (Landroid/webkit/WebView;Landroid/webkit/ValueCallback<[Landroid/net/Uri;>;Landroid/webkit/WebChromeClient$FileChooserParams;)Z */
        public void OooO0O0(@Nullable ValueCallback valueCallback) {
            throw null;
        }

        public void OooO0OO(@Nullable WebView webView) {
            throw null;
        }
    }

    public static final class OooO00o extends WebChromeClient {

        /* JADX INFO: renamed from: com.yalla.yalla.common.ui.view.BaseWebView$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0219OooO00o extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ JsResult f20923Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0219OooO00o(JsResult jsResult) {
                super(0);
                this.f20923Oooo0o = jsResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                JsResult jsResult = this.f20923Oooo0o;
                if (jsResult == null) {
                    return null;
                }
                jsResult.confirm();
                return Unit.INSTANCE;
            }
        }

        public OooO00o() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable JsResult jsResult) {
            Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
            if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                contextOooO0O0 = null;
            }
            FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
            if (fragmentActivity == null) {
                return false;
            }
            oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
            if (str2 == null) {
                str2 = "";
            }
            oo0ooo0.OooOo0O(str2);
            oo0ooo0.OooOo0o(new C0219OooO00o(jsResult));
            oo0ooo0.OooO0oO(false);
            oo0ooo0.OooOOO0();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@Nullable WebView webView, int i) {
            super.onProgressChanged(webView, i);
            OooO0o oooO0o = BaseWebView.this.f20916Oooo;
            if (oooO0o != null) {
                oooO0o.OooO00o(i);
            }
            if (i < 100) {
                BaseWebView.this.setLoadState(LoadState.Loading);
            }
            if (i == 100) {
                BaseWebView baseWebView = BaseWebView.this;
                if (baseWebView.f20917Oooo0o) {
                    return;
                }
                Job job = baseWebView.f20919Oooo0oo;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                o00O00.OooO0O0("setLoadStateListener newProgress = " + i);
                BaseWebView.this.setLoadState(LoadState.Success);
                OooO0o oooO0o2 = BaseWebView.this.f20916Oooo;
                if (oooO0o2 != null) {
                    oooO0o2.OooO0O0(true);
                }
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
            OooO webClientBridge = BaseWebView.this.getWebClientBridge();
            if (webClientBridge != null) {
                webClientBridge.OooO00o(str);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> valueCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
            OooO webClientBridge = BaseWebView.this.getWebClientBridge();
            if (webClientBridge == null) {
                return false;
            }
            webClientBridge.OooO0O0(valueCallback);
            return true;
        }
    }

    public static final class OooO0O0 extends WebViewClient {

        @DebugMetadata(c = "com.yalla.yalla.common.ui.view.BaseWebView$2$onPageStarted$1", f = "BaseWebView.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f20925Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ BaseWebView f20926Oooo0oO;

            /* JADX INFO: renamed from: com.yalla.yalla.common.ui.view.BaseWebView$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.common.ui.view.BaseWebView$2$onPageStarted$1$1", f = "BaseWebView.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0220OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public int f20927Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public final /* synthetic */ BaseWebView f20928Oooo0oO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0220OooO00o(BaseWebView baseWebView, Continuation<? super C0220OooO00o> continuation) {
                    super(2, continuation);
                    this.f20928Oooo0oO = baseWebView;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0220OooO00o(this.f20928Oooo0oO, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0220OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f20927Oooo0o;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        long timeOut = this.f20928Oooo0oO.getTimeOut();
                        this.f20927Oooo0o = 1;
                        if (DelayKt.delay(timeOut, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(BaseWebView baseWebView, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f20926Oooo0oO = baseWebView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f20926Oooo0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f20925Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                    C0220OooO00o c0220OooO00o = new C0220OooO00o(this.f20926Oooo0oO, null);
                    this.f20925Oooo0o = 1;
                    if (BuildersKt.withContext(coroutineDispatcher, c0220OooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                o00O00.OooO0O0("setLoadStateListener timeOut");
                this.f20926Oooo0oO.setLoadState(LoadState.Error);
                OooO0o oooO0o = this.f20926Oooo0oO.f20916Oooo;
                if (oooO0o != null) {
                    oooO0o.OooO0O0(false);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.common.ui.view.BaseWebView$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0221OooO0O0 extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f20929Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0221OooO0O0(SslErrorHandler sslErrorHandler) {
                super(0);
                this.f20929Oooo0o = sslErrorHandler;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                SslErrorHandler sslErrorHandler = this.f20929Oooo0o;
                if (sslErrorHandler == null) {
                    return null;
                }
                sslErrorHandler.proceed();
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f20930Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(SslErrorHandler sslErrorHandler) {
                super(0);
                this.f20930Oooo0o = sslErrorHandler;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                SslErrorHandler sslErrorHandler = this.f20930Oooo0o;
                if (sslErrorHandler == null) {
                    return null;
                }
                sslErrorHandler.cancel();
                return Unit.INSTANCE;
            }
        }

        public OooO0O0() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            BaseWebView baseWebView = BaseWebView.this;
            baseWebView.f20917Oooo0o = false;
            Job job = baseWebView.f20919Oooo0oo;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            BaseWebView.this.f20919Oooo0oo = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(BaseWebView.this, null), 3, null);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView view, int i, @NotNull String description, @NotNull String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i, description, failingUrl);
            o00O00.OooO0O0("setLoadStateListener onReceivedError");
            BaseWebView.this.setLoadState(LoadState.Error);
            OooO0o oooO0o = BaseWebView.this.f20916Oooo;
            if (oooO0o != null) {
                oooO0o.OooO0O0(false);
            }
            BaseWebView baseWebView = BaseWebView.this;
            baseWebView.f20917Oooo0o = true;
            Job job = baseWebView.f20919Oooo0oo;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
            String strOooO0OO;
            Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
            if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                contextOooO0O0 = null;
            }
            FragmentActivity fragmentActivity = contextOooO0O0 instanceof FragmentActivity ? (FragmentActivity) contextOooO0O0 : null;
            if (fragmentActivity != null) {
                oo0oOO0 oo0ooo0 = new oo0oOO0(fragmentActivity);
                oo0ooo0.OooOoo(R.string.SSL_Error);
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkNotNull(sslError);
                int primaryError = sslError.getPrimaryError();
                if (primaryError != 1) {
                    strOooO0OO = primaryError != 3 ? "" : o000O0O0.OooO0OO(R.string.SSL_Untrusted);
                } else {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.SSL_Expired);
                }
                sb.append(strOooO0OO);
                sb.append('\n');
                sb.append(o000O0O0.OooO0OO(R.string.SSL_Error_Continue));
                oo0ooo0.OooOo0O(sb.toString());
                oo0ooo0.OooO0oO(false);
                oo0ooo0.OooOo0o(new C0221OooO0O0(sslErrorHandler));
                oo0ooo0.OooOo(new OooO0OO(sslErrorHandler));
                oo0ooo0.OooOOO0();
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0092  */
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            String string;
            boolean z;
            Uri uri;
            Uri url;
            Uri url2;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("WebView shouldOverrideUrlLoading url = ");
            sbOooO0o0.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            o00O00.OooO0O0(sbOooO0o0.toString());
            OooO webClientBridge = BaseWebView.this.getWebClientBridge();
            if (webClientBridge != null) {
                webClientBridge.OooO0OO(webView);
            }
            if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || (string = url2.toString()) == null) {
                string = "";
            }
            if (StringsKt__StringsKt.contains$default(string, "tel:", false, 2, (Object) null)) {
                return true;
            }
            Objects.requireNonNull(BaseWebView.this);
            if (StringsKt.OooOoOO(string, "mailto:")) {
                String strOooOo00 = StringsKt.OooOo00(string, "mailto:", "");
                if (Pattern.compile("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$").matcher(strOooOo00).matches()) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("plain/text");
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{strOooOo00});
                    intent.putExtra("android.intent.extra.SUBJECT", "");
                    intent.putExtra("android.intent.extra.TEXT", "");
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    Activity activityOooO0O0 = o00O000.OooO0O0();
                    if (activityOooO0O0 != null) {
                        activityOooO0O0.startActivity(Intent.createChooser(intent, ""));
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            if (!StringsKt__StringsKt.contains$default(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), "market", false, 2, (Object) null)) {
                if (!StringsKt__StringsKt.contains$default(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), "https://play.google.com/store/apps/details?id=", false, 2, (Object) null)) {
                    if (StringsKt.OooOoOO(string, "whatsapp://")) {
                        try {
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(string));
                            intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                            List<ResolveInfo> listQueryIntentActivities = BaseWebView.this.getContext().getPackageManager().queryIntentActivities(intent2, 0);
                            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
                            if (listQueryIntentActivities.size() > 0) {
                                BaseWebView.this.getContext().startActivity(intent2);
                            }
                            return true;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    WebSettings settings = BaseWebView.this.getSettings();
                    String url3 = BaseWebView.this.getUrl();
                    Intrinsics.checkNotNull(url3);
                    settings.setJavaScriptEnabled(!StringsKt.OooOoOO(url3, "file://"));
                    if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                        BaseWebView baseWebView = BaseWebView.this;
                        String string2 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "it.toString()");
                        baseWebView.loadUrl(string2);
                    }
                    return true;
                }
            }
            if (webResourceRequest != null && (uri = webResourceRequest.getUrl()) != null) {
                Context context = BaseWebView.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(uri, "uri");
                try {
                    Intent intent3 = new Intent("android.intent.action.VIEW", uri);
                    intent3.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    context.startActivity(intent3);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return true;
        }
    }

    public static final class OooO0OO {
        @NotNull
        public final Context OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Context contextCreateConfigurationContext = context.createConfigurationContext(new Configuration());
            Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "context.createConfigurat…nContext(Configuration())");
            return contextCreateConfigurationContext;
        }
    }

    public interface OooO0o {
        void OooO00o(int i);

        void OooO0O0(boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context) {
        super(f20915OoooO0O.OooO00o(context));
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeOut = 15000L;
        setScrollBarStyle(33554432);
        setDrawingCacheEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(2);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setMixedContentMode(0);
        removeJavascriptInterface("searchBoxJavaBridge_");
        getSettings().setAllowFileAccessFromFileURLs(false);
        setWebChromeClient(new OooO00o());
        setWebViewClient(new OooO0O0());
        setDownloadListener(o0000O0O.f41818OooO00o);
        OooO0O0();
        this.loadState = LoadState.Default;
    }

    public static void OooO00o(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        contextOooO0O0.startActivity(intent);
    }

    public final void OooO0O0() {
        ComponentCallbacks2 componentCallbacks2OooO0O0 = o00000O.f34254OooO00o.OooO0O0();
        LifecycleOwner lifecycleOwner = componentCallbacks2OooO0O0 instanceof LifecycleOwner ? (LifecycleOwner) componentCallbacks2OooO0O0 : null;
        if (lifecycleOwner != null) {
            OooOOO.f41216OooO00o.OooO0OO().observe(lifecycleOwner, new o00O0OO(this, 2));
            LiveEventBus.get("H5RefreshAssociationYallaChat", String.class).observe(lifecycleOwner, new o00OO000(this, 1));
        }
    }

    public final void OooO0OO() {
        setWebChromeClient(null);
        removeJavascriptInterface("Yalla");
        loadDataWithBaseURL(null, "", "text/html", Constants.UTF_8, null);
        clearHistory();
        destroy();
    }

    @NotNull
    public final LoadState getLoadState() {
        return this.loadState;
    }

    public final long getTimeOut() {
        return this.timeOut;
    }

    @Nullable
    public final OooO getWebClientBridge() {
        return this.webClientBridge;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.loadUrl(url);
        o00O00.OooO0O0("WebView loadUrl url = " + url);
    }

    public final void setLoadState(@NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadState, "<set-?>");
        this.loadState = loadState;
    }

    public final void setLoadStateListener(@NotNull OooO0o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f20916Oooo = listener;
    }

    public final void setTimeOut(long j) {
        this.timeOut = j;
    }

    public final void setWebClientBridge(@Nullable OooO oooO) {
        this.webClientBridge = oooO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(f20915OoooO0O.OooO00o(context), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeOut = 15000L;
        setScrollBarStyle(33554432);
        setDrawingCacheEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(2);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setMixedContentMode(0);
        removeJavascriptInterface("searchBoxJavaBridge_");
        getSettings().setAllowFileAccessFromFileURLs(false);
        setWebChromeClient(new OooO00o());
        setWebViewClient(new OooO0O0());
        setDownloadListener(o0000O0O.f41818OooO00o);
        OooO0O0();
        this.loadState = LoadState.Default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(f20915OoooO0O.OooO00o(context), attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeOut = 15000L;
        setScrollBarStyle(33554432);
        setDrawingCacheEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(2);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setMixedContentMode(0);
        removeJavascriptInterface("searchBoxJavaBridge_");
        getSettings().setAllowFileAccessFromFileURLs(false);
        setWebChromeClient(new OooO00o());
        setWebViewClient(new OooO0O0());
        setDownloadListener(o0000O0O.f41818OooO00o);
        OooO0O0();
        this.loadState = LoadState.Default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(f20915OoooO0O.OooO00o(context), attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeOut = 15000L;
        setScrollBarStyle(33554432);
        setDrawingCacheEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setSupportZoom(false);
        getSettings().setCacheMode(2);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setMixedContentMode(0);
        removeJavascriptInterface("searchBoxJavaBridge_");
        getSettings().setAllowFileAccessFromFileURLs(false);
        setWebChromeClient(new OooO00o());
        setWebViewClient(new OooO0O0());
        setDownloadListener(o0000O0O.f41818OooO00o);
        OooO0O0();
        this.loadState = LoadState.Default;
    }
}
