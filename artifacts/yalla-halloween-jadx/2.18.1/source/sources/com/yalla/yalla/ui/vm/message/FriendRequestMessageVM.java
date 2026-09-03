package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o000OO;
import p089o000o000.o000OO00;
import p089o000o000.o000OOo0;
import p089o000o000.o00O0000;
import p089o000o000.o0O0ooO;
import p089o000o000.oo0oOO0;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\bR'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/FriendRequestMessageVM;", "Lo00OO/OooO00o;", "", NewFriendsOld.State_Agree, "", "targetUserId", "Landroidx/lifecycle/MutableLiveData;", "applyFriendRequest", "", "clearMessage", "deleteMessage", "updateAllMessageStateRead", "Lkotlinx/coroutines/flow/Flow;", "Lo000o000/o0O0ooO;", "Lcom/yalla/yalla/common/db/table/FriendRequestMessage;", "messagePagingSource$delegate", "Lkotlin/Lazy;", "getMessagePagingSource", "()Lkotlinx/coroutines/flow/Flow;", "messagePagingSource", "Landroidx/lifecycle/LiveData;", "", "messageCount", "Landroidx/lifecycle/LiveData;", "getMessageCount", "()Landroidx/lifecycle/LiveData;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class FriendRequestMessageVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: messagePagingSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messagePagingSource = LazyKt.lazy(new OooO0OO());

    @NotNull
    private final LiveData<Integer> messageCount = FlowLiveDataConversions.asLiveData$default(p491o0o00O00.OooO0OO.OooO00o().OooOo0().OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), (CoroutineContext) null, 0, 3, (Object) null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestMessageVM$clearMessage$1", f = "FriendRequestMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p491o0o00O00.OooO0OO.OooO00o().OooOo0().OooO0OO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestMessageVM$deleteMessage$1", f = "FriendRequestMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ long f25599Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25599Oooo0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25599Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p491o0o00O00.OooO0OO.OooO00o().OooOo0().OooO0o0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), this.f25599Oooo0o);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Flow<? extends o0O0ooO<FriendRequestMessage>>> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Flow<? extends o0O0ooO<FriendRequestMessage>> invoke() {
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(FriendRequestMessageVM.this);
            com.yalla.yalla.ui.vm.message.OooO00o pagingSourceFactory = com.yalla.yalla.ui.vm.message.OooO00o.f25611Oooo0o;
            Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
            Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
            o00O0000 config = new o00O0000(20, 5, false, 0, 56);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
            return FlowKt.debounce(p089o000o000.OooOOO.OooO00o(new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o, ViewModelKt.getViewModelScope(FriendRequestMessageVM.this)), 4L);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestMessageVM$updateAllMessageStateRead$1", f = "FriendRequestMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p491o0o00O00.OooO0OO.OooO00o().OooOo0().OooO0O0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> applyFriendRequest(boolean agree, long targetUserId) {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0ooOOo(targetUserId, agree, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    public final void clearMessage() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(null), 2, null);
    }

    public final void deleteMessage(long targetUserId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(targetUserId, null), 2, null);
    }

    @NotNull
    public final LiveData<Integer> getMessageCount() {
        return this.messageCount;
    }

    @NotNull
    public final Flow<o0O0ooO<FriendRequestMessage>> getMessagePagingSource() {
        return (Flow) this.messagePagingSource.getValue();
    }

    public final void updateAllMessageStateRead() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(null), 2, null);
    }
}
