package p100o000oOoO;

import io.agora.rtc.Constants;
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

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED}, m = "invokeSuspend", n = {}, s = {})
public final class o0OOO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Object> f29638Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f29639Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f29640Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function2<o0O0oo0o<Object>, Continuation<? super Unit>, Object> f29641Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0OO(Function2<? super o0O0oo0o<Object>, ? super Continuation<? super Unit>, ? extends Object> function2, o0O00OO<Object> o0o00oo2, Continuation<? super o0OOO0OO> continuation) {
        super(2, continuation);
        this.f29641Oooo0oo = function2;
        this.f29638Oooo = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OOO0OO o0ooo0oo2 = new o0OOO0OO(this.f29641Oooo0oo, this.f29638Oooo, continuation);
        o0ooo0oo2.f29640Oooo0oO = obj;
        return o0ooo0oo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OOO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f29639Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f29640Oooo0oO;
            Function2<o0O0oo0o<Object>, Continuation<? super Unit>, Object> function2 = this.f29641Oooo0oo;
            o0O0O0Oo o0o0o0oo = new o0O0O0Oo(this.f29638Oooo, coroutineScope.getCoroutineContext());
            this.f29639Oooo0o = 1;
            if (function2.invoke(o0o0o0oo, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
