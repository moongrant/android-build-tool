package p529o0o0OOO0;

import androidx.paging.o0OOO0o;
import com.yalla.yalla.data.db.table.ConversationWithUser;
import com.yalla.yalla.ui.adapter.OooO0OO;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p582o0oOoo0.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.fragment.message.MessageBoxFragment$initObserver$5", f = "MessageBoxFragment.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
public final class o00000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f53372OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f53373OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.message.MessageBoxFragment$initObserver$5$1", f = "MessageBoxFragment.kt", i = {}, l = {Constants.ERR_ALREADY_IN_RECORDING}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OOO0o<ConversationWithUser>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f53374OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MessageBoxFragment f53375OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f53376OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MessageBoxFragment messageBoxFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f53375OooO0o = messageBoxFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f53375OooO0o, continuation);
            oooO00o.f53376OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OOO0o<ConversationWithUser> o0ooo0o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53374OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OOO0o o0ooo0o2 = (o0OOO0o) this.f53376OooO0o0;
                OooO0OO oooO0OO = this.f53375OooO0o.f27999OooOOo0;
                if (oooO0OO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterMessageChat");
                    oooO0OO = null;
                }
                this.f53374OooO0Oo = 1;
                if (oooO0OO.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
    public o00000O(MessageBoxFragment messageBoxFragment, Continuation<? super o00000O> continuation) {
        super(2, continuation);
        this.f53373OooO0o0 = messageBoxFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000O(this.f53373OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f53372OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MessageBoxFragment messageBoxFragment = this.f53373OooO0o0;
            SharedFlow sharedFlowOooO0O0 = ((o0000O0O) messageBoxFragment.f27996OooOOOO.getValue()).OooO0O0();
            OooO00o oooO00o = new OooO00o(messageBoxFragment, null);
            this.f53372OooO0Oo = 1;
            if (FlowKt.collectLatest(sharedFlowOooO0O0, oooO00o, this) == coroutine_suspended) {
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
