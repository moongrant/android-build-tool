package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.model.FriendCheckModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo0.OooOO0;
import p407o0Oo0Oo.o00;
import p408o0Oo0Oo0.o00Oo0;
import p412o0Oo0o0O.o000OO00;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R+\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR+\u0010 \u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/FriendRequestDetailVM;", "Lo0Oo0/OooOO0;", "", "targetUserId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/yalla/yalla/data/db/table/FriendRequestMessage;", "getMessageByTargetUserId", "targetId", "", "checkIsFriendAndBlock", "", "black", "", "state", "Landroidx/lifecycle/LiveData;", "blockUser", NewFriendsOld.State_Agree, "applyFriendRequest", "expiration", "J", "messageFlow", "Lkotlinx/coroutines/flow/Flow;", "<set-?>", "isBlack$delegate", "Landroidx/compose/runtime/MutableState;", "isBlack", "()Z", "setBlack", "(Z)V", "haveRejectOperation$delegate", "getHaveRejectOperation", "setHaveRejectOperation", "haveRejectOperation", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFriendRequestDetailVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRequestDetailVM.kt\ncom/yalla/yalla/ui/vm/message/FriendRequestDetailVM\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,70:1\n47#2:71\n49#2:75\n50#3:72\n55#3:74\n106#4:73\n81#5:76\n107#5,2:77\n81#5:79\n107#5,2:80\n*S KotlinDebug\n*F\n+ 1 FriendRequestDetailVM.kt\ncom/yalla/yalla/ui/vm/message/FriendRequestDetailVM\n*L\n26#1:71\n26#1:75\n26#1:72\n26#1:74\n26#1:73\n38#1:76\n38#1:77,2\n63#1:79\n63#1:80,2\n*E\n"})
public final class FriendRequestDetailVM extends OooOO0 {
    public static final int $stable = 8;
    private final long expiration = 2592000000L;

    /* JADX INFO: renamed from: haveRejectOperation$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState haveRejectOperation;

    /* JADX INFO: renamed from: isBlack$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isBlack;

    @Nullable
    private Flow<FriendRequestMessage> messageFlow;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestDetailVM$applyFriendRequest$1", f = "FriendRequestDetailVM.kt", i = {0}, l = {66, 68}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31370OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31371OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31372OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31373OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestDetailVM f31374OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, long j, FriendRequestDetailVM friendRequestDetailVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31371OooO0o = z;
            this.f31373OooO0oO = j;
            this.f31374OooO0oo = friendRequestDetailVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f31371OooO0o, this.f31373OooO0oO, this.f31374OooO0oo, continuation);
            oooO00o.f31372OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31370OooO0Oo;
            boolean z = this.f31371OooO0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31372OooO0o0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f31372OooO0o0;
            o000OO00 o000oo01 = o000OO00.f46018OooO00o;
            this.f31372OooO0o0 = liveDataScope;
            this.f31370OooO0Oo = 1;
            obj = o000oo01.OooO0o0(this.f31373OooO0oO, z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (zBooleanValue && !z) {
                this.f31374OooO0oo.setHaveRejectOperation(true);
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
            this.f31372OooO0o0 = null;
            this.f31370OooO0Oo = 2;
            if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestDetailVM$blockUser$1", f = "FriendRequestDetailVM.kt", i = {0, 1}, l = {48, 49, 54}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync"}, s = {"L$0", "L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31375OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31376OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31377OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31378OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ FriendRequestDetailVM f31379OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, long j, FriendRequestDetailVM friendRequestDetailVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31376OooO0o = z;
            this.f31378OooO0oO = j;
            this.f31379OooO0oo = friendRequestDetailVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31376OooO0o, this.f31378OooO0oO, this.f31379OooO0oo, continuation);
            oooO0O0.f31377OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0062  */
        /* JADX WARN: Code duplicated, block: B:25:0x0069  */
        /* JADX WARN: Code duplicated, block: B:28:0x0085 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            boolean zBooleanValue;
            Boolean boolBoxBoolean;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31375OooO0Oo;
            long j = this.f31378OooO0oO;
            boolean z = this.f31376OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f31377OooO0o0;
                o000OO00 o000oo01 = o000OO00.f46018OooO00o;
                if (z) {
                    this.f31377OooO0o0 = liveDataScope;
                    this.f31375OooO0Oo = 1;
                    obj = o000oo01.OooO0oo(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (zBooleanValue) {
                        this.f31379OooO0oo.setBlack(z);
                        if (z) {
                            LiveEventBus.get("USER_ADD_BLACKLISTED").post(Boxing.boxLong(j));
                        }
                    }
                    boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                    this.f31377OooO0o0 = null;
                    this.f31375OooO0Oo = 3;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.f31377OooO0o0 = liveDataScope;
                    this.f31375OooO0Oo = 2;
                    obj = o000oo01.OooO(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (zBooleanValue) {
                        this.f31379OooO0oo.setBlack(z);
                        if (z) {
                            LiveEventBus.get("USER_ADD_BLACKLISTED").post(Boxing.boxLong(j));
                        }
                    }
                    boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                    this.f31377OooO0o0 = null;
                    this.f31375OooO0Oo = 3;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                liveDataScope = (LiveDataScope) this.f31377OooO0o0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    this.f31379OooO0oo.setBlack(z);
                    if (z) {
                        LiveEventBus.get("USER_ADD_BLACKLISTED").post(Boxing.boxLong(j));
                    }
                }
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                this.f31377OooO0o0 = null;
                this.f31375OooO0Oo = 3;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                liveDataScope = (LiveDataScope) this.f31377OooO0o0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    this.f31379OooO0oo.setBlack(z);
                    if (z) {
                        LiveEventBus.get("USER_ADD_BLACKLISTED").post(Boxing.boxLong(j));
                    }
                }
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                this.f31377OooO0o0 = null;
                this.f31375OooO0Oo = 3;
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestDetailVM$checkIsFriendAndBlock$1", f = "FriendRequestDetailVM.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public FriendRequestDetailVM f31380OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31382OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31383OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31383OooO0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FriendRequestDetailVM.this.new OooO0OO(this.f31383OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FriendRequestDetailVM friendRequestDetailVM;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31382OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FriendRequestDetailVM friendRequestDetailVM2 = FriendRequestDetailVM.this;
                this.f31380OooO0Oo = friendRequestDetailVM2;
                this.f31382OooO0o0 = 1;
                Object objOooO0o = o000OO00.f46018OooO00o.OooO0o(this.f31383OooO0oO, this);
                if (objOooO0o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                friendRequestDetailVM = friendRequestDetailVM2;
                obj = objOooO0o;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                friendRequestDetailVM = this.f31380OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            friendRequestDetailVM.setBlack(((FriendCheckModel) obj).isBlack);
            return Unit.INSTANCE;
        }
    }

    public FriendRequestDetailVM() {
        Boolean bool = Boolean.FALSE;
        this.isBlack = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.haveRejectOperation = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @NotNull
    public final LiveData<Boolean> applyFriendRequest(boolean agree, long targetUserId) {
        return o00oO0o.OooO00o(new OooO00o(agree, targetUserId, this, null));
    }

    @NotNull
    public final LiveData<Boolean> blockUser(long targetUserId, boolean black, int state) {
        return o00oO0o.OooO00o(new OooO0O0(black, targetUserId, this, null));
    }

    public final void checkIsFriendAndBlock(long targetId) {
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0OO(targetId, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHaveRejectOperation() {
        return ((Boolean) this.haveRejectOperation.getValue()).booleanValue();
    }

    @NotNull
    public final Flow<FriendRequestMessage> getMessageByTargetUserId(long targetUserId) {
        if (this.messageFlow == null) {
            o00 o00VarOooOo00 = o00Oo0.OooO00o().OooOo00();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            final Flow<FriendRequestMessage> flowOooO = o00VarOooOo00.OooO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetUserId);
            this.messageFlow = new Flow<FriendRequestMessage>() { // from class: com.yalla.yalla.ui.vm.message.FriendRequestDetailVM$getMessageByTargetUserId$$inlined$map$1

                /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.message.FriendRequestDetailVM$getMessageByTargetUserId$$inlined$map$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FriendRequestDetailVM.kt\ncom/yalla/yalla/ui/vm/message/FriendRequestDetailVM\n*L\n1#1,222:1\n48#2:223\n27#3,6:224\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f31386OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public final /* synthetic */ FriendRequestDetailVM f31387OooO0o0;

                    /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.message.FriendRequestDetailVM$getMessageByTargetUserId$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestDetailVM$getMessageByTargetUserId$$inlined$map$1$2", f = "FriendRequestDetailVM.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                        public /* synthetic */ Object f31388OooO0Oo;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public int f31390OooO0o0;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f31388OooO0Oo = obj;
                            this.f31390OooO0o0 |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, FriendRequestDetailVM friendRequestDetailVM) {
                        this.f31386OooO0Oo = flowCollector;
                        this.f31387OooO0o0 = friendRequestDetailVM;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.f31390OooO0o0;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f31390OooO0o0 = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f31388OooO0Oo;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.f31390OooO0o0;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FriendRequestMessage friendRequestMessage = (FriendRequestMessage) obj;
                            if (friendRequestMessage == null) {
                                friendRequestMessage = null;
                            } else if (friendRequestMessage.getState() == 0) {
                                friendRequestMessage.setState(System.currentTimeMillis() - friendRequestMessage.getTime() < this.f31387OooO0o0.expiration ? 0 : 3);
                            }
                            anonymousClass1.f31390OooO0o0 = 1;
                            if (this.f31386OooO0Oo.emit(friendRequestMessage, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public final Object collect(@NotNull FlowCollector<? super FriendRequestMessage> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowOooO.collect(new AnonymousClass2(flowCollector, this), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }
        Flow<FriendRequestMessage> flow = this.messageFlow;
        Intrinsics.checkNotNull(flow);
        return flow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isBlack() {
        return ((Boolean) this.isBlack.getValue()).booleanValue();
    }

    public final void setBlack(boolean z) {
        this.isBlack.setValue(Boolean.valueOf(z));
    }

    public final void setHaveRejectOperation(boolean z) {
        this.haveRejectOperation.setValue(Boolean.valueOf(z));
    }
}
