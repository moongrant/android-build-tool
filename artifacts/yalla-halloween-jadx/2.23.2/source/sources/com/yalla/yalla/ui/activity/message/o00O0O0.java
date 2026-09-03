package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.FriendInfo;
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
@DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$initData$1", f = "ShareToFriendsActivity.kt", i = {}, l = {853}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f25434OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShareToFriendsActivity f25435OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.ShareToFriendsActivity$initData$1$1", f = "ShareToFriendsActivity.kt", i = {}, l = {854}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<androidx.paging.o0OOO0o<FriendInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25436OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ShareToFriendsActivity f25437OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f25438OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ShareToFriendsActivity shareToFriendsActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25437OooO0o = shareToFriendsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25437OooO0o, continuation);
            oooO00o.f25438OooO0o0 = obj;
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
            int i = this.f25436OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                androidx.paging.o0OOO0o o0ooo0o2 = (androidx.paging.o0OOO0o) this.f25438OooO0o0;
                com.yalla.yalla.ui.adapter.o000OOo0 o000ooo1 = this.f25437OooO0o.f25282OooOoO;
                if (o000ooo1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("recentFriendAdapter");
                    o000ooo1 = null;
                }
                this.f25436OooO0Oo = 1;
                if (o000ooo1.OooO0OO(o0ooo0o2, this) == coroutine_suspended) {
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
    public o00O0O0(ShareToFriendsActivity shareToFriendsActivity, Continuation<? super o00O0O0> continuation) {
        super(2, continuation);
        this.f25435OooO0o0 = shareToFriendsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O0(this.f25435OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f25434OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = ShareToFriendsActivity.f25275Oooo00o;
            ShareToFriendsActivity shareToFriendsActivity = this.f25435OooO0o0;
            Flow<androidx.paging.o0OOO0o<FriendInfo>> recentFriends = shareToFriendsActivity.OooOoOO().getRecentFriends();
            OooO00o oooO00o = new OooO00o(shareToFriendsActivity, null);
            this.f25434OooO0Oo = 1;
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
