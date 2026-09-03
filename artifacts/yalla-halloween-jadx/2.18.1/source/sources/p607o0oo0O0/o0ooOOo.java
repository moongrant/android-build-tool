package p607o0oo0O0;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TreasureBoxCarouselInfo;
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
import p520o0o0O0O0.o000OO00;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.room.TreasureBoxVM$loadTreasureBoxCarouselInfo$1", f = "TreasureBoxVM.kt", i = {}, l = {20, 20}, m = "invokeSuspend", n = {}, s = {})
public final class o0ooOOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TreasureBoxCarouselInfo>>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48326Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48327Oooo0oO;

    public o0ooOOo(Continuation<? super o0ooOOo> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0ooOOo o0ooooo2 = new o0ooOOo(continuation);
        o0ooooo2.f48327Oooo0oO = obj;
        return o0ooooo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<List<TreasureBoxCarouselInfo>>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o0ooOOo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48326Oooo0o;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f48327Oooo0oO;
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
        liveDataScope = (LiveDataScope) this.f48327Oooo0oO;
        o000OO00 o000oo01 = o000OO00.f42604OooO00o;
        this.f48327Oooo0oO = liveDataScope;
        this.f48326Oooo0o = 1;
        obj = o000oo01.OooO0o(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f48327Oooo0oO = null;
        this.f48326Oooo0o = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
