package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import androidx.paging.o0O0O00;
import androidx.paging.o0OOO0o;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.data.repository.UserInfoRepo$getUserInRoomInfo$$inlined$call$1;
import com.yalla.yalla.model.CheckUserInRoomModel;
import com.yalla.yalla.model.FriendInRoomModel;
import com.yalla.yalla.model.InRoomUserId;
import com.yalla.yalla.model.http.ApiResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O000;
import p101o000oo.o00O0OOO;
import p101o000oo.o00oOoo;
import p101o000oo.o0O0ooO;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p394o0Oo0.OooOO0;
import p407o0Oo0Oo.o000;
import p408o0Oo0Oo0.o00Oo0;
import p412o0Oo0o0O.o000O000;
import p475o0Ooooo0.o0O00oO0;
import p544o0o0o00O.o0O0OO0;
import p544o0o0o00O.o0O0OOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\tJ\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00100\t2\u0006\u0010\u0013\u001a\u00020\f¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/FriendListVM;", "Lo0Oo0/OooOO0;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/o0OOO0o;", "Lcom/yalla/yalla/data/db/table/FriendInfo;", "loadFriendInfoList", "", "searchText", "searchFriendAsFlow", "Landroidx/lifecycle/LiveData;", "", "loadFriendCount", "", "friendId", "", "updateInRoomState", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/FriendInRoomModel;", "loadFriendInRoomList", "userId", "Lcom/yalla/yalla/model/CheckUserInRoomModel;", "loadUserInRoomInfo", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class FriendListVM extends OooOO0 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendListVM$loadFriendInRoomList$1", f = "FriendListVM.kt", i = {0}, l = {30, 38}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nFriendListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendListVM.kt\ncom/yalla/yalla/ui/vm/message/FriendListVM$loadFriendInRoomList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1855#2,2:45\n*S KotlinDebug\n*F\n+ 1 FriendListVM.kt\ncom/yalla/yalla/ui/vm/message/FriendListVM$loadFriendInRoomList$1\n*L\n34#1:45,2\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FriendInRoomModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31363OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31364OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f31364OooO0o0 = obj;
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
            int i = this.f31363OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31364OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31364OooO0o0;
            o000O000 o000o001 = o000O000.f45978OooO00o;
            this.f31364OooO0o0 = liveDataScope;
            this.f31363OooO0Oo = 1;
            obj = o000o001.OooO0Oo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            FriendInRoomModel friendInRoomModel = (FriendInRoomModel) apiResult.getData();
            boolean z = friendInRoomModel != null && friendInRoomModel.getIsreset();
            if (!(o0O0OOO0.f55746OooO0OO != null)) {
                o0O0OOO0.f55746OooO0OO = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0O0OO0(z, null), 2, null);
            }
            if (apiResult.isSuccess()) {
                o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o000VarOooOOoo.OooO0O0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                FriendInRoomModel friendInRoomModel2 = (FriendInRoomModel) apiResult.getData();
                if (friendInRoomModel2 != null && (data = friendInRoomModel2.getData()) != null) {
                    Iterator<T> it = data.iterator();
                    while (it.hasNext()) {
                        long userId = ((InRoomUserId) it.next()).getUserId();
                        o000 o000VarOooOOoo2 = o00Oo0.OooO00o().OooOOoo();
                        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                        o000VarOooOOoo2.OooOOO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), userId, true);
                    }
                }
            }
            this.f31364OooO0o0 = null;
            this.f31363OooO0Oo = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f31365OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, FriendInfo> invoke() {
            o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return o000VarOooOOoo.OooOOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.FriendListVM$loadUserInRoomInfo$1", f = "FriendListVM.kt", i = {}, l = {42, 42}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<CheckUserInRoomModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31366OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31367OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31368OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31367OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f31367OooO0o, continuation);
            oooO0OO.f31368OooO0o0 = obj;
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
            int i = this.f31366OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31368OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31368OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f31368OooO0o0 = liveDataScope;
            this.f31366OooO0Oo = 1;
            userInfoRepo.getClass();
            String url = oo000o.OooO0OO("/Webservers/User/UserInBar");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(Boxing.boxLong(this.f31367OooO0o), "touserid");
            o0ooooo.OooO00o();
            obj = OooOOO.OooO0Oo(new UserInfoRepo$getUserInRoomInfo$$inlined$call$1(o0ooooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31368OooO0o0 = null;
            this.f31366OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f31369OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str) {
            super(0);
            this.f31369OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, FriendInfo> invoke() {
            String searchText = this.f31369OooO0Oo;
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return o000VarOooOOoo.OooOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), searchText);
        }
    }

    @NotNull
    public final LiveData<Integer> loadFriendCount() {
        o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return FlowLiveDataConversions.asLiveData$default(o000VarOooOOoo.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    @NotNull
    public final LiveData<ApiResult<FriendInRoomModel>> loadFriendInRoomList() {
        return o00oO0o.OooO00o(new OooO00o(null));
    }

    @NotNull
    public final Flow<o0OOO0o<FriendInfo>> loadFriendInfoList() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        OooO0O0 pagingSourceFactory = OooO0O0.f31365OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10273OooO0o, viewModelScope);
    }

    @NotNull
    public final LiveData<ApiResult<CheckUserInRoomModel>> loadUserInRoomInfo(long userId) {
        return o00oO0o.OooO00o(new OooO0OO(userId, null));
    }

    @NotNull
    public final Flow<o0OOO0o<FriendInfo>> searchFriendAsFlow(@NotNull String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0o pagingSourceFactory = new OooO0o(searchText);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10273OooO0o, viewModelScope);
    }

    public final void updateInRoomState(long friendId) {
        o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o000VarOooOOoo.OooOOO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), friendId, false);
    }
}
