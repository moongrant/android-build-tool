package p607o0oo0O0;

import androidx.lifecycle.LiveDataScope;
import com.app.base.mixedroom.model.TreasureBoxProgressModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TreasureBoxModel;
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
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.room.TreasureBoxVM$loadTreasureBoxInfo$1", f = "TreasureBoxVM.kt", i = {}, l = {16, 16}, m = "invokeSuspend", n = {}, s = {})
public final class o0OOO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TreasureBoxModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48319Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48320Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f48321Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(int i, Continuation<? super o0OOO0o> continuation) {
        super(2, continuation);
        this.f48321Oooo0oo = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OOO0o o0ooo0o2 = new o0OOO0o(this.f48321Oooo0oo, continuation);
        o0ooo0o2.f48320Oooo0oO = obj;
        return o0ooo0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<TreasureBoxModel>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o0OOO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48319Oooo0o;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f48320Oooo0oO;
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
        liveDataScope = (LiveDataScope) this.f48320Oooo0oO;
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        Long value = oooO00o.OooO00o().f43319OooO0Oo.getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        long jLongValue = value.longValue();
        TreasureBoxProgressModel value2 = oooO00o.OooO00o().f43363OoooOOo.getValue();
        if (value2 == null) {
            return Unit.INSTANCE;
        }
        o000OO00 o000oo01 = o000OO00.f42604OooO00o;
        long timeId = value2.getTimeId();
        int i2 = this.f48321Oooo0oo;
        this.f48320Oooo0oO = liveDataScope;
        this.f48319Oooo0o = 1;
        obj = o000oo01.OooO0oO(jLongValue, timeId, i2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f48320Oooo0oO = null;
        this.f48319Oooo0o = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
