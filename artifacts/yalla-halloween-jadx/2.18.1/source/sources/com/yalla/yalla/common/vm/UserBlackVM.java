package com.yalla.yalla.common.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.app.base.model.FriendCheckModel;
import com.qiniu.android.collect.ReportItem;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p520o0o0O0O0.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/common/vm/UserBlackVM;", "Lo00OO/OooO00o;", "", "targetUserId", "", ReportItem.LogTypeBlock, "Landroidx/lifecycle/LiveData;", "blockUser", "targetId", "", "checkIsFriendAndBlock", "Lcom/app/base/model/FriendCheckModel;", "mFriendCheckModel", "Lcom/app/base/model/FriendCheckModel;", "getMFriendCheckModel", "()Lcom/app/base/model/FriendCheckModel;", "setMFriendCheckModel", "(Lcom/app/base/model/FriendCheckModel;)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserBlackVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @Nullable
    private FriendCheckModel mFriendCheckModel;

    @DebugMetadata(c = "com.yalla.yalla.common.vm.UserBlackVM$blockUser$1", f = "UserBlackVM.kt", i = {}, l = {18, 18, 20, 20}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f21343Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21344Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21345Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21346Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21346Oooo0oo = z;
            this.f21343Oooo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f21346Oooo0oo, this.f21343Oooo, continuation);
            oooO00o.f21345Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0057 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0071 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21344Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f21345Oooo0oO;
                if (this.f21346Oooo0oo) {
                    o0OOO0o o0ooo0o2 = o0OOO0o.f42810OooO00o;
                    long j = this.f21343Oooo;
                    this.f21345Oooo0oO = liveDataScope;
                    this.f21344Oooo0o = 1;
                    obj = o0ooo0o2.OooO0o0(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f21345Oooo0oO = null;
                    this.f21344Oooo0o = 2;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    o0OOO0o o0ooo0o3 = o0OOO0o.f42810OooO00o;
                    long j2 = this.f21343Oooo;
                    this.f21345Oooo0oO = liveDataScope;
                    this.f21344Oooo0o = 3;
                    obj = o0ooo0o3.OooO0o(j2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f21345Oooo0oO = null;
                    this.f21344Oooo0o = 4;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        liveDataScope = (LiveDataScope) this.f21345Oooo0oO;
                        ResultKt.throwOnFailure(obj);
                        this.f21345Oooo0oO = null;
                        this.f21344Oooo0o = 4;
                        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                liveDataScope = (LiveDataScope) this.f21345Oooo0oO;
                ResultKt.throwOnFailure(obj);
                this.f21345Oooo0oO = null;
                this.f21344Oooo0o = 2;
                if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.UserBlackVM$checkIsFriendAndBlock$1", f = "UserBlackVM.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f21347Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public UserBlackVM f21348Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f21349Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f21347Oooo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserBlackVM.this.new OooO0O0(this.f21347Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UserBlackVM userBlackVM;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21349Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserBlackVM userBlackVM2 = UserBlackVM.this;
                long j = this.f21347Oooo;
                this.f21348Oooo0o = userBlackVM2;
                this.f21349Oooo0oO = 1;
                Object objOooO0OO = o0OOO0o.f42810OooO00o.OooO0OO(j, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                userBlackVM = userBlackVM2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                userBlackVM = this.f21348Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            userBlackVM.setMFriendCheckModel((FriendCheckModel) obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<Boolean> blockUser(long targetUserId, boolean block) {
        return o0000O0O.OooO00o(new OooO00o(block, targetUserId, null));
    }

    public final void checkIsFriendAndBlock(long targetId) {
        o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO0O0(targetId, null));
    }

    @Nullable
    public final FriendCheckModel getMFriendCheckModel() {
        return this.mFriendCheckModel;
    }

    public final void setMFriendCheckModel(@Nullable FriendCheckModel friendCheckModel) {
        this.mFriendCheckModel = friendCheckModel;
    }
}
