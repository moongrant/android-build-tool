package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.model.ReadPostTable;
import com.yalla.yalla.data.repository.MomentRepository;
import com.yalla.yalla.data.repository.TopicInfoRepository$loadUserTopicListCount3$$inlined$call$1;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.user.UserMomentListType;
import com.yalla.yalla.model.user.UserMomentListTypeModel;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O000;
import p385o0OOooOO.o00oOoo;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u000207H\u0002J@\u00108\u001a\u00020\u00192\u0006\u0010+\u001a\u00020$2\u0006\u00109\u001a\u00020:2 \b\u0002\u0010;\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190=\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010<ø\u0001\u0000¢\u0006\u0002\u0010?J8\u0010@\u001a\u00020\u00192\u0006\u00109\u001a\u00020:2 \b\u0002\u0010;\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190=\u0012\u0006\u0012\u0004\u0018\u00010>\u0018\u00010<ø\u0001\u0000¢\u0006\u0002\u0010AR/\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R/\u0010%\u001a\u0004\u0018\u00010$2\b\u0010\u0003\u001a\u0004\u0018\u00010$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u000b\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010+\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentUserListVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "()V", "<set-?>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "layoutCoordinates$delegate", "Landroidx/compose/runtime/MutableState;", "screenCurrent", "Landroidx/compose/runtime/MutableState;", "Lcom/yalla/yalla/model/user/UserMomentListTypeModel;", "getScreenCurrent", "()Landroidx/compose/runtime/MutableState;", "setScreenCurrent", "(Landroidx/compose/runtime/MutableState;)V", "screenList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getScreenList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "scrollToTop", "Lkotlin/Function0;", "", "getScrollToTop", "()Lkotlin/jvm/functions/Function0;", "setScrollToTop", "(Lkotlin/jvm/functions/Function0;)V", "toUserId", "Landroidx/compose/runtime/MutableLongState;", "getToUserId", "()Landroidx/compose/runtime/MutableLongState;", "setToUserId", "(Landroidx/compose/runtime/MutableLongState;)V", "", "topPostDetailId", "getTopPostDetailId", "()Ljava/lang/Long;", "setTopPostDetailId", "(Ljava/lang/Long;)V", "topPostDetailId$delegate", "topPostId", "getTopPostId", "()J", "setTopPostId", "(J)V", "topPostId$delegate", "Landroidx/compose/runtime/MutableLongState;", "topicList3", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "getTopicList3", "loadUserTopicListCount3", "toUserid", "", "setTopicDetailTopPostId", "isRefresh", "", "onFinish", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(JZLkotlin/jvm/functions/Function1;)V", "userMomentList", "(ZLkotlin/jvm/functions/Function1;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentUserListVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentUserListVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentUserListVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,169:1\n81#2:170\n107#2,2:171\n81#2:176\n107#2,2:177\n76#3:173\n109#3,2:174\n*S KotlinDebug\n*F\n+ 1 MomentUserListVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentUserListVM\n*L\n38#1:170\n38#1:171,2\n45#1:176\n45#1:177,2\n41#1:173\n41#1:174,2\n*E\n"})
public final class MomentUserListVM extends BaseMomentVM {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: layoutCoordinates$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState layoutCoordinates;

    @NotNull
    private MutableState<UserMomentListTypeModel> screenCurrent;

    @NotNull
    private final SnapshotStateList<UserMomentListTypeModel> screenList;

    @Nullable
    private Function0<Unit> scrollToTop;

    /* JADX INFO: renamed from: topPostDetailId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState topPostDetailId;

    /* JADX INFO: renamed from: topPostId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableLongState topPostId;

    @NotNull
    private MutableLongState toUserId = SnapshotLongStateKt.mutableLongStateOf(0);

    @NotNull
    private final SnapshotStateList<TopicInfoModel> topicList3 = SnapshotStateKt.mutableStateListOf();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentUserListVM$loadUserTopicListCount3$1", f = "MomentUserListVM.kt", i = {}, l = {120, 120}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32290OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentUserListVM f32291OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f32292OooO0o0;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentUserListVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentUserListVM$loadUserTopicListCount3$1$1", f = "MomentUserListVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0367OooO00o extends SuspendLambda implements Function2<List<TopicInfoModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32293OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentUserListVM f32294OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0367OooO00o(MomentUserListVM momentUserListVM, Continuation<? super C0367OooO00o> continuation) {
                super(2, continuation);
                this.f32294OooO0o0 = momentUserListVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0367OooO00o c0367OooO00o = new C0367OooO00o(this.f32294OooO0o0, continuation);
                c0367OooO00o.f32293OooO0Oo = obj;
                return c0367OooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<TopicInfoModel> list, Continuation<? super Unit> continuation) {
                return ((C0367OooO00o) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List list = (List) this.f32293OooO0Oo;
                MomentUserListVM momentUserListVM = this.f32294OooO0o0;
                momentUserListVM.getTopicList3().clear();
                if (list != null) {
                    if (list.size() <= 3) {
                        momentUserListVM.getTopicList3().addAll(list);
                    } else {
                        momentUserListVM.getTopicList3().addAll(list.subList(0, 3));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, MomentUserListVM momentUserListVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32292OooO0o0 = str;
            this.f32291OooO0o = momentUserListVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f32292OooO0o0, this.f32291OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32290OooO0Oo;
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
            this.f32290OooO0Oo = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo(o0000O.f44161o0000o0o);
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(1), "pageindex");
            o0o0oooOooO00o.OooO0O0(this.f32292OooO0o0, "touserid");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(0), "type");
            obj = OooOOO.OooO0Oo(new TopicInfoRepository$loadUserTopicListCount3$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            C0367OooO00o c0367OooO00o = new C0367OooO00o(this.f32291OooO0o, null);
            this.f32290OooO0Oo = 2;
            if (o000O000.OooO0OO(apiResult, false, null, null, c0367OooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentUserListVM$userMomentList$1", f = "MomentUserListVM.kt", i = {}, l = {63, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32295OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f32296OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f32298OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentUserListVM$userMomentList$1$1", f = "MomentUserListVM.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<ApiResult<List<MomentDetailModel>>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f32299OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ MomentUserListVM f32300OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public /* synthetic */ Object f32301OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ Function1<Continuation<? super Unit>, Object> f32302OooO0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(MomentUserListVM momentUserListVM, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f32300OooO0o = momentUserListVM;
                this.f32302OooO0oO = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f32300OooO0o, this.f32302OooO0oO, continuation);
                oooO00o.f32301OooO0o0 = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiResult<List<MomentDetailModel>> apiResult, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(apiResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f32299OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ApiResult apiResult = (ApiResult) this.f32301OooO0o0;
                    MomentUserListVM momentUserListVM = this.f32300OooO0o;
                    momentUserListVM.isRefreshIng().setValue(Boxing.boxBoolean(false));
                    if (apiResult.isSuccess()) {
                        Long dateSort = apiResult.getPage().getDateSort();
                        momentUserListVM.setDateSort(dateSort != null ? dateSort.longValue() : 0L);
                        momentUserListVM.setPageIndex(apiResult.getPage().getPageIndex() + 1);
                    }
                    Function1<Continuation<? super Unit>, Object> function1 = this.f32302OooO0oO;
                    if (function1 != null) {
                        this.f32299OooO0Oo = 1;
                        if (function1.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.MomentUserListVM$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentUserListVM$userMomentList$1$2", f = "MomentUserListVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0368OooO0O0 extends SuspendLambda implements Function2<ApiError, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentUserListVM f32303OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0368OooO0O0(MomentUserListVM momentUserListVM, Continuation<? super C0368OooO0O0> continuation) {
                super(2, continuation);
                this.f32303OooO0Oo = momentUserListVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0368OooO0O0(this.f32303OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiError apiError, Continuation<? super Unit> continuation) {
                return ((C0368OooO0O0) create(apiError, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentUserListVM momentUserListVM = this.f32303OooO0Oo;
                if (momentUserListVM.getListData().isEmpty()) {
                    momentUserListVM.getContentState().setValue(ContentState.Error);
                } else {
                    momentUserListVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                }
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentUserListVM$userMomentList$1$3", f = "MomentUserListVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0OO extends SuspendLambda implements Function2<List<MomentDetailModel>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32304OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ boolean f32305OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentUserListVM f32306OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(MomentUserListVM momentUserListVM, boolean z, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f32306OooO0o0 = momentUserListVM;
                this.f32305OooO0o = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0OO oooO0OO = new OooO0OO(this.f32306OooO0o0, this.f32305OooO0o, continuation);
                oooO0OO.f32304OooO0Oo = obj;
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
                List<MomentDetailModel> list = (List) this.f32304OooO0Oo;
                MomentUserListVM momentUserListVM = this.f32306OooO0o0;
                if (momentUserListVM.getPageIndex() == 1) {
                    if ((list == null || list.isEmpty()) ? false : true) {
                        ReadPostTable readPostTable = new ReadPostTable();
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        readPostTable.setCid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
                        readPostTable.setUserId(momentUserListVM.getToUserId().getValue().longValue());
                        readPostTable.setReadPostId(((MomentDetailModel) list.get(0)).getId());
                        if (((MomentDetailModel) list.get(0)).isTop() && list.size() > 1) {
                            readPostTable.setReadPostId(((MomentDetailModel) list.get(1)).getId());
                        }
                        o000OOo.OooO00o().OooOoO().OooO00o(readPostTable);
                        LiveEventBus.get("POST_READ_NEW").post(momentUserListVM.getToUserId().getValue());
                    }
                }
                momentUserListVM.getContentState().setValue(ContentState.Content);
                if (list != null) {
                    for (MomentDetailModel momentDetailModel : list) {
                        if (momentDetailModel.isTop()) {
                            momentUserListVM.setTopPostId(momentDetailModel.getId());
                        }
                    }
                    if (this.f32305OooO0o) {
                        momentUserListVM.getListData().clear();
                    }
                    momentUserListVM.getListData().addAll(list);
                }
                if (list == null || list.isEmpty()) {
                    momentUserListVM.getLoadMoreState().setValue(LoadMoreState.NoMore);
                } else {
                    momentUserListVM.getLoadMoreState().setValue(LoadMoreState.Loading);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super Continuation<? super Unit>, ? extends Object> function1, boolean z, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32296OooO0o = function1;
            this.f32298OooO0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentUserListVM.this.new OooO0O0(this.f32296OooO0o, this.f32298OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32295OooO0Oo;
            MomentUserListVM momentUserListVM = MomentUserListVM.this;
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
            long jLongValue = momentUserListVM.getToUserId().getValue().longValue();
            long dateSort = momentUserListVM.getDateSort();
            int pageIndex = momentUserListVM.getPageIndex();
            int type = momentUserListVM.getScreenCurrent().getValue().getType();
            this.f32295OooO0Oo = 1;
            obj = MomentRepository.OooO0OO(jLongValue, dateSort, pageIndex, 0, type, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(momentUserListVM, this.f32296OooO0o, null);
            C0368OooO0O0 c0368OooO0O0 = new C0368OooO0O0(momentUserListVM, null);
            OooO0OO oooO0OO = new OooO0OO(momentUserListVM, this.f32298OooO0oO, null);
            this.f32295OooO0Oo = 2;
            if (o000O000.OooO0OO(apiResult, false, oooO00o, c0368OooO0O0, oooO0OO, this, 1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public MomentUserListVM() {
        SnapshotStateList<UserMomentListTypeModel> snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
        UserMomentListType userMomentListType = UserMomentListType.INSTANCE;
        snapshotStateListMutableStateListOf.add(userMomentListType.getAll());
        snapshotStateListMutableStateListOf.add(userMomentListType.getImage());
        snapshotStateListMutableStateListOf.add(userMomentListType.getVideo());
        this.screenList = snapshotStateListMutableStateListOf;
        this.screenCurrent = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotStateListMutableStateListOf.get(0), null, 2, null);
        this.layoutCoordinates = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.topPostId = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.topPostDetailId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final void loadUserTopicListCount3(String toUserid) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(toUserid, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTopicDetailTopPostId$default(MomentUserListVM momentUserListVM, long j, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        momentUserListVM.setTopicDetailTopPostId(j, z, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void userMomentList$default(MomentUserListVM momentUserListVM, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        momentUserListVM.userMomentList(z, function1);
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        return (LayoutCoordinates) this.layoutCoordinates.getValue();
    }

    @NotNull
    public final MutableState<UserMomentListTypeModel> getScreenCurrent() {
        return this.screenCurrent;
    }

    @NotNull
    public final SnapshotStateList<UserMomentListTypeModel> getScreenList() {
        return this.screenList;
    }

    @Nullable
    public final Function0<Unit> getScrollToTop() {
        return this.scrollToTop;
    }

    @NotNull
    public final MutableLongState getToUserId() {
        return this.toUserId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Long getTopPostDetailId() {
        return (Long) this.topPostDetailId.getValue();
    }

    public final long getTopPostId() {
        return this.topPostId.getLongValue();
    }

    @NotNull
    public final SnapshotStateList<TopicInfoModel> getTopicList3() {
        return this.topicList3;
    }

    public final void setLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates.setValue(layoutCoordinates);
    }

    public final void setScreenCurrent(@NotNull MutableState<UserMomentListTypeModel> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.screenCurrent = mutableState;
    }

    public final void setScrollToTop(@Nullable Function0<Unit> function0) {
        this.scrollToTop = function0;
    }

    public final void setToUserId(@NotNull MutableLongState mutableLongState) {
        Intrinsics.checkNotNullParameter(mutableLongState, "<set-?>");
        this.toUserId = mutableLongState;
    }

    public final void setTopPostDetailId(@Nullable Long l) {
        this.topPostDetailId.setValue(l);
    }

    public final void setTopPostId(long j) {
        this.topPostId.setLongValue(j);
    }

    public final void setTopicDetailTopPostId(long topPostId, boolean isRefresh, @Nullable Function1<? super Continuation<? super Unit>, ? extends Object> onFinish) {
        setTopPostId(topPostId);
        if (isRefresh) {
            userMomentList(true, onFinish);
        }
    }

    public final void userMomentList(boolean isRefresh, @Nullable Function1<? super Continuation<? super Unit>, ? extends Object> onFinish) {
        if (isRefreshIng().getValue().booleanValue()) {
            return;
        }
        isRefreshIng().setValue(Boolean.TRUE);
        if (isRefresh) {
            loadUserTopicListCount3(String.valueOf(this.toUserId.getValue().longValue()));
            getLoadMoreState().setValue(LoadMoreState.None);
            setPageIndex(1);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(onFinish, isRefresh, null), 3, null);
    }
}
