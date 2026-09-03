package p572o0oOoOO0;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$toAssociationYallaChat$1$1$1$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0OoOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f56292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AuthResponse f56293OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<ApiResult<AccountBindResult>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56294OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<AccountBindResult> apiResult) {
            ApiResult<AccountBindResult> apiResult2 = apiResult;
            if (!apiResult2.isSuccess() || apiResult2.getData() == null) {
                LiveEventBus.get("H5RefreshAssociationYallaChat").post("");
            } else {
                Observable<Object> observable = LiveEventBus.get("H5RefreshAssociationYallaChat");
                AccountBindResult data = apiResult2.getData();
                observable.post(String.valueOf(data != null ? OooOO0.OooO00o(data) : null));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(FragmentActivity fragmentActivity, AuthResponse authResponse, Continuation<? super oO0OoOO0> continuation) {
        super(2, continuation);
        this.f56292OooO0Oo = fragmentActivity;
        this.f56293OooO0o0 = authResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0OoOO0(this.f56292OooO0Oo, this.f56293OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0OoOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        FragmentActivity fragmentActivity = this.f56292OooO0Oo;
        ((YallaChatVM) new ViewModelProvider(fragmentActivity).get(YallaChatVM.class)).bindChat(this.f56293OooO0o0.getAuthCode()).observe(fragmentActivity, new oO000O0.Oooo000(OooO00o.f56294OooO0Oo));
        return Unit.INSTANCE;
    }
}
