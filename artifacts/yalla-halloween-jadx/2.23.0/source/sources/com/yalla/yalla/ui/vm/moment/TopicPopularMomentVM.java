package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.repository.MomentRepository$topicMomentList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o000O000;
import p385o0OOooOO.o00oOoo;
import p403o0Oo0OOo.o0OO00o0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicPopularMomentVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "()V", "loadData", "", "isRefresh", "", "page", "", "circleId", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicPopularMomentVM extends BaseMomentVM {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM$loadData$1", f = "TopicPopularMomentVM.kt", i = {}, l = {38, 38}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32452OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f32453OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f32454OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TopicPopularMomentVM f32455OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f32456OooO0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM$loadData$1$1", f = "TopicPopularMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0371OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32457OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ TopicPopularMomentVM f32458OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0371OooO00o(TopicPopularMomentVM topicPopularMomentVM, Continuation<? super C0371OooO00o> continuation) {
                super(2, continuation);
                this.f32458OooO0o0 = topicPopularMomentVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0371OooO00o c0371OooO00o = new C0371OooO00o(this.f32458OooO0o0, continuation);
                c0371OooO00o.f32457OooO0Oo = obj;
                return c0371OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<List<MomentDetailModel>> apiResult, Continuation<? super Unit> continuation) {
                return ((C0371OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) this.f32457OooO0Oo;
                TopicPopularMomentVM topicPopularMomentVM = this.f32458OooO0o0;
                topicPopularMomentVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                if (apiResult.isSuccess()) {
                    Long dateSort = apiResult.getPage().getDateSort();
                    topicPopularMomentVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
                    topicPopularMomentVM.setPageIndex(apiResult.getPage().getPageIndex() + 1);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM$loadData$1$2", f = "TopicPopularMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ TopicPopularMomentVM f32459OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(TopicPopularMomentVM topicPopularMomentVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f32459OooO0Oo = topicPopularMomentVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f32459OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                TopicPopularMomentVM topicPopularMomentVM = this.f32459OooO0Oo;
                if (topicPopularMomentVM.getListData().isEmpty()) {
                    topicPopularMomentVM.getContentState().setValue(ContentState.Error);
                } else {
                    topicPopularMomentVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM$loadData$1$3", f = "TopicPopularMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32460OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f32461OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ TopicPopularMomentVM f32462OooO0o0;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C0372OooO00o extends Lambda implements Function1<MomentDetailModel, Boolean> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public static final C0372OooO00o f32463OooO0Oo = new C0372OooO00o();

                public C0372OooO00o() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(MomentDetailModel momentDetailModel) {
                    MomentDetailModel it = momentDetailModel;
                    Intrinsics.checkNotNullParameter(it, "it");
                    long id = it.getId();
                    o0OO00o0 o0oo00o0OooOo0O = o000OOo.OooO00o().OooOo0O();
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    return Boolean.valueOf(o0oo00o0OooOo0O.OooO0O0(0, ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), String.valueOf(id)) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(TopicPopularMomentVM topicPopularMomentVM, boolean z, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f32462OooO0o0 = topicPopularMomentVM;
                this.f32461OooO0o = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f32462OooO0o0, this.f32461OooO0o, continuation);
                oooO0OO.f32460OooO0Oo = obj;
                return oooO0OO;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<MomentDetailModel> list, Continuation<? super Unit> continuation) {
                return ((OooO0OO) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List list = (List) this.f32460OooO0Oo;
                if (list != null) {
                    Boxing.boxBoolean(CollectionsKt.removeAll(list, (Function1) C0372OooO00o.f32463OooO0Oo));
                }
                TopicPopularMomentVM topicPopularMomentVM = this.f32462OooO0o0;
                topicPopularMomentVM.getContentState().setValue(ContentState.Content);
                if (this.f32461OooO0o) {
                    topicPopularMomentVM.getListData().clear();
                }
                if (list != null) {
                    Boxing.boxBoolean(topicPopularMomentVM.getListData().addAll(list));
                }
                if (list == null || list.isEmpty()) {
                    topicPopularMomentVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    topicPopularMomentVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, int i, TopicPopularMomentVM topicPopularMomentVM, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32454OooO0o0 = j;
            this.f32453OooO0o = i;
            this.f32455OooO0oO = topicPopularMomentVM;
            this.f32456OooO0oo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f32454OooO0o0, this.f32453OooO0o, this.f32455OooO0oO, this.f32456OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32452OooO0Oo;
            TopicPopularMomentVM topicPopularMomentVM = this.f32455OooO0oO;
            if (i != 0) {
                if (i == 1) {
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
            long dateSort = topicPopularMomentVM.getDateSort();
            int pageIndex = topicPopularMomentVM.getPageIndex();
            this.f32452OooO0Oo = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Discovery/CircleDiscovery");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(pageIndex), "pageindex");
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(dateSort), "datesort");
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(this.f32454OooO0o0), "circleId");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(this.f32453OooO0o), "type");
            obj = OooOOO.OooO0Oo(new MomentRepository$topicMomentList$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            C0371OooO00o c0371OooO00o = new C0371OooO00o(topicPopularMomentVM, null);
            OooO0O0 oooO0O0 = new OooO0O0(topicPopularMomentVM, null);
            OooO0OO oooO0OO = new OooO0OO(topicPopularMomentVM, this.f32456OooO0oo, null);
            this.f32452OooO0Oo = 2;
            if (o000O000.OooO0OO(apiResult, false, c0371OooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadData(boolean isRefresh, int page, long circleId) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        MutableState<Boolean> mutableStateIsRefreshIng = isRefreshIng();
        Boolean bool = Boolean.TRUE;
        mutableStateIsRefreshIng.setValue(bool);
        if (isRefresh) {
            setDateSort(0L);
            setPageIndex(1);
            getLoadMoreState().setValue(LoadMoreState.None);
            LiveEventBus.get("MOMENT_LIST_REFRESH_OF_TOPIC").post(bool);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(circleId, page == 0 ? 2 : 1, this, isRefresh, null), 3, null);
    }
}
