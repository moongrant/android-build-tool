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
import com.common.support.sailfish_commons.logmodels.CustomLogModel;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.common.Constants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
import p031OoooO0.o0OoOo0;
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.o00oO0o;
import p464o0Oooo.o000000O;
import p482o0o000oO.o0Oo0oo;
import p572o0oOoOO0.oO000OOo;
import p572o0oOoOO0.oO000Oo0;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003+,-B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b\"\u0010&B#\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010(B+\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/yalla/yalla/ui/view/webView/BaseWebView;", "Landroid/webkit/WebView;", "", "mode", "", "setOverScrollMode", "Lcom/yalla/yalla/ui/view/webView/BaseWebView$OooO0OO;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setLoadStateListener", "", "OooO0o0", "J", "getTimeOut", "()J", "setTimeOut", "(J)V", "timeOut", "Lcom/yalla/yalla/ui/view/webView/BaseWebView$LoadState;", "OooO", "Lcom/yalla/yalla/ui/view/webView/BaseWebView$LoadState;", "getLoadState", "()Lcom/yalla/yalla/ui/view/webView/BaseWebView$LoadState;", "setLoadState", "(Lcom/yalla/yalla/ui/view/webView/BaseWebView$LoadState;)V", "loadState", "Lcom/yalla/yalla/ui/view/webView/BaseWebView$OooO0o;", "webClientBridge", "Lcom/yalla/yalla/ui/view/webView/BaseWebView$OooO0o;", "getWebClientBridge", "()Lcom/yalla/yalla/ui/view/webView/BaseWebView$OooO0o;", "setWebClientBridge", "(Lcom/yalla/yalla/ui/view/webView/BaseWebView$OooO0o;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LoadState", "OooO0OO", "OooO0o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class BaseWebView extends WebView {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f31384OooOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public LoadState loadState;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f31386OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Job f31387OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public long timeOut;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public String f31389OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public OooO0OO f31390OooO0oo;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yalla/yalla/ui/view/webView/BaseWebView$LoadState;", "", "Default", "Loading", "Success", "Error", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum LoadState {
        Default,
        Loading,
        Success,
        Error
    }

    public static final class OooO extends Lambda implements Function1<Long, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            BaseWebView baseWebView = BaseWebView.this;
            if (baseWebView.getLoadState() == LoadState.Success) {
                oO000Oo0.OooO0OO(baseWebView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends WebChromeClient {

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.webView.BaseWebView$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0344OooO00o extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ JsResult f31393OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0344OooO00o(JsResult jsResult) {
                super(0);
                this.f31393OooO0Oo = jsResult;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                JsResult jsResult = this.f31393OooO0Oo;
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
            o0oo00o2.OooOo0(new C0344OooO00o(jsResult));
            o0oo00o2.OooO0o(false);
            o0oo00o2.OooOO0o();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(@Nullable WebView webView, int i) {
            super.onProgressChanged(webView, i);
            BaseWebView baseWebView = BaseWebView.this;
            baseWebView.OooO0OO("INFO", MapsKt.mapOf(TuplesKt.to("newProgress", Integer.valueOf(i)), TuplesKt.to("haveError", Boolean.valueOf(baseWebView.f31386OooO0Oo))));
            OooO0OO oooO0OO = baseWebView.f31390OooO0oo;
            if (oooO0OO != null) {
                oooO0OO.OooO00o(i);
            }
            if (i < 100) {
                baseWebView.setLoadState(LoadState.Loading);
            }
            if (i != 100 || baseWebView.f31386OooO0Oo) {
                return;
            }
            Job job = baseWebView.f31387OooO0o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            OooOOO0.OooO0O0("setLoadStateListener newProgress = " + i);
            baseWebView.setLoadState(LoadState.Success);
            OooO0OO oooO0OO2 = baseWebView.f31390OooO0oo;
            if (oooO0OO2 != null) {
                oooO0OO2.OooO0O0(true);
            }
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
            BaseWebView.this.getWebClientBridge();
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> valueCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
            BaseWebView.this.getWebClientBridge();
            return false;
        }
    }

    @SourceDebugExtension({"SMAP\nBaseWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseWebView.kt\ncom/yalla/yalla/ui/view/webView/BaseWebView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,330:1\n1#2:331\n*E\n"})
    public static final class OooO0O0 extends WebViewClient {

        @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseWebView$2$onPageStarted$1", f = "BaseWebView.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f31395OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ BaseWebView f31396OooO0o0;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.view.webView.BaseWebView$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseWebView$2$onPageStarted$1$1", f = "BaseWebView.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0345OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f31397OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ BaseWebView f31398OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0345OooO00o(BaseWebView baseWebView, Continuation<? super C0345OooO00o> continuation) {
                    super(2, continuation);
                    this.f31398OooO0o0 = baseWebView;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0345OooO00o(this.f31398OooO0o0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0345OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f31397OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        long timeOut = this.f31398OooO0o0.getTimeOut();
                        this.f31397OooO0Oo = 1;
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
                this.f31396OooO0o0 = baseWebView;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f31396OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f31395OooO0Oo;
                BaseWebView baseWebView = this.f31396OooO0o0;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                    C0345OooO00o c0345OooO00o = new C0345OooO00o(baseWebView, null);
                    this.f31395OooO0Oo = 1;
                    if (BuildersKt.withContext(coroutineDispatcher, c0345OooO00o, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                OooOOO0.OooO0O0("setLoadStateListener timeOut");
                baseWebView.setLoadState(LoadState.Error);
                OooO0OO oooO0OO = baseWebView.f31390OooO0oo;
                if (oooO0OO != null) {
                    oooO0OO.OooO0O0(false);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.view.webView.BaseWebView$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C0346OooO0O0 extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f31399OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0346OooO0O0(SslErrorHandler sslErrorHandler) {
                super(0);
                this.f31399OooO0Oo = sslErrorHandler;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                SslErrorHandler sslErrorHandler = this.f31399OooO0Oo;
                if (sslErrorHandler == null) {
                    return null;
                }
                sslErrorHandler.proceed();
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0OO extends Lambda implements Function0<Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f31400OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(SslErrorHandler sslErrorHandler) {
                super(0);
                this.f31400OooO0Oo = sslErrorHandler;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                SslErrorHandler sslErrorHandler = this.f31400OooO0Oo;
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
        public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            super.onPageFinished(webView, str);
            BaseWebView baseWebView = BaseWebView.this;
            baseWebView.getWebClientBridge();
            if (str == null) {
                str = "";
            }
            baseWebView.OooO0OO("INFO", MapsKt.mapOf(TuplesKt.to("onPageFinished", str)));
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (str == null) {
                str = "";
            }
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("onPageStarted", str));
            int i = BaseWebView.f31384OooOO0;
            BaseWebView baseWebView = BaseWebView.this;
            baseWebView.OooO0OO("INFO", mapMapOf);
            baseWebView.f31386OooO0Oo = false;
            Job job = baseWebView.f31387OooO0o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            baseWebView.f31387OooO0o = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(baseWebView, null), 3, null);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(@NotNull WebView view, int i, @NotNull String description, @NotNull String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i, description, failingUrl);
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("onReceivedError", Integer.valueOf(i)), TuplesKt.to("description", description), TuplesKt.to("failingUrl", failingUrl));
            BaseWebView baseWebView = BaseWebView.this;
            baseWebView.OooO0OO("ERROR", mapMapOf);
            OooOOO0.OooO0O0("setLoadStateListener onReceivedError");
            baseWebView.setLoadState(LoadState.Error);
            OooO0OO oooO0OO = baseWebView.f31390OooO0oo;
            if (oooO0OO != null) {
                oooO0OO.OooO0O0(false);
            }
            baseWebView.f31386OooO0Oo = true;
            Job job = baseWebView.f31387OooO0o;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
            String strOooO0OO;
            BaseWebView.this.OooO0OO("ERROR", MapsKt.mapOf(TuplesKt.to("onReceivedSslError", Integer.valueOf(sslError != null ? sslError.getPrimaryError() : -1))));
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
                o0oo00o2.OooOo0(new C0346OooO0O0(sslErrorHandler));
                o0oo00o2.OooOo0O(new OooO0OO(sslErrorHandler));
                o0oo00o2.OooOO0o();
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            String string;
            boolean z;
            Uri uri;
            Uri url;
            Uri url2;
            Object url3 = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            if (url3 == null) {
                url3 = "";
            }
            Map mapMapOf = MapsKt.mapOf(TuplesKt.to("shouldOverrideUrlLoading", url3));
            int i = BaseWebView.f31384OooOO0;
            BaseWebView baseWebView = BaseWebView.this;
            baseWebView.OooO0OO("INFO", mapMapOf);
            OooOOO0.OooO0O0("WebView shouldOverrideUrlLoading url = " + (webResourceRequest != null ? webResourceRequest.getUrl() : null));
            baseWebView.getWebClientBridge();
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
                            List<ResolveInfo> listQueryIntentActivities = baseWebView.getContext().getPackageManager().queryIntentActivities(intent2, 0);
                            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
                            if (listQueryIntentActivities.size() > 0) {
                                baseWebView.getContext().startActivity(intent2);
                            }
                            return true;
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    WebSettings settings = baseWebView.getSettings();
                    String url4 = baseWebView.getUrl();
                    Intrinsics.checkNotNull(url4);
                    settings.setJavaScriptEnabled(!StringsKt.Oooo00o(url4, "file://"));
                    if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                        String string2 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "it.toString()");
                        baseWebView.loadUrl(string2);
                    }
                    return true;
                }
            }
            if (webResourceRequest != null && (uri = webResourceRequest.getUrl()) != null) {
                Context context2 = baseWebView.getContext();
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
    }

    public static final class OooOO0 implements Observer<String> {
        public OooOO0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            String str2 = str;
            boolean z = str2 == null || str2.length() == 0;
            BaseWebView baseWebView = BaseWebView.this;
            if (z) {
                oO000Oo0.OooO0O0(baseWebView, null);
            } else {
                oO000Oo0.OooO0O0(baseWebView, str2);
            }
        }
    }

    public static final class OooOO0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f31402OooO0Oo;

        public OooOO0O(OooO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f31402OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f31402OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f31402OooO0Oo;
        }

        public final int hashCode() {
            return this.f31402OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31402OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context) {
        super(o00oO0o.OooO00o(context));
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
        setDownloadListener(new oO000OOo());
        OooO0O0();
        this.loadState = LoadState.Default;
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

    public final void OooO0OO(@NotNull String level, @NotNull Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(level, "level");
        LinkedHashMap params2 = new LinkedHashMap();
        String strOooO0OO = com.code.android.util.OooO0O0.OooO0OO();
        if (strOooO0OO == null) {
            strOooO0OO = "";
        }
        params2.put("page", strOooO0OO);
        String str = this.f31389OooO0oO;
        if (str == null) {
            str = "";
        }
        params2.put("originUrl", str);
        String url = getUrl();
        if (url == null) {
            url = "";
        }
        params2.put("url", url);
        String title = getTitle();
        params2.put(ShareConstants.WEB_DIALOG_PARAM_TITLE, title != null ? title : "");
        params2.putAll(params);
        Lazy lazy = o0Oo0oo.f47701OooO00o;
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(params2, "params");
        CustomLogModel customLogModel = new CustomLogModel();
        customLogModel.setLevel(level);
        customLogModel.setTag("WebViewLog");
        for (Map.Entry entry : params2.entrySet()) {
            customLogModel.addParams((String) entry.getKey(), entry.getValue().toString());
        }
        o0Oo0oo.OooO00o(customLogModel);
    }

    public final void OooO0Oo() {
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
    public final OooO0o getWebClientBridge() {
        return null;
    }

    @Override // android.webkit.WebView
    public final void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.loadUrl(url);
        OooO0OO("INFO", MapsKt.mapOf(TuplesKt.to("loadUrl", url)));
        OooOOO0.OooO0O0("WebView loadUrl url = " + url);
        Uri uri = Uri.parse(url);
        String strOooO00o = o0OoOo0.OooO00o(uri.getScheme(), uri.getHost(), uri.getPath());
        if (Intrinsics.areEqual(strOooO00o, this.f31389OooO0oO)) {
            return;
        }
        this.f31389OooO0oO = strOooO00o;
    }

    public final void setLoadState(@NotNull LoadState loadState) {
        Intrinsics.checkNotNullParameter(loadState, "<set-?>");
        this.loadState = loadState;
    }

    public final void setLoadStateListener(@NotNull OooO0OO listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31390OooO0oo = listener;
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(o00oO0o.OooO00o(context), attributeSet);
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
        setDownloadListener(new oO000OOo());
        OooO0O0();
        this.loadState = LoadState.Default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(o00oO0o.OooO00o(context), attributeSet, i);
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
        setDownloadListener(new oO000OOo());
        OooO0O0();
        this.loadState = LoadState.Default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(o00oO0o.OooO00o(context), attributeSet, i, i2);
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
        setDownloadListener(new oO000OOo());
        OooO0O0();
        this.loadState = LoadState.Default;
    }
}
