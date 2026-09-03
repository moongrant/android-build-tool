package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.repository.MomentRepository;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentReplyModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0+0*2\u0006\u0010,\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R+\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentReplyActivityVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "()V", "commentId", "", "getCommentId", "()J", "setCommentId", "(J)V", "delayMillsCommentMessageChangeColor", "", "getDelayMillsCommentMessageChangeColor", "()I", "isFromPostDetail", "", "()Z", "setFromPostDetail", "(Z)V", "momentId", "", "getMomentId", "()Ljava/lang/String;", "setMomentId", "(Ljava/lang/String;)V", "momentUserId", "getMomentUserId", "setMomentUserId", "postCommentSonModel", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "getPostCommentSonModel", "()Lcom/yalla/yalla/model/moment/MomentReplyModel;", "setPostCommentSonModel", "(Lcom/yalla/yalla/model/moment/MomentReplyModel;)V", "replyDataSort", "<set-?>", "sortType", "getSortType", "setSortType", "(I)V", "sortType$delegate", "Landroidx/compose/runtime/MutableIntState;", "getReplays", "Lcom/yalla/yalla/model/http/ApiResult;", "", "refresh", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentReplyActivityVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyActivityVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentReplyActivityVM\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,72:1\n75#2:73\n108#2,2:74\n*S KotlinDebug\n*F\n+ 1 MomentReplyActivityVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentReplyActivityVM\n*L\n42#1:73\n42#1:74,2\n*E\n"})
public final class MomentReplyActivityVM extends BaseMomentVM {
    public static final int $stable = 8;
    private long commentId;
    private boolean isFromPostDetail;
    private long momentUserId;

    @Nullable
    private MomentReplyModel postCommentSonModel;
    private long replyDataSort;

    @NotNull
    private String momentId = "";
    private final int delayMillsCommentMessageChangeColor = 1400;

    /* JADX INFO: renamed from: sortType$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState sortType = SnapshotIntStateKt.mutableIntStateOf(0);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentReplyActivityVM", f = "MomentReplyActivityVM.kt", i = {0}, l = {50}, m = "getReplays", n = {"this"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MomentReplyActivityVM f32254OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32256OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f32257OooO0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32256OooO0o0 = obj;
            this.f32257OooO0oO |= Integer.MIN_VALUE;
            return MomentReplyActivityVM.this.getReplays(false, this);
        }
    }

    public final long getCommentId() {
        return this.commentId;
    }

    public final int getDelayMillsCommentMessageChangeColor() {
        return this.delayMillsCommentMessageChangeColor;
    }

    @NotNull
    public final String getMomentId() {
        return this.momentId;
    }

    public final long getMomentUserId() {
        return this.momentUserId;
    }

    @Nullable
    public final MomentReplyModel getPostCommentSonModel() {
        return this.postCommentSonModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object getReplays(boolean z, @NotNull Continuation<? super ApiResult<List<MomentReplyModel>>> continuation) {
        OooO00o oooO00o;
        MomentReplyActivityVM momentReplyActivityVM;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f32257OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f32257OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        OooO00o oooO00o2 = oooO00o;
        Object objOooO0O0 = oooO00o2.f32256OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o2.f32257OooO0oO;
        boolean z2 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0O0);
            if (z) {
                this.replyDataSort = 0L;
                setPageIndex(1);
            }
            long jOooO = o0OoOo0.OooO(0L, this.momentId);
            long jOooOO0 = o0OoOo0.OooOO0(Boxing.boxLong(this.momentUserId));
            long jOooOO1 = o0OoOo0.OooOO0(Boxing.boxLong(this.commentId));
            int sortType = getSortType() == -1 ? 0 : getSortType();
            long j = this.replyDataSort;
            int pageIndex = getPageIndex();
            oooO00o2.f32254OooO0Oo = this;
            oooO00o2.f32257OooO0oO = 1;
            objOooO0O0 = MomentRepository.OooO0O0(jOooO, jOooOO0, jOooOO1, sortType, j, pageIndex, oooO00o2);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            momentReplyActivityVM = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            momentReplyActivityVM = oooO00o2.f32254OooO0Oo;
            ResultKt.throwOnFailure(objOooO0O0);
        }
        ApiResult apiResult = (ApiResult) objOooO0O0;
        if (apiResult.isSuccess()) {
            momentReplyActivityVM.setPageIndex(apiResult.getPage().getPageIndex() + 1);
            Long dateSort = apiResult.getPage().getDateSort();
            if (dateSort != null) {
                momentReplyActivityVM.replyDataSort = dateSort.longValue();
            }
        }
        if (momentReplyActivityVM.getSortType() == 0) {
            List list = (List) apiResult.getData();
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            MomentReplyModel momentReplyModel = (MomentReplyModel) (z2 ? null : list.get(0));
            if (momentReplyModel != null) {
                LiveEventBus.get("COMMENT_REPLY_FIRST_REFRESH").post(momentReplyModel);
            }
        }
        return apiResult;
    }

    public final int getSortType() {
        return this.sortType.getIntValue();
    }

    /* JADX INFO: renamed from: isFromPostDetail, reason: from getter */
    public final boolean getIsFromPostDetail() {
        return this.isFromPostDetail;
    }

    public final void setCommentId(long j) {
        this.commentId = j;
    }

    public final void setFromPostDetail(boolean z) {
        this.isFromPostDetail = z;
    }

    public final void setMomentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.momentId = str;
    }

    public final void setMomentUserId(long j) {
        this.momentUserId = j;
    }

    public final void setPostCommentSonModel(@Nullable MomentReplyModel momentReplyModel) {
        this.postCommentSonModel = momentReplyModel;
    }

    public final void setSortType(int i) {
        this.sortType.setIntValue(i);
    }
}
