package com.yalla.yalla.ui.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.model.FriendCheckModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.o000OO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/vm/UserBlackVM;", "Lo0Oo0/OooOO0;", "", "targetUserId", "", ReportItem.LogTypeBlock, "Landroidx/lifecycle/LiveData;", "blockUser", "targetId", "", "checkIsFriendAndBlock", "Lcom/yalla/yalla/model/FriendCheckModel;", "mFriendCheckModel", "Lcom/yalla/yalla/model/FriendCheckModel;", "getMFriendCheckModel", "()Lcom/yalla/yalla/model/FriendCheckModel;", "setMFriendCheckModel", "(Lcom/yalla/yalla/model/FriendCheckModel;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class UserBlackVM extends OooOO0 {
    public static final int $stable = 8;

    @Nullable
    private FriendCheckModel mFriendCheckModel;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.UserBlackVM$blockUser$1", f = "UserBlackVM.kt", i = {0, 1}, l = {17, 18, 19}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync"}, s = {"L$0", "L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30971OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f30972OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30973OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f30974OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f30972OooO0o = z;
            this.f30974OooO0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f30974OooO0oO, this.f30972OooO0o, continuation);
            oooO00o.f30973OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x006f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            boolean zBooleanValue;
            Boolean boolBoxBoolean;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30971OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f30973OooO0o0;
                boolean z = this.f30972OooO0o;
                long j = this.f30974OooO0oO;
                o000OO00 o000oo01 = o000OO00.f46018OooO00o;
                if (z) {
                    this.f30973OooO0o0 = liveDataScope;
                    this.f30971OooO0Oo = 1;
                    obj = o000oo01.OooO0oo(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                    this.f30973OooO0o0 = null;
                    this.f30971OooO0Oo = 3;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.f30973OooO0o0 = liveDataScope;
                    this.f30971OooO0Oo = 2;
                    obj = o000oo01.OooO(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                    this.f30973OooO0o0 = null;
                    this.f30971OooO0Oo = 3;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                liveDataScope = (LiveDataScope) this.f30973OooO0o0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                this.f30973OooO0o0 = null;
                this.f30971OooO0Oo = 3;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                liveDataScope = (LiveDataScope) this.f30973OooO0o0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                this.f30973OooO0o0 = null;
                this.f30971OooO0Oo = 3;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.UserBlackVM$checkIsFriendAndBlock$1", f = "UserBlackVM.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public UserBlackVM f30975OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f30977OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f30978OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f30978OooO0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return UserBlackVM.this.new OooO0O0(this.f30978OooO0oO, continuation);
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
            int i = this.f30977OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserBlackVM userBlackVM2 = UserBlackVM.this;
                this.f30975OooO0Oo = userBlackVM2;
                this.f30977OooO0o0 = 1;
                Object objOooO0o = o000OO00.f46018OooO00o.OooO0o(this.f30978OooO0oO, this);
                if (objOooO0o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                userBlackVM = userBlackVM2;
                obj = objOooO0o;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                userBlackVM = this.f30975OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            userBlackVM.setMFriendCheckModel((FriendCheckModel) obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<Boolean> blockUser(long targetUserId, boolean block) {
        return o00oO0o.OooO00o(new OooO00o(targetUserId, block, null));
    }

    public final void checkIsFriendAndBlock(long targetId) {
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0O0(targetId, null));
    }

    @Nullable
    public final FriendCheckModel getMFriendCheckModel() {
        return this.mFriendCheckModel;
    }

    public final void setMFriendCheckModel(@Nullable FriendCheckModel friendCheckModel) {
        this.mFriendCheckModel = friendCheckModel;
    }
}
