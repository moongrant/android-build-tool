package p488o0o000oo;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p516o0o0O000.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$toAssociationYallaChat$1$1$1$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f40965Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AuthResponse f40966Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(FragmentActivity fragmentActivity, AuthResponse authResponse, Continuation<? super o000000O> continuation) {
        super(2, continuation);
        this.f40965Oooo0o = fragmentActivity;
        this.f40966Oooo0oO = authResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000000O(this.f40965Oooo0o, this.f40966Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ((YallaChatVM) new ViewModelProvider(this.f40965Oooo0o).get(YallaChatVM.class)).bindChat(this.f40966Oooo0oO.getAuthCode()).observe(this.f40965Oooo0o, new Observer() { // from class: o0o000oo.o000000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                ApiResult apiResult = (ApiResult) obj2;
                if (!apiResult.isSuccess() || apiResult.getData() == null) {
                    LiveEventBus.get("H5RefreshAssociationYallaChat").post("");
                    return;
                }
                Observable<Object> observable = LiveEventBus.get("H5RefreshAssociationYallaChat");
                AccountBindResult accountBindResult = (AccountBindResult) apiResult.getData();
                observable.post(String.valueOf(accountBindResult != null ? o0Oo0oo.OooO0O0(accountBindResult) : null));
            }
        });
        return Unit.INSTANCE;
    }
}
