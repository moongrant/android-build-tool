package p608o0oo0O0O;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.LockShopModel;
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
@DebugMetadata(c = "com.yalla.yalla.ui.vm.store.LockVM$shopUnitPrice$1", f = "LockVM.kt", i = {}, l = {17, 17}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LockShopModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48341Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48342Oooo0oO;

    public o00O0000(Continuation<? super o00O0000> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O0000 o00o0001 = new o00O0000(continuation);
        o00o0001.f48342Oooo0oO = obj;
        return o00o0001;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<LockShopModel>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o00O0000) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48341Oooo0o;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f48342Oooo0oO;
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
        liveDataScope = (LiveDataScope) this.f48342Oooo0oO;
        o000OO o000oo2 = o000OO.f42594OooO00o;
        this.f48342Oooo0oO = liveDataScope;
        this.f48341Oooo0o = 1;
        obj = o000oo2.OooO0OO(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f48342Oooo0oO = null;
        this.f48341Oooo0o = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
