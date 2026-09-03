package com.yalla.yalla.ui.vm.report;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.ReportFromData;
import com.yalla.yalla.model.ReportModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.Collection;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.oo0O;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bM\u0010NJ\u0006\u0010\u0003\u001a\u00020\u0002J7\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R7\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R+\u0010/\u001a\u00020)2\u0006\u0010#\u001a\u00020)8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R/\u00106\u001a\u0004\u0018\u0001002\b\u0010#\u001a\u0004\u0018\u0001008F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010%\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R$\u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R+\u0010B\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010%\u001a\u0004\b@\u0010\u0011\"\u0004\bA\u0010\u0013R$\u0010C\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010>R$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/yalla/yalla/ui/vm/report/ReportVm;", "Lo0Oo0/OooOO0;", "", "loadReportReason", "", "reasonId", "categoryId", "", "extendSourceId", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "report", "(ILjava/lang/Integer;Ljava/lang/Long;)Lo0OoO0Oo/o00OO0O0;", "reportType", "I", "getReportType", "()I", "setReportType", "(I)V", "sourceId", "Ljava/lang/Long;", "getSourceId", "()Ljava/lang/Long;", "setSourceId", "(Ljava/lang/Long;)V", "", "Lcom/yalla/yalla/model/ReportFromData;", "messagesList", "Ljava/util/List;", "getMessagesList", "()Ljava/util/List;", "setMessagesList", "(Ljava/util/List;)V", "Lcom/yalla/yalla/model/ReportModel;", "<set-?>", "listData$delegate", "Landroidx/compose/runtime/MutableState;", "getListData", "setListData", "listData", "Lcom/code/android/uikit/contentstate/ContentState;", "contentState$delegate", "getContentState", "()Lcom/code/android/uikit/contentstate/ContentState;", "setContentState", "(Lcom/code/android/uikit/contentstate/ContentState;)V", "contentState", "Lcom/yalla/yalla/data/db/table/UserInfo;", "searchUser$delegate", "getSearchUser", "()Lcom/yalla/yalla/data/db/table/UserInfo;", "setSearchUser", "(Lcom/yalla/yalla/data/db/table/UserInfo;)V", "searchUser", "getExtendSourceId", "setExtendSourceId", "viewSourceType", "Ljava/lang/Integer;", "getViewSourceType", "()Ljava/lang/Integer;", "setViewSourceType", "(Ljava/lang/Integer;)V", "currentSelectedPosition$delegate", "getCurrentSelectedPosition", "setCurrentSelectedPosition", "currentSelectedPosition", "privateChatReportType", "getPrivateChatReportType", "setPrivateChatReportType", "", "friendRequestMessage", "Ljava/lang/String;", "getFriendRequestMessage", "()Ljava/lang/String;", "setFriendRequestMessage", "(Ljava/lang/String;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nReportVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportVm.kt\ncom/yalla/yalla/ui/vm/report/ReportVm\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,99:1\n81#2:100\n107#2,2:101\n81#2:103\n107#2,2:104\n81#2:106\n107#2,2:107\n81#2:109\n107#2,2:110\n*S KotlinDebug\n*F\n+ 1 ReportVm.kt\ncom/yalla/yalla/ui/vm/report/ReportVm\n*L\n33#1:100\n33#1:101,2\n35#1:103\n35#1:104,2\n37#1:106\n37#1:107,2\n53#1:109\n53#1:110,2\n*E\n"})
public final class ReportVm extends OooOO0 {
    public static final int $stable = 8;

    @Nullable
    private Long extendSourceId;

    @Nullable
    private String friendRequestMessage;

    @Nullable
    private List<ReportFromData> messagesList;

    @Nullable
    private Integer privateChatReportType;

    @Nullable
    private Long sourceId;

    @Nullable
    private Integer viewSourceType;
    private int reportType = -1;

    /* JADX INFO: renamed from: listData$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState listData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState contentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);

    /* JADX INFO: renamed from: searchUser$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState searchUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: currentSelectedPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentSelectedPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.report.ReportVm$loadReportReason$1", f = "ReportVm.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31980OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ReportVm.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31980OooO0Oo;
            boolean z = true;
            ReportVm reportVm = ReportVm.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                oo0O oo0o = oo0O.f46361OooO00o;
                int reportType = reportVm.getReportType();
                Integer viewSourceType = reportVm.getViewSourceType();
                this.f31980OooO0Oo = 1;
                obj = oo0o.OooO00o(reportType, viewSourceType, this);
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
            if (apiResult.isSuccess()) {
                Collection collection = (Collection) apiResult.getData();
                if (collection != null && !collection.isEmpty()) {
                    z = false;
                }
                if (z) {
                    reportVm.setContentState(ContentState.Empty);
                } else {
                    reportVm.setContentState(ContentState.Content);
                    Object data = apiResult.getData();
                    Intrinsics.checkNotNull(data);
                    reportVm.setListData((List) data);
                }
            } else {
                reportVm.setContentState(ContentState.Error);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.report.ReportVm$report$1", f = "ReportVm.kt", i = {0}, l = {95}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Long f31982OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31983OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31985OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Integer f31986OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31987OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Integer num, int i, Long l, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31986OooO0oO = num;
            this.f31987OooO0oo = i;
            this.f31982OooO = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = ReportVm.this.new OooO0O0(this.f31986OooO0oO, this.f31987OooO0oo, this.f31982OooO, continuation);
            oooO0O0.f31985OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<Object>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31983OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31985OooO0o0;
                ReportVm reportVm = ReportVm.this;
                List<ReportFromData> messagesList = reportVm.getMessagesList();
                String strOooO0O0 = !(messagesList == null || messagesList.isEmpty()) ? oOO0OOO.OooO0O0(OooO.OooO00o(reportVm.getMessagesList())) : null;
                String strOooO0O1 = reportVm.getFriendRequestMessage() != null ? oOO0OOO.OooO0O0(reportVm.getFriendRequestMessage()) : null;
                oo0O oo0o = oo0O.f46361OooO00o;
                int reportType = reportVm.getReportType();
                Long sourceId = reportVm.getSourceId();
                Integer num = this.f31986OooO0oO;
                Integer numBoxInt = Boxing.boxInt(this.f31987OooO0oo);
                Long l = this.f31982OooO;
                this.f31985OooO0o0 = o00oo0o2;
                this.f31983OooO0Oo = 1;
                Object objOooO0O0 = oo0o.OooO0O0(reportType, sourceId, num, numBoxInt, l, strOooO0O0, strOooO0O1, this);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0O0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31985OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ o00OO0O0 report$default(ReportVm reportVm, int i, Integer num, Long l, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            l = null;
        }
        return reportVm.report(i, num, l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getContentState() {
        return (ContentState) this.contentState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getCurrentSelectedPosition() {
        return ((Number) this.currentSelectedPosition.getValue()).intValue();
    }

    @Nullable
    public final Long getExtendSourceId() {
        return this.extendSourceId;
    }

    @Nullable
    public final String getFriendRequestMessage() {
        return this.friendRequestMessage;
    }

    @NotNull
    public final List<ReportModel> getListData() {
        return (List) this.listData.getValue();
    }

    @Nullable
    public final List<ReportFromData> getMessagesList() {
        return this.messagesList;
    }

    @Nullable
    public final Integer getPrivateChatReportType() {
        return this.privateChatReportType;
    }

    public final int getReportType() {
        return this.reportType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final UserInfo getSearchUser() {
        return (UserInfo) this.searchUser.getValue();
    }

    @Nullable
    public final Long getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public final Integer getViewSourceType() {
        return this.viewSourceType;
    }

    public final void loadReportReason() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    @NotNull
    public final o00OO0O0<ApiResult<Object>> report(int reasonId, @Nullable Integer categoryId, @Nullable Long extendSourceId) {
        return o00O.OooO00o(this, new OooO0O0(categoryId, reasonId, extendSourceId, null));
    }

    public final void setContentState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.contentState.setValue(contentState);
    }

    public final void setCurrentSelectedPosition(int i) {
        this.currentSelectedPosition.setValue(Integer.valueOf(i));
    }

    public final void setExtendSourceId(@Nullable Long l) {
        this.extendSourceId = l;
    }

    public final void setFriendRequestMessage(@Nullable String str) {
        this.friendRequestMessage = str;
    }

    public final void setListData(@NotNull List<ReportModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.listData.setValue(list);
    }

    public final void setMessagesList(@Nullable List<ReportFromData> list) {
        this.messagesList = list;
    }

    public final void setPrivateChatReportType(@Nullable Integer num) {
        this.privateChatReportType = num;
    }

    public final void setReportType(int i) {
        this.reportType = i;
    }

    public final void setSearchUser(@Nullable UserInfo userInfo) {
        this.searchUser.setValue(userInfo);
    }

    public final void setSourceId(@Nullable Long l) {
        this.sourceId = l;
    }

    public final void setViewSourceType(@Nullable Integer num) {
        this.viewSourceType = num;
    }
}
