package p580o0oOoo0;

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
import p406o0Oo0Ooo.d;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.store.LockVM$loadLastTime$1", f = "LockVM.kt", i = {}, l = {13, 13}, m = "invokeSuspend", n = {}, s = {})
public final class o000OOo0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LockTimeModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56733OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56734OooO0o0;

    public o000OOo0(Continuation<? super o000OOo0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000OOo0 o000ooo1 = new o000OOo0(continuation);
        o000ooo1.f56734OooO0o0 = obj;
        return o000ooo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<LockTimeModel>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o000OOo0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56733OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f56734OooO0o0;
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
        liveDataScope = (LiveDataScope) this.f56734OooO0o0;
        d dVar = d.f44754OooO00o;
        this.f56734OooO0o0 = liveDataScope;
        this.f56733OooO0Oo = 1;
        obj = dVar.OooO00o(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f56734OooO0o0 = null;
        this.f56733OooO0Oo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
