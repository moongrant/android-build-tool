package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.CheckUserInRoomModel;
import com.yalla.yalla.model.FriendInRoomModel;
import com.yalla.yalla.model.InRoomUserId;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o000OO;
import p089o000o000.o000OO00;
import p089o000o000.o000OOo0;
import p089o000o000.o00O0000;
import p089o000o000.o00O00o0;
import p089o000o000.o0O0ooO;
import p089o000o000.oo0oOO0;
import p254o00ooO0O.o0000O0O;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o00O0O;
import p520o0o0O0O0.oo0O;
import p527o0o0OO0.OooOOOO;
import p527o0o0OO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\t2\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\tJ\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\t2\u0006\u0010\u0015\u001a\u00020\u000e¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/FriendListVM;", "Lo00OO/OooO00o;", "Lkotlinx/coroutines/flow/Flow;", "Lo000o000/o0O0ooO;", "Lcom/yalla/yalla/common/db/table/FriendInfo;", "loadFriendInfoList", "", "searchText", "searchFriendAsFlow", "Landroidx/lifecycle/LiveData;", "", "searchFriend", "", "loadFriendCount", "", "friendId", "", "updateInRoomState", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/FriendInRoomModel;", "loadFriendInRoomList", "userId", "Lcom/yalla/yalla/common/model/CheckUserInRoomModel;", "loadUserInRoomInfo", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class FriendListVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    public static final class OooO extends Lambda implements Function0<o00O00o0<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f25589Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str) {
            super(0);
            this.f25589Oooo0o = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, FriendInfo> invoke() {
            String searchText = this.f25589Oooo0o;
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            return p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOOo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), searchText);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendListVM$loadFriendInRoomList$1", f = "FriendListVM.kt", i = {0}, l = {35, 43}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FriendInRoomModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25590Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25591Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f25591Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<FriendInRoomModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            List<InRoomUserId> data;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25590Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25591Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25591Oooo0oO;
            o00O0O o00o0o2 = o00O0O.f42677OooO00o;
            this.f25591Oooo0oO = liveDataScope;
            this.f25590Oooo0o = 1;
            obj = o00o0o2.OooO0Oo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            FriendInRoomModel friendInRoomModel = (FriendInRoomModel) apiResult.getData();
            boolean z = friendInRoomModel != null && friendInRoomModel.getIsreset();
            if (!(OooOo00.f43129OooO0OO != null)) {
                OooOo00.f43129OooO0OO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooOOOO(z, null), 2, null);
            }
            if (apiResult.isSuccess()) {
                p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0OO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
                FriendInRoomModel friendInRoomModel2 = (FriendInRoomModel) apiResult.getData();
                if (friendInRoomModel2 != null && (data = friendInRoomModel2.getData()) != null) {
                    Iterator<T> it = data.iterator();
                    while (it.hasNext()) {
                        p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), ((InRoomUserId) it.next()).getUserId(), true);
                    }
                }
            }
            this.f25591Oooo0oO = null;
            this.f25590Oooo0o = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00O00o0<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f25592Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, FriendInfo> invoke() {
            return p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0o0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendListVM$loadUserInRoomInfo$1", f = "FriendListVM.kt", i = {}, l = {47, 47}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<CheckUserInRoomModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25593Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25594Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f25595Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25595Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25595Oooo0oo, continuation);
            oooO0OO.f25594Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<CheckUserInRoomModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25593Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25594Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25594Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            long j = this.f25595Oooo0oo;
            this.f25594Oooo0oO = liveDataScope;
            this.f25593Oooo0o = 1;
            obj = oo0o.OooOO0(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25594Oooo0oO = null;
            this.f25593Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendListVM$searchFriend$1", f = "FriendListVM.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<List<FriendInfo>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25596Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25597Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25598Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25598Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f25598Oooo0oo, continuation);
            oooO0o.f25597Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<List<FriendInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25596Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.f25597Oooo0oO;
                String searchText = this.f25598Oooo0oo;
                Intrinsics.checkNotNullParameter(searchText, "searchText");
                List<FriendInfo> listOooOO0 = p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOO0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), searchText);
                this.f25596Oooo0o = 1;
                if (liveDataScope.emit(listOooOO0, this) == coroutine_suspended) {
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

    @NotNull
    public final LiveData<Integer> loadFriendCount() {
        return FlowLiveDataConversions.asLiveData$default(p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOO0O(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    @NotNull
    public final LiveData<ApiResult<FriendInRoomModel>> loadFriendInRoomList() {
        return o0000O0O.OooO00o(new OooO00o(null));
    }

    @NotNull
    public final Flow<o0O0ooO<FriendInfo>> loadFriendInfoList() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0O0 pagingSourceFactory = OooO0O0.f25592Oooo0o;
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o;
    }

    @NotNull
    public final LiveData<ApiResult<CheckUserInRoomModel>> loadUserInRoomInfo(long userId) {
        return o0000O0O.OooO00o(new OooO0OO(userId, null));
    }

    @NotNull
    public final LiveData<List<FriendInfo>> searchFriend(@NotNull String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        return o0000O0O.OooO00o(new OooO0o(searchText, null));
    }

    @NotNull
    public final Flow<o0O0ooO<FriendInfo>> searchFriendAsFlow(@NotNull String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO pagingSourceFactory = new OooO(searchText);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o;
    }

    public final void updateInRoomState(long friendId) {
        p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), friendId, false);
    }
}
