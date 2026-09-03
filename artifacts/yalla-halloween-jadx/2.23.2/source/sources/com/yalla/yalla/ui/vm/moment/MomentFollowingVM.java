package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.db.model.ReadPostTable;
import com.yalla.yalla.data.repository.MomentRepository$newMomentFollowList$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$newMomentRecommendList$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$newMomentRecommendUserList$$inlined$call$1;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import java.util.Collections;
import java.util.Comparator;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o0OoOo0;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.o00O0O;
import p407o0Oo0Oo.o00O0OO0;
import p408o0Oo0Oo0.o00Oo0;
import p423o0OoO0OO.o0000OO0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010!\u001a\u00020\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#2\b\b\u0002\u0010$\u001a\u00020\u000bJ\u0010\u0010%\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u000bJ\u0006\u0010'\u001a\u00020\u0018J\u0012\u0010(\u001a\u00020\u00182\b\b\u0002\u0010&\u001a\u00020\u000bH\u0002J\b\u0010)\u001a\u00020\u0018H\u0002J\u0012\u0010*\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0016\u0010-\u001a\u00020\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070.H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011¨\u0006/"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentFollowingVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "()V", "dateSortRecommendPost", "", "headUserList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/yalla/yalla/model/RecommendNewPostModel;", "getHeadUserList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "isRecommend", "", "()Z", "setRecommend", "(Z)V", "isUserListChange", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/runtime/MutableState;", "setUserListChange", "(Landroidx/compose/runtime/MutableState;)V", "pageIndexRecommendPost", "", "scrollToTop", "Lkotlin/Function0;", "", "getScrollToTop", "()Lkotlin/jvm/functions/Function0;", "setScrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "showFollowDialog", "getShowFollowDialog", "showRecommendTop", "getShowRecommendTop", "checkUnreadPost", "data", "", "sort", "loadFollowingMomentList", "isRefresh", "loadFollowingMoreData", "loadFollowingRecommendList", "loadHaveNewPostUser", "postSendSuccess", "sendModel", "Lcom/yalla/yalla/model/moment/MomentSendModel;", "sortUnreadPost", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentFollowingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentFollowingVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentFollowingVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1855#2,2:273\n*S KotlinDebug\n*F\n+ 1 MomentFollowingVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentFollowingVM\n*L\n227#1:273,2\n*E\n"})
public class MomentFollowingVM extends BaseMomentVM {
    public static final int $stable = 8;
    private long dateSortRecommendPost;

    @NotNull
    private final SnapshotStateList<RecommendNewPostModel> headUserList;
    private boolean isRecommend;

    @NotNull
    private MutableState<Boolean> isUserListChange;
    private int pageIndexRecommendPost = 1;

    @Nullable
    private Function0<Unit> scrollToTop;

    @NotNull
    private final MutableState<Boolean> showFollowDialog;

    @NotNull
    private final MutableState<Boolean> showRecommendTop;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadFollowingMomentList$1", f = "MomentFollowingVM.kt", i = {}, l = {74, 74}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31677OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31678OooO0o;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFollowingVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadFollowingMomentList$1$1", f = "MomentFollowingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0361OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31680OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingVM f31681OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0361OooO00o(MomentFollowingVM momentFollowingVM, Continuation<? super C0361OooO00o> continuation) {
                super(2, continuation);
                this.f31681OooO0o0 = momentFollowingVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0361OooO00o c0361OooO00o = new C0361OooO00o(this.f31681OooO0o0, continuation);
                c0361OooO00o.f31680OooO0Oo = obj;
                return c0361OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<List<MomentDetailModel>> apiResult, Continuation<? super Unit> continuation) {
                return ((C0361OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) this.f31680OooO0Oo;
                MomentFollowingVM momentFollowingVM = this.f31681OooO0o0;
                momentFollowingVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                if (apiResult.isSuccess()) {
                    Long dateSort = apiResult.getPage().getDateSort();
                    momentFollowingVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
                    momentFollowingVM.setPageIndex(apiResult.getPage().getPageIndex() + 1);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadFollowingMomentList$1$2", f = "MomentFollowingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingVM f31682OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MomentFollowingVM momentFollowingVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f31682OooO0Oo = momentFollowingVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f31682OooO0Oo, continuation);
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
                MomentFollowingVM momentFollowingVM = this.f31682OooO0Oo;
                if (momentFollowingVM.getListData().isEmpty()) {
                    momentFollowingVM.getContentState().setValue(ContentState.Error);
                } else {
                    momentFollowingVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadFollowingMomentList$1$3", f = "MomentFollowingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31683OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f31684OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingVM f31685OooO0o0;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFollowingVM$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C0362OooO00o extends Lambda implements Function1<MomentDetailModel, Boolean> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public static final C0362OooO00o f31686OooO0Oo = new C0362OooO00o();

                public C0362OooO00o() {
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
                public static final OooO0O0 f31687OooO0Oo = new OooO0O0();

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
            public OooO0OO(MomentFollowingVM momentFollowingVM, Continuation continuation, boolean z) {
                super(2, continuation);
                this.f31685OooO0o0 = momentFollowingVM;
                this.f31684OooO0o = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f31685OooO0o0, continuation, this.f31684OooO0o);
                oooO0OO.f31683OooO0Oo = obj;
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
                List list = (List) this.f31683OooO0Oo;
                if (list != null) {
                    Boxing.boxBoolean(CollectionsKt.removeAll(list, (Function1) C0362OooO00o.f31686OooO0Oo));
                }
                MomentFollowingVM momentFollowingVM = this.f31685OooO0o0;
                momentFollowingVM.getContentState().setValue(ContentState.Content);
                SharedMainMessageManager.INSTANCE.getHaveNewFollowingPost().postValue(Boxing.boxBoolean(false));
                if (this.f31684OooO0o) {
                    momentFollowingVM.getListData().clear();
                    if (list == null || list.isEmpty()) {
                        momentFollowingVM.setRecommend(true);
                        momentFollowingVM.getMomentAdapterTag().setValue(MomentAdapterTag.MomentListFollowingFragment_Recommend);
                        momentFollowingVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                        momentFollowingVM.loadFollowingRecommendList(true);
                        return Unit.INSTANCE;
                    }
                }
                momentFollowingVM.getMomentAdapterTag().setValue(MomentAdapterTag.MomentListFollowingFragment);
                momentFollowingVM.getShowRecommendTop().setValue(Boxing.boxBoolean(false));
                if (list != null) {
                    Boxing.boxBoolean(momentFollowingVM.getListData().addAll(list));
                }
                o0000OO0.OooO0OO(momentFollowingVM.getListData(), OooO0O0.f31687OooO0Oo);
                if (list == null || list.isEmpty()) {
                    momentFollowingVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    momentFollowingVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Continuation continuation, boolean z) {
            super(2, continuation);
            this.f31678OooO0o = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentFollowingVM.this.new OooO00o(continuation, this.f31678OooO0o);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31677OooO0Oo;
            MomentFollowingVM momentFollowingVM = MomentFollowingVM.this;
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
            Long lBoxLong = Boxing.boxLong(momentFollowingVM.getDateSort());
            int pageIndex = momentFollowingVM.getPageIndex();
            this.f31677OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("Webservers/Discovery/SquareFriend");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(pageIndex), "pageindex");
            if ((lBoxLong != null ? lBoxLong.longValue() : 0L) > 0) {
                o0oooooOooO00o.OooO0O0(lBoxLong, "datesort");
            }
            obj = OooOOO.OooO0Oo(new MomentRepository$newMomentFollowList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            C0361OooO00o c0361OooO00o = new C0361OooO00o(momentFollowingVM, null);
            OooO0O0 oooO0O0 = new OooO0O0(momentFollowingVM, null);
            OooO0OO oooO0OO = new OooO0OO(momentFollowingVM, null, this.f31678OooO0o);
            this.f31677OooO0Oo = 2;
            if (o00O0O.OooO0OO(apiResult, false, c0361OooO00o, oooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadFollowingRecommendList$1", f = "MomentFollowingVM.kt", i = {}, l = {144, 144}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31688OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31689OooO0o;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadFollowingRecommendList$1$1", f = "MomentFollowingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31691OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingVM f31692OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentFollowingVM momentFollowingVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31692OooO0o0 = momentFollowingVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31692OooO0o0, continuation);
                oooO00o.f31691OooO0Oo = obj;
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
                ApiResult apiResult = (ApiResult) this.f31691OooO0Oo;
                MomentFollowingVM momentFollowingVM = this.f31692OooO0o0;
                momentFollowingVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                if (apiResult.isSuccess()) {
                    Long dateSort = apiResult.getPage().getDateSort();
                    momentFollowingVM.dateSortRecommendPost = dateSort != null ? dateSort.longValue() : 0L;
                    momentFollowingVM.pageIndexRecommendPost = apiResult.getPage().getPageIndex() + 1;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFollowingVM$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadFollowingRecommendList$1$2", f = "MomentFollowingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0363OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingVM f31693OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0363OooO0O0(MomentFollowingVM momentFollowingVM, Continuation<? super C0363OooO0O0> continuation) {
                super(2, continuation);
                this.f31693OooO0Oo = momentFollowingVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0363OooO0O0(this.f31693OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((C0363OooO0O0) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentFollowingVM momentFollowingVM = this.f31693OooO0Oo;
                if (momentFollowingVM.getListData().isEmpty()) {
                    momentFollowingVM.getContentState().setValue(ContentState.Error);
                } else {
                    momentFollowingVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadFollowingRecommendList$1$3", f = "MomentFollowingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nMomentFollowingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentFollowingVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentFollowingVM$loadFollowingRecommendList$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,272:1\n1855#2,2:273\n*S KotlinDebug\n*F\n+ 1 MomentFollowingVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentFollowingVM$loadFollowingRecommendList$1$3\n*L\n162#1:273,2\n*E\n"})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31694OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingVM f31695OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ boolean f31696OooO0o0;

            public static final class OooO00o extends Lambda implements Function1<MomentDetailModel, Boolean> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public static final OooO00o f31697OooO0Oo = new OooO00o();

                public OooO00o() {
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

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentFollowingVM$OooO0O0$OooO0OO$OooO0O0, reason: collision with other inner class name */
            public static final class C0364OooO0O0 extends Lambda implements Function1<MomentDetailModel, Long> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public static final C0364OooO0O0 f31698OooO0Oo = new C0364OooO0O0();

                public C0364OooO0O0() {
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
            public OooO0OO(MomentFollowingVM momentFollowingVM, Continuation continuation, boolean z) {
                super(2, continuation);
                this.f31696OooO0o0 = z;
                this.f31695OooO0o = momentFollowingVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f31695OooO0o, continuation, this.f31696OooO0o0);
                oooO0OO.f31694OooO0Oo = obj;
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
                List list = (List) this.f31694OooO0Oo;
                if (list != null) {
                    Boxing.boxBoolean(CollectionsKt.removeAll(list, (Function1) OooO00o.f31697OooO0Oo));
                }
                boolean z = true;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((MomentDetailModel) it.next()).setFeatured(true);
                    }
                }
                boolean z2 = this.f31696OooO0o0;
                MomentFollowingVM momentFollowingVM = this.f31695OooO0o;
                if (z2) {
                    momentFollowingVM.getListData().clear();
                    momentFollowingVM.getShowRecommendTop().setValue(Boxing.boxBoolean(true));
                }
                if (list != null) {
                    Boxing.boxBoolean(momentFollowingVM.getListData().addAll(list));
                }
                o0000OO0.OooO0OO(momentFollowingVM.getListData(), C0364OooO0O0.f31698OooO0Oo);
                if (list != null && !list.isEmpty()) {
                    z = false;
                }
                if (z || list.size() < Integer.parseInt("15")) {
                    momentFollowingVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    momentFollowingVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Continuation continuation, boolean z) {
            super(2, continuation);
            this.f31689OooO0o = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentFollowingVM.this.new OooO0O0(continuation, this.f31689OooO0o);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31688OooO0Oo;
            MomentFollowingVM momentFollowingVM = MomentFollowingVM.this;
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
            long j = momentFollowingVM.dateSortRecommendPost;
            int i2 = momentFollowingVM.pageIndexRecommendPost;
            this.f31688OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Discovery/RecommendSquare");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(j), "datesort");
            obj = OooOOO.OooO0Oo(new MomentRepository$newMomentRecommendList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(momentFollowingVM, null);
            C0363OooO0O0 c0363OooO0O0 = new C0363OooO0O0(momentFollowingVM, null);
            OooO0OO oooO0OO = new OooO0OO(momentFollowingVM, null, this.f31689OooO0o);
            this.f31688OooO0Oo = 2;
            if (o00O0O.OooO0OO(apiResult, false, oooO00o, c0363OooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadHaveNewPostUser$1", f = "MomentFollowingVM.kt", i = {}, l = {212, 212}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31699OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentFollowingVM$loadHaveNewPostUser$1$1", f = "MomentFollowingVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<List<RecommendNewPostModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31701OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentFollowingVM f31702OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentFollowingVM momentFollowingVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31702OooO0o0 = momentFollowingVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31702OooO0o0, continuation);
                oooO00o.f31701OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<RecommendNewPostModel> list, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List list = (List) this.f31701OooO0Oo;
                MomentFollowingVM momentFollowingVM = this.f31702OooO0o0;
                momentFollowingVM.getHeadUserList().clear();
                if (list != null) {
                    MomentFollowingVM.checkUnreadPost$default(momentFollowingVM, list, false, 2, null);
                    Boxing.boxBoolean(momentFollowingVM.getHeadUserList().addAll(list));
                }
                Function0<Unit> scrollToTop = momentFollowingVM.getScrollToTop();
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
            return MomentFollowingVM.this.new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31699OooO0Oo;
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
            this.f31699OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Moment/DyRecommendUsers");
            obj = OooOOO.OooO0Oo(new MomentRepository$newMomentRecommendUserList$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(MomentFollowingVM.this, null);
            this.f31699OooO0Oo = 2;
            if (o00O0O.OooO0OO(apiResult, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Comparator<RecommendNewPostModel> {
        @Override // java.util.Comparator
        public final int compare(RecommendNewPostModel recommendNewPostModel, RecommendNewPostModel recommendNewPostModel2) {
            RecommendNewPostModel recommendNewPostModel3 = recommendNewPostModel;
            RecommendNewPostModel recommendNewPostModel4 = recommendNewPostModel2;
            if (recommendNewPostModel3 == null || recommendNewPostModel4 == null) {
                return 0;
            }
            if (recommendNewPostModel3.getIsRead() || !recommendNewPostModel4.getIsRead()) {
                if (!recommendNewPostModel3.getIsRead() || recommendNewPostModel4.getIsRead()) {
                    if (recommendNewPostModel3.getIsRead() != recommendNewPostModel4.getIsRead() || recommendNewPostModel3.getMaxDyId() <= recommendNewPostModel4.getMaxDyId()) {
                        if ((recommendNewPostModel3.getIsRead() == recommendNewPostModel4.getIsRead() && recommendNewPostModel3.getMaxDyId() == recommendNewPostModel4.getMaxDyId()) || recommendNewPostModel3.getIsRead() != recommendNewPostModel4.getIsRead() || recommendNewPostModel3.getMaxDyId() >= recommendNewPostModel4.getMaxDyId()) {
                            return 0;
                        }
                    }
                }
                return 1;
            }
            return -1;
        }
    }

    public MomentFollowingVM() {
        Boolean bool = Boolean.FALSE;
        this.showRecommendTop = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.headUserList = SnapshotStateKt.mutableStateListOf();
        this.isUserListChange = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showFollowDialog = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static /* synthetic */ void checkUnreadPost$default(MomentFollowingVM momentFollowingVM, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUnreadPost");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        momentFollowingVM.checkUnreadPost(list, z);
    }

    public static /* synthetic */ void loadFollowingMomentList$default(MomentFollowingVM momentFollowingVM, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFollowingMomentList");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        momentFollowingVM.loadFollowingMomentList(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadFollowingRecommendList(boolean isRefresh) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        isRefreshIng().setValue(Boolean.TRUE);
        if (isRefresh) {
            getLoadMoreState().setValue(LoadMoreState.None);
            this.dateSortRecommendPost = 0L;
            this.pageIndexRecommendPost = 1;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null, isRefresh), 3, null);
    }

    public static /* synthetic */ void loadFollowingRecommendList$default(MomentFollowingVM momentFollowingVM, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadFollowingRecommendList");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        momentFollowingVM.loadFollowingRecommendList(z);
    }

    private final void loadHaveNewPostUser() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.FALSE)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(null), 3, null);
    }

    private final void sortUnreadPost(List<RecommendNewPostModel> data) {
        Collections.sort(data, new OooO0o());
    }

    public final void checkUnreadPost(@NotNull List<RecommendNewPostModel> data, boolean sort) {
        Intrinsics.checkNotNullParameter(data, "data");
        Iterator<T> it = data.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                if (sort) {
                    sortUnreadPost(data);
                }
                MutableState<Boolean> mutableState = this.isUserListChange;
                mutableState.setValue(Boolean.valueOf(!mutableState.getValue().booleanValue()));
                return;
            }
            RecommendNewPostModel recommendNewPostModel = (RecommendNewPostModel) it.next();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String strOooO00o = o0OoOo0.OooO00o();
            if (strOooO00o.length() == 0) {
                return;
            }
            ReadPostTable readPostTableOooO0O0 = o00Oo0.OooO00o().OooOoOO().OooO0O0(Long.parseLong(strOooO00o), recommendNewPostModel.getUserId());
            if ((readPostTableOooO0O0 != null ? readPostTableOooO0O0.getReadPostId() : 0L) != recommendNewPostModel.getMaxDyId()) {
                z = false;
            }
            recommendNewPostModel.setRead(z);
        }
    }

    @NotNull
    public final SnapshotStateList<RecommendNewPostModel> getHeadUserList() {
        return this.headUserList;
    }

    @Nullable
    public final Function0<Unit> getScrollToTop() {
        return this.scrollToTop;
    }

    @NotNull
    public final MutableState<Boolean> getShowFollowDialog() {
        return this.showFollowDialog;
    }

    @NotNull
    public final MutableState<Boolean> getShowRecommendTop() {
        return this.showRecommendTop;
    }

    /* JADX INFO: renamed from: isRecommend, reason: from getter */
    public final boolean getIsRecommend() {
        return this.isRecommend;
    }

    @NotNull
    public final MutableState<Boolean> isUserListChange() {
        return this.isUserListChange;
    }

    public final void loadFollowingMomentList(boolean isRefresh) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        isRefreshIng().setValue(Boolean.TRUE);
        if (isRefresh) {
            getLoadMoreState().setValue(LoadMoreState.None);
            setDateSort(0L);
            setPageIndex(1);
            this.isRecommend = false;
            loadHaveNewPostUser();
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null, isRefresh), 3, null);
    }

    public final void loadFollowingMoreData() {
        if (this.isRecommend) {
            loadFollowingRecommendList(false);
        } else {
            loadFollowingMomentList(false);
        }
    }

    @Override // com.yalla.yalla.ui.vm.moment.BaseMomentVM
    public void postSendSuccess(@Nullable MomentSendModel sendModel) {
        if (sendModel == null) {
            return;
        }
        if (this.isRecommend) {
            loadFollowingMomentList$default(this, false, 1, null);
        } else {
            super.postSendSuccess(sendModel);
        }
    }

    public final void setRecommend(boolean z) {
        this.isRecommend = z;
    }

    public final void setScrollToTop(@Nullable Function0<Unit> function0) {
        this.scrollToTop = function0;
    }

    public final void setUserListChange(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isUserListChange = mutableState;
    }
}
