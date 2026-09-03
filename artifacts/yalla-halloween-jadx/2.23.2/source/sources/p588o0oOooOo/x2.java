package p588o0oOooOo;

import com.yalla.yalla.model.BadgeNews;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
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
import p412o0Oo0o0O.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BadgeNewsVM$getBadgeMomentInfo$1", f = "BadgeNewsVM.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
public final class x2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57082OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ y2 f57083OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f57084OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(int i, y2 y2Var, Continuation<? super x2> continuation) {
        super(2, continuation);
        this.f57084OooO0o0 = i;
        this.f57083OooO0o = y2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new x2(this.f57084OooO0o0, this.f57083OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((x2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f57082OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0000O0O o0000o0o2 = o0000O0O.f45951OooO00o;
            this.f57082OooO0Oo = 1;
            obj = o0000o0o2.OooO0OO(this.f57084OooO0o0, this);
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
        if (apiResult.isSuccess()) {
            this.f57083OooO0o.f57085OooO00o.postValue((List<BadgeNews>) apiResult.getData());
        }
        return Unit.INSTANCE;
    }
}
