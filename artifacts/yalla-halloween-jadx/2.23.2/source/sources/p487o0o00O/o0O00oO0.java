package p487o0o00O;

import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.webView.BaseWebView2;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$loadUrl$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0O00oO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48882OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00oO0(WebActivity webActivity, Continuation<? super o0O00oO0> continuation) {
        super(2, continuation);
        this.f48882OooO0Oo = webActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O00oO0(this.f48882OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O00oO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        WebActivity webActivity = this.f48882OooO0Oo;
        WebPageInfo webPageInfo = webActivity.f25137OooOo0O;
        WebPageInfo webPageInfo2 = null;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        if (StringsKt__StringsKt.contains$default(webPageInfo.f32283OooO0o0, "https://api.instagram.com/oauth/authorize", false, 2, (Object) null)) {
            BaseWebView2 baseWebView2 = webActivity.f25138OooOo0o;
            if (baseWebView2 != null) {
                WebPageInfo webPageInfo3 = webActivity.f25137OooOo0O;
                if (webPageInfo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                } else {
                    webPageInfo2 = webPageInfo3;
                }
                baseWebView2.loadUrl(webPageInfo2.f32283OooO0o0);
            }
            webActivity.f25133OooOOoo = true;
            return Unit.INSTANCE;
        }
        WebPageInfo webPageInfo4 = webActivity.f25137OooOo0O;
        if (webPageInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
        } else {
            webPageInfo2 = webPageInfo4;
        }
        String strOooO0O0 = webPageInfo2.OooO0O0(true);
        BaseWebView2 baseWebView3 = webActivity.f25138OooOo0o;
        if (baseWebView3 != null) {
            baseWebView3.loadUrl(strOooO0O0);
        }
        o0000O00.OooO0O0("WebActivity \nwebViewUrl = " + strOooO0O0);
        return Unit.INSTANCE;
    }
}
