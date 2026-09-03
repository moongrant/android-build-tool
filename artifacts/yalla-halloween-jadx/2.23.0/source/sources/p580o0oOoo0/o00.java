package p580o0oOoo0;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.LockBuyModel;
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
@DebugMetadata(c = "com.yalla.yalla.ui.vm.store.LockVM$shopPurchase$1", f = "LockVM.kt", i = {}, l = {21, 21}, m = "invokeSuspend", n = {}, s = {})
public final class o00 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LockBuyModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56730OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f56731OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56732OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(long j, Continuation<? super o00> continuation) {
        super(2, continuation);
        this.f56731OooO0o = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00 o00Var = new o00(this.f56731OooO0o, continuation);
        o00Var.f56732OooO0o0 = obj;
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
        int i = this.f56730OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f56732OooO0o0;
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
        liveDataScope = (LiveDataScope) this.f56732OooO0o0;
        d dVar = d.f44754OooO00o;
        this.f56732OooO0o0 = liveDataScope;
        this.f56730OooO0Oo = 1;
        obj = dVar.OooO0O0(this.f56731OooO0o, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f56732OooO0o0 = null;
        this.f56730OooO0Oo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
