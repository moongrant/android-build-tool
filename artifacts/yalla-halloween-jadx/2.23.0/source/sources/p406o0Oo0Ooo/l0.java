package p406o0Oo0Ooo;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo$getUserInfoAsState$state$1$1", f = "UserInfoRepo.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class l0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public MutableState f44866OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<UserInfo> f44867OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f44868OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f44869OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(MutableState<UserInfo> mutableState, long j, Continuation<? super l0> continuation) {
        super(2, continuation);
        this.f44867OooO0o = mutableState;
        this.f44869OooO0oO = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new l0(this.f44867OooO0o, this.f44869OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((l0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableState mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44868OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
            MutableState<UserInfo> mutableState2 = this.f44867OooO0o;
            this.f44866OooO0Oo = mutableState2;
            this.f44868OooO0o0 = 1;
            obj = userInfoRepo.OooO0oO(this.f44869OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = this.f44866OooO0Oo;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue(obj);
        return Unit.INSTANCE;
    }
}
