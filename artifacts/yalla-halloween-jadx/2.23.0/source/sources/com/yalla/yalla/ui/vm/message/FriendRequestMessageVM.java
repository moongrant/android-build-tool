package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import androidx.paging.o0OOO0o;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o000O00O.OooOOO;
import o000O00O.o000O000;
import o000O00O.o000O0o;
import o000O00O.o000Oo0;
import o000O00O.o00O000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo00oO.o0O0O00;
import p403o0Oo0OOo.o0O0O0o0;
import p406o0Oo0Ooo.ooooO0O0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/FriendRequestMessageVM;", "Lo0Oo00oO/o0O0O00;", "", NewFriendsOld.State_Agree, "", "targetUserId", "Landroidx/lifecycle/MutableLiveData;", "applyFriendRequest", "", "clearMessage", "deleteMessage", "updateAllMessageStateRead", "expiration", "J", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/o0OOO0o;", "Lcom/yalla/yalla/data/db/table/FriendRequestMessage;", "messagePagingSource$delegate", "Lkotlin/Lazy;", "getMessagePagingSource", "()Lkotlinx/coroutines/flow/Flow;", "messagePagingSource", "Lo00Oo000/OooO0o;", "", "messagePagingSource1", "Lo00Oo000/OooO0o;", "getMessagePagingSource1", "()Lo00Oo000/OooO0o;", "Landroidx/lifecycle/LiveData;", "messageCount", "Landroidx/lifecycle/LiveData;", "getMessageCount", "()Landroidx/lifecycle/LiveData;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFriendRequestMessageVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRequestMessageVM.kt\ncom/yalla/yalla/ui/vm/message/FriendRequestMessageVM\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,61:1\n47#2:62\n49#2:66\n50#3:63\n55#3:65\n106#4:64\n*S KotlinDebug\n*F\n+ 1 FriendRequestMessageVM.kt\ncom/yalla/yalla/ui/vm/message/FriendRequestMessageVM\n*L\n30#1:62\n30#1:66\n30#1:63\n30#1:65\n30#1:64\n*E\n"})
public final class FriendRequestMessageVM extends o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    private final LiveData<Integer> messageCount;
    private final long expiration = 2592000000L;

    /* JADX INFO: renamed from: messagePagingSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messagePagingSource = LazyKt.lazy(new OooO0OO());

    @NotNull
    private final p143o00Oo000.OooO0o<Integer, FriendRequestMessage> messagePagingSource1 = new p143o00Oo000.OooO0o<>(ViewModelKt.getViewModelScope(this), OooO0o.f31928OooO0Oo);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestMessageVM$updateAllMessageStateRead$1", f = "FriendRequestMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o0o0o0o0OooOOoo.OooO0Oo(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
            return Unit.INSTANCE;
        }
    }

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
            o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o0o0o0o0OooOOoo.OooO0o0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendRequestMessageVM$deleteMessage$1", f = "FriendRequestMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ long f31926OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31926OooO0Oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f31926OooO0Oo, continuation);
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
            o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o0o0o0o0OooOOoo.OooO0OO(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), this.f31926OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Flow<? extends o0OOO0o<FriendRequestMessage>>> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Flow<? extends o0OOO0o<FriendRequestMessage>> invoke() {
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(FriendRequestMessageVM.this);
            Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
            com.yalla.yalla.ui.vm.message.OooO00o pagingSourceFactory = com.yalla.yalla.ui.vm.message.OooO00o.f31941OooO0Oo;
            Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
            o000Oo0 config = new o000Oo0(20, 5, false, 20);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
            return FlowKt.debounce(OooOOO.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O000o ? new o000O000(pagingSourceFactory) : new o000O0o(pagingSourceFactory, null), null, config).f7179OooO0o, viewModelScope), 4L);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<androidx.paging.o0O0O00<Integer, FriendRequestMessage>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f31928OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final androidx.paging.o0O0O00<Integer, FriendRequestMessage> invoke() {
            o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return o0o0o0o0OooOOoo.OooO0oO(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
        }
    }

    public FriendRequestMessageVM() {
        o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.messageCount = FlowLiveDataConversions.asLiveData$default(o0o0o0o0OooOOoo.OooO0O0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final MutableLiveData<Boolean> applyFriendRequest(boolean agree, long targetUserId) {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new ooooO0O0(targetUserId, agree, mutableLiveData, null), 2, null);
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
    public final Flow<o0OOO0o<FriendRequestMessage>> getMessagePagingSource() {
        return (Flow) this.messagePagingSource.getValue();
    }

    @NotNull
    public final p143o00Oo000.OooO0o<Integer, FriendRequestMessage> getMessagePagingSource1() {
        return this.messagePagingSource1;
    }

    public final void updateAllMessageStateRead() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO(null), 2, null);
    }
}
