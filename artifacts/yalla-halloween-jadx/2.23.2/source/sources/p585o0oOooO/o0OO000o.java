package p585o0oOooO;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.LockTimeModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p412o0Oo0o0O.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.store.LockVM$loadLastTime$1", f = "LockVM.kt", i = {}, l = {13, 13}, m = "invokeSuspend", n = {}, s = {})
public final class o0OO000o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LockTimeModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56710OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56711OooO0o0;

    public o0OO000o(Continuation<? super o0OO000o> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OO000o o0oo000o = new o0OO000o(continuation);
        o0oo000o.f56711OooO0o0 = obj;
        return o0oo000o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<LockTimeModel>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o0OO000o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56710OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f56711OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        liveDataScope = (LiveDataScope) this.f56711OooO0o0;
        oo0o0O0 oo0o0o0 = oo0o0O0.f46368OooO00o;
        this.f56711OooO0o0 = liveDataScope;
        this.f56710OooO0Oo = 1;
        obj = oo0o0o0.OooO00o(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f56711OooO0o0 = null;
        this.f56710OooO0Oo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
