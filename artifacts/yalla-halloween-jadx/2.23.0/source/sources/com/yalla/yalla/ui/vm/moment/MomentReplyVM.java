package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.repository.MomentRepository;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b5\u00106J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rR+\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R+\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R;\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010*\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R+\u00104\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentReplyVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "moment", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "comment", "", "showCommentReply", "closeCommentReply", "", "it", "setSortTypeAndGetReplays", "getReplays", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "data", "addReply", "", "<set-?>", "showScreenReplay$delegate", "Landroidx/compose/runtime/MutableState;", "getShowScreenReplay", "()Z", "setShowScreenReplay", "(Z)V", "showScreenReplay", "showDialogReplay$delegate", "getShowDialogReplay", "setShowDialogReplay", "showDialogReplay", "Lo00Oo000/OooO0O0;", "replyPagerState$delegate", "getReplyPagerState", "()Lo00Oo000/OooO0O0;", "setReplyPagerState", "(Lo00Oo000/OooO0O0;)V", "replyPagerState", "sortType$delegate", "Landroidx/compose/runtime/MutableIntState;", "getSortType", "()I", "setSortType", "(I)V", "sortType", "", "replyDataSort", "J", "animateScrollToItem$delegate", "Landroidx/compose/runtime/MutableLongState;", "getAnimateScrollToItem", "()J", "setAnimateScrollToItem", "(J)V", "animateScrollToItem", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentReplyVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentReplyVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,110:1\n81#2:111\n107#2,2:112\n81#2:114\n107#2,2:115\n81#2:117\n107#2,2:118\n75#3:120\n108#3,2:121\n76#4:123\n109#4,2:124\n*S KotlinDebug\n*F\n+ 1 MomentReplyVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentReplyVM\n*L\n29#1:111\n29#1:112,2\n31#1:114\n31#1:115,2\n34#1:117\n34#1:118,2\n39#1:120\n39#1:121,2\n98#1:123\n98#1:124,2\n*E\n"})
public final class MomentReplyVM extends BaseMomentDetailVM {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: animateScrollToItem$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableLongState animateScrollToItem;
    private long replyDataSort;

    /* JADX INFO: renamed from: replyPagerState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState replyPagerState;

    /* JADX INFO: renamed from: showDialogReplay$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showDialogReplay;

    /* JADX INFO: renamed from: showScreenReplay$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showScreenReplay;

    /* JADX INFO: renamed from: sortType$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState sortType;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentReplyVM$getReplays$1", f = "MomentReplyVM.kt", i = {0, 0}, l = {73}, m = "invokeSuspend", n = {"momentId", "commentId"}, s = {"J$0", "J$1"})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super p143o00Oo000.OooO<MomentReplyModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f32258OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f32259OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f32260OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ int f32261OooO0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = MomentReplyVM.this.new OooO00o(continuation);
            oooO00o.f32261OooO0oO = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super p143o00Oo000.OooO<MomentReplyModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long j;
            Object objOooO0O0;
            long j2;
            MomentCommentDetailModel currentComment;
            Long dateSort;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32259OooO0o;
            MomentReplyVM momentReplyVM = MomentReplyVM.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f32261OooO0oO;
                if (i2 == 1) {
                    momentReplyVM.replyDataSort = 0L;
                }
                MomentDetailModel currentMomentDetail = momentReplyVM.getCurrentMomentDetail();
                long jOooOO0 = o0OoOo0.OooOO0(currentMomentDetail != null ? Boxing.boxLong(currentMomentDetail.getId()) : null);
                long jOooOO1 = o0OoOo0.OooOO0(momentReplyVM.getCurrentCommentId());
                MomentDetailModel currentMomentDetail2 = momentReplyVM.getCurrentMomentDetail();
                long jOooOO2 = o0OoOo0.OooOO0(currentMomentDetail2 != null ? Boxing.boxLong(currentMomentDetail2.getUserId()) : null);
                int sortType = momentReplyVM.getSortType() == -1 ? 0 : momentReplyVM.getSortType();
                long dateSort2 = momentReplyVM.getDateSort();
                this.f32258OooO0Oo = jOooOO0;
                this.f32260OooO0o0 = jOooOO1;
                this.f32259OooO0o = 1;
                j = jOooOO1;
                objOooO0O0 = MomentRepository.OooO0O0(jOooOO0, jOooOO2, jOooOO1, sortType, dateSort2, i2, this);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j2 = jOooOO0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = this.f32260OooO0o0;
                j2 = this.f32258OooO0Oo;
                ResultKt.throwOnFailure(obj);
                j = j3;
                objOooO0O0 = obj;
            }
            ApiResult apiResult = (ApiResult) objOooO0O0;
            if (apiResult.isSuccess() && (dateSort = apiResult.getPage().getDateSort()) != null) {
                momentReplyVM.replyDataSort = dateSort.longValue();
            }
            if (momentReplyVM.getSortType() == 0) {
                List list = (List) apiResult.getData();
                MomentReplyModel momentReplyModel = (MomentReplyModel) (list == null || list.isEmpty() ? null : list.get(0));
                if (momentReplyModel != null && (currentComment = momentReplyVM.getCurrentComment()) != null) {
                    currentComment.replyFirst(momentReplyModel);
                }
            }
            momentReplyVM.fixReplyHideState((List) apiResult.getData(), Boxing.boxLong(j2), Boxing.boxLong(j));
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    public MomentReplyVM() {
        Boolean bool = Boolean.FALSE;
        this.showScreenReplay = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showDialogReplay = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.replyPagerState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.sortType = SnapshotIntStateKt.mutableIntStateOf(0);
        this.animateScrollToItem = SnapshotLongStateKt.mutableLongStateOf(0L);
    }

    private final void setShowDialogReplay(boolean z) {
        this.showDialogReplay.setValue(Boolean.valueOf(z));
    }

    private final void setShowScreenReplay(boolean z) {
        this.showScreenReplay.setValue(Boolean.valueOf(z));
    }

    private final void setSortType(int i) {
        this.sortType.setIntValue(i);
    }

    public final void addReply(@NotNull MomentReplyModel data) {
        List<MomentReplyModel> list;
        List<MomentReplyModel> list2;
        List<MomentReplyModel> list3;
        Intrinsics.checkNotNullParameter(data, "data");
        MomentDetailModel currentMomentDetail = getCurrentMomentDetail();
        if (currentMomentDetail != null && currentMomentDetail.getId() == data.getLocalMomentId()) {
            Long currentCommentId = getCurrentCommentId();
            long localCommentId = data.getLocalCommentId();
            if (currentCommentId != null && currentCommentId.longValue() == localCommentId) {
                p143o00Oo000.OooO0O0<MomentReplyModel> replyPagerState = getReplyPagerState();
                if ((replyPagerState == null || (list3 = replyPagerState.f37663OooO0Oo) == null || !list3.isEmpty()) ? false : true) {
                    p143o00Oo000.OooO0O0<MomentReplyModel> replyPagerState2 = getReplyPagerState();
                    if (replyPagerState2 != null && (list2 = replyPagerState2.f37663OooO0Oo) != null) {
                        list2.add(data);
                    }
                } else {
                    p143o00Oo000.OooO0O0<MomentReplyModel> replyPagerState3 = getReplyPagerState();
                    if (replyPagerState3 != null && (list = replyPagerState3.f37663OooO0Oo) != null) {
                        list.add(0, data);
                    }
                }
                p143o00Oo000.OooO0O0<MomentReplyModel> replyPagerState4 = getReplyPagerState();
                if (replyPagerState4 != null) {
                    replyPagerState4.OooO0O0();
                }
                setAnimateScrollToItem(System.currentTimeMillis());
            }
        }
    }

    public final void closeCommentReply() {
        setSortType(0);
        setCurrentMomentDetail(null);
        setCurrentComment(null);
        setCurrentCommentId(null);
    }

    public final long getAnimateScrollToItem() {
        return this.animateScrollToItem.getLongValue();
    }

    public final void getReplays() {
        setReplyPagerState(new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final p143o00Oo000.OooO0O0<MomentReplyModel> getReplyPagerState() {
        return (p143o00Oo000.OooO0O0) this.replyPagerState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowDialogReplay() {
        return ((Boolean) this.showDialogReplay.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowScreenReplay() {
        return ((Boolean) this.showScreenReplay.getValue()).booleanValue();
    }

    public final int getSortType() {
        return this.sortType.getIntValue();
    }

    public final void setAnimateScrollToItem(long j) {
        this.animateScrollToItem.setLongValue(j);
    }

    public final void setReplyPagerState(@Nullable p143o00Oo000.OooO0O0<MomentReplyModel> oooO0O0) {
        this.replyPagerState.setValue(oooO0O0);
    }

    public final void setSortTypeAndGetReplays(int it) {
        setSortType(it);
        getReplays();
    }

    public final void showCommentReply(@Nullable MomentDetailModel moment, @NotNull MomentCommentDetailModel comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        setSortType(0);
        setCurrentMomentDetail(moment);
        setCurrentComment(comment);
        setCurrentCommentId(Long.valueOf(comment.getId()));
    }
}
