package p609o0oo0O0o;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.BadgeNews;
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
import p520o0o0O0O0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BadgeNewsVM$getBadgeMomentInfo$1", f = "BadgeNewsVM.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
public final class o00oOoo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48358Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f48359Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O000 f48360Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(int i, o00O000 o00o001, Continuation<? super o00oOoo> continuation) {
        super(2, continuation);
        this.f48359Oooo0oO = i;
        this.f48360Oooo0oo = o00o001;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00oOoo(this.f48359Oooo0oO, this.f48360Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00oOoo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48358Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOOO0 oooOOO0 = OooOOO0.f42243OooO00o;
            int i2 = this.f48359Oooo0oO;
            this.f48358Oooo0o = 1;
            obj = oooOOO0.OooO0OO(i2, this);
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
            this.f48360Oooo0oo.f48353OooO00o.postValue((List<BadgeNews>) apiResult.getData());
        }
        return Unit.INSTANCE;
    }
}
