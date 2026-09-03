package p536o0o0OOoo;

import com.yalla.yalla.common.db.table.FriendRequestMessage;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
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
import p563o0oOo0.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity$initData$1", f = "FriendRequestMessageActivity.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
public final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43784Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f43785Oooo0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity$initData$1$1", f = "FriendRequestMessageActivity.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0O0ooO<FriendRequestMessage>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f43786Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f43787Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestMessageActivity f43788Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FriendRequestMessageActivity friendRequestMessageActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43788Oooo0oo = friendRequestMessageActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f43788Oooo0oo, continuation);
            oooO00o.f43787Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0O0ooO<FriendRequestMessage> o0o0ooo, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f43786Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O0ooO o0o0ooo = (o0O0ooO) this.f43787Oooo0oO;
                o000OOo o000ooo2 = this.f43788Oooo0oo.f22161OooooO0;
                if (o000ooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    o000ooo2 = null;
                }
                this.f43786Oooo0o = 1;
                if (o000ooo2.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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
    public g(FriendRequestMessageActivity friendRequestMessageActivity, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f43785Oooo0oO = friendRequestMessageActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new g(this.f43785Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43784Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FriendRequestMessageActivity friendRequestMessageActivity = this.f43785Oooo0oO;
            FriendRequestMessageActivity.OooO00o oooO00o = FriendRequestMessageActivity.f22157OooooOO;
            Flow<o0O0ooO<FriendRequestMessage>> messagePagingSource = friendRequestMessageActivity.OooOooo().getMessagePagingSource();
            OooO00o oooO00o2 = new OooO00o(this.f43785Oooo0oO, null);
            this.f43784Oooo0o = 1;
            if (FlowKt.collectLatest(messagePagingSource, oooO00o2, this) == coroutine_suspended) {
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
