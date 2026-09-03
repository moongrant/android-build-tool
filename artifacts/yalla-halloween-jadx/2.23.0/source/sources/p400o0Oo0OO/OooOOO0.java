package p400o0Oo0OO;

import androidx.paging.o0OOO0o;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.base.paging.BasePagingAdapter$setPagerSource$1", f = "BasePagingAdapter.kt", i = {}, l = {Constants.ERR_MODULE_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44453OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O<Object> f44454OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0o<Object, Object> f44455OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.base.paging.BasePagingAdapter$setPagerSource$1$1", f = "BasePagingAdapter.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OOO0o<Object>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f44456OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O<Object> f44457OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f44458OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOO0O<Object> oooOO0O, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f44457OooO0o = oooOO0O;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f44457OooO0o, continuation);
            oooO00o.f44458OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OOO0o<Object> o0ooo0o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f44456OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OOO0o<Object> o0ooo0o2 = (o0OOO0o) this.f44458OooO0o0;
                this.f44456OooO0Oo = 1;
                if (this.f44457OooO0o.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooO0o<Object, Object> oooO0o, OooOO0O<Object> oooOO0O, Continuation<? super OooOOO0> continuation) {
        super(2, continuation);
        this.f44455OooO0o0 = oooO0o;
        this.f44454OooO0o = oooOO0O;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOO0(this.f44455OooO0o0, this.f44454OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44453OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow sharedFlow = this.f44455OooO0o0.f37677OooO0O0;
            OooO00o oooO00o = new OooO00o(this.f44454OooO0o, null);
            this.f44453OooO0Oo = 1;
            if (FlowKt.collectLatest(sharedFlow, oooO00o, this) == coroutine_suspended) {
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
