package p402o0Oo0OOO;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.GiftRepo$loadWeeklyStart$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
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
import p376o0OOoOOO.o000OOo0;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.cache.SharedWeeklyStarManager$loadUrlConfig$1", f = "SharedWeeklyStarManager.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class oOO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44525OooO0Oo;

    public oOO00O(Continuation<? super oOO00O> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOO00O(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new oOO00O(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44525OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f44525OooO0Oo = 1;
            String strOooO0OO = o000OOo0.OooO0OO("/Webservers/Bar/InitConfig");
            obj = OooOOO.OooO0Oo(new GiftRepo$loadWeeklyStart$$inlined$call$1(o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (!apiResult.isSuccess()) {
            return Unit.INSTANCE;
        }
        o00O00O.f44516OooO0O0.postValue(apiResult.getData());
        return Unit.INSTANCE;
    }
}
