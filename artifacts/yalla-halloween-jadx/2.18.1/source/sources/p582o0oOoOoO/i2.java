package p582o0oOoOoO;

import com.yalla.yalla.common.db.table.ConversationWithUser;
import com.yalla.yalla.ui.fragment.MessageBoxFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0O0ooO;
import p563o0oOo0.Oooo0;
import p596o0oo0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.fragment.MessageBoxFragment$initObserver$5", f = "MessageBoxFragment.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
public final class i2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f46859Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f46860Oooo0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.MessageBoxFragment$initObserver$5$1", f = "MessageBoxFragment.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0O0ooO<ConversationWithUser>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f46861Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f46862Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MessageBoxFragment f46863Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MessageBoxFragment messageBoxFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f46863Oooo0oo = messageBoxFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f46863Oooo0oo, continuation);
            oooO00o.f46862Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0O0ooO<ConversationWithUser> o0o0ooo, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f46861Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O0ooO o0o0ooo = (o0O0ooO) this.f46862Oooo0oO;
                Oooo0 oooo0 = this.f46863Oooo0oo.f24014OoooOOo;
                if (oooo0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
                    oooo0 = null;
                }
                this.f46861Oooo0o = 1;
                if (oooo0.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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
    public i2(MessageBoxFragment messageBoxFragment, Continuation<? super i2> continuation) {
        super(2, continuation);
        this.f46860Oooo0oO = messageBoxFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new i2(this.f46860Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((i2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46859Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<o0O0ooO<ConversationWithUser>> flowOooO0O0 = ((OooOOO0) this.f46860Oooo0oO.f24017o000oOoO.getValue()).OooO0O0();
            OooO00o oooO00o = new OooO00o(this.f46860Oooo0oO, null);
            this.f46859Oooo0o = 1;
            if (FlowKt.collectLatest(flowOooO0O0, oooO00o, this) == coroutine_suspended) {
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
