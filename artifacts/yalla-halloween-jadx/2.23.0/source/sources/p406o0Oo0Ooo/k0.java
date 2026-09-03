package p406o0Oo0Ooo;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo$getUserInfoAsFlow$1", f = "UserInfoRepo.kt", i = {}, l = {92, 92}, m = "invokeSuspend", n = {}, s = {})
public final class k0 extends SuspendLambda implements Function2<FlowCollector<? super UserInfo>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44850OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f44851OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f44852OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(long j, Continuation<? super k0> continuation) {
        super(2, continuation);
        this.f44851OooO0o = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        k0 k0Var = new k0(this.f44851OooO0o, continuation);
        k0Var.f44852OooO0o0 = obj;
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super UserInfo> flowCollector, Continuation<? super Unit> continuation) {
        return ((k0) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44850OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                flowCollector = (FlowCollector) this.f44852OooO0o0;
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
        flowCollector = (FlowCollector) this.f44852OooO0o0;
        UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
        this.f44852OooO0o0 = flowCollector;
        this.f44850OooO0Oo = 1;
        obj = userInfoRepo.OooO0oO(this.f44851OooO0o, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f44852OooO0o0 = null;
        this.f44850OooO0Oo = 2;
        if (flowCollector.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
