package p536o0o0OOoo;

import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.ui.activity.message.AtFriendsActivity;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o0O0ooO;
import p563o0oOo0.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$initData$1", f = "AtFriendsActivity.kt", i = {}, l = {Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED}, m = "invokeSuspend", n = {}, s = {})
public final class Oo0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43741Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f43742Oooo0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$initData$1$1", f = "AtFriendsActivity.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0O0ooO<FriendInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f43743Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f43744Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ AtFriendsActivity f43745Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AtFriendsActivity atFriendsActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f43745Oooo0oo = atFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f43745Oooo0oo, continuation);
            oooO00o.f43744Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0O0ooO<FriendInfo> o0o0ooo, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0o0ooo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f43743Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O0ooO o0o0ooo = (o0O0ooO) this.f43744Oooo0oO;
                OooOo oooOo = this.f43745Oooo0oo.f22133OooooOO;
                if (oooOo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                    oooOo = null;
                }
                this.f43743Oooo0o = 1;
                if (oooOo.OooO0O0(o0o0ooo, this) == coroutine_suspended) {
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
    public Oo0000(AtFriendsActivity atFriendsActivity, Continuation<? super Oo0000> continuation) {
        super(2, continuation);
        this.f43742Oooo0oO = atFriendsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oo0000(this.f43742Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oo0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43741Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<o0O0ooO<FriendInfo>> recentFriends = AtFriendsActivity.OooOoo(this.f43742Oooo0oO).getRecentFriends();
            OooO00o oooO00o = new OooO00o(this.f43742Oooo0oO, null);
            this.f43741Oooo0o = 1;
            if (FlowKt.collectLatest(recentFriends, oooO00o, this) == coroutine_suspended) {
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
