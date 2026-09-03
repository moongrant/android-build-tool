package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.MomentEditRepo$momentEditHistory$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o000O000;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentRecordEditVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "()V", "loadData", "", "momentId", "", "isRefresh", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentRecordEditVM extends BaseMomentVM {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentRecordEditVM$loadData$1", f = "MomentRecordEditVM.kt", i = {}, l = {26, 26}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32244OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentRecordEditVM f32245OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f32246OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f32247OooO0oO;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentRecordEditVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentRecordEditVM$loadData$1$1", f = "MomentRecordEditVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0366OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32248OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentRecordEditVM f32249OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0366OooO00o(MomentRecordEditVM momentRecordEditVM, Continuation<? super C0366OooO00o> continuation) {
                super(2, continuation);
                this.f32249OooO0o0 = momentRecordEditVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0366OooO00o c0366OooO00o = new C0366OooO00o(this.f32249OooO0o0, continuation);
                c0366OooO00o.f32248OooO0Oo = obj;
                return c0366OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<List<MomentDetailModel>> apiResult, Continuation<? super Unit> continuation) {
                return ((C0366OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) this.f32248OooO0Oo;
                MomentRecordEditVM momentRecordEditVM = this.f32249OooO0o0;
                momentRecordEditVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                if (apiResult.isSuccess()) {
                    Long dateSort = apiResult.getPage().getDateSort();
                    momentRecordEditVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
                    momentRecordEditVM.setPageIndex(apiResult.getPage().getPageIndex() + 1);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentRecordEditVM$loadData$1$2", f = "MomentRecordEditVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentRecordEditVM f32250OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MomentRecordEditVM momentRecordEditVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f32250OooO0Oo = momentRecordEditVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f32250OooO0Oo, continuation);
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
                MomentRecordEditVM momentRecordEditVM = this.f32250OooO0Oo;
                if (momentRecordEditVM.getListData().isEmpty()) {
                    momentRecordEditVM.getContentState().setValue(ContentState.Error);
                } else {
                    momentRecordEditVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentRecordEditVM$loadData$1$3", f = "MomentRecordEditVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMomentRecordEditVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentRecordEditVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentRecordEditVM$loadData$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32251OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f32252OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentRecordEditVM f32253OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MomentRecordEditVM momentRecordEditVM, boolean z, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f32253OooO0o0 = momentRecordEditVM;
                this.f32252OooO0o = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f32253OooO0o0, this.f32252OooO0o, continuation);
                oooO0OO.f32251OooO0Oo = obj;
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
                List list = (List) this.f32251OooO0Oo;
                MomentRecordEditVM momentRecordEditVM = this.f32253OooO0o0;
                momentRecordEditVM.getContentState().setValue(ContentState.Content);
                if (this.f32252OooO0o) {
                    momentRecordEditVM.getListData().clear();
                }
                if (list != null) {
                    Boxing.boxBoolean(momentRecordEditVM.getListData().addAll(list));
                }
                if (list == null || list.isEmpty()) {
                    momentRecordEditVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    momentRecordEditVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, MomentRecordEditVM momentRecordEditVM, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32246OooO0o0 = j;
            this.f32245OooO0o = momentRecordEditVM;
            this.f32247OooO0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f32246OooO0o0, this.f32245OooO0o, this.f32247OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32244OooO0Oo;
            MomentRecordEditVM momentRecordEditVM = this.f32245OooO0o;
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
            int pageIndex = momentRecordEditVM.getPageIndex();
            long dateSort = momentRecordEditVM.getDateSort();
            this.f32244OooO0Oo = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Discovery/GetEditHistory");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(this.f32246OooO0o0), "dyId");
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(dateSort), "datesort");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(pageIndex), "pageindex");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
            obj = OooOOO.OooO0Oo(new MomentEditRepo$momentEditHistory$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            C0366OooO00o c0366OooO00o = new C0366OooO00o(momentRecordEditVM, null);
            OooO0O0 oooO0O0 = new OooO0O0(momentRecordEditVM, null);
            OooO0OO oooO0OO = new OooO0OO(momentRecordEditVM, this.f32247OooO0oO, null);
            this.f32244OooO0Oo = 2;
            if (o000O000.OooO0OO(apiResult, false, c0366OooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadData$default(MomentRecordEditVM momentRecordEditVM, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        momentRecordEditVM.loadData(j, z);
    }

    public final void loadData(long momentId, boolean isRefresh) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        if (isRefresh) {
            getLoadMoreState().setValue(LoadMoreState.None);
            setPageIndex(1);
            setDateSort(0L);
        }
        isRefreshIng().setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(momentId, this, isRefresh, null), 3, null);
    }
}
