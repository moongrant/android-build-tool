package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000oOoO;
import com.code.android.util.o0OoOo0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.share.internal.ShareConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.data.repository.MomentRepository$deleteCommentOrReply$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$focusCtl$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$momentDetail$$inlined$call$1;
import com.yalla.yalla.data.repository.MomentRepository$sendCommentOrReply$$inlined$call$1;
import com.yalla.yalla.model.MomentChangeUserIsInRoomModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentResultModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModelKt;
import com.yalla.yalla.model.moment.MomentForwardContent;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.moment.MomentTypeDelete;
import com.yalla.yalla.model.moment.MomentTypePower;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O000;
import p382o0OOoo0o.o00Ooo;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p418o0OoO000.OooOo;
import p426o0OoOO.o0OOO0o;
import p526o0o0OOO0.oo0oOO0;
import p579o0oOoo.oO000Oo0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p596o0oo00o.OooOOOO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bl\u0010mJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\rJ\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\"\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cJ\u0016\u0010#\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rJ\u0012\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010)\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0004\u0018\u00010&J\b\u0010*\u001a\u00020\u0004H\u0014R\"\u0010+\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u000109088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010A\u001a\b\u0012\u0004\u0012\u00020@088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R(\u0010E\u001a\b\u0012\u0004\u0012\u00020D088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010;\u001a\u0004\bF\u0010=\"\u0004\bG\u0010?R(\u0010I\u001a\b\u0012\u0004\u0012\u00020H088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bI\u0010=\"\u0004\bJ\u0010?R\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060K8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR/\u0010V\u001a\u0004\u0018\u00010H2\b\u0010P\u001a\u0004\u0018\u00010H8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010;\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010W\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010]\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010X\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\r0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR?\u0010f\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\bc\u0012\b\bd\u0012\u0004\b\b(e\u0012\u0004\u0012\u00020\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/BaseMomentVM;", "Lo0Oo00oO/o0O0O00;", "Lcom/yalla/yalla/model/MomentChangeUserIsInRoomModel;", "it", "", "updateInRoom", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", ReportItem.QualityKeyResult, "updatePoll", "detailModel", "updateComment", "refreshData", "refreshPartData", "", "momentId", "removeMoment", "isEventDeleted", "(Ljava/lang/Long;)V", "Lkotlin/Function0;", "isEmptyCallBack", "deleteMoment", "itemData", "follow", ShareConstants.RESULT_POST_ID, "squareSingle4Edited", "Lcom/yalla/yalla/model/moment/MomentSendModel;", "sendModel", "postSendSuccess", "", "dyId", "commentIdOrReplyId", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "deleteCommentOrReply", "reportCommentOrReply", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lkotlin/Function1;", "Lcom/yalla/yalla/model/moment/MomentCommentResultModel;", "resultListener", "sendCommentOrReply", "onCleared", "dateSort", "J", "getDateSort", "()J", "setDateSort", "(J)V", "", "pageIndex", "I", "getPageIndex", "()I", "setPageIndex", "(I)V", "Landroidx/compose/runtime/MutableState;", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "momentAdapterTag", "Landroidx/compose/runtime/MutableState;", "getMomentAdapterTag", "()Landroidx/compose/runtime/MutableState;", "setMomentAdapterTag", "(Landroidx/compose/runtime/MutableState;)V", "Lcom/code/android/uikit/contentstate/ContentState;", "contentState", "getContentState", "setContentState", "Lcom/yalla/yalla/ui/composable/common/LoadMoreState;", "loadMoreState", "getLoadMoreState", "setLoadMoreState", "", "isRefreshIng", "setRefreshIng", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "listData", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getListData", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<set-?>", "refreshTrigger$delegate", "getRefreshTrigger", "()Ljava/lang/Boolean;", "setRefreshTrigger", "(Ljava/lang/Boolean;)V", "refreshTrigger", "supportHidePost", "Z", "getSupportHidePost", "()Z", "setSupportHidePost", "(Z)V", "firstInitScreen", "getFirstInitScreen", "setFirstInitScreen", "Landroidx/lifecycle/Observer;", "hidePostObserver", "Landroidx/lifecycle/Observer;", "Lkotlin/ParameterName;", "name", "hidePostId", "hidePostListener", "Lkotlin/jvm/functions/Function1;", "getHidePostListener", "()Lkotlin/jvm/functions/Function1;", "setHidePostListener", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseMomentVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMomentVM.kt\ncom/yalla/yalla/ui/vm/moment/BaseMomentVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n81#2:401\n107#2,2:402\n1864#3,3:404\n1864#3,3:407\n*S KotlinDebug\n*F\n+ 1 BaseMomentVM.kt\ncom/yalla/yalla/ui/vm/moment/BaseMomentVM\n*L\n78#1:401\n78#1:402,2\n154#1:404,3\n179#1:407,3\n*E\n"})
public class BaseMomentVM extends o0O0O00 {
    public static final int $stable = 8;
    private long dateSort;

    @Nullable
    private Function1<? super Long, Unit> hidePostListener;

    @NotNull
    private final Observer<Long> hidePostObserver;
    private boolean supportHidePost;
    private int pageIndex = 1;

    @NotNull
    private MutableState<MomentAdapterTag> momentAdapterTag = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @NotNull
    private MutableState<ContentState> contentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);

    @NotNull
    private MutableState<LoadMoreState> loadMoreState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LoadMoreState.Loading, null, 2, null);

    @NotNull
    private MutableState<Boolean> isRefreshIng = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    private final SnapshotStateList<MomentDetailModel> listData = SnapshotStateKt.mutableStateListOf();

    /* JADX INFO: renamed from: refreshTrigger$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState refreshTrigger = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private boolean firstInitScreen = true;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$postSendSuccess$1", f = "BaseMomentVM.kt", i = {}, l = {310, 310}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32127OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f32128OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f32129OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<MomentDetailModel, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentSendModel f32130OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentSendModel momentSendModel) {
                super(1);
                this.f32130OooO0Oo = momentSendModel;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(MomentDetailModel momentDetailModel) {
                MomentDetailModel it = momentDetailModel;
                Intrinsics.checkNotNullParameter(it, "it");
                MomentSendModel sendPostModel = it.getSendPostModel();
                return Boolean.valueOf(sendPostModel != null && sendPostModel.getTaskId() == this.f32130OooO0Oo.getTaskId());
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$postSendSuccess$1$2", f = "BaseMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<MomentDetailModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32131OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ BaseMomentVM f32132OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MomentSendModel f32133OooO0o0;

            public static final class OooO00o extends Lambda implements Function1<MomentDetailModel, Boolean> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public final /* synthetic */ MomentDetailModel f32134OooO0Oo;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public final /* synthetic */ MomentSendModel f32135OooO0o0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(MomentDetailModel momentDetailModel, MomentSendModel momentSendModel) {
                    super(1);
                    this.f32134OooO0Oo = momentDetailModel;
                    this.f32135OooO0o0 = momentSendModel;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(MomentDetailModel momentDetailModel) {
                    MomentDetailModel it = momentDetailModel;
                    Intrinsics.checkNotNullParameter(it, "it");
                    long id = it.getId();
                    boolean z = true;
                    MomentDetailModel momentDetailModel2 = this.f32134OooO0Oo;
                    if (id == 0 || it.getId() != momentDetailModel2.getId()) {
                        MomentSendModel sendPostModel = momentDetailModel2.getSendPostModel();
                        if (!(sendPostModel != null && sendPostModel.getTaskId() == this.f32135OooO0o0.getTaskId())) {
                            z = false;
                        }
                    }
                    if (z) {
                        MomentDetailModelKt.cloneData(it, momentDetailModel2);
                    }
                    return Boolean.valueOf(z);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(MomentSendModel momentSendModel, BaseMomentVM baseMomentVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f32133OooO0o0 = momentSendModel;
                this.f32132OooO0o = baseMomentVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO0O0 oooO0O0 = new OooO0O0(this.f32133OooO0o0, this.f32132OooO0o, continuation);
                oooO0O0.f32131OooO0Oo = obj;
                return oooO0O0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MomentDetailModel momentDetailModel, Continuation<? super Unit> continuation) {
                return ((OooO0O0) create(momentDetailModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentDetailModel momentDetailModel = (MomentDetailModel) this.f32131OooO0Oo;
                if (momentDetailModel == null) {
                    return Unit.INSTANCE;
                }
                p592o0oo00O.OooOOO0.OooO0O0("WRM momentDetail itemData = ".concat(p140o00OOooo.OooOO0.OooO00o(momentDetailModel)));
                MomentSendModel momentSendModel = this.f32133OooO0o0;
                if (momentSendModel.getPower() != MomentTypePower.Self.getValue()) {
                    BaseMomentVM baseMomentVM = this.f32132OooO0o;
                    SnapshotStateList<MomentDetailModel> listData = baseMomentVM.getListData();
                    OooO00o replaceItem = new OooO00o(momentDetailModel, momentSendModel);
                    Intrinsics.checkNotNullParameter(listData, "<this>");
                    Intrinsics.checkNotNullParameter(replaceItem, "replaceItem");
                    int i = 0;
                    for (int i2 = 0; i2 < listData.size(); i2++) {
                        MomentDetailModel momentDetailModel2 = listData.get(i2);
                        if (momentDetailModel2 != null && ((Boolean) replaceItem.invoke(momentDetailModel2)).booleanValue()) {
                            i++;
                        }
                    }
                    if (i == 0) {
                        baseMomentVM.getListData().add(0, momentDetailModel);
                        OooOOOO.OooO0O0(momentSendModel);
                        baseMomentVM.setRefreshTrigger(Boxing.boxBoolean(true));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentSendModel momentSendModel, BaseMomentVM baseMomentVM, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f32129OooO0o0 = momentSendModel;
            this.f32128OooO0o = baseMomentVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f32129OooO0o0, this.f32128OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32127OooO0Oo;
            BaseMomentVM baseMomentVM = this.f32128OooO0o;
            MomentSendModel momentSendModel = this.f32129OooO0o0;
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
            if (momentSendModel.getPower() == MomentTypePower.Self.getValue()) {
                CollectionsKt.removeAll((List) baseMomentVM.getListData(), (Function1) new OooO00o(momentSendModel));
                OooOOOO.OooO0O0(momentSendModel);
                return Unit.INSTANCE;
            }
            String strValueOf = String.valueOf(momentSendModel.getPostId());
            this.f32127OooO0Oo = 1;
            String url = o000OOo0.OooO0Oo("/Webservers/Discovery/SquareSingle");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(strValueOf, "dyId");
            o0o0ooo.OooO0O0(Boxing.boxInt(0), "sourceType");
            obj = OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0o0ooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO0O0 oooO0O0 = new OooO0O0(momentSendModel, baseMomentVM, null);
            this.f32127OooO0Oo = 2;
            if (o000O000.OooO0OO((ApiResult) obj, false, null, null, oooO0O0, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$deleteCommentOrReply$1", f = "BaseMomentVM.kt", i = {0, 1, 1}, l = {338, 339, 342}, m = "invokeSuspend", n = {"$this$sharedFlow", "$this$sharedFlow", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO00o extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f32136OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f32137OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32138OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f32139OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f32140OooO0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.BaseMomentVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$deleteCommentOrReply$1$1", f = "BaseMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0355OooO00o extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
            public C0355OooO00o(Continuation<? super C0355OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0355OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return new C0355OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32139OooO0oO = str;
            this.f32140OooO0oo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f32139OooO0oO, this.f32140OooO0oo, continuation);
            oooO00o.f32137OooO0o = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<Object>> flowCollector, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            FlowCollector flowCollector2;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32138OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f32137OooO0o;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult = this.f32136OooO0Oo;
                    flowCollector2 = (FlowCollector) this.f32137OooO0o;
                    ResultKt.throwOnFailure(obj);
                    this.f32137OooO0o = null;
                    this.f32136OooO0Oo = null;
                    this.f32138OooO0o0 = 3;
                    if (flowCollector2.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.f32137OooO0o;
            this.f32137OooO0o = flowCollector3;
            this.f32138OooO0o0 = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Comment/Del");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0o0oooOooO00o.OooO0O0(this.f32139OooO0oO, "dyid");
            o0o0oooOooO00o.OooO0O0(this.f32140OooO0oo, "cid");
            Object objOooO0Oo = OooOOO.OooO0Oo(new MomentRepository$deleteCommentOrReply$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector = flowCollector3;
            obj = objOooO0Oo;
            ApiResult apiResult2 = (ApiResult) obj;
            C0355OooO00o c0355OooO00o = new C0355OooO00o(null);
            this.f32137OooO0o = flowCollector;
            this.f32136OooO0Oo = apiResult2;
            this.f32138OooO0o0 = 2;
            if (o000O000.OooO0OO(apiResult2, false, null, null, c0355OooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector2 = flowCollector;
            apiResult = apiResult2;
            this.f32137OooO0o = null;
            this.f32136OooO0Oo = null;
            this.f32138OooO0o0 = 3;
            if (flowCollector2.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$deleteMoment$1", f = "BaseMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f32141OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function0<Unit> function0, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32141OooO0Oo = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f32141OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f32141OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$follow$1", f = "BaseMomentVM.kt", i = {}, l = {258, 261}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32142OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f32143OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$follow$1$1", f = "BaseMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MomentDetailModel f32144OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentDetailModel momentDetailModel, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f32144OooO0Oo = momentDetailModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f32144OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                OooOo oooOo = new OooOo();
                oooOo.f45532OooO00o = 19;
                MomentDetailModel momentDetailModel = this.f32144OooO0Oo;
                if (momentDetailModel.isFollow()) {
                    momentDetailModel.setFollow(false);
                    oooOo.f45533OooO0O0 = 0;
                } else {
                    momentDetailModel.setFollow(true);
                    oooOo.f45533OooO0O0 = 1;
                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.post_list_follow_succeed));
                }
                oooOo.f45534OooO0OO = o0OoOo0.OooOOO0("", Boxing.boxLong(momentDetailModel.getUserId()));
                com.squareup.okhttp.OooOo.OooO0O0().OooO0Oo(oooOo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentDetailModel momentDetailModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32143OooO0o0 = momentDetailModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f32143OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32142OooO0Oo;
            MomentDetailModel momentDetailModel = this.f32143OooO0o0;
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
            String strValueOf = String.valueOf(momentDetailModel.getUserId());
            String strOooO00o = o0OOO0o.OooO00o(momentDetailModel.isFollow() ? 1 : 0);
            this.f32142OooO0Oo = 1;
            String url = o000OOo0.OooO0OO(o0000O.f44173o00Ooo);
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(strValueOf, "fuserid");
            o0o0ooo.OooO0O0(strOooO00o, "type");
            obj = OooOOO.OooO0Oo(new MomentRepository$focusCtl$$inlined$call$1(o0o0ooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO00o oooO00o = new OooO00o(momentDetailModel, null);
            this.f32142OooO0Oo = 2;
            if (o000O000.OooO0OO((ApiResult) obj, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer<Long> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Long l) {
            long jLongValue = l.longValue();
            BaseMomentVM baseMomentVM = BaseMomentVM.this;
            if (baseMomentVM.getSupportHidePost()) {
                CollectionsKt.removeAll((List) baseMomentVM.getListData(), (Function1) new com.yalla.yalla.ui.vm.moment.OooO00o(jLongValue));
                return;
            }
            Function1<Long, Unit> hidePostListener = baseMomentVM.getHidePostListener();
            if (hidePostListener != null) {
                hidePostListener.invoke(Long.valueOf(jLongValue));
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$sendCommentOrReply$1", f = "BaseMomentVM.kt", i = {}, l = {371, 371}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32146OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<MomentCommentResultModel, Unit> f32147OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentSendCommentModel f32148OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f32149OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$sendCommentOrReply$1$1", f = "BaseMomentVM.kt", i = {0, 0}, l = {373}, m = "invokeSuspend", n = {ReportItem.QualityKeyResult, "data"}, s = {"L$0", "L$4"})
        @SourceDebugExtension({"SMAP\nBaseMomentVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMomentVM.kt\ncom/yalla/yalla/ui/vm/moment/BaseMomentVM$sendCommentOrReply$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n1#2:401\n*E\n"})
        public static final class OooO00o extends SuspendLambda implements Function2<MomentCommentResultModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public /* synthetic */ Object f32150OooO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public Function1 f32151OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public MomentSendCommentModel f32152OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public BaseMomentVM f32153OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public MomentCommentResultModel f32154OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public int f32155OooO0oo;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public final /* synthetic */ Function1<MomentCommentResultModel, Unit> f32156OooOO0;

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public final /* synthetic */ BaseMomentVM f32157OooOO0O;

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public final /* synthetic */ MomentSendCommentModel f32158OooOO0o;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.moment.BaseMomentVM$OooOO0$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$sendCommentOrReply$1$1$1$1", f = "BaseMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0356OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public C0356OooO00o(Continuation<? super C0356OooO00o> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0356OooO00o(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return new C0356OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.Comment_successfully));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MomentSendCommentModel momentSendCommentModel, BaseMomentVM baseMomentVM, Continuation continuation, Function1 function1) {
                super(2, continuation);
                this.f32156OooOO0 = function1;
                this.f32157OooOO0O = baseMomentVM;
                this.f32158OooOO0o = momentSendCommentModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f32158OooOO0o, this.f32157OooOO0O, continuation, this.f32156OooOO0);
                oooO00o.f32150OooO = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MomentCommentResultModel momentCommentResultModel, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(momentCommentResultModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Function1<MomentCommentResultModel, Unit> function1;
                BaseMomentVM baseMomentVM;
                MomentCommentResultModel momentCommentResultModel;
                MomentSendCommentModel momentSendCommentModel;
                MomentCommentResultModel momentCommentResultModel2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f32155OooO0oo;
                MomentDetailModel momentDetailModel = null;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MomentCommentResultModel momentCommentResultModel3 = (MomentCommentResultModel) this.f32150OooO;
                    if (momentCommentResultModel3 != null) {
                        C0356OooO00o c0356OooO00o = new C0356OooO00o(null);
                        this.f32150OooO = momentCommentResultModel3;
                        function1 = this.f32156OooOO0;
                        this.f32151OooO0Oo = function1;
                        baseMomentVM = this.f32157OooOO0O;
                        this.f32153OooO0o0 = baseMomentVM;
                        MomentSendCommentModel momentSendCommentModel2 = this.f32158OooOO0o;
                        this.f32152OooO0o = momentSendCommentModel2;
                        this.f32154OooO0oO = momentCommentResultModel3;
                        this.f32155OooO0oo = 1;
                        if (OooOOO.OooO0o0(c0356OooO00o, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        momentCommentResultModel = momentCommentResultModel3;
                        momentSendCommentModel = momentSendCommentModel2;
                        momentCommentResultModel2 = momentCommentResultModel;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                momentCommentResultModel = this.f32154OooO0oO;
                momentSendCommentModel = this.f32152OooO0o;
                baseMomentVM = this.f32153OooO0o0;
                function1 = this.f32151OooO0Oo;
                momentCommentResultModel2 = (MomentCommentResultModel) this.f32150OooO;
                ResultKt.throwOnFailure(obj);
                if (function1 != null) {
                    function1.invoke(momentCommentResultModel);
                }
                for (MomentDetailModel momentDetailModel2 : baseMomentVM.getListData()) {
                    if (momentDetailModel2.getId() == o0OoOo0.OooO(0L, momentSendCommentModel.getDyid())) {
                        momentDetailModel = momentDetailModel2;
                        break;
                    }
                }
                MomentDetailModel momentDetailModel3 = momentDetailModel;
                if (momentDetailModel3 != null) {
                    Long lBoxLong = Boxing.boxLong(momentCommentResultModel2.getCommentNum());
                    long commentNum = momentDetailModel3.getCommentNum() + 1;
                    if (!(lBoxLong == null)) {
                        Intrinsics.checkNotNull(lBoxLong);
                        commentNum = lBoxLong.longValue();
                    }
                    momentDetailModel3.setCommentNum(commentNum);
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH_PART").post(momentDetailModel3);
                }
                o0OO000.OooO0O0("106056", MapsKt.mapOf(TuplesKt.to("discovery_id", momentSendCommentModel.getDyid()), TuplesKt.to("video_id", momentSendCommentModel.getLocalSourcesId()), TuplesKt.to("rec_sessionid", momentSendCommentModel.getLocalSessionId())));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(MomentSendCommentModel momentSendCommentModel, BaseMomentVM baseMomentVM, Continuation continuation, Function1 function1) {
            super(2, continuation);
            this.f32148OooO0o0 = momentSendCommentModel;
            this.f32147OooO0o = function1;
            this.f32149OooO0oO = baseMomentVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Function1<MomentCommentResultModel, Unit> function1 = this.f32147OooO0o;
            return new OooOO0(this.f32148OooO0o0, this.f32149OooO0oO, continuation, function1);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32146OooO0Oo;
            MomentSendCommentModel momentSendCommentModel = this.f32148OooO0o0;
            boolean z = true;
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
            p592o0oo00O.OooOOO0.OooO0O0("WRM 添加 sendCommentOrReplyApi \nmodel = ".concat(p140o00OOooo.OooOO0.OooO00o(momentSendCommentModel)));
            this.f32146OooO0Oo = 1;
            String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Comment/Write");
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0o0oooOooO00o.OooO0O0(momentSendCommentModel.getDyid(), "dyid");
            String cid = momentSendCommentModel.getCid();
            if (!(cid == null || cid.length() == 0)) {
                o0o0oooOooO00o.OooO0O0(momentSendCommentModel.getCid(), "cid");
            }
            String parentUserId = momentSendCommentModel.getParentUserId();
            if (!(parentUserId == null || parentUserId.length() == 0)) {
                String parentUserName = momentSendCommentModel.getParentUserName();
                if (parentUserName != null && parentUserName.length() != 0) {
                    z = false;
                }
                if (!z) {
                    o0o0oooOooO00o.OooO0O0(momentSendCommentModel.getParentUserId(), "parentUserId");
                    o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(momentSendCommentModel.getParentUserName()), "parentUserName");
                }
            }
            if (!o00Ooo.OooO0o()) {
                o0o0oooOooO00o.OooO0O0(p140o00OOooo.OooOO0.OooO00o(momentSendCommentModel.getContent()), "content");
                p592o0oo00O.OooOOO0.OooO0O0("WRM sendCommentOrReply apiParams = ".concat(p140o00OOooo.OooOO0.OooO00o(o0o0oooOooO00o)));
            }
            o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(p140o00OOooo.OooOO0.OooO00o(momentSendCommentModel.getContent())), "content");
            obj = OooOOO.OooO0Oo(new MomentRepository$sendCommentOrReply$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(momentSendCommentModel, this.f32149OooO0oO, null, this.f32147OooO0o);
            this.f32146OooO0Oo = 2;
            if (o000O000.OooO0OO(apiResult, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$squareSingle4Edited$1", f = "BaseMomentVM.kt", i = {}, l = {283, 283}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32159OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ BaseMomentVM f32160OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f32161OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.BaseMomentVM$squareSingle4Edited$1$1", f = "BaseMomentVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nBaseMomentVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseMomentVM.kt\ncom/yalla/yalla/ui/vm/moment/BaseMomentVM$squareSingle4Edited$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n350#2,7:401\n*S KotlinDebug\n*F\n+ 1 BaseMomentVM.kt\ncom/yalla/yalla/ui/vm/moment/BaseMomentVM$squareSingle4Edited$1$1\n*L\n286#1:401,7\n*E\n"})
        public static final class OooO00o extends SuspendLambda implements Function2<MomentDetailModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f32162OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ long f32163OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ BaseMomentVM f32164OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(long j, BaseMomentVM baseMomentVM, Continuation continuation) {
                super(2, continuation);
                this.f32164OooO0o0 = baseMomentVM;
                this.f32163OooO0o = j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f32163OooO0o, this.f32164OooO0o0, continuation);
                oooO00o.f32162OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MomentDetailModel momentDetailModel, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(momentDetailModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MomentDetailModel momentDetailModel = (MomentDetailModel) this.f32162OooO0Oo;
                if (momentDetailModel == null) {
                    return Unit.INSTANCE;
                }
                BaseMomentVM baseMomentVM = this.f32164OooO0o0;
                Iterator<MomentDetailModel> it = baseMomentVM.getListData().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it.next().getId() == this.f32163OooO0o) {
                        break;
                    }
                    i++;
                }
                if (i == -1 || baseMomentVM.getListData().size() <= i) {
                    return Unit.INSTANCE;
                }
                if (momentDetailModel.getPower() == MomentTypePower.Self.getValue()) {
                    baseMomentVM.getListData().remove(i);
                    return Unit.INSTANCE;
                }
                baseMomentVM.getListData().set(i, momentDetailModel);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, BaseMomentVM baseMomentVM, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f32161OooO0o0 = j;
            this.f32160OooO0o = baseMomentVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f32161OooO0o0, this.f32160OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32159OooO0Oo;
            long j = this.f32161OooO0o0;
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
            String strValueOf = String.valueOf(j);
            this.f32159OooO0Oo = 1;
            String url = o000OOo0.OooO0Oo("/Webservers/Discovery/SquareSingle");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(strValueOf, "dyId");
            o0o0ooo.OooO0O0(Boxing.boxInt(0), "sourceType");
            obj = OooOOO.OooO0Oo(new MomentRepository$momentDetail$$inlined$call$1(o0o0ooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(j, this.f32160OooO0o, null);
            this.f32159OooO0Oo = 2;
            if (o000O000.OooO0OO(apiResult, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public BaseMomentVM() {
        OooO0o oooO0o = new OooO0o();
        this.hidePostObserver = oooO0o;
        LiveEventBus.get("MOMENT_HIDE_POST", Long.TYPE).observeForever(oooO0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendCommentOrReply$default(BaseMomentVM baseMomentVM, MomentSendCommentModel momentSendCommentModel, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendCommentOrReply");
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        baseMomentVM.sendCommentOrReply(momentSendCommentModel, function1);
    }

    @NotNull
    public final SharedFlow<ApiResult<Object>> deleteCommentOrReply(@NotNull String dyId, @NotNull String commentIdOrReplyId) {
        Intrinsics.checkNotNullParameter(dyId, "dyId");
        Intrinsics.checkNotNullParameter(commentIdOrReplyId, "commentIdOrReplyId");
        return o000oOoO.OooO00o(this, new OooO00o(dyId, commentIdOrReplyId, null));
    }

    public final void deleteMoment(@Nullable MomentDetailModel detailModel, @NotNull Function0<Unit> isEmptyCallBack) {
        Intrinsics.checkNotNullParameter(isEmptyCallBack, "isEmptyCallBack");
        for (MomentDetailModel momentDetailModel : this.listData) {
            boolean z = false;
            if (detailModel != null && momentDetailModel.getId() == detailModel.getId()) {
                z = true;
            }
            if (z) {
                this.listData.remove(momentDetailModel);
                if (this.listData.isEmpty()) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(isEmptyCallBack, null), 3, null);
                    return;
                }
                return;
            }
        }
    }

    public final void follow(@NotNull MomentDetailModel itemData) {
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(itemData, null), 3, null);
    }

    @NotNull
    public final MutableState<ContentState> getContentState() {
        return this.contentState;
    }

    public final long getDateSort() {
        return this.dateSort;
    }

    public final boolean getFirstInitScreen() {
        return this.firstInitScreen;
    }

    @Nullable
    public Function1<Long, Unit> getHidePostListener() {
        return this.hidePostListener;
    }

    @NotNull
    public final SnapshotStateList<MomentDetailModel> getListData() {
        return this.listData;
    }

    @NotNull
    public final MutableState<LoadMoreState> getLoadMoreState() {
        return this.loadMoreState;
    }

    @NotNull
    public final MutableState<MomentAdapterTag> getMomentAdapterTag() {
        return this.momentAdapterTag;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Boolean getRefreshTrigger() {
        return (Boolean) this.refreshTrigger.getValue();
    }

    public final boolean getSupportHidePost() {
        return this.supportHidePost;
    }

    public final void isEventDeleted(@Nullable Long it) {
        int size = this.listData.size();
        for (int i = 0; i < size; i++) {
            MomentDetailModel momentDetailModel = this.listData.get(i);
            MomentForwardContent forwardContent = momentDetailModel.getForwardContent();
            if (forwardContent != null && forwardContent.getShareType() == 20) {
                MomentForwardContent forwardContent2 = momentDetailModel.getForwardContent();
                if (Intrinsics.areEqual(forwardContent2 != null ? Long.valueOf(forwardContent2.getId()) : null, it)) {
                    momentDetailModel.setDeleteType(MomentTypeDelete.EVENT.getValue());
                    return;
                }
            }
        }
    }

    @NotNull
    public final MutableState<Boolean> isRefreshIng() {
        return this.isRefreshIng;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        LiveEventBus.get("MOMENT_HIDE_POST", Long.TYPE).removeObserver(this.hidePostObserver);
    }

    public void postSendSuccess(@Nullable MomentDetailModel sendModel) {
    }

    public final void refreshData(@Nullable MomentDetailModel detailModel) {
        if (detailModel == null) {
            return;
        }
        for (int i = 0; i < this.listData.size(); i++) {
            if (this.listData.get(i).getId() == detailModel.getId()) {
                this.listData.set(i, detailModel);
                return;
            }
        }
    }

    public final void refreshPartData(@Nullable MomentDetailModel detailModel) {
        if (detailModel == null) {
            return;
        }
        int i = 0;
        for (MomentDetailModel momentDetailModel : this.listData) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (momentDetailModel2.getId() == detailModel.getId()) {
                momentDetailModel2.setCommentNum(detailModel.getCommentNum());
                momentDetailModel2.setPraise(detailModel.isPraise());
                momentDetailModel2.setPraiseNum(detailModel.getPraiseNum());
            }
            if (momentDetailModel2.getUserId() == detailModel.getUserId()) {
                momentDetailModel2.setFollow(detailModel.isFollow());
            }
            i = i2;
        }
    }

    public final void removeMoment(long momentId) {
        int i = 0;
        while (true) {
            if (i >= this.listData.size()) {
                i = -1;
                break;
            } else if (this.listData.get(i).getId() == momentId) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || i >= this.listData.size()) {
            return;
        }
        this.listData.remove(i);
    }

    public final void reportCommentOrReply(long dyId, long commentIdOrReplyId) {
        oo0oOO0.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(5, commentIdOrReplyId, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : Long.valueOf(dyId), (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
    }

    public final void sendCommentOrReply(@NotNull MomentSendCommentModel model, @Nullable Function1<? super MomentCommentResultModel, Unit> resultListener) {
        Intrinsics.checkNotNullParameter(model, "model");
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooOO0(model, this, null, resultListener));
    }

    public final void setContentState(@NotNull MutableState<ContentState> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.contentState = mutableState;
    }

    public final void setDateSort(long j) {
        this.dateSort = j;
    }

    public final void setFirstInitScreen(boolean z) {
        this.firstInitScreen = z;
    }

    public void setHidePostListener(@Nullable Function1<? super Long, Unit> function1) {
        this.hidePostListener = function1;
    }

    public final void setLoadMoreState(@NotNull MutableState<LoadMoreState> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.loadMoreState = mutableState;
    }

    public final void setMomentAdapterTag(@NotNull MutableState<MomentAdapterTag> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.momentAdapterTag = mutableState;
    }

    public final void setPageIndex(int i) {
        this.pageIndex = i;
    }

    public final void setRefreshIng(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isRefreshIng = mutableState;
    }

    public final void setRefreshTrigger(@Nullable Boolean bool) {
        this.refreshTrigger.setValue(bool);
    }

    public final void setSupportHidePost(boolean z) {
        this.supportHidePost = z;
    }

    public final void squareSingle4Edited(long postId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0O(postId, this, null), 3, null);
    }

    public final void updateComment(@Nullable MomentDetailModel detailModel) {
        int i = 0;
        for (MomentDetailModel momentDetailModel : this.listData) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MomentDetailModel momentDetailModel2 = momentDetailModel;
            if (detailModel != null && momentDetailModel2.getId() == detailModel.getId()) {
                momentDetailModel2.setCommentNum(detailModel.getCommentNum());
            }
            i = i2;
        }
    }

    public final void updateInRoom(@NotNull MomentChangeUserIsInRoomModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        for (int i = 0; i < this.listData.size(); i++) {
            MomentDetailModel momentDetailModel = this.listData.get(i);
            if (momentDetailModel.getUserId() == o0OoOo0.OooO(0L, it.getUserId()) && momentDetailModel.isInRoom() != it.getIsInRoom()) {
                momentDetailModel.setInRoom(it.getIsInRoom());
            }
        }
    }

    public final void updatePoll(@Nullable MomentDetailModel result) {
        MomentDetailModel forward;
        if (result == null) {
            return;
        }
        for (int i = 0; i < this.listData.size(); i++) {
            MomentDetailModel momentDetailModel = this.listData.get(i);
            int type = momentDetailModel.getType();
            if (type == MomentType.Poll.getValue()) {
                if (momentDetailModel.getId() == result.getId()) {
                    p592o0oo00O.OooOOO0.OooO0o("POST_DETAIL_POLL_DATA_REFRESH FollowingFragment i= " + i + "\nresult = " + result);
                    this.listData.set(i, result);
                }
            } else if (type == MomentType.Forward.getValue() && (forward = momentDetailModel.getForward()) != null && forward.getId() == result.getId()) {
                p592o0oo00O.OooOOO0.OooO0o("POST_DETAIL_POLL_DATA_REFRESH FollowingFragment i= " + i + "\nresult = " + result);
                this.listData.get(i).setForward(result);
            }
        }
    }

    public void postSendSuccess(@Nullable MomentSendModel sendModel) {
        if (sendModel == null) {
            return;
        }
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO(sendModel, this, null));
    }
}
