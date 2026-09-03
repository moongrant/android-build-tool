package p643o0ooOOOO;

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
import p188o00o00oO.o000O0o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.base.paging.BasePagingAdapter$setPagerSource$1", f = "BasePagingAdapter.kt", i = {}, l = {Constants.ERR_MODULE_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
public final class i3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f58012OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ h3<Object> f58013OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000O0o<Object, Object> f58014OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.base.paging.BasePagingAdapter$setPagerSource$1$1", f = "BasePagingAdapter.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OOO0o<Object>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f58015OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ h3<Object> f58016OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f58017OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(h3<Object> h3Var, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f58016OooO0o = h3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f58016OooO0o, continuation);
            oooO00o.f58017OooO0o0 = obj;
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
            int i = this.f58015OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OOO0o<Object> o0ooo0o2 = (o0OOO0o) this.f58017OooO0o0;
                this.f58015OooO0Oo = 1;
                if (this.f58016OooO0o.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
    public i3(o000O0o<Object, Object> o000o0o2, h3<Object> h3Var, Continuation<? super i3> continuation) {
        super(2, continuation);
        this.f58014OooO0o0 = o000o0o2;
        this.f58013OooO0o = h3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new i3(this.f58014OooO0o0, this.f58013OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((i3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f58012OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow sharedFlow = this.f58014OooO0o0.f38511OooO0O0;
            OooO00o oooO00o = new OooO00o(this.f58013OooO0o, null);
            this.f58012OooO0Oo = 1;
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
