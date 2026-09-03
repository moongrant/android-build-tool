package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.repository.MomentRepository;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010R/\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR;\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010(\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R(\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0016\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R+\u0010?\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentCommentsVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "", "getComments", "Lcom/yalla/yalla/ui/vm/moment/MomentVideoVM;", "videoVM", "Lcom/yalla/yalla/ui/vm/moment/MomentPraiseVM;", "praiseVM", "Lcom/yalla/yalla/ui/vm/moment/MomentGiftsVM;", "giftVM", "showComment", "closeComment", "", "type", "switchSortType", "refreshData", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "data", "addComment", "", "<set-?>", "momentId$delegate", "Landroidx/compose/runtime/MutableState;", "getMomentId", "()Ljava/lang/Long;", "setMomentId", "(Ljava/lang/Long;)V", "momentId", "Lo00o00oO/o000;", "commentsPagerState$delegate", "getCommentsPagerState", "()Lo00o00oO/o000;", "setCommentsPagerState", "(Lo00o00oO/o000;)V", "commentsPagerState", "commentsSortType$delegate", "getCommentsSortType", "()I", "setCommentsSortType", "(I)V", "commentsSortType", "commentsDataSort", "J", "Landroidx/compose/runtime/MutableState;", "", "isInReward", "()Landroidx/compose/runtime/MutableState;", "setInReward", "(Landroidx/compose/runtime/MutableState;)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "setFlow", "(Lkotlinx/coroutines/flow/MutableSharedFlow;)V", "animateScrollToItem$delegate", "Landroidx/compose/runtime/MutableLongState;", "getAnimateScrollToItem", "()J", "setAnimateScrollToItem", "(J)V", "animateScrollToItem", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentCommentsVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentsVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentCommentsVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,113:1\n81#2:114\n107#2,2:115\n81#2:117\n107#2,2:118\n81#2:120\n107#2,2:121\n76#3:123\n109#3,2:124\n*S KotlinDebug\n*F\n+ 1 MomentCommentsVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentCommentsVM\n*L\n29#1:114\n29#1:115,2\n31#1:117\n31#1:118,2\n36#1:120\n36#1:121,2\n102#1:123\n102#1:124,2\n*E\n"})
public final class MomentCommentsVM extends BaseMomentDetailVM {
    public static final int $stable = 8;
    private long commentsDataSort;

    /* JADX INFO: renamed from: momentId$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState momentId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: commentsPagerState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState commentsPagerState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: commentsSortType$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState commentsSortType = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    @NotNull
    private MutableState<Boolean> isInReward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    private MutableSharedFlow<Object> flow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: animateScrollToItem$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableLongState animateScrollToItem = SnapshotLongStateKt.mutableLongStateOf(0);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentCommentsVM$getComments$1", f = "MomentCommentsVM.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<MomentCommentDetailModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31636OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f31638OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = MomentCommentsVM.this.new OooO00o(continuation);
            oooO00o.f31638OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<MomentCommentDetailModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Long dateSort;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31636OooO0Oo;
            MomentCommentsVM momentCommentsVM = MomentCommentsVM.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f31638OooO0o0;
                if (o0OoOo0.OooOO0(momentCommentsVM.getMomentId()) == 0) {
                    ApiResult apiResult = new ApiResult();
                    apiResult.setCode(1000);
                    return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
                }
                if (i2 == 1) {
                    momentCommentsVM.commentsDataSort = 0L;
                }
                long jOooOO0 = o0OoOo0.OooOO0(momentCommentsVM.getMomentId());
                int commentsSortType = momentCommentsVM.getCommentsSortType() == -1 ? 0 : momentCommentsVM.getCommentsSortType();
                long j = momentCommentsVM.commentsDataSort;
                this.f31636OooO0Oo = 1;
                obj = MomentRepository.OooO00o(commentsSortType, i2, jOooOO0, j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult2 = (ApiResult) obj;
            if (apiResult2.isSuccess() && (dateSort = apiResult2.getPage().getDateSort()) != null) {
                momentCommentsVM.commentsDataSort = dateSort.longValue();
            }
            momentCommentsVM.fixCommentHideState((List) apiResult2.getData(), momentCommentsVM.getMomentId());
            return ApiResult.toPagingLoadResource$default(apiResult2, (List) apiResult2.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentCommentsVM$refreshData$1", f = "MomentCommentsVM.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31639OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentCommentsVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31639OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Object> flow = MomentCommentsVM.this.getFlow();
                Integer numBoxInt = Boxing.boxInt(0);
                this.f31639OooO0Oo = 1;
                if (flow.emit(numBoxInt, this) == coroutine_suspended) {
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

    private final void getComments() {
        setCommentsPagerState(new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Long getMomentId() {
        return (Long) this.momentId.getValue();
    }

    private final void setCommentsSortType(int i) {
        this.commentsSortType.setValue(Integer.valueOf(i));
    }

    private final void setMomentId(Long l) {
        this.momentId.setValue(l);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final void addComment(@NotNull MomentCommentDetailModel data) {
        boolean z;
        List<MomentCommentDetailModel> list;
        List<MomentCommentDetailModel> list2;
        List<MomentCommentDetailModel> list3;
        Intrinsics.checkNotNullParameter(data, "data");
        o000<MomentCommentDetailModel> commentsPagerState = getCommentsPagerState();
        if (commentsPagerState != null && (list3 = commentsPagerState.f38492OooO0Oo) != null) {
            z = list3.isEmpty();
        }
        if (z) {
            o000<MomentCommentDetailModel> commentsPagerState2 = getCommentsPagerState();
            if (commentsPagerState2 != null && (list2 = commentsPagerState2.f38492OooO0Oo) != null) {
                list2.add(data);
            }
        } else {
            o000<MomentCommentDetailModel> commentsPagerState3 = getCommentsPagerState();
            if (commentsPagerState3 != null && (list = commentsPagerState3.f38492OooO0Oo) != null) {
                list.add(0, data);
            }
        }
        o000<MomentCommentDetailModel> commentsPagerState4 = getCommentsPagerState();
        if (commentsPagerState4 != null) {
            commentsPagerState4.OooO0O0();
        }
        setAnimateScrollToItem(System.currentTimeMillis());
    }

    public final void closeComment(@NotNull MomentVideoVM videoVM) {
        Intrinsics.checkNotNullParameter(videoVM, "videoVM");
        setCommentsSortType(0);
        setMomentId(0L);
        videoVM.setCurrentComment(null);
        videoVM.setCurrentCommentId(null);
        videoVM.setReplyUserInfo(null);
        videoVM.getShowDialogComment().setValue(Boolean.FALSE);
    }

    public final long getAnimateScrollToItem() {
        return this.animateScrollToItem.getLongValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final o000<MomentCommentDetailModel> getCommentsPagerState() {
        return (o000) this.commentsPagerState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getCommentsSortType() {
        return ((Number) this.commentsSortType.getValue()).intValue();
    }

    @NotNull
    public final MutableSharedFlow<Object> getFlow() {
        return this.flow;
    }

    @NotNull
    public final MutableState<Boolean> isInReward() {
        return this.isInReward;
    }

    public final void refreshData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null), 3, null);
    }

    public final void setAnimateScrollToItem(long j) {
        this.animateScrollToItem.setLongValue(j);
    }

    public final void setCommentsPagerState(@Nullable o000<MomentCommentDetailModel> o000Var) {
        this.commentsPagerState.setValue(o000Var);
    }

    public final void setFlow(@NotNull MutableSharedFlow<Object> mutableSharedFlow) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<set-?>");
        this.flow = mutableSharedFlow;
    }

    public final void setInReward(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isInReward = mutableState;
    }

    public final void showComment(@NotNull MomentVideoVM videoVM, @NotNull MomentPraiseVM praiseVM, @NotNull MomentGiftsVM giftVM) {
        Intrinsics.checkNotNullParameter(videoVM, "videoVM");
        Intrinsics.checkNotNullParameter(praiseVM, "praiseVM");
        Intrinsics.checkNotNullParameter(giftVM, "giftVM");
        setCommentsSortType(0);
        MomentDetailModel currentMomentDetail = videoVM.getCurrentMomentDetail();
        setMomentId(Long.valueOf(o0OoOo0.OooOO0(currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null)));
        getComments();
        praiseVM.initMomentId(getMomentId());
        giftVM.initMomentId(getMomentId());
        videoVM.getShowMomentVideoContentPopInitialPage().setValue(0);
        videoVM.getShowDialogComment().setValue(Boolean.TRUE);
    }

    public final void switchSortType(int type) {
        setCommentsSortType(type);
        getComments();
    }
}
