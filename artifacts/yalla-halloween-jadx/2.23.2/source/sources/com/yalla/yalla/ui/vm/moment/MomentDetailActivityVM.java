package com.yalla.yalla.ui.vm.moment;

import android.content.Intent;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.MomentRepository$getPollInfo$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentPoll;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DJ\u0006\u0010E\u001a\u00020BJ(\u0010F\u001a\u00020B2\u0006\u0010G\u001a\u00020H2\u0016\b\u0002\u0010I\u001a\u0010\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020B\u0018\u00010JH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010'\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\"\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001b\"\u0004\b-\u0010\u001dR\u001c\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR/\u0010;\u001a\u0004\u0018\u00010:2\b\u0010\u000f\u001a\u0004\u0018\u00010:8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010\u0016\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006L"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentDetailActivityVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "()V", "fromDbMid", "", "getFromDbMid", "()Ljava/lang/String;", "setFromDbMid", "(Ljava/lang/String;)V", "giftListType", "", "getGiftListType", "()I", "setGiftListType", "(I)V", "<set-?>", "", "isExpand", "()Z", "setExpand", "(Z)V", "isExpand$delegate", "Landroidx/compose/runtime/MutableState;", "isRefreshDataSuccess", "setRefreshDataSuccess", "isSelfPost", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/runtime/MutableState;", "setSelfPost", "(Landroidx/compose/runtime/MutableState;)V", "mIsExpandedHeadView", "getMIsExpandedHeadView", "setMIsExpandedHeadView", "mIsFromTopicDetail", "getMIsFromTopicDetail", "setMIsFromTopicDetail", "mIsInRoom", "getMIsInRoom", "setMIsInRoom", "mIsShowKeyboard", "getMIsShowKeyboard", "setMIsShowKeyboard", "mPostDetailModel", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "getMPostDetailModel", "setMPostDetailModel", "mSessionId", "getMSessionId", "setMSessionId", "postCommentDetailModel", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "getPostCommentDetailModel", "()Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "setPostCommentDetailModel", "(Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;)V", "sourceTypeMomentDetail", "getSourceTypeMomentDetail", "setSourceTypeMomentDetail", "Lcom/yalla/yalla/data/db/table/UserInfo;", "tempAtUser", "getTempAtUser", "()Lcom/yalla/yalla/data/db/table/UserInfo;", "setTempAtUser", "(Lcom/yalla/yalla/data/db/table/UserInfo;)V", "tempAtUser$delegate", "initIntent", "", "intent", "Landroid/content/Intent;", "onRefreshData", "onRefreshPoll", "pollId", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Lcom/yalla/yalla/model/moment/MomentPoll;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentDetailActivityVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailActivityVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentDetailActivityVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,124:1\n81#2:125\n107#2,2:126\n81#2:128\n107#2,2:129\n*S KotlinDebug\n*F\n+ 1 MomentDetailActivityVM.kt\ncom/yalla/yalla/ui/vm/moment/MomentDetailActivityVM\n*L\n52#1:125\n52#1:126,2\n58#1:128\n58#1:129,2\n*E\n"})
public final class MomentDetailActivityVM extends BaseMomentDetailVM {
    public static final int $stable = 8;

    @Nullable
    private String fromDbMid;

    /* JADX INFO: renamed from: isExpand$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isExpand;
    private boolean isRefreshDataSuccess;

    @NotNull
    private MutableState<Boolean> isSelfPost;
    private boolean mIsExpandedHeadView;
    private boolean mIsFromTopicDetail;
    private boolean mIsInRoom;
    private boolean mIsShowKeyboard;

    @Nullable
    private MomentCommentDetailModel postCommentDetailModel;
    private int sourceTypeMomentDetail;

    /* JADX INFO: renamed from: tempAtUser$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState tempAtUser;

    @NotNull
    private MutableState<MomentDetailModel> mPostDetailModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private int giftListType = -1;

    @Nullable
    private String mSessionId = "";

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment_Top.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MomentAdapterTag.MomentListFollowingFragment_Recommend.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<MomentPoll, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentPoll momentPoll) {
            MomentPoll poll = momentPoll;
            Intrinsics.checkNotNullParameter(poll, "poll");
            MomentDetailModel value = MomentDetailActivityVM.this.getMPostDetailModel().getValue();
            if (value != null) {
                value.updatePollData(poll.toJSONString(), poll);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<MomentPoll, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentPoll momentPoll) {
            MomentDetailModel forward;
            MomentPoll poll = momentPoll;
            Intrinsics.checkNotNullParameter(poll, "poll");
            MomentDetailModel value = MomentDetailActivityVM.this.getMPostDetailModel().getValue();
            if (value != null && (forward = value.getForward()) != null) {
                forward.updatePollData(poll.toJSONString(), poll);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM$onRefreshPoll$1", f = "MomentDetailActivityVM.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31637OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentPoll, Unit> f31638OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f31639OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0o(long j, Function1<? super MomentPoll, Unit> function1, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31639OooO0o0 = j;
            this.f31638OooO0o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f31639OooO0o0, this.f31638OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MomentPoll momentPoll;
            Function1<MomentPoll, Unit> function1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31637OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f31637OooO0Oo = 1;
                String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Moment/GetVoteInfo");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f31639OooO0o0), "voteId");
                obj = OooOOO.OooO0Oo(new MomentRepository$getPollInfo$$inlined$call$1(o0oooooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && (momentPoll = (MomentPoll) apiResult.getData()) != null && (function1 = this.f31638OooO0o) != null) {
                function1.invoke(momentPoll);
            }
            return Unit.INSTANCE;
        }
    }

    public MomentDetailActivityVM() {
        Boolean bool = Boolean.FALSE;
        this.isSelfPost = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.tempAtUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.isExpand = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    private final void onRefreshPoll(long pollId, Function1<? super MomentPoll, Unit> listener) {
        if (pollId < 1) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(pollId, listener, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onRefreshPoll$default(MomentDetailActivityVM momentDetailActivityVM, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        momentDetailActivityVM.onRefreshPoll(j, function1);
    }

    @Nullable
    public final String getFromDbMid() {
        return this.fromDbMid;
    }

    public final int getGiftListType() {
        return this.giftListType;
    }

    public final boolean getMIsExpandedHeadView() {
        return this.mIsExpandedHeadView;
    }

    public final boolean getMIsFromTopicDetail() {
        return this.mIsFromTopicDetail;
    }

    public final boolean getMIsInRoom() {
        return this.mIsInRoom;
    }

    public final boolean getMIsShowKeyboard() {
        return this.mIsShowKeyboard;
    }

    @NotNull
    public final MutableState<MomentDetailModel> getMPostDetailModel() {
        return this.mPostDetailModel;
    }

    @Nullable
    public final String getMSessionId() {
        return this.mSessionId;
    }

    @Nullable
    public final MomentCommentDetailModel getPostCommentDetailModel() {
        return this.postCommentDetailModel;
    }

    public final int getSourceTypeMomentDetail() {
        return this.sourceTypeMomentDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final UserInfo getTempAtUser() {
        return (UserInfo) this.tempAtUser.getValue();
    }

    public final void initIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.mPostDetailModel.setValue((MomentDetailModel) intent.getSerializableExtra("Module"));
        this.mIsShowKeyboard = intent.getBooleanExtra("Type", false);
        this.giftListType = intent.getIntExtra("ShowGiftListType", -1);
        this.mIsFromTopicDetail = intent.getBooleanExtra("FromTopicDetail", false);
        if (intent.hasExtra("FromMomentTag")) {
            getMomentAdapterTag().setValue((MomentAdapterTag) intent.getSerializableExtra("FromMomentTag"));
        }
        if (intent.hasExtra("FromDbMid")) {
            this.fromDbMid = intent.getStringExtra("FromDbMid");
        }
        if (getMomentAdapterTag().getValue() == null) {
            getMomentAdapterTag().setValue(MomentAdapterTag.PostDetailActivity);
        }
        MomentAdapterTag value = getMomentAdapterTag().getValue();
        int i = value != null ? OooO00o.$EnumSwitchMapping$0[value.ordinal()] : -1;
        if (i == 1 || i == 2 || i == 3) {
            this.sourceTypeMomentDetail = 1;
        }
        this.mIsExpandedHeadView = intent.getBooleanExtra("isExpandedHeadView", false);
        MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) intent.getSerializableExtra("Data");
        this.postCommentDetailModel = momentCommentDetailModel;
        o0000O00.OooO0Oo("initData mPostDetailModel:" + this.mPostDetailModel + "  postCommentDetailModel:" + momentCommentDetailModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isExpand() {
        return ((Boolean) this.isExpand.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: isRefreshDataSuccess, reason: from getter */
    public final boolean getIsRefreshDataSuccess() {
        return this.isRefreshDataSuccess;
    }

    @NotNull
    public final MutableState<Boolean> isSelfPost() {
        return this.isSelfPost;
    }

    public final void onRefreshData() {
        MomentDetailModel value;
        MomentDetailModel forward;
        MutableLiveData<MomentPoll> momentPollLiveData;
        MomentPoll value2;
        MomentDetailModel value3 = this.mPostDetailModel.getValue();
        if (value3 != null) {
            int type = value3.getType();
            MomentType momentType = MomentType.Poll;
            long id = 0;
            if (type == momentType.getValue()) {
                MomentDetailModel value4 = this.mPostDetailModel.getValue();
                if (value4 != null && (momentPollLiveData = value4.getMomentPollLiveData()) != null && (value2 = momentPollLiveData.getValue()) != null) {
                    id = value2.getId();
                }
                onRefreshPoll(id, new OooO0O0());
                return;
            }
            if (type != MomentType.Forward.getValue() || (value = this.mPostDetailModel.getValue()) == null || (forward = value.getForward()) == null || forward.getType() != momentType.getValue()) {
                return;
            }
            MomentPoll value5 = forward.getMomentPollLiveData().getValue();
            onRefreshPoll(value5 != null ? value5.getId() : 0L, new OooO0OO());
        }
    }

    public final void setExpand(boolean z) {
        this.isExpand.setValue(Boolean.valueOf(z));
    }

    public final void setFromDbMid(@Nullable String str) {
        this.fromDbMid = str;
    }

    public final void setGiftListType(int i) {
        this.giftListType = i;
    }

    public final void setMIsExpandedHeadView(boolean z) {
        this.mIsExpandedHeadView = z;
    }

    public final void setMIsFromTopicDetail(boolean z) {
        this.mIsFromTopicDetail = z;
    }

    public final void setMIsInRoom(boolean z) {
        this.mIsInRoom = z;
    }

    public final void setMIsShowKeyboard(boolean z) {
        this.mIsShowKeyboard = z;
    }

    public final void setMPostDetailModel(@NotNull MutableState<MomentDetailModel> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.mPostDetailModel = mutableState;
    }

    public final void setMSessionId(@Nullable String str) {
        this.mSessionId = str;
    }

    public final void setPostCommentDetailModel(@Nullable MomentCommentDetailModel momentCommentDetailModel) {
        this.postCommentDetailModel = momentCommentDetailModel;
    }

    public final void setRefreshDataSuccess(boolean z) {
        this.isRefreshDataSuccess = z;
    }

    public final void setSelfPost(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isSelfPost = mutableState;
    }

    public final void setSourceTypeMomentDetail(int i) {
        this.sourceTypeMomentDetail = i;
    }

    public final void setTempAtUser(@Nullable UserInfo userInfo) {
        this.tempAtUser.setValue(userInfo);
    }
}
