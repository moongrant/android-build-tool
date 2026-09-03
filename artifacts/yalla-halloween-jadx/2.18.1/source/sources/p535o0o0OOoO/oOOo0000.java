package p535o0o0OOoO;

import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import java.util.Map;
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
import p515o0o0O00.o00O00;
import p516o0o0O000.o00000OO;
import p649o0ooOOoo.e7;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$loadUrl$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOOo0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ WebActivity f43718Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOo0000(WebActivity webActivity, Continuation<? super oOOo0000> continuation) {
        super(2, continuation);
        this.f43718Oooo0o = webActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOOo0000(this.f43718Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOOo0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        WebPageInfo webPageInfo = this.f43718Oooo0o.f22118Oooooo0;
        e7 e7Var = null;
        WebPageInfo webPageInfo2 = null;
        if (webPageInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo = null;
        }
        if (StringsKt__StringsKt.contains$default(webPageInfo.f21217Oooo0oO, "https://api.instagram.com/oauth/authorize", false, 2, (Object) null)) {
            e7 e7Var2 = this.f43718Oooo0o.f22115OooooOO;
            if (e7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                e7Var2 = null;
            }
            BaseWebView baseWebView = e7Var2.f49213OooO0o0;
            WebPageInfo webPageInfo3 = this.f43718Oooo0o.f22118Oooooo0;
            if (webPageInfo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            } else {
                webPageInfo2 = webPageInfo3;
            }
            baseWebView.loadUrl(webPageInfo2.f21217Oooo0oO);
            this.f43718Oooo0o.f22113Ooooo0o = true;
            return Unit.INSTANCE;
        }
        WebPageInfo webPageInfo4 = this.f43718Oooo0o.f22118Oooooo0;
        if (webPageInfo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo4 = null;
        }
        String strOooO00o = o00000OO.OooO00o(webPageInfo4.f21217Oooo0oO);
        WebPageInfo webPageInfo5 = this.f43718Oooo0o.f22118Oooooo0;
        if (webPageInfo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo5 = null;
        }
        String strOooO0OO = o00000OO.OooO0OO(strOooO00o, webPageInfo5.f21216Oooo0o);
        WebPageInfo webPageInfo6 = this.f43718Oooo0o.f22118Oooooo0;
        if (webPageInfo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
            webPageInfo6 = null;
        }
        if (true ^ webPageInfo6.f21222OoooO0O.isEmpty()) {
            WebPageInfo webPageInfo7 = this.f43718Oooo0o.f22118Oooooo0;
            if (webPageInfo7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo7 = null;
            }
            for (Map.Entry entry : webPageInfo7.f21222OoooO0O.entrySet()) {
                strOooO0OO = o00000OO.OooO0O0(strOooO0OO, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        e7 e7Var3 = this.f43718Oooo0o.f22115OooooOO;
        if (e7Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            e7Var = e7Var3;
        }
        e7Var.f49213OooO0o0.loadUrl(strOooO0OO);
        o00O00.OooO0OO("webview url = ", strOooO0OO);
        return Unit.INSTANCE;
    }
}
