package p577o0oOoOoO;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.model.TreasureBoxCarouselInfo;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p406o0Oo0Ooo.n;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.room.TreasureBoxVM$loadTreasureBoxCarouselInfo$1", f = "TreasureBoxVM.kt", i = {}, l = {20, 20}, m = "invokeSuspend", n = {}, s = {})
public final class oOO00O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TreasureBoxCarouselInfo>>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56384OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56385OooO0o0;

    public oOO00O0(Continuation<? super oOO00O0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oOO00O0 ooo00o0 = new oOO00O0(continuation);
        ooo00o0.f56385OooO0o0 = obj;
        return ooo00o0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<List<TreasureBoxCarouselInfo>>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((oOO00O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56384OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f56385OooO0o0;
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
        liveDataScope = (LiveDataScope) this.f56385OooO0o0;
        n nVar = n.f44887OooO00o;
        this.f56385OooO0o0 = liveDataScope;
        this.f56384OooO0Oo = 1;
        obj = nVar.OooO0o(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f56385OooO0o0 = null;
        this.f56384OooO0Oo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
