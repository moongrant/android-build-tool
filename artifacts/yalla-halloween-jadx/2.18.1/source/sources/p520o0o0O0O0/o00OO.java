package p520o0o0O0O0;

import com.yalla.yalla.common.db.table.UserInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p491o0o00O00.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo$getUserInfoAsFlow$1", f = "UserInfoRepo.kt", i = {}, l = {90, 93, 93}, m = "invokeSuspend", n = {}, s = {})
public final class o00OO extends SuspendLambda implements Function2<FlowCollector<? super UserInfo>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42702Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f42703Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f42704Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(long j, Continuation<? super o00OO> continuation) {
        super(2, continuation);
        this.f42704Oooo0oo = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00OO o00oo2 = new o00OO(this.f42704Oooo0oo, continuation);
        o00oo2.f42703Oooo0oO = obj;
        return o00oo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super UserInfo> flowCollector, Continuation<? super Unit> continuation) {
        return ((o00OO) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42702Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.f42703Oooo0oO;
            UserInfo userInfoOooO0O0 = OooO0OO.OooO00o().Oooo0O0().OooO0O0(this.f42704Oooo0oo);
            if (userInfoOooO0O0 != null) {
                this.f42702Oooo0o = 1;
                if (flowCollector.emit(userInfoOooO0O0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            oo0O oo0o = oo0O.f42896OooO00o;
            long j = this.f42704Oooo0oo;
            this.f42703Oooo0oO = flowCollector;
            this.f42702Oooo0o = 2;
            obj = oo0O.OooO0o0(oo0o, j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f42703Oooo0oO = null;
            this.f42702Oooo0o = 3;
            if (flowCollector.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                flowCollector = (FlowCollector) this.f42703Oooo0oO;
                ResultKt.throwOnFailure(obj);
                this.f42703Oooo0oO = null;
                this.f42702Oooo0o = 3;
                if (flowCollector.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        }
        return Unit.INSTANCE;
    }
}
