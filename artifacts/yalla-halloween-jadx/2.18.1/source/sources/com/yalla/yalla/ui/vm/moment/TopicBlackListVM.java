package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicBlackUserModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o0000O0O;
import p495o0o00OOO.Oooo0;
import p516o0o0O000.o000oOoO;
import p520o0o0O0O0.o00O00;
import p520o0o0O0O0.o00O000;
import p520o0o0O0O0.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002J,\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015¨\u0006!"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicBlackListVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "", "isRefresh", "Lo0o00OOO/Oooo0;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/TopicBlackUserModel;", "Lkotlin/collections/ArrayList;", "loadBlackListUser", "", "toUserId", "black", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "blackUser", "", "search", "searchTopicBlackList", "", "pageIndex", "I", "dataSort", "Ljava/lang/Long;", "topicId", "J", "getTopicId", "()J", "setTopicId", "(J)V", "pageIndexSearch", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicBlackListVM extends MomentVM {
    public static final int $stable = 8;
    private long topicId;
    private int pageIndex = 1;

    @Nullable
    private Long dataSort = 0L;
    private int pageIndexSearch = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicBlackListVM$blackUser$1", f = "TopicBlackListVM.kt", i = {}, l = {37, 37}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f25905Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25906Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25907Oooo0oO;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f25909OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25905Oooo = j;
            this.f25909OoooO00 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = TopicBlackListVM.this.new OooO00o(this.f25905Oooo, this.f25909OoooO00, continuation);
            oooO00o.f25907Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25906Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25907Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25907Oooo0oO;
            o00O000 o00o001 = o00O000.f42668OooO00o;
            long topicId = TopicBlackListVM.this.getTopicId();
            long j = this.f25905Oooo;
            boolean z = this.f25909OoooO00;
            this.f25907Oooo0oO = liveDataScope;
            this.f25906Oooo0o = 1;
            obj = o00o001.OooO00o(topicId, j, z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25907Oooo0oO = null;
            this.f25906Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<ArrayList<TopicBlackUserModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Oooo0<ArrayList<TopicBlackUserModel>> f25911Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<ArrayList<TopicBlackUserModel>> oooo0) {
            super(1);
            this.f25911Oooo0oO = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicBlackUserModel>> response) {
            Response<ArrayList<TopicBlackUserModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsSuccess()) {
                TopicBlackListVM.this.pageIndex++;
                TopicBlackListVM.this.dataSort = it.getPage().getDateSort();
            }
            this.f25911Oooo0oO.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<ArrayList<TopicBlackUserModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Oooo0<ArrayList<TopicBlackUserModel>> f25913Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo0<ArrayList<TopicBlackUserModel>> oooo0) {
            super(1);
            this.f25913Oooo0oO = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicBlackUserModel>> response) {
            Response<ArrayList<TopicBlackUserModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsSuccess()) {
                TopicBlackListVM.this.pageIndexSearch++;
            }
            this.f25913Oooo0oO.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<Object>> blackUser(long toUserId, boolean black) {
        return o0000O0O.OooO00o(new OooO00o(toUserId, black, null));
    }

    public final long getTopicId() {
        return this.topicId;
    }

    @NotNull
    public final Oooo0<ArrayList<TopicBlackUserModel>> loadBlackListUser(boolean isRefresh) {
        Oooo0<ArrayList<TopicBlackUserModel>> oooo0 = new Oooo0<>();
        if (isRefresh) {
            this.pageIndex = 1;
            this.dataSort = 0L;
        }
        long j = this.topicId;
        int i = this.pageIndex;
        Long l = this.dataSort;
        OooO0O0 listener = new OooO0O0(oooo0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleBlackList(j, i, String.valueOf(l), new o00O000o(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<ArrayList<TopicBlackUserModel>> searchTopicBlackList(@NotNull String search, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(search, "search");
        Oooo0<ArrayList<TopicBlackUserModel>> oooo0 = new Oooo0<>();
        if (isRefresh) {
            this.pageIndexSearch = 1;
        }
        long j = this.topicId;
        int i = this.pageIndexSearch;
        OooO0OO listener = new OooO0OO(oooo0);
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00O00 callback = new o00O00(listener);
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("circleid", String.valueOf(j));
        params.put("pageindex", String.valueOf(i));
        params.put("search", o000oOoO.OooO0O0(search));
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.o000Oo0, o0ooOOo.f32331o00ooo, params, callback);
        return oooo0;
    }

    public final void setTopicId(long j) {
        this.topicId = j;
    }
}
