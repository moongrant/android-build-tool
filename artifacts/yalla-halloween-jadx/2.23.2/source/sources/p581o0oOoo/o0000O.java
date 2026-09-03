package p581o0oOoo;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.mixedroom.model.TreasureBoxProgressModel;
import com.yalla.yalla.model.TreasureBoxModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p412o0Oo0o0O.o00OO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.room.TreasureBoxVM$loadTreasureBoxInfo$1", f = "TreasureBoxVM.kt", i = {}, l = {16, 16}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TreasureBoxModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56570OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f56571OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56572OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(int i, Continuation<? super o0000O> continuation) {
        super(2, continuation);
        this.f56571OooO0o = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0000O o0000o2 = new o0000O(this.f56571OooO0o, continuation);
        o0000o2.f56572OooO0o0 = obj;
        return o0000o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<TreasureBoxModel>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o0000O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56570OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f56572OooO0o0;
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
        liveDataScope = (LiveDataScope) this.f56572OooO0o0;
        OooO0O0.OooO00o oooO00o = OooO0O0.f24533OoooOOO;
        Long value = oooO00o.OooO00o().f24539OooO0Oo.getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        long jLongValue = value.longValue();
        TreasureBoxProgressModel value2 = oooO00o.OooO00o().f24576Oooo0oo.getValue();
        if (value2 == null) {
            return Unit.INSTANCE;
        }
        o00OO o00oo2 = o00OO.f46151OooO00o;
        long timeId = value2.getTimeId();
        int i2 = this.f56571OooO0o;
        this.f56572OooO0o0 = liveDataScope;
        this.f56570OooO0Oo = 1;
        obj = o00oo2.OooO0oO(jLongValue, timeId, i2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f56572OooO0o0 = null;
        this.f56570OooO0Oo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
