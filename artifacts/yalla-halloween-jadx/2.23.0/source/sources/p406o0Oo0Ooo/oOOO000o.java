package p406o0Oo0Ooo;

import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserInfoModel;
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
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest1$2", f = "ImMessageRepo.kt", i = {}, l = {708}, m = "invokeSuspend", n = {}, s = {})
public final class oOOO000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<UserInfoModel>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44990OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f44991OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO000o(long j, Continuation<? super oOOO000o> continuation) {
        super(2, continuation);
        this.f44991OooO0o0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOOO000o(this.f44991OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<UserInfoModel>> continuation) {
        return ((oOOO000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44990OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
            this.f44990OooO0Oo = 1;
            obj = userInfoRepo.OooO0oo(this.f44991OooO0o0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
