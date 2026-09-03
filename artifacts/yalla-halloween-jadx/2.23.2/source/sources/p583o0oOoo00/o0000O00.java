package p583o0oOoo00;

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
import p380o0OOoOo.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.cache.SharedWeeklyStarManager$loadUrlConfig$1", f = "SharedWeeklyStarManager.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56684OooO0Oo;

    public o0000O00(Continuation<? super o0000O00> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O00(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o0000O00(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56684OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f56684OooO0Oo = 1;
            String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/InitConfig");
            obj = OooOOO.OooO0Oo(new GiftRepo$loadWeeklyStart$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0), null), this);
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
        o0000.f56627OooO0O0.postValue(apiResult.getData());
        return Unit.INSTANCE;
    }
}
