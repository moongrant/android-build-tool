package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.ui.vm.message.AfFriendVM;
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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$initData$1", f = "AtFriendsActivity.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_INTERNAL_SERVER_ERROR}, m = "invokeSuspend", n = {}, s = {})
public final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f25660OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AtFriendsActivity f25661OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.AtFriendsActivity$initData$1$1", f = "AtFriendsActivity.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25662OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ AtFriendsActivity f25663OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f25664OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AtFriendsActivity atFriendsActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25663OooO0o = atFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25663OooO0o, continuation);
            oooO00o.f25664OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(androidx.paging.o0OOO0o<FriendInfo> o0ooo0o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0ooo0o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25662OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25664OooO0o0;
                com.yalla.yalla.ui.adapter.OooO00o oooO00o = this.f25663OooO0o.f25626OooOo0o;
                if (oooO00o == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                    oooO00o = null;
                }
                this.f25662OooO0Oo = 1;
                if (oooO00o.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
    public OooO(AtFriendsActivity atFriendsActivity, Continuation<? super OooO> continuation) {
        super(2, continuation);
        this.f25661OooO0o0 = atFriendsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO(this.f25661OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f25660OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AtFriendsActivity atFriendsActivity = this.f25661OooO0o0;
            Flow<androidx.paging.o0OOO0o<FriendInfo>> recentFriends = ((AfFriendVM) atFriendsActivity.f25624OooOo00.getValue()).getRecentFriends();
            OooO00o oooO00o = new OooO00o(atFriendsActivity, null);
            this.f25660OooO0Oo = 1;
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
