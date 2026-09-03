package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.repository.MomentRepository$adAddBlockIns$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$momentFeaturedList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentAdDataModel;
import com.yalla.yalla.model.moment.MomentBannerModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.repository.MomentBannerApiRepo$bannerList$$inlined$call$1;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;
import p386o0OOoo0O.o00Oo0;
import p409o0Oo0Oo.o00O0OO0;
import p410o0Oo0Oo0.o00O0O;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u000eH\u0002R\"\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentFeaturedVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "()V", "bannerModel", "Landroidx/compose/runtime/MutableState;", "Lcom/yalla/yalla/model/moment/MomentBannerModel;", "getBannerModel", "()Landroidx/compose/runtime/MutableState;", "setBannerModel", "(Landroidx/compose/runtime/MutableState;)V", "lastPageIndex", "", "scrollToTop", "Lkotlin/Function0;", "", "getScrollToTop", "()Lkotlin/jvm/functions/Function0;", "setScrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "deleteAD", "detailModel", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "loadFeaturedMomentList", "isRefresh", "", "loadMomentBanner", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentFeaturedVM extends BaseMomentVM {
    public static final int $stable = 8;

    @NotNull
    private MutableState<MomentBannerModel> bannerModel;
    private int lastPageIndex = 1;

    @Nullable
    private Function0<Unit> scrollToTop;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$deleteAD$1$1", f = "MomentFeaturedVM.kt", i = {}, l = {121, 121}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31646OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentFeaturedVM f31647OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f31648OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f31649OooO0oO;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$deleteAD$1$1$1", f = "MomentFeaturedVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0356OooO00o extends SuspendLambda implements Function2<List<Object>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentFeaturedVM f31650OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f31651OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0356OooO00o(MomentFeaturedVM momentFeaturedVM, Ref.IntRef intRef, Continuation<? super C0356OooO00o> continuation) {
                super(2, continuation);
                this.f31650OooO0Oo = momentFeaturedVM;
                this.f31651OooO0o0 = intRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0356OooO00o(this.f31650OooO0Oo, this.f31651OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<Object> list, Continuation<? super Unit> continuation) {
                return ((C0356OooO00o) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f31650OooO0Oo.getListData().remove(this.f31651OooO0o0.element);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, MomentFeaturedVM momentFeaturedVM, Ref.IntRef intRef, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31648OooO0o0 = j;
            this.f31647OooO0o = momentFeaturedVM;
            this.f31649OooO0oO = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31648OooO0o0, this.f31647OooO0o, this.f31649OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31646OooO0Oo;
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
            this.f31646OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Moment/AdvertiBlockIns");
            o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31648OooO0o0), "adid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(3), "sourcepage");
            obj = OooOOO.OooO0Oo(new MomentRepository$adAddBlockIns$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            C0356OooO00o c0356OooO00o = new C0356OooO00o(this.f31647OooO0o, this.f31649OooO0oO, null);
            this.f31646OooO0Oo = 2;
            if (o00Oo0.OooO0OO(apiResult, false, null, null, c0356OooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$loadFeaturedMomentList$1", f = "MomentFeaturedVM.kt", i = {}, l = {48, 48}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31652OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31653OooO0o;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$loadFeaturedMomentList$1$1", f = "MomentFeaturedVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31655OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentFeaturedVM f31656OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentFeaturedVM momentFeaturedVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31656OooO0o0 = momentFeaturedVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31656OooO0o0, continuation);
                oooO00o.f31655OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<List<MomentDetailModel>> apiResult, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) this.f31655OooO0Oo;
                MomentFeaturedVM momentFeaturedVM = this.f31656OooO0o0;
                momentFeaturedVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                if (apiResult.isSuccess()) {
                    Long dateSort = apiResult.getPage().getDateSort();
                    momentFeaturedVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
                    momentFeaturedVM.setPageIndex(apiResult.getPage().getPageIndex() + 1);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$loadFeaturedMomentList$1$2", f = "MomentFeaturedVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0357OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentFeaturedVM f31657OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0357OooO0O0(MomentFeaturedVM momentFeaturedVM, Continuation<? super C0357OooO0O0> continuation) {
                super(2, continuation);
                this.f31657OooO0Oo = momentFeaturedVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0357OooO0O0(this.f31657OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((C0357OooO0O0) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentFeaturedVM momentFeaturedVM = this.f31657OooO0Oo;
                if (momentFeaturedVM.getListData().isEmpty()) {
                    momentFeaturedVM.getContentState().setValue(ContentState.Error);
                } else {
                    momentFeaturedVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$loadFeaturedMomentList$1$3", f = "MomentFeaturedVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31658OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f31659OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentFeaturedVM f31660OooO0o0;

            public static final class OooO00o extends Lambda implements Function1<MomentDetailModel, Boolean> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public static final OooO00o f31661OooO0Oo = new OooO00o();

                public OooO00o() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(MomentDetailModel momentDetailModel) {
                    MomentDetailModel it = momentDetailModel;
                    Intrinsics.checkNotNullParameter(it, "it");
                    long id = it.getId();
                    o00O0OO0 o00o0oo0OooOo0o = o00O0O.OooO00o().OooOo0o();
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    return Boolean.valueOf(o00o0oo0OooOo0o.OooO0O0(0, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), String.valueOf(id)) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MomentFeaturedVM momentFeaturedVM, boolean z, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f31660OooO0o0 = momentFeaturedVM;
                this.f31659OooO0o = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f31660OooO0o0, this.f31659OooO0o, continuation);
                oooO0OO.f31658OooO0Oo = obj;
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
                List list = (List) this.f31658OooO0Oo;
                if (list != null) {
                    Boxing.boxBoolean(CollectionsKt.removeAll(list, (Function1) OooO00o.f31661OooO0Oo));
                }
                MomentFeaturedVM momentFeaturedVM = this.f31660OooO0o0;
                momentFeaturedVM.getContentState().setValue(ContentState.Content);
                SharedMainMessageManager.INSTANCE.getHaveNewFollowingPost().postValue(Boxing.boxBoolean(false));
                if (this.f31659OooO0o) {
                    if (momentFeaturedVM.lastPageIndex == 1) {
                        momentFeaturedVM.getListData().clear();
                        if (list != null) {
                            Boxing.boxBoolean(momentFeaturedVM.getListData().addAll(list));
                        }
                    } else if (list != null) {
                        Boxing.boxBoolean(momentFeaturedVM.getListData().addAll(0, list));
                    }
                    Function0<Unit> scrollToTop = momentFeaturedVM.getScrollToTop();
                    if (scrollToTop != null) {
                        scrollToTop.invoke();
                    }
                } else if (list != null) {
                    Boxing.boxBoolean(momentFeaturedVM.getListData().addAll(list));
                }
                if (list == null || list.isEmpty()) {
                    momentFeaturedVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    momentFeaturedVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31653OooO0o = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentFeaturedVM.this.new OooO0O0(this.f31653OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31652OooO0Oo;
            MomentFeaturedVM momentFeaturedVM = MomentFeaturedVM.this;
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
            long dateSort = momentFeaturedVM.getDateSort();
            int pageIndex = momentFeaturedVM.getPageIndex();
            this.f31652OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Discovery/SquareHot");
            o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(pageIndex), "pageindex");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(dateSort), "datesort");
            obj = OooOOO.OooO0Oo(new MomentRepository$momentFeaturedList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(momentFeaturedVM, null);
            C0357OooO0O0 c0357OooO0O0 = new C0357OooO0O0(momentFeaturedVM, null);
            OooO0OO oooO0OO = new OooO0OO(momentFeaturedVM, this.f31653OooO0o, null);
            this.f31652OooO0Oo = 2;
            if (o00Oo0.OooO0OO(apiResult, false, oooO00o, c0357OooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$loadMomentBanner$1", f = "MomentFeaturedVM.kt", i = {}, l = {103, 103}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31662OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFeaturedVM$loadMomentBanner$1$1", f = "MomentFeaturedVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<MomentBannerModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31664OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentFeaturedVM f31665OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentFeaturedVM momentFeaturedVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31665OooO0o0 = momentFeaturedVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31665OooO0o0, continuation);
                oooO00o.f31664OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MomentBannerModel momentBannerModel, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(momentBannerModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentBannerModel momentBannerModel = (MomentBannerModel) this.f31664OooO0Oo;
                MomentFeaturedVM momentFeaturedVM = this.f31665OooO0o0;
                momentFeaturedVM.getBannerModel().setValue(momentBannerModel);
                Function0<Unit> scrollToTop = momentFeaturedVM.getScrollToTop();
                if (scrollToTop != null) {
                    scrollToTop.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentFeaturedVM.this.new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31662OooO0Oo;
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
            this.f31662OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Moment/GetBannerList");
            obj = OooOOO.OooO0Oo(new MomentBannerApiRepo$bannerList$$inlined$call$1(com.common.support.apm.netdetector.OooO00o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(MomentFeaturedVM.this, null);
            this.f31662OooO0Oo = 2;
            if (o00Oo0.OooO0OO(apiResult, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public MomentFeaturedVM() {
        getMomentAdapterTag().setValue(MomentAdapterTag.MomentListFeaturedFragment);
        loadFeaturedMomentList$default(this, false, 1, null);
        this.bannerModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static /* synthetic */ void loadFeaturedMomentList$default(MomentFeaturedVM momentFeaturedVM, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        momentFeaturedVM.loadFeaturedMomentList(z);
    }

    private final void loadMomentBanner() {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.FALSE)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(null), 3, null);
    }

    public final void deleteAD(@Nullable MomentDetailModel detailModel) {
        if (detailModel == null) {
            return;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        while (intRef.element < getListData().size()) {
            if (Intrinsics.areEqual(getListData().get(intRef.element), detailModel)) {
                MomentAdDataModel adData = getListData().get(intRef.element).getAdData();
                if (adData != null) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(adData.getAdId(), this, intRef, null), 3, null);
                    return;
                }
                return;
            }
            intRef.element++;
        }
    }

    @NotNull
    public final MutableState<MomentBannerModel> getBannerModel() {
        return this.bannerModel;
    }

    @Nullable
    public final Function0<Unit> getScrollToTop() {
        return this.scrollToTop;
    }

    public final void loadFeaturedMomentList(boolean isRefresh) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        if (isRefresh) {
            getLoadMoreState().setValue(LoadMoreState.None);
            loadMomentBanner();
        }
        this.lastPageIndex = getPageIndex();
        isRefreshIng().setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(isRefresh, null), 3, null);
    }

    public final void setBannerModel(@NotNull MutableState<MomentBannerModel> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.bannerModel = mutableState;
    }

    public final void setScrollToTop(@Nullable Function0<Unit> function0) {
        this.scrollToTop = function0;
    }
}
