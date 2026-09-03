package p580o0oOoo0;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.LockShopModel;
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
@DebugMetadata(c = "com.yalla.yalla.ui.vm.store.LockVM$shopUnitPrice$1", f = "LockVM.kt", i = {}, l = {17, 17}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0000 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LockShopModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56735OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56736OooO0o0;

    public o00O0000(Continuation<? super o00O0000> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O0000 o00o0001 = new o00O0000(continuation);
        o00o0001.f56736OooO0o0 = obj;
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
        int i = this.f56735OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f56736OooO0o0;
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
        liveDataScope = (LiveDataScope) this.f56736OooO0o0;
        d dVar = d.f44754OooO00o;
        this.f56736OooO0o0 = liveDataScope;
        this.f56735OooO0Oo = 1;
        obj = dVar.OooO0OO(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f56736OooO0o0 = null;
        this.f56735OooO0Oo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
