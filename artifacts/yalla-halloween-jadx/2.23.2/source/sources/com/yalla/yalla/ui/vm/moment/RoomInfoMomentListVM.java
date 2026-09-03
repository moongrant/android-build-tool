package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.MomentRepository$squareBarMember$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.Iterator;
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
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.o00O0O;
import p407o0Oo0Oo.o00O0OO0;
import p408o0Oo0Oo0.o00Oo0;
import p423o0OoO0OO.o0000OO0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/RoomInfoMomentListVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "()V", "getMoments", "", "isRefresh", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RoomInfoMomentListVM extends BaseMomentVM {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM$getMoments$1", f = "RoomInfoMomentListVM.kt", i = {}, l = {41, 41}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31821OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomInfoMomentListVM f31822OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Long f31823OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f31824OooO0oO;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM$getMoments$1$1", f = "RoomInfoMomentListVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0368OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31825OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ RoomInfoMomentListVM f31826OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0368OooO00o(RoomInfoMomentListVM roomInfoMomentListVM, Continuation<? super C0368OooO00o> continuation) {
                super(2, continuation);
                this.f31826OooO0o0 = roomInfoMomentListVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0368OooO00o c0368OooO00o = new C0368OooO00o(this.f31826OooO0o0, continuation);
                c0368OooO00o.f31825OooO0Oo = obj;
                return c0368OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<List<MomentDetailModel>> apiResult, Continuation<? super Unit> continuation) {
                return ((C0368OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) this.f31825OooO0Oo;
                RoomInfoMomentListVM roomInfoMomentListVM = this.f31826OooO0o0;
                roomInfoMomentListVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                if (apiResult.isSuccess()) {
                    Long dateSort = apiResult.getPage().getDateSort();
                    roomInfoMomentListVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
                    roomInfoMomentListVM.setPageIndex(apiResult.getPage().getPageIndex() + 1);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM$getMoments$1$2", f = "RoomInfoMomentListVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ RoomInfoMomentListVM f31827OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(RoomInfoMomentListVM roomInfoMomentListVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f31827OooO0Oo = roomInfoMomentListVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f31827OooO0Oo, continuation);
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
                RoomInfoMomentListVM roomInfoMomentListVM = this.f31827OooO0Oo;
                if (roomInfoMomentListVM.getListData().isEmpty()) {
                    roomInfoMomentListVM.getContentState().setValue(ContentState.Error);
                } else {
                    roomInfoMomentListVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM$getMoments$1$3", f = "RoomInfoMomentListVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31828OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f31829OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ RoomInfoMomentListVM f31830OooO0o0;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C0369OooO00o extends Lambda implements Function1<MomentDetailModel, Boolean> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public static final C0369OooO00o f31831OooO0Oo = new C0369OooO00o();

                public C0369OooO00o() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(MomentDetailModel momentDetailModel) {
                    MomentDetailModel it = momentDetailModel;
                    Intrinsics.checkNotNullParameter(it, "it");
                    long id = it.getId();
                    o00O0OO0 o00o0oo0OooOo0o = o00Oo0.OooO00o().OooOo0o();
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    return Boolean.valueOf(o00o0oo0OooOo0o.OooO0O0(0, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), String.valueOf(id)) != null);
                }
            }

            public static final class OooO0O0 extends Lambda implements Function1<MomentDetailModel, Long> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public static final OooO0O0 f31832OooO0Oo = new OooO0O0();

                public OooO0O0() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Long invoke(MomentDetailModel momentDetailModel) {
                    long id;
                    MomentDetailModel item = momentDetailModel;
                    Intrinsics.checkNotNullParameter(item, "item");
                    if (item.getSendPostModel() != null) {
                        MomentSendModel sendPostModel = item.getSendPostModel();
                        Intrinsics.checkNotNull(sendPostModel);
                        id = sendPostModel.getPostId();
                    } else {
                        id = item.getId();
                    }
                    return Long.valueOf(id);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(RoomInfoMomentListVM roomInfoMomentListVM, boolean z, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f31830OooO0o0 = roomInfoMomentListVM;
                this.f31829OooO0o = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f31830OooO0o0, this.f31829OooO0o, continuation);
                oooO0OO.f31828OooO0Oo = obj;
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
                List list = (List) this.f31828OooO0Oo;
                if (list != null) {
                    Boxing.boxBoolean(CollectionsKt.removeAll(list, (Function1) C0369OooO00o.f31831OooO0Oo));
                }
                RoomInfoMomentListVM roomInfoMomentListVM = this.f31830OooO0o0;
                roomInfoMomentListVM.getContentState().setValue(ContentState.Content);
                if (this.f31829OooO0o) {
                    roomInfoMomentListVM.getListData().clear();
                }
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((MomentDetailModel) it.next()).setFollow(false);
                    }
                    Boxing.boxBoolean(roomInfoMomentListVM.getListData().addAll(list));
                }
                o0000OO0.OooO0OO(roomInfoMomentListVM.getListData(), OooO0O0.f31832OooO0Oo);
                if (list == null || list.isEmpty()) {
                    roomInfoMomentListVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    roomInfoMomentListVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Long l, RoomInfoMomentListVM roomInfoMomentListVM, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31823OooO0o0 = l;
            this.f31822OooO0o = roomInfoMomentListVM;
            this.f31824OooO0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31823OooO0o0, this.f31822OooO0o, this.f31824OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31821OooO0Oo;
            RoomInfoMomentListVM roomInfoMomentListVM = this.f31822OooO0o;
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
            String strValueOf = String.valueOf(this.f31823OooO0o0);
            long dateSort = roomInfoMomentListVM.getDateSort();
            int pageIndex = roomInfoMomentListVM.getPageIndex();
            this.f31821OooO0Oo = 1;
            String url = oo000o.OooO0Oo("/Webservers/Discovery/SquareBarMember");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(strValueOf, ContributionFragment.ARG_1);
            o0ooooo.OooO0O0(Boxing.boxInt(20), "pagesize");
            o0ooooo.OooO0O0(Boxing.boxInt(pageIndex), "pageindex");
            o0ooooo.OooO0O0(Boxing.boxLong(dateSort), "datesort");
            obj = OooOOO.OooO0Oo(new MomentRepository$squareBarMember$$inlined$call$1(o0ooooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            C0368OooO00o c0368OooO00o = new C0368OooO00o(roomInfoMomentListVM, null);
            OooO0O0 oooO0O0 = new OooO0O0(roomInfoMomentListVM, null);
            OooO0OO oooO0OO = new OooO0OO(roomInfoMomentListVM, this.f31824OooO0oO, null);
            this.f31821OooO0Oo = 2;
            if (o00O0O.OooO0OO(apiResult, false, c0368OooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public RoomInfoMomentListVM() {
        getMoments(true);
    }

    public static /* synthetic */ void getMoments$default(RoomInfoMomentListVM roomInfoMomentListVM, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        roomInfoMomentListVM.getMoments(z);
    }

    public final void getMoments(boolean isRefresh) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        if (oooO00o.OooO00o().OooOOO0()) {
            getListData().clear();
            getContentState().setValue(ContentState.Content);
            return;
        }
        Long value = oooO00o.OooO00o().f24539OooO0Oo.getValue();
        isRefreshIng().setValue(Boolean.TRUE);
        if (isRefresh) {
            setPageIndex(1);
            getLoadMoreState().setValue(LoadMoreState.None);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(value, this, isRefresh, null), 3, null);
    }
}
