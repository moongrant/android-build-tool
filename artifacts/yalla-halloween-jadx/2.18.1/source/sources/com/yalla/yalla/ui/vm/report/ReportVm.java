package com.yalla.yalla.ui.vm.report;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.app.base.model.ReportModel;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.ReportFromData;
import come.code.android.easyrefreshcontentstatus.ContentState;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p484o0o000OO.OooOOO0;
import p484o0o000OO.OooOOOO;
import p516o0o0O000.o000oOoO;
import p516o0o0O000.o0Oo0oo;
import p520o0o0O0O0.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010GJ\u0006\u0010\u0003\u001a\u00020\u0002J7\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R7\u00103\u001a\b\u0012\u0004\u0012\u00020-0\u001a2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R+\u0010:\u001a\u0002042\u0006\u0010.\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00107\"\u0004\b8\u00109R/\u0010A\u001a\u0004\u0018\u00010;2\b\u0010.\u001a\u0004\u0018\u00010;8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00100\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010E\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u00100\u001a\u0004\bC\u0010\u0011\"\u0004\bD\u0010\u0013¨\u0006H"}, d2 = {"Lcom/yalla/yalla/ui/vm/report/ReportVm;", "Lo00OO/OooO00o;", "", "loadReportReason", "", "reasonId", "categoryId", "", "extendSourceId", "Lo0o000OO/OooOOOO;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "report", "(ILjava/lang/Integer;Ljava/lang/Long;)Lo0o000OO/OooOOOO;", "reportType", "I", "getReportType", "()I", "setReportType", "(I)V", "sourceId", "Ljava/lang/Long;", "getSourceId", "()Ljava/lang/Long;", "setSourceId", "(Ljava/lang/Long;)V", "", "Lcom/yalla/yalla/common/model/ReportFromData;", "messagesList", "Ljava/util/List;", "getMessagesList", "()Ljava/util/List;", "setMessagesList", "(Ljava/util/List;)V", "getExtendSourceId", "setExtendSourceId", "viewSourceType", "Ljava/lang/Integer;", "getViewSourceType", "()Ljava/lang/Integer;", "setViewSourceType", "(Ljava/lang/Integer;)V", "privateChatReportType", "getPrivateChatReportType", "setPrivateChatReportType", "Lcom/app/base/model/ReportModel;", "<set-?>", "listData$delegate", "Lo000oOoO/o0O00OO;", "getListData", "setListData", "listData", "Lcome/code/android/easyrefreshcontentstatus/ContentState;", "contentState$delegate", "getContentState", "()Lcome/code/android/easyrefreshcontentstatus/ContentState;", "setContentState", "(Lcome/code/android/easyrefreshcontentstatus/ContentState;)V", "contentState", "Lcom/yalla/yalla/common/db/table/UserInfo;", "searchUser$delegate", "getSearchUser", "()Lcom/yalla/yalla/common/db/table/UserInfo;", "setSearchUser", "(Lcom/yalla/yalla/common/db/table/UserInfo;)V", "searchUser", "currentSelectedPosition$delegate", "getCurrentSelectedPosition", "setCurrentSelectedPosition", "currentSelectedPosition", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ReportVm extends o00OO.OooO00o {
    public static final int $stable = 8;

    @Nullable
    private Long extendSourceId;

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
    private final o0O00OO listData = o0OOO00.OooO0Oo(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO contentState = o0OOO00.OooO0Oo(ContentState.Loading);

    /* JADX INFO: renamed from: searchUser$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO searchUser = o0OOO00.OooO0Oo(null);

    /* JADX INFO: renamed from: currentSelectedPosition$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO currentSelectedPosition = o0OOO00.OooO0Oo(-1);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.report.ReportVm$loadReportReason$1", f = "ReportVm.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26039Oooo0o;

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
            int i = this.f26039Oooo0o;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000O0O0 o000o0o1 = o000O0O0.f42567OooO00o;
                int reportType = ReportVm.this.getReportType();
                Integer viewSourceType = ReportVm.this.getViewSourceType();
                this.f26039Oooo0o = 1;
                obj = o000o0o1.OooO00o(reportType, viewSourceType, this);
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
                    ReportVm.this.setContentState(ContentState.Empty);
                } else {
                    ReportVm.this.setContentState(ContentState.Content);
                    ReportVm reportVm = ReportVm.this;
                    Object data = apiResult.getData();
                    Intrinsics.checkNotNull(data);
                    reportVm.setListData((List) data);
                }
            } else {
                ReportVm.this.setContentState(ContentState.Error);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.report.ReportVm$report$1", f = "ReportVm.kt", i = {0}, l = {90}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<OooOOOO<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Integer f26041Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26042Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26043Oooo0oO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Long f26045OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f26046OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Integer num, int i, Long l, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26041Oooo = num;
            this.f26046OoooO00 = i;
            this.f26045OoooO0 = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = ReportVm.this.new OooO0O0(this.f26041Oooo, this.f26046OoooO00, this.f26045OoooO0, continuation);
            oooO0O0.f26043Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<Object>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26042Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f26043Oooo0oO;
                List<ReportFromData> messagesList = ReportVm.this.getMessagesList();
                String strOooO0O0 = !(messagesList == null || messagesList.isEmpty()) ? o000oOoO.OooO0O0(o0Oo0oo.OooO0O0(ReportVm.this.getMessagesList())) : null;
                o000O0O0 o000o0o1 = o000O0O0.f42567OooO00o;
                int reportType = ReportVm.this.getReportType();
                Long sourceId = ReportVm.this.getSourceId();
                Integer num = this.f26041Oooo;
                Integer numBoxInt = Boxing.boxInt(this.f26046OoooO00);
                Long l = this.f26045OoooO0;
                this.f26043Oooo0oO = oooOOOO2;
                this.f26042Oooo0o = 1;
                Object objOooO0O0 = o000o0o1.OooO0O0(reportType, sourceId, num, numBoxInt, l, strOooO0O0, this);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0O0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f26043Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            oooOOOO.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ OooOOOO report$default(ReportVm reportVm, int i, Integer num, Long l, int i2, Object obj) {
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
    public final OooOOOO<ApiResult<Object>> report(int reasonId, @Nullable Integer categoryId, @Nullable Long extendSourceId) {
        return OooOOO0.OooO00o(this, new OooO0O0(categoryId, reasonId, extendSourceId, null));
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
