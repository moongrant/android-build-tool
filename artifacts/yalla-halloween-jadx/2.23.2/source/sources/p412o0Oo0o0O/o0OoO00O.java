package p412o0Oo0o0O;

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
public final class o0OoO00O extends SuspendLambda implements Function2<FlowCollector<? super UserInfo>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46328OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f46329OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f46330OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(long j, Continuation<? super o0OoO00O> continuation) {
        super(2, continuation);
        this.f46329OooO0o = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OoO00O o0ooo00o2 = new o0OoO00O(this.f46329OooO0o, continuation);
        o0ooo00o2.f46330OooO0o0 = obj;
        return o0ooo00o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super UserInfo> flowCollector, Continuation<? super Unit> continuation) {
        return ((o0OoO00O) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46328OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                flowCollector = (FlowCollector) this.f46330OooO0o0;
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
        flowCollector = (FlowCollector) this.f46330OooO0o0;
        UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
        this.f46330OooO0o0 = flowCollector;
        this.f46328OooO0Oo = 1;
        obj = userInfoRepo.OooO0oO(this.f46329OooO0o, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f46330OooO0o0 = null;
        this.f46328OooO0Oo = 2;
        if (flowCollector.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
