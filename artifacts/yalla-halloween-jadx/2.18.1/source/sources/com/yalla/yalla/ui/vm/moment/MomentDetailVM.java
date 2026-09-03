package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import code.easy.contentstate.ContentState;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import java.util.Collection;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p520o0o0O0O0.o000O00O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010G\u001a\u00020$¢\u0006\u0004\bH\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\nJ\u0006\u0010\u0013\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\nR+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR+\u0010*\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020$8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u00101\u001a\u00020+2\u0006\u0010\u0018\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R+\u0010=\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001a\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001eR+\u0010C\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010\u001a\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010D\u001a\b\u0012\u0004\u0012\u00020$028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00105\u001a\u0004\bE\u00107\"\u0004\bF\u00109¨\u0006I"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentDetailVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "", ShareConstants.RESULT_POST_ID, "", "getMomentDetail", "commentId", "getMomentCommentDetail", "toTopIn", "toDelete", "", "isShowHot", "isShowTopIn", "isShowRoleOfficial", "isShowIdentity", "isShowFriends", "isShowPower", "isShowYallaTeam", "isShowFollow", "isShowMore", "isShowVip", "isShowKaVip", "isShowMedal", "Lcode/easy/contentstate/ContentState;", "<set-?>", "momentDetailState$delegate", "Lo000oOoO/o0O00OO;", "getMomentDetailState", "()Lcode/easy/contentstate/ContentState;", "setMomentDetailState", "(Lcode/easy/contentstate/ContentState;)V", "momentDetailState", "momentCommentListState$delegate", "getMomentCommentListState", "setMomentCommentListState", "momentCommentListState", "Lcom/yalla/yalla/model/MomentDetailModel;", "momentDetailModel$delegate", "getMomentDetailModel", "()Lcom/yalla/yalla/model/MomentDetailModel;", "setMomentDetailModel", "(Lcom/yalla/yalla/model/MomentDetailModel;)V", "momentDetailModel", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "momentAdapterTag$delegate", "getMomentAdapterTag", "()Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "setMomentAdapterTag", "(Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;)V", "momentAdapterTag", "LOooooo0/o00OO0OO;", "Lcom/yalla/yalla/model/PostCommentDetailModel;", "momentCommentListModel", "LOooooo0/o00OO0OO;", "getMomentCommentListModel", "()LOooooo0/o00OO0OO;", "setMomentCommentListModel", "(LOooooo0/o00OO0OO;)V", "momentEditRecordState$delegate", "getMomentEditRecordState", "setMomentEditRecordState", "momentEditRecordState", "momentId$delegate", "getMomentId", "()J", "setMomentId", "(J)V", "momentId", "momentEditRecordModel", "getMomentEditRecordModel", "setMomentEditRecordModel", "_postDetailModel", "<init>", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentDetailVM extends MomentVM {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: momentAdapterTag$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO momentAdapterTag;

    @NotNull
    private o00OO0OO<PostCommentDetailModel> momentCommentListModel;

    /* JADX INFO: renamed from: momentCommentListState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO momentCommentListState;

    /* JADX INFO: renamed from: momentDetailModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO momentDetailModel;

    /* JADX INFO: renamed from: momentDetailState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO momentDetailState;

    @NotNull
    private o00OO0OO<MomentDetailModel> momentEditRecordModel;

    /* JADX INFO: renamed from: momentEditRecordState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO momentEditRecordState;

    /* JADX INFO: renamed from: momentId$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO momentId;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentDetailVM$getMomentCommentDetail$1", f = "MomentDetailVM.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25693Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f25694Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailVM f25695Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, MomentDetailVM momentDetailVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25694Oooo0oO = j;
            this.f25695Oooo0oo = momentDetailVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25694Oooo0oO, this.f25695Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ContentState contentState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25693Oooo0o;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000O00O o000o00o2 = o000O00O.f42470OooO00o;
                long j = this.f25694Oooo0oO;
                this.f25693Oooo0o = 1;
                obj = o000o00o2.OooO0o(j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MomentDetailVM momentDetailVM = this.f25695Oooo0oo;
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                momentDetailVM.getMomentCommentListModel().clear();
                List list = (List) apiResult.getData();
                if (list != null) {
                    Boxing.boxBoolean(momentDetailVM.getMomentCommentListModel().addAll(list));
                }
                Collection collection = (Collection) apiResult.getData();
                if (collection != null && !collection.isEmpty()) {
                    z = false;
                }
                contentState = z ? ContentState.Empty : ContentState.Content;
            } else {
                contentState = ContentState.Error;
            }
            momentDetailVM.setMomentCommentListState(contentState);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentDetailVM$getMomentDetail$1", f = "MomentDetailVM.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25696Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f25697Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailVM f25698Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, MomentDetailVM momentDetailVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25697Oooo0oO = j;
            this.f25698Oooo0oo = momentDetailVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25697Oooo0oO, this.f25698Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ContentState contentState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25696Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000O00O o000o00o2 = o000O00O.f42470OooO00o;
                String strValueOf = String.valueOf(this.f25697Oooo0oO);
                this.f25696Oooo0o = 1;
                obj = o000o00o2.OooOOOO(strValueOf, 0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MomentDetailVM momentDetailVM = this.f25698Oooo0oo;
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                MomentDetailModel momentDetailModel = (MomentDetailModel) apiResult.getData();
                if (momentDetailModel != null) {
                    momentDetailVM.setMomentDetailModel(momentDetailModel);
                }
                contentState = apiResult.getData() == null ? ContentState.Empty : ContentState.Content;
            } else {
                contentState = ContentState.Error;
            }
            momentDetailVM.setMomentDetailState(contentState);
            return Unit.INSTANCE;
        }
    }

    public MomentDetailVM(@NotNull MomentDetailModel _postDetailModel) {
        Intrinsics.checkNotNullParameter(_postDetailModel, "_postDetailModel");
        ContentState contentState = ContentState.Loading;
        this.momentDetailState = o0OOO00.OooO0Oo(contentState);
        this.momentCommentListState = o0OOO00.OooO0Oo(contentState);
        this.momentDetailModel = o0OOO00.OooO0Oo(_postDetailModel);
        this.momentAdapterTag = o0OOO00.OooO0Oo(MomentAdapterTag.PostDetailActivity);
        this.momentCommentListModel = new o00OO0OO<>();
        this.momentEditRecordState = o0OOO00.OooO0Oo(contentState);
        this.momentId = o0OOO00.OooO0Oo(Long.valueOf(_postDetailModel.getId()));
        this.momentEditRecordModel = new o00OO0OO<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentAdapterTag getMomentAdapterTag() {
        return (MomentAdapterTag) this.momentAdapterTag.getValue();
    }

    public final void getMomentCommentDetail(long commentId) {
        setMomentCommentListState(ContentState.Loading);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(commentId, this, null), 2, null);
    }

    @NotNull
    public final o00OO0OO<PostCommentDetailModel> getMomentCommentListModel() {
        return this.momentCommentListModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getMomentCommentListState() {
        return (ContentState) this.momentCommentListState.getValue();
    }

    public final void getMomentDetail(long postId) {
        setMomentDetailState(ContentState.Loading);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(postId, this, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final MomentDetailModel getMomentDetailModel() {
        return (MomentDetailModel) this.momentDetailModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getMomentDetailState() {
        return (ContentState) this.momentDetailState.getValue();
    }

    @NotNull
    public final o00OO0OO<MomentDetailModel> getMomentEditRecordModel() {
        return this.momentEditRecordModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getMomentEditRecordState() {
        return (ContentState) this.momentEditRecordState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getMomentId() {
        return ((Number) this.momentId.getValue()).longValue();
    }

    public final boolean isShowFollow() {
        return true;
    }

    public final boolean isShowFriends() {
        return true;
    }

    public final boolean isShowHot() {
        return true;
    }

    public final boolean isShowIdentity() {
        return true;
    }

    public final boolean isShowKaVip() {
        return true;
    }

    public final boolean isShowMedal() {
        return true;
    }

    public final boolean isShowMore() {
        return true;
    }

    public final boolean isShowPower() {
        return true;
    }

    public final boolean isShowRoleOfficial() {
        return true;
    }

    public final boolean isShowTopIn() {
        return true;
    }

    public final boolean isShowVip() {
        return true;
    }

    public final boolean isShowYallaTeam() {
        return true;
    }

    public final void setMomentAdapterTag(@NotNull MomentAdapterTag momentAdapterTag) {
        Intrinsics.checkNotNullParameter(momentAdapterTag, "<set-?>");
        this.momentAdapterTag.setValue(momentAdapterTag);
    }

    public final void setMomentCommentListModel(@NotNull o00OO0OO<PostCommentDetailModel> o00oo0oo) {
        Intrinsics.checkNotNullParameter(o00oo0oo, "<set-?>");
        this.momentCommentListModel = o00oo0oo;
    }

    public final void setMomentCommentListState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.momentCommentListState.setValue(contentState);
    }

    public final void setMomentDetailModel(@NotNull MomentDetailModel momentDetailModel) {
        Intrinsics.checkNotNullParameter(momentDetailModel, "<set-?>");
        this.momentDetailModel.setValue(momentDetailModel);
    }

    public final void setMomentDetailState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.momentDetailState.setValue(contentState);
    }

    public final void setMomentEditRecordModel(@NotNull o00OO0OO<MomentDetailModel> o00oo0oo) {
        Intrinsics.checkNotNullParameter(o00oo0oo, "<set-?>");
        this.momentEditRecordModel = o00oo0oo;
    }

    public final void setMomentEditRecordState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.momentEditRecordState.setValue(contentState);
    }

    public final void setMomentId(long j) {
        this.momentId.setValue(Long.valueOf(j));
    }

    public final void toDelete() {
    }

    public final void toTopIn() {
    }
}
