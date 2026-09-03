package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.data.repository.TopicBlackRepository$blackUser$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicBlackUserModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p412o0Oo0o0O.o00OOOO0;
import p412o0Oo0o0O.o0o0Oo;
import p424o0OoO0Oo.o00OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002J,\u0010\u0012\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicBlackListVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "", "isRefresh", "Lo0OoO0Oo/o00OO000;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/topic/TopicBlackUserModel;", "Lkotlin/collections/ArrayList;", "loadBlackListUser", "", "toUserId", "black", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "blackUser", "", "search", "searchTopicBlackList", "topicId", "J", "getTopicId", "()J", "setTopicId", "(J)V", "", "pageIndexSearch", "I", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class TopicBlackListVM extends BaseMomentDetailVM {
    public static final int $stable = 8;
    private int pageIndexSearch = 1;
    private long topicId;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicBlackListVM$blackUser$1", f = "TopicBlackListVM.kt", i = {}, l = {35, 35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31833OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31835OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31836OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f31837OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31836OooO0oO = j;
            this.f31837OooO0oo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = TopicBlackListVM.this.new OooO00o(this.f31836OooO0oO, this.f31837OooO0oo, continuation);
            oooO00o.f31835OooO0o0 = obj;
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
            int i = this.f31833OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31835OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31835OooO0o0;
            long topicId = TopicBlackListVM.this.getTopicId();
            this.f31835OooO0o0 = liveDataScope;
            this.f31833OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Circle/CircleBlackIns");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(topicId), "circleid");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31836OooO0oO), "touserid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31837OooO0oo ? 1 : 2), "type");
            obj = OooOOO.OooO0Oo(new TopicBlackRepository$blackUser$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31835OooO0o0 = null;
            this.f31833OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<ArrayList<TopicBlackUserModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OO000<ArrayList<TopicBlackUserModel>> f31839OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OO000<ArrayList<TopicBlackUserModel>> o00oo001) {
            super(1);
            this.f31839OooO0o0 = o00oo001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicBlackUserModel>> response) {
            Response<ArrayList<TopicBlackUserModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsSuccess()) {
                TopicBlackListVM topicBlackListVM = TopicBlackListVM.this;
                topicBlackListVM.setPageIndex(topicBlackListVM.getPageIndex() + 1);
                Long dateSort = it.getPage().getDateSort();
                topicBlackListVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
            }
            this.f31839OooO0o0.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<ArrayList<TopicBlackUserModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OO000<ArrayList<TopicBlackUserModel>> f31841OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00OO000<ArrayList<TopicBlackUserModel>> o00oo001) {
            super(1);
            this.f31841OooO0o0 = o00oo001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicBlackUserModel>> response) {
            Response<ArrayList<TopicBlackUserModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsSuccess()) {
                TopicBlackListVM.this.pageIndexSearch++;
            }
            this.f31841OooO0o0.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<Object>> blackUser(long toUserId, boolean black) {
        return o00oO0o.OooO00o(new OooO00o(toUserId, black, null));
    }

    public final long getTopicId() {
        return this.topicId;
    }

    @NotNull
    public final o00OO000<ArrayList<TopicBlackUserModel>> loadBlackListUser(boolean isRefresh) {
        o00OO000<ArrayList<TopicBlackUserModel>> o00oo001 = new o00OO000<>();
        if (isRefresh) {
            setPageIndex(1);
            setDateSort(0L);
        }
        long j = this.topicId;
        int pageIndex = getPageIndex();
        Long lValueOf = Long.valueOf(getDateSort());
        OooO0O0 listener = new OooO0O0(o00oo001);
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0Oo(j, pageIndex, lValueOf, listener, null), 3, null);
        return o00oo001;
    }

    @NotNull
    public final o00OO000<ArrayList<TopicBlackUserModel>> searchTopicBlackList(@NotNull String search, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(search, "search");
        o00OO000<ArrayList<TopicBlackUserModel>> o00oo001 = new o00OO000<>();
        if (isRefresh) {
            this.pageIndexSearch = 1;
        }
        long j = this.topicId;
        int i = this.pageIndexSearch;
        OooO0OO listener = new OooO0OO(o00oo001);
        Intrinsics.checkNotNullParameter(search, "search");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00OOOO0(j, i, search, listener, null), 3, null);
        return o00oo001;
    }

    public final void setTopicId(long j) {
        this.topicId = j;
    }
}
