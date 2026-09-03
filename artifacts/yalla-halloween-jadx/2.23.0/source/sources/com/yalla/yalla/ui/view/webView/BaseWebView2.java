package com.yalla.yalla.ui.view.webView;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
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
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
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
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.o00oO0o;
import p464o0Oooo.o000000O;
import p572o0oOoOO0.oO000Oo0;
import p572o0oOoOO0.ooOOOOoo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u000256B\u0011\b\u0016\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-B\u001b\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b,\u00100B#\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b,\u00102B+\b\u0016\u0012\u0006\u0010+\u001a\u00020*\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\b,\u00104J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RA\u0010!\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00067"}, d2 = {"Lcom/yalla/yalla/ui/view/webView/BaseWebView2;", "Landroid/webkit/WebView;", "", "mode", "", "setOverScrollMode", "", "OooO0o0", "J", "getTimeOut", "()J", "setTimeOut", "(J)V", "timeOut", "Lcom/yalla/yalla/ui/view/webView/BaseWebView2$OooO0OO;", "OooO0oO", "Lcom/yalla/yalla/ui/view/webView/BaseWebView2$OooO0OO;", "getLoadStateListener", "()Lcom/yalla/yalla/ui/view/webView/BaseWebView2$OooO0OO;", "setLoadStateListener", "(Lcom/yalla/yalla/ui/view/webView/BaseWebView2$OooO0OO;)V", "loadStateListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", ShareConstants.WEB_DIALOG_PARAM_TITLE, "OooO0oo", "Lkotlin/jvm/functions/Function1;", "getOnReceivedTitle", "()Lkotlin/jvm/functions/Function1;", "setOnReceivedTitle", "(Lkotlin/jvm/functions/Function1;)V", "onReceivedTitle", "Lcom/yalla/yalla/ui/view/webView/BaseWebView2$OooO0o;", "OooO", "Lcom/yalla/yalla/ui/view/webView/BaseWebView2$OooO0o;", "getWebClientBridge", "()Lcom/yalla/yalla/ui/view/webView/BaseWebView2$OooO0o;", "setWebClientBridge", "(Lcom/yalla/yalla/ui/view/webView/BaseWebView2$OooO0o;)V", "webClientBridge", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "OooO0OO", "OooO0o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class BaseWebView2 extends WebView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public OooO0o webClientBridge;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f31404OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Job f31405OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public long timeOut;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public OooO0OO loadStateListener;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> onReceivedTitle;

    public static final class OooO extends Lambda implements Function1<Long, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            BaseWebView2 baseWebView2 = BaseWebView2.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                oO000Oo0.OooO0OO(baseWebView2);
                Result.m4213constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4213constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends WebChromeClient {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.webView.BaseWebView2$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0347OooO00o extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ JsResult f31411OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0347OooO00o(JsResult jsResult) {
                super(0);
                this.f31411OooO0Oo = jsResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                JsResult jsResult = this.f31411OooO0Oo;
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
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity == null) {
                return false;
            }
            o0OO00O o0oo00o2 = new o0OO00O(fragmentActivity);
            if (str2 == null) {
                str2 = "";
            }
            o0oo00o2.OooOo00(str2);
            o0oo00o2.OooOo0(new C0347OooO00o(jsResult));
            o0oo00o2.OooO0o(false);
            o0oo00o2.OooOO0o();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@Nullable WebView webView, int i) {
            super.onProgressChanged(webView, i);
            BaseWebView2 baseWebView2 = BaseWebView2.this;
            OooO0OO loadStateListener = baseWebView2.getLoadStateListener();
            if (loadStateListener != null) {
                loadStateListener.OooO00o(i);
            }
            if (i != 100 || baseWebView2.f31404OooO0Oo) {
                return;
            }
            Job job = baseWebView2.f31405OooO0o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            OooO0OO loadStateListener2 = baseWebView2.getLoadStateListener();
            if (loadStateListener2 != null) {
                loadStateListener2.OooO0O0(true);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
            Function1<String, Unit> onReceivedTitle;
            BaseWebView2 baseWebView2 = BaseWebView2.this;
            if (baseWebView2.f31404OooO0Oo || (onReceivedTitle = baseWebView2.getOnReceivedTitle()) == null) {
                return;
            }
            onReceivedTitle.invoke(str);
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> valueCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
            OooO0o webClientBridge = BaseWebView2.this.getWebClientBridge();
            if (webClientBridge == null) {
                return false;
            }
            webClientBridge.OooO00o(valueCallback);
            return true;
        }
    }

    @SourceDebugExtension({"SMAP\nBaseWebView2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseWebView2.kt\ncom/yalla/yalla/ui/view/webView/BaseWebView2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    public static final class OooO0O0 extends WebViewClient {

        @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseWebView2$2$onPageStarted$1", f = "BaseWebView2.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f31413OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ BaseWebView2 f31414OooO0o0;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.view.webView.BaseWebView2$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseWebView2$2$onPageStarted$1$1", f = "BaseWebView2.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0348OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f31415OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ BaseWebView2 f31416OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0348OooO00o(BaseWebView2 baseWebView2, Continuation<? super C0348OooO00o> continuation) {
                    super(2, continuation);
                    this.f31416OooO0o0 = baseWebView2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0348OooO00o(this.f31416OooO0o0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0348OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f31415OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        long timeOut = this.f31416OooO0o0.getTimeOut();
                        this.f31415OooO0Oo = 1;
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
            public OooO00o(BaseWebView2 baseWebView2, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31414OooO0o0 = baseWebView2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f31414OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f31413OooO0Oo;
                BaseWebView2 baseWebView2 = this.f31414OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                    C0348OooO00o c0348OooO00o = new C0348OooO00o(baseWebView2, null);
                    this.f31413OooO0Oo = 1;
                    if (BuildersKt.withContext(coroutineDispatcher, c0348OooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                OooO0OO loadStateListener = baseWebView2.getLoadStateListener();
                if (loadStateListener != null) {
                    loadStateListener.OooO0O0(false);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.webView.BaseWebView2$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0349OooO0O0 extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f31417OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0349OooO0O0(SslErrorHandler sslErrorHandler) {
                super(0);
                this.f31417OooO0Oo = sslErrorHandler;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                SslErrorHandler sslErrorHandler = this.f31417OooO0Oo;
                if (sslErrorHandler == null) {
                    return null;
                }
                sslErrorHandler.proceed();
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f31418OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(SslErrorHandler sslErrorHandler) {
                super(0);
                this.f31418OooO0Oo = sslErrorHandler;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                SslErrorHandler sslErrorHandler = this.f31418OooO0Oo;
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
            BaseWebView2 baseWebView2 = BaseWebView2.this;
            baseWebView2.f31404OooO0Oo = false;
            Job job = baseWebView2.f31405OooO0o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            baseWebView2.f31405OooO0o = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(baseWebView2, null), 3, null);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView view, int i, @NotNull String description, @NotNull String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i, description, failingUrl);
            BaseWebView2 baseWebView2 = BaseWebView2.this;
            OooO0OO loadStateListener = baseWebView2.getLoadStateListener();
            if (loadStateListener != null) {
                loadStateListener.OooO0O0(false);
            }
            baseWebView2.f31404OooO0Oo = true;
            Job job = baseWebView2.f31405OooO0o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
            String strOooO0OO;
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                o0OO00O o0oo00o2 = new o0OO00O(fragmentActivity);
                o0oo00o2.OooOoO0(oO00OOo0.SSL_Error);
                Intrinsics.checkNotNull(sslError);
                int primaryError = sslError.getPrimaryError();
                if (primaryError != 1) {
                    strOooO0OO = primaryError != 3 ? "" : o0000.OooO0OO(oO00OOo0.SSL_Untrusted);
                } else {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.SSL_Expired);
                }
                o0oo00o2.OooOo00(strOooO0OO + "\n" + o0000.OooO0OO(oO00OOo0.SSL_Error_Continue));
                o0oo00o2.OooO0o(false);
                o0oo00o2.OooOo0(new C0349OooO0O0(sslErrorHandler));
                o0oo00o2.OooOo0O(new OooO0OO(sslErrorHandler));
                o0oo00o2.OooOO0o();
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0074  */
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            String string;
            boolean z;
            Uri uri;
            Uri url;
            Uri url2;
            BaseWebView2 baseWebView2 = BaseWebView2.this;
            OooO0o webClientBridge = baseWebView2.getWebClientBridge();
            if (webClientBridge != null) {
                webClientBridge.OooO0O0(webView, webResourceRequest);
            }
            if (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null || (string = url2.toString()) == null) {
                string = "";
            }
            if (StringsKt.OooO0o(string, "tel:")) {
                return true;
            }
            if (StringsKt.Oooo00o(string, "mailto:")) {
                String strOooOoO = StringsKt.OooOoO(string, "mailto:", "");
                if (Pattern.compile("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$").matcher(strOooOoO).matches()) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("plain/text");
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{strOooOoO});
                    intent.putExtra("android.intent.extra.SUBJECT", "");
                    intent.putExtra("android.intent.extra.TEXT", "");
                    Context context = o000O0.f10354OooO00o;
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
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
            if (!StringsKt.OooO0o(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), "market")) {
                if (!StringsKt.OooO0o(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null), "https://play.google.com/store/apps/details?id=")) {
                    if (StringsKt.Oooo00o(string, "whatsapp://")) {
                        try {
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(string));
                            intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                            List<ResolveInfo> listQueryIntentActivities = baseWebView2.getContext().getPackageManager().queryIntentActivities(intent2, 0);
                            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
                            if (listQueryIntentActivities.size() > 0) {
                                baseWebView2.getContext().startActivity(intent2);
                            }
                            return true;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    WebSettings settings = baseWebView2.getSettings();
                    String url3 = baseWebView2.getUrl();
                    Intrinsics.checkNotNull(url3);
                    settings.setJavaScriptEnabled(!StringsKt.Oooo00o(url3, "file://"));
                    if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                        baseWebView2.loadUrl(url.toString());
                    }
                    return true;
                }
            }
            if (webResourceRequest != null && (uri = webResourceRequest.getUrl()) != null) {
                Context context2 = baseWebView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(uri, "uri");
                try {
                    Intent intent3 = new Intent("android.intent.action.VIEW", uri);
                    intent3.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                    context2.startActivity(intent3);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return true;
        }
    }

    public interface OooO0OO {
        void OooO00o(int i);

        void OooO0O0(boolean z);
    }

    @StabilityInferred(parameters = 0)
    public static class OooO0o {
        public void OooO00o(@Nullable ValueCallback valueCallback) {
            throw null;
        }

        public void OooO0O0(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            throw null;
        }
    }

    public static final class OooOO0 implements Observer<String> {
        public OooOO0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            String str2 = str;
            boolean z = str2 == null || str2.length() == 0;
            BaseWebView2 baseWebView2 = BaseWebView2.this;
            if (z) {
                oO000Oo0.OooO0O0(baseWebView2, null);
            } else {
                oO000Oo0.OooO0O0(baseWebView2, str2);
            }
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f31420OooO0Oo;

        public OooOO0O(OooO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f31420OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f31420OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f31420OooO0Oo;
        }

        public final int hashCode() {
            return this.f31420OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31420OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView2(@NotNull Context context) {
        super(o00oO0o.OooO00o(context));
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeOut = 15000L;
        setBackgroundColor(0);
        setScrollBarStyle(33554432);
        setDrawingCacheEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setSupportZoom(false);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setMixedContentMode(0);
        getSettings().setCacheMode(2);
        getSettings().setAllowFileAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        WebView.setWebContentsDebuggingEnabled(true);
        setWebChromeClient(new OooO00o());
        setWebViewClient(new OooO0O0());
        setDownloadListener(new ooOOOOoo());
        OooO0O0();
    }

    public static void OooO00o(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            activityOooO0O0.startActivity(intent);
        }
    }

    public final void OooO0O0() {
        ComponentCallbacks2 componentCallbacks2OooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        LifecycleOwner lifecycleOwner = componentCallbacks2OooO0O0 instanceof LifecycleOwner ? (LifecycleOwner) componentCallbacks2OooO0O0 : null;
        if (lifecycleOwner != null) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooO0O0().observe(lifecycleOwner, new OooOO0O(new OooO()));
            LiveEventBus.get("H5RefreshAssociationYallaChat", String.class).observe(lifecycleOwner, new OooOO0());
        }
    }

    @Nullable
    public final OooO0OO getLoadStateListener() {
        return this.loadStateListener;
    }

    @Nullable
    public final Function1<String, Unit> getOnReceivedTitle() {
        return this.onReceivedTitle;
    }

    public final long getTimeOut() {
        return this.timeOut;
    }

    @Nullable
    public final OooO0o getWebClientBridge() {
        return this.webClientBridge;
    }

    public final void setLoadStateListener(@Nullable OooO0OO oooO0OO) {
        this.loadStateListener = oooO0OO;
    }

    public final void setOnReceivedTitle(@Nullable Function1<? super String, Unit> function1) {
        this.onReceivedTitle = function1;
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int mode) {
        try {
            super.setOverScrollMode(mode);
        } catch (Throwable unused) {
        }
    }

    public final void setTimeOut(long j) {
        this.timeOut = j;
    }

    public final void setWebClientBridge(@Nullable OooO0o oooO0o) {
        this.webClientBridge = oooO0o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(o00oO0o.OooO00o(context), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeOut = 15000L;
        setBackgroundColor(0);
        setScrollBarStyle(33554432);
        setDrawingCacheEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setSupportZoom(false);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setMixedContentMode(0);
        getSettings().setCacheMode(2);
        getSettings().setAllowFileAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        WebView.setWebContentsDebuggingEnabled(true);
        setWebChromeClient(new OooO00o());
        setWebViewClient(new OooO0O0());
        setDownloadListener(new ooOOOOoo());
        OooO0O0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00oO0o.OooO00o(context), attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeOut = 15000L;
        setBackgroundColor(0);
        setScrollBarStyle(33554432);
        setDrawingCacheEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setSupportZoom(false);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setMixedContentMode(0);
        getSettings().setCacheMode(2);
        getSettings().setAllowFileAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        WebView.setWebContentsDebuggingEnabled(true);
        setWebChromeClient(new OooO00o());
        setWebViewClient(new OooO0O0());
        setDownloadListener(new ooOOOOoo());
        OooO0O0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(o00oO0o.OooO00o(context), attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        this.timeOut = 15000L;
        setBackgroundColor(0);
        setScrollBarStyle(33554432);
        setDrawingCacheEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setPluginState(WebSettings.PluginState.ON);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setAllowFileAccess(true);
        getSettings().setSupportZoom(false);
        getSettings().setDomStorageEnabled(true);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        getSettings().setSavePassword(false);
        getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        getSettings().setMixedContentMode(0);
        getSettings().setCacheMode(2);
        getSettings().setAllowFileAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        WebView.setWebContentsDebuggingEnabled(true);
        setWebChromeClient(new OooO00o());
        setWebViewClient(new OooO0O0());
        setDownloadListener(new ooOOOOoo());
        OooO0O0();
    }
}
