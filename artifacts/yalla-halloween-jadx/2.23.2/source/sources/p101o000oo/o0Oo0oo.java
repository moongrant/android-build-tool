package p101o000oo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class o0Oo0oo extends SuspendLambda implements Function2<o00O0O0O<Object>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35569OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Job f35570OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f35571OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<o00O0O0O<Object>, Continuation<? super Unit>, Object> f35572OooO0oO;

    public static final class OooO00o extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O0O<Object> f35573OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0O0O<Object> o00o0o0o2) {
            super(1);
            this.f35573OooO0Oo = o00o0o0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            SendChannel.DefaultImpls.close$default(this.f35573OooO0Oo, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0Oo0oo(Job job, Function2<? super o00O0O0O<Object>, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super o0Oo0oo> continuation) {
        super(2, continuation);
        this.f35570OooO0o = job;
        this.f35572OooO0oO = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(this.f35570OooO0o, this.f35572OooO0oO, continuation);
        o0oo0oo2.f35571OooO0o0 = obj;
        return o0oo0oo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00O0O0O<Object> o00o0o0o2, Continuation<? super Unit> continuation) {
        return ((o0Oo0oo) create(o00o0o0o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35569OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O0O0O<Object> o00o0o0o2 = (o00O0O0O) this.f35571OooO0o0;
            this.f35570OooO0o.invokeOnCompletion(new OooO00o(o00o0o0o2));
            this.f35569OooO0Oo = 1;
            if (this.f35572OooO0oO.invoke(o00o0o0o2, this) == coroutine_suspended) {
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
