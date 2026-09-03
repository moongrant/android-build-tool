package androidx.paging.compose;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", f = "LazyPagingItems.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0O0 extends SuspendLambda implements Function2<o0O0ooO<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f8792Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f8793Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<Object> f8794Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(OooO0OO<Object> oooO0OO, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f8794Oooo0oo = oooO0OO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OooO0O0 oooO0O0 = new OooO0O0(this.f8794Oooo0oo, continuation);
        oooO0O0.f8793Oooo0oO = obj;
        return oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0O0ooO<Object> o0o0ooo, Continuation<? super Unit> continuation) {
        return ((OooO0O0) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f8792Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O0ooO o0o0ooo = (o0O0ooO) this.f8793Oooo0oO;
            OooO0OO.OooO0O0 oooO0O0 = this.f8794Oooo0oo.f8798OooO0Oo;
            this.f8792Oooo0o = 1;
            if (oooO0O0.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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
