package p608o0oo0O0O;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.LockBuyModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p520o0o0O0O0.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.store.LockVM$shopPurchase$1", f = "LockVM.kt", i = {}, l = {21, 21}, m = "invokeSuspend", n = {}, s = {})
public final class o00 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LockBuyModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48336Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48337Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f48338Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(long j, Continuation<? super o00> continuation) {
        super(2, continuation);
        this.f48338Oooo0oo = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00 o00Var = new o00(this.f48338Oooo0oo, continuation);
        o00Var.f48337Oooo0oO = obj;
        return o00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<LockBuyModel>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o00) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48336Oooo0o;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f48337Oooo0oO;
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
        liveDataScope = (LiveDataScope) this.f48337Oooo0oO;
        o000OO o000oo2 = o000OO.f42594OooO00o;
        long j = this.f48338Oooo0oo;
        this.f48337Oooo0oO = liveDataScope;
        this.f48336Oooo0o = 1;
        obj = o000oo2.OooO0O0(j, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f48337Oooo0oO = null;
        this.f48336Oooo0o = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
